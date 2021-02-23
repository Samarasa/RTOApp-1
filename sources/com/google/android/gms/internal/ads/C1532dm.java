package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.dm  reason: case insensitive filesystem */
public final class C1532dm extends C0759Hl implements TextureView.SurfaceTextureListener, C0656Dm {

    /* renamed from: c  reason: collision with root package name */
    private final C1175Xl f10177c;

    /* renamed from: d  reason: collision with root package name */
    private final C1253_l f10178d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10179e;

    /* renamed from: f  reason: collision with root package name */
    private final C1201Yl f10180f;

    /* renamed from: g  reason: collision with root package name */
    private C0681El f10181g;

    /* renamed from: h  reason: collision with root package name */
    private Surface f10182h;
    private C2665tm i;
    private String j;
    private String[] k;
    private boolean l;
    private int m = 1;
    private C1123Vl n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;

    public C1532dm(Context context, C1253_l _lVar, C1175Xl xl, boolean z, boolean z2, C1201Yl yl) {
        super(context);
        this.f10179e = z2;
        this.f10177c = xl;
        this.f10178d = _lVar;
        this.o = z;
        this.f10180f = yl;
        setSurfaceTextureListener(this);
        this.f10178d.a(this);
    }

    private final void a(float f2, boolean z) {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.a(f2, z);
        } else {
            C1018Rk.d("Trying to set volume before player is initalized.");
        }
    }

    private final void a(Surface surface, boolean z) {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.a(surface, z);
        } else {
            C1018Rk.d("Trying to set surface before player is initalized.");
        }
    }

    private final void c(int i2, int i3) {
        float f2 = i3 > 0 ? ((float) i2) / ((float) i3) : 1.0f;
        if (this.v != f2) {
            this.v = f2;
            requestLayout();
        }
    }

    private final C2665tm o() {
        return new C2665tm(this.f10177c.getContext(), this.f10180f, this.f10177c);
    }

    private final String p() {
        return p.c().b(this.f10177c.getContext(), this.f10177c.B().f9456a);
    }

    private final boolean q() {
        C2665tm tmVar = this.i;
        return (tmVar == null || tmVar.e() == null || this.l) ? false : true;
    }

    private final boolean r() {
        return q() && this.m != 1;
    }

    private final void s() {
        String str;
        String str2;
        if (this.i == null && (str = this.j) != null && this.f10182h != null) {
            if (str.startsWith("cache:")) {
                C0994Qm b2 = this.f10177c.b(this.j);
                if (b2 instanceof C1392bn) {
                    this.i = ((C1392bn) b2).c();
                    if (this.i.e() == null) {
                        str2 = "Precached video player has been released.";
                    }
                } else if (b2 instanceof C1463cn) {
                    C1463cn cnVar = (C1463cn) b2;
                    String p2 = p();
                    ByteBuffer c2 = cnVar.c();
                    boolean e2 = cnVar.e();
                    String d2 = cnVar.d();
                    if (d2 == null) {
                        str2 = "Stream cache URL is null.";
                    } else {
                        this.i = o();
                        this.i.a(new Uri[]{Uri.parse(d2)}, p2, c2, e2);
                    }
                } else {
                    String valueOf = String.valueOf(this.j);
                    C1018Rk.d(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
                C1018Rk.d(str2);
                return;
            }
            this.i = o();
            String p3 = p();
            Uri[] uriArr = new Uri[this.k.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.k;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.i.a(uriArr, p3);
            this.i.a((C0656Dm) this);
            a(this.f10182h, false);
            if (this.i.e() != null) {
                this.m = this.i.e().ca();
                if (this.m == 3) {
                    t();
                }
            }
        }
    }

    private final void t() {
        if (!this.p) {
            this.p = true;
            oa.f5628a.post(new C1461cm(this));
            a();
            this.f10178d.d();
            if (this.q) {
                c();
            }
        }
    }

    private final void u() {
        c(this.r, this.s);
    }

    private final void v() {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.b(true);
        }
    }

    private final void w() {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.b(false);
        }
    }

    public final void a() {
        a(this.f7197b.a(), false);
    }

    public final void a(float f2, float f3) {
        C1123Vl vl = this.n;
        if (vl != null) {
            vl.a(f2, f3);
        }
    }

    public final void a(int i2) {
        if (this.m != i2) {
            this.m = i2;
            if (i2 == 3) {
                t();
            } else if (i2 == 4) {
                if (this.f10180f.f9468a) {
                    w();
                }
                this.f10178d.c();
                this.f7197b.c();
                oa.f5628a.post(new C1673fm(this));
            }
        }
    }

    public final void a(int i2, int i3) {
        this.r = i2;
        this.s = i3;
        u();
    }

    public final void a(C0681El el) {
        this.f10181g = el;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        C0681El el = this.f10181g;
        if (el != null) {
            el.a("ExoPlayerAdapter error", str);
        }
    }

    public final void a(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        C1018Rk.d(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.l = true;
        if (this.f10180f.f9468a) {
            w();
        }
        oa.f5628a.post(new C1602em(this, sb2));
    }

    public final void a(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.j = str;
            this.k = (String[]) Arrays.copyOf(strArr, strArr.length);
            s();
        }
    }

    public final void a(boolean z, long j2) {
        if (this.f10177c != null) {
            C1252_k.f9703e.execute(new C2240nm(this, z, j2));
        }
    }

    public final void b() {
        if (r()) {
            if (this.f10180f.f9468a) {
                w();
            }
            this.i.e().a(false);
            this.f10178d.c();
            this.f7197b.c();
            oa.f5628a.post(new C1744gm(this));
        }
    }

    public final void b(int i2) {
        if (r()) {
            this.i.e().a((long) i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2, int i3) {
        C0681El el = this.f10181g;
        if (el != null) {
            el.a(i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z, long j2) {
        this.f10177c.a(z, j2);
    }

    public final void c() {
        if (r()) {
            if (this.f10180f.f9468a) {
                v();
            }
            this.i.e().a(true);
            this.f10178d.b();
            this.f7197b.b();
            this.f7196a.a();
            oa.f5628a.post(new C1815hm(this));
            return;
        }
        this.q = true;
    }

    public final void c(int i2) {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.h().c(i2);
        }
    }

    public final void d() {
        if (q()) {
            this.i.e().stop();
            if (this.i != null) {
                a((Surface) null, true);
                C2665tm tmVar = this.i;
                if (tmVar != null) {
                    tmVar.a((C0656Dm) null);
                    this.i.d();
                    this.i = null;
                }
                this.m = 1;
                this.l = false;
                this.p = false;
                this.q = false;
            }
        }
        this.f10178d.c();
        this.f7197b.c();
        this.f10178d.a();
    }

    public final void d(int i2) {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.h().d(i2);
        }
    }

    public final long e() {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            return tmVar.i();
        }
        return -1;
    }

    public final void e(int i2) {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.h().a(i2);
        }
    }

    public final String f() {
        String str = this.o ? " spherical" : BuildConfig.FLAVOR;
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    public final void f(int i2) {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.h().b(i2);
        }
    }

    public final long g() {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            return tmVar.j();
        }
        return -1;
    }

    public final void g(int i2) {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            tmVar.b(i2);
        }
    }

    public final int getCurrentPosition() {
        if (r()) {
            return (int) this.i.e().ga();
        }
        return 0;
    }

    public final int getDuration() {
        if (r()) {
            return (int) this.i.e().getDuration();
        }
        return 0;
    }

    public final long getTotalBytes() {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            return tmVar.c();
        }
        return -1;
    }

    public final int getVideoHeight() {
        return this.s;
    }

    public final int getVideoWidth() {
        return this.r;
    }

    public final int h() {
        C2665tm tmVar = this.i;
        if (tmVar != null) {
            return tmVar.k();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(int i2) {
        C0681El el = this.f10181g;
        if (el != null) {
            el.onWindowVisibilityChanged(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        C0681El el = this.f10181g;
        if (el != null) {
            el.e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        C0681El el = this.f10181g;
        if (el != null) {
            el.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        C0681El el = this.f10181g;
        if (el != null) {
            el.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        C0681El el = this.f10181g;
        if (el != null) {
            el.g();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        C0681El el = this.f10181g;
        if (el != null) {
            el.f();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        C0681El el = this.f10181g;
        if (el != null) {
            el.a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[LOOP:0: B:30:0x007a->B:35:0x0095, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            float r0 = r10.v
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.Vl r2 = r10.n
            if (r2 != 0) goto L_0x002a
            float r2 = (float) r11
            float r3 = (float) r12
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r12 = (int) r2
        L_0x0020:
            float r0 = r10.v
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002a
            float r11 = (float) r12
            float r11 = r11 * r0
            int r11 = (int) r11
        L_0x002a:
            r10.setMeasuredDimension(r11, r12)
            com.google.android.gms.internal.ads.Vl r0 = r10.n
            if (r0 == 0) goto L_0x0034
            r0.a((int) r11, (int) r12)
        L_0x0034:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a2
            int r0 = r10.t
            if (r0 <= 0) goto L_0x0040
            if (r0 != r11) goto L_0x0046
        L_0x0040:
            int r0 = r10.u
            if (r0 <= 0) goto L_0x009e
            if (r0 == r12) goto L_0x009e
        L_0x0046:
            boolean r0 = r10.f10179e
            if (r0 == 0) goto L_0x009e
            boolean r0 = r10.q()
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.tm r0 = r10.i
            com.google.android.gms.internal.ads.zia r0 = r0.e()
            long r2 = r0.ga()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x009e
            boolean r2 = r0.da()
            if (r2 == 0) goto L_0x0067
            goto L_0x009e
        L_0x0067:
            r2 = 1
            r10.a((float) r1, (boolean) r2)
            r0.a((boolean) r2)
            long r1 = r0.ga()
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.p.j()
            long r3 = r3.a()
        L_0x007a:
            boolean r5 = r10.q()
            if (r5 == 0) goto L_0x0097
            long r5 = r0.ga()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.p.j()
            long r5 = r5.a()
            long r5 = r5 - r3
            r7 = 250(0xfa, double:1.235E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x007a
        L_0x0097:
            r1 = 0
            r0.a((boolean) r1)
            r10.a()
        L_0x009e:
            r10.t = r11
            r10.u = r12
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1532dm.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.o) {
            this.n = new C1123Vl(getContext());
            this.n.a(surfaceTexture, i2, i3);
            this.n.start();
            SurfaceTexture c2 = this.n.c();
            if (c2 != null) {
                surfaceTexture = c2;
            } else {
                this.n.b();
                this.n = null;
            }
        }
        this.f10182h = new Surface(surfaceTexture);
        if (this.i == null) {
            s();
        } else {
            a(this.f10182h, true);
            if (!this.f10180f.f9468a) {
                v();
            }
        }
        if (this.r == 0 || this.s == 0) {
            c(i2, i3);
        } else {
            u();
        }
        oa.f5628a.post(new C1956jm(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        C1123Vl vl = this.n;
        if (vl != null) {
            vl.b();
            this.n = null;
        }
        if (this.i != null) {
            w();
            Surface surface = this.f10182h;
            if (surface != null) {
                surface.release();
            }
            this.f10182h = null;
            a((Surface) null, true);
        }
        oa.f5628a.post(new C2098lm(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        C1123Vl vl = this.n;
        if (vl != null) {
            vl.a(i2, i3);
        }
        oa.f5628a.post(new C1885im(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10178d.b(this);
        this.f7196a.a(surfaceTexture, this.f10181g);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        fa.f(sb.toString());
        oa.f5628a.post(new C2027km(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.j = str;
            this.k = new String[]{str};
            s();
        }
    }
}
