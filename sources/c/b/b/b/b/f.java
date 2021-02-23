package c.b.b.b.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import c.b.b.b.b.c.c;
import com.google.android.gms.common.internal.K;
import com.google.android.gms.common.util.i;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3884a = j.f3888a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f3885b = new f();

    f() {
    }

    public static f a() {
        return f3885b;
    }

    private static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f3884a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context) {
        return j.a(context);
    }

    public int a(Context context, int i) {
        int a2 = j.a(context, i);
        if (j.b(context, a2)) {
            return 18;
        }
        return a2;
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, (String) null);
    }

    public PendingIntent a(Context context, int i, int i2, String str) {
        Intent a2 = a(context, i, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a2, 134217728);
    }

    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !i.d(context)) ? K.a("com.google.android.gms", a(context, str)) : K.a();
        }
        if (i != 3) {
            return null;
        }
        return K.a("com.google.android.gms");
    }

    public String a(int i) {
        return j.a(i);
    }

    public int b(Context context) {
        return a(context, f3884a);
    }

    public boolean b(int i) {
        return j.b(i);
    }
}
