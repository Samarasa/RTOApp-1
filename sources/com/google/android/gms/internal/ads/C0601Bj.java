package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import c.b.b.b.b.c.c;
import c.b.b.b.b.f;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0518y;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.m;
import com.google.android.gms.internal.ads.C2796vga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bj  reason: case insensitive filesystem */
public final class C0601Bj implements C0835Kj {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static List<Future<Void>> f6341a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private final C2796vga.b f6342b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashMap<String, C2796vga.h.b> f6343c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f6344d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f6345e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Context f6346f;

    /* renamed from: g  reason: collision with root package name */
    private final C0887Mj f6347g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6348h;
    private final C0809Jj i;
    private final C0965Pj j;
    private final Object k = new Object();
    private HashSet<String> l = new HashSet<>();
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    public C0601Bj(Context context, C1200Yk yk, C0809Jj jj, String str, C0887Mj mj) {
        C0563t.a(jj, (Object) "SafeBrowsing config is not present.");
        this.f6346f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6343c = new LinkedHashMap<>();
        this.f6347g = mj;
        this.i = jj;
        for (String lowerCase : this.i.f7462e) {
            this.l.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.l.remove("cookie".toLowerCase(Locale.ENGLISH));
        C2796vga.b r = C2796vga.r();
        r.a(C2796vga.g.OCTAGON_AD);
        r.a(str);
        r.b(str);
        C2796vga.a.C0082a o2 = C2796vga.a.o();
        String str2 = this.i.f7458a;
        if (str2 != null) {
            o2.a(str2);
        }
        r.a((C2796vga.a) o2.k());
        C2796vga.i.a o3 = C2796vga.i.o();
        o3.a(c.a(this.f6346f).a());
        String str3 = yk.f9456a;
        if (str3 != null) {
            o3.a(str3);
        }
        long a2 = (long) f.a().a(this.f6346f);
        if (a2 > 0) {
            o3.a(a2);
        }
        r.a((C2796vga.i) o3.k());
        this.f6342b = r;
        this.j = new C0965Pj(this.f6346f, this.i.f7465h, this);
    }

    static final /* synthetic */ Void d(String str) {
        return null;
    }

    private final C2796vga.h.b e(String str) {
        C2796vga.h.b bVar;
        synchronized (this.k) {
            bVar = this.f6343c.get(str);
        }
        return bVar;
    }

    private final LY<Void> g() {
        LY<Void> a2;
        if (!((this.f6348h && this.i.f7464g) || (this.o && this.i.f7463f) || (!this.f6348h && this.i.f7461d))) {
            return DY.a(null);
        }
        synchronized (this.k) {
            for (C2796vga.h.b k2 : this.f6343c.values()) {
                this.f6342b.a((C2796vga.h) ((C2934xea) k2.k()));
            }
            this.f6342b.a((Iterable<String>) this.f6344d);
            this.f6342b.b((Iterable<String>) this.f6345e);
            if (C0861Lj.a()) {
                String l2 = this.f6342b.l();
                String n2 = this.f6342b.n();
                StringBuilder sb = new StringBuilder(String.valueOf(l2).length() + 53 + String.valueOf(n2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(l2);
                sb.append("\n  clickUrl: ");
                sb.append(n2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (C2796vga.h next : this.f6342b.m()) {
                    sb2.append("    [");
                    sb2.append(next.p());
                    sb2.append("] ");
                    sb2.append(next.o());
                }
                C0861Lj.a(sb2.toString());
            }
            LY<String> a3 = new C0518y(this.f6346f).a(1, this.i.f7459b, (Map<String, String>) null, ((C2796vga) ((C2934xea) this.f6342b.k())).f());
            if (C0861Lj.a()) {
                a3.a(C0627Cj.f6451a, C1252_k.f9699a);
            }
            a2 = DY.a(a3, C0705Fj.f6889a, (Executor) C1252_k.f9704f);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.k) {
                            int length = optJSONArray.length();
                            C2796vga.h.b e2 = e(str);
                            if (e2 == null) {
                                String valueOf = String.valueOf(str);
                                C0861Lj.a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    e2.b(optJSONArray.getJSONObject(i2).getString("threat_type"));
                                }
                                boolean z2 = this.f6348h;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f6348h = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e3) {
                if (C0826Ka.f7567b.a().booleanValue()) {
                    C1018Rk.a("Failed to get SafeBrowsing metadata", e3);
                }
                return DY.a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f6348h) {
            synchronized (this.k) {
                this.f6342b.a(C2796vga.g.OCTAGON_AD_SB_MATCH);
            }
        }
        return g();
    }

    public final void a() {
        synchronized (this.k) {
            LY<O> a2 = DY.a(this.f6347g.a(this.f6346f, this.f6343c.keySet()), new C0653Dj(this), (Executor) C1252_k.f9704f);
            LY<O> a3 = DY.a(a2, 10, TimeUnit.SECONDS, C1252_k.f9702d);
            DY.a(a2, new C0679Ej(this, a3), (Executor) C1252_k.f9704f);
            f6341a.add(a3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bitmap bitmap) {
        Zda h2 = Lda.h();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, h2);
        synchronized (this.k) {
            C2796vga.b bVar = this.f6342b;
            C2796vga.f.b o2 = C2796vga.f.o();
            o2.a(h2.a());
            o2.a("image/png");
            o2.a(C2796vga.f.a.TYPE_CREATIVE);
            bVar.a((C2796vga.f) ((C2934xea) o2.k()));
        }
    }

    public final void a(View view) {
        if (this.i.f7460c && !this.n) {
            p.c();
            Bitmap b2 = oa.b(view);
            if (b2 == null) {
                C0861Lj.a("Failed to capture the webview bitmap.");
                return;
            }
            this.n = true;
            oa.a((Runnable) new C0575Aj(this, b2));
        }
    }

    public final void a(String str) {
        synchronized (this.k) {
            if (str == null) {
                this.f6342b.o();
            } else {
                this.f6342b.c(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.k
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.o = r2     // Catch:{ all -> 0x00bb }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vga$h$b> r2 = r6.f6343c     // Catch:{ all -> 0x00bb }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vga$h$b> r8 = r6.f6343c     // Catch:{ all -> 0x00bb }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.vga$h$b r7 = (com.google.android.gms.internal.ads.C2796vga.h.b) r7     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.vga$h$a r8 = com.google.android.gms.internal.ads.C2796vga.h.a.a(r9)     // Catch:{ all -> 0x00bb }
            r7.a((com.google.android.gms.internal.ads.C2796vga.h.a) r8)     // Catch:{ all -> 0x00bb }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.vga$h$b r1 = com.google.android.gms.internal.ads.C2796vga.h.q()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.vga$h$a r9 = com.google.android.gms.internal.ads.C2796vga.h.a.a(r9)     // Catch:{ all -> 0x00bb }
            if (r9 == 0) goto L_0x0031
            r1.a((com.google.android.gms.internal.ads.C2796vga.h.a) r9)     // Catch:{ all -> 0x00bb }
        L_0x0031:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vga$h$b> r9 = r6.f6343c     // Catch:{ all -> 0x00bb }
            int r9 = r9.size()     // Catch:{ all -> 0x00bb }
            r1.a((int) r9)     // Catch:{ all -> 0x00bb }
            r1.a((java.lang.String) r7)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.vga$d$b r9 = com.google.android.gms.internal.ads.C2796vga.d.o()     // Catch:{ all -> 0x00bb }
            java.util.HashSet<java.lang.String> r2 = r6.l     // Catch:{ all -> 0x00bb }
            int r2 = r2.size()     // Catch:{ all -> 0x00bb }
            if (r2 <= 0) goto L_0x00a9
            if (r8 == 0) goto L_0x00a9
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00bb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00bb }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00bb }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00bb }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bb }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00bb }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00bb }
            java.util.HashSet<java.lang.String> r5 = r6.l     // Catch:{ all -> 0x00bb }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.vga$c$a r4 = com.google.android.gms.internal.ads.C2796vga.c.o()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.Lda r3 = com.google.android.gms.internal.ads.Lda.a((java.lang.String) r3)     // Catch:{ all -> 0x00bb }
            r4.a(r3)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.Lda r2 = com.google.android.gms.internal.ads.Lda.a((java.lang.String) r2)     // Catch:{ all -> 0x00bb }
            r4.b(r2)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.ifa r2 = r4.k()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.xea r2 = (com.google.android.gms.internal.ads.C2934xea) r2     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.vga$c r2 = (com.google.android.gms.internal.ads.C2796vga.c) r2     // Catch:{ all -> 0x00bb }
            r9.a(r2)     // Catch:{ all -> 0x00bb }
            goto L_0x0053
        L_0x00a9:
            com.google.android.gms.internal.ads.ifa r8 = r9.k()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.xea r8 = (com.google.android.gms.internal.ads.C2934xea) r8     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.vga$d r8 = (com.google.android.gms.internal.ads.C2796vga.d) r8     // Catch:{ all -> 0x00bb }
            r1.a((com.google.android.gms.internal.ads.C2796vga.d) r8)     // Catch:{ all -> 0x00bb }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.vga$h$b> r8 = r6.f6343c     // Catch:{ all -> 0x00bb }
            r8.put(r7, r1)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x00bb:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x00bf
        L_0x00be:
            throw r7
        L_0x00bf:
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0601Bj.a(java.lang.String, java.util.Map, int):void");
    }

    public final String[] a(String[] strArr) {
        return (String[]) this.j.a(strArr).toArray(new String[0]);
    }

    public final void b() {
        this.m = true;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        synchronized (this.k) {
            this.f6344d.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        synchronized (this.k) {
            this.f6345e.add(str);
        }
    }

    public final boolean c() {
        return m.f() && this.i.f7460c && !this.n;
    }

    public final C0809Jj d() {
        return this.i;
    }
}
