package c.b.b.b.d.f;

import android.os.Binder;

/* renamed from: c.b.b.b.d.f.pa  reason: case insensitive filesystem */
public final /* synthetic */ class C0395pa {
    public static <V> V a(C0388oa<V> oaVar) {
        long clearCallingIdentity;
        try {
            return oaVar.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = oaVar.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
