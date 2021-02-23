package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.ads.internal.util.oa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class GA implements C1085Tz {

    /* renamed from: a  reason: collision with root package name */
    private final C1013Rf f6972a;

    /* renamed from: b  reason: collision with root package name */
    private final C1039Sf f6973b;

    /* renamed from: c  reason: collision with root package name */
    private final C1195Yf f6974c;

    /* renamed from: d  reason: collision with root package name */
    private final C0846Ku f6975d;

    /* renamed from: e  reason: collision with root package name */
    private final C2537ru f6976e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f6977f;

    /* renamed from: g  reason: collision with root package name */
    private final C2988yS f6978g;

    /* renamed from: h  reason: collision with root package name */
    private final C1200Yk f6979h;
    private final SS i;
    private boolean j = false;
    private boolean k = false;
    private boolean l = true;

    public GA(C1013Rf rf, C1039Sf sf, C1195Yf yf, C0846Ku ku, C2537ru ruVar, Context context, C2988yS ySVar, C1200Yk yk, SS ss) {
        this.f6972a = rf;
        this.f6973b = sf;
        this.f6974c = yf;
        this.f6975d = ku;
        this.f6976e = ruVar;
        this.f6977f = context;
        this.f6978g = ySVar;
        this.f6979h = yk;
        this.i = ss;
    }

    private static HashMap<String, View> a(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    private final boolean a(Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        View view;
        JSONObject jSONObject = this.f6978g.fa;
        if (((Boolean) Qqa.e().a(F.qb)).booleanValue() && jSONObject.length() != 0) {
            if (map == null) {
                map = new HashMap<>();
            }
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.putAll(map2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    WeakReference weakReference = (WeakReference) hashMap.get(next);
                    if (weakReference == null || (view = (View) weakReference.get()) == null) {
                        return false;
                    }
                    Class<?> cls = view.getClass();
                    try {
                        ArrayList arrayList = new ArrayList();
                        M.a(optJSONArray, (List<String>) arrayList);
                        p.c();
                        if (!oa.a(this.f6977f.getClassLoader(), cls, (List<String>) arrayList)) {
                            return false;
                        }
                    } catch (JSONException unused) {
                        continue;
                    }
                }
            }
        }
        return true;
    }

    private final void b(View view) {
        try {
            if (this.f6974c != null && !this.f6974c.ga()) {
                this.f6974c.b(b.a(view));
                this.f6976e.onAdClicked();
            } else if (this.f6972a != null && !this.f6972a.ga()) {
                this.f6972a.b(b.a(view));
                this.f6976e.onAdClicked();
            } else if (this.f6973b != null && !this.f6973b.ga()) {
                this.f6973b.b(b.a(view));
                this.f6976e.onAdClicked();
            }
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to call handleClick", e2);
        }
    }

    public final void C() {
    }

    public final void D() {
        this.k = true;
    }

    public final boolean T() {
        return this.f6978g.G;
    }

    public final void a() {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(View view) {
    }

    public final void a(View view, MotionEvent motionEvent, View view2) {
    }

    public final void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.k || !this.f6978g.G) {
            b(view);
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map) {
        try {
            a a2 = b.a(view);
            if (this.f6974c != null) {
                this.f6974c.a(a2);
            } else if (this.f6972a != null) {
                this.f6972a.a(a2);
            } else if (this.f6973b != null) {
                this.f6973b.a(a2);
            }
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to call untrackView", e2);
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.j && this.f6978g.B != null) {
                this.j |= p.m().b(this.f6977f, this.f6979h.f9456a, this.f6978g.B.toString(), this.i.f8620f);
            }
            if (this.l) {
                if (this.f6974c != null && !this.f6974c.aa()) {
                    this.f6974c.z();
                    this.f6975d.I();
                } else if (this.f6972a != null && !this.f6972a.aa()) {
                    this.f6972a.z();
                    this.f6975d.I();
                } else if (this.f6973b != null && !this.f6973b.aa()) {
                    this.f6973b.z();
                    this.f6975d.I();
                }
            }
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to call recordImpression", e2);
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            a a2 = b.a(view);
            this.l = a(map, map2);
            HashMap<String, View> a3 = a(map);
            HashMap<String, View> a4 = a(map2);
            if (this.f6974c != null) {
                this.f6974c.a(a2, b.a(a3), b.a(a4));
            } else if (this.f6972a != null) {
                this.f6972a.a(a2, b.a(a3), b.a(a4));
                this.f6972a.d(a2);
            } else if (this.f6973b != null) {
                this.f6973b.a(a2, b.a(a3), b.a(a4));
                this.f6973b.d(a2);
            }
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to call trackView", e2);
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        String str;
        if (!this.k) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (!this.f6978g.G) {
            str = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted.";
        } else {
            b(view);
            return;
        }
        C1018Rk.d(str);
    }

    public final void a(Era era) {
        C1018Rk.d("Mute This Ad is not supported for 3rd party ads");
    }

    public final void a(C1724gc gcVar) {
    }

    public final void a(C3102zra zra) {
        C1018Rk.d("Mute This Ad is not supported for 3rd party ads");
    }

    public final void a(String str) {
    }

    public final JSONObject b(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    public final void b() {
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        C1018Rk.d("Mute This Ad is not supported for 3rd party ads");
    }

    public final boolean c(Bundle bundle) {
        return false;
    }

    public final void destroy() {
    }
}
