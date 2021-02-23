package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.util.h  reason: case insensitive filesystem */
public final class C0502h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5589a;

    /* renamed from: b  reason: collision with root package name */
    private String f5590b;

    /* renamed from: c  reason: collision with root package name */
    private String f5591c;

    /* renamed from: d  reason: collision with root package name */
    private String f5592d;

    /* renamed from: e  reason: collision with root package name */
    private String f5593e;

    /* renamed from: f  reason: collision with root package name */
    private int f5594f;

    /* renamed from: g  reason: collision with root package name */
    private int f5595g;

    /* renamed from: h  reason: collision with root package name */
    private PointF f5596h;
    private PointF i;
    private Handler j;
    private Runnable k;

    public C0502h(Context context) {
        this.f5594f = 0;
        this.k = new C0501g(this);
        this.f5589a = context;
        this.f5595g = ViewConfiguration.get(context).getScaledTouchSlop();
        p.q().b();
        this.j = p.q().a();
    }

    public C0502h(Context context, String str) {
        this(context);
        this.f5590b = str;
    }

    private static int a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    private final boolean a(float f2, float f3, float f4, float f5) {
        return Math.abs(this.f5596h.x - f2) < ((float) this.f5595g) && Math.abs(this.f5596h.y - f3) < ((float) this.f5595g) && Math.abs(this.i.x - f4) < ((float) this.f5595g) && Math.abs(this.i.y - f5) < ((float) this.f5595g);
    }

    public final void a() {
        try {
            if (!(this.f5589a instanceof Activity)) {
                C1018Rk.c("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(p.m().a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = p.m().b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a2 = a((List<String>) arrayList, "Ad Information", true);
            int a3 = a((List<String>) arrayList, str, true);
            int a4 = a((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f5589a, p.e().d());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C0504j(this, a2, a3, a4));
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            fa.e(BuildConfig.FLAVOR, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L_0x009b
            android.content.Context r1 = r0.f5589a
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.C1018Rk.c(r1)
            return
        L_0x000e:
            java.lang.String r1 = r0.f5590b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.p.c()
            java.util.Map r1 = com.google.android.gms.ads.internal.util.oa.b((android.net.Uri) r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L_0x003f
        L_0x0062:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            java.lang.String r1 = "No debug information"
        L_0x0073:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.f5589a
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.ads.internal.util.i r3 = new com.google.android.gms.ads.internal.util.i
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.ads.internal.util.C0506l.f5615a
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L_0x009b:
            if (r5 != r2) goto L_0x00ad
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r1)
            com.google.android.gms.internal.ads.PY r1 = com.google.android.gms.internal.ads.C1252_k.f9699a
            com.google.android.gms.ads.internal.util.k r2 = new com.google.android.gms.ads.internal.util.k
            r2.<init>(r0)
            r1.execute(r2)
            return
        L_0x00ad:
            if (r5 != r3) goto L_0x00be
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r1)
            com.google.android.gms.internal.ads.PY r1 = com.google.android.gms.internal.ads.C1252_k.f9699a
            com.google.android.gms.ads.internal.util.n r2 = new com.google.android.gms.ads.internal.util.n
            r2.<init>(r0)
            r1.execute(r2)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C0502h.a(int, int, int, android.content.DialogInterface, int):void");
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f5594f = 0;
            this.f5596h = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i2 = this.f5594f;
        if (i2 != -1) {
            boolean z = true;
            if (i2 == 0 && actionMasked == 5) {
                this.f5594f = 5;
                this.i = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.j.postDelayed(this.k, ((Long) Qqa.e().a(F.Yc)).longValue());
            } else if (this.f5594f == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z2 = false;
                        for (int i3 = 0; i3 < historySize; i3++) {
                            if (!a(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3))) {
                                z2 = true;
                            }
                        }
                        if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.f5594f = -1;
                    this.j.removeCallbacks(this.k);
                }
            }
        }
    }

    public final void a(String str) {
        this.f5591c = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, DialogInterface dialogInterface, int i2) {
        p.c();
        oa.a(this.f5589a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        p.m().a(this.f5589a, this.f5591c, this.f5592d, this.f5593e);
    }

    public final void b(String str) {
        this.f5592d = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        p.m().a(this.f5589a, this.f5591c, this.f5592d);
    }

    public final void c(String str) {
        this.f5590b = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f5594f = 4;
        a();
    }

    public final void d(String str) {
        this.f5593e = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f5590b);
        sb.append(",DebugSignal: ");
        sb.append(this.f5593e);
        sb.append(",AFMA Version: ");
        sb.append(this.f5592d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f5591c);
        sb.append("}");
        return sb.toString();
    }
}
