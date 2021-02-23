package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.f;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Xg  reason: case insensitive filesystem */
public final class C1170Xg extends C1734gh {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f9264c = f.b("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: d  reason: collision with root package name */
    private String f9265d = "top-right";

    /* renamed from: e  reason: collision with root package name */
    private boolean f9266e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f9267f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f9268g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f9269h = -1;
    private int i = 0;
    private int j = 0;
    private int k = -1;
    private final Object l = new Object();
    private final C2313on m;
    private final Activity n;
    private C1819ho o;
    private ImageView p;
    private LinearLayout q;
    private C1946jh r;
    private PopupWindow s;
    private RelativeLayout t;
    private ViewGroup u;

    public C1170Xg(C2313on onVar, C1946jh jhVar) {
        super(onVar, "resize");
        this.m = onVar;
        this.n = onVar.f();
        this.r = jhVar;
    }

    public final void a(int i2, int i3) {
        this.f9267f = i2;
        this.f9268g = i3;
    }

    public final void a(int i2, int i3, boolean z) {
        synchronized (this.l) {
            this.f9267f = i2;
            this.f9268g = i3;
            PopupWindow popupWindow = this.s;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a3, code lost:
        if (r5 == 5) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a5, code lost:
        r5 = ((r1.f9267f + r1.i) + r1.k) - 50;
        r8 = r1.f9268g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b1, code lost:
        r5 = ((r1.f9267f + r1.i) + r1.k) - 50;
        r8 = r1.f9268g;
        r15 = r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01bf, code lost:
        r5 = ((r1.f9267f + r1.i) + (r1.k / 2)) - 25;
        r8 = r1.f9268g;
        r15 = r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d2, code lost:
        r5 = r1.f9267f + r1.i;
        r8 = r1.f9268g;
        r15 = r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01dc, code lost:
        r8 = ((r8 + r15) + r1.f9269h) - 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01df, code lost:
        r5 = ((r1.f9267f + r1.i) + (r1.k / 2)) - 25;
        r8 = ((r1.f9268g + r1.j) + (r1.f9269h / 2)) - 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f6, code lost:
        r5 = ((r1.f9267f + r1.i) + (r1.k / 2)) - 25;
        r8 = r1.f9268g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0206, code lost:
        r5 = r1.f9267f + r1.i;
        r8 = r1.f9268g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020e, code lost:
        r8 = r8 + r1.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020f, code lost:
        if (r5 < 0) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0212, code lost:
        if ((r5 + 50) > r7) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0216, code lost:
        if (r8 < r6[0]) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x021b, code lost:
        if ((r8 + 50) <= r6[1]) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0198, code lost:
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0199, code lost:
        if (r5 == 0) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019b, code lost:
        if (r5 == 1) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019d, code lost:
        if (r5 == 2) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019f, code lost:
        if (r5 == 3) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a1, code lost:
        if (r5 == 4) goto L_0x01bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022b A[Catch:{ RuntimeException -> 0x044f }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x022d A[Catch:{ RuntimeException -> 0x044f }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028b A[Catch:{ RuntimeException -> 0x044f }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0292 A[Catch:{ RuntimeException -> 0x044f }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x041f A[Catch:{ RuntimeException -> 0x044f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.Object r2 = r1.l
            monitor-enter(r2)
            android.app.Activity r3 = r1.n     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.on r3 = r1.m     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.ho r3 = r3.m()     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.on r3 = r1.m     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.ho r3 = r3.m()     // Catch:{ all -> 0x04a5 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x04a5 }
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x0034:
            com.google.android.gms.internal.ads.on r3 = r1.m     // Catch:{ all -> 0x04a5 }
            boolean r3 = r3.j()     // Catch:{ all -> 0x04a5 }
            if (r3 == 0) goto L_0x0043
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x0043:
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04a5 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x0062
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04a5 }
            int r3 = com.google.android.gms.ads.internal.util.oa.a((java.lang.String) r3)     // Catch:{ all -> 0x04a5 }
            r1.k = r3     // Catch:{ all -> 0x04a5 }
        L_0x0062:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04a5 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x0081
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04a5 }
            int r3 = com.google.android.gms.ads.internal.util.oa.a((java.lang.String) r3)     // Catch:{ all -> 0x04a5 }
            r1.f9269h = r3     // Catch:{ all -> 0x04a5 }
        L_0x0081:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04a5 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x00a0
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04a5 }
            int r3 = com.google.android.gms.ads.internal.util.oa.a((java.lang.String) r3)     // Catch:{ all -> 0x04a5 }
            r1.i = r3     // Catch:{ all -> 0x04a5 }
        L_0x00a0:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04a5 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x00bf
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04a5 }
            int r3 = com.google.android.gms.ads.internal.util.oa.a((java.lang.String) r3)     // Catch:{ all -> 0x04a5 }
            r1.j = r3     // Catch:{ all -> 0x04a5 }
        L_0x00bf:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x04a5 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x00db
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04a5 }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x04a5 }
            r1.f9266e = r3     // Catch:{ all -> 0x04a5 }
        L_0x00db:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x04a5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04a5 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x04a5 }
            if (r3 != 0) goto L_0x00eb
            r1.f9265d = r0     // Catch:{ all -> 0x04a5 }
        L_0x00eb:
            int r0 = r1.k     // Catch:{ all -> 0x04a5 }
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L_0x00f7
            int r0 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            if (r0 < 0) goto L_0x00f7
            r0 = 1
            goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x0101:
            android.app.Activity r0 = r1.n     // Catch:{ all -> 0x04a5 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x04a5 }
            if (r0 == 0) goto L_0x049e
            android.view.View r5 = r0.getDecorView()     // Catch:{ all -> 0x04a5 }
            if (r5 != 0) goto L_0x0111
            goto L_0x049e
        L_0x0111:
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r5 = r1.n     // Catch:{ all -> 0x04a5 }
            int[] r5 = com.google.android.gms.ads.internal.util.oa.b((android.app.Activity) r5)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r6 = r1.n     // Catch:{ all -> 0x04a5 }
            int[] r6 = com.google.android.gms.ads.internal.util.oa.c((android.app.Activity) r6)     // Catch:{ all -> 0x04a5 }
            r7 = r5[r4]     // Catch:{ all -> 0x04a5 }
            r5 = r5[r3]     // Catch:{ all -> 0x04a5 }
            int r8 = r1.k     // Catch:{ all -> 0x04a5 }
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = -1
            r13 = 2
            r14 = 50
            if (r8 < r14) goto L_0x0223
            int r8 = r1.k     // Catch:{ all -> 0x04a5 }
            if (r8 <= r7) goto L_0x0138
            goto L_0x0223
        L_0x0138:
            int r8 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            if (r8 < r14) goto L_0x0220
            int r8 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            if (r8 <= r5) goto L_0x0142
            goto L_0x0220
        L_0x0142:
            int r8 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            if (r8 != r5) goto L_0x014e
            int r5 = r1.k     // Catch:{ all -> 0x04a5 }
            if (r5 != r7) goto L_0x014e
            java.lang.String r5 = "Cannot resize to a full-screen ad."
            goto L_0x0225
        L_0x014e:
            boolean r5 = r1.f9266e     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x021e
            java.lang.String r5 = r1.f9265d     // Catch:{ all -> 0x04a5 }
            int r8 = r5.hashCode()     // Catch:{ all -> 0x04a5 }
            switch(r8) {
                case -1364013995: goto L_0x018e;
                case -1012429441: goto L_0x0184;
                case -655373719: goto L_0x017a;
                case 1163912186: goto L_0x0170;
                case 1288627767: goto L_0x0166;
                case 1755462605: goto L_0x015c;
                default: goto L_0x015b;
            }     // Catch:{ all -> 0x04a5 }
        L_0x015b:
            goto L_0x0198
        L_0x015c:
            java.lang.String r8 = "top-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0198
            r5 = 1
            goto L_0x0199
        L_0x0166:
            java.lang.String r8 = "bottom-center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0198
            r5 = 4
            goto L_0x0199
        L_0x0170:
            java.lang.String r8 = "bottom-right"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0198
            r5 = 5
            goto L_0x0199
        L_0x017a:
            java.lang.String r8 = "bottom-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0198
            r5 = 3
            goto L_0x0199
        L_0x0184:
            java.lang.String r8 = "top-left"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0198
            r5 = 0
            goto L_0x0199
        L_0x018e:
            java.lang.String r8 = "center"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0198
            r5 = 2
            goto L_0x0199
        L_0x0198:
            r5 = -1
        L_0x0199:
            if (r5 == 0) goto L_0x0206
            if (r5 == r3) goto L_0x01f6
            if (r5 == r13) goto L_0x01df
            if (r5 == r11) goto L_0x01d2
            if (r5 == r10) goto L_0x01bf
            if (r5 == r9) goto L_0x01b1
            int r5 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r8 = r1.k     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            goto L_0x0203
        L_0x01b1:
            int r5 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r8 = r1.k     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r5 = r5 - r14
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            int r15 = r1.j     // Catch:{ all -> 0x04a5 }
            goto L_0x01ce
        L_0x01bf:
            int r5 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r8 = r1.k     // Catch:{ all -> 0x04a5 }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            int r15 = r1.j     // Catch:{ all -> 0x04a5 }
        L_0x01ce:
            int r8 = r8 + r15
            int r15 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            goto L_0x01dc
        L_0x01d2:
            int r5 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            int r15 = r1.j     // Catch:{ all -> 0x04a5 }
            goto L_0x01ce
        L_0x01dc:
            int r8 = r8 + r15
            int r8 = r8 - r14
            goto L_0x020f
        L_0x01df:
            int r5 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r8 = r1.k     // Catch:{ all -> 0x04a5 }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            int r15 = r1.j     // Catch:{ all -> 0x04a5 }
            int r8 = r8 + r15
            int r15 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            int r15 = r15 / r13
            int r8 = r8 + r15
            int r8 = r8 + -25
            goto L_0x020f
        L_0x01f6:
            int r5 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r8 = r1.k     // Catch:{ all -> 0x04a5 }
            int r8 = r8 / r13
            int r5 = r5 + r8
            int r5 = r5 + -25
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
        L_0x0203:
            int r15 = r1.j     // Catch:{ all -> 0x04a5 }
            goto L_0x020e
        L_0x0206:
            int r5 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r5 = r5 + r8
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            goto L_0x0203
        L_0x020e:
            int r8 = r8 + r15
        L_0x020f:
            if (r5 < 0) goto L_0x0228
            int r5 = r5 + r14
            if (r5 > r7) goto L_0x0228
            r5 = r6[r4]     // Catch:{ all -> 0x04a5 }
            if (r8 < r5) goto L_0x0228
            int r8 = r8 + r14
            r5 = r6[r3]     // Catch:{ all -> 0x04a5 }
            if (r8 <= r5) goto L_0x021e
            goto L_0x0228
        L_0x021e:
            r5 = 1
            goto L_0x0229
        L_0x0220:
            java.lang.String r5 = "Height is too small or too large."
            goto L_0x0225
        L_0x0223:
            java.lang.String r5 = "Width is too small or too large."
        L_0x0225:
            com.google.android.gms.internal.ads.C1018Rk.d(r5)     // Catch:{ all -> 0x04a5 }
        L_0x0228:
            r5 = 0
        L_0x0229:
            if (r5 != 0) goto L_0x022d
            r5 = 0
            goto L_0x0289
        L_0x022d:
            boolean r5 = r1.f9266e     // Catch:{ all -> 0x04a5 }
            if (r5 == 0) goto L_0x0242
            int[] r5 = new int[r13]     // Catch:{ all -> 0x04a5 }
            int r6 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r7 = r1.i     // Catch:{ all -> 0x04a5 }
            int r6 = r6 + r7
            r5[r4] = r6     // Catch:{ all -> 0x04a5 }
            int r6 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            int r7 = r1.j     // Catch:{ all -> 0x04a5 }
            int r6 = r6 + r7
            r5[r3] = r6     // Catch:{ all -> 0x04a5 }
            goto L_0x0289
        L_0x0242:
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r5 = r1.n     // Catch:{ all -> 0x04a5 }
            int[] r5 = com.google.android.gms.ads.internal.util.oa.b((android.app.Activity) r5)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r6 = r1.n     // Catch:{ all -> 0x04a5 }
            int[] r6 = com.google.android.gms.ads.internal.util.oa.c((android.app.Activity) r6)     // Catch:{ all -> 0x04a5 }
            r5 = r5[r4]     // Catch:{ all -> 0x04a5 }
            int r7 = r1.f9267f     // Catch:{ all -> 0x04a5 }
            int r8 = r1.i     // Catch:{ all -> 0x04a5 }
            int r7 = r7 + r8
            int r8 = r1.f9268g     // Catch:{ all -> 0x04a5 }
            int r15 = r1.j     // Catch:{ all -> 0x04a5 }
            int r8 = r8 + r15
            if (r7 >= 0) goto L_0x0264
            r5 = 0
            goto L_0x026e
        L_0x0264:
            int r15 = r1.k     // Catch:{ all -> 0x04a5 }
            int r15 = r15 + r7
            if (r15 <= r5) goto L_0x026d
            int r7 = r1.k     // Catch:{ all -> 0x04a5 }
            int r5 = r5 - r7
            goto L_0x026e
        L_0x026d:
            r5 = r7
        L_0x026e:
            r7 = r6[r4]     // Catch:{ all -> 0x04a5 }
            if (r8 >= r7) goto L_0x0275
            r8 = r6[r4]     // Catch:{ all -> 0x04a5 }
            goto L_0x0282
        L_0x0275:
            int r7 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            int r7 = r7 + r8
            r15 = r6[r3]     // Catch:{ all -> 0x04a5 }
            if (r7 <= r15) goto L_0x0282
            r6 = r6[r3]     // Catch:{ all -> 0x04a5 }
            int r7 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            int r8 = r6 - r7
        L_0x0282:
            int[] r6 = new int[r13]     // Catch:{ all -> 0x04a5 }
            r6[r4] = r5     // Catch:{ all -> 0x04a5 }
            r6[r3] = r8     // Catch:{ all -> 0x04a5 }
            r5 = r6
        L_0x0289:
            if (r5 != 0) goto L_0x0292
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x0292:
            com.google.android.gms.internal.ads.Qqa.a()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r6 = r1.n     // Catch:{ all -> 0x04a5 }
            int r7 = r1.k     // Catch:{ all -> 0x04a5 }
            int r6 = com.google.android.gms.internal.ads.C0758Hk.b((android.content.Context) r6, (int) r7)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.Qqa.a()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r7 = r1.n     // Catch:{ all -> 0x04a5 }
            int r8 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            int r7 = com.google.android.gms.internal.ads.C0758Hk.b((android.content.Context) r7, (int) r8)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r8 = r1.m     // Catch:{ all -> 0x04a5 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04a5 }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x04a5 }
            if (r8 == 0) goto L_0x0497
            boolean r15 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x04a5 }
            if (r15 == 0) goto L_0x0497
            r15 = r8
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r9 = r1.m     // Catch:{ all -> 0x04a5 }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04a5 }
            r15.removeView(r9)     // Catch:{ all -> 0x04a5 }
            android.widget.PopupWindow r9 = r1.s     // Catch:{ all -> 0x04a5 }
            if (r9 != 0) goto L_0x02f7
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x04a5 }
            r1.u = r8     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r8 = r1.m     // Catch:{ all -> 0x04a5 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x04a5 }
            android.graphics.Bitmap r8 = com.google.android.gms.ads.internal.util.oa.a((android.view.View) r8)     // Catch:{ all -> 0x04a5 }
            android.widget.ImageView r9 = new android.widget.ImageView     // Catch:{ all -> 0x04a5 }
            android.app.Activity r15 = r1.n     // Catch:{ all -> 0x04a5 }
            r9.<init>(r15)     // Catch:{ all -> 0x04a5 }
            r1.p = r9     // Catch:{ all -> 0x04a5 }
            android.widget.ImageView r9 = r1.p     // Catch:{ all -> 0x04a5 }
            r9.setImageBitmap(r8)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r8 = r1.m     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.ho r8 = r8.m()     // Catch:{ all -> 0x04a5 }
            r1.o = r8     // Catch:{ all -> 0x04a5 }
            android.view.ViewGroup r8 = r1.u     // Catch:{ all -> 0x04a5 }
            android.widget.ImageView r9 = r1.p     // Catch:{ all -> 0x04a5 }
            r8.addView(r9)     // Catch:{ all -> 0x04a5 }
            goto L_0x02fc
        L_0x02f7:
            android.widget.PopupWindow r8 = r1.s     // Catch:{ all -> 0x04a5 }
            r8.dismiss()     // Catch:{ all -> 0x04a5 }
        L_0x02fc:
            android.widget.RelativeLayout r8 = new android.widget.RelativeLayout     // Catch:{ all -> 0x04a5 }
            android.app.Activity r9 = r1.n     // Catch:{ all -> 0x04a5 }
            r8.<init>(r9)     // Catch:{ all -> 0x04a5 }
            r1.t = r8     // Catch:{ all -> 0x04a5 }
            android.widget.RelativeLayout r8 = r1.t     // Catch:{ all -> 0x04a5 }
            r8.setBackgroundColor(r4)     // Catch:{ all -> 0x04a5 }
            android.widget.RelativeLayout r8 = r1.t     // Catch:{ all -> 0x04a5 }
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x04a5 }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x04a5 }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            android.widget.RelativeLayout r8 = r1.t     // Catch:{ all -> 0x04a5 }
            android.widget.PopupWindow r8 = com.google.android.gms.ads.internal.util.oa.a((android.view.View) r8, (int) r6, (int) r7, (boolean) r4)     // Catch:{ all -> 0x04a5 }
            r1.s = r8     // Catch:{ all -> 0x04a5 }
            android.widget.PopupWindow r8 = r1.s     // Catch:{ all -> 0x04a5 }
            r8.setOutsideTouchable(r3)     // Catch:{ all -> 0x04a5 }
            android.widget.PopupWindow r8 = r1.s     // Catch:{ all -> 0x04a5 }
            r8.setTouchable(r3)     // Catch:{ all -> 0x04a5 }
            android.widget.PopupWindow r8 = r1.s     // Catch:{ all -> 0x04a5 }
            boolean r9 = r1.f9266e     // Catch:{ all -> 0x04a5 }
            if (r9 != 0) goto L_0x0331
            r9 = 1
            goto L_0x0332
        L_0x0331:
            r9 = 0
        L_0x0332:
            r8.setClippingEnabled(r9)     // Catch:{ all -> 0x04a5 }
            android.widget.RelativeLayout r8 = r1.t     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r9 = r1.m     // Catch:{ all -> 0x04a5 }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x04a5 }
            r8.addView(r9, r12, r12)     // Catch:{ all -> 0x04a5 }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ all -> 0x04a5 }
            android.app.Activity r9 = r1.n     // Catch:{ all -> 0x04a5 }
            r8.<init>(r9)     // Catch:{ all -> 0x04a5 }
            r1.q = r8     // Catch:{ all -> 0x04a5 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.Qqa.a()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r9 = r1.n     // Catch:{ all -> 0x04a5 }
            int r9 = com.google.android.gms.internal.ads.C0758Hk.b((android.content.Context) r9, (int) r14)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.Qqa.a()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r15 = r1.n     // Catch:{ all -> 0x04a5 }
            int r14 = com.google.android.gms.internal.ads.C0758Hk.b((android.content.Context) r15, (int) r14)     // Catch:{ all -> 0x04a5 }
            r8.<init>(r9, r14)     // Catch:{ all -> 0x04a5 }
            java.lang.String r9 = r1.f9265d     // Catch:{ all -> 0x04a5 }
            int r14 = r9.hashCode()     // Catch:{ all -> 0x04a5 }
            switch(r14) {
                case -1364013995: goto L_0x039c;
                case -1012429441: goto L_0x0392;
                case -655373719: goto L_0x0388;
                case 1163912186: goto L_0x037e;
                case 1288627767: goto L_0x0374;
                case 1755462605: goto L_0x036a;
                default: goto L_0x0369;
            }     // Catch:{ all -> 0x04a5 }
        L_0x0369:
            goto L_0x03a5
        L_0x036a:
            java.lang.String r14 = "top-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04a5 }
            if (r9 == 0) goto L_0x03a5
            r12 = 1
            goto L_0x03a5
        L_0x0374:
            java.lang.String r14 = "bottom-center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04a5 }
            if (r9 == 0) goto L_0x03a5
            r12 = 4
            goto L_0x03a5
        L_0x037e:
            java.lang.String r14 = "bottom-right"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04a5 }
            if (r9 == 0) goto L_0x03a5
            r12 = 5
            goto L_0x03a5
        L_0x0388:
            java.lang.String r14 = "bottom-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04a5 }
            if (r9 == 0) goto L_0x03a5
            r12 = 3
            goto L_0x03a5
        L_0x0392:
            java.lang.String r14 = "top-left"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04a5 }
            if (r9 == 0) goto L_0x03a5
            r12 = 0
            goto L_0x03a5
        L_0x039c:
            java.lang.String r14 = "center"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x04a5 }
            if (r9 == 0) goto L_0x03a5
            r12 = 2
        L_0x03a5:
            r9 = 9
            r14 = 10
            if (r12 == 0) goto L_0x03dc
            r15 = 14
            if (r12 == r3) goto L_0x03d8
            if (r12 == r13) goto L_0x03d2
            r13 = 12
            if (r12 == r11) goto L_0x03ce
            if (r12 == r10) goto L_0x03c7
            r9 = 11
            r10 = 5
            if (r12 == r10) goto L_0x03c3
            r8.addRule(r14)     // Catch:{ all -> 0x04a5 }
        L_0x03bf:
            r8.addRule(r9)     // Catch:{ all -> 0x04a5 }
            goto L_0x03e0
        L_0x03c3:
            r8.addRule(r13)     // Catch:{ all -> 0x04a5 }
            goto L_0x03bf
        L_0x03c7:
            r8.addRule(r13)     // Catch:{ all -> 0x04a5 }
        L_0x03ca:
            r8.addRule(r15)     // Catch:{ all -> 0x04a5 }
            goto L_0x03e0
        L_0x03ce:
            r8.addRule(r13)     // Catch:{ all -> 0x04a5 }
            goto L_0x03bf
        L_0x03d2:
            r9 = 13
            r8.addRule(r9)     // Catch:{ all -> 0x04a5 }
            goto L_0x03e0
        L_0x03d8:
            r8.addRule(r14)     // Catch:{ all -> 0x04a5 }
            goto L_0x03ca
        L_0x03dc:
            r8.addRule(r14)     // Catch:{ all -> 0x04a5 }
            goto L_0x03bf
        L_0x03e0:
            android.widget.LinearLayout r9 = r1.q     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads._g r10 = new com.google.android.gms.internal.ads._g     // Catch:{ all -> 0x04a5 }
            r10.<init>(r1)     // Catch:{ all -> 0x04a5 }
            r9.setOnClickListener(r10)     // Catch:{ all -> 0x04a5 }
            android.widget.LinearLayout r9 = r1.q     // Catch:{ all -> 0x04a5 }
            java.lang.String r10 = "Close button"
            r9.setContentDescription(r10)     // Catch:{ all -> 0x04a5 }
            android.widget.RelativeLayout r9 = r1.t     // Catch:{ all -> 0x04a5 }
            android.widget.LinearLayout r10 = r1.q     // Catch:{ all -> 0x04a5 }
            r9.addView(r10, r8)     // Catch:{ all -> 0x04a5 }
            android.widget.PopupWindow r8 = r1.s     // Catch:{ RuntimeException -> 0x044f }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x044f }
            com.google.android.gms.internal.ads.Qqa.a()     // Catch:{ RuntimeException -> 0x044f }
            android.app.Activity r9 = r1.n     // Catch:{ RuntimeException -> 0x044f }
            r10 = r5[r4]     // Catch:{ RuntimeException -> 0x044f }
            int r9 = com.google.android.gms.internal.ads.C0758Hk.b((android.content.Context) r9, (int) r10)     // Catch:{ RuntimeException -> 0x044f }
            com.google.android.gms.internal.ads.Qqa.a()     // Catch:{ RuntimeException -> 0x044f }
            android.app.Activity r10 = r1.n     // Catch:{ RuntimeException -> 0x044f }
            r11 = r5[r3]     // Catch:{ RuntimeException -> 0x044f }
            int r10 = com.google.android.gms.internal.ads.C0758Hk.b((android.content.Context) r10, (int) r11)     // Catch:{ RuntimeException -> 0x044f }
            r8.showAtLocation(r0, r4, r9, r10)     // Catch:{ RuntimeException -> 0x044f }
            r0 = r5[r4]     // Catch:{ all -> 0x04a5 }
            r8 = r5[r3]     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.jh r9 = r1.r     // Catch:{ all -> 0x04a5 }
            if (r9 == 0) goto L_0x0428
            com.google.android.gms.internal.ads.jh r9 = r1.r     // Catch:{ all -> 0x04a5 }
            int r10 = r1.k     // Catch:{ all -> 0x04a5 }
            int r11 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            r9.a(r0, r8, r10, r11)     // Catch:{ all -> 0x04a5 }
        L_0x0428:
            com.google.android.gms.internal.ads.on r0 = r1.m     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.ho r6 = com.google.android.gms.internal.ads.C1819ho.a(r6, r7)     // Catch:{ all -> 0x04a5 }
            r0.a((com.google.android.gms.internal.ads.C1819ho) r6)     // Catch:{ all -> 0x04a5 }
            r0 = r5[r4]     // Catch:{ all -> 0x04a5 }
            r3 = r5[r3]     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x04a5 }
            android.app.Activity r5 = r1.n     // Catch:{ all -> 0x04a5 }
            int[] r5 = com.google.android.gms.ads.internal.util.oa.c((android.app.Activity) r5)     // Catch:{ all -> 0x04a5 }
            r4 = r5[r4]     // Catch:{ all -> 0x04a5 }
            int r3 = r3 - r4
            int r4 = r1.k     // Catch:{ all -> 0x04a5 }
            int r5 = r1.f9269h     // Catch:{ all -> 0x04a5 }
            r1.a(r0, r3, r4, r5)     // Catch:{ all -> 0x04a5 }
            java.lang.String r0 = "resized"
            r1.c(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x044f:
            r0 = move-exception
            java.lang.String r3 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04a5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04a5 }
            int r4 = r0.length()     // Catch:{ all -> 0x04a5 }
            if (r4 == 0) goto L_0x0465
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x04a5 }
            goto L_0x046a
        L_0x0465:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x04a5 }
            r0.<init>(r3)     // Catch:{ all -> 0x04a5 }
        L_0x046a:
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            android.widget.RelativeLayout r0 = r1.t     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r3 = r1.m     // Catch:{ all -> 0x04a5 }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04a5 }
            r0.removeView(r3)     // Catch:{ all -> 0x04a5 }
            android.view.ViewGroup r0 = r1.u     // Catch:{ all -> 0x04a5 }
            if (r0 == 0) goto L_0x0495
            android.view.ViewGroup r0 = r1.u     // Catch:{ all -> 0x04a5 }
            android.widget.ImageView r3 = r1.p     // Catch:{ all -> 0x04a5 }
            r0.removeView(r3)     // Catch:{ all -> 0x04a5 }
            android.view.ViewGroup r0 = r1.u     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r3 = r1.m     // Catch:{ all -> 0x04a5 }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x04a5 }
            r0.addView(r3)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.on r0 = r1.m     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.ads.ho r3 = r1.o     // Catch:{ all -> 0x04a5 }
            r0.a((com.google.android.gms.internal.ads.C1819ho) r3)     // Catch:{ all -> 0x04a5 }
        L_0x0495:
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x0497:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x049e:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.a(r0)     // Catch:{ all -> 0x04a5 }
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            return
        L_0x04a5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04a5 }
            goto L_0x04a9
        L_0x04a8:
            throw r0
        L_0x04a9:
            goto L_0x04a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1170Xg.a(java.util.Map):void");
    }

    public final void a(boolean z) {
        synchronized (this.l) {
            if (this.s != null) {
                this.s.dismiss();
                this.t.removeView(this.m.getView());
                if (this.u != null) {
                    this.u.removeView(this.p);
                    this.u.addView(this.m.getView());
                    this.m.a(this.o);
                }
                if (z) {
                    c("default");
                    if (this.r != null) {
                        this.r.b();
                    }
                }
                this.s = null;
                this.t = null;
                this.u = null;
                this.q = null;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.l) {
            z = this.s != null;
        }
        return z;
    }
}
