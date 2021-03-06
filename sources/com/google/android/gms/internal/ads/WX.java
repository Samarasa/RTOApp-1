package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.Throwable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

abstract class WX<V, X extends Throwable, F, T> extends C2923xY<V> implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private LY<? extends V> f9144h;
    private Class<X> i;
    private F j;

    WX(LY<? extends V> ly, Class<X> cls, F f2) {
        C1434cX.a(ly);
        this.f9144h = ly;
        C1434cX.a(cls);
        this.i = cls;
        C1434cX.a(f2);
        this.j = f2;
    }

    static <X extends Throwable, V> LY<V> a(LY<? extends V> ly, Class<X> cls, C2214nY<? super X, ? extends V> nYVar, Executor executor) {
        VX vx = new VX(ly, cls, nYVar);
        ly.a(vx, OY.a(executor, vx));
        return vx;
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f2, X x);

    /* access modifiers changed from: protected */
    public final void b() {
        a((Future<?>) this.f9144h);
        this.f9144h = null;
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(T t);

    /* access modifiers changed from: protected */
    public final String d() {
        String str;
        LY<? extends V> ly = this.f9144h;
        Class<X> cls = this.i;
        F f2 = this.j;
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
        if (cls != null && f2 != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (d2 == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            String valueOf5 = String.valueOf(d2);
            return valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.LY<? extends V> r0 = r9.f9144h
            java.lang.Class<X> r1 = r9.i
            F r2 = r9.j
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x00b7
        L_0x0022:
            r3 = 0
            r9.f9144h = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.C1507dZ     // Catch:{ ExecutionException -> 0x003c, Throwable -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.android.gms.internal.ads.dZ r4 = (com.google.android.gms.internal.ads.C1507dZ) r4     // Catch:{ ExecutionException -> 0x003c, Throwable -> 0x0039 }
            java.lang.Throwable r4 = com.google.android.gms.internal.ads.C1719gZ.a(r4)     // Catch:{ ExecutionException -> 0x003c, Throwable -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003a
            java.lang.Object r5 = com.google.android.gms.internal.ads.DY.a(r0)     // Catch:{ ExecutionException -> 0x003c, Throwable -> 0x0039 }
            goto L_0x008b
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            r5 = r3
            goto L_0x008b
        L_0x003c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0089
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 35
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Future type "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " threw "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = " without a cause"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r5.<init>(r4)
        L_0x0089:
            r4 = r5
            goto L_0x003a
        L_0x008b:
            if (r4 != 0) goto L_0x0091
            r9.a(r5)
            return
        L_0x0091:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L_0x009b
            r9.a(r0)
            return
        L_0x009b:
            java.lang.Object r0 = r9.a(r2, r4)     // Catch:{ Throwable -> 0x00a9 }
            r9.i = r3
            r9.j = r3
            r9.b(r0)
            return
        L_0x00a7:
            r0 = move-exception
            goto L_0x00b2
        L_0x00a9:
            r0 = move-exception
            r9.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a7 }
            r9.i = r3
            r9.j = r3
            return
        L_0x00b2:
            r9.i = r3
            r9.j = r3
            throw r0
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WX.run():void");
    }
}
