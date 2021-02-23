package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.bY  reason: case insensitive filesystem */
abstract class C1364bY<I, O, F, T> extends C2923xY<O> implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private LY<? extends I> f9908h;
    private F i;

    C1364bY(LY<? extends I> ly, F f2) {
        C1434cX.a(ly);
        this.f9908h = ly;
        C1434cX.a(f2);
        this.i = f2;
    }

    static <I, O> LY<O> a(LY<I> ly, UW<? super I, ? extends O> uw, Executor executor) {
        C1434cX.a(uw);
        C1506dY dYVar = new C1506dY(ly, uw);
        ly.a(dYVar, OY.a(executor, dYVar));
        return dYVar;
    }

    static <I, O> LY<O> a(LY<I> ly, C2214nY<? super I, ? extends O> nYVar, Executor executor) {
        C1434cX.a(executor);
        C1576eY eYVar = new C1576eY(ly, nYVar);
        ly.a(eYVar, OY.a(executor, eYVar));
        return eYVar;
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f2, I i2);

    /* access modifiers changed from: protected */
    public final void b() {
        a((Future<?>) this.f9908h);
        this.f9908h = null;
        this.i = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(T t);

    /* access modifiers changed from: protected */
    public final String d() {
        String str;
        LY<? extends I> ly = this.f9908h;
        F f2 = this.i;
        String d2 = super.d();
        if (ly != null) {
            String valueOf = String.valueOf(ly);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (f2 != null) {
            String valueOf2 = String.valueOf(f2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (d2 == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(d2);
            return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
    }

    public final void run() {
        LY<? extends I> ly = this.f9908h;
        F f2 = this.i;
        boolean z = true;
        boolean isCancelled = isCancelled() | (ly == null);
        if (f2 != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f9908h = null;
            if (ly.isCancelled()) {
                a(ly);
                return;
            }
            try {
                try {
                    Object a2 = a(f2, DY.a(ly));
                    this.i = null;
                    b(a2);
                } catch (Throwable th) {
                    this.i = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                a(e2.getCause());
            } catch (RuntimeException e3) {
                a((Throwable) e3);
            } catch (Error e4) {
                a((Throwable) e4);
            }
        }
    }
}
