package c.b.b.b.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import c.b.b.b.b.c.c;
import com.google.android.gms.common.internal.C0563t;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static k f3893a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3894b;

    private k(Context context) {
        this.f3894b = context.getApplicationContext();
    }

    public static k a(Context context) {
        C0563t.a(context);
        synchronized (k.class) {
            if (f3893a == null) {
                q.a(context);
                f3893a = new k(context);
            }
        }
        return f3893a;
    }

    private static r a(PackageInfo packageInfo, r... rVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(signatureArr[0].toByteArray());
        for (int i = 0; i < rVarArr.length; i++) {
            if (rVarArr[i].equals(uVar)) {
                return rVarArr[i];
            }
        }
        return null;
    }

    private final z a(String str, int i) {
        try {
            PackageInfo a2 = c.a(this.f3894b).a(str, 64, i);
            boolean d2 = j.d(this.f3894b);
            if (a2 == null) {
                return z.a("null pkg");
            }
            if (a2.signatures != null) {
                if (a2.signatures.length == 1) {
                    u uVar = new u(a2.signatures[0].toByteArray());
                    String str2 = a2.packageName;
                    z a3 = q.a(str2, uVar, d2, false);
                    return (!a3.f3911b || a2.applicationInfo == null || (a2.applicationInfo.flags & 2) == 0 || !q.a(str2, uVar, false, true).f3911b) ? a3 : z.a("debuggable release cert app rejected");
                }
            }
            return z.a("single cert required");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return z.a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        r rVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                rVar = a(packageInfo, w.f3905a);
            } else {
                rVar = a(packageInfo, w.f3905a[0]);
            }
            if (rVar != null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i) {
        z zVar;
        String[] a2 = c.a(this.f3894b).a(i);
        if (a2 != null && a2.length != 0) {
            zVar = null;
            int length = a2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C0563t.a(zVar);
                    zVar = zVar;
                    break;
                }
                zVar = a(a2[i2], i);
                if (zVar.f3911b) {
                    break;
                }
                i2++;
            }
        } else {
            zVar = z.a("no pkgs");
        }
        zVar.c();
        return zVar.f3911b;
    }

    public boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        if (a(packageInfo, true)) {
            if (j.d(this.f3894b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
