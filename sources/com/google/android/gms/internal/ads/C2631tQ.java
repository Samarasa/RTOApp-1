package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.tQ  reason: case insensitive filesystem */
public final class C2631tQ implements q, C2963xu, C2255nv, C2065lR {

    /* renamed from: a  reason: collision with root package name */
    private final GT f12195a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<C2103loa> f12196b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<C2174moa> f12197c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<C2387poa> f12198d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<C2255nv> f12199e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<q> f12200f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private C2631tQ f12201g = null;

    public C2631tQ(GT gt) {
        this.f12195a = gt;
    }

    public static C2631tQ a(C2631tQ tQVar) {
        C2631tQ tQVar2 = new C2631tQ(tQVar.f12195a);
        tQVar2.a((C2065lR) tQVar);
        return tQVar2;
    }

    public final void J() {
        C2631tQ tQVar = this;
        while (true) {
            C2631tQ tQVar2 = tQVar.f12201g;
            if (tQVar2 != null) {
                tQVar = tQVar2;
            } else {
                C1569eR.a(tQVar.f12200f, EQ.f6695a);
                return;
            }
        }
    }

    public final void Tb() {
        C2631tQ tQVar = this;
        while (true) {
            C2631tQ tQVar2 = tQVar.f12201g;
            if (tQVar2 != null) {
                tQVar = tQVar2;
            } else {
                C1569eR.a(tQVar.f12200f, C2986yQ.f12905a);
                C1569eR.a(tQVar.f12198d, BQ.f6281a);
                return;
            }
        }
    }

    public final void Ub() {
        C2631tQ tQVar = this;
        while (true) {
            C2631tQ tQVar2 = tQVar.f12201g;
            if (tQVar2 != null) {
                tQVar = tQVar2;
            } else {
                C1569eR.a(tQVar.f12199e, C3057zQ.f13045a);
                return;
            }
        }
    }

    public final void a() {
        C2631tQ tQVar = this;
        while (true) {
            C2631tQ tQVar2 = tQVar.f12201g;
            if (tQVar2 != null) {
                tQVar = tQVar2;
            } else {
                tQVar.f12195a.a();
                C1569eR.a(tQVar.f12197c, C2915xQ.f12762a);
                C1569eR.a(tQVar.f12198d, C2844wQ.f12621a);
                return;
            }
        }
    }

    public final void a(m mVar) {
        C2631tQ tQVar = this;
        while (true) {
            C2631tQ tQVar2 = tQVar.f12201g;
            if (tQVar2 != null) {
                tQVar = tQVar2;
            } else {
                C1569eR.a(tQVar.f12200f, new AQ(mVar));
                return;
            }
        }
    }

    public final void a(q qVar) {
        this.f12200f.set(qVar);
    }

    public final void a(C1749goa goa) {
        C2631tQ tQVar = this;
        while (true) {
            C2631tQ tQVar2 = tQVar.f12201g;
            if (tQVar2 != null) {
                tQVar = tQVar2;
            } else {
                C1569eR.a(tQVar.f12196b, new C2560sQ(goa));
                return;
            }
        }
    }

    public final void a(C1824hqa hqa) {
        C2631tQ tQVar = this;
        while (true) {
            C2631tQ tQVar2 = tQVar.f12201g;
            if (tQVar2 != null) {
                tQVar = tQVar2;
            } else {
                C1569eR.a(tQVar.f12196b, new C2773vQ(hqa));
                C1569eR.a(tQVar.f12196b, new C2702uQ(hqa));
                return;
            }
        }
    }

    public final void a(C2065lR lRVar) {
        this.f12201g = (C2631tQ) lRVar;
    }

    public final void a(C2103loa loa) {
        this.f12196b.set(loa);
    }

    public final void a(C2174moa moa) {
        this.f12197c.set(moa);
    }

    public final void a(C2255nv nvVar) {
        this.f12199e.set(nvVar);
    }

    public final void a(C2387poa poa) {
        this.f12198d.set(poa);
    }

    public final void onPause() {
    }

    public final void onResume() {
    }
}
