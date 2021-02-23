package b.a.d;

import android.view.animation.Interpolator;
import b.h.j.E;
import b.h.j.F;
import b.h.j.G;
import java.util.ArrayList;
import java.util.Iterator;

public class i {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<E> f2130a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f2131b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f2132c;

    /* renamed from: d  reason: collision with root package name */
    F f2133d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2134e;

    /* renamed from: f  reason: collision with root package name */
    private final G f2135f = new h(this);

    public i a(long j) {
        if (!this.f2134e) {
            this.f2131b = j;
        }
        return this;
    }

    public i a(Interpolator interpolator) {
        if (!this.f2134e) {
            this.f2132c = interpolator;
        }
        return this;
    }

    public i a(E e2) {
        if (!this.f2134e) {
            this.f2130a.add(e2);
        }
        return this;
    }

    public i a(E e2, E e3) {
        this.f2130a.add(e2);
        e3.b(e2.b());
        this.f2130a.add(e3);
        return this;
    }

    public i a(F f2) {
        if (!this.f2134e) {
            this.f2133d = f2;
        }
        return this;
    }

    public void a() {
        if (this.f2134e) {
            Iterator<E> it = this.f2130a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f2134e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f2134e = false;
    }

    public void c() {
        if (!this.f2134e) {
            Iterator<E> it = this.f2130a.iterator();
            while (it.hasNext()) {
                E next = it.next();
                long j = this.f2131b;
                if (j >= 0) {
                    next.a(j);
                }
                Interpolator interpolator = this.f2132c;
                if (interpolator != null) {
                    next.a(interpolator);
                }
                if (this.f2133d != null) {
                    next.a((F) this.f2135f);
                }
                next.c();
            }
            this.f2134e = true;
        }
    }
}
