package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class AZ<P> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f6123a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentMap<String, List<C3066zZ<P>>> f6124b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private C3066zZ<P> f6125c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<P> f6126d;

    private AZ(Class<P> cls) {
        this.f6126d = cls;
    }

    public static <P> AZ<P> a(Class<P> cls) {
        return new AZ<>(cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3066zZ<P> a(P r9, com.google.android.gms.internal.ads.C1796hca.a r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.bca r0 = r10.o()
            com.google.android.gms.internal.ads.bca r1 = com.google.android.gms.internal.ads.C1371bca.ENABLED
            if (r0 != r1) goto L_0x0094
            com.google.android.gms.internal.ads.zZ r0 = new com.google.android.gms.internal.ads.zZ
            int[] r1 = com.google.android.gms.internal.ads.C2002kZ.f11065a
            com.google.android.gms.internal.ads.uca r2 = r10.p()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L_0x0037
            r4 = 2
            if (r1 == r4) goto L_0x0037
            r4 = 3
            if (r1 == r4) goto L_0x002e
            r2 = 4
            if (r1 != r2) goto L_0x0026
            byte[] r1 = com.google.android.gms.internal.ads.C1790hZ.f10685a
            goto L_0x004c
        L_0x0026:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "unknown output prefix type"
            r9.<init>(r10)
            throw r9
        L_0x002e:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteBuffer r1 = r1.put(r3)
            goto L_0x0040
        L_0x0037:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r2 = 0
            java.nio.ByteBuffer r1 = r1.put(r2)
        L_0x0040:
            int r2 = r10.s()
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
        L_0x004c:
            r4 = r1
            com.google.android.gms.internal.ads.bca r5 = r10.o()
            com.google.android.gms.internal.ads.uca r6 = r10.p()
            int r7 = r10.s()
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r0)
            java.lang.String r10 = new java.lang.String
            byte[] r1 = r0.d()
            java.nio.charset.Charset r2 = f6123a
            r10.<init>(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zZ<P>>> r1 = r8.f6124b
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.Object r9 = r1.put(r10, r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0093
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r9)
            r1.add(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zZ<P>>> r9 = r8.f6124b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r9.put(r10, r1)
        L_0x0093:
            return r0
        L_0x0094:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "only ENABLED key is allowed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AZ.a(java.lang.Object, com.google.android.gms.internal.ads.hca$a):com.google.android.gms.internal.ads.zZ");
    }

    public final Class<P> a() {
        return this.f6126d;
    }

    public final void a(C3066zZ<P> zZVar) {
        if (zZVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (zZVar.b() == C1371bca.ENABLED) {
            List list = (List) this.f6124b.get(new String(zZVar.d(), f6123a));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f6125c = zZVar;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        } else {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
    }

    public final C3066zZ<P> b() {
        return this.f6125c;
    }
}
