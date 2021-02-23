package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.C0489a;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class e extends C0489a {

    /* renamed from: a  reason: collision with root package name */
    private final int f5168a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5169b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5170c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5171d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5172e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5173f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5174g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5175h;

    static final class a extends C0489a.C0068a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f5176a;

        /* renamed from: b  reason: collision with root package name */
        private String f5177b;

        /* renamed from: c  reason: collision with root package name */
        private String f5178c;

        /* renamed from: d  reason: collision with root package name */
        private String f5179d;

        /* renamed from: e  reason: collision with root package name */
        private String f5180e;

        /* renamed from: f  reason: collision with root package name */
        private String f5181f;

        /* renamed from: g  reason: collision with root package name */
        private String f5182g;

        /* renamed from: h  reason: collision with root package name */
        private String f5183h;

        a() {
        }

        public C0489a.C0068a a(int i) {
            this.f5176a = Integer.valueOf(i);
            return this;
        }

        public C0489a.C0068a a(String str) {
            this.f5179d = str;
            return this;
        }

        public C0489a a() {
            Integer num = this.f5176a;
            String str = BuildConfig.FLAVOR;
            if (num == null) {
                str = str + " sdkVersion";
            }
            if (str.isEmpty()) {
                return new e(this.f5176a.intValue(), this.f5177b, this.f5178c, this.f5179d, this.f5180e, this.f5181f, this.f5182g, this.f5183h, (d) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public C0489a.C0068a b(String str) {
            this.f5183h = str;
            return this;
        }

        public C0489a.C0068a c(String str) {
            this.f5178c = str;
            return this;
        }

        public C0489a.C0068a d(String str) {
            this.f5182g = str;
            return this;
        }

        public C0489a.C0068a e(String str) {
            this.f5177b = str;
            return this;
        }

        public C0489a.C0068a f(String str) {
            this.f5181f = str;
            return this;
        }

        public C0489a.C0068a g(String str) {
            this.f5180e = str;
            return this;
        }
    }

    /* synthetic */ e(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, d dVar) {
        this.f5168a = i;
        this.f5169b = str;
        this.f5170c = str2;
        this.f5171d = str3;
        this.f5172e = str4;
        this.f5173f = str5;
        this.f5174g = str6;
        this.f5175h = str7;
    }

    public String b() {
        return this.f5171d;
    }

    public String c() {
        return this.f5175h;
    }

    public String d() {
        return this.f5170c;
    }

    public String e() {
        return this.f5174g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0489a)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5168a == eVar.f5168a && ((str = this.f5169b) != null ? str.equals(eVar.f5169b) : eVar.f5169b == null) && ((str2 = this.f5170c) != null ? str2.equals(eVar.f5170c) : eVar.f5170c == null) && ((str3 = this.f5171d) != null ? str3.equals(eVar.f5171d) : eVar.f5171d == null) && ((str4 = this.f5172e) != null ? str4.equals(eVar.f5172e) : eVar.f5172e == null) && ((str5 = this.f5173f) != null ? str5.equals(eVar.f5173f) : eVar.f5173f == null) && ((str6 = this.f5174g) != null ? str6.equals(eVar.f5174g) : eVar.f5174g == null)) {
            String str7 = this.f5175h;
            if (str7 == null) {
                if (eVar.f5175h == null) {
                    return true;
                }
            } else if (str7.equals(eVar.f5175h)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f5169b;
    }

    public String g() {
        return this.f5173f;
    }

    public String h() {
        return this.f5172e;
    }

    public int hashCode() {
        int i = (this.f5168a ^ 1000003) * 1000003;
        String str = this.f5169b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f5170c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5171d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f5172e;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f5173f;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f5174g;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f5175h;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode6 ^ i2;
    }

    public int i() {
        return this.f5168a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f5168a + ", model=" + this.f5169b + ", hardware=" + this.f5170c + ", device=" + this.f5171d + ", product=" + this.f5172e + ", osBuild=" + this.f5173f + ", manufacturer=" + this.f5174g + ", fingerprint=" + this.f5175h + "}";
    }
}
