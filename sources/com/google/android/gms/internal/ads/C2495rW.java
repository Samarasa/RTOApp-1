package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.rW  reason: case insensitive filesystem */
public final class C2495rW {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f11978a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f11979b;

    /* renamed from: c  reason: collision with root package name */
    private final C2708uW f11980c;

    /* renamed from: d  reason: collision with root package name */
    private final C2353pV f11981d;

    /* renamed from: e  reason: collision with root package name */
    private final C2211nV f11982e;

    /* renamed from: f  reason: collision with root package name */
    private C1574eW f11983f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f11984g = new Object();

    public C2495rW(Context context, C2708uW uWVar, C2353pV pVVar, C2211nV nVVar) {
        this.f11979b = context;
        this.f11980c = uWVar;
        this.f11981d = pVVar;
        this.f11982e = nVVar;
    }

    private final Object a(Class<?> cls, C1858iW iWVar) {
        try {
            return cls.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f11979b, "msa-r", iWVar.e(), null, new Bundle(), 2});
        } catch (Exception e2) {
            throw new C2566sW(2004, (Throwable) e2);
        }
    }

    private final synchronized Class<?> b(C1858iW iWVar) {
        if (iWVar.b() != null) {
            String o = iWVar.b().o();
            Class<?> cls = f11978a.get(o);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.f11982e.a(iWVar.c())) {
                    File d2 = iWVar.d();
                    if (!d2.exists()) {
                        d2.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(iWVar.c().getAbsolutePath(), d2.getAbsolutePath(), (String) null, this.f11979b.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    f11978a.put(o, loadClass);
                    return loadClass;
                }
                throw new C2566sW(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e2) {
                throw new C2566sW(2026, (Throwable) e2);
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e3) {
                throw new C2566sW(2008, e3);
            }
        } else {
            throw new C2566sW(4010, "mc");
        }
    }

    public final C2565sV a() {
        C1574eW eWVar;
        synchronized (this.f11984g) {
            eWVar = this.f11983f;
        }
        return eWVar;
    }

    public final void a(C1858iW iWVar) {
        C2353pV pVVar;
        int a2;
        Exception exc;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C1574eW eWVar = new C1574eW(a(b(iWVar), iWVar), iWVar, this.f11980c, this.f11981d);
            if (eWVar.c()) {
                int d2 = eWVar.d();
                if (d2 == 0) {
                    synchronized (this.f11984g) {
                        if (this.f11983f != null) {
                            try {
                                this.f11983f.a();
                            } catch (C2566sW e2) {
                                this.f11981d.a(e2.a(), -1, (Exception) e2);
                            }
                        }
                        this.f11983f = eWVar;
                    }
                    this.f11981d.a(3000, System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(d2);
                throw new C2566sW(4001, sb.toString());
            }
            throw new C2566sW(4000, "init failed");
        } catch (C2566sW e3) {
            pVVar = this.f11981d;
            a2 = e3.a();
            exc = e3;
            pVVar.a(a2, System.currentTimeMillis() - currentTimeMillis, exc);
        } catch (Exception e4) {
            pVVar = this.f11981d;
            a2 = 4010;
            exc = e4;
            pVVar.a(a2, System.currentTimeMillis() - currentTimeMillis, exc);
        }
    }

    public final C1858iW b() {
        synchronized (this.f11984g) {
            if (this.f11983f == null) {
                return null;
            }
            C1858iW b2 = this.f11983f.b();
            return b2;
        }
    }
}
