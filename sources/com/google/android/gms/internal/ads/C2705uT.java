package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.ka;
import com.google.android.gms.ads.internal.util.la;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uT  reason: case insensitive filesystem */
public final class C2705uT {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C2847wT> f12330a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f12331b;

    /* renamed from: c  reason: collision with root package name */
    private final C2874wk f12332c;

    /* renamed from: d  reason: collision with root package name */
    private final C1200Yk f12333d;

    public C2705uT(Context context, C1200Yk yk, C2874wk wkVar) {
        this.f12331b = context;
        this.f12333d = yk;
        this.f12332c = wkVar;
    }

    private final C2847wT a() {
        return new C2847wT(this.f12331b, this.f12332c.i(), this.f12332c.k());
    }

    private final C2847wT b(String str) {
        C0808Ji a2 = C0808Ji.a(this.f12331b);
        try {
            a2.a(str);
            ka kaVar = new ka();
            kaVar.a(this.f12331b, str, false);
            la laVar = new la(this.f12332c.i(), kaVar);
            return new C2847wT(a2, laVar, new C0732Gk(C0758Hk.c(), laVar));
        } catch (PackageManager.NameNotFoundException unused) {
            return a();
        }
    }

    public final C2847wT a(String str) {
        if (str == null) {
            return a();
        }
        if (this.f12330a.containsKey(str)) {
            return this.f12330a.get(str);
        }
        C2847wT b2 = b(str);
        this.f12330a.put(str, b2);
        return b2;
    }
}
