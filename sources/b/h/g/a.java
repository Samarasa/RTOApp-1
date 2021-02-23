package b.h.g;

import android.util.Base64;
import b.h.i.g;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f2419a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2420b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2421c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f2422d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2423e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f2424f = (this.f2419a + "-" + this.f2420b + "-" + this.f2421c);

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        g.a(str);
        this.f2419a = str;
        g.a(str2);
        this.f2420b = str2;
        g.a(str3);
        this.f2421c = str3;
        g.a(list);
        this.f2422d = list;
    }

    public List<List<byte[]>> a() {
        return this.f2422d;
    }

    public int b() {
        return this.f2423e;
    }

    public String c() {
        return this.f2424f;
    }

    public String d() {
        return this.f2419a;
    }

    public String e() {
        return this.f2420b;
    }

    public String f() {
        return this.f2421c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2419a + ", mProviderPackage: " + this.f2420b + ", mQuery: " + this.f2421c + ", mCertificates:");
        for (int i = 0; i < this.f2422d.size(); i++) {
            sb.append(" [");
            List list = this.f2422d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2423e);
        return sb.toString();
    }
}
