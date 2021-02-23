package g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: g.j  reason: case insensitive filesystem */
public final class C3349j {
    public static final C3349j A = a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final C3349j Aa = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final C3349j B = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final C3349j Ba = a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final C3349j C = a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final C3349j Ca = a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final C3349j D = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final C3349j Da = a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final C3349j E = a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final C3349j Ea = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final C3349j F = a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final C3349j Fa = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final C3349j G = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final C3349j Ga = a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final C3349j H = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final C3349j Ha = a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final C3349j I = a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final C3349j Ia = a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final C3349j J = a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final C3349j Ja = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final C3349j K = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final C3349j Ka = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final C3349j L = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final C3349j La = a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final C3349j M = a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final C3349j Ma = a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final C3349j N = a("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final C3349j Na = a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final C3349j O = a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final C3349j Oa = a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final C3349j P = a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final C3349j Pa = a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final C3349j Q = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final C3349j Qa = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final C3349j R = a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final C3349j Ra = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final C3349j S = a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final C3349j Sa = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final C3349j T = a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final C3349j Ta = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final C3349j U = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final C3349j Ua = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final C3349j V = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final C3349j Va = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final C3349j W = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final C3349j Wa = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final C3349j X = a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final C3349j Xa = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final C3349j Y = a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    public static final C3349j Ya = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    public static final C3349j Z = a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    public static final C3349j Za = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    public static final C3349j _a = a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: a  reason: collision with root package name */
    static final Comparator<String> f15258a = new C3348i();
    public static final C3349j aa = a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    public static final C3349j ab = a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, C3349j> f15259b = new TreeMap(f15258a);
    public static final C3349j ba = a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    public static final C3349j bb = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: c  reason: collision with root package name */
    public static final C3349j f15260c = a("SSL_RSA_WITH_NULL_MD5", 1);
    public static final C3349j ca = a("TLS_PSK_WITH_RC4_128_SHA", 138);
    public static final C3349j cb = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: d  reason: collision with root package name */
    public static final C3349j f15261d = a("SSL_RSA_WITH_NULL_SHA", 2);
    public static final C3349j da = a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
    public static final C3349j db = a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: e  reason: collision with root package name */
    public static final C3349j f15262e = a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    public static final C3349j ea = a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    public static final C3349j eb = a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: f  reason: collision with root package name */
    public static final C3349j f15263f = a("SSL_RSA_WITH_RC4_128_MD5", 4);
    public static final C3349j fa = a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    public static final C3349j fb = a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: g  reason: collision with root package name */
    public static final C3349j f15264g = a("SSL_RSA_WITH_RC4_128_SHA", 5);
    public static final C3349j ga = a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
    public static final C3349j gb = a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: h  reason: collision with root package name */
    public static final C3349j f15265h = a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    public static final C3349j ha = a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    public static final C3349j hb = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    public static final C3349j i = a("SSL_RSA_WITH_DES_CBC_SHA", 9);
    public static final C3349j ia = a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    public static final C3349j ib = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    public static final C3349j j = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    public static final C3349j ja = a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    public static final C3349j k = a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    public static final C3349j ka = a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    public static final C3349j l = a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    public static final C3349j la = a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    public static final C3349j m = a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    public static final C3349j ma = a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    public static final C3349j n = a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    public static final C3349j na = a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    public static final C3349j o = a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    public static final C3349j oa = a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    public static final C3349j p = a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    public static final C3349j pa = a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final C3349j q = a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    public static final C3349j qa = a("TLS_FALLBACK_SCSV", 22016);
    public static final C3349j r = a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    public static final C3349j ra = a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
    public static final C3349j s = a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    public static final C3349j sa = a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
    public static final C3349j t = a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    public static final C3349j ta = a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
    public static final C3349j u = a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    public static final C3349j ua = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
    public static final C3349j v = a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    public static final C3349j va = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
    public static final C3349j w = a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    public static final C3349j wa = a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
    public static final C3349j x = a("TLS_KRB5_WITH_RC4_128_SHA", 32);
    public static final C3349j xa = a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
    public static final C3349j y = a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final C3349j ya = a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final C3349j z = a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final C3349j za = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    final String jb;

    private C3349j(String str) {
        if (str != null) {
            this.jb = str;
            return;
        }
        throw new NullPointerException();
    }

    public static synchronized C3349j a(String str) {
        C3349j jVar;
        synchronized (C3349j.class) {
            jVar = f15259b.get(str);
            if (jVar == null) {
                jVar = new C3349j(str);
                f15259b.put(str, jVar);
            }
        }
        return jVar;
    }

    private static C3349j a(String str, int i2) {
        return a(str);
    }

    static List<C3349j> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a2 : strArr) {
            arrayList.add(a(a2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        return this.jb;
    }
}
