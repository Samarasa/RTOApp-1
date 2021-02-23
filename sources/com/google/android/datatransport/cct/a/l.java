package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.w;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

final class l extends w {

    /* renamed from: a  reason: collision with root package name */
    private final long f5203a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5204b;

    /* renamed from: c  reason: collision with root package name */
    private final r f5205c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5206d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5207e;

    /* renamed from: f  reason: collision with root package name */
    private final List<u> f5208f;

    /* renamed from: g  reason: collision with root package name */
    private final b f5209g;

    static final class a extends w.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f5210a;

        /* renamed from: b  reason: collision with root package name */
        private Long f5211b;

        /* renamed from: c  reason: collision with root package name */
        private r f5212c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f5213d;

        /* renamed from: e  reason: collision with root package name */
        private String f5214e;

        /* renamed from: f  reason: collision with root package name */
        private List<u> f5215f;

        /* renamed from: g  reason: collision with root package name */
        private b f5216g;

        a() {
        }

        /* access modifiers changed from: package-private */
        public w.a a(int i) {
            this.f5213d = Integer.valueOf(i);
            return this;
        }

        public w.a a(long j) {
            this.f5210a = Long.valueOf(j);
            return this;
        }

        public w.a a(b bVar) {
            this.f5216g = bVar;
            return this;
        }

        public w.a a(r rVar) {
            this.f5212c = rVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public w.a a(String str) {
            this.f5214e = str;
            return this;
        }

        public w.a a(List<u> list) {
            this.f5215f = list;
            return this;
        }

        public w a() {
            Long l = this.f5210a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " requestTimeMs";
            }
            if (this.f5211b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.f5213d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new l(this.f5210a.longValue(), this.f5211b.longValue(), this.f5212c, this.f5213d.intValue(), this.f5214e, this.f5215f, this.f5216g, (k) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public w.a b(long j) {
            this.f5211b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ l(long j, long j2, r rVar, int i, String str, List list, b bVar, k kVar) {
        this.f5203a = j;
        this.f5204b = j2;
        this.f5205c = rVar;
        this.f5206d = i;
        this.f5207e = str;
        this.f5208f = list;
        this.f5209g = bVar;
    }

    public r b() {
        return this.f5205c;
    }

    public List<u> c() {
        return this.f5208f;
    }

    public int d() {
        return this.f5206d;
    }

    public String e() {
        return this.f5207e;
    }

    public boolean equals(Object obj) {
        r rVar;
        String str;
        List<u> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f5203a == lVar.f5203a && this.f5204b == lVar.f5204b && ((rVar = this.f5205c) != null ? rVar.equals(lVar.f5205c) : lVar.f5205c == null) && this.f5206d == lVar.f5206d && ((str = this.f5207e) != null ? str.equals(lVar.f5207e) : lVar.f5207e == null) && ((list = this.f5208f) != null ? list.equals(lVar.f5208f) : lVar.f5208f == null)) {
            b bVar = this.f5209g;
            if (bVar == null) {
                if (lVar.f5209g == null) {
                    return true;
                }
            } else if (bVar.equals(lVar.f5209g)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f5203a;
    }

    public long g() {
        return this.f5204b;
    }

    public int hashCode() {
        long j = this.f5203a;
        long j2 = this.f5204b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        r rVar = this.f5205c;
        int i2 = 0;
        int hashCode = (((i ^ (rVar == null ? 0 : rVar.hashCode())) * 1000003) ^ this.f5206d) * 1000003;
        String str = this.f5207e;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<u> list = this.f5208f;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        b bVar = this.f5209g;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode3 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f5203a + ", requestUptimeMs=" + this.f5204b + ", clientInfo=" + this.f5205c + ", logSource=" + this.f5206d + ", logSourceName=" + this.f5207e + ", logEvents=" + this.f5208f + ", qosTier=" + this.f5209g + "}";
    }
}
