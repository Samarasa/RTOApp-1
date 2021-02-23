package com.google.android.gms.internal.ads;

import android.os.IBinder;

final class UJ implements C1617ev {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8879a = false;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2693uH f8880b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1742gl f8881c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ TJ f8882d;

    UJ(TJ tj, C2693uH uHVar, C1742gl glVar) {
        this.f8882d = tj;
        this.f8880b = uHVar;
        this.f8881c = glVar;
    }

    private final void b(C1824hqa hqa) {
        C2351pT pTVar = C2351pT.INTERNAL_ERROR;
        if (((Boolean) Qqa.e().a(F.Ld)).booleanValue()) {
            pTVar = C2351pT.NO_FILL;
        }
        this.f8881c.a((Throwable) new C2835wH(pTVar, hqa));
    }

    public final synchronized void H() {
        this.f8881c.a(null);
    }

    public final void a(int i) {
        if (!this.f8879a) {
            b(new C1824hqa(i, TJ.a(this.f8880b.f12305a, i), "undefined", (C1824hqa) null, (IBinder) null));
        }
    }

    public final synchronized void a(int i, String str) {
        if (!this.f8879a) {
            this.f8879a = true;
            if (str == null) {
                str = TJ.a(this.f8880b.f12305a, i);
            }
            b(new C1824hqa(i, str, "undefined", (C1824hqa) null, (IBinder) null));
        }
    }

    public final synchronized void a(C1824hqa hqa) {
        this.f8879a = true;
        b(hqa);
    }
}
