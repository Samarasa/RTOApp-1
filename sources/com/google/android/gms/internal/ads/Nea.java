package com.google.android.gms.internal.ads;

public class Nea {

    /* renamed from: a  reason: collision with root package name */
    private static final C2012kea f7990a = C2012kea.a();

    /* renamed from: b  reason: collision with root package name */
    private Lda f7991b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C1872ifa f7992c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Lda f7993d;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C1872ifa b(com.google.android.gms.internal.ads.C1872ifa r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.ifa r0 = r1.f7992c
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.ads.ifa r0 = r1.f7992c     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f7992c = r2     // Catch:{ Iea -> 0x0012 }
            com.google.android.gms.internal.ads.Lda r0 = com.google.android.gms.internal.ads.Lda.f7691a     // Catch:{ Iea -> 0x0012 }
            r1.f7993d = r0     // Catch:{ Iea -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f7992c = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.ads.Lda r2 = com.google.android.gms.internal.ads.Lda.f7691a     // Catch:{ all -> 0x0019 }
            r1.f7993d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.ads.ifa r2 = r1.f7992c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Nea.b(com.google.android.gms.internal.ads.ifa):com.google.android.gms.internal.ads.ifa");
    }

    public final Lda a() {
        if (this.f7993d != null) {
            return this.f7993d;
        }
        synchronized (this) {
            if (this.f7993d != null) {
                Lda lda = this.f7993d;
                return lda;
            }
            this.f7993d = this.f7992c == null ? Lda.f7691a : this.f7992c.g();
            Lda lda2 = this.f7993d;
            return lda2;
        }
    }

    public final C1872ifa a(C1872ifa ifa) {
        C1872ifa ifa2 = this.f7992c;
        this.f7991b = null;
        this.f7993d = null;
        this.f7992c = ifa;
        return ifa2;
    }

    public final int b() {
        if (this.f7993d != null) {
            return this.f7993d.size();
        }
        if (this.f7992c != null) {
            return this.f7992c.c();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nea)) {
            return false;
        }
        Nea nea = (Nea) obj;
        C1872ifa ifa = this.f7992c;
        C1872ifa ifa2 = nea.f7992c;
        return (ifa == null && ifa2 == null) ? a().equals(nea.a()) : (ifa == null || ifa2 == null) ? ifa != null ? ifa.equals(nea.b(ifa.a())) : b(ifa2.a()).equals(ifa2) : ifa.equals(ifa2);
    }

    public int hashCode() {
        return 1;
    }
}
