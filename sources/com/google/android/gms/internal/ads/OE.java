package com.google.android.gms.internal.ads;

import java.util.List;

final /* synthetic */ class OE implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FE f8053a;

    /* renamed from: b  reason: collision with root package name */
    private final C1925jT f8054b;

    /* renamed from: c  reason: collision with root package name */
    private final C0595Bd f8055c;

    /* renamed from: d  reason: collision with root package name */
    private final List f8056d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8057e;

    OE(FE fe, C1925jT jTVar, C0595Bd bd, List list, String str) {
        this.f8053a = fe;
        this.f8054b = jTVar;
        this.f8055c = bd;
        this.f8056d = list;
        this.f8057e = str;
    }

    public final void run() {
        this.f8053a.a(this.f8054b, this.f8055c, this.f8056d, this.f8057e);
    }
}
