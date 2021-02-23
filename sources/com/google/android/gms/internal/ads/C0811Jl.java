package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0563t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jl  reason: case insensitive filesystem */
public final class C0811Jl extends FrameLayout implements C0681El {

    /* renamed from: a  reason: collision with root package name */
    private final C1175Xl f7481a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f7482b;

    /* renamed from: c  reason: collision with root package name */
    private final T f7483c;

    /* renamed from: d  reason: collision with root package name */
    private final C1227Zl f7484d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7485e;

    /* renamed from: f  reason: collision with root package name */
    private C0759Hl f7486f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7487g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7488h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private String m;
    private String[] n;
    private Bitmap o;
    private ImageView p;
    private boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0811Jl(Context context, C1175Xl xl, int i2, boolean z, T t, C1201Yl yl) {
        super(context);
        Context context2 = context;
        this.f7481a = xl;
        this.f7483c = t;
        this.f7482b = new FrameLayout(context);
        if (((Boolean) Qqa.e().a(F.F)).booleanValue()) {
            this.f7482b.setBackgroundResource(17170444);
        }
        addView(this.f7482b, new FrameLayout.LayoutParams(-1, -1));
        C0563t.a(xl.k());
        this.f7486f = xl.k().f5440b.a(context, xl, i2, z, t, yl);
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            this.f7482b.addView(hl, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) Qqa.e().a(F.w)).booleanValue()) {
                n();
            }
        }
        this.p = new ImageView(context);
        this.f7485e = ((Long) Qqa.e().a(F.A)).longValue();
        this.j = ((Boolean) Qqa.e().a(F.y)).booleanValue();
        T t2 = this.f7483c;
        if (t2 != null) {
            t2.a("spinner_used", this.j ? "1" : "0");
        }
        this.f7484d = new C1227Zl(this);
        C0759Hl hl2 = this.f7486f;
        if (hl2 != null) {
            hl2.a(this);
        }
        if (this.f7486f == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(C1175Xl xl) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        xl.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void a(C1175Xl xl, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        xl.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void a(C1175Xl xl, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        xl.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: private */
    public final void b(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f7481a.a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    private final boolean p() {
        return this.p.getParent() != null;
    }

    private final void q() {
        if (this.f7481a.f() != null && this.f7488h && !this.i) {
            this.f7481a.f().getWindow().clearFlags(128);
            this.f7488h = false;
        }
    }

    public final void a() {
        C0759Hl hl = this.f7486f;
        if (hl != null && this.l == 0) {
            b("canplaythrough", "duration", String.valueOf(((float) hl.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f7486f.getVideoWidth()), "videoHeight", String.valueOf(this.f7486f.getVideoHeight()));
        }
    }

    public final void a(float f2, float f3) {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.a(f2, f3);
        }
    }

    public final void a(int i2) {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.b(i2);
        }
    }

    public final void a(int i2, int i3) {
        if (this.j) {
            int max = Math.max(i2 / ((Integer) Qqa.e().a(F.z)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) Qqa.e().a(F.z)).intValue(), 1);
            Bitmap bitmap = this.o;
            if (bitmap == null || bitmap.getWidth() != max || this.o.getHeight() != max2) {
                this.o = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.q = false;
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.f7482b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public final void a(MotionEvent motionEvent) {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.dispatchTouchEvent(motionEvent);
        }
    }

    public final void a(String str, String str2) {
        b("error", "what", str, "extra", str2);
    }

    public final void a(String str, String[] strArr) {
        this.m = str;
        this.n = strArr;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z) {
        b("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void b() {
        this.f7484d.b();
        oa.f5628a.post(new C0837Kl(this));
    }

    public final void b(int i2) {
        this.f7486f.c(i2);
    }

    public final void c() {
        b("pause", new String[0]);
        q();
        this.f7487g = false;
    }

    public final void c(int i2) {
        this.f7486f.d(i2);
    }

    public final void d() {
        if (this.f7487g && p()) {
            this.f7482b.removeView(this.p);
        }
        if (this.o != null) {
            long b2 = p.j().b();
            if (this.f7486f.getBitmap(this.o) != null) {
                this.q = true;
            }
            long b3 = p.j().b() - b2;
            if (fa.a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b3);
                sb.append("ms");
                fa.f(sb.toString());
            }
            if (b3 > this.f7485e) {
                C1018Rk.d("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.j = false;
                this.o = null;
                T t = this.f7483c;
                if (t != null) {
                    t.a("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void d(int i2) {
        this.f7486f.e(i2);
    }

    public final void e() {
        if (this.q && this.o != null && !p()) {
            this.p.setImageBitmap(this.o);
            this.p.invalidate();
            this.f7482b.addView(this.p, new FrameLayout.LayoutParams(-1, -1));
            this.f7482b.bringChildToFront(this.p);
        }
        this.f7484d.a();
        this.l = this.k;
        oa.f5628a.post(new C0915Nl(this));
    }

    public final void e(int i2) {
        this.f7486f.f(i2);
    }

    public final void f() {
        b("ended", new String[0]);
        q();
    }

    public final void f(int i2) {
        this.f7486f.g(i2);
    }

    public final void finalize() {
        try {
            this.f7484d.a();
            if (this.f7486f != null) {
                C0759Hl hl = this.f7486f;
                PY py = C1252_k.f9703e;
                hl.getClass();
                py.execute(C0785Il.a(hl));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        if (this.f7481a.f() != null && !this.f7488h) {
            this.i = (this.f7481a.f().getWindow().getAttributes().flags & 128) != 0;
            if (!this.i) {
                this.f7481a.f().getWindow().addFlags(128);
                this.f7488h = true;
            }
        }
        this.f7487g = true;
    }

    public final void h() {
        this.f7484d.a();
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.d();
        }
        q();
    }

    public final void i() {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.b();
        }
    }

    public final void j() {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.c();
        }
    }

    public final void k() {
        if (this.f7486f != null) {
            if (!TextUtils.isEmpty(this.m)) {
                this.f7486f.a(this.m, this.n);
            } else {
                b("no_src", new String[0]);
            }
        }
    }

    public final void l() {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.f7197b.a(true);
            hl.a();
        }
    }

    public final void m() {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.f7197b.a(false);
            hl.a();
        }
    }

    @TargetApi(14)
    public final void n() {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            TextView textView = new TextView(hl.getContext());
            String valueOf = String.valueOf(this.f7486f.f());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f7482b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f7482b.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            long currentPosition = (long) hl.getCurrentPosition();
            if (this.k != currentPosition && currentPosition > 0) {
                float f2 = ((float) currentPosition) / 1000.0f;
                if (((Boolean) Qqa.e().a(F.vb)).booleanValue()) {
                    b("timeupdate", "time", String.valueOf(f2), "totalBytes", String.valueOf(this.f7486f.getTotalBytes()), "qoeCachedBytes", String.valueOf(this.f7486f.e()), "qoeLoadedBytes", String.valueOf(this.f7486f.g()), "droppedFrames", String.valueOf(this.f7486f.h()), "reportTime", String.valueOf(p.j().a()));
                } else {
                    b("timeupdate", "time", String.valueOf(f2));
                }
                this.k = currentPosition;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f7484d.b();
        } else {
            this.f7484d.a();
            this.l = this.k;
        }
        oa.f5628a.post(new C0863Ll(this, z));
    }

    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.f7484d.b();
            z = true;
        } else {
            this.f7484d.a();
            this.l = this.k;
            z = false;
        }
        oa.f5628a.post(new C0889Ml(this, z));
    }

    public final void setVolume(float f2) {
        C0759Hl hl = this.f7486f;
        if (hl != null) {
            hl.f7197b.a(f2);
            hl.a();
        }
    }
}
