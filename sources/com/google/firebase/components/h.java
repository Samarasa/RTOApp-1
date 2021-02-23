package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f14452a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T> f14453b;

    private static class a implements b<Context> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends Service> f14454a;

        private a(Class<? extends Service> cls) {
            this.f14454a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f14454a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f14454a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        public List<String> a(Context context) {
            Bundle b2 = b(context);
            if (b2 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b2.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b2.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface b<T> {
        List<String> a(T t);
    }

    h(T t, b<T> bVar) {
        this.f14452a = t;
        this.f14453b = bVar;
    }

    public static h<Context> a(Context context, Class<? extends Service> cls) {
        return new h<>(context, new a(cls));
    }

    private static List<j> a(List<String> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            try {
                Class<?> cls = Class.forName(next);
                if (!j.class.isAssignableFrom(cls)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", new Object[]{next, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add((j) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e2) {
                e = e2;
                str = String.format("Class %s is not an found.", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (IllegalAccessException e3) {
                e = e3;
                str = String.format("Could not instantiate %s.", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (InstantiationException e4) {
                e = e4;
                str = String.format("Could not instantiate %s.", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                str = String.format("Could not instantiate %s", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (InvocationTargetException e6) {
                e = e6;
                str = String.format("Could not instantiate %s", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            }
        }
        return arrayList;
    }

    public List<j> a() {
        return a(this.f14453b.a(this.f14452a));
    }
}
