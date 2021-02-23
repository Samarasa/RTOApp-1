package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.mediation.C0520a;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.ads.mediation.v;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ff  reason: case insensitive filesystem */
public final class C0701Ff extends C0753Hf {

    /* renamed from: a  reason: collision with root package name */
    private static final C0780Ig f6877a = new C0780Ig();

    /* renamed from: b  reason: collision with root package name */
    private Map<Class<? extends v>, v> f6878b;

    private final <NetworkExtrasT extends f, ServerParametersT extends e> C0805Jf D(String str) {
        try {
            Class<?> cls = Class.forName(str, false, C0701Ff.class.getClassLoader());
            if (b.class.isAssignableFrom(cls)) {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new C1873ig(bVar, (f) this.f6878b.get(bVar.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.f.class.isAssignableFrom(cls)) {
                return new C1307ag((com.google.android.gms.ads.mediation.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (C0520a.class.isAssignableFrom(cls)) {
                    return new C1307ag((C0520a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                C1018Rk.d(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return E(str);
        }
    }

    private final C0805Jf E(String str) {
        try {
            C1018Rk.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new C1307ag((com.google.android.gms.ads.mediation.f) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new C1307ag((com.google.android.gms.ads.mediation.f) new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new C1307ag((com.google.android.gms.ads.mediation.f) new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new C1873ig(customEventAdapter, (c) this.f6878b.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            C1018Rk.c(sb.toString(), th);
        }
    }

    public final void a(Map<Class<? extends v>, v> map) {
        this.f6878b = map;
    }

    public final C0805Jf j(String str) {
        return D(str);
    }

    public final boolean m(String str) {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, C0701Ff.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            C1018Rk.d(sb.toString());
            return false;
        }
    }

    public final C0624Cg x(String str) {
        return C0780Ig.a(str);
    }
}
