package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hh  reason: case insensitive filesystem */
public final class C1805hh extends C1734gh implements C1088Uc<C2313on> {

    /* renamed from: c  reason: collision with root package name */
    private final C2313on f10699c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f10700d;

    /* renamed from: e  reason: collision with root package name */
    private final WindowManager f10701e;

    /* renamed from: f  reason: collision with root package name */
    private final C2047l f10702f;

    /* renamed from: g  reason: collision with root package name */
    private DisplayMetrics f10703g;

    /* renamed from: h  reason: collision with root package name */
    private float f10704h;
    private int i = -1;
    private int j = -1;
    private int k;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;

    public C1805hh(C2313on onVar, Context context, C2047l lVar) {
        super(onVar);
        this.f10699c = onVar;
        this.f10700d = context;
        this.f10702f = lVar;
        this.f10701e = (WindowManager) context.getSystemService("window");
    }

    public final void a(int i2, int i3) {
        int i4 = 0;
        if (this.f10700d instanceof Activity) {
            p.c();
            i4 = oa.c((Activity) this.f10700d)[0];
        }
        if (this.f10699c.m() == null || !this.f10699c.m().e()) {
            int width = this.f10699c.getWidth();
            int height = this.f10699c.getHeight();
            if (((Boolean) Qqa.e().a(F.L)).booleanValue()) {
                if (width == 0 && this.f10699c.m() != null) {
                    width = this.f10699c.m().f10734c;
                }
                if (height == 0 && this.f10699c.m() != null) {
                    height = this.f10699c.m().f10733b;
                }
            }
            this.n = Qqa.a().a(this.f10700d, width);
            this.o = Qqa.a().a(this.f10700d, height);
        }
        b(i2, i3 - i4, this.n, this.o);
        this.f10699c.t().a(i2, i3);
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        int i2;
        C2313on onVar = (C2313on) obj;
        this.f10703g = new DisplayMetrics();
        Display defaultDisplay = this.f10701e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f10703g);
        this.f10704h = this.f10703g.density;
        this.k = defaultDisplay.getRotation();
        Qqa.a();
        DisplayMetrics displayMetrics = this.f10703g;
        this.i = C0758Hk.b(displayMetrics, displayMetrics.widthPixels);
        Qqa.a();
        DisplayMetrics displayMetrics2 = this.f10703g;
        this.j = C0758Hk.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity f2 = this.f10699c.f();
        if (f2 == null || f2.getWindow() == null) {
            this.l = this.i;
            i2 = this.j;
        } else {
            p.c();
            int[] a2 = oa.a(f2);
            Qqa.a();
            this.l = C0758Hk.b(this.f10703g, a2[0]);
            Qqa.a();
            i2 = C0758Hk.b(this.f10703g, a2[1]);
        }
        this.m = i2;
        if (this.f10699c.m().e()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.f10699c.measure(0, 0);
        }
        a(this.i, this.j, this.l, this.m, this.f10704h, this.k);
        C1592eh ehVar = new C1592eh();
        ehVar.b(this.f10702f.a());
        ehVar.a(this.f10702f.b());
        ehVar.c(this.f10702f.d());
        ehVar.d(this.f10702f.c());
        ehVar.e(true);
        this.f10699c.a("onDeviceFeaturesReceived", new C1451ch(ehVar).a());
        int[] iArr = new int[2];
        this.f10699c.getLocationOnScreen(iArr);
        a(Qqa.a().a(this.f10700d, iArr[0]), Qqa.a().a(this.f10700d, iArr[1]));
        if (C1018Rk.a(2)) {
            C1018Rk.c("Dispatching Ready Event.");
        }
        b(this.f10699c.B().f9456a);
    }
}
