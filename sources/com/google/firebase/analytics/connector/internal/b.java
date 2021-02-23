package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C3181ld;
import com.google.android.gms.measurement.internal.Cc;
import com.google.firebase.analytics.a.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f14242a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f14243b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f14244c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f14245d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f14246e = Arrays.asList((String[]) com.google.android.gms.common.util.b.a(Cc.f13202a, Cc.f13203b));

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f14247f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    public static a.C0086a a(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        a.C0086a aVar = new a.C0086a();
        aVar.f14228a = conditionalUserProperty.mOrigin;
        aVar.n = conditionalUserProperty.mActive;
        aVar.m = conditionalUserProperty.mCreationTimestamp;
        aVar.k = conditionalUserProperty.mExpiredEventName;
        Bundle bundle = conditionalUserProperty.mExpiredEventParams;
        if (bundle != null) {
            aVar.l = new Bundle(bundle);
        }
        aVar.f14229b = conditionalUserProperty.mName;
        aVar.f14233f = conditionalUserProperty.mTimedOutEventName;
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            aVar.f14234g = new Bundle(bundle2);
        }
        aVar.j = conditionalUserProperty.mTimeToLive;
        aVar.f14235h = conditionalUserProperty.mTriggeredEventName;
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            aVar.i = new Bundle(bundle3);
        }
        aVar.o = conditionalUserProperty.mTriggeredTimestamp;
        aVar.f14231d = conditionalUserProperty.mTriggerEventName;
        aVar.f14232e = conditionalUserProperty.mTriggerTimeout;
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            aVar.f14230c = C3181ld.a(obj);
        }
        return aVar;
    }

    public static boolean a(a.C0086a aVar) {
        String str;
        if (aVar == null || (str = aVar.f14228a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = aVar.f14230c;
        if ((obj != null && C3181ld.a(obj) == null) || !a(str) || !a(str, aVar.f14229b)) {
            return false;
        }
        String str2 = aVar.k;
        if (str2 != null && (!a(str2, aVar.l) || !a(str, aVar.k, aVar.l))) {
            return false;
        }
        String str3 = aVar.f14235h;
        if (str3 != null && (!a(str3, aVar.i) || !a(str, aVar.f14235h, aVar.i))) {
            return false;
        }
        String str4 = aVar.f14233f;
        if (str4 != null) {
            return a(str4, aVar.f14234g) && a(str, aVar.f14233f, aVar.f14234g);
        }
        return true;
    }

    public static boolean a(String str) {
        return !f14244c.contains(str);
    }

    public static boolean a(String str, Bundle bundle) {
        if (f14243b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f14245d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f14246e.contains(str2)) {
            return false;
        }
        for (String matches : f14247f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : f14245d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            str3 = "fcm_integration";
        } else if (c2 == 1) {
            str3 = "fdl_integration";
        } else if (c2 != 2) {
            return false;
        } else {
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static AppMeasurement.ConditionalUserProperty b(a.C0086a aVar) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mOrigin = aVar.f14228a;
        conditionalUserProperty.mActive = aVar.n;
        conditionalUserProperty.mCreationTimestamp = aVar.m;
        conditionalUserProperty.mExpiredEventName = aVar.k;
        Bundle bundle = aVar.l;
        if (bundle != null) {
            conditionalUserProperty.mExpiredEventParams = new Bundle(bundle);
        }
        conditionalUserProperty.mName = aVar.f14229b;
        conditionalUserProperty.mTimedOutEventName = aVar.f14233f;
        Bundle bundle2 = aVar.f14234g;
        if (bundle2 != null) {
            conditionalUserProperty.mTimedOutEventParams = new Bundle(bundle2);
        }
        conditionalUserProperty.mTimeToLive = aVar.j;
        conditionalUserProperty.mTriggeredEventName = aVar.f14235h;
        Bundle bundle3 = aVar.i;
        if (bundle3 != null) {
            conditionalUserProperty.mTriggeredEventParams = new Bundle(bundle3);
        }
        conditionalUserProperty.mTriggeredTimestamp = aVar.o;
        conditionalUserProperty.mTriggerEventName = aVar.f14231d;
        conditionalUserProperty.mTriggerTimeout = aVar.f14232e;
        Object obj = aVar.f14230c;
        if (obj != null) {
            conditionalUserProperty.mValue = C3181ld.a(obj);
        }
        return conditionalUserProperty;
    }
}
