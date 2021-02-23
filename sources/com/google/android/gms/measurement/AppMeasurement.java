package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import b.e.b;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.measurement.internal.Bc;
import com.google.android.gms.measurement.internal.C3144fc;
import com.google.android.gms.measurement.internal.C3145fd;
import com.google.android.gms.measurement.internal.re;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: a  reason: collision with root package name */
    private static volatile AppMeasurement f13146a;

    /* renamed from: b  reason: collision with root package name */
    private final C3144fc f13147b;

    /* renamed from: c  reason: collision with root package name */
    private final C3145fd f13148c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13149d;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        private ConditionalUserProperty(Bundle bundle) {
            C0563t.a(bundle);
            this.mAppId = (String) Bc.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) Bc.a(bundle, "origin", String.class, null);
            this.mName = (String) Bc.a(bundle, "name", String.class, null);
            this.mValue = Bc.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) Bc.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) Bc.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) Bc.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) Bc.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) Bc.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) Bc.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) Bc.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) Bc.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) Bc.a(bundle, "expired_event_params", Bundle.class, null);
        }

        /* access modifiers changed from: private */
        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                Bc.a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    private AppMeasurement(C3144fc fcVar) {
        C0563t.a(fcVar);
        this.f13147b = fcVar;
        this.f13148c = null;
        this.f13149d = false;
    }

    private AppMeasurement(C3145fd fdVar) {
        C0563t.a(fdVar);
        this.f13148c = fdVar;
        this.f13147b = null;
        this.f13149d = true;
    }

    public static AppMeasurement a(Context context, Bundle bundle) {
        if (f13146a == null) {
            synchronized (AppMeasurement.class) {
                if (f13146a == null) {
                    C3145fd b2 = b(context, bundle);
                    if (b2 != null) {
                        f13146a = new AppMeasurement(b2);
                    } else {
                        f13146a = new AppMeasurement(C3144fc.a(context, (String) null, (String) null, bundle));
                    }
                }
            }
        }
        return f13146a;
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f13146a == null) {
            synchronized (AppMeasurement.class) {
                if (f13146a == null) {
                    C3145fd b2 = b(context, (Bundle) null);
                    if (b2 != null) {
                        f13146a = new AppMeasurement(b2);
                    } else {
                        f13146a = new AppMeasurement(C3144fc.a(context, (String) null, (String) null, (Bundle) null));
                    }
                }
            }
        }
        return f13146a;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.C3145fd b(android.content.Context r8, android.os.Bundle r9) {
        /*
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getScionFrontendApiImplementation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{  }
            r2[r6] = r8     // Catch:{  }
            r2[r7] = r9     // Catch:{  }
            java.lang.Object r8 = r0.invoke(r1, r2)     // Catch:{  }
            com.google.android.gms.measurement.internal.fd r8 = (com.google.android.gms.measurement.internal.C3145fd) r8     // Catch:{  }
            return r8
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.fd");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    public Map<String, Object> a(boolean z) {
        if (this.f13149d) {
            return this.f13148c.a((String) null, (String) null, z);
        }
        List<re> c2 = this.f13147b.u().c(z);
        b bVar = new b(c2.size());
        for (re next : c2) {
            bVar.put(next.f13747b, next.a());
        }
        return bVar;
    }

    public void a(String str, String str2, Object obj) {
        C0563t.b(str);
        if (this.f13149d) {
            this.f13148c.a(str, str2, obj);
        } else {
            this.f13147b.u().a(str, str2, obj, true);
        }
    }

    public final void b(boolean z) {
        if (this.f13149d) {
            this.f13148c.a(z);
        } else {
            this.f13147b.u().b(z);
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f13149d) {
            this.f13148c.c(str);
        } else {
            this.f13147b.H().a(str, this.f13147b.j().b());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f13149d) {
            this.f13148c.b(str, str2, bundle);
        } else {
            this.f13147b.u().c(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f13149d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f13147b.u().a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f13149d) {
            this.f13148c.d(str);
        } else {
            this.f13147b.H().b(str, this.f13147b.j().b());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f13149d ? this.f13148c.d() : this.f13147b.v().t();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f13149d ? this.f13148c.l() : this.f13147b.u().H();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> a2 = this.f13149d ? this.f13148c.a(str, str2) : this.f13147b.u().a(str, str2);
        ArrayList arrayList = new ArrayList(a2 == null ? 0 : a2.size());
        for (Bundle conditionalUserProperty : a2) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f13149d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f13147b.u().a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f13149d ? this.f13148c.b() : this.f13147b.u().K();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f13149d ? this.f13148c.a() : this.f13147b.u().J();
    }

    @Keep
    public String getGmpAppId() {
        return this.f13149d ? this.f13148c.e() : this.f13147b.u().L();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f13149d) {
            return this.f13148c.f(str);
        }
        this.f13147b.u();
        C0563t.b(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f13149d ? this.f13148c.a(str, str2, z) : this.f13147b.u().a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f13149d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f13147b.u().a(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f13149d) {
            this.f13148c.a(str, str2, bundle);
        } else {
            this.f13147b.u().a(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C0563t.a(conditionalUserProperty);
        if (this.f13149d) {
            this.f13148c.c(conditionalUserProperty.a());
        } else {
            this.f13147b.u().a(conditionalUserProperty.a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C0563t.a(conditionalUserProperty);
        if (this.f13149d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f13147b.u().b(conditionalUserProperty.a());
        throw null;
    }
}
