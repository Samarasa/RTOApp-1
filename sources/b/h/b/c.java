package b.h.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.e.g;
import b.h.a.a.c;
import b.h.a.a.h;
import b.h.g.f;

@SuppressLint({"NewApi"})
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final k f2398a;

    /* renamed from: b  reason: collision with root package name */
    private static final g<String, Typeface> f2399b = new g<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        f2398a = i >= 29 ? new h() : i >= 28 ? new g() : i >= 26 ? new f() : (i < 24 || !e.a()) ? Build.VERSION.SDK_INT >= 21 ? new d() : new k() : new e();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f2398a.a(context, resources, i, str, i2);
        if (a2 != null) {
            f2399b.a(b(resources, i, i2), a2);
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = b(r2, r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r2, android.graphics.Typeface r3, int r4) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000f
            android.graphics.Typeface r2 = b((android.content.Context) r2, (android.graphics.Typeface) r3, (int) r4)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r4)
            return r2
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Context cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.b.c.a(android.content.Context, android.graphics.Typeface, int):android.graphics.Typeface");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i) {
        return f2398a.a(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface a(Context context, c.a aVar, Resources resources, int i, int i2, h.a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = f.a(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typeface = f2398a.a(context, (c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.a(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f2399b.a(b(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface a(Resources resources, int i, int i2) {
        return f2399b.b(b(resources, i, i2));
    }

    private static Typeface b(Context context, Typeface typeface, int i) {
        c.b a2 = f2398a.a(typeface);
        if (a2 == null) {
            return null;
        }
        return f2398a.a(context, a2, context.getResources(), i);
    }

    private static String b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
