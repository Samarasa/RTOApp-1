package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import b.e.b;
import c.b.b.b.d.f.C0344he;
import c.b.b.b.d.f.C0407qf;
import c.b.b.b.d.f.C0467ze;
import com.google.android.gms.common.api.internal.C0526f;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class Hc extends C3137eb {

    /* renamed from: c  reason: collision with root package name */
    protected C3127cd f13283c;

    /* renamed from: d  reason: collision with root package name */
    private Gc f13284d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Ec> f13285e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f13286f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<String> f13287g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    protected boolean f13288h = true;

    protected Hc(C3144fc fcVar) {
        super(fcVar);
    }

    /* access modifiers changed from: private */
    public final void M() {
        Long valueOf;
        if (m().a(C3202q.da)) {
            c();
            String a2 = l().t.a();
            if (a2 != null) {
                if ("unset".equals(a2)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf("true".equals(a2) ? 1 : 0);
                }
                a("app", "_npa", (Object) valueOf, j().a());
            }
        }
        if (!this.f13807a.c() || !this.f13288h) {
            h().A().a("Updating Scion state (FE)");
            r().C();
            return;
        }
        h().A().a("Recording app launch after enabling measurement for the first time (FE)");
        I();
        if (C0467ze.b() && m().a(C3202q.Qa)) {
            u().f13435d.a();
        }
    }

    private final void a(String str, String str2, long j, Object obj) {
        g().a((Runnable) new Lc(this, str, str2, obj, j));
    }

    private final ArrayList<Bundle> b(String str, String str2, String str3) {
        if (g().t()) {
            h().t().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (He.a()) {
            h().t().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f13807a.g().a(atomicReference, 5000, "get conditional user properties", new Tc(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return se.b((List<Ge>) list);
            }
            h().w().a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    private final Map<String, Object> b(String str, String str2, String str3, boolean z) {
        Db w;
        String str4;
        if (g().t()) {
            w = h().t();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (He.a()) {
            w = h().t();
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f13807a.g().a(atomicReference, 5000, "get user properties", new Vc(this, atomicReference, str, str2, str3, z));
            List<re> list = (List) atomicReference.get();
            if (list == null) {
                w = h().w();
                str4 = "Timed out waiting for handle get user properties";
            } else {
                b bVar = new b(list.size());
                for (re reVar : list) {
                    bVar.put(reVar.f13747b, reVar.a());
                }
                return bVar;
            }
        }
        w.a(str4);
        return Collections.emptyMap();
    }

    private final void b(Bundle bundle, long j) {
        C0563t.a(bundle);
        Bc.a(bundle, "app_id", String.class, null);
        Bc.a(bundle, "origin", String.class, null);
        Bc.a(bundle, "name", String.class, null);
        Bc.a(bundle, "value", Object.class, null);
        Bc.a(bundle, "trigger_event_name", String.class, null);
        Bc.a(bundle, "trigger_timeout", Long.class, 0L);
        Bc.a(bundle, "timed_out_event_name", String.class, null);
        Bc.a(bundle, "timed_out_event_params", Bundle.class, null);
        Bc.a(bundle, "triggered_event_name", String.class, null);
        Bc.a(bundle, "triggered_event_params", Bundle.class, null);
        Bc.a(bundle, "time_to_live", Long.class, 0L);
        Bc.a(bundle, "expired_event_name", String.class, null);
        Bc.a(bundle, "expired_event_params", Bundle.class, null);
        C0563t.b(bundle.getString("name"));
        C0563t.b(bundle.getString("origin"));
        C0563t.a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (k().c(string) != 0) {
            h().t().a("Invalid conditional user property name", e().c(string));
        } else if (k().b(string, obj) != 0) {
            h().t().a("Invalid conditional user property value", e().c(string), obj);
        } else {
            Object c2 = k().c(string, obj);
            if (c2 == null) {
                h().t().a("Unable to normalize conditional user property value", e().c(string), obj);
                return;
            }
            Bc.a(bundle, c2);
            long j2 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong("time_to_live");
                if (j3 > 15552000000L || j3 < 1) {
                    h().t().a("Invalid conditional user property time to live", e().c(string), Long.valueOf(j3));
                } else {
                    g().a((Runnable) new Rc(this, bundle));
                }
            } else {
                h().t().a("Invalid conditional user property timeout", e().c(string), Long.valueOf(j2));
            }
        }
    }

    private final void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        g().a((Runnable) new Mc(this, str, str2, j, se.b(bundle), z, z2, z3, str3));
    }

    private final void b(String str, String str2, String str3, Bundle bundle) {
        long a2 = j().a();
        C0563t.b(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", a2);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        g().a((Runnable) new Qc(this, bundle2));
    }

    /* access modifiers changed from: private */
    public final void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        c();
        x();
        C0563t.a(bundle);
        C0563t.b(bundle2.getString("name"));
        C0563t.b(bundle2.getString("origin"));
        C0563t.a(bundle2.get("value"));
        if (!this.f13807a.c()) {
            h().A().a("Conditional property not sent since collection is disabled");
            return;
        }
        re reVar = new re(bundle2.getString("name"), bundle2.getLong("triggered_timestamp"), bundle2.get("value"), bundle2.getString("origin"));
        try {
            C3192o a2 = k().a(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString("origin"), 0, true, false);
            r().a(new Ge(bundle2.getString("app_id"), bundle2.getString("origin"), reVar, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), k().a(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString("origin"), 0, true, false), bundle2.getLong("trigger_timeout"), a2, bundle2.getLong("time_to_live"), k().a(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        c();
        x();
        C0563t.a(bundle);
        C0563t.b(bundle2.getString("name"));
        if (!this.f13807a.c()) {
            h().A().a("Conditional property not cleared since collection is disabled");
            return;
        }
        re reVar = new re(bundle2.getString("name"), 0, (Object) null, (String) null);
        try {
            C3192o a2 = k().a(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true, false);
            re reVar2 = reVar;
            r().a(new Ge(bundle2.getString("app_id"), bundle2.getString("origin"), reVar2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), (C3192o) null, bundle2.getLong("trigger_timeout"), (C3192o) null, bundle2.getLong("time_to_live"), a2));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void d(boolean z) {
        c();
        a();
        x();
        h().A().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        l().b(z);
        M();
    }

    /* access modifiers changed from: protected */
    public final boolean A() {
        return false;
    }

    public final void B() {
        if (f().getApplicationContext() instanceof Application) {
            ((Application) f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f13283c);
        }
    }

    public final Boolean C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) g().a(atomicReference, 15000, "boolean test flag value", new Jc(this, atomicReference));
    }

    public final String D() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) g().a(atomicReference, 15000, "String test flag value", new Sc(this, atomicReference));
    }

    public final Long E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) g().a(atomicReference, 15000, "long test flag value", new Uc(this, atomicReference));
    }

    public final Integer F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) g().a(atomicReference, 15000, "int test flag value", new Xc(this, atomicReference));
    }

    public final Double G() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) g().a(atomicReference, 15000, "double test flag value", new Wc(this, atomicReference));
    }

    public final String H() {
        a();
        return this.f13287g.get();
    }

    public final void I() {
        c();
        a();
        x();
        if (this.f13807a.m()) {
            if (m().a(C3202q.xa)) {
                Ie m = m();
                m.i();
                Boolean b2 = m.b("google_analytics_deferred_deep_link_enabled");
                if (b2 != null && b2.booleanValue()) {
                    h().A().a("Deferred Deep Link feature enabled.");
                    g().a((Runnable) new Kc(this));
                }
            }
            r().E();
            this.f13288h = false;
            String z = l().z();
            if (!TextUtils.isEmpty(z)) {
                d().o();
                if (!z.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", z);
                    a("auto", "_ou", bundle);
                }
            }
        }
    }

    public final String J() {
        C3175kd C = this.f13807a.D().C();
        if (C != null) {
            return C.f13637a;
        }
        return null;
    }

    public final String K() {
        C3175kd C = this.f13807a.D().C();
        if (C != null) {
            return C.f13638b;
        }
        return null;
    }

    public final String L() {
        if (this.f13807a.z() != null) {
            return this.f13807a.z();
        }
        try {
            return C0526f.a();
        } catch (IllegalStateException e2) {
            this.f13807a.h().t().a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final ArrayList<Bundle> a(String str, String str2) {
        a();
        return b((String) null, str, str2);
    }

    public final ArrayList<Bundle> a(String str, String str2, String str3) {
        C0563t.b(str);
        n();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        C0563t.b(str);
        n();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        a();
        return b((String) null, str, str2, z);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(long j) {
        a();
        g().a((Runnable) new C3115ad(this, j));
    }

    public final void a(Bundle bundle) {
        a(bundle, j().a());
    }

    public final void a(Bundle bundle, long j) {
        C0563t.a(bundle);
        a();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            h().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        b(bundle2, j);
    }

    public final void a(Ec ec) {
        a();
        x();
        C0563t.a(ec);
        if (!this.f13285e.add(ec)) {
            h().w().a("OnEventListener already registered");
        }
    }

    public final void a(Gc gc) {
        Gc gc2;
        c();
        a();
        x();
        if (!(gc == null || gc == (gc2 = this.f13284d))) {
            C0563t.b(gc2 == null, "EventInterceptor already set.");
        }
        this.f13284d = gc;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.f13287g.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, long j, Bundle bundle) {
        a();
        c();
        a(str, str2, j, bundle, true, this.f13284d == null || se.e(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C3175kd kdVar;
        int i;
        long j2;
        ArrayList arrayList;
        Bundle bundle2;
        boolean z4;
        List<String> H;
        String str9 = str;
        String str10 = str2;
        long j3 = j;
        Bundle bundle3 = bundle;
        C0563t.b(str);
        C0563t.a(bundle);
        c();
        x();
        if (!this.f13807a.c()) {
            h().A().a("Event not sent since app measurement is disabled");
        } else if (!m().a(C3202q.ma) || (H = q().H()) == null || H.contains(str10)) {
            int i2 = 0;
            if (!this.f13286f) {
                this.f13286f = true;
                try {
                    try {
                        (!this.f13807a.C() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, f().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{f()});
                    } catch (Exception e2) {
                        h().w().a("Failed to invoke Tag Manager's initialize() method", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    h().z().a("Tag Manager is not found and thus will not be used");
                }
            }
            if (m().a(C3202q.za) && "_cmp".equals(str10) && bundle3.containsKey("gclid")) {
                a("auto", "_lgclid", (Object) bundle3.getString("gclid"), j().a());
            }
            if (z3) {
                i();
                if (!"_iap".equals(str10)) {
                    se v = this.f13807a.v();
                    int i3 = 2;
                    if (v.a("event", str10)) {
                        if (!v.a("event", Ac.f13163a, str10)) {
                            i3 = 13;
                        } else if (v.a("event", 40, str10)) {
                            i3 = 0;
                        }
                    }
                    if (i3 != 0) {
                        h().v().a("Invalid public event name. Event will not be logged (FE)", e().a(str10));
                        this.f13807a.v();
                        this.f13807a.v().a(i3, "_ev", se.a(str10, 40, true), str10 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            i();
            C3175kd B = s().B();
            if (B != null && !bundle3.containsKey("_sc")) {
                B.f13640d = true;
            }
            C3191nd.a(B, bundle3, z && z3);
            boolean equals = "am".equals(str9);
            boolean e3 = se.e(str2);
            if (z && this.f13284d != null && !e3 && !equals) {
                h().A().a("Passing event to registered event handler (FE)", e().a(str10), e().a(bundle3));
                this.f13284d.a(str, str2, bundle, j);
            } else if (this.f13807a.m()) {
                int b2 = k().b(str10);
                if (b2 != 0) {
                    h().v().a("Invalid event name. Event will not be logged (FE)", e().a(str10));
                    k();
                    String a2 = se.a(str10, 40, true);
                    if (str10 != null) {
                        i2 = str2.length();
                    }
                    this.f13807a.v().a(str3, b2, "_ev", a2, i2);
                    return;
                }
                List a3 = f.a((T[]) new String[]{"_o", "_sn", "_sc", "_si"});
                String str11 = str10;
                Bundle a4 = k().a(str3, str2, bundle, a3, z3, true);
                C3175kd kdVar2 = (a4 == null || !a4.containsKey("_sc") || !a4.containsKey("_si")) ? null : new C3175kd(a4.getString("_sn"), a4.getString("_sc"), Long.valueOf(a4.getLong("_si")).longValue());
                C3175kd kdVar3 = kdVar2 == null ? B : kdVar2;
                String str12 = "_ae";
                if (m().a(C3202q.aa)) {
                    i();
                    if (s().B() != null && str12.equals(str11)) {
                        long b3 = u().f13436e.b();
                        if (b3 > 0) {
                            k().a(a4, b3);
                        }
                    }
                }
                if (C0344he.b() && m().a(C3202q.Pa)) {
                    if (!"auto".equals(str9) && "_ssr".equals(str11)) {
                        se k = k();
                        String string = a4.getString("_ffr");
                        String trim = q.b(string) ? null : string.trim();
                        if (se.c(trim, k.l().C.a())) {
                            k.h().A().a("Not logging duplicate session_start_with_rollout event");
                            z4 = false;
                        } else {
                            k.l().C.a(trim);
                            z4 = true;
                        }
                        if (!z4) {
                            return;
                        }
                    } else if (str12.equals(str11)) {
                        String a5 = k().l().C.a();
                        if (!TextUtils.isEmpty(a5)) {
                            a4.putString("_ffr", a5);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(a4);
                long nextLong = k().u().nextLong();
                if (!m().a(C3202q.U) || l().w.a() <= 0 || !l().a(j) || !l().z.a()) {
                    str4 = "_o";
                } else {
                    h().B().a("Current session is expired, remove the session number, ID, and engagement time");
                    if (m().a(C3202q.R)) {
                        str4 = "_o";
                        a("auto", "_sid", (Object) null, j().a());
                    } else {
                        str4 = "_o";
                    }
                    if (m().a(C3202q.S)) {
                        a("auto", "_sno", (Object) null, j().a());
                    }
                    if (C0407qf.b() && m().a(C3202q.ra)) {
                        a("auto", "_se", (Object) null, j().a());
                    }
                }
                if (!m().a(C3202q.T) || a4.getLong("extend_session", 0) != 1) {
                    long j4 = j;
                    str5 = str11;
                } else {
                    h().B().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    str5 = str11;
                    this.f13807a.r().f13435d.a(j, true);
                }
                String[] strArr = (String[]) a4.keySet().toArray(new String[bundle.size()]);
                Arrays.sort(strArr);
                int length = strArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    String str13 = strArr[i5];
                    Object obj = a4.get(str13);
                    k();
                    String[] strArr2 = strArr;
                    Bundle[] a6 = se.a(obj);
                    if (a6 != null) {
                        a4.putInt(str13, a6.length);
                        int i7 = 0;
                        while (i7 < a6.length) {
                            Bundle bundle4 = a6[i7];
                            C3191nd.a(kdVar3, bundle4, true);
                            int i8 = i4;
                            long j5 = nextLong;
                            Bundle bundle5 = bundle4;
                            ArrayList arrayList3 = arrayList2;
                            Bundle a7 = k().a(str3, "_ep", bundle5, a3, z3, false);
                            a7.putString("_en", str5);
                            a7.putLong("_eid", j5);
                            a7.putString("_gn", str13);
                            a7.putInt("_ll", a6.length);
                            a7.putInt("_i", i7);
                            arrayList3.add(a7);
                            i7++;
                            a4 = a4;
                            arrayList2 = arrayList3;
                            nextLong = j5;
                            i5 = i5;
                            kdVar3 = kdVar3;
                            str12 = str12;
                            i4 = i8;
                            String str14 = str;
                        }
                        kdVar = kdVar3;
                        i = i5;
                        j2 = nextLong;
                        arrayList = arrayList2;
                        str8 = str12;
                        bundle2 = a4;
                        i4 += a6.length;
                    } else {
                        kdVar = kdVar3;
                        int i9 = i4;
                        i = i5;
                        j2 = nextLong;
                        arrayList = arrayList2;
                        str8 = str12;
                        bundle2 = a4;
                    }
                    i5 = i + 1;
                    strArr = strArr2;
                    a4 = bundle2;
                    arrayList2 = arrayList;
                    nextLong = j2;
                    length = i6;
                    kdVar3 = kdVar;
                    str12 = str8;
                    String str15 = str;
                    long j6 = j;
                }
                int i10 = i4;
                long j7 = nextLong;
                ArrayList arrayList4 = arrayList2;
                String str16 = str12;
                Bundle bundle6 = a4;
                if (i10 != 0) {
                    bundle6.putLong("_eid", j7);
                    bundle6.putInt("_epc", i10);
                }
                int i11 = 0;
                while (i11 < arrayList4.size()) {
                    Bundle bundle7 = (Bundle) arrayList4.get(i11);
                    if (i11 != 0) {
                        str7 = "_ep";
                        str6 = str;
                    } else {
                        str6 = str;
                        str7 = str5;
                    }
                    String str17 = str4;
                    bundle7.putString(str17, str6);
                    if (z2) {
                        bundle7 = k().a(bundle7);
                    }
                    Bundle bundle8 = bundle7;
                    h().A().a("Logging event (FE)", e().a(str5), e().a(bundle8));
                    ArrayList arrayList5 = arrayList4;
                    String str18 = str5;
                    r().a(new C3192o(str7, new C3187n(bundle8), str, j), str3);
                    if (!equals) {
                        for (Ec a8 : this.f13285e) {
                            a8.a(str, str2, new Bundle(bundle8), j);
                        }
                    }
                    i11++;
                    str4 = str17;
                    arrayList4 = arrayList5;
                    str5 = str18;
                }
                String str19 = str5;
                i();
                if (s().B() != null && str16.equals(str19)) {
                    u().a(true, true);
                }
            }
        } else {
            h().A().a("Dropping non-safelisted event. event name, origin", str10, str9);
        }
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, j().a());
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        boolean z3;
        a();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (z2) {
            if (this.f13284d != null && !se.e(str2)) {
                z3 = false;
                b(str3, str2, j, bundle2, z2, z3, !z, (String) null);
            }
        }
        z3 = true;
        b(str3, str2, j, bundle2, z2, z3, !z, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r9)
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r10)
            r8.c()
            r8.a()
            r8.x()
            com.google.android.gms.measurement.internal.Ie r0 = r8.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C3202q.da
            boolean r0 = r0.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r1)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x006f
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x005f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x005f
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0044
            r4 = r2
            goto L_0x0046
        L_0x0044:
            r4 = 0
        L_0x0046:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.Lb r0 = r8.l()
            com.google.android.gms.measurement.internal.Sb r0 = r0.t
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x005a
            java.lang.String r11 = "true"
        L_0x005a:
            r0.a(r11)
            r6 = r10
            goto L_0x006d
        L_0x005f:
            if (r11 != 0) goto L_0x006f
            com.google.android.gms.measurement.internal.Lb r10 = r8.l()
            com.google.android.gms.measurement.internal.Sb r10 = r10.t
            java.lang.String r0 = "unset"
            r10.a(r0)
            r6 = r11
        L_0x006d:
            r3 = r1
            goto L_0x0071
        L_0x006f:
            r3 = r10
            r6 = r11
        L_0x0071:
            com.google.android.gms.measurement.internal.fc r10 = r8.f13807a
            boolean r10 = r10.c()
            if (r10 != 0) goto L_0x0087
            com.google.android.gms.measurement.internal.Bb r9 = r8.h()
            com.google.android.gms.measurement.internal.Db r9 = r9.A()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.fc r10 = r8.f13807a
            boolean r10 = r10.m()
            if (r10 != 0) goto L_0x0090
            return
        L_0x0090:
            com.google.android.gms.measurement.internal.Bb r10 = r8.h()
            com.google.android.gms.measurement.internal.Db r10 = r10.A()
            com.google.android.gms.measurement.internal.zb r11 = r8.e()
            java.lang.String r11 = r11.a((java.lang.String) r3)
            java.lang.String r0 = "Setting user property (FE)"
            r10.a(r0, r11, r6)
            com.google.android.gms.measurement.internal.re r10 = new com.google.android.gms.measurement.internal.re
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.od r9 = r8.r()
            r9.a((com.google.android.gms.measurement.internal.re) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Hc.a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        a(str, str2, obj, z, j().a());
    }

    public final void a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = k().c(str2);
        } else {
            se k = k();
            if (k.a("user property", str2)) {
                if (!k.a("user property", Cc.f13202a, str2)) {
                    i = 15;
                } else if (k.a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            k();
            String a2 = se.a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f13807a.v().a(i, "_ev", a2, i2);
        } else if (obj != null) {
            int b2 = k().b(str2, obj);
            if (b2 != 0) {
                k();
                String a3 = se.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f13807a.v().a(b2, "_ev", a3, i2);
                return;
            }
            Object c2 = k().c(str2, obj);
            if (c2 != null) {
                a(str3, str2, j, c2);
            }
        } else {
            a(str3, str2, j, (Object) null);
        }
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        C0563t.b(str);
        n();
        throw null;
    }

    public final void a(boolean z) {
        x();
        a();
        g().a((Runnable) new Zc(this, z));
    }

    public final void b(long j) {
        a();
        g().a((Runnable) new _c(this, j));
    }

    public final void b(Bundle bundle) {
        C0563t.a(bundle);
        C0563t.b(bundle.getString("app_id"));
        n();
        throw null;
    }

    public final void b(Ec ec) {
        a();
        x();
        C0563t.a(ec);
        if (!this.f13285e.remove(ec)) {
            h().w().a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2, Bundle bundle) {
        a();
        c();
        a(str, str2, j().a(), bundle);
    }

    public final void b(boolean z) {
        x();
        a();
        g().a((Runnable) new Yc(this, z));
    }

    public final List<re> c(boolean z) {
        Db w;
        String str;
        a();
        x();
        h().A().a("Fetching user attributes (FE)");
        if (g().t()) {
            w = h().t();
            str = "Cannot get all user properties from analytics worker thread";
        } else if (He.a()) {
            w = h().t();
            str = "Cannot get all user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f13807a.g().a(atomicReference, 5000, "get user properties", new Nc(this, atomicReference, z));
            List<re> list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            w = h().w();
            str = "Timed out waiting for get user properties";
        }
        w.a(str);
        return Collections.emptyList();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final void c(long j) {
        a((String) null);
        g().a((Runnable) new Pc(this, j));
    }

    public final void c(String str, String str2, Bundle bundle) {
        a();
        b((String) null, str, str2, bundle);
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
        throw null;
    }

    public final /* bridge */ /* synthetic */ C3223ub q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C3196od r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ C3191nd s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ Ud u() {
        return super.u();
    }
}
