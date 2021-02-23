package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import c.b.b.b.g.i;
import c.b.d.a.a;
import c.b.d.a.c;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14706a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final Context f14707b;

    /* renamed from: c  reason: collision with root package name */
    private final c.b.d.e f14708c;

    /* renamed from: d  reason: collision with root package name */
    private final c f14709d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f14710e;

    /* renamed from: f  reason: collision with root package name */
    private final f f14711f;

    /* renamed from: g  reason: collision with root package name */
    private final f f14712g;

    /* renamed from: h  reason: collision with root package name */
    private final f f14713h;
    private final l i;
    private final m j;
    private final n k;

    e(Context context, c.b.d.e eVar, c cVar, Executor executor, f fVar, f fVar2, f fVar3, l lVar, m mVar, n nVar) {
        this.f14707b = context;
        this.f14708c = eVar;
        this.f14709d = cVar;
        this.f14710e = executor;
        this.f14711f = fVar;
        this.f14712g = fVar2;
        this.f14713h = fVar3;
        this.i = lVar;
        this.j = mVar;
        this.k = nVar;
    }

    private i<Void> a(Map<String, String> map) {
        try {
            h.a e2 = h.e();
            e2.a(map);
            return this.f14713h.a(e2.a()).a(a.a());
        } catch (JSONException e3) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
            return c.b.b.b.g.l.a(null);
        }
    }

    public static e a(c.b.d.e eVar) {
        return ((o) eVar.a(o.class)).a();
    }

    static List<Map<String, String>> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    static /* synthetic */ void a(e eVar, h hVar) {
        eVar.f14711f.a();
        eVar.b(hVar.b());
    }

    private static boolean a(h hVar, h hVar2) {
        return hVar2 == null || !hVar.d().equals(hVar2.d());
    }

    public static e b() {
        return a(c.b.d.e.c());
    }

    public i<Void> a(int i2) {
        return a(p.a(this.f14707b, i2));
    }

    public i<Void> a(long j2) {
        return this.i.a(j2).a(c.a());
    }

    public i<Void> a(l lVar) {
        return c.b.b.b.g.l.a(this.f14710e, d.a(this, lVar));
    }

    public String a(String str) {
        return this.j.a(str);
    }

    @Deprecated
    public boolean a() {
        h c2 = this.f14711f.c();
        if (c2 == null || !a(c2, this.f14712g.c())) {
            return false;
        }
        this.f14712g.b(c2).a(this.f14710e, b.a(this));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b(JSONArray jSONArray) {
        if (this.f14709d != null) {
            try {
                this.f14709d.a(a(jSONArray));
            } catch (JSONException e2) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
            } catch (a e3) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f14712g.b();
        this.f14713h.b();
        this.f14711f.b();
    }
}
