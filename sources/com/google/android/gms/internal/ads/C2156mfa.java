package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mfa  reason: case insensitive filesystem */
final class C2156mfa<T> implements Cfa<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C1872ifa f11341a;

    /* renamed from: b  reason: collision with root package name */
    private final Vfa<?, ?> f11342b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11343c;

    /* renamed from: d  reason: collision with root package name */
    private final C2154mea<?> f11344d;

    private C2156mfa(Vfa<?, ?> vfa, C2154mea<?> mea, C1872ifa ifa) {
        this.f11342b = vfa;
        this.f11343c = mea.a(ifa);
        this.f11344d = mea;
        this.f11341a = ifa;
    }

    static <T> C2156mfa<T> a(Vfa<?, ?> vfa, C2154mea<?> mea, C1872ifa ifa) {
        return new C2156mfa<>(vfa, mea, ifa);
    }

    public final T a() {
        return this.f11341a.e().d();
    }

    public final void a(T t, C2583sga sga) {
        Iterator<Map.Entry<?, Object>> d2 = this.f11344d.a((Object) t).d();
        if (!d2.hasNext()) {
            Vfa<?, ?> vfa = this.f11342b;
            vfa.b(vfa.d(t), sga);
            return;
        }
        ((C2367pea) d2.next().getKey()).i();
        throw null;
    }

    public final void a(T t, C2865wfa wfa, C2012kea kea) {
        boolean z;
        Vfa<?, ?> vfa = this.f11342b;
        C2154mea<?> mea = this.f11344d;
        Object e2 = vfa.e(t);
        C2225nea<?> b2 = mea.b(t);
        do {
            try {
                if (wfa.j() == Integer.MAX_VALUE) {
                    vfa.b((Object) t, e2);
                    return;
                }
                int tag = wfa.getTag();
                if (tag == 11) {
                    Object obj = null;
                    Lda lda = null;
                    int i = 0;
                    while (wfa.j() != Integer.MAX_VALUE) {
                        int tag2 = wfa.getTag();
                        if (tag2 == 16) {
                            i = wfa.n();
                            obj = mea.a(kea, this.f11341a, i);
                        } else if (tag2 == 26) {
                            if (obj == null) {
                                lda = wfa.l();
                            } else {
                                mea.a(wfa, obj, kea, b2);
                                throw null;
                            }
                        } else if (!wfa.k()) {
                            break;
                        }
                    }
                    if (wfa.getTag() == 12) {
                        if (lda != null) {
                            if (obj == null) {
                                vfa.a(e2, i, lda);
                            } else {
                                mea.a(lda, obj, kea, b2);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw Iea.e();
                    }
                } else if ((tag & 7) == 2) {
                    Object a2 = mea.a(kea, this.f11341a, tag >>> 3);
                    if (a2 == null) {
                        z = vfa.a(e2, wfa);
                        continue;
                    } else {
                        mea.a(wfa, a2, kea, b2);
                        throw null;
                    }
                } else {
                    z = wfa.k();
                    continue;
                }
            } finally {
                vfa.b((Object) t, e2);
            }
        } while (z);
    }

    public final void a(T t, T t2) {
        Efa.a(this.f11342b, t, t2);
        if (this.f11343c) {
            Efa.a(this.f11344d, t, t2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ads.xea$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.Kda r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.xea r0 = (com.google.android.gms.internal.ads.C2934xea) r0
            com.google.android.gms.internal.ads.Yfa r1 = r0.zzino
            com.google.android.gms.internal.ads.Yfa r2 = com.google.android.gms.internal.ads.Yfa.c()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.ads.Yfa r1 = com.google.android.gms.internal.ads.Yfa.d()
            r0.zzino = r1
        L_0x0011:
            com.google.android.gms.internal.ads.xea$b r10 = (com.google.android.gms.internal.ads.C2934xea.b) r10
            r10.o()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.ads.Hda.a(r11, r12, r14)
            int r2 = r14.f7572a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.ads.mea<?> r12 = r9.f11344d
            com.google.android.gms.internal.ads.kea r0 = r14.f7575d
            com.google.android.gms.internal.ads.ifa r3 = r9.f11341a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.a(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.xea$d r0 = (com.google.android.gms.internal.ads.C2934xea.d) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.Hda.a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.Yfa) r6, (com.google.android.gms.internal.ads.Kda) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.ads.C2794vfa.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.ads.Hda.a((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.Kda) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.Hda.a(r11, r4, r14)
            int r5 = r14.f7572a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.Hda.e(r11, r4, r14)
            java.lang.Object r2 = r14.f7574c
            com.google.android.gms.internal.ads.Lda r2 = (com.google.android.gms.internal.ads.Lda) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.ads.C2794vfa.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.Hda.a(r11, r4, r14)
            int r12 = r14.f7572a
            com.google.android.gms.internal.ads.mea<?> r0 = r9.f11344d
            com.google.android.gms.internal.ads.kea r5 = r14.f7575d
            com.google.android.gms.internal.ads.ifa r6 = r9.f11341a
            java.lang.Object r0 = r0.a(r5, r6, r12)
            com.google.android.gms.internal.ads.xea$d r0 = (com.google.android.gms.internal.ads.C2934xea.d) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.Hda.a((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.ads.Kda) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.a((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.ads.Iea r10 = com.google.android.gms.internal.ads.Iea.h()
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2156mfa.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.Kda):void");
    }

    public final boolean a(T t) {
        return this.f11344d.a((Object) t).c();
    }

    public final void b(T t) {
        this.f11342b.a((Object) t);
        this.f11344d.c(t);
    }

    public final boolean b(T t, T t2) {
        if (!this.f11342b.d(t).equals(this.f11342b.d(t2))) {
            return false;
        }
        if (this.f11343c) {
            return this.f11344d.a((Object) t).equals(this.f11344d.a((Object) t2));
        }
        return true;
    }

    public final int c(T t) {
        Vfa<?, ?> vfa = this.f11342b;
        int f2 = vfa.f(vfa.d(t)) + 0;
        return this.f11343c ? f2 + this.f11344d.a((Object) t).g() : f2;
    }

    public final int d(T t) {
        int hashCode = this.f11342b.d(t).hashCode();
        return this.f11343c ? (hashCode * 53) + this.f11344d.a((Object) t).hashCode() : hashCode;
    }
}
