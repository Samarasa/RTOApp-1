package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.fia  reason: case insensitive filesystem */
public class C1666fia {

    /* renamed from: a  reason: collision with root package name */
    private final C2869wha f10439a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10440b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10441c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10442d = 2;

    /* renamed from: e  reason: collision with root package name */
    private volatile Method f10443e = null;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?>[] f10444f;

    /* renamed from: g  reason: collision with root package name */
    private CountDownLatch f10445g = new CountDownLatch(1);

    public C1666fia(C2869wha wha, String str, String str2, Class<?>... clsArr) {
        this.f10439a = wha;
        this.f10440b = str;
        this.f10441c = str2;
        this.f10444f = clsArr;
        this.f10439a.e().submit(new C1878iia(this));
    }

    private final String a(byte[] bArr, String str) {
        return new String(this.f10439a.g().a(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    public final void b() {
        try {
            Class loadClass = this.f10439a.f().loadClass(a(this.f10439a.h(), this.f10440b));
            if (loadClass != null) {
                this.f10443e = loadClass.getMethod(a(this.f10439a.h(), this.f10441c), this.f10444f);
                Method method = this.f10443e;
            }
        } catch (C2438qea | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.f10445g.countDown();
            throw th;
        }
        this.f10445g.countDown();
    }

    public final Method a() {
        if (this.f10443e != null) {
            return this.f10443e;
        }
        try {
            if (!this.f10445g.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f10443e;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
