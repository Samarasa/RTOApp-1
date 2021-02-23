package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.f;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.eD  reason: case insensitive filesystem */
public final class C1555eD {

    /* renamed from: a  reason: collision with root package name */
    private final _C f10228a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<C0675Ef> f10229b = new AtomicReference<>();

    C1555eD(_C _c) {
        this.f10228a = _c;
    }

    private final C0675Ef b() {
        C0675Ef ef = this.f10229b.get();
        if (ef != null) {
            return ef;
        }
        C1018Rk.d("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    private final C0805Jf b(String str, JSONObject jSONObject) {
        C0675Ef b2 = b();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                return b2.m(jSONObject.getString("class_name")) ? b2.j("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : b2.j("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e2) {
                C1018Rk.b("Invalid custom event.", e2);
            }
        }
        return b2.j(str);
    }

    public final C0624Cg a(String str) {
        C0624Cg x = b().x(str);
        this.f10228a.a(str, x);
        return x;
    }

    public final C1925jT a(String str, JSONObject jSONObject) {
        try {
            C1925jT jTVar = new C1925jT("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? new C1307ag((f) new AdMobAdapter()) : "com.google.ads.mediation.AdUrlAdapter".equals(str) ? new C1307ag((f) new AdUrlAdapter()) : "com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str) ? new C1307ag((f) new zzaqe()) : b(str, jSONObject));
            this.f10228a.a(str, jTVar);
            return jTVar;
        } catch (Throwable th) {
            throw new WS(th);
        }
    }

    public final void a(C0675Ef ef) {
        this.f10229b.compareAndSet((Object) null, ef);
    }

    public final boolean a() {
        return this.f10229b.get() != null;
    }
}
