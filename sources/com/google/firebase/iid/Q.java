package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import c.b.b.b.b.f;
import c.b.b.b.g.C0468a;
import c.b.b.b.g.i;
import c.b.b.b.g.j;
import c.b.d.d.c;
import c.b.d.e;
import c.b.d.g.h;
import com.google.android.gms.common.internal.r;
import java.io.IOException;
import java.util.concurrent.Executor;

final class Q {

    /* renamed from: a  reason: collision with root package name */
    private final e f14536a;

    /* renamed from: b  reason: collision with root package name */
    private final C3324k f14537b;

    /* renamed from: c  reason: collision with root package name */
    private final C3330q f14538c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f14539d;

    /* renamed from: e  reason: collision with root package name */
    private final h f14540e;

    /* renamed from: f  reason: collision with root package name */
    private final c f14541f;

    Q(e eVar, C3324k kVar, Executor executor, h hVar, c cVar) {
        this(eVar, kVar, executor, new C3330q(eVar.b(), kVar), hVar, cVar);
    }

    private Q(e eVar, C3324k kVar, Executor executor, C3330q qVar, h hVar, c cVar) {
        this.f14536a = eVar;
        this.f14537b = kVar;
        this.f14538c = qVar;
        this.f14539d = executor;
        this.f14540e = hVar;
        this.f14541f = cVar;
    }

    private final <T> i<Void> a(i<T> iVar) {
        return iVar.a(C3315b.a(), (C0468a<T, TContinuationResult>) new S(this));
    }

    private final i<Bundle> a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f14536a.e().b());
        bundle.putString("gmsv", Integer.toString(this.f14537b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f14537b.b());
        bundle.putString("app_ver_name", this.f14537b.c());
        String a2 = r.a().a("firebase-iid");
        if ("UNKNOWN".equals(a2)) {
            int i = f.f3884a;
            StringBuilder sb = new StringBuilder(19);
            sb.append("unknown_");
            sb.append(i);
            a2 = sb.toString();
        }
        String valueOf = String.valueOf(a2);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        c.a a3 = this.f14541f.a("fire-iid");
        if (a3 != c.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a3.a()));
            bundle.putString("Firebase-Client", this.f14540e.a());
        }
        j jVar = new j();
        this.f14539d.execute(new T(this, bundle, jVar));
        return jVar.a();
    }

    /* access modifiers changed from: private */
    public static String a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private final i<String> b(i<Bundle> iVar) {
        return iVar.a(this.f14539d, (C0468a<Bundle, TContinuationResult>) new V(this));
    }

    public final i<String> a(String str, String str2, String str3) {
        return b(a(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, j jVar) {
        try {
            jVar.a(this.f14538c.a(bundle));
        } catch (IOException e2) {
            jVar.a((Exception) e2);
        }
    }

    public final i<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    public final i<Void> c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return a(b(a(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }
}
