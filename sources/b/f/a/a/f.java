package b.f.a.a;

import b.f.a.i;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private p f2265a = new p(this);

    /* renamed from: b  reason: collision with root package name */
    final h f2266b;

    /* renamed from: c  reason: collision with root package name */
    final c f2267c;

    /* renamed from: d  reason: collision with root package name */
    f f2268d;

    /* renamed from: e  reason: collision with root package name */
    public int f2269e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f2270f = -1;

    /* renamed from: g  reason: collision with root package name */
    private b f2271g = b.NONE;

    /* renamed from: h  reason: collision with root package name */
    private a f2272h = a.RELAXED;
    private int i = 0;
    i j;

    public enum a {
        RELAXED,
        STRICT
    }

    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    public enum c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public f(h hVar, c cVar) {
        this.f2266b = hVar;
        this.f2267c = cVar;
    }

    public int a() {
        return this.i;
    }

    public void a(b.f.a.c cVar) {
        i iVar = this.j;
        if (iVar == null) {
            this.j = new i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.b();
        }
    }

    public boolean a(f fVar) {
        if (fVar == null) {
            return false;
        }
        c h2 = fVar.h();
        c cVar = this.f2267c;
        if (h2 == cVar) {
            return cVar != c.BASELINE || (fVar.c().x() && c().x());
        }
        switch (e.f2264a[cVar.ordinal()]) {
            case 1:
                return (h2 == c.BASELINE || h2 == c.CENTER_X || h2 == c.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = h2 == c.LEFT || h2 == c.RIGHT;
                return fVar.c() instanceof l ? z || h2 == c.CENTER_X : z;
            case 4:
            case 5:
                boolean z2 = h2 == c.TOP || h2 == c.BOTTOM;
                return fVar.c() instanceof l ? z2 || h2 == c.CENTER_Y : z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2267c.name());
        }
    }

    public boolean a(f fVar, int i2, int i3, b bVar, int i4, boolean z) {
        if (fVar == null) {
            this.f2268d = null;
            this.f2269e = 0;
            this.f2270f = -1;
            this.f2271g = b.NONE;
            this.i = 2;
            return true;
        } else if (!z && !a(fVar)) {
            return false;
        } else {
            this.f2268d = fVar;
            if (i2 > 0) {
                this.f2269e = i2;
            } else {
                this.f2269e = 0;
            }
            this.f2270f = i3;
            this.f2271g = bVar;
            this.i = i4;
            return true;
        }
    }

    public boolean a(f fVar, int i2, b bVar, int i3) {
        return a(fVar, i2, -1, bVar, i3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.f2268d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b() {
        /*
            r3 = this;
            b.f.a.a.h r0 = r3.f2266b
            int r0 = r0.r()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f2270f
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            b.f.a.a.f r0 = r3.f2268d
            if (r0 == 0) goto L_0x0020
            b.f.a.a.h r0 = r0.f2266b
            int r0 = r0.r()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.f2270f
            return r0
        L_0x0020:
            int r0 = r3.f2269e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.f.b():int");
    }

    public h c() {
        return this.f2266b;
    }

    public p d() {
        return this.f2265a;
    }

    public i e() {
        return this.j;
    }

    public b f() {
        return this.f2271g;
    }

    public f g() {
        return this.f2268d;
    }

    public c h() {
        return this.f2267c;
    }

    public boolean i() {
        return this.f2268d != null;
    }

    public void j() {
        this.f2268d = null;
        this.f2269e = 0;
        this.f2270f = -1;
        this.f2271g = b.STRONG;
        this.i = 0;
        this.f2272h = a.RELAXED;
        this.f2265a.d();
    }

    public String toString() {
        return this.f2266b.f() + ":" + this.f2267c.toString();
    }
}
