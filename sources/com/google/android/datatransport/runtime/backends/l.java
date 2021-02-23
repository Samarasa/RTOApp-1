package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f5274a;

    /* renamed from: b  reason: collision with root package name */
    private final j f5275b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, n> f5276c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5277a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f5278b = null;

        a(Context context) {
            this.f5277a = context;
        }

        private Map<String, String> a() {
            if (this.f5278b == null) {
                this.f5278b = a(this.f5277a);
            }
            return this.f5278b;
        }

        private Map<String, String> a(Context context) {
            Bundle b2 = b(context);
            if (b2 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : b2.keySet()) {
                Object obj = b2.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private static Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public e a(String str) {
            String str2;
            String str3;
            String str4 = a().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (e) Class.forName(str4).asSubclass(e.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                e = e2;
                str2 = String.format("Class %s is not found.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (IllegalAccessException e3) {
                e = e3;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InstantiationException e4) {
                e = e4;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (NoSuchMethodException e5) {
                e = e5;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InvocationTargetException e6) {
                e = e6;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            }
        }
    }

    l(Context context, j jVar) {
        this(new a(context), jVar);
    }

    l(a aVar, j jVar) {
        this.f5276c = new HashMap();
        this.f5274a = aVar;
        this.f5275b = jVar;
    }

    public synchronized n a(String str) {
        if (this.f5276c.containsKey(str)) {
            return this.f5276c.get(str);
        }
        e a2 = this.f5274a.a(str);
        if (a2 == null) {
            return null;
        }
        n create = a2.create(this.f5275b.a(str));
        this.f5276c.put(str, create);
        return create;
    }
}
