package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tm  reason: case insensitive filesystem */
public final class C2665tm implements Cia, C1527dja, C2948xla, Dma<C2170mma>, C1747gna {

    /* renamed from: a  reason: collision with root package name */
    private static int f12253a;

    /* renamed from: b  reason: collision with root package name */
    private static int f12254b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f12255c;

    /* renamed from: d  reason: collision with root package name */
    private final C2736um f12256d;

    /* renamed from: e  reason: collision with root package name */
    private final Uia f12257e;

    /* renamed from: f  reason: collision with root package name */
    private final Uia f12258f;

    /* renamed from: g  reason: collision with root package name */
    private final C1320ama f12259g;

    /* renamed from: h  reason: collision with root package name */
    private final C1201Yl f12260h;
    private C3084zia i;
    private ByteBuffer j;
    private boolean k;
    private final WeakReference<C1175Xl> l;
    private C0656Dm m;
    private int n;
    private int o;
    private long p;
    private final String q;
    private final int r;
    private final ArrayList<C2595sma> s;
    private volatile C2311om t;
    private Set<WeakReference<C2169mm>> u = new HashSet();

    public C2665tm(Context context, C1201Yl yl, C1175Xl xl) {
        this.f12255c = context;
        this.f12260h = yl;
        this.l = new WeakReference<>(xl);
        this.f12256d = new C2736um();
        this.f12257e = new C1322ana(this.f12255c, Vka.f9070a, 0, oa.f5628a, this, -1);
        this.f12258f = new C3086zja(Vka.f9070a, oa.f5628a, this);
        this.f12259g = new Vla();
        if (fa.a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            fa.f(sb.toString());
        }
        f12253a++;
        int i2 = 0;
        this.i = Dia.a(new Uia[]{this.f12258f, this.f12257e}, this.f12259g, this.f12256d);
        this.i.b((Cia) this);
        this.n = 0;
        this.p = 0;
        this.o = 0;
        this.s = new ArrayList<>();
        this.t = null;
        this.q = (xl == null || xl.K() == null) ? BuildConfig.FLAVOR : xl.K();
        this.r = xl != null ? xl.M() : i2;
    }

    private static long a(Map<String, List<String>> map) {
        if (map == null) {
            return 0;
        }
        for (Map.Entry next : map.entrySet()) {
            if (next != null) {
                try {
                    if (!(next.getKey() == null || !MW.a("content-length", (CharSequence) next.getKey()) || next.getValue() == null || ((List) next.getValue()).get(0) == null)) {
                        return Long.parseLong((String) ((List) next.getValue()).get(0));
                    }
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return 0;
    }

    private final C3090zla a(Uri uri, String str) {
        C2807vm vmVar;
        if (!this.k || this.j.limit() <= 0) {
            C2099lma ymVar = this.f12260h.i > 0 ? new C3020ym(this, str) : new C2949xm(this, str);
            C3091zm am = this.f12260h.j ? new C0578Am(this, ymVar) : ymVar;
            if (this.j.limit() > 0) {
                byte[] bArr = new byte[this.j.limit()];
                this.j.get(bArr);
                am = new C3091zm(am, bArr);
            }
            vmVar = am;
        } else {
            byte[] bArr2 = new byte[this.j.limit()];
            this.j.get(bArr2);
            vmVar = new C2807vm(bArr2);
        }
        Zja zja = ((Boolean) Qqa.e().a(F.n)).booleanValue() ? C0630Cm.f6466a : C0604Bm.f6364a;
        C1201Yl yl = this.f12260h;
        return new C2735ula(uri, vmVar, zja, yl.k, oa.f5628a, this, (String) null, yl.f9474g);
    }

    public static int f() {
        return f12253a;
    }

    public static int g() {
        return f12254b;
    }

    private final boolean l() {
        return this.t != null && this.t.c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2170mma a(C2099lma lma) {
        return new C2311om(this.f12255c, lma.a(), this.q, this.r, this, new C0682Em(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2170mma a(String str) {
        C2665tm tmVar = this.f12260h.j ? null : this;
        C1201Yl yl = this.f12260h;
        return new C2383pma(str, (Pma<String>) null, tmVar, yl.f9471d, yl.f9473f, true, (C2879wma) null);
    }

    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, boolean z) {
        if (this.i != null) {
            Eia eia = new Eia(this.f12258f, 2, Float.valueOf(f2));
            if (z) {
                this.i.b(eia);
                return;
            }
            this.i.a(eia);
        }
    }

    public final void a(int i2) {
    }

    public final void a(int i2, int i3, int i4, float f2) {
        C0656Dm dm = this.m;
        if (dm != null) {
            dm.a(i2, i3);
        }
    }

    public final void a(int i2, long j2) {
        this.o += i2;
    }

    public final void a(int i2, long j2, long j3) {
    }

    public final void a(Surface surface) {
    }

    /* access modifiers changed from: package-private */
    public final void a(Surface surface, boolean z) {
        if (this.i != null) {
            Eia eia = new Eia(this.f12257e, 1, surface);
            if (z) {
                this.i.b(eia);
                return;
            }
            this.i.a(eia);
        }
    }

    public final void a(Aia aia) {
        C0656Dm dm = this.m;
        if (dm != null) {
            dm.a("onPlayerError", (Exception) aia);
        }
    }

    public final void a(C0656Dm dm) {
        this.m = dm;
    }

    public final void a(Jja jja) {
    }

    public final void a(Lia lia) {
        C1175Xl xl = (C1175Xl) this.l.get();
        if (((Boolean) Qqa.e().a(F.vb)).booleanValue() && xl != null && lia != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(lia.l));
            hashMap.put("bitRate", String.valueOf(lia.f7708b));
            int i2 = lia.j;
            int i3 = lia.k;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            hashMap.put("resolution", sb.toString());
            hashMap.put("videoMime", lia.f7711e);
            hashMap.put("videoCodec", lia.f7709c);
            xl.a("onMetadataEvent", (Map<String, ?>) hashMap);
        }
    }

    public final void a(Pla pla, C1533dma dma) {
    }

    public final void a(Ria ria) {
    }

    public final void a(Via via, Object obj) {
    }

    public final void a(IOException iOException) {
        C0656Dm dm = this.m;
        if (dm != null) {
            dm.a("onLoadError", (Exception) iOException);
        }
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        this.n += i2;
    }

    public final /* synthetic */ void a(Object obj, C2241nma nma) {
        C2170mma mma = (C2170mma) obj;
        if (mma instanceof C2595sma) {
            this.s.add((C2595sma) mma);
        } else if (mma instanceof C2311om) {
            this.t = (C2311om) mma;
            C1175Xl xl = (C1175Xl) this.l.get();
            if (((Boolean) Qqa.e().a(F.vb)).booleanValue() && xl != null && this.t.f()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.t.h()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.t.d()));
                oa.f5628a.post(new C2878wm(xl, hashMap));
            }
        }
    }

    public final void a(String str, long j2, long j3) {
    }

    public final void a(boolean z) {
    }

    public final void a(boolean z, int i2) {
        C0656Dm dm = this.m;
        if (dm != null) {
            dm.a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z, long j2) {
        C0656Dm dm = this.m;
        if (dm != null) {
            dm.a(z, j2);
        }
    }

    public final void a(Uri[] uriArr, String str) {
        a(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void a(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        C3090zla zla;
        if (this.i != null) {
            this.j = byteBuffer;
            this.k = z;
            if (uriArr.length == 1) {
                zla = a(uriArr[0], str);
            } else {
                C3090zla[] zlaArr = new C3090zla[uriArr.length];
                for (int i2 = 0; i2 < uriArr.length; i2++) {
                    zlaArr[i2] = a(uriArr[i2], str);
                }
                zla = new Ela(zlaArr);
            }
            this.i.a(zla);
            f12254b++;
        }
    }

    public final long b() {
        return (long) this.n;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2170mma b(String str) {
        C2665tm tmVar = this.f12260h.j ? null : this;
        C1201Yl yl = this.f12260h;
        C2169mm mmVar = new C2169mm(str, tmVar, yl.f9471d, yl.f9473f, yl.i);
        this.u.add(new WeakReference(mmVar));
        return mmVar;
    }

    public final void b(int i2) {
        for (WeakReference<C2169mm> weakReference : this.u) {
            C2169mm mmVar = (C2169mm) weakReference.get();
            if (mmVar != null) {
                mmVar.a(i2);
            }
        }
    }

    public final void b(Jja jja) {
    }

    public final void b(Lia lia) {
        C1175Xl xl = (C1175Xl) this.l.get();
        if (((Boolean) Qqa.e().a(F.vb)).booleanValue() && xl != null && lia != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", lia.f7711e);
            hashMap.put("audioCodec", lia.f7709c);
            xl.a("onMetadataEvent", (Map<String, ?>) hashMap);
        }
    }

    public final void b(String str, long j2, long j3) {
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.i != null) {
            for (int i2 = 0; i2 < this.i.ea(); i2++) {
                this.f12259g.a(i2, !z);
            }
        }
    }

    public final long c() {
        if (l()) {
            return this.t.b();
        }
        while (!this.s.isEmpty()) {
            this.p += a(this.s.remove(0).a());
        }
        return this.p;
    }

    public final void c(Jja jja) {
    }

    public final void d() {
        C3084zia zia = this.i;
        if (zia != null) {
            zia.a((Cia) this);
            this.i.a();
            this.i = null;
            f12254b--;
        }
    }

    public final void d(Jja jja) {
    }

    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }

    public final C3084zia e() {
        return this.i;
    }

    public final void finalize() {
        f12253a--;
        if (fa.a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            fa.f(sb.toString());
        }
    }

    public final C2736um h() {
        return this.f12256d;
    }

    public final long i() {
        if (l() && this.t.h()) {
            return Math.min((long) this.n, this.t.g());
        }
        return 0;
    }

    public final long j() {
        if (!l()) {
            return (long) this.n;
        }
        return 0;
    }

    public final int k() {
        return this.o;
    }
}
