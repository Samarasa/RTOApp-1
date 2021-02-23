package c.b.b.b.b;

import android.util.Log;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import java.util.concurrent.Callable;

class z {

    /* renamed from: a  reason: collision with root package name */
    private static final z f3910a = new z(true, (String) null, (Throwable) null);

    /* renamed from: b  reason: collision with root package name */
    final boolean f3911b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3912c;

    /* renamed from: d  reason: collision with root package name */
    private final Throwable f3913d;

    z(boolean z, String str, Throwable th) {
        this.f3911b = z;
        this.f3912c = str;
        this.f3913d = th;
    }

    static z a() {
        return f3910a;
    }

    static z a(String str) {
        return new z(false, str, (Throwable) null);
    }

    static z a(String str, Throwable th) {
        return new z(false, str, th);
    }

    static z a(Callable<String> callable) {
        return new B(callable);
    }

    static String a(String str, r rVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, j.a(a.a("SHA-1").digest(rVar.a())), Boolean.valueOf(z), "12451009.false"});
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f3912c;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!this.f3911b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f3913d != null) {
                Log.d("GoogleCertificatesRslt", b(), this.f3913d);
            } else {
                Log.d("GoogleCertificatesRslt", b());
            }
        }
    }
}
