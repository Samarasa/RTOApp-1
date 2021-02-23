package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.z;

final class o extends z {

    /* renamed from: a  reason: collision with root package name */
    private final z.c f5218a;

    /* renamed from: b  reason: collision with root package name */
    private final z.b f5219b;

    static final class a extends z.a {

        /* renamed from: a  reason: collision with root package name */
        private z.c f5220a;

        /* renamed from: b  reason: collision with root package name */
        private z.b f5221b;

        a() {
        }

        public z.a a(z.b bVar) {
            this.f5221b = bVar;
            return this;
        }

        public z.a a(z.c cVar) {
            this.f5220a = cVar;
            return this;
        }

        public z a() {
            return new o(this.f5220a, this.f5221b, (n) null);
        }
    }

    /* synthetic */ o(z.c cVar, z.b bVar, n nVar) {
        this.f5218a = cVar;
        this.f5219b = bVar;
    }

    public z.b b() {
        return this.f5219b;
    }

    public z.c c() {
        return this.f5218a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z.c cVar = this.f5218a;
        if (cVar != null ? cVar.equals(((o) obj).f5218a) : ((o) obj).f5218a == null) {
            z.b bVar = this.f5219b;
            if (bVar == null) {
                if (((o) obj).f5219b == null) {
                    return true;
                }
            } else if (bVar.equals(((o) obj).f5219b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        z.c cVar = this.f5218a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        z.b bVar = this.f5219b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5218a + ", mobileSubtype=" + this.f5219b + "}";
    }
}
