package c.b.b.b.d.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: c.b.b.b.d.f.ua  reason: case insensitive filesystem */
public final class C0429ua {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Ja<Boolean> f4586a = Ja.c();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4587b = new Object();

    private static boolean a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean a(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f4586a.a()) {
            synchronized (f4587b) {
                if (f4586a.a()) {
                    boolean booleanValue = f4586a.b().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && a(context)) {
                            z2 = true;
                        }
                        f4586a = Ja.a(Boolean.valueOf(z2));
                    }
                }
                z = true;
                z2 = true;
                f4586a = Ja.a(Boolean.valueOf(z2));
            }
        }
        return f4586a.b().booleanValue();
    }
}
