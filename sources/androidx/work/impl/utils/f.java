package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.h;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2008a = h.a("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            h a2 = h.a();
            String str2 = f2008a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : "disabled";
            a2.a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e2) {
            h a3 = h.a();
            String str3 = f2008a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            a3.a(str3, String.format("%s could not be %s", objArr2), e2);
        }
    }
}
