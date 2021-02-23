package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Set;

final class e extends h.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f5289a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5290b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<h.c> f5291c;

    static final class a extends h.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f5292a;

        /* renamed from: b  reason: collision with root package name */
        private Long f5293b;

        /* renamed from: c  reason: collision with root package name */
        private Set<h.c> f5294c;

        a() {
        }

        public h.b.a a(long j) {
            this.f5292a = Long.valueOf(j);
            return this;
        }

        public h.b.a a(Set<h.c> set) {
            if (set != null) {
                this.f5294c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public h.b a() {
            Long l = this.f5292a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " delta";
            }
            if (this.f5293b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f5294c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new e(this.f5292a.longValue(), this.f5293b.longValue(), this.f5294c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public h.b.a b(long j) {
            this.f5293b = Long.valueOf(j);
            return this;
        }
    }

    private e(long j, long j2, Set<h.c> set) {
        this.f5289a = j;
        this.f5290b = j2;
        this.f5291c = set;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f5289a;
    }

    /* access modifiers changed from: package-private */
    public Set<h.c> c() {
        return this.f5291c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f5290b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h.b)) {
            return false;
        }
        h.b bVar = (h.b) obj;
        return this.f5289a == bVar.b() && this.f5290b == bVar.d() && this.f5291c.equals(bVar.c());
    }

    public int hashCode() {
        long j = this.f5289a;
        long j2 = this.f5290b;
        return this.f5291c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f5289a + ", maxAllowedDelay=" + this.f5290b + ", flags=" + this.f5291c + "}";
    }
}
