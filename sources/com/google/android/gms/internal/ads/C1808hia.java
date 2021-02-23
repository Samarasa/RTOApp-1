package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.hia  reason: case insensitive filesystem */
public abstract class C1808hia implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f10706a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    protected final C2869wha f10707b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10708c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10709d;

    /* renamed from: e  reason: collision with root package name */
    protected final C1766hB.a f10710e;

    /* renamed from: f  reason: collision with root package name */
    protected Method f10711f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10712g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10713h;

    public C1808hia(C2869wha wha, String str, String str2, C1766hB.a aVar, int i, int i2) {
        this.f10707b = wha;
        this.f10708c = str;
        this.f10709d = str2;
        this.f10710e = aVar;
        this.f10712g = i;
        this.f10713h = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.f10711f = this.f10707b.a(this.f10708c, this.f10709d);
            if (this.f10711f == null) {
                return null;
            }
            a();
            HV j = this.f10707b.j();
            if (!(j == null || this.f10712g == Integer.MIN_VALUE)) {
                j.a(this.f10713h, this.f10712g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
