package com.google.firebase.remoteconfig;

import android.content.Context;
import c.b.b.b.g.l;
import c.b.d.a.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.firebase.analytics.a.a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.r;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final e f14793a = h.d();

    /* renamed from: b  reason: collision with root package name */
    private static final Random f14794b = new Random();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, e> f14795c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f14796d;

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f14797e;

    /* renamed from: f  reason: collision with root package name */
    private final c.b.d.e f14798f;

    /* renamed from: g  reason: collision with root package name */
    private final FirebaseInstanceId f14799g;

    /* renamed from: h  reason: collision with root package name */
    private final c f14800h;
    private final a i;
    private final String j;
    private Map<String, String> k;

    o(Context context, c.b.d.e eVar, FirebaseInstanceId firebaseInstanceId, c cVar, a aVar) {
        this(context, Executors.newCachedThreadPool(), eVar, firebaseInstanceId, cVar, aVar, new r(context, eVar.e().b()), true);
    }

    protected o(Context context, ExecutorService executorService, c.b.d.e eVar, FirebaseInstanceId firebaseInstanceId, c cVar, a aVar, r rVar, boolean z) {
        this.f14795c = new HashMap();
        this.k = new HashMap();
        this.f14796d = context;
        this.f14797e = executorService;
        this.f14798f = eVar;
        this.f14799g = firebaseInstanceId;
        this.f14800h = cVar;
        this.i = aVar;
        this.j = eVar.e().b();
        if (z) {
            l.a((Executor) executorService, m.a(this));
            rVar.getClass();
            l.a((Executor) executorService, n.a(rVar));
        }
    }

    public static f a(Context context, String str, String str2, String str3) {
        return f.a(Executors.newCachedThreadPool(), com.google.firebase.remoteconfig.internal.o.a(context, String.format("%s_%s_%s_%s.json", new Object[]{"frc", str, str2, str3})));
    }

    private f a(String str, String str2) {
        return a(this.f14796d, this.j, str, str2);
    }

    private m a(f fVar, f fVar2) {
        return new m(fVar, fVar2);
    }

    static n a(Context context, String str, String str2) {
        return new n(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    private static boolean a(c.b.d.e eVar) {
        return eVar.d().equals("[DEFAULT]");
    }

    private static boolean a(c.b.d.e eVar, String str) {
        return str.equals("firebase") && a(eVar);
    }

    /* access modifiers changed from: package-private */
    public e a() {
        return a("firebase");
    }

    /* access modifiers changed from: package-private */
    public synchronized e a(c.b.d.e eVar, String str, c cVar, Executor executor, f fVar, f fVar2, f fVar3, com.google.firebase.remoteconfig.internal.l lVar, m mVar, n nVar) {
        e eVar2;
        String str2 = str;
        synchronized (this) {
            if (!this.f14795c.containsKey(str2)) {
                e eVar3 = new e(this.f14796d, eVar, a(eVar, str) ? cVar : null, executor, fVar, fVar2, fVar3, lVar, mVar, nVar);
                eVar3.c();
                this.f14795c.put(str2, eVar3);
            }
            eVar2 = this.f14795c.get(str2);
        }
        return eVar2;
    }

    public synchronized e a(String str) {
        f a2;
        f a3;
        f a4;
        n a5;
        a2 = a(str, "fetch");
        a3 = a(str, "activate");
        a4 = a(str, "defaults");
        a5 = a(this.f14796d, this.j, str);
        return a(this.f14798f, str, this.f14800h, this.f14797e, a2, a3, a4, a(str, a2, a5), a(a3, a4), a5);
    }

    /* access modifiers changed from: package-private */
    public ConfigFetchHttpClient a(String str, String str2, n nVar) {
        return new ConfigFetchHttpClient(this.f14796d, this.f14798f.e().b(), str, str2, nVar.b(), 60);
    }

    /* access modifiers changed from: package-private */
    public synchronized com.google.firebase.remoteconfig.internal.l a(String str, f fVar, n nVar) {
        return new com.google.firebase.remoteconfig.internal.l(this.f14799g, a(this.f14798f) ? this.i : null, this.f14797e, f14793a, f14794b, fVar, a(this.f14798f.e().a(), str, nVar), nVar, this.k);
    }
}
