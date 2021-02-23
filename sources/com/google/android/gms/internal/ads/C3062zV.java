package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0547c;
import com.google.android.gms.internal.ads.C1766hB;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.zV  reason: case insensitive filesystem */
final class C3062zV implements C0547c.a, C0547c.b {

    /* renamed from: a  reason: collision with root package name */
    private _V f13054a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13055b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13056c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedBlockingQueue<C1766hB> f13057d;

    /* renamed from: e  reason: collision with root package name */
    private final HandlerThread f13058e = new HandlerThread("GassClient");

    public C3062zV(Context context, String str, String str2) {
        this.f13055b = str;
        this.f13056c = str2;
        this.f13058e.start();
        this.f13054a = new _V(context, this.f13058e.getLooper(), this, this, 9200000);
        this.f13057d = new LinkedBlockingQueue<>();
        this.f13054a.j();
    }

    private final void a() {
        _V _v = this.f13054a;
        if (_v == null) {
            return;
        }
        if (_v.isConnected() || this.f13054a.c()) {
            this.f13054a.e();
        }
    }

    private final C1433cW b() {
        try {
            return this.f13054a.z();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static C1766hB c() {
        C1766hB.a v = C1766hB.v();
        v.u(32768);
        return (C1766hB) v.k();
    }

    public final C1766hB a(int i) {
        C1766hB hBVar;
        try {
            hBVar = this.f13057d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            hBVar = null;
        }
        return hBVar == null ? c() : hBVar;
    }

    public final void a(C0254b bVar) {
        try {
            this.f13057d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    public final void d(int i) {
        try {
            this.f13057d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        a();
        r3.f13058e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A[ExcHandler: all (r4v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.cW r4 = r3.b()
            if (r4 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.ZV r0 = new com.google.android.gms.internal.ads.ZV     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f13055b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f13056c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.aW r4 = r4.a((com.google.android.gms.internal.ads.ZV) r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.hB r4 = r4.g()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.hB> r0 = r3.f13057d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        L_0x001c:
            r3.a()
            android.os.HandlerThread r4 = r3.f13058e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.hB> r4 = r3.f13057d     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            com.google.android.gms.internal.ads.hB r0 = c()     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            goto L_0x001c
        L_0x0031:
            r3.a()
            android.os.HandlerThread r0 = r3.f13058e
            r0.quit()
            throw r4
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3062zV.h(android.os.Bundle):void");
    }
}
