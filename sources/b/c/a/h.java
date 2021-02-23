package b.c.a;

import a.a.a.a;
import a.a.a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final b f2180a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f2181b;

    h(b bVar, ComponentName componentName) {
        this.f2180a = bVar;
        this.f2181b = componentName;
    }

    public static boolean a(Context context, String str, k kVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, kVar, 33);
    }

    public l a(a aVar) {
        g gVar = new g(this, aVar);
        try {
            if (!this.f2180a.a((a) gVar)) {
                return null;
            }
            return new l(this.f2180a, gVar, this.f2181b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean a(long j) {
        try {
            return this.f2180a.a(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
