package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.b.b.b.b.c.c;
import c.b.b.b.d.f.C0344he;
import c.b.b.b.d.f.C0443wa;
import c.b.b.b.d.f.Tf;
import com.google.android.gms.common.api.internal.C0526f;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.fc  reason: case insensitive filesystem */
public class C3144fc implements C3244yc {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C3144fc f13563a;
    private long A;
    private volatile Boolean B;
    private Boolean C;
    private Boolean D;
    private int E;
    private AtomicInteger F = new AtomicInteger(0);
    private final long G;

    /* renamed from: b  reason: collision with root package name */
    private final Context f13564b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13565c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13566d;

    /* renamed from: e  reason: collision with root package name */
    private final String f13567e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f13568f;

    /* renamed from: g  reason: collision with root package name */
    private final He f13569g;

    /* renamed from: h  reason: collision with root package name */
    private final Ie f13570h;
    private final Lb i;
    private final Bb j;
    private final Zb k;
    private final Ud l;
    private final se m;
    private final C3248zb n;
    private final e o;
    private final C3191nd p;
    private final Hc q;
    private final B r;
    private final C3133dd s;
    private C3238xb t;
    private C3196od u;
    private C3159i v;
    private C3223ub w;
    private Rb x;
    private boolean y = false;
    private Boolean z;

    private C3144fc(Ic ic) {
        String str;
        Db db;
        Bundle bundle;
        boolean z2 = false;
        C0563t.a(ic);
        this.f13569g = new He(ic.f13295a);
        C3208rb.f13741a = this.f13569g;
        this.f13564b = ic.f13295a;
        this.f13565c = ic.f13296b;
        this.f13566d = ic.f13297c;
        this.f13567e = ic.f13298d;
        this.f13568f = ic.f13302h;
        this.B = ic.f13299e;
        Tf tf = ic.f13301g;
        if (!(tf == null || (bundle = tf.f4299g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.C = (Boolean) obj;
            }
            Object obj2 = tf.f4299g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.D = (Boolean) obj2;
            }
        }
        C0443wa.a(this.f13564b);
        this.o = h.d();
        this.G = this.o.a();
        this.f13570h = new Ie(this);
        Lb lb = new Lb(this);
        lb.p();
        this.i = lb;
        Bb bb = new Bb(this);
        bb.p();
        this.j = bb;
        se seVar = new se(this);
        seVar.p();
        this.m = seVar;
        C3248zb zbVar = new C3248zb(this);
        zbVar.p();
        this.n = zbVar;
        this.r = new B(this);
        C3191nd ndVar = new C3191nd(this);
        ndVar.y();
        this.p = ndVar;
        Hc hc = new Hc(this);
        hc.y();
        this.q = hc;
        Ud ud = new Ud(this);
        ud.y();
        this.l = ud;
        C3133dd ddVar = new C3133dd(this);
        ddVar.p();
        this.s = ddVar;
        Zb zb = new Zb(this);
        zb.p();
        this.k = zb;
        Tf tf2 = ic.f13301g;
        if (!(tf2 == null || tf2.f4294b == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        He he = this.f13569g;
        if (this.f13564b.getApplicationContext() instanceof Application) {
            Hc u2 = u();
            if (u2.f().getApplicationContext() instanceof Application) {
                Application application = (Application) u2.f().getApplicationContext();
                if (u2.f13283c == null) {
                    u2.f13283c = new C3127cd(u2, (Jc) null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(u2.f13283c);
                    application.registerActivityLifecycleCallbacks(u2.f13283c);
                    db = u2.h().B();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.k.a((Runnable) new C3156hc(this, ic));
        }
        db = h().w();
        str = "Application context is not an Application";
        db.a(str);
        this.k.a((Runnable) new C3156hc(this, ic));
    }

    private final C3133dd I() {
        b((C3249zc) this.s);
        return this.s;
    }

    private final void J() {
        if (!this.y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    public static C3144fc a(Context context, Tf tf) {
        Bundle bundle;
        if (tf != null && (tf.f4297e == null || tf.f4298f == null)) {
            tf = new Tf(tf.f4293a, tf.f4294b, tf.f4295c, tf.f4296d, (String) null, (String) null, tf.f4299g);
        }
        C0563t.a(context);
        C0563t.a(context.getApplicationContext());
        if (f13563a == null) {
            synchronized (C3144fc.class) {
                if (f13563a == null) {
                    f13563a = new C3144fc(new Ic(context, tf));
                }
            }
        } else if (!(tf == null || (bundle = tf.f4299g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            f13563a.a(tf.f4299g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f13563a;
    }

    public static C3144fc a(Context context, String str, String str2, Bundle bundle) {
        return a(context, new Tf(0, 0, true, (String) null, (String) null, (String) null, bundle));
    }

    /* access modifiers changed from: private */
    public final void a(Ic ic) {
        String str;
        Db db;
        g().c();
        C3159i iVar = new C3159i(this);
        iVar.p();
        this.v = iVar;
        C3223ub ubVar = new C3223ub(this, ic.f13300f);
        ubVar.y();
        this.w = ubVar;
        C3238xb xbVar = new C3238xb(this);
        xbVar.y();
        this.t = xbVar;
        C3196od odVar = new C3196od(this);
        odVar.y();
        this.u = odVar;
        this.m.q();
        this.i.q();
        this.x = new Rb(this);
        this.w.z();
        h().z().a("App measurement is starting up, version", Long.valueOf(this.f13570h.n()));
        He he = this.f13569g;
        h().z().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        He he2 = this.f13569g;
        String B2 = ubVar.B();
        if (TextUtils.isEmpty(this.f13565c)) {
            if (v().f(B2)) {
                db = h().z();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                db = h().z();
                String valueOf = String.valueOf(B2);
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
            }
            db.a(str);
        }
        h().A().a("Debug-level message logging enabled");
        if (this.E != this.F.get()) {
            h().t().a("Not all components initialized", Integer.valueOf(this.E), Integer.valueOf(this.F.get()));
        }
        this.y = true;
    }

    private static void a(C3234wc wcVar) {
        if (wcVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void b(C3137eb ebVar) {
        if (ebVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!ebVar.w()) {
            String valueOf = String.valueOf(ebVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void b(C3249zc zcVar) {
        if (zcVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zcVar.s()) {
            String valueOf = String.valueOf(zcVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final String A() {
        return this.f13566d;
    }

    public final String B() {
        return this.f13567e;
    }

    public final boolean C() {
        return this.f13568f;
    }

    public final C3191nd D() {
        b((C3137eb) this.p);
        return this.p;
    }

    public final C3196od E() {
        b((C3137eb) this.u);
        return this.u;
    }

    public final C3159i F() {
        b((C3249zc) this.v);
        return this.v;
    }

    public final C3223ub G() {
        b((C3137eb) this.w);
        return this.w;
    }

    public final B H() {
        B b2 = this.r;
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Component not created");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        g().c();
        if (p().f13337f.a() == 0) {
            p().f13337f.a(this.o.a());
        }
        if (Long.valueOf(p().k.a()).longValue() == 0) {
            h().B().a("Persisting first open", Long.valueOf(this.G));
            p().k.a(this.G);
        }
        if (m()) {
            He he = this.f13569g;
            if (!TextUtils.isEmpty(G().C()) || !TextUtils.isEmpty(G().D())) {
                v();
                if (se.a(G().C(), p().u(), G().D(), p().v())) {
                    h().z().a("Rechecking which service to use due to a GMP App Id change");
                    p().x();
                    x().B();
                    this.u.H();
                    this.u.F();
                    p().k.a(this.G);
                    p().m.a((String) null);
                }
                p().c(G().C());
                p().d(G().D());
            }
            u().a(p().m.a());
            He he2 = this.f13569g;
            if (C0344he.b() && this.f13570h.a(C3202q.Pa) && !v().y() && !TextUtils.isEmpty(p().C.a())) {
                h().w().a("Remote config removed with active feature rollouts");
                p().C.a((String) null);
            }
            if (!TextUtils.isEmpty(G().C()) || !TextUtils.isEmpty(G().D())) {
                boolean c2 = c();
                if (!p().A() && !this.f13570h.p()) {
                    p().c(!c2);
                }
                if (c2) {
                    u().I();
                }
                r().f13435d.a();
                E().a((AtomicReference<String>) new AtomicReference());
            }
        } else if (c()) {
            if (!v().d("android.permission.INTERNET")) {
                h().t().a("App is missing INTERNET permission");
            }
            if (!v().d("android.permission.ACCESS_NETWORK_STATE")) {
                h().t().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            He he3 = this.f13569g;
            if (!c.a(this.f13564b).a() && !this.f13570h.w()) {
                if (!Wb.a(this.f13564b)) {
                    h().t().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!se.a(this.f13564b, false)) {
                    h().t().a("AppMeasurementService not registered/enabled");
                }
            }
            h().t().a("Uploading is not possible. App measurement disabled");
        }
        p().u.a(this.f13570h.a(C3202q.ja));
        p().v.a(this.f13570h.a(C3202q.ka));
    }

    /* access modifiers changed from: package-private */
    public final void a(C3137eb ebVar) {
        this.E++;
    }

    /* access modifiers changed from: package-private */
    public final void a(C3249zc zcVar) {
        this.E++;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z2 = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            h().w().a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            return;
        }
        p().A.a(true);
        if (bArr.length == 0) {
            h().A().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
            String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                h().A().a("Deferred Deep Link is empty.");
                return;
            }
            se v2 = v();
            v2.a();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = v2.f().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                h().w().a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.q.a("auto", "_cmp", bundle);
            se v3 = v();
            if (!TextUtils.isEmpty(optString) && v3.a(optString, optDouble)) {
                v3.f().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e2) {
            h().t().a("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        this.B = Boolean.valueOf(z2);
    }

    public final boolean b() {
        return this.B != null && this.B.booleanValue();
    }

    public final boolean c() {
        g().c();
        J();
        if (this.f13570h.p()) {
            return false;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        Boolean y2 = p().y();
        if (y2 != null) {
            return y2.booleanValue();
        }
        Boolean q2 = this.f13570h.q();
        if (q2 != null) {
            return q2.booleanValue();
        }
        Boolean bool2 = this.C;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (C0526f.b()) {
            return false;
        }
        if (!this.f13570h.a(C3202q.Z) || this.B == null) {
            return true;
        }
        return this.B.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final long d() {
        Long valueOf = Long.valueOf(p().k.a());
        return valueOf.longValue() == 0 ? this.G : Math.min(this.G, valueOf.longValue());
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        He he = this.f13569g;
    }

    public final Context f() {
        return this.f13564b;
    }

    public final Zb g() {
        b((C3249zc) this.k);
        return this.k;
    }

    public final Bb h() {
        b((C3249zc) this.j);
        return this.j;
    }

    public final He i() {
        return this.f13569g;
    }

    public final e j() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        He he = this.f13569g;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        this.F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public final boolean m() {
        J();
        g().c();
        Boolean bool = this.z;
        if (bool == null || this.A == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.o.b() - this.A) > 1000)) {
            this.A = this.o.b();
            He he = this.f13569g;
            boolean z2 = true;
            this.z = Boolean.valueOf(v().d("android.permission.INTERNET") && v().d("android.permission.ACCESS_NETWORK_STATE") && (c.a(this.f13564b).a() || this.f13570h.w() || (Wb.a(this.f13564b) && se.a(this.f13564b, false))));
            if (this.z.booleanValue()) {
                if (!v().a(G().C(), G().D(), G().E()) && TextUtils.isEmpty(G().D())) {
                    z2 = false;
                }
                this.z = Boolean.valueOf(z2);
            }
        }
        return this.z.booleanValue();
    }

    public final void n() {
        g().c();
        b((C3249zc) I());
        String B2 = G().B();
        Pair<String, Boolean> a2 = p().a(B2);
        if (!this.f13570h.r().booleanValue() || ((Boolean) a2.second).booleanValue() || TextUtils.isEmpty((CharSequence) a2.first)) {
            h().A().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!I().t()) {
            h().w().a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            se v2 = v();
            URL a3 = v2.a(G().m().n(), B2, (String) a2.first, p().B.a() - 1);
            C3133dd I = I();
            C3132dc dcVar = new C3132dc(this);
            I.c();
            I.o();
            C0563t.a(a3);
            C0563t.a(dcVar);
            I.g().b((Runnable) new C3151gd(I, B2, a3, (byte[]) null, (Map<String, String>) null, dcVar));
        }
    }

    public final Ie o() {
        return this.f13570h;
    }

    public final Lb p() {
        a((C3234wc) this.i);
        return this.i;
    }

    public final Bb q() {
        Bb bb = this.j;
        if (bb == null || !bb.s()) {
            return null;
        }
        return this.j;
    }

    public final Ud r() {
        b((C3137eb) this.l);
        return this.l;
    }

    public final Rb s() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public final Zb t() {
        return this.k;
    }

    public final Hc u() {
        b((C3137eb) this.q);
        return this.q;
    }

    public final se v() {
        a((C3234wc) this.m);
        return this.m;
    }

    public final C3248zb w() {
        a((C3234wc) this.n);
        return this.n;
    }

    public final C3238xb x() {
        b((C3137eb) this.t);
        return this.t;
    }

    public final boolean y() {
        return TextUtils.isEmpty(this.f13565c);
    }

    public final String z() {
        return this.f13565c;
    }
}
