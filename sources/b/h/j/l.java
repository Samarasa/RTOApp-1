package b.h.j;

import android.view.View;
import android.view.ViewParent;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f2564a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f2565b;

    /* renamed from: c  reason: collision with root package name */
    private final View f2566c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2567d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f2568e;

    public l(View view) {
        this.f2566c = view;
    }

    private void a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2564a = viewParent;
        } else if (i == 1) {
            this.f2565b = viewParent;
        }
    }

    private boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d2;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!b() || (d2 = d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f2566c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] d3 = d();
            d3[0] = 0;
            d3[1] = 0;
            iArr3 = d3;
        } else {
            iArr3 = iArr2;
        }
        B.a(d2, this.f2566c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f2566c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    private ViewParent d(int i) {
        if (i == 0) {
            return this.f2564a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2565b;
    }

    private int[] d() {
        if (this.f2568e == null) {
            this.f2568e = new int[2];
        }
        return this.f2568e;
    }

    public void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void a(boolean z) {
        if (this.f2567d) {
            y.G(this.f2566c);
        }
        this.f2567d = z;
    }

    public boolean a() {
        return a(0);
    }

    public boolean a(float f2, float f3) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return B.a(d2, this.f2566c, f2, f3);
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent d2;
        if (!b() || (d2 = d(0)) == null) {
            return false;
        }
        return B.a(d2, this.f2566c, f2, f3, z);
    }

    public boolean a(int i) {
        return d(i) != null;
    }

    public boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (!b()) {
            return false;
        }
        View view = this.f2566c;
        for (ViewParent parent = this.f2566c.getParent(); parent != null; parent = parent.getParent()) {
            if (B.b(parent, view, this.f2566c, i, i2)) {
                a(i2, parent);
                B.a(parent, view, this.f2566c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return b(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d2;
        int i4;
        int i5;
        if (!b() || (d2 = d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f2566c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = d();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        B.a(d2, this.f2566c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f2566c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean b() {
        return this.f2567d;
    }

    public boolean b(int i) {
        return a(i, 0);
    }

    public void c() {
        c(0);
    }

    public void c(int i) {
        ViewParent d2 = d(i);
        if (d2 != null) {
            B.a(d2, this.f2566c, i);
            a(i, (ViewParent) null);
        }
    }
}
