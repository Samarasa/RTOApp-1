package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0515v;
import com.google.android.gms.ads.internal.util.U;
import com.google.android.gms.ads.internal.util.oa;

/* renamed from: com.google.android.gms.internal.ads.we  reason: case insensitive filesystem */
public final class C2862we {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f12639a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12640b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12641c;

    /* renamed from: d  reason: collision with root package name */
    private final C1200Yk f12642d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C0515v<C1870ie> f12643e;

    /* renamed from: f  reason: collision with root package name */
    private C0515v<C1870ie> f12644f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C0908Ne f12645g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f12646h;

    private C2862we(Context context, C1200Yk yk, String str) {
        this.f12639a = new Object();
        this.f12646h = 1;
        this.f12641c = str;
        this.f12640b = context.getApplicationContext();
        this.f12642d = yk;
        this.f12643e = new C0830Ke();
        this.f12644f = new C0830Ke();
    }

    public C2862we(Context context, C1200Yk yk, String str, C0515v<C1870ie> vVar, C0515v<C1870ie> vVar2) {
        this(context, yk, str);
        this.f12643e = vVar;
        this.f12644f = vVar2;
    }

    /* access modifiers changed from: protected */
    public final C0908Ne a(Qba qba) {
        C0908Ne ne = new C0908Ne(this.f12644f);
        C1252_k.f9703e.execute(new C2791ve(this, qba, ne));
        ne.a(new C0700Fe(this, ne), new C0778Ie(this, ne));
        return ne;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.C0908Ne r4, com.google.android.gms.internal.ads.C1870ie r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12639a
            monitor-enter(r0)
            int r1 = r4.a()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.a()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.b()     // Catch:{ all -> 0x002a }
            com.google.android.gms.internal.ads.PY r4 = com.google.android.gms.internal.ads.C1252_k.f9703e     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.C0622Ce.a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.fa.f(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2862we.a(com.google.android.gms.internal.ads.Ne, com.google.android.gms.internal.ads.ie):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Qba qba, C0908Ne ne) {
        try {
            Context context = this.f12640b;
            C1200Yk yk = this.f12642d;
            C1870ie vd = C0956Pa.f8226c.a().booleanValue() ? new C1115Vd(context, yk) : new C2011ke(context, yk, qba, (b) null);
            vd.a(new C0570Ae(this, ne, vd));
            vd.b("/jsLoaded", new C0596Be(this, ne, vd));
            U u = new U();
            C0674Ee ee = new C0674Ee(this, qba, vd, u);
            u.a(ee);
            vd.b("/requestReload", ee);
            if (this.f12641c.endsWith(".js")) {
                vd.e(this.f12641c);
            } else if (this.f12641c.startsWith("<html>")) {
                vd.c(this.f12641c);
            } else {
                vd.d(this.f12641c);
            }
            oa.f5628a.postDelayed(new C0648De(this, ne, vd), (long) C0752He.f7166a);
        } catch (Throwable th) {
            C1018Rk.b("Error creating webview.", th);
            p.g().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            ne.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C1870ie ieVar) {
        if (ieVar.isDestroyed()) {
            this.f12646h = 1;
        }
    }

    public final C0804Je b(Qba qba) {
        synchronized (this.f12639a) {
            synchronized (this.f12639a) {
                if (this.f12645g != null && this.f12646h == 0) {
                    this.f12645g.a(new C3004ye(this), C2933xe.f12782a);
                }
            }
            if (this.f12645g != null) {
                if (this.f12645g.a() != -1) {
                    if (this.f12646h == 0) {
                        C0804Je c2 = this.f12645g.c();
                        return c2;
                    } else if (this.f12646h == 1) {
                        this.f12646h = 2;
                        a((Qba) null);
                        C0804Je c3 = this.f12645g.c();
                        return c3;
                    } else if (this.f12646h == 2) {
                        C0804Je c4 = this.f12645g.c();
                        return c4;
                    } else {
                        C0804Je c5 = this.f12645g.c();
                        return c5;
                    }
                }
            }
            this.f12646h = 2;
            this.f12645g = a((Qba) null);
            C0804Je c6 = this.f12645g.c();
            return c6;
        }
    }
}
