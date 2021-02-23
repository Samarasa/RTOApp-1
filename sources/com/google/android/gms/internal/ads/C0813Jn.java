package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jn  reason: case insensitive filesystem */
public final class C0813Jn extends Rra {

    /* renamed from: a  reason: collision with root package name */
    private final C1175Xl f7490a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7491b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7492c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7493d;

    /* renamed from: e  reason: collision with root package name */
    private int f7494e;

    /* renamed from: f  reason: collision with root package name */
    private Tra f7495f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7496g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7497h = true;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;
    private C1165Xb n;

    public C0813Jn(C1175Xl xl, float f2, boolean z, boolean z2) {
        this.f7490a = xl;
        this.i = f2;
        this.f7492c = z;
        this.f7493d = z2;
    }

    private final void a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        C1252_k.f9703e.execute(new C0787In(this, hashMap));
    }

    private final void b(int i2, int i3, boolean z, boolean z2) {
        C1252_k.f9703e.execute(new C0865Ln(this, i2, i3, z, z2));
    }

    public final void Fb() {
        a("play", (Map<String, String>) null);
    }

    public final boolean Ga() {
        boolean z;
        synchronized (this.f7491b) {
            z = this.f7497h;
        }
        return z;
    }

    public final boolean Gb() {
        boolean z;
        synchronized (this.f7491b) {
            z = this.f7492c && this.l;
        }
        return z;
    }

    public final Tra Jb() {
        Tra tra;
        synchronized (this.f7491b) {
            tra = this.f7495f;
        }
        return tra;
    }

    public final void Zb() {
        boolean z;
        int i2;
        synchronized (this.f7491b) {
            z = this.f7497h;
            i2 = this.f7494e;
            this.f7494e = 3;
        }
        b(i2, 3, z, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7491b
            monitor-enter(r0)
            float r1 = r3.i     // Catch:{ all -> 0x0051 }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            float r1 = r3.k     // Catch:{ all -> 0x0051 }
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r3.i = r5     // Catch:{ all -> 0x0051 }
            r3.j = r4     // Catch:{ all -> 0x0051 }
            boolean r4 = r3.f7497h     // Catch:{ all -> 0x0051 }
            r3.f7497h = r7     // Catch:{ all -> 0x0051 }
            int r5 = r3.f7494e     // Catch:{ all -> 0x0051 }
            r3.f7494e = r6     // Catch:{ all -> 0x0051 }
            float r2 = r3.k     // Catch:{ all -> 0x0051 }
            r3.k = r8     // Catch:{ all -> 0x0051 }
            float r8 = r3.k     // Catch:{ all -> 0x0051 }
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0051 }
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x003a
            com.google.android.gms.internal.ads.Xl r8 = r3.f7490a     // Catch:{ all -> 0x0051 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x0051 }
            r8.invalidate()     // Catch:{ all -> 0x0051 }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.Xb r8 = r3.n     // Catch:{ RemoteException -> 0x0047 }
            if (r8 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.Xb r8 = r3.n     // Catch:{ RemoteException -> 0x0047 }
            r8.ab()     // Catch:{ RemoteException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.C1018Rk.d(r0, r8)
        L_0x004d:
            r3.b(r5, r6, r4, r7)
            return
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0813Jn.a(float, float, int, boolean, float):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3, boolean z, boolean z2) {
        synchronized (this.f7491b) {
            boolean z3 = false;
            boolean z4 = i2 != i3;
            boolean z5 = !this.f7496g && i3 == 1;
            boolean z6 = z4 && i3 == 1;
            boolean z7 = z4 && i3 == 2;
            boolean z8 = z4 && i3 == 3;
            boolean z9 = z != z2;
            if (this.f7496g || z5) {
                z3 = true;
            }
            this.f7496g = z3;
            if (z5) {
                try {
                    if (this.f7495f != null) {
                        this.f7495f.wb();
                    }
                } catch (RemoteException e2) {
                    C1018Rk.d("#007 Could not call remote method.", e2);
                }
            }
            if (z6 && this.f7495f != null) {
                this.f7495f.sa();
            }
            if (z7 && this.f7495f != null) {
                this.f7495f.ka();
            }
            if (z8) {
                if (this.f7495f != null) {
                    this.f7495f.ma();
                }
                this.f7490a.J();
            }
            if (z9 && this.f7495f != null) {
                this.f7495f.e(z2);
            }
        }
    }

    public final void a(Tra tra) {
        synchronized (this.f7491b) {
            this.f7495f = tra;
        }
    }

    public final void a(C1165Xb xb) {
        synchronized (this.f7491b) {
            this.n = xb;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map) {
        this.f7490a.a("pubVideoCmd", (Map<String, ?>) map);
    }

    public final void b(float f2) {
        synchronized (this.f7491b) {
            this.j = f2;
        }
    }

    public final void b(C1905j jVar) {
        boolean z = jVar.f10874a;
        boolean z2 = jVar.f10875b;
        boolean z3 = jVar.f10876c;
        synchronized (this.f7491b) {
            this.l = z2;
            this.m = z3;
        }
        a("initialState", f.a("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    public final int ca() {
        int i2;
        synchronized (this.f7491b) {
            i2 = this.f7494e;
        }
        return i2;
    }

    public final float getDuration() {
        float f2;
        synchronized (this.f7491b) {
            f2 = this.i;
        }
        return f2;
    }

    public final void h(boolean z) {
        a(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    public final float ia() {
        float f2;
        synchronized (this.f7491b) {
            f2 = this.k;
        }
        return f2;
    }

    public final float pa() {
        float f2;
        synchronized (this.f7491b) {
            f2 = this.j;
        }
        return f2;
    }

    public final void pause() {
        a("pause", (Map<String, String>) null);
    }

    public final void stop() {
        a("stop", (Map<String, String>) null);
    }

    public final boolean za() {
        boolean z;
        boolean Gb = Gb();
        synchronized (this.f7491b) {
            if (!Gb) {
                try {
                    if (this.m && this.f7493d) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }
}
