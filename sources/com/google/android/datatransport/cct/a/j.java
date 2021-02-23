package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.u;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;

final class j extends u {

    /* renamed from: a  reason: collision with root package name */
    private final long f5189a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5190b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5191c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f5192d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5193e;

    /* renamed from: f  reason: collision with root package name */
    private final long f5194f;

    /* renamed from: g  reason: collision with root package name */
    private final z f5195g;

    static final class a extends u.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f5196a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f5197b;

        /* renamed from: c  reason: collision with root package name */
        private Long f5198c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f5199d;

        /* renamed from: e  reason: collision with root package name */
        private String f5200e;

        /* renamed from: f  reason: collision with root package name */
        private Long f5201f;

        /* renamed from: g  reason: collision with root package name */
        private z f5202g;

        a() {
        }

        public u.a a(int i) {
            this.f5197b = Integer.valueOf(i);
            return this;
        }

        public u.a a(long j) {
            this.f5196a = Long.valueOf(j);
            return this;
        }

        public u.a a(z zVar) {
            this.f5202g = zVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public u.a a(String str) {
            this.f5200e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public u.a a(byte[] bArr) {
            this.f5199d = bArr;
            return this;
        }

        public u a() {
            Long l = this.f5196a;
            String str = BuildConfig.FLAVOR;
            if (l == null) {
                str = str + " eventTimeMs";
            }
            if (this.f5197b == null) {
                str = str + " eventCode";
            }
            if (this.f5198c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f5201f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f5196a.longValue(), this.f5197b.intValue(), this.f5198c.longValue(), this.f5199d, this.f5200e, this.f5201f.longValue(), this.f5202g, (i) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public u.a b(long j) {
            this.f5198c = Long.valueOf(j);
            return this;
        }

        public u.a c(long j) {
            this.f5201f = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ j(long j, int i, long j2, byte[] bArr, String str, long j3, z zVar, i iVar) {
        this.f5189a = j;
        this.f5190b = i;
        this.f5191c = j2;
        this.f5192d = bArr;
        this.f5193e = str;
        this.f5194f = j3;
        this.f5195g = zVar;
    }

    public long a() {
        return this.f5189a;
    }

    public long b() {
        return this.f5191c;
    }

    public long c() {
        return this.f5194f;
    }

    public int d() {
        return this.f5190b;
    }

    public z e() {
        return this.f5195g;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f5189a == uVar.a()) {
            j jVar = (j) uVar;
            if (this.f5190b == jVar.f5190b && this.f5191c == uVar.b()) {
                boolean z = uVar instanceof j;
                if (Arrays.equals(this.f5192d, jVar.f5192d) && ((str = this.f5193e) != null ? str.equals(jVar.f5193e) : jVar.f5193e == null) && this.f5194f == uVar.c()) {
                    z zVar = this.f5195g;
                    if (zVar == null) {
                        if (jVar.f5195g == null) {
                            return true;
                        }
                    } else if (zVar.equals(jVar.f5195g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f5192d;
    }

    public String g() {
        return this.f5193e;
    }

    public int hashCode() {
        long j = this.f5189a;
        long j2 = this.f5191c;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5190b) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5192d)) * 1000003;
        String str = this.f5193e;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f5194f;
        int i2 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        z zVar = this.f5195g;
        if (zVar != null) {
            i = zVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f5189a + ", eventCode=" + this.f5190b + ", eventUptimeMs=" + this.f5191c + ", sourceExtension=" + Arrays.toString(this.f5192d) + ", sourceExtensionJsonProto3=" + this.f5193e + ", timezoneOffsetSeconds=" + this.f5194f + ", networkConnectionInfo=" + this.f5195g + "}";
    }
}
