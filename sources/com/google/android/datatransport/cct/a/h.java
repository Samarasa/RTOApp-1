package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.r;

final class h extends r {

    /* renamed from: a  reason: collision with root package name */
    private final r.b f5185a;

    /* renamed from: b  reason: collision with root package name */
    private final C0489a f5186b;

    static final class a extends r.a {

        /* renamed from: a  reason: collision with root package name */
        private r.b f5187a;

        /* renamed from: b  reason: collision with root package name */
        private C0489a f5188b;

        a() {
        }

        public r.a a(C0489a aVar) {
            this.f5188b = aVar;
            return this;
        }

        public r.a a(r.b bVar) {
            this.f5187a = bVar;
            return this;
        }

        public r a() {
            return new h(this.f5187a, this.f5188b, (g) null);
        }
    }

    /* synthetic */ h(r.b bVar, C0489a aVar, g gVar) {
        this.f5185a = bVar;
        this.f5186b = aVar;
    }

    public C0489a b() {
        return this.f5186b;
    }

    public r.b c() {
        return this.f5185a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r.b bVar = this.f5185a;
        if (bVar != null ? bVar.equals(((h) obj).f5185a) : ((h) obj).f5185a == null) {
            C0489a aVar = this.f5186b;
            if (aVar == null) {
                if (((h) obj).f5186b == null) {
                    return true;
                }
            } else if (aVar.equals(((h) obj).f5186b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        r.b bVar = this.f5185a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C0489a aVar = this.f5186b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f5185a + ", androidClientInfo=" + this.f5186b + "}";
    }
}
