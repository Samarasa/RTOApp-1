package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import c.b.d.a;
import c.b.d.c.d;
import c.b.d.e;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f14236a;

    /* renamed from: b  reason: collision with root package name */
    private final AppMeasurement f14237b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Object> f14238c = new ConcurrentHashMap();

    private b(AppMeasurement appMeasurement) {
        C0563t.a(appMeasurement);
        this.f14237b = appMeasurement;
    }

    public static a a(e eVar, Context context, d dVar) {
        C0563t.a(eVar);
        C0563t.a(context);
        C0563t.a(dVar);
        C0563t.a(context.getApplicationContext());
        if (f14236a == null) {
            synchronized (b.class) {
                if (f14236a == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.h()) {
                        dVar.a(a.class, d.f14240a, c.f14239a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.g());
                    }
                    f14236a = new b(AppMeasurement.a(context, bundle));
                }
            }
        }
        return f14236a;
    }

    static final /* synthetic */ void a(c.b.d.c.a aVar) {
        boolean z = ((a) aVar.a()).f4895a;
        synchronized (b.class) {
            ((b) f14236a).f14237b.b(z);
        }
    }

    public Map<String, Object> a(boolean z) {
        return this.f14237b.a(z);
    }

    public void a(a.C0086a aVar) {
        if (com.google.firebase.analytics.connector.internal.b.a(aVar)) {
            this.f14237b.setConditionalUserProperty(com.google.firebase.analytics.connector.internal.b.b(aVar));
        }
    }

    public void a(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.a(str, str2)) {
            this.f14237b.a(str, str2, obj);
        }
    }

    public List<a.C0086a> b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (AppMeasurement.ConditionalUserProperty a2 : this.f14237b.getConditionalUserProperties(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.a(a2));
        }
        return arrayList;
    }

    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.a(str2, bundle) && com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle)) {
            this.f14237b.logEventInternal(str, str2, bundle);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.a(str2, bundle)) {
            this.f14237b.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    public int g(String str) {
        return this.f14237b.getMaxUserProperties(str);
    }
}
