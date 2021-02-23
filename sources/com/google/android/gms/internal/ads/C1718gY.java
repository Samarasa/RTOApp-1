package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.gY  reason: case insensitive filesystem */
abstract class C1718gY<InputT, OutputT> extends C1930jY<OutputT> {
    private static final Logger l = Logger.getLogger(C1718gY.class.getName());
    /* access modifiers changed from: private */
    public C2638tX<? extends LY<? extends InputT>> m;
    private final boolean n;
    private final boolean o;

    /* renamed from: com.google.android.gms.internal.ads.gY$a */
    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    C1718gY(C2638tX<? extends LY<? extends InputT>> tXVar, boolean z, boolean z2) {
        super(tXVar.size());
        C1434cX.a(tXVar);
        this.m = tXVar;
        this.n = z;
        this.o = z2;
    }

    /* access modifiers changed from: private */
    public final void a(int i, Future<? extends InputT> future) {
        try {
            a(i, DY.a(future));
        } catch (ExecutionException e2) {
            b(e2.getCause());
        } catch (Throwable th) {
            b(th);
        }
    }

    /* access modifiers changed from: private */
    public final void a(C2638tX<? extends Future<? extends InputT>> tXVar) {
        int i = i();
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        } else if (i == 0) {
            if (tXVar != null) {
                QX qx = (QX) tXVar.iterator();
                while (qx.hasNext()) {
                    Future future = (Future) qx.next();
                    if (!future.isCancelled()) {
                        a(i2, future);
                    }
                    i2++;
                }
            }
            j();
            l();
            a(a.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    private static boolean a(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void b(Throwable th) {
        C1434cX.a(th);
        if (this.n && !a(th) && a(h(), th)) {
            c(th);
        } else if (th instanceof Error) {
            c(th);
        }
    }

    private static void c(Throwable th) {
        l.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(int i, InputT inputt);

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        C1434cX.a(aVar);
        this.m = null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Set<Throwable> set) {
        C1434cX.a(set);
        if (!isCancelled()) {
            a(set, a());
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        super.b();
        C2638tX<? extends LY<? extends InputT>> tXVar = this.m;
        a(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (tXVar != null)) {
            boolean e2 = e();
            QX qx = (QX) tXVar.iterator();
            while (qx.hasNext()) {
                ((Future) qx.next()).cancel(e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String d() {
        C2638tX<? extends LY<? extends InputT>> tXVar = this.m;
        if (tXVar == null) {
            return super.d();
        }
        String valueOf = String.valueOf(tXVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        if (this.m.isEmpty()) {
            l();
        } else if (this.n) {
            int i = 0;
            QX qx = (QX) this.m.iterator();
            while (qx.hasNext()) {
                LY ly = (LY) qx.next();
                ly.a(new C1647fY(this, ly, i), C2568sY.INSTANCE);
                i++;
            }
        } else {
            C1789hY hYVar = new C1789hY(this, this.o ? this.m : null);
            QX qx2 = (QX) this.m.iterator();
            while (qx2.hasNext()) {
                ((LY) qx2.next()).a(hYVar, C2568sY.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void l();
}
