package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gy  reason: case insensitive filesystem */
public class C1762gy {

    /* renamed from: a  reason: collision with root package name */
    private final C0876Ly f10606a;

    /* renamed from: b  reason: collision with root package name */
    private final C2313on f10607b;

    public C1762gy(C0876Ly ly) {
        this(ly, (C2313on) null);
    }

    public C1762gy(C0876Ly ly, C2313on onVar) {
        this.f10606a = ly;
        this.f10607b = onVar;
    }

    public final C2313on a() {
        return this.f10607b;
    }

    public final C3108zx<C2610sw> a(Executor executor) {
        return new C3108zx<>(new C1903iy(this.f10607b), executor);
    }

    public Set<C3108zx<C2608su>> a(C1053St st) {
        return Collections.singleton(C3108zx.a(st, C1252_k.f9704f));
    }

    public final C0876Ly b() {
        return this.f10606a;
    }

    public Set<C3108zx<C2328ox>> b(C1053St st) {
        return Collections.singleton(C3108zx.a(st, C1252_k.f9704f));
    }

    public final View c() {
        C2313on onVar = this.f10607b;
        if (onVar != null) {
            return onVar.getWebView();
        }
        return null;
    }

    public final View d() {
        C2313on onVar = this.f10607b;
        if (onVar == null) {
            return null;
        }
        return onVar.getWebView();
    }
}
