package g;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import g.a.b;
import g.a.b.g;
import g.a.c.c;
import g.a.c.h;
import g.a.c.k;
import g.a.f.e;
import g.w;
import java.io.IOException;
import java.util.ArrayList;

final class G implements C3345f {

    /* renamed from: a  reason: collision with root package name */
    final E f14875a;

    /* renamed from: b  reason: collision with root package name */
    final k f14876b;

    /* renamed from: c  reason: collision with root package name */
    final w f14877c;

    /* renamed from: d  reason: collision with root package name */
    final H f14878d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f14879e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14880f;

    final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private final C3346g f14881b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f14882c;

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[SYNTHETIC, Splitter:B:12:0x0032] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052 A[Catch:{ all -> 0x002b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                g.G r2 = r5.f14882c     // Catch:{ IOException -> 0x002d }
                g.K r2 = r2.a()     // Catch:{ IOException -> 0x002d }
                g.G r3 = r5.f14882c     // Catch:{ IOException -> 0x002d }
                g.a.c.k r3 = r3.f14876b     // Catch:{ IOException -> 0x002d }
                boolean r1 = r3.a()     // Catch:{ IOException -> 0x002d }
                if (r1 == 0) goto L_0x0021
                g.g r1 = r5.f14881b     // Catch:{ IOException -> 0x0029 }
                g.G r2 = r5.f14882c     // Catch:{ IOException -> 0x0029 }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x0029 }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x0029 }
                r1.a((g.C3345f) r2, (java.io.IOException) r3)     // Catch:{ IOException -> 0x0029 }
                goto L_0x0059
            L_0x0021:
                g.g r1 = r5.f14881b     // Catch:{ IOException -> 0x0029 }
                g.G r3 = r5.f14882c     // Catch:{ IOException -> 0x0029 }
                r1.a((g.C3345f) r3, (g.K) r2)     // Catch:{ IOException -> 0x0029 }
                goto L_0x0059
            L_0x0029:
                r1 = move-exception
                goto L_0x0030
            L_0x002b:
                r0 = move-exception
                goto L_0x0065
            L_0x002d:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x0030:
                if (r0 == 0) goto L_0x0052
                g.a.f.e r0 = g.a.f.e.a()     // Catch:{ all -> 0x002b }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
                r3.<init>()     // Catch:{ all -> 0x002b }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x002b }
                g.G r4 = r5.f14882c     // Catch:{ all -> 0x002b }
                java.lang.String r4 = r4.d()     // Catch:{ all -> 0x002b }
                r3.append(r4)     // Catch:{ all -> 0x002b }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x002b }
                r0.a((int) r2, (java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x002b }
                goto L_0x0059
            L_0x0052:
                g.g r0 = r5.f14881b     // Catch:{ all -> 0x002b }
                g.G r2 = r5.f14882c     // Catch:{ all -> 0x002b }
                r0.a((g.C3345f) r2, (java.io.IOException) r1)     // Catch:{ all -> 0x002b }
            L_0x0059:
                g.G r0 = r5.f14882c
                g.E r0 = r0.f14875a
                g.r r0 = r0.i()
                r0.a((g.G.a) r5)
                return
            L_0x0065:
                g.G r1 = r5.f14882c
                g.E r1 = r1.f14875a
                g.r r1 = r1.i()
                r1.a((g.G.a) r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.G.a.b():void");
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.f14882c.f14878d.g().g();
        }
    }

    G(E e2, H h2, boolean z) {
        w.a k = e2.k();
        this.f14875a = e2;
        this.f14878d = h2;
        this.f14879e = z;
        this.f14876b = new k(e2, z);
        this.f14877c = k.a(this);
    }

    private void e() {
        this.f14876b.a(e.a().a("response.body().close()"));
    }

    /* access modifiers changed from: package-private */
    public K a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f14875a.o());
        arrayList.add(this.f14876b);
        arrayList.add(new g.a.c.a(this.f14875a.h()));
        arrayList.add(new g.a.a.b(this.f14875a.p()));
        arrayList.add(new g.a.b.a(this.f14875a));
        if (!this.f14879e) {
            arrayList.addAll(this.f14875a.q());
        }
        arrayList.add(new g.a.c.b(this.f14879e));
        return new h(arrayList, (g) null, (c) null, (g.a.b.c) null, 0, this.f14878d).a(this.f14878d);
    }

    public boolean b() {
        return this.f14876b.a();
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f14878d.g().l();
    }

    public G clone() {
        return new G(this.f14875a, this.f14878d, this.f14879e);
    }

    /* access modifiers changed from: package-private */
    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() ? "canceled " : BuildConfig.FLAVOR);
        sb.append(this.f14879e ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c());
        return sb.toString();
    }

    public K execute() {
        synchronized (this) {
            if (!this.f14880f) {
                this.f14880f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        e();
        try {
            this.f14875a.i().a(this);
            K a2 = a();
            if (a2 != null) {
                return a2;
            }
            throw new IOException("Canceled");
        } finally {
            this.f14875a.i().b(this);
        }
    }
}
