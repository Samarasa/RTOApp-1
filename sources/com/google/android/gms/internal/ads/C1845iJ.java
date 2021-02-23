package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.iJ  reason: case insensitive filesystem */
public final class C1845iJ {

    /* renamed from: a  reason: collision with root package name */
    private final C1642fT f10785a;

    /* renamed from: b  reason: collision with root package name */
    private final _C f10786b;

    /* renamed from: c  reason: collision with root package name */
    private final C1627fE f10787c;

    public C1845iJ(C1642fT fTVar, _C _c, C1627fE fEVar) {
        this.f10785a = fTVar;
        this.f10786b = _c;
        this.f10787c = fEVar;
    }

    public final void a(DS ds, C2988yS ySVar, int i, C2835wH wHVar, long j) {
        C1272aD aDVar;
        C1556eE a2 = this.f10787c.a();
        a2.a(ds);
        a2.a(ySVar);
        a2.a("action", "adapter_status");
        a2.a("adapter_l", String.valueOf(j));
        a2.a("sc", Integer.toString(i));
        if (wHVar != null) {
            a2.a("arec", Integer.toString(wHVar.b().f10744a));
            String a3 = this.f10785a.a(wHVar.getMessage());
            if (a3 != null) {
                a2.a("areec", a3);
            }
        }
        _C _c = this.f10786b;
        Iterator<String> it = ySVar.s.iterator();
        while (true) {
            if (!it.hasNext()) {
                aDVar = null;
                break;
            }
            aDVar = _c.a(it.next());
            if (aDVar != null) {
                break;
            }
        }
        if (aDVar != null) {
            a2.a("ancn", aDVar.f9760a);
            C1014Rg rg = aDVar.f9761b;
            if (rg != null) {
                a2.a("adapter_v", rg.toString());
            }
            C1014Rg rg2 = aDVar.f9762c;
            if (rg2 != null) {
                a2.a("adapter_sv", rg2.toString());
            }
        }
        a2.a();
    }
}
