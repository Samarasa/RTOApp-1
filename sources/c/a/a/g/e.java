package c.a.a.g;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.a.a.c.b.q;
import c.a.a.c.d.a.g;
import c.a.a.c.d.a.j;
import c.a.a.c.d.a.o;
import c.a.a.c.d.e.c;
import c.a.a.c.d.e.f;
import c.a.a.c.k;
import c.a.a.c.n;
import c.a.a.h;
import c.a.a.h.b;
import c.a.a.i.i;
import java.util.Map;

public class e implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int f3590a;

    /* renamed from: b  reason: collision with root package name */
    private float f3591b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private q f3592c = q.f3195e;

    /* renamed from: d  reason: collision with root package name */
    private h f3593d = h.NORMAL;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f3594e;

    /* renamed from: f  reason: collision with root package name */
    private int f3595f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f3596g;

    /* renamed from: h  reason: collision with root package name */
    private int f3597h;
    private boolean i = true;
    private int j = -1;
    private int k = -1;
    private c.a.a.c.h l = b.a();
    private boolean m;
    private boolean n = true;
    private Drawable o;
    private int p;
    private k q = new k();
    private Map<Class<?>, n<?>> r = new c.a.a.i.b();
    private Class<?> s = Object.class;
    private boolean t;
    private Resources.Theme u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y = true;
    private boolean z;

    private e H() {
        if (!this.t) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    private e a(j jVar, n<Bitmap> nVar, boolean z2) {
        e b2 = z2 ? b(jVar, nVar) : a(jVar, nVar);
        b2.y = true;
        return b2;
    }

    private e a(n<Bitmap> nVar, boolean z2) {
        if (this.v) {
            return clone().a(nVar, z2);
        }
        o oVar = new o(nVar, z2);
        a(Bitmap.class, nVar, z2);
        a(Drawable.class, oVar, z2);
        oVar.a();
        a(BitmapDrawable.class, oVar, z2);
        a(c.class, new f(nVar), z2);
        H();
        return this;
    }

    private <T> e a(Class<T> cls, n<T> nVar, boolean z2) {
        if (this.v) {
            return clone().a(cls, nVar, z2);
        }
        i.a(cls);
        i.a(nVar);
        this.r.put(cls, nVar);
        this.f3590a |= 2048;
        this.n = true;
        this.f3590a |= 65536;
        this.y = false;
        if (z2) {
            this.f3590a |= 131072;
            this.m = true;
        }
        H();
        return this;
    }

    public static e b(q qVar) {
        return new e().a(qVar);
    }

    public static e b(c.a.a.c.h hVar) {
        return new e().a(hVar);
    }

    public static e b(Class<?> cls) {
        return new e().a(cls);
    }

    private static boolean b(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    private e c(j jVar, n<Bitmap> nVar) {
        return a(jVar, nVar, false);
    }

    private boolean c(int i2) {
        return b(this.f3590a, i2);
    }

    public final boolean A() {
        return this.m;
    }

    public final boolean B() {
        return c(2048);
    }

    public final boolean C() {
        return c.a.a.i.k.b(this.k, this.j);
    }

    public e D() {
        this.t = true;
        return this;
    }

    public e E() {
        return a(j.f3381b, (n<Bitmap>) new g());
    }

    public e F() {
        return c(j.f3384e, new c.a.a.c.d.a.h());
    }

    public e G() {
        return c(j.f3380a, new c.a.a.c.d.a.q());
    }

    public e a() {
        if (!this.t || this.v) {
            this.v = true;
            D();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public e a(float f2) {
        if (this.v) {
            return clone().a(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f3591b = f2;
        this.f3590a |= 2;
        H();
        return this;
    }

    public e a(int i2) {
        if (this.v) {
            return clone().a(i2);
        }
        this.f3595f = i2;
        this.f3590a |= 32;
        this.f3594e = null;
        this.f3590a &= -17;
        H();
        return this;
    }

    public e a(int i2, int i3) {
        if (this.v) {
            return clone().a(i2, i3);
        }
        this.k = i2;
        this.j = i3;
        this.f3590a |= 512;
        H();
        return this;
    }

    public e a(q qVar) {
        if (this.v) {
            return clone().a(qVar);
        }
        i.a(qVar);
        this.f3592c = qVar;
        this.f3590a |= 4;
        H();
        return this;
    }

    public e a(j jVar) {
        c.a.a.c.j<j> jVar2 = j.f3387h;
        i.a(jVar);
        return a(jVar2, jVar);
    }

    /* access modifiers changed from: package-private */
    public final e a(j jVar, n<Bitmap> nVar) {
        if (this.v) {
            return clone().a(jVar, nVar);
        }
        a(jVar);
        return a(nVar, false);
    }

    public e a(c.a.a.c.h hVar) {
        if (this.v) {
            return clone().a(hVar);
        }
        i.a(hVar);
        this.l = hVar;
        this.f3590a |= 1024;
        H();
        return this;
    }

    public <T> e a(c.a.a.c.j<T> jVar, T t2) {
        if (this.v) {
            return clone().a(jVar, t2);
        }
        i.a(jVar);
        i.a(t2);
        this.q.a(jVar, t2);
        H();
        return this;
    }

    public e a(n<Bitmap> nVar) {
        return a(nVar, true);
    }

    public e a(e eVar) {
        if (this.v) {
            return clone().a(eVar);
        }
        if (b(eVar.f3590a, 2)) {
            this.f3591b = eVar.f3591b;
        }
        if (b(eVar.f3590a, 262144)) {
            this.w = eVar.w;
        }
        if (b(eVar.f3590a, 1048576)) {
            this.z = eVar.z;
        }
        if (b(eVar.f3590a, 4)) {
            this.f3592c = eVar.f3592c;
        }
        if (b(eVar.f3590a, 8)) {
            this.f3593d = eVar.f3593d;
        }
        if (b(eVar.f3590a, 16)) {
            this.f3594e = eVar.f3594e;
            this.f3595f = 0;
            this.f3590a &= -33;
        }
        if (b(eVar.f3590a, 32)) {
            this.f3595f = eVar.f3595f;
            this.f3594e = null;
            this.f3590a &= -17;
        }
        if (b(eVar.f3590a, 64)) {
            this.f3596g = eVar.f3596g;
            this.f3597h = 0;
            this.f3590a &= -129;
        }
        if (b(eVar.f3590a, 128)) {
            this.f3597h = eVar.f3597h;
            this.f3596g = null;
            this.f3590a &= -65;
        }
        if (b(eVar.f3590a, 256)) {
            this.i = eVar.i;
        }
        if (b(eVar.f3590a, 512)) {
            this.k = eVar.k;
            this.j = eVar.j;
        }
        if (b(eVar.f3590a, 1024)) {
            this.l = eVar.l;
        }
        if (b(eVar.f3590a, 4096)) {
            this.s = eVar.s;
        }
        if (b(eVar.f3590a, 8192)) {
            this.o = eVar.o;
            this.p = 0;
            this.f3590a &= -16385;
        }
        if (b(eVar.f3590a, 16384)) {
            this.p = eVar.p;
            this.o = null;
            this.f3590a &= -8193;
        }
        if (b(eVar.f3590a, 32768)) {
            this.u = eVar.u;
        }
        if (b(eVar.f3590a, 65536)) {
            this.n = eVar.n;
        }
        if (b(eVar.f3590a, 131072)) {
            this.m = eVar.m;
        }
        if (b(eVar.f3590a, 2048)) {
            this.r.putAll(eVar.r);
            this.y = eVar.y;
        }
        if (b(eVar.f3590a, 524288)) {
            this.x = eVar.x;
        }
        if (!this.n) {
            this.r.clear();
            this.f3590a &= -2049;
            this.m = false;
            this.f3590a &= -131073;
            this.y = true;
        }
        this.f3590a |= eVar.f3590a;
        this.q.a(eVar.q);
        H();
        return this;
    }

    public e a(h hVar) {
        if (this.v) {
            return clone().a(hVar);
        }
        i.a(hVar);
        this.f3593d = hVar;
        this.f3590a |= 8;
        H();
        return this;
    }

    public e a(Class<?> cls) {
        if (this.v) {
            return clone().a(cls);
        }
        i.a(cls);
        this.s = cls;
        this.f3590a |= 4096;
        H();
        return this;
    }

    public e a(boolean z2) {
        if (this.v) {
            return clone().a(true);
        }
        this.i = !z2;
        this.f3590a |= 256;
        H();
        return this;
    }

    public final q b() {
        return this.f3592c;
    }

    public e b(int i2) {
        if (this.v) {
            return clone().b(i2);
        }
        this.f3597h = i2;
        this.f3590a |= 128;
        this.f3596g = null;
        this.f3590a &= -65;
        H();
        return this;
    }

    /* access modifiers changed from: package-private */
    public final e b(j jVar, n<Bitmap> nVar) {
        if (this.v) {
            return clone().b(jVar, nVar);
        }
        a(jVar);
        return a(nVar);
    }

    public e b(boolean z2) {
        if (this.v) {
            return clone().b(z2);
        }
        this.z = z2;
        this.f3590a |= 1048576;
        H();
        return this;
    }

    public e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.q = new k();
            eVar.q.a(this.q);
            eVar.r = new c.a.a.i.b();
            eVar.r.putAll(this.r);
            eVar.t = false;
            eVar.v = false;
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int e() {
        return this.f3595f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(eVar.f3591b, this.f3591b) == 0 && this.f3595f == eVar.f3595f && c.a.a.i.k.b((Object) this.f3594e, (Object) eVar.f3594e) && this.f3597h == eVar.f3597h && c.a.a.i.k.b((Object) this.f3596g, (Object) eVar.f3596g) && this.p == eVar.p && c.a.a.i.k.b((Object) this.o, (Object) eVar.o) && this.i == eVar.i && this.j == eVar.j && this.k == eVar.k && this.m == eVar.m && this.n == eVar.n && this.w == eVar.w && this.x == eVar.x && this.f3592c.equals(eVar.f3592c) && this.f3593d == eVar.f3593d && this.q.equals(eVar.q) && this.r.equals(eVar.r) && this.s.equals(eVar.s) && c.a.a.i.k.b((Object) this.l, (Object) eVar.l) && c.a.a.i.k.b((Object) this.u, (Object) eVar.u);
    }

    public final Drawable f() {
        return this.f3594e;
    }

    public final Drawable g() {
        return this.o;
    }

    public final int h() {
        return this.p;
    }

    public int hashCode() {
        return c.a.a.i.k.a((Object) this.u, c.a.a.i.k.a((Object) this.l, c.a.a.i.k.a((Object) this.s, c.a.a.i.k.a((Object) this.r, c.a.a.i.k.a((Object) this.q, c.a.a.i.k.a((Object) this.f3593d, c.a.a.i.k.a((Object) this.f3592c, c.a.a.i.k.a(this.x, c.a.a.i.k.a(this.w, c.a.a.i.k.a(this.n, c.a.a.i.k.a(this.m, c.a.a.i.k.a(this.k, c.a.a.i.k.a(this.j, c.a.a.i.k.a(this.i, c.a.a.i.k.a((Object) this.o, c.a.a.i.k.a(this.p, c.a.a.i.k.a((Object) this.f3596g, c.a.a.i.k.a(this.f3597h, c.a.a.i.k.a((Object) this.f3594e, c.a.a.i.k.a(this.f3595f, c.a.a.i.k.a(this.f3591b)))))))))))))))))))));
    }

    public final boolean i() {
        return this.x;
    }

    public final k j() {
        return this.q;
    }

    public final int k() {
        return this.j;
    }

    public final int l() {
        return this.k;
    }

    public final Drawable m() {
        return this.f3596g;
    }

    public final int n() {
        return this.f3597h;
    }

    public final h o() {
        return this.f3593d;
    }

    public final Class<?> p() {
        return this.s;
    }

    public final c.a.a.c.h q() {
        return this.l;
    }

    public final float r() {
        return this.f3591b;
    }

    public final Resources.Theme s() {
        return this.u;
    }

    public final Map<Class<?>, n<?>> t() {
        return this.r;
    }

    public final boolean u() {
        return this.z;
    }

    public final boolean v() {
        return this.w;
    }

    public final boolean w() {
        return this.i;
    }

    public final boolean x() {
        return c(8);
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return this.y;
    }

    public final boolean z() {
        return this.n;
    }
}
