package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cQ  reason: case insensitive filesystem */
public final class C1427cQ implements Xga<C1498dQ> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10032a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f10033b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0710Fo> f10034c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2278oR<C1400br, C1754gr>> f10035d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C2631tQ> f10036e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<US> f10037f;

    public C1427cQ(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<C0710Fo> iha3, C1876iha<C2278oR<C1400br, C1754gr>> iha4, C1876iha<C2631tQ> iha5, C1876iha<US> iha6) {
        this.f10032a = iha;
        this.f10033b = iha2;
        this.f10034c = iha3;
        this.f10035d = iha4;
        this.f10036e = iha5;
        this.f10037f = iha6;
    }

    public final /* synthetic */ Object get() {
        return new C1498dQ(this.f10032a.get(), this.f10033b.get(), this.f10034c.get(), this.f10035d.get(), this.f10036e.get(), this.f10037f.get());
    }
}
