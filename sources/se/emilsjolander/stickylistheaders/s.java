package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class s extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private a f15629a;

    /* renamed from: b  reason: collision with root package name */
    private List<View> f15630b;

    /* renamed from: c  reason: collision with root package name */
    private int f15631c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f15632d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private Field f15633e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15634f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15635g = false;

    interface a {
        void a(Canvas canvas);
    }

    public s(Context context) {
        super(context);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mSelectorRect");
            declaredField.setAccessible(true);
            this.f15632d = (Rect) declaredField.get(this);
            if (Build.VERSION.SDK_INT >= 14) {
                this.f15633e = AbsListView.class.getDeclaredField("mSelectorPosition");
                this.f15633e.setAccessible(true);
            }
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        }
    }

    private int b() {
        Field field = this.f15633e;
        if (field == null) {
            for (int i = 0; i < getChildCount(); i++) {
                if (getChildAt(i).getBottom() == this.f15632d.bottom) {
                    return i + a();
                }
            }
            return -1;
        }
        try {
            return field.getInt(this);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return -1;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    private void b(View view) {
        if (this.f15630b == null) {
            this.f15630b = new ArrayList();
        }
        this.f15630b.add(view);
    }

    private void c() {
        int b2;
        if (!this.f15632d.isEmpty() && (b2 = b()) >= 0) {
            View childAt = getChildAt(b2 - a());
            if (childAt instanceof r) {
                r rVar = (r) childAt;
                this.f15632d.top = rVar.getTop() + rVar.f15628e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (Build.VERSION.SDK_INT >= 11) {
            return firstVisiblePosition;
        }
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            } else if (getChildAt(i).getBottom() >= 0) {
                firstVisiblePosition += i;
                break;
            } else {
                i++;
            }
        }
        return (this.f15634f || getPaddingTop() <= 0 || firstVisiblePosition <= 0 || getChildAt(0).getTop() <= 0) ? firstVisiblePosition : firstVisiblePosition - 1;
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        this.f15631c = i;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f15629a = aVar;
    }

    public void a(boolean z) {
        this.f15635g = z;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view) {
        List<View> list = this.f15630b;
        if (list == null) {
            return false;
        }
        return list.contains(view);
    }

    public void addFooterView(View view) {
        super.addFooterView(view);
        b(view);
    }

    public void addFooterView(View view, Object obj, boolean z) {
        super.addFooterView(view, obj, z);
        b(view);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        c();
        if (this.f15631c != 0) {
            canvas.save();
            Rect clipBounds = canvas.getClipBounds();
            clipBounds.top = this.f15631c;
            canvas.clipRect(clipBounds);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
        this.f15629a.a(canvas);
    }

    /* access modifiers changed from: protected */
    public void layoutChildren() {
        if (!this.f15635g) {
            super.layoutChildren();
        }
    }

    public boolean performItemClick(View view, int i, long j) {
        if (view instanceof r) {
            view = ((r) view).f15624a;
        }
        return super.performItemClick(view, i, j);
    }

    public boolean removeFooterView(View view) {
        if (!super.removeFooterView(view)) {
            return false;
        }
        this.f15630b.remove(view);
        return true;
    }

    public void setClipToPadding(boolean z) {
        this.f15634f = z;
        super.setClipToPadding(z);
    }
}
