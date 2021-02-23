package c.b.b.b.b.c;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.m;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3872a;

    public b(Context context) {
        this.f3872a = context;
    }

    public int a(String str) {
        return this.f3872a.checkCallingOrSelfPermission(str);
    }

    public int a(String str, String str2) {
        return this.f3872a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo a(String str, int i) {
        return this.f3872a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo a(String str, int i, int i2) {
        return this.f3872a.getPackageManager().getPackageInfo(str, 64);
    }

    public boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f3872a);
        }
        if (!m.k() || (nameForUid = this.f3872a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f3872a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean a(int i, String str) {
        if (m.f()) {
            try {
                ((AppOpsManager) this.f3872a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f3872a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final String[] a(int i) {
        return this.f3872a.getPackageManager().getPackagesForUid(i);
    }

    public PackageInfo b(String str, int i) {
        return this.f3872a.getPackageManager().getPackageInfo(str, i);
    }

    public CharSequence b(String str) {
        return this.f3872a.getPackageManager().getApplicationLabel(this.f3872a.getPackageManager().getApplicationInfo(str, 0));
    }
}
