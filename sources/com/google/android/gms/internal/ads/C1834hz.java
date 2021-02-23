package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.T;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hz  reason: case insensitive filesystem */
public final class C1834hz implements C1085Tz {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10758a;

    /* renamed from: b  reason: collision with root package name */
    private final C1059Sz f10759b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f10760c;

    /* renamed from: d  reason: collision with root package name */
    private final VB f10761d;

    /* renamed from: e  reason: collision with root package name */
    private final C0877Lz f10762e;

    /* renamed from: f  reason: collision with root package name */
    private final Qba f10763f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C0846Ku f10764g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C2537ru f10765h;
    private final C2988yS i;
    private final C1200Yk j;
    private final SS k;
    private final C0660Dq l;
    private final C1977kA m;
    private final e n;
    private final C3037yx o;
    private final C1644fV p;
    private boolean q = false;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private Point u = new Point();
    private Point v = new Point();
    private long w = 0;
    private long x = 0;
    private C3102zra y;

    public C1834hz(Context context, C1059Sz sz, JSONObject jSONObject, VB vb, C0877Lz lz, Qba qba, C0846Ku ku, C2537ru ruVar, C2988yS ySVar, C1200Yk yk, SS ss, C0660Dq dq, C1977kA kAVar, e eVar, C3037yx yxVar, C1644fV fVVar) {
        this.f10758a = context;
        this.f10759b = sz;
        this.f10760c = jSONObject;
        this.f10761d = vb;
        this.f10762e = lz;
        this.f10763f = qba;
        this.f10764g = ku;
        this.f10765h = ruVar;
        this.i = ySVar;
        this.j = yk;
        this.k = ss;
        this.l = dq;
        this.m = kAVar;
        this.n = eVar;
        this.o = yxVar;
        this.p = fVVar;
    }

    private final void a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        C0563t.a("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f10760c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f10759b.b(this.f10762e.e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f10762e.o());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.k.i != null && this.k.i.f9915g);
            jSONObject8.put("custom_mute_enabled", !this.f10762e.j().isEmpty() && this.f10762e.r() != null);
            if (this.m.b() != null && this.f10760c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.n.a());
            if (this.t && d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f10759b.b(this.f10762e.e()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            jSONObject8.put("click_signals", b(view));
            if (((Boolean) Qqa.e().a(F.Xc)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a2 = this.n.a();
            jSONObject9.put("time_from_last_touch_down", a2 - this.w);
            jSONObject9.put("time_from_last_touch", a2 - this.x);
            jSONObject7.put("touch_signal", jSONObject9);
            C1459cl.a(this.f10761d.a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            C1018Rk.b("Unable to create click JSON.", e2);
        }
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        VB vb;
        String str2;
        C1088Uc jzVar;
        C0563t.a("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f10760c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) Qqa.e().a(F.Xb)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", T.a(this.f10758a));
            if (((Boolean) Qqa.e().a(F.Jf)).booleanValue()) {
                vb = this.f10761d;
                str2 = "/clickRecorded";
                jzVar = new C2188mz(this);
            } else {
                vb = this.f10761d;
                str2 = "/logScionEvent";
                jzVar = new C1975jz(this);
            }
            vb.a(str2, (C1088Uc<Object>) jzVar);
            this.f10761d.a("/nativeImpression", (C1088Uc<Object>) new C2117lz(this));
            C1459cl.a(this.f10761d.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z2 = this.q;
            if (z2 || this.i.B == null) {
                return true;
            }
            this.q = z2 | p.m().b(this.f10758a, this.j.f9456a, this.i.B.toString(), this.k.f8620f);
            return true;
        } catch (JSONException e2) {
            C1018Rk.b("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private final String b(View view) {
        try {
            JSONObject optJSONObject = this.f10760c.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.f10763f.a().a(this.f10758a, optJSONObject.optString("click_string"), view);
        } catch (Exception e2) {
            C1018Rk.b("Exception obtaining click signals", e2);
            return null;
        }
    }

    private final String b(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int o2 = this.f10762e.o();
        if (o2 == 1) {
            return "1099";
        }
        if (o2 == 2) {
            return "2099";
        }
        if (o2 == 3 || o2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean b(String str) {
        JSONObject optJSONObject = this.f10760c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final String c(View view) {
        if (!((Boolean) Qqa.e().a(F.Xb)).booleanValue()) {
            return null;
        }
        try {
            return this.f10763f.a().a(this.f10758a, view, (Activity) null);
        } catch (Exception unused) {
            C1018Rk.b("Exception getting data.");
            return null;
        }
    }

    private final boolean d() {
        return this.f10760c.optBoolean("allow_custom_click_gesture", false);
    }

    public final void C() {
        if (this.f10760c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.m.a();
        }
    }

    public final void D() {
        this.t = true;
    }

    public final boolean T() {
        return d();
    }

    public final void a() {
        C0563t.a("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f10760c);
            C1459cl.a(this.f10761d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            C1018Rk.a("Touch event data is null. No touch event is reported.");
        } else if (!b("touch_reporting")) {
            C1018Rk.b("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i2 = bundle.getInt("duration_ms");
            this.f10763f.a().a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i2);
        }
    }

    public final void a(View view) {
        if (!this.f10760c.optBoolean("custom_one_point_five_click_enabled", false)) {
            C1018Rk.d("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        C1977kA kAVar = this.m;
        if (view != null) {
            view.setOnClickListener(kAVar);
            view.setClickable(true);
            kAVar.f11031g = new WeakReference<>(view);
        }
    }

    public final void a(View view, MotionEvent motionEvent, View view2) {
        this.u = T.a(motionEvent, view2);
        long a2 = this.n.a();
        this.x = a2;
        if (motionEvent.getAction() == 0) {
            this.w = a2;
            this.v = this.u;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.u;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f10763f.a(obtain);
        obtain.recycle();
    }

    public final void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject a2 = T.a(this.f10758a, map, map2, view2);
        JSONObject a3 = T.a(this.f10758a, view2);
        JSONObject a4 = T.a(view2);
        JSONObject b2 = T.b(this.f10758a, view2);
        View view4 = view;
        String b3 = b(view, map);
        a(((Boolean) Qqa.e().a(F.Yb)).booleanValue() ? view3 : view4, a3, a2, a4, b2, b3, T.a(b3, this.f10758a, this.v, this.u), (JSONObject) null, z, false);
    }

    public final void a(View view, Map<String, WeakReference<View>> map) {
        this.u = new Point();
        this.v = new Point();
        this.o.b(view);
        this.r = false;
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        a(T.a(this.f10758a, view), T.a(this.f10758a, map, map2, view), T.a(view), T.b(this.f10758a, view), c(view), (JSONObject) null, T.a(this.f10758a, this.i));
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.u = new Point();
        this.v = new Point();
        if (!this.r) {
            this.o.a(view);
            this.r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.l.a((Object) this);
        boolean a2 = T.a(this.j.f9458c);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (a2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (a2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view2 = view;
        Map<String, WeakReference<View>> map3 = map;
        if (!this.t) {
            C1018Rk.a("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!d()) {
            C1018Rk.a("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            Map<String, WeakReference<View>> map4 = map2;
            JSONObject a2 = T.a(this.f10758a, map, map2, view);
            JSONObject a3 = T.a(this.f10758a, view);
            JSONObject a4 = T.a(view);
            JSONObject b2 = T.b(this.f10758a, view);
            String b3 = b((View) null, map);
            a(view, a3, a2, a4, b2, b3, T.a(b3, this.f10758a, this.v, this.u), (JSONObject) null, z, true);
        }
    }

    public final void a(Era era) {
        try {
            if (!this.s) {
                if (era != null || this.f10762e.r() == null) {
                    this.s = true;
                    this.p.a(era.wa());
                    c();
                    return;
                }
                this.s = true;
                this.p.a(this.f10762e.r().wa());
                c();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(C1724gc gcVar) {
        if (!this.f10760c.optBoolean("custom_one_point_five_click_enabled", false)) {
            C1018Rk.d("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.m.a(gcVar);
        }
    }

    public final void a(C3102zra zra) {
        this.y = zra;
    }

    public final void a(String str) {
        a((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final JSONObject b(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject a2 = T.a(this.f10758a, map, map2, view);
        JSONObject a3 = T.a(this.f10758a, view);
        JSONObject a4 = T.a(view);
        JSONObject b2 = T.b(this.f10758a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", a2);
            jSONObject.put("ad_view_signal", a3);
            jSONObject.put("scroll_view_signal", a4);
            jSONObject.put("lock_screen_signal", b2);
            return jSONObject;
        } catch (JSONException e2) {
            C1018Rk.b("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    public final void b() {
        a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            C1018Rk.a("Click data is null. No click is reported.");
        } else if (!b("click_reporting")) {
            C1018Rk.b("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            a((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, p.c().a(bundle, (JSONObject) null), false, false);
        }
    }

    public final void c() {
        try {
            if (this.y != null) {
                this.y.Ha();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final boolean c(Bundle bundle) {
        if (!b("impression_reporting")) {
            C1018Rk.b("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, p.c().a(bundle, (JSONObject) null), false);
    }

    public final void destroy() {
        this.f10761d.a();
    }
}
