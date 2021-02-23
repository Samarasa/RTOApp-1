package c.b.b.b.d.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: c.b.b.b.d.f.ia  reason: case insensitive filesystem */
public class C0347ia {

    /* renamed from: a  reason: collision with root package name */
    private static UserManager f4476a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f4477b = (!a());

    /* renamed from: c  reason: collision with root package name */
    private static boolean f4478c = false;

    private C0347ia() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean a(Context context) {
        return !a() || c(context);
    }

    @TargetApi(24)
    private static boolean b(Context context) {
        boolean z;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f4476a == null) {
                f4476a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f4476a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                    z = true;
                }
            } catch (NullPointerException e2) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                f4476a = null;
                i++;
            }
        }
        if (z) {
            f4476a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(android.content.Context r3) {
        /*
            boolean r0 = f4477b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<c.b.b.b.d.f.ia> r0 = c.b.b.b.d.f.C0347ia.class
            monitor-enter(r0)
            boolean r2 = f4477b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = b(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f4477b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0347ia.c(android.content.Context):boolean");
    }
}
