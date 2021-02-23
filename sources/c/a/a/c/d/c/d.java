package c.a.a.c.d.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c.a.a.c.b.F;
import c.a.a.c.k;
import c.a.a.c.l;
import java.util.List;

public class d implements l<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3434a;

    public d(Context context) {
        this.f3434a = context.getApplicationContext();
    }

    private int a(Uri uri) {
        Integer num;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String authority = uri.getAuthority();
            String str = pathSegments.get(1);
            num = Integer.valueOf(this.f3434a.getResources().getIdentifier(str, pathSegments.get(0), authority));
        } else {
            if (pathSegments.size() == 1) {
                try {
                    num = Integer.valueOf(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            num = null;
        }
        if (num == null) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
        } else if (num.intValue() != 0) {
            return num.intValue();
        } else {
            throw new IllegalArgumentException("Failed to obtain resource id for: " + uri);
        }
    }

    private Context a(Uri uri, String str) {
        try {
            return this.f3434a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
        }
    }

    public F<Drawable> a(Uri uri, int i, int i2, k kVar) {
        int a2 = a(uri);
        String authority = uri.getAuthority();
        return c.a(a.a(this.f3434a, authority.equals(this.f3434a.getPackageName()) ? this.f3434a : a(uri, authority), a2));
    }

    public boolean a(Uri uri, k kVar) {
        return uri.getScheme().equals("android.resource");
    }
}
