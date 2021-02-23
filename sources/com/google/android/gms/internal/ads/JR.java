package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h.a;
import java.util.concurrent.atomic.AtomicReference;

public final class JR extends a implements C2608su, C2963xu, C0768Hu, C1900iv, C0613Bv, C2065lR {

    /* renamed from: a  reason: collision with root package name */
    private final GT f7407a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<a> f7408b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<C2517rj> f7409c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<C2376pj> f7410d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<C1146Wi> f7411e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<C2588sj> f7412f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<C0912Ni> f7413g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<Mra> f7414h = new AtomicReference<>();
    private JR i = null;

    public JR(GT gt) {
        this.f7407a = gt;
    }

    public static JR a(JR jr) {
        JR jr2 = new JR(jr.f7407a);
        jr2.a((C2065lR) jr);
        return jr2;
    }

    public final void H() {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7409c, IR.f7293a);
                C1569eR.a(jr.f7411e, LR.f7673a);
                return;
            }
        }
    }

    public final void K() {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7411e, KR.f7549a);
                return;
            }
        }
    }

    public final void L() {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7411e, RR.f8469a);
                return;
            }
        }
    }

    public final void M() {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7410d, ZR.f9550a);
                C1569eR.a(jr.f7411e, YR.f9354a);
                return;
            }
        }
    }

    public final void N() {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7411e, C1429cS.f10039a);
                return;
            }
        }
    }

    public final void O() {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                jr.f7407a.a();
                C1569eR.a(jr.f7410d, C1287aS.f9785a);
                C1569eR.a(jr.f7411e, _R.f9656a);
                return;
            }
        }
    }

    public final void X() {
        JR jr = this.i;
        if (jr != null) {
            jr.X();
        } else {
            C1569eR.a(this.f7408b, SR.f8614a);
        }
    }

    public final void a(a aVar) {
        this.f7408b.set(aVar);
    }

    public final void a(C0886Mi mi, String str, String str2) {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7410d, new NR(mi));
                C1569eR.a(jr.f7412f, new MR(mi, str, str2));
                C1569eR.a(jr.f7411e, new PR(mi));
                C1569eR.a(jr.f7413g, new OR(mi, str, str2));
                return;
            }
        }
    }

    public final void a(Mra mra) {
        this.f7414h.set(mra);
    }

    @Deprecated
    public final void a(C0912Ni ni) {
        this.f7413g.set(ni);
    }

    @Deprecated
    public final void a(C1146Wi wi) {
        this.f7411e.set(wi);
    }

    public final void a(C1824hqa hqa) {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                int i2 = hqa.f10744a;
                C1569eR.a(jr.f7409c, new UR(hqa));
                C1569eR.a(jr.f7409c, new XR(i2));
                C1569eR.a(jr.f7411e, new WR(i2));
                return;
            }
        }
    }

    public final void a(C2065lR lRVar) {
        this.i = (JR) lRVar;
    }

    public final void a(C2376pj pjVar) {
        this.f7410d.set(pjVar);
    }

    public final void a(C2517rj rjVar) {
        this.f7409c.set(rjVar);
    }

    public final void a(C2588sj sjVar) {
        this.f7412f.set(sjVar);
    }

    public final void a(C2603sqa sqa) {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7414h, new VR(sqa));
                return;
            }
        }
    }

    public final void b(C1824hqa hqa) {
        JR jr = this;
        while (true) {
            JR jr2 = jr.i;
            if (jr2 != null) {
                jr = jr2;
            } else {
                C1569eR.a(jr.f7410d, new QR(hqa));
                C1569eR.a(jr.f7410d, new TR(hqa));
                return;
            }
        }
    }
}
