package c.b.e;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final C0483h f5063a = C0483h.a();

    /* renamed from: b  reason: collision with root package name */
    private C0480e f5064b;

    /* renamed from: c  reason: collision with root package name */
    private C0483h f5065c;

    /* renamed from: d  reason: collision with root package name */
    protected volatile r f5066d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C0480e f5067e;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f5066d = r4;
        r3.f5067e = c.b.e.C0480e.f5007a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.b.e.r r4) {
        /*
            r3 = this;
            c.b.e.r r0 = r3.f5066d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            c.b.e.r r0 = r3.f5066d     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x000c:
            c.b.e.e r0 = r3.f5064b     // Catch:{ n -> 0x002a }
            if (r0 == 0) goto L_0x0025
            c.b.e.u r0 = r4.c()     // Catch:{ n -> 0x002a }
            c.b.e.e r1 = r3.f5064b     // Catch:{ n -> 0x002a }
            c.b.e.h r2 = r3.f5065c     // Catch:{ n -> 0x002a }
            java.lang.Object r0 = r0.a((c.b.e.C0480e) r1, (c.b.e.C0483h) r2)     // Catch:{ n -> 0x002a }
            c.b.e.r r0 = (c.b.e.r) r0     // Catch:{ n -> 0x002a }
            r3.f5066d = r0     // Catch:{ n -> 0x002a }
            c.b.e.e r0 = r3.f5064b     // Catch:{ n -> 0x002a }
        L_0x0022:
            r3.f5067e = r0     // Catch:{ n -> 0x002a }
            goto L_0x0030
        L_0x0025:
            r3.f5066d = r4     // Catch:{ n -> 0x002a }
            c.b.e.e r0 = c.b.e.C0480e.f5007a     // Catch:{ n -> 0x002a }
            goto L_0x0022
        L_0x002a:
            r3.f5066d = r4     // Catch:{ all -> 0x0032 }
            c.b.e.e r4 = c.b.e.C0480e.f5007a     // Catch:{ all -> 0x0032 }
            r3.f5067e = r4     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0035:
            throw r4
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.q.a(c.b.e.r):void");
    }

    public r b(r rVar) {
        a(rVar);
        return this.f5066d;
    }

    public r c(r rVar) {
        r rVar2 = this.f5066d;
        this.f5064b = null;
        this.f5067e = null;
        this.f5066d = rVar;
        return rVar2;
    }
}
