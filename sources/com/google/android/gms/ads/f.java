package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.C2462qqa;
import com.google.android.gms.internal.ads.Qqa;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f5383a = new f(320, 50, "320x50_mb");

    /* renamed from: b  reason: collision with root package name */
    public static final f f5384b = new f(468, 60, "468x60_as");

    /* renamed from: c  reason: collision with root package name */
    public static final f f5385c = new f(320, 100, "320x100_as");

    /* renamed from: d  reason: collision with root package name */
    public static final f f5386d = new f(728, 90, "728x90_as");

    /* renamed from: e  reason: collision with root package name */
    public static final f f5387e = new f(300, 250, "300x250_as");

    /* renamed from: f  reason: collision with root package name */
    public static final f f5388f = new f(160, 600, "160x600_as");

    /* renamed from: g  reason: collision with root package name */
    public static final f f5389g = new f(-1, -2, "smart_banner");

    /* renamed from: h  reason: collision with root package name */
    public static final f f5390h = new f(-3, -4, "fluid");
    public static final f i = new f(0, 0, "invalid");
    public static final f j = new f(50, 50, "50x50_mb");
    public static final f k = new f(-3, 0, "search_v2");
    private final int l;
    private final int m;
    private final String n;
    private boolean o;
    private boolean p;
    private int q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L_0x000a:
            r1 = -2
            if (r6 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 4
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "_as"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.f.<init>(int, int):void");
    }

    f(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 >= 0 || i3 == -2 || i3 == -4) {
            this.l = i2;
            this.m = i3;
            this.n = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static f a(Context context, int i2) {
        f a2 = C0758Hk.a(context, i2, 50, 0);
        a2.o = true;
        return a2;
    }

    public final int a() {
        return this.m;
    }

    public final int a(Context context) {
        int i2 = this.m;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return C2462qqa.b(context.getResources().getDisplayMetrics());
        }
        Qqa.a();
        return C0758Hk.b(context, this.m);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.q = i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.p = true;
    }

    public final int b() {
        return this.l;
    }

    public final int b(Context context) {
        int i2 = this.l;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -1) {
            return C2462qqa.a(context.getResources().getDisplayMetrics());
        }
        Qqa.a();
        return C0758Hk.b(context, this.l);
    }

    public final boolean c() {
        return this.l == -3 && this.m == -4;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.l == fVar.l && this.m == fVar.m && this.n.equals(fVar.n);
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.q;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n;
    }
}
