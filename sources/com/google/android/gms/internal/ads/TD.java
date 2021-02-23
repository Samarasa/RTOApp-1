package com.google.android.gms.internal.ads;

import android.content.Context;

public final class TD implements Xga<UD> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f8741a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1642fT> f8742b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1627fE> f8743c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<OS> f8744d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C2988yS> f8745e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<C1701gH> f8746f;

    private TD(C1876iha<Context> iha, C1876iha<C1642fT> iha2, C1876iha<C1627fE> iha3, C1876iha<OS> iha4, C1876iha<C2988yS> iha5, C1876iha<C1701gH> iha6) {
        this.f8741a = iha;
        this.f8742b = iha2;
        this.f8743c = iha3;
        this.f8744d = iha4;
        this.f8745e = iha5;
        this.f8746f = iha6;
    }

    public static TD a(C1876iha<Context> iha, C1876iha<C1642fT> iha2, C1876iha<C1627fE> iha3, C1876iha<OS> iha4, C1876iha<C2988yS> iha5, C1876iha<C1701gH> iha6) {
        return new TD(iha, iha2, iha3, iha4, iha5, iha6);
    }

    public final /* synthetic */ Object get() {
        return new UD(this.f8741a.get(), this.f8742b.get(), this.f8743c.get(), this.f8744d.get(), this.f8745e.get(), this.f8746f.get());
    }
}
