package c.a.a.c.c;

import android.net.Uri;
import android.text.TextUtils;
import c.a.a.c.h;
import c.a.a.i.i;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class l implements h {

    /* renamed from: a  reason: collision with root package name */
    private final n f3298a;

    /* renamed from: b  reason: collision with root package name */
    private final URL f3299b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3300c;

    /* renamed from: d  reason: collision with root package name */
    private String f3301d;

    /* renamed from: e  reason: collision with root package name */
    private URL f3302e;

    /* renamed from: f  reason: collision with root package name */
    private volatile byte[] f3303f;

    /* renamed from: g  reason: collision with root package name */
    private int f3304g;

    public l(String str) {
        this(str, n.f3306b);
    }

    public l(String str, n nVar) {
        this.f3299b = null;
        i.a(str);
        this.f3300c = str;
        i.a(nVar);
        this.f3298a = nVar;
    }

    public l(URL url) {
        this(url, n.f3306b);
    }

    public l(URL url, n nVar) {
        i.a(url);
        this.f3299b = url;
        this.f3300c = null;
        i.a(nVar);
        this.f3298a = nVar;
    }

    private byte[] d() {
        if (this.f3303f == null) {
            this.f3303f = a().getBytes(h.f3494a);
        }
        return this.f3303f;
    }

    private String e() {
        if (TextUtils.isEmpty(this.f3301d)) {
            String str = this.f3300c;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f3299b;
                i.a(url);
                str = url.toString();
            }
            this.f3301d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f3301d;
    }

    private URL f() {
        if (this.f3302e == null) {
            this.f3302e = new URL(e());
        }
        return this.f3302e;
    }

    public String a() {
        String str = this.f3300c;
        if (str != null) {
            return str;
        }
        URL url = this.f3299b;
        i.a(url);
        return url.toString();
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public Map<String, String> b() {
        return this.f3298a.a();
    }

    public URL c() {
        return f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a().equals(lVar.a()) && this.f3298a.equals(lVar.f3298a);
    }

    public int hashCode() {
        if (this.f3304g == 0) {
            this.f3304g = a().hashCode();
            this.f3304g = (this.f3304g * 31) + this.f3298a.hashCode();
        }
        return this.f3304g;
    }

    public String toString() {
        return a();
    }
}
