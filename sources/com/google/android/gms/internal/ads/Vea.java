package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

final class Vea extends Tea {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f9062c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private Vea() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.Rea} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.Rea} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.Rea} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.Pea
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.Rea r0 = new com.google.android.gms.internal.ads.Rea
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2652tfa
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.Fea
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.Fea r0 = (com.google.android.gms.internal.ads.Fea) r0
            com.google.android.gms.internal.ads.Fea r6 = r0.c(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007a
        L_0x002d:
            java.lang.Class<?> r1 = f9062c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0046:
            com.google.android.gms.internal.ads.C1308aga.a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads._fa
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.Rea r1 = new com.google.android.gms.internal.ads.Rea
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads._fa r0 = (com.google.android.gms.internal.ads._fa) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2652tfa
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.Fea
            if (r1 == 0) goto L_0x007a
            r1 = r0
            com.google.android.gms.internal.ads.Fea r1 = (com.google.android.gms.internal.ads.Fea) r1
            boolean r2 = r1.n()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.Fea r0 = r1.c(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vea.a(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) C1308aga.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    public final <E> void a(Object obj, Object obj2, long j) {
        List c2 = c(obj2, j);
        List a2 = a(obj, j, c2.size());
        int size = a2.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(c2);
        }
        if (size > 0) {
            c2 = a2;
        }
        C1308aga.a(obj, j, (Object) c2);
    }

    /* access modifiers changed from: package-private */
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) C1308aga.f(obj, j);
        if (list instanceof Pea) {
            obj2 = ((Pea) list).s();
        } else if (!f9062c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C2652tfa) || !(list instanceof Fea)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                Fea fea = (Fea) list;
                if (fea.n()) {
                    fea.o();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C1308aga.a(obj, j, obj2);
    }
}
