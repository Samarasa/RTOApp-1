package androidx.work;

import android.os.Build;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1708a = new a().a();

    /* renamed from: b  reason: collision with root package name */
    private i f1709b = i.NOT_REQUIRED;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1710c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1711d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1712e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1713f;

    /* renamed from: g  reason: collision with root package name */
    private long f1714g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f1715h = -1;
    private d i = new d();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f1716a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f1717b = false;

        /* renamed from: c  reason: collision with root package name */
        i f1718c = i.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f1719d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f1720e = false;

        /* renamed from: f  reason: collision with root package name */
        long f1721f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f1722g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f1723h = new d();

        public a a(i iVar) {
            this.f1718c = iVar;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c() {
    }

    c(a aVar) {
        this.f1710c = aVar.f1716a;
        this.f1711d = Build.VERSION.SDK_INT >= 23 && aVar.f1717b;
        this.f1709b = aVar.f1718c;
        this.f1712e = aVar.f1719d;
        this.f1713f = aVar.f1720e;
        if (Build.VERSION.SDK_INT >= 24) {
            this.i = aVar.f1723h;
            this.f1714g = aVar.f1721f;
            this.f1715h = aVar.f1722g;
        }
    }

    public c(c cVar) {
        this.f1710c = cVar.f1710c;
        this.f1711d = cVar.f1711d;
        this.f1709b = cVar.f1709b;
        this.f1712e = cVar.f1712e;
        this.f1713f = cVar.f1713f;
        this.i = cVar.i;
    }

    public d a() {
        return this.i;
    }

    public void a(long j) {
        this.f1714g = j;
    }

    public void a(d dVar) {
        this.i = dVar;
    }

    public void a(i iVar) {
        this.f1709b = iVar;
    }

    public void a(boolean z) {
        this.f1712e = z;
    }

    public i b() {
        return this.f1709b;
    }

    public void b(long j) {
        this.f1715h = j;
    }

    public void b(boolean z) {
        this.f1710c = z;
    }

    public long c() {
        return this.f1714g;
    }

    public void c(boolean z) {
        this.f1711d = z;
    }

    public long d() {
        return this.f1715h;
    }

    public void d(boolean z) {
        this.f1713f = z;
    }

    public boolean e() {
        return this.i.b() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1710c == cVar.f1710c && this.f1711d == cVar.f1711d && this.f1712e == cVar.f1712e && this.f1713f == cVar.f1713f && this.f1714g == cVar.f1714g && this.f1715h == cVar.f1715h && this.f1709b == cVar.f1709b) {
            return this.i.equals(cVar.i);
        }
        return false;
    }

    public boolean f() {
        return this.f1712e;
    }

    public boolean g() {
        return this.f1710c;
    }

    public boolean h() {
        return this.f1711d;
    }

    public int hashCode() {
        long j = this.f1714g;
        long j2 = this.f1715h;
        return (((((((((((((this.f1709b.hashCode() * 31) + (this.f1710c ? 1 : 0)) * 31) + (this.f1711d ? 1 : 0)) * 31) + (this.f1712e ? 1 : 0)) * 31) + (this.f1713f ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.i.hashCode();
    }

    public boolean i() {
        return this.f1713f;
    }
}
