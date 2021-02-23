package b.h.j;

import android.os.Build;
import android.view.WindowInsets;
import b.h.i.c;
import java.util.Objects;

public class I {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2530a;

    I(Object obj) {
        this.f2530a = obj;
    }

    public static I a(WindowInsets windowInsets) {
        return new I(Objects.requireNonNull(windowInsets));
    }

    public I a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new I(((WindowInsets) this.f2530a).consumeSystemWindowInsets());
        }
        return null;
    }

    public I a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new I(((WindowInsets) this.f2530a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2530a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2530a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2530a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2530a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        return c.a(this.f2530a, ((I) obj).f2530a);
    }

    public boolean f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2530a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f2530a).isConsumed();
        }
        return false;
    }

    public WindowInsets h() {
        return (WindowInsets) this.f2530a;
    }

    public int hashCode() {
        Object obj = this.f2530a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
