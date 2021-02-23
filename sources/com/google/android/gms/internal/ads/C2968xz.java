package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import c.b.b.b.c.a;
import c.b.b.b.c.b;

/* renamed from: com.google.android.gms.internal.ads.xz  reason: case insensitive filesystem */
public final class C2968xz extends C1934jb {

    /* renamed from: a  reason: collision with root package name */
    private final C0877Lz f12865a;

    /* renamed from: b  reason: collision with root package name */
    private a f12866b;

    public C2968xz(C0877Lz lz) {
        this.f12865a = lz;
    }

    private static float Q(a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) b.Q(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    private final float Zb() {
        try {
            return this.f12865a.n().ia();
        } catch (RemoteException e2) {
            C1018Rk.b("Remote exception getting video controller aspect ratio.", e2);
            return 0.0f;
        }
    }

    public final boolean Ka() {
        return ((Boolean) Qqa.e().a(F.De)).booleanValue() && this.f12865a.n() != null;
    }

    public final a Qa() {
        a aVar = this.f12866b;
        if (aVar != null) {
            return aVar;
        }
        C2076lb q = this.f12865a.q();
        if (q == null) {
            return null;
        }
        return q.cb();
    }

    public final void a(C1165Xb xb) {
        if (((Boolean) Qqa.e().a(F.De)).booleanValue() && (this.f12865a.n() instanceof C0813Jn)) {
            ((C0813Jn) this.f12865a.n()).a(xb);
        }
    }

    public final float getDuration() {
        if (((Boolean) Qqa.e().a(F.De)).booleanValue() && this.f12865a.n() != null) {
            return this.f12865a.n().getDuration();
        }
        return 0.0f;
    }

    public final Sra getVideoController() {
        if (!((Boolean) Qqa.e().a(F.De)).booleanValue()) {
            return null;
        }
        return this.f12865a.n();
    }

    public final void i(a aVar) {
        if (((Boolean) Qqa.e().a(F.kc)).booleanValue()) {
            this.f12866b = aVar;
        }
    }

    public final float ia() {
        if (!((Boolean) Qqa.e().a(F.Ce)).booleanValue()) {
            return 0.0f;
        }
        if (this.f12865a.i() != 0.0f) {
            return this.f12865a.i();
        }
        if (this.f12865a.n() != null) {
            return Zb();
        }
        a aVar = this.f12866b;
        if (aVar != null) {
            return Q(aVar);
        }
        C2076lb q = this.f12865a.q();
        if (q == null) {
            return 0.0f;
        }
        float width = (q == null || q.getWidth() == -1 || q.getHeight() == -1) ? 0.0f : ((float) q.getWidth()) / ((float) q.getHeight());
        return width != 0.0f ? width : Q(q.cb());
    }

    public final float pa() {
        if (((Boolean) Qqa.e().a(F.De)).booleanValue() && this.f12865a.n() != null) {
            return this.f12865a.n().pa();
        }
        return 0.0f;
    }
}
