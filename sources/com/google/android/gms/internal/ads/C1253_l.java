package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0514u;
import com.google.android.gms.ads.internal.util.C0516w;
import com.google.android.gms.ads.internal.util.C0519z;
import com.google.android.gms.ads.internal.util.fa;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads._l  reason: case insensitive filesystem */
public final class C1253_l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9705a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9706b;

    /* renamed from: c  reason: collision with root package name */
    private final C1200Yk f9707c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f9708d;

    /* renamed from: e  reason: collision with root package name */
    private final T f9709e;

    /* renamed from: f  reason: collision with root package name */
    private final C0514u f9710f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f9711g;

    /* renamed from: h  reason: collision with root package name */
    private final String[] f9712h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m;
    private C0759Hl n;
    private boolean o;
    private boolean p;
    private long q = -1;

    public C1253_l(Context context, C1200Yk yk, String str, T t, Q q2) {
        C0519z zVar = new C0519z();
        C0519z zVar2 = zVar;
        zVar2.a("min_1", Double.MIN_VALUE, 1.0d);
        zVar2.a("1_5", 1.0d, 5.0d);
        zVar2.a("5_10", 5.0d, 10.0d);
        zVar2.a("10_20", 10.0d, 20.0d);
        zVar2.a("20_30", 20.0d, 30.0d);
        zVar2.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f9710f = zVar.a();
        this.f9705a = context;
        this.f9707c = yk;
        this.f9706b = str;
        this.f9709e = t;
        this.f9708d = q2;
        String str2 = (String) Qqa.e().a(F.u);
        if (str2 == null) {
            this.f9712h = new String[0];
            this.f9711g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f9712h = new String[split.length];
        this.f9711g = new long[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.f9711g[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                C1018Rk.c("Unable to parse frame hash target time number.", e2);
                this.f9711g[i2] = -1;
            }
        }
    }

    public final void a() {
        if (C0982Qa.f8356a.a().booleanValue() && !this.o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f9706b);
            bundle.putString("player", this.n.f());
            for (C0516w next : this.f9710f.a()) {
                String valueOf = String.valueOf(next.f5659a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(next.f5663e));
                String valueOf2 = String.valueOf(next.f5659a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.f5662d));
            }
            int i2 = 0;
            while (true) {
                long[] jArr = this.f9711g;
                if (i2 < jArr.length) {
                    String str = this.f9712h[i2];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i2]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i2++;
                } else {
                    p.c().a(this.f9705a, this.f9707c.f9456a, "gmob-apps", bundle, true);
                    this.o = true;
                    return;
                }
            }
        }
    }

    public final void a(C0759Hl hl) {
        N.a(this.f9709e, this.f9708d, "vpc2");
        this.i = true;
        T t = this.f9709e;
        if (t != null) {
            t.a("vpn", hl.f());
        }
        this.n = hl;
    }

    public final void b() {
        this.m = true;
        if (this.j && !this.k) {
            N.a(this.f9709e, this.f9708d, "vfp2");
            this.k = true;
        }
    }

    public final void b(C0759Hl hl) {
        if (this.k && !this.l) {
            if (fa.a() && !this.l) {
                fa.f("VideoMetricsMixin first frame");
            }
            N.a(this.f9709e, this.f9708d, "vff2");
            this.l = true;
        }
        long c2 = p.j().c();
        if (this.m && this.p && this.q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d2 = (double) (c2 - this.q);
            Double.isNaN(nanos);
            Double.isNaN(d2);
            this.f9710f.a(nanos / d2);
        }
        this.p = this.m;
        this.q = c2;
        long longValue = ((Long) Qqa.e().a(F.v)).longValue();
        long currentPosition = (long) hl.getCurrentPosition();
        int i2 = 0;
        while (true) {
            String[] strArr = this.f9712h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] != null || longValue <= Math.abs(currentPosition - this.f9711g[i2])) {
                C0759Hl hl2 = hl;
                i2++;
            } else {
                String[] strArr2 = this.f9712h;
                int i3 = 8;
                Bitmap bitmap = hl.getBitmap(8, 8);
                long j2 = 63;
                int i4 = 0;
                long j3 = 0;
                while (i4 < i3) {
                    long j4 = j2;
                    long j5 = j3;
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j5 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j4);
                        i5++;
                        j4--;
                        i3 = 8;
                    }
                    i4++;
                    j3 = j5;
                    i3 = 8;
                    j2 = j4;
                }
                strArr2[i2] = String.format("%016X", new Object[]{Long.valueOf(j3)});
                return;
            }
        }
    }

    public final void c() {
        this.m = false;
    }

    public final void d() {
        if (this.i && !this.j) {
            N.a(this.f9709e, this.f9708d, "vfr2");
            this.j = true;
        }
    }
}
