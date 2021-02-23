package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.T;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.ha;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hA  reason: case insensitive filesystem */
public final class C1765hA {

    /* renamed from: a  reason: collision with root package name */
    private final ha f10608a;

    /* renamed from: b  reason: collision with root package name */
    private final SS f10609b;

    /* renamed from: c  reason: collision with root package name */
    private final C0981Pz f10610c;

    /* renamed from: d  reason: collision with root package name */
    private final C0877Lz f10611d;

    /* renamed from: e  reason: collision with root package name */
    private final C2332pA f10612e;

    /* renamed from: f  reason: collision with root package name */
    private final C2899xA f10613f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f10614g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f10615h;
    private final C1368bb i;
    private final C0721Fz j;

    public C1765hA(ha haVar, SS ss, C0981Pz pz, C0877Lz lz, C2332pA pAVar, C2899xA xAVar, Executor executor, Executor executor2, C0721Fz fz) {
        this.f10608a = haVar;
        this.f10609b = ss;
        this.i = ss.i;
        this.f10610c = pz;
        this.f10611d = lz;
        this.f10612e = pAVar;
        this.f10613f = xAVar;
        this.f10614g = executor;
        this.f10615h = executor2;
        this.j = fz;
    }

    private static void a(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* access modifiers changed from: private */
    public static boolean a(FA fa, String[] strArr) {
        Map<String, WeakReference<View>> i2 = fa.i();
        if (i2 == null) {
            return false;
        }
        for (String str : strArr) {
            if (i2.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final void a(FA fa) {
        this.f10614g.execute(new C1623fA(this, fa));
    }

    public final boolean a(ViewGroup viewGroup) {
        View s = this.f10611d.s();
        if (s == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (s.getParent() instanceof ViewGroup) {
            ((ViewGroup) s.getParent()).removeView(s);
        }
        viewGroup.addView(s, ((Boolean) Qqa.e().a(F.oc)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f10611d.s() == null) {
            return;
        }
        if (2 == this.f10611d.o() || 1 == this.f10611d.o()) {
            this.f10608a.a(this.f10609b.f8620f, String.valueOf(this.f10611d.o()), z);
        } else if (6 == this.f10611d.o()) {
            this.f10608a.a(this.f10609b.f8620f, "2", z);
            this.f10608a.a(this.f10609b.f8620f, "1", z);
        }
    }

    public final void b(FA fa) {
        if (fa != null && this.f10612e != null && fa.f() != null && this.f10610c.c()) {
            try {
                fa.f().addView(this.f10612e.a());
            } catch (C0605Bn e2) {
                fa.e("web view can not be obtained", e2);
            }
        }
    }

    public final void c(FA fa) {
        if (fa != null) {
            Context context = fa.e().getContext();
            if (T.a(context, this.f10610c.f8291a)) {
                if (!(context instanceof Activity)) {
                    C1018Rk.a("Activity context is needed for policy validator.");
                } else if (this.f10613f != null && fa.f() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f10613f.a((View) fa.f(), windowManager), T.a());
                    } catch (C0605Bn e2) {
                        fa.e("web view can not be obtained", e2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void d(com.google.android.gms.internal.ads.FA r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.Pz r0 = r9.f10610c
            boolean r0 = r0.e()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0015
            com.google.android.gms.internal.ads.Pz r0 = r9.f10610c
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "1098"
            java.lang.String r4 = "3011"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r4 >= r5) goto L_0x0037
            r5 = r0[r4]
            android.view.View r5 = r10.a(r5)
            if (r5 == 0) goto L_0x0034
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0034
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0038
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0037:
            r5 = r3
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            android.view.View r4 = r10.e()
            android.content.Context r4 = r4.getContext()
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            com.google.android.gms.internal.ads.Lz r7 = r9.f10611d
            android.view.View r7 = r7.p()
            if (r7 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.Lz r4 = r9.f10611d
            android.view.View r4 = r4.p()
            com.google.android.gms.internal.ads.bb r7 = r9.i
            if (r7 != 0) goto L_0x005e
            goto L_0x009b
        L_0x005e:
            if (r0 != 0) goto L_0x009b
            int r7 = r7.f9913e
            a((android.widget.RelativeLayout.LayoutParams) r6, (int) r7)
            r4.setLayoutParams(r6)
            goto L_0x009b
        L_0x0069:
            com.google.android.gms.internal.ads.Lz r7 = r9.f10611d
            com.google.android.gms.internal.ads.eb r7 = r7.A()
            boolean r7 = r7 instanceof com.google.android.gms.internal.ads.C1060Ta
            if (r7 != 0) goto L_0x0075
            r4 = r3
            goto L_0x009b
        L_0x0075:
            com.google.android.gms.internal.ads.Lz r7 = r9.f10611d
            com.google.android.gms.internal.ads.eb r7 = r7.A()
            com.google.android.gms.internal.ads.Ta r7 = (com.google.android.gms.internal.ads.C1060Ta) r7
            if (r0 != 0) goto L_0x0086
            int r8 = r7.dc()
            a((android.widget.RelativeLayout.LayoutParams) r6, (int) r8)
        L_0x0086:
            com.google.android.gms.internal.ads.Wa r8 = new com.google.android.gms.internal.ads.Wa
            r8.<init>(r4, r7, r6)
            com.google.android.gms.internal.ads.p<java.lang.String> r4 = com.google.android.gms.internal.ads.F.lc
            com.google.android.gms.internal.ads.B r6 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r4 = r6.a(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r8.setContentDescription(r4)
            r4 = r8
        L_0x009b:
            r6 = -1
            if (r4 == 0) goto L_0x00e0
            android.view.ViewParent r7 = r4.getParent()
            boolean r7 = r7 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00af
            android.view.ViewParent r7 = r4.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r4)
        L_0x00af:
            if (r0 == 0) goto L_0x00b8
            r5.removeAllViews()
            r5.addView(r4)
            goto L_0x00d9
        L_0x00b8:
            com.google.android.gms.ads.formats.a r0 = new com.google.android.gms.ads.formats.a
            android.view.View r5 = r10.e()
            android.content.Context r5 = r5.getContext()
            r0.<init>(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r6, r6)
            r0.setLayoutParams(r5)
            r0.addView(r4)
            android.widget.FrameLayout r5 = r10.f()
            if (r5 == 0) goto L_0x00d9
            r5.addView(r0)
        L_0x00d9:
            java.lang.String r0 = r10.k()
            r10.a(r0, r4, r2)
        L_0x00e0:
            java.lang.String[] r0 = com.google.android.gms.internal.ads.C1552eA.f10218a
            int r2 = r0.length
        L_0x00e3:
            if (r1 >= r2) goto L_0x00f6
            r4 = r0[r1]
            android.view.View r4 = r10.a(r4)
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00f3
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x00f7
        L_0x00f3:
            int r1 = r1 + 1
            goto L_0x00e3
        L_0x00f6:
            r0 = r3
        L_0x00f7:
            java.util.concurrent.Executor r1 = r9.f10615h
            com.google.android.gms.internal.ads.jA r2 = new com.google.android.gms.internal.ads.jA
            r2.<init>(r9, r0)
            r1.execute(r2)
            if (r0 == 0) goto L_0x01ac
            boolean r1 = r9.a((android.view.ViewGroup) r0)
            if (r1 == 0) goto L_0x0120
            com.google.android.gms.internal.ads.Lz r1 = r9.f10611d
            com.google.android.gms.internal.ads.on r1 = r1.t()
            if (r1 == 0) goto L_0x01ac
            com.google.android.gms.internal.ads.Lz r1 = r9.f10611d
            com.google.android.gms.internal.ads.on r1 = r1.t()
            com.google.android.gms.internal.ads.iA r2 = new com.google.android.gms.internal.ads.iA
            r2.<init>(r9, r10, r0)
            r1.a((com.google.android.gms.internal.ads.C1242_a) r2)
            return
        L_0x0120:
            r0.removeAllViews()
            android.view.View r1 = r10.e()
            if (r1 == 0) goto L_0x012e
            android.content.Context r1 = r1.getContext()
            goto L_0x012f
        L_0x012e:
            r1 = r3
        L_0x012f:
            if (r1 == 0) goto L_0x01ac
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.F.kc
            com.google.android.gms.internal.ads.B r4 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0156
            com.google.android.gms.internal.ads.Fz r2 = r9.j
            com.google.android.gms.internal.ads.hb r2 = r2.a()
            if (r2 == 0) goto L_0x01ac
            c.b.b.b.c.a r2 = r2.Qa()     // Catch:{ RemoteException -> 0x0150 }
            goto L_0x0162
        L_0x0150:
            java.lang.String r10 = "Could not get main image drawable"
            com.google.android.gms.internal.ads.C1018Rk.d(r10)
            return
        L_0x0156:
            com.google.android.gms.internal.ads.Lz r2 = r9.f10611d
            com.google.android.gms.internal.ads.lb r2 = r2.q()
            if (r2 == 0) goto L_0x01ac
            c.b.b.b.c.a r2 = r2.cb()     // Catch:{ RemoteException -> 0x01a7 }
        L_0x0162:
            if (r2 == 0) goto L_0x01ac
            java.lang.Object r2 = c.b.b.b.c.b.Q(r2)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            if (r2 == 0) goto L_0x01ac
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r1)
            r4.setImageDrawable(r2)
            if (r10 == 0) goto L_0x017a
            c.b.b.b.c.a r3 = r10.d()
        L_0x017a:
            if (r3 == 0) goto L_0x0196
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.F.ye
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r10 = r1.a(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x018f
            goto L_0x0196
        L_0x018f:
            java.lang.Object r10 = c.b.b.b.c.b.Q(r3)
            android.widget.ImageView$ScaleType r10 = (android.widget.ImageView.ScaleType) r10
            goto L_0x0198
        L_0x0196:
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_INSIDE
        L_0x0198:
            r4.setScaleType(r10)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r6, r6)
            r4.setLayoutParams(r10)
            r0.addView(r4)
            goto L_0x01ac
        L_0x01a7:
            java.lang.String r10 = "Could not get drawable from image"
            com.google.android.gms.internal.ads.C1018Rk.d(r10)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1765hA.d(com.google.android.gms.internal.ads.FA):void");
    }
}
