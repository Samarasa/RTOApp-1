package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.ac  reason: case insensitive filesystem */
public class C0293ac {

    /* renamed from: a  reason: collision with root package name */
    private static final C0458yb f4365a = C0458yb.a();

    /* renamed from: b  reason: collision with root package name */
    private C0320eb f4366b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C0445wc f4367c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C0320eb f4368d;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final c.b.b.b.d.f.C0445wc b(c.b.b.b.d.f.C0445wc r2) {
        /*
            r1 = this;
            c.b.b.b.d.f.wc r0 = r1.f4367c
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            c.b.b.b.d.f.wc r0 = r1.f4367c     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f4367c = r2     // Catch:{ Wb -> 0x0012 }
            c.b.b.b.d.f.eb r0 = c.b.b.b.d.f.C0320eb.f4416a     // Catch:{ Wb -> 0x0012 }
            r1.f4368d = r0     // Catch:{ Wb -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f4367c = r2     // Catch:{ all -> 0x0019 }
            c.b.b.b.d.f.eb r2 = c.b.b.b.d.f.C0320eb.f4416a     // Catch:{ all -> 0x0019 }
            r1.f4368d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            c.b.b.b.d.f.wc r2 = r1.f4367c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0293ac.b(c.b.b.b.d.f.wc):c.b.b.b.d.f.wc");
    }

    public final int a() {
        if (this.f4368d != null) {
            return this.f4368d.a();
        }
        if (this.f4367c != null) {
            return this.f4367c.f();
        }
        return 0;
    }

    public final C0445wc a(C0445wc wcVar) {
        C0445wc wcVar2 = this.f4367c;
        this.f4366b = null;
        this.f4368d = null;
        this.f4367c = wcVar;
        return wcVar2;
    }

    public final C0320eb b() {
        if (this.f4368d != null) {
            return this.f4368d;
        }
        synchronized (this) {
            if (this.f4368d != null) {
                C0320eb ebVar = this.f4368d;
                return ebVar;
            }
            this.f4368d = this.f4367c == null ? C0320eb.f4416a : this.f4367c.d();
            C0320eb ebVar2 = this.f4368d;
            return ebVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0293ac)) {
            return false;
        }
        C0293ac acVar = (C0293ac) obj;
        C0445wc wcVar = this.f4367c;
        C0445wc wcVar2 = acVar.f4367c;
        return (wcVar == null && wcVar2 == null) ? b().equals(acVar.b()) : (wcVar == null || wcVar2 == null) ? wcVar != null ? wcVar.equals(acVar.b(wcVar.a())) : b(wcVar2.a()).equals(wcVar2) : wcVar.equals(wcVar2);
    }

    public int hashCode() {
        return 1;
    }
}
