package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.d.f.Ge;
import c.b.b.b.d.f.Hf;
import c.b.b.b.d.f.Qf;
import c.b.b.b.d.f.Rf;
import c.b.b.b.d.f.Tf;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends Ge {

    /* renamed from: a  reason: collision with root package name */
    C3144fc f13179a = null;

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, Ec> f13180b = new b.e.b();

    class a implements Gc {

        /* renamed from: a  reason: collision with root package name */
        private Qf f13181a;

        a(Qf qf) {
            this.f13181a = qf;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f13181a.a(str, str2, bundle, j);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f13179a.h().w().a("Event interceptor threw exception", e2);
            }
        }
    }

    class b implements Ec {

        /* renamed from: a  reason: collision with root package name */
        private Qf f13183a;

        b(Qf qf) {
            this.f13183a = qf;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f13183a.a(str, str2, bundle, j);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f13179a.h().w().a("Event listener threw exception", e2);
            }
        }
    }

    private final void a() {
        if (this.f13179a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void a(Hf hf, String str) {
        this.f13179a.v().a(hf, str);
    }

    public void beginAdUnitExposure(String str, long j) {
        a();
        this.f13179a.H().a(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        this.f13179a.u().c(str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) {
        a();
        this.f13179a.H().b(str, j);
    }

    public void generateEventId(Hf hf) {
        a();
        this.f13179a.v().a(hf, this.f13179a.v().t());
    }

    public void getAppInstanceId(Hf hf) {
        a();
        this.f13179a.g().a((Runnable) new C3139ed(this, hf));
    }

    public void getCachedAppInstanceId(Hf hf) {
        a();
        a(hf, this.f13179a.u().H());
    }

    public void getConditionalUserProperties(String str, String str2, Hf hf) {
        a();
        this.f13179a.g().a((Runnable) new Fd(this, hf, str, str2));
    }

    public void getCurrentScreenClass(Hf hf) {
        a();
        a(hf, this.f13179a.u().K());
    }

    public void getCurrentScreenName(Hf hf) {
        a();
        a(hf, this.f13179a.u().J());
    }

    public void getGmpAppId(Hf hf) {
        a();
        a(hf, this.f13179a.u().L());
    }

    public void getMaxUserProperties(String str, Hf hf) {
        a();
        this.f13179a.u();
        C0563t.b(str);
        this.f13179a.v().a(hf, 25);
    }

    public void getTestFlag(Hf hf, int i) {
        a();
        if (i == 0) {
            this.f13179a.v().a(hf, this.f13179a.u().D());
        } else if (i == 1) {
            this.f13179a.v().a(hf, this.f13179a.u().E().longValue());
        } else if (i == 2) {
            se v = this.f13179a.v();
            double doubleValue = this.f13179a.u().G().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                hf.c(bundle);
            } catch (RemoteException e2) {
                v.f13807a.h().w().a("Error returning double value to wrapper", e2);
            }
        } else if (i == 3) {
            this.f13179a.v().a(hf, this.f13179a.u().F().intValue());
        } else if (i == 4) {
            this.f13179a.v().a(hf, this.f13179a.u().C().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, Hf hf) {
        a();
        this.f13179a.g().a((Runnable) new C3146fe(this, hf, str, str2, z));
    }

    public void initForTests(Map map) {
        a();
    }

    public void initialize(c.b.b.b.c.a aVar, Tf tf, long j) {
        Context context = (Context) c.b.b.b.c.b.Q(aVar);
        C3144fc fcVar = this.f13179a;
        if (fcVar == null) {
            this.f13179a = C3144fc.a(context, tf);
        } else {
            fcVar.h().w().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(Hf hf) {
        a();
        this.f13179a.g().a((Runnable) new we(this, hf));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        a();
        this.f13179a.u().a(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, Hf hf, long j) {
        a();
        C0563t.b(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f13179a.g().a((Runnable) new Fc(this, hf, new C3192o(str2, new C3187n(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, c.b.b.b.c.a aVar, c.b.b.b.c.a aVar2, c.b.b.b.c.a aVar3) {
        a();
        Object obj = null;
        Object Q = aVar == null ? null : c.b.b.b.c.b.Q(aVar);
        Object Q2 = aVar2 == null ? null : c.b.b.b.c.b.Q(aVar2);
        if (aVar3 != null) {
            obj = c.b.b.b.c.b.Q(aVar3);
        }
        this.f13179a.h().a(i, true, false, str, Q, Q2, obj);
    }

    public void onActivityCreated(c.b.b.b.c.a aVar, Bundle bundle, long j) {
        a();
        C3127cd cdVar = this.f13179a.u().f13283c;
        if (cdVar != null) {
            this.f13179a.u().B();
            cdVar.onActivityCreated((Activity) c.b.b.b.c.b.Q(aVar), bundle);
        }
    }

    public void onActivityDestroyed(c.b.b.b.c.a aVar, long j) {
        a();
        C3127cd cdVar = this.f13179a.u().f13283c;
        if (cdVar != null) {
            this.f13179a.u().B();
            cdVar.onActivityDestroyed((Activity) c.b.b.b.c.b.Q(aVar));
        }
    }

    public void onActivityPaused(c.b.b.b.c.a aVar, long j) {
        a();
        C3127cd cdVar = this.f13179a.u().f13283c;
        if (cdVar != null) {
            this.f13179a.u().B();
            cdVar.onActivityPaused((Activity) c.b.b.b.c.b.Q(aVar));
        }
    }

    public void onActivityResumed(c.b.b.b.c.a aVar, long j) {
        a();
        C3127cd cdVar = this.f13179a.u().f13283c;
        if (cdVar != null) {
            this.f13179a.u().B();
            cdVar.onActivityResumed((Activity) c.b.b.b.c.b.Q(aVar));
        }
    }

    public void onActivitySaveInstanceState(c.b.b.b.c.a aVar, Hf hf, long j) {
        a();
        C3127cd cdVar = this.f13179a.u().f13283c;
        Bundle bundle = new Bundle();
        if (cdVar != null) {
            this.f13179a.u().B();
            cdVar.onActivitySaveInstanceState((Activity) c.b.b.b.c.b.Q(aVar), bundle);
        }
        try {
            hf.c(bundle);
        } catch (RemoteException e2) {
            this.f13179a.h().w().a("Error returning bundle value to wrapper", e2);
        }
    }

    public void onActivityStarted(c.b.b.b.c.a aVar, long j) {
        a();
        C3127cd cdVar = this.f13179a.u().f13283c;
        if (cdVar != null) {
            this.f13179a.u().B();
            cdVar.onActivityStarted((Activity) c.b.b.b.c.b.Q(aVar));
        }
    }

    public void onActivityStopped(c.b.b.b.c.a aVar, long j) {
        a();
        C3127cd cdVar = this.f13179a.u().f13283c;
        if (cdVar != null) {
            this.f13179a.u().B();
            cdVar.onActivityStopped((Activity) c.b.b.b.c.b.Q(aVar));
        }
    }

    public void performAction(Bundle bundle, Hf hf, long j) {
        a();
        hf.c((Bundle) null);
    }

    public void registerOnMeasurementEventListener(Qf qf) {
        a();
        Ec ec = this.f13180b.get(Integer.valueOf(qf.a()));
        if (ec == null) {
            ec = new b(qf);
            this.f13180b.put(Integer.valueOf(qf.a()), ec);
        }
        this.f13179a.u().a(ec);
    }

    public void resetAnalyticsData(long j) {
        a();
        this.f13179a.u().c(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        a();
        if (bundle == null) {
            this.f13179a.h().t().a("Conditional user property must not be null");
        } else {
            this.f13179a.u().a(bundle, j);
        }
    }

    public void setCurrentScreen(c.b.b.b.c.a aVar, String str, String str2, long j) {
        a();
        this.f13179a.D().a((Activity) c.b.b.b.c.b.Q(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        a();
        this.f13179a.u().b(z);
    }

    public void setEventInterceptor(Qf qf) {
        a();
        Hc u = this.f13179a.u();
        a aVar = new a(qf);
        u.a();
        u.x();
        u.g().a((Runnable) new Oc(u, aVar));
    }

    public void setInstanceIdProvider(Rf rf) {
        a();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        a();
        this.f13179a.u().a(z);
    }

    public void setMinimumSessionDuration(long j) {
        a();
        this.f13179a.u().a(j);
    }

    public void setSessionTimeoutDuration(long j) {
        a();
        this.f13179a.u().b(j);
    }

    public void setUserId(String str, long j) {
        a();
        this.f13179a.u().a((String) null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, c.b.b.b.c.a aVar, boolean z, long j) {
        a();
        this.f13179a.u().a(str, str2, c.b.b.b.c.b.Q(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(Qf qf) {
        a();
        Ec remove = this.f13180b.remove(Integer.valueOf(qf.a()));
        if (remove == null) {
            remove = new b(qf);
        }
        this.f13179a.u().b(remove);
    }
}
