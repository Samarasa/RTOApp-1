package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.zja  reason: case insensitive filesystem */
public final class C3086zja extends Tka implements Gma {
    /* access modifiers changed from: private */
    public final C1739gja V;
    private final C2093lja W;
    private boolean X;
    private boolean Y;
    private MediaFormat Z;
    private int aa;
    private int ba;
    private long ca;
    /* access modifiers changed from: private */
    public boolean da;

    public C3086zja(Vka vka, Handler handler, C1527dja dja) {
        this(vka, (Qja<Sja>) null, true, handler, dja);
    }

    private C3086zja(Vka vka, Qja<Sja> qja, boolean z, Handler handler, C1527dja dja) {
        this(vka, (Qja<Sja>) null, true, handler, dja, (C1456cja) null, new C1385bja[0]);
    }

    private C3086zja(Vka vka, Qja<Sja> qja, boolean z, Handler handler, C1527dja dja, C1456cja cja, C1385bja... bjaArr) {
        super(1, vka, (Qja<Sja>) null, true);
        this.W = new C2093lja((C1456cja) null, bjaArr, new Bja(this));
        this.V = new C1739gja(handler, dja);
    }

    protected static void a(int i) {
    }

    protected static void a(int i, long j, long j2) {
    }

    private final boolean a(String str) {
        C2093lja lja = this.W;
        return false;
    }

    protected static void p() {
    }

    /* access modifiers changed from: protected */
    public final int a(Vka vka, Lia lia) {
        int i;
        int i2;
        String str = lia.f7712f;
        if (!Jma.a(str)) {
            return 0;
        }
        int i3 = Tma.f8821a >= 21 ? 16 : 0;
        int i4 = 3;
        if (a(str) && vka.a() != null) {
            return i3 | 4 | 3;
        }
        Qka a2 = vka.a(str, false);
        boolean z = true;
        if (a2 == null) {
            return 1;
        }
        if (Tma.f8821a >= 21 && (((i = lia.s) != -1 && !a2.a(i)) || ((i2 = lia.r) != -1 && !a2.b(i2)))) {
            z = false;
        }
        if (!z) {
            i4 = 2;
        }
        return i3 | 4 | i4;
    }

    /* access modifiers changed from: protected */
    public final Qka a(Vka vka, Lia lia, boolean z) {
        Qka a2;
        if (!a(lia.f7712f) || (a2 = vka.a()) == null) {
            this.X = false;
            return super.a(vka, lia, z);
        }
        this.X = true;
        return a2;
    }

    public final Ria a(Ria ria) {
        return this.W.a(ria);
    }

    public final void a(int i, Object obj) {
        if (i == 2) {
            this.W.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.W.a(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(long j, boolean z) {
        super.a(j, z);
        this.W.d();
        this.ca = j;
        this.da = true;
    }

    /* access modifiers changed from: protected */
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int[] iArr;
        int i;
        boolean z = this.Z != null;
        String string = z ? this.Z.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.Y || integer != 6 || (i = this.ba) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.ba; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.W.a(string, integer, integer2, this.aa, 0, iArr);
        } catch (C2377pja e2) {
            throw Aia.a(e2, e());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Qka qka, MediaCodec mediaCodec, Lia lia, MediaCrypto mediaCrypto) {
        this.Y = Tma.f8821a < 24 && "OMX.SEC.aac.dec".equals(qka.f8376a) && "samsung".equals(Tma.f8823c) && (Tma.f8822b.startsWith("zeroflte") || Tma.f8822b.startsWith("herolte") || Tma.f8822b.startsWith("heroqlte"));
        if (this.X) {
            this.Z = lia.b();
            this.Z.setString("mime", "audio/raw");
            mediaCodec.configure(this.Z, (Surface) null, (MediaCrypto) null, 0);
            this.Z.setString("mime", lia.f7712f);
            return;
        }
        mediaCodec.configure(lia.b(), (Surface) null, (MediaCrypto) null, 0);
        this.Z = null;
    }

    /* access modifiers changed from: protected */
    public final void a(String str, long j, long j2) {
        this.V.a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        this.V.a(this.U);
        int i = i().f9272b;
        this.W.j();
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.X && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.U.f7470e++;
            this.W.f();
            return true;
        } else {
            try {
                if (!this.W.a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.U.f7469d++;
                return true;
            } catch (C2589sja | C2660tja e2) {
                throw Aia.a(e2, e());
            }
        }
    }

    public final Ria b() {
        return this.W.i();
    }

    /* access modifiers changed from: protected */
    public final void b(Lia lia) {
        super.b(lia);
        this.V.a(lia);
        this.aa = "audio/raw".equals(lia.f7712f) ? lia.t : 2;
        this.ba = lia.r;
    }

    public final long c() {
        long a2 = this.W.a(u());
        if (a2 != Long.MIN_VALUE) {
            if (!this.da) {
                a2 = Math.max(this.ca, a2);
            }
            this.ca = a2;
            this.da = false;
        }
        return this.ca;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        super.f();
        this.W.b();
    }

    /* access modifiers changed from: protected */
    public final void g() {
        this.W.a();
        super.g();
    }

    /* access modifiers changed from: protected */
    public final void h() {
        try {
            this.W.c();
            try {
                super.h();
            } finally {
                this.U.a();
                this.V.b(this.U);
            }
        } catch (Throwable th) {
            super.h();
            throw th;
        } finally {
            this.U.a();
            this.V.b(this.U);
        }
    }

    /* access modifiers changed from: protected */
    public final void k() {
        try {
            this.W.g();
        } catch (C2660tja e2) {
            throw Aia.a(e2, e());
        }
    }

    public final boolean t() {
        return this.W.h() || super.t();
    }

    public final boolean u() {
        return super.u() && this.W.e();
    }

    public final Gma y() {
        return this;
    }
}
