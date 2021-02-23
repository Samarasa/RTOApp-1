package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C2120mB;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eW  reason: case insensitive filesystem */
final class C1574eW implements C2565sV {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10274a;

    /* renamed from: b  reason: collision with root package name */
    private final C1858iW f10275b;

    /* renamed from: c  reason: collision with root package name */
    private final C2708uW f10276c;

    /* renamed from: d  reason: collision with root package name */
    private final C2353pV f10277d;

    C1574eW(Object obj, C1858iW iWVar, C2708uW uWVar, C2353pV pVVar) {
        this.f10274a = obj;
        this.f10275b = iWVar;
        this.f10276c = uWVar;
        this.f10277d = pVVar;
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C2120mB.a o = C2120mB.o();
        o.a(QE.DG);
        o.a(Lda.a(bArr));
        return Base64.encodeToString(((C2120mB) o.k()).f(), 11);
    }

    private final synchronized byte[] a(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            this.f10277d.a(2007, System.currentTimeMillis() - currentTimeMillis, e2);
            return null;
        }
        return (byte[]) this.f10274a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f10274a, new Object[]{null, map2});
    }

    public final synchronized String a(Context context, String str) {
        Map<String, Object> b2;
        b2 = this.f10276c.b();
        b2.put("f", "q");
        b2.put("ctx", context);
        b2.put("aid", (Object) null);
        return a(a((Map<String, String>) null, b2));
    }

    public final synchronized String a(Context context, String str, View view, Activity activity) {
        Map<String, Object> c2;
        c2 = this.f10276c.c();
        c2.put("f", "v");
        c2.put("ctx", context);
        c2.put("aid", (Object) null);
        c2.put("view", view);
        c2.put("act", activity);
        return a(a((Map<String, String>) null, c2));
    }

    public final synchronized String a(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> a2;
        a2 = this.f10276c.a();
        a2.put("f", "c");
        a2.put("ctx", context);
        a2.put("cs", str2);
        a2.put("aid", (Object) null);
        a2.put("view", view);
        a2.put("act", activity);
        return a(a((Map<String, String>) null, a2));
    }

    public final synchronized void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f10274a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f10274a, new Object[0]);
            this.f10277d.a(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new C2566sW(2003, (Throwable) e2);
        }
    }

    public final synchronized void a(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f10274a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f10274a, new Object[]{hashMap});
            this.f10277d.a(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new C2566sW(2005, (Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final C1858iW b() {
        return this.f10275b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        try {
        } catch (Exception e2) {
            throw new C2566sW(2001, (Throwable) e2);
        }
        return ((Boolean) this.f10274a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f10274a, new Object[0])).booleanValue();
    }

    public final synchronized int d() {
        try {
        } catch (Exception e2) {
            throw new C2566sW(2006, (Throwable) e2);
        }
        return ((Integer) this.f10274a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f10274a, new Object[0])).intValue();
    }
}
