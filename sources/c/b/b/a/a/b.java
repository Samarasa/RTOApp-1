package c.b.b.a.a;

import c.b.b.a.a.l;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Map;

final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f3704a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f3705b;

    /* renamed from: c  reason: collision with root package name */
    private final k f3706c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3707d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3708e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f3709f;

    static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private String f3710a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f3711b;

        /* renamed from: c  reason: collision with root package name */
        private k f3712c;

        /* renamed from: d  reason: collision with root package name */
        private Long f3713d;

        /* renamed from: e  reason: collision with root package name */
        private Long f3714e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f3715f;

        a() {
        }

        public l.a a(long j) {
            this.f3713d = Long.valueOf(j);
            return this;
        }

        public l.a a(k kVar) {
            if (kVar != null) {
                this.f3712c = kVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public l.a a(Integer num) {
            this.f3711b = num;
            return this;
        }

        public l.a a(String str) {
            if (str != null) {
                this.f3710a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* access modifiers changed from: protected */
        public l.a a(Map<String, String> map) {
            if (map != null) {
                this.f3715f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public l a() {
            String str = this.f3710a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = str2 + " transportName";
            }
            if (this.f3712c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f3713d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f3714e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f3715f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new b(this.f3710a, this.f3711b, this.f3712c, this.f3713d.longValue(), this.f3714e.longValue(), this.f3715f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        public l.a b(long j) {
            this.f3714e = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: protected */
        public Map<String, String> b() {
            Map<String, String> map = this.f3715f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }

    private b(String str, Integer num, k kVar, long j, long j2, Map<String, String> map) {
        this.f3704a = str;
        this.f3705b = num;
        this.f3706c = kVar;
        this.f3707d = j;
        this.f3708e = j2;
        this.f3709f = map;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> b() {
        return this.f3709f;
    }

    public Integer c() {
        return this.f3705b;
    }

    public k d() {
        return this.f3706c;
    }

    public long e() {
        return this.f3707d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f3705b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof c.b.b.a.a.l
            r2 = 0
            if (r1 == 0) goto L_0x005b
            c.b.b.a.a.l r8 = (c.b.b.a.a.l) r8
            java.lang.String r1 = r7.f3704a
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f3705b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.c()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            c.b.b.a.a.k r1 = r7.f3706c
            c.b.b.a.a.k r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f3707d
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f3708e
            long r5 = r8.h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f3709f
            java.util.Map r8 = r8.b()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.a.a.b.equals(java.lang.Object):boolean");
    }

    public String g() {
        return this.f3704a;
    }

    public long h() {
        return this.f3708e;
    }

    public int hashCode() {
        int hashCode = (this.f3704a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3705b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f3707d;
        long j2 = this.f3708e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f3706c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f3709f.hashCode();
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f3704a + ", code=" + this.f3705b + ", encodedPayload=" + this.f3706c + ", eventMillis=" + this.f3707d + ", uptimeMillis=" + this.f3708e + ", autoMetadata=" + this.f3709f + "}";
    }
}
