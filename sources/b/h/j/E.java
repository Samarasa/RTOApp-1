package b.h.j;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f2524a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f2525b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f2526c = null;

    /* renamed from: d  reason: collision with root package name */
    int f2527d = -1;

    static class a implements F {

        /* renamed from: a  reason: collision with root package name */
        E f2528a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2529b;

        a(E e2) {
            this.f2528a = e2;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            F f2 = tag instanceof F ? (F) tag : null;
            if (f2 != null) {
                f2.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: b.h.j.F} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                b.h.j.E r0 = r3.f2528a
                int r0 = r0.f2527d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                b.h.j.E r0 = r3.f2528a
                r0.f2527d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f2529b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                b.h.j.E r0 = r3.f2528a
                java.lang.Runnable r1 = r0.f2526c
                if (r1 == 0) goto L_0x0024
                r0.f2526c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof b.h.j.F
                if (r1 == 0) goto L_0x0031
                r2 = r0
                b.h.j.F r2 = (b.h.j.F) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.b(r4)
            L_0x0036:
                r4 = 1
                r3.f2529b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.j.E.a.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b.h.j.F} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f2529b = r0
                b.h.j.E r0 = r3.f2528a
                int r0 = r0.f2527d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                b.h.j.E r0 = r3.f2528a
                java.lang.Runnable r2 = r0.f2525b
                if (r2 == 0) goto L_0x001a
                r0.f2525b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof b.h.j.F
                if (r2 == 0) goto L_0x0027
                r1 = r0
                b.h.j.F r1 = (b.h.j.F) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.j.E.a.c(android.view.View):void");
        }
    }

    E(View view) {
        this.f2524a = new WeakReference<>(view);
    }

    private void a(View view, F f2) {
        if (f2 != null) {
            view.animate().setListener(new C(this, f2, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public E a(float f2) {
        View view = (View) this.f2524a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public E a(long j) {
        View view = (View) this.f2524a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public E a(Interpolator interpolator) {
        View view = (View) this.f2524a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public E a(F f2) {
        View view = (View) this.f2524a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, f2);
                f2 = new a(this);
            }
            a(view, f2);
        }
        return this;
    }

    public E a(H h2) {
        View view = (View) this.f2524a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            D d2 = null;
            if (h2 != null) {
                d2 = new D(this, h2, view);
            }
            view.animate().setUpdateListener(d2);
        }
        return this;
    }

    public void a() {
        View view = (View) this.f2524a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = (View) this.f2524a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public E b(float f2) {
        View view = (View) this.f2524a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    public E b(long j) {
        View view = (View) this.f2524a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f2524a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
