package com.google.android.datatransport.cct;

import c.b.b.a.a.j;
import c.b.b.a.b;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    static final String f5153a = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: b  reason: collision with root package name */
    static final String f5154b = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: c  reason: collision with root package name */
    private static final String f5155c = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: d  reason: collision with root package name */
    private static final Set<b> f5156d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{b.a("proto"), b.a("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final a f5157e = new a(f5153a, (String) null);

    /* renamed from: f  reason: collision with root package name */
    public static final a f5158f = new a(f5154b, f5155c);

    /* renamed from: g  reason: collision with root package name */
    private final String f5159g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5160h;

    public a(String str, String str2) {
        this.f5159g = str;
        this.f5160h = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set<b> a() {
        return f5156d;
    }

    public byte[] b() {
        if (this.f5160h == null && this.f5159g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5159g;
        objArr[2] = "\\";
        String str = this.f5160h;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String c() {
        return this.f5160h;
    }

    public String d() {
        return this.f5159g;
    }

    public byte[] getExtras() {
        return b();
    }

    public String getName() {
        return "cct";
    }
}
