package c.b.b.a.a;

import c.b.b.a.a.o;
import c.b.b.a.b;
import c.b.b.a.c;
import c.b.b.a.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final p f3799a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3800b;

    /* renamed from: c  reason: collision with root package name */
    private final c<?> f3801c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f3802d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3803e;

    static final class a extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private p f3804a;

        /* renamed from: b  reason: collision with root package name */
        private String f3805b;

        /* renamed from: c  reason: collision with root package name */
        private c<?> f3806c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f3807d;

        /* renamed from: e  reason: collision with root package name */
        private b f3808e;

        a() {
        }

        public o.a a(p pVar) {
            if (pVar != null) {
                this.f3804a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* access modifiers changed from: package-private */
        public o.a a(b bVar) {
            if (bVar != null) {
                this.f3808e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public o.a a(c<?> cVar) {
            if (cVar != null) {
                this.f3806c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public o.a a(e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f3807d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public o.a a(String str) {
            if (str != null) {
                this.f3805b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public o a() {
            p pVar = this.f3804a;
            String str = BuildConfig.FLAVOR;
            if (pVar == null) {
                str = str + " transportContext";
            }
            if (this.f3805b == null) {
                str = str + " transportName";
            }
            if (this.f3806c == null) {
                str = str + " event";
            }
            if (this.f3807d == null) {
                str = str + " transformer";
            }
            if (this.f3808e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new d(this.f3804a, this.f3805b, this.f3806c, this.f3807d, this.f3808e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private d(p pVar, String str, c<?> cVar, e<?, byte[]> eVar, b bVar) {
        this.f3799a = pVar;
        this.f3800b = str;
        this.f3801c = cVar;
        this.f3802d = eVar;
        this.f3803e = bVar;
    }

    public b b() {
        return this.f3803e;
    }

    /* access modifiers changed from: package-private */
    public c<?> c() {
        return this.f3801c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f3802d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3799a.equals(oVar.f()) && this.f3800b.equals(oVar.g()) && this.f3801c.equals(oVar.c()) && this.f3802d.equals(oVar.e()) && this.f3803e.equals(oVar.b());
    }

    public p f() {
        return this.f3799a;
    }

    public String g() {
        return this.f3800b;
    }

    public int hashCode() {
        return ((((((((this.f3799a.hashCode() ^ 1000003) * 1000003) ^ this.f3800b.hashCode()) * 1000003) ^ this.f3801c.hashCode()) * 1000003) ^ this.f3802d.hashCode()) * 1000003) ^ this.f3803e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f3799a + ", transportName=" + this.f3800b + ", event=" + this.f3801c + ", transformer=" + this.f3802d + ", encoding=" + this.f3803e + "}";
    }
}
