package c.b.b.a.a.c.a;

import c.b.b.a.a.c.a.C0249e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: c.b.b.a.a.c.a.b  reason: case insensitive filesystem */
final class C0246b extends C0249e {

    /* renamed from: b  reason: collision with root package name */
    private final long f3743b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3744c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3745d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3746e;

    /* renamed from: c.b.b.a.a.c.a.b$a */
    static final class a extends C0249e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f3747a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f3748b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f3749c;

        /* renamed from: d  reason: collision with root package name */
        private Long f3750d;

        a() {
        }

        /* access modifiers changed from: package-private */
        public C0249e.a a(int i) {
            this.f3749c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C0249e.a a(long j) {
            this.f3750d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C0249e a() {
            Long l = this.f3747a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f3748b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f3749c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f3750d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new C0246b(this.f3747a.longValue(), this.f3748b.intValue(), this.f3749c.intValue(), this.f3750d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public C0249e.a b(int i) {
            this.f3748b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public C0249e.a b(long j) {
            this.f3747a = Long.valueOf(j);
            return this;
        }
    }

    private C0246b(long j, int i, int i2, long j2) {
        this.f3743b = j;
        this.f3744c = i;
        this.f3745d = i2;
        this.f3746e = j2;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f3745d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f3746e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f3744c;
    }

    /* access modifiers changed from: package-private */
    public long e() {
        return this.f3743b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0249e)) {
            return false;
        }
        C0249e eVar = (C0249e) obj;
        return this.f3743b == eVar.e() && this.f3744c == eVar.d() && this.f3745d == eVar.b() && this.f3746e == eVar.c();
    }

    public int hashCode() {
        long j = this.f3743b;
        long j2 = this.f3746e;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3744c) * 1000003) ^ this.f3745d) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f3743b + ", loadBatchSize=" + this.f3744c + ", criticalSectionEnterTimeoutMs=" + this.f3745d + ", eventCleanUpAge=" + this.f3746e + "}";
    }
}
