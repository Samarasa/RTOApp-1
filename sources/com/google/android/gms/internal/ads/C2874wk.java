package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import c.b.b.b.b.c.c;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.ha;
import com.google.android.gms.ads.internal.util.ka;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.wk  reason: case insensitive filesystem */
public final class C2874wk {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f12669a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ka f12670b = new ka();

    /* renamed from: c  reason: collision with root package name */
    private final C0732Gk f12671c = new C0732Gk(Qqa.f(), this.f12670b);

    /* renamed from: d  reason: collision with root package name */
    private boolean f12672d = false;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f12673e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C1200Yk f12674f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public I f12675g = null;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f12676h = null;
    private final AtomicInteger i = new AtomicInteger(0);
    private final C0602Bk j = new C0602Bk((C3016yk) null);
    private final Object k = new Object();
    private LY<ArrayList<String>> l;

    @TargetApi(16)
    private static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b2 = c.a(context).b(context.getApplicationInfo().packageName, 4096);
            if (b2.requestedPermissions != null && b2.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = b2.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((b2.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final Context a() {
        return this.f12673e;
    }

    @TargetApi(23)
    public final void a(Context context, C1200Yk yk) {
        synchronized (this.f12669a) {
            if (!this.f12672d) {
                this.f12673e = context.getApplicationContext();
                this.f12674f = yk;
                p.f().a((Mna) this.f12671c);
                I i2 = null;
                this.f12670b.a(this.f12673e, (String) null, true);
                C1067Th.a(this.f12673e, this.f12674f);
                p.l();
                if (!C2854wa.f12636c.a().booleanValue()) {
                    fa.f("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    i2 = new I();
                }
                this.f12675g = i2;
                if (this.f12675g != null) {
                    C1459cl.a(new C3016yk(this).b(), "AppState.registerCsiReporter");
                }
                this.f12672d = true;
                j();
            }
        }
        p.c().b(context, yk.f9456a);
    }

    public final void a(Boolean bool) {
        synchronized (this.f12669a) {
            this.f12676h = bool;
        }
    }

    public final void a(Throwable th, String str) {
        C1067Th.a(this.f12673e, this.f12674f).a(th, str);
    }

    public final Resources b() {
        if (this.f12674f.f9459d) {
            return this.f12673e.getResources();
        }
        try {
            C1096Uk.a(this.f12673e).getResources();
            return null;
        } catch (C1148Wk e2) {
            C1018Rk.c("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void b(Throwable th, String str) {
        C1067Th.a(this.f12673e, this.f12674f).a(th, str, C0800Ja.f7440g.a().floatValue());
    }

    public final I c() {
        I i2;
        synchronized (this.f12669a) {
            i2 = this.f12675g;
        }
        return i2;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (this.f12669a) {
            bool = this.f12676h;
        }
        return bool;
    }

    public final void e() {
        this.j.a();
    }

    public final void f() {
        this.i.incrementAndGet();
    }

    public final void g() {
        this.i.decrementAndGet();
    }

    public final int h() {
        return this.i.get();
    }

    public final ha i() {
        ka kaVar;
        synchronized (this.f12669a) {
            kaVar = this.f12670b;
        }
        return kaVar;
    }

    public final LY<ArrayList<String>> j() {
        if (m.c() && this.f12673e != null) {
            if (!((Boolean) Qqa.e().a(F.Lb)).booleanValue()) {
                synchronized (this.k) {
                    if (this.l != null) {
                        LY<ArrayList<String>> ly = this.l;
                        return ly;
                    }
                    LY<ArrayList<String>> a2 = C1252_k.f9699a.a(new C3087zk(this));
                    this.l = a2;
                    return a2;
                }
            }
        }
        return DY.a(new ArrayList());
    }

    public final C0732Gk k() {
        return this.f12671c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList l() {
        return a(C0808Ji.b(this.f12673e));
    }
}
