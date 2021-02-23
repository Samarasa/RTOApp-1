package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.a;
import b.a.j;
import b.h.j.E;
import b.h.j.F;
import b.h.j.y;

/* renamed from: androidx.appcompat.widget.a  reason: case insensitive filesystem */
abstract class C0110a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0010a f589a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f590b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f591c;

    /* renamed from: d  reason: collision with root package name */
    protected C0122g f592d;

    /* renamed from: e  reason: collision with root package name */
    protected int f593e;

    /* renamed from: f  reason: collision with root package name */
    protected E f594f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f595g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f596h;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    protected class C0010a implements F {

        /* renamed from: a  reason: collision with root package name */
        private boolean f597a = false;

        /* renamed from: b  reason: collision with root package name */
        int f598b;

        protected C0010a() {
        }

        public C0010a a(E e2, int i) {
            C0110a.this.f594f = e2;
            this.f598b = i;
            return this;
        }

        public void a(View view) {
            this.f597a = true;
        }

        public void b(View view) {
            if (!this.f597a) {
                C0110a aVar = C0110a.this;
                aVar.f594f = null;
                C0110a.super.setVisibility(this.f598b);
            }
        }

        public void c(View view) {
            C0110a.super.setVisibility(0);
            this.f597a = false;
        }
    }

    C0110a(Context context) {
        this(context, (AttributeSet) null);
    }

    C0110a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0110a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f589a = new C0010a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.f590b = context;
        } else {
            this.f590b = new ContextThemeWrapper(context, i2);
        }
    }

    protected static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public E a(int i, long j) {
        E e2 = this.f594f;
        if (e2 != null) {
            e2.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            E a2 = y.a(this);
            a2.a(1.0f);
            a2.a(j);
            C0010a aVar = this.f589a;
            aVar.a(a2, i);
            a2.a((F) aVar);
            return a2;
        }
        E a3 = y.a(this);
        a3.a(0.0f);
        a3.a(j);
        C0010a aVar2 = this.f589a;
        aVar2.a(a3, i);
        a3.a((F) aVar2);
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.f594f != null ? this.f589a.f598b : getVisibility();
    }

    public int getContentHeight() {
        return this.f593e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.ActionBar, a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0122g gVar = this.f592d;
        if (gVar != null) {
            gVar.a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f596h = false;
        }
        if (!this.f596h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f596h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f596h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f595g = false;
        }
        if (!this.f595g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f595g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f595g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            E e2 = this.f594f;
            if (e2 != null) {
                e2.a();
            }
            super.setVisibility(i);
        }
    }
}
