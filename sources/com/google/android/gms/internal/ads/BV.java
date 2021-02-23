package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0547c;
import com.google.android.gms.internal.ads.C0588Aw;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class BV implements C0547c.a, C0547c.b {

    /* renamed from: a  reason: collision with root package name */
    private _V f6289a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6290b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6291c;

    /* renamed from: d  reason: collision with root package name */
    private final C1949jia f6292d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6293e = 1;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedBlockingQueue<C2070lW> f6294f;

    /* renamed from: g  reason: collision with root package name */
    private final HandlerThread f6295g;

    /* renamed from: h  reason: collision with root package name */
    private final C2353pV f6296h;
    private final long i;

    public BV(Context context, int i2, C1949jia jia, String str, String str2, String str3, C2353pV pVVar) {
        this.f6290b = str;
        this.f6292d = jia;
        this.f6291c = str2;
        this.f6296h = pVVar;
        this.f6295g = new HandlerThread("GassDGClient");
        this.f6295g.start();
        this.i = System.currentTimeMillis();
        this.f6289a = new _V(context, this.f6295g.getLooper(), this, this, 19621000);
        this.f6294f = new LinkedBlockingQueue<>();
        this.f6289a.j();
    }

    private final void a() {
        _V _v = this.f6289a;
        if (_v == null) {
            return;
        }
        if (_v.isConnected() || this.f6289a.c()) {
            this.f6289a.e();
        }
    }

    private final void a(int i2, long j, Exception exc) {
        C2353pV pVVar = this.f6296h;
        if (pVVar != null) {
            pVVar.a(i2, System.currentTimeMillis() - j, exc);
        }
    }

    private final C1433cW b() {
        try {
            return this.f6289a.z();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static C2070lW c() {
        return new C2070lW((byte[]) null, 1);
    }

    public final C2070lW a(int i2) {
        C2070lW lWVar;
        try {
            lWVar = this.f6294f.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            a(2009, this.i, e2);
            lWVar = null;
        }
        a(3004, this.i, (Exception) null);
        if (lWVar != null) {
            C2353pV.a(lWVar.f11179c == 7 ? C0588Aw.c.DISABLED : C0588Aw.c.ENABLED);
        }
        return lWVar == null ? c() : lWVar;
    }

    public final void a(C0254b bVar) {
        try {
            a(4012, this.i, (Exception) null);
            this.f6294f.put(c());
        } catch (InterruptedException unused) {
        }
    }

    public final void d(int i2) {
        try {
            a(4011, this.i, (Exception) null);
            this.f6294f.put(c());
        } catch (InterruptedException unused) {
        }
    }

    public final void h(Bundle bundle) {
        C1433cW b2 = b();
        if (b2 != null) {
            try {
                C2070lW a2 = b2.a(new C1928jW(this.f6293e, this.f6292d, this.f6290b, this.f6291c));
                a(5011, this.i, (Exception) null);
                this.f6294f.put(a2);
            } catch (Throwable th) {
                a();
                this.f6295g.quit();
                throw th;
            }
            a();
            this.f6295g.quit();
        }
    }
}
