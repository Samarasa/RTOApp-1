package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.f.a.a.m;
import java.util.Arrays;

public abstract class b extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f797a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    protected int f798b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f799c;

    /* renamed from: d  reason: collision with root package name */
    protected m f800d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f801e = false;

    /* renamed from: f  reason: collision with root package name */
    private String f802f;

    public b(Context context) {
        super(context);
        this.f799c = context;
        a((AttributeSet) null);
    }

    private void a(String str) {
        int i;
        Object a2;
        if (str != null && this.f799c != null) {
            String trim = str.trim();
            try {
                i = h.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f799c.getResources().getIdentifier(trim, "id", this.f799c.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) getParent()).a(0, (Object) trim)) != null && (a2 instanceof Integer)) {
                i = ((Integer) a2).intValue();
            }
            if (i != 0) {
                setTag(i, (Object) null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void a() {
        if (this.f800d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).la = this.f800d;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == i.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f802f = obtainStyledAttributes.getString(index);
                    setIds(this.f802f);
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
    }

    public void b(ConstraintLayout constraintLayout) {
    }

    public void c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f802f);
        }
        m mVar = this.f800d;
        if (mVar != null) {
            mVar.J();
            for (int i = 0; i < this.f798b; i++) {
                View a2 = constraintLayout.a(this.f797a[i]);
                if (a2 != null) {
                    this.f800d.b(constraintLayout.a(a2));
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f797a, this.f798b);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f801e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f798b = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f798b + 1;
        int[] iArr = this.f797a;
        if (i2 > iArr.length) {
            this.f797a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f797a;
        int i3 = this.f798b;
        iArr2[i3] = i;
        this.f798b = i3 + 1;
    }
}
