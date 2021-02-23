package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.om  reason: case insensitive filesystem */
public final class C2311om implements C2170mma {

    /* renamed from: a  reason: collision with root package name */
    private final Dma<C2170mma> f11628a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11629b;

    /* renamed from: c  reason: collision with root package name */
    private final C2170mma f11630c;

    /* renamed from: d  reason: collision with root package name */
    private final C2453qm f11631d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11632e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11633f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11634g = ((Boolean) Qqa.e().a(F.vb)).booleanValue();

    /* renamed from: h  reason: collision with root package name */
    private InputStream f11635h;
    private boolean i;
    private Uri j;
    private volatile Foa k;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private long p = 0;
    private LY<Long> q = null;
    private final AtomicLong r = new AtomicLong(-1);

    public C2311om(Context context, C2170mma mma, String str, int i2, Dma<C2170mma> dma, C2453qm qmVar) {
        this.f11629b = context;
        this.f11630c = mma;
        this.f11628a = dma;
        this.f11631d = qmVar;
        this.f11632e = str;
        this.f11633f = i2;
    }

    private final void b(C2241nma nma) {
        Dma<C2170mma> dma = this.f11628a;
        if (dma != null) {
            dma.a(this, nma);
        }
    }

    private final boolean i() {
        if (!this.f11634g) {
            return false;
        }
        if (((Boolean) Qqa.e().a(F.Pc)).booleanValue() && !this.n) {
            return true;
        }
        return ((Boolean) Qqa.e().a(F.Qc)).booleanValue() && !this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0101=Splitter:B:34:0x0101, B:39:0x0122=Splitter:B:39:0x0122} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.C2241nma r15) {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.i
            if (r2 != 0) goto L_0x01f7
            r2 = 1
            r14.i = r2
            android.net.Uri r3 = r15.f11507a
            r14.j = r3
            boolean r3 = r14.f11634g
            if (r3 != 0) goto L_0x0016
            r14.b(r15)
        L_0x0016:
            android.net.Uri r3 = r15.f11507a
            com.google.android.gms.internal.ads.Foa r3 = com.google.android.gms.internal.ads.Foa.a((android.net.Uri) r3)
            r14.k = r3
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.F.Mc
            com.google.android.gms.internal.ads.B r4 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0174
            com.google.android.gms.internal.ads.Foa r3 = r14.k
            if (r3 == 0) goto L_0x01cf
            com.google.android.gms.internal.ads.Foa r3 = r14.k
            long r7 = r15.f11510d
            r3.f6938h = r7
            com.google.android.gms.internal.ads.Foa r3 = r14.k
            java.lang.String r7 = r14.f11632e
            java.lang.String r7 = com.google.android.gms.internal.ads.C2000kX.c(r7)
            r3.i = r7
            com.google.android.gms.internal.ads.Foa r3 = r14.k
            int r7 = r14.f11633f
            r3.j = r7
            com.google.android.gms.internal.ads.Foa r3 = r14.k
            boolean r3 = r3.f6937g
            if (r3 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.p<java.lang.Long> r3 = com.google.android.gms.internal.ads.F.Oc
            goto L_0x0058
        L_0x0056:
            com.google.android.gms.internal.ads.p<java.lang.Long> r3 = com.google.android.gms.internal.ads.F.Nc
        L_0x0058:
            com.google.android.gms.internal.ads.B r7 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r3 = r7.a(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.p.j()
            long r9 = r3.b()
            com.google.android.gms.ads.internal.p.w()
            android.content.Context r3 = r14.f11629b
            com.google.android.gms.internal.ads.Foa r11 = r14.k
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.Qoa.a(r3, r11)
            r11 = 44
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0121, InterruptedException -> 0x0100, all -> 0x00fd }
            java.lang.Object r7 = r3.get(r7, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0121, InterruptedException -> 0x0100, all -> 0x00fd }
            com.google.android.gms.internal.ads.Toa r7 = (com.google.android.gms.internal.ads.Toa) r7     // Catch:{ ExecutionException | TimeoutException -> 0x0121, InterruptedException -> 0x0100, all -> 0x00fd }
            boolean r8 = r7.b()     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            r14.l = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            boolean r8 = r7.e()     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            r14.n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            boolean r8 = r7.c()     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            r14.o = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            long r12 = r7.d()     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            r14.p = r12     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            boolean r8 = r14.i()     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            if (r8 != 0) goto L_0x00d4
            java.io.InputStream r7 = r7.a()     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            r14.f11635h = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            boolean r7 = r14.f11634g     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
            if (r7 == 0) goto L_0x00ae
            r14.b(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00fb, InterruptedException -> 0x00f9, all -> 0x00f7 }
        L_0x00ae:
            com.google.android.gms.common.util.e r15 = com.google.android.gms.ads.internal.p.j()
            long r6 = r15.b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.qm r15 = r14.f11631d
            r15.a(r2, r6)
            r14.m = r2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r11)
            r15.append(r1)
            r15.append(r6)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.google.android.gms.ads.internal.util.fa.f(r15)
            return r4
        L_0x00d4:
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.p.j()
            long r3 = r3.b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.qm r5 = r14.f11631d
            r5.a(r2, r3)
            r14.m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0147
        L_0x00f7:
            r15 = move-exception
            goto L_0x014e
        L_0x00f9:
            r4 = 1
            goto L_0x0101
        L_0x00fb:
            r4 = 1
            goto L_0x0122
        L_0x00fd:
            r15 = move-exception
            r2 = 0
            goto L_0x014e
        L_0x0100:
            r4 = 0
        L_0x0101:
            r3.cancel(r2)     // Catch:{ all -> 0x014c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x014c }
            r2.interrupt()     // Catch:{ all -> 0x014c }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.p.j()
            long r2 = r2.b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.qm r5 = r14.f11631d
            r5.a(r4, r2)
            r14.m = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            goto L_0x013a
        L_0x0121:
            r4 = 0
        L_0x0122:
            r3.cancel(r2)     // Catch:{ all -> 0x014c }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.p.j()
            long r2 = r2.b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.qm r5 = r14.f11631d
            r5.a(r4, r2)
            r14.m = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
        L_0x013a:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0147:
            com.google.android.gms.ads.internal.util.fa.f(r0)
            goto L_0x01cf
        L_0x014c:
            r15 = move-exception
            r2 = r4
        L_0x014e:
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.p.j()
            long r3 = r3.b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.qm r5 = r14.f11631d
            r5.a(r2, r3)
            r14.m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.fa.f(r0)
            throw r15
        L_0x0174:
            r0 = 0
            com.google.android.gms.internal.ads.Foa r1 = r14.k
            if (r1 == 0) goto L_0x0199
            com.google.android.gms.internal.ads.Foa r0 = r14.k
            long r7 = r15.f11510d
            r0.f6938h = r7
            com.google.android.gms.internal.ads.Foa r0 = r14.k
            java.lang.String r1 = r14.f11632e
            java.lang.String r1 = com.google.android.gms.internal.ads.C2000kX.c(r1)
            r0.i = r1
            com.google.android.gms.internal.ads.Foa r0 = r14.k
            int r1 = r14.f11633f
            r0.j = r1
            com.google.android.gms.internal.ads.woa r0 = com.google.android.gms.ads.internal.p.i()
            com.google.android.gms.internal.ads.Foa r1 = r14.k
            com.google.android.gms.internal.ads.Aoa r0 = r0.a((com.google.android.gms.internal.ads.Foa) r1)
        L_0x0199:
            if (r0 == 0) goto L_0x01cf
            boolean r1 = r0.g()
            if (r1 == 0) goto L_0x01cf
            boolean r1 = r0.i()
            r14.l = r1
            boolean r1 = r0.l()
            r14.n = r1
            boolean r1 = r0.j()
            r14.o = r1
            long r7 = r0.k()
            r14.p = r7
            r14.m = r2
            boolean r1 = r14.i()
            if (r1 != 0) goto L_0x01cf
            java.io.InputStream r0 = r0.h()
            r14.f11635h = r0
            boolean r0 = r14.f11634g
            if (r0 == 0) goto L_0x01ce
            r14.b(r15)
        L_0x01ce:
            return r4
        L_0x01cf:
            r14.m = r6
            com.google.android.gms.internal.ads.Foa r0 = r14.k
            if (r0 == 0) goto L_0x01f0
            com.google.android.gms.internal.ads.nma r0 = new com.google.android.gms.internal.ads.nma
            com.google.android.gms.internal.ads.Foa r1 = r14.k
            java.lang.String r1 = r1.f6931a
            android.net.Uri r2 = android.net.Uri.parse(r1)
            byte[] r3 = r15.f11508b
            long r4 = r15.f11509c
            long r6 = r15.f11510d
            long r8 = r15.f11511e
            java.lang.String r10 = r15.f11512f
            int r11 = r15.f11513g
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r15 = r0
        L_0x01f0:
            com.google.android.gms.internal.ads.mma r0 = r14.f11630c
            long r0 = r0.a(r15)
            return r0
        L_0x01f7:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open CacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2311om.a(com.google.android.gms.internal.ads.nma):long");
    }

    public final long b() {
        if (this.k == null) {
            return -1;
        }
        if (this.r.get() == -1) {
            synchronized (this) {
                if (this.q == null) {
                    this.q = C1252_k.f9699a.a(new C2523rm(this));
                }
            }
            if (!this.q.isDone()) {
                return -1;
            }
            try {
                this.r.compareAndSet(-1, this.q.get().longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1;
            }
        }
        return this.r.get();
    }

    public final boolean c() {
        return this.m;
    }

    public final void close() {
        Dma<C2170mma> dma;
        if (this.i) {
            boolean z = false;
            this.i = false;
            this.j = null;
            if (!this.f11634g || this.f11635h != null) {
                z = true;
            }
            InputStream inputStream = this.f11635h;
            if (inputStream != null) {
                k.a(inputStream);
                this.f11635h = null;
            } else {
                this.f11630c.close();
            }
            if (z && (dma = this.f11628a) != null) {
                dma.d(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    public final boolean d() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Long e() {
        return Long.valueOf(p.i().b(this.k));
    }

    public final boolean f() {
        return this.l;
    }

    public final long g() {
        return this.p;
    }

    public final Uri getUri() {
        return this.j;
    }

    public final boolean h() {
        return this.n;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        Dma<C2170mma> dma;
        if (this.i) {
            InputStream inputStream = this.f11635h;
            int read = inputStream != null ? inputStream.read(bArr, i2, i3) : this.f11630c.read(bArr, i2, i3);
            if ((!this.f11634g || this.f11635h != null) && (dma = this.f11628a) != null) {
                dma.a(this, read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
