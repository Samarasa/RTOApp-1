package c.b.b.b.d.f;

import java.util.Collections;
import java.util.List;

/* renamed from: c.b.b.b.d.f.ic  reason: case insensitive filesystem */
final class C0349ic extends C0328fc {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f4479c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C0349ic() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: c.b.b.b.d.f.dc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: c.b.b.b.d.f.dc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: c.b.b.b.d.f.dc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = b(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof c.b.b.b.d.f.C0307cc
            if (r1 == 0) goto L_0x0014
            c.b.b.b.d.f.dc r0 = new c.b.b.b.d.f.dc
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof c.b.b.b.d.f.Hc
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof c.b.b.b.d.f.Tb
            if (r1 == 0) goto L_0x0024
            c.b.b.b.d.f.Tb r0 = (c.b.b.b.d.f.Tb) r0
            c.b.b.b.d.f.Tb r6 = r0.a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007a
        L_0x002d:
            java.lang.Class<?> r1 = f4479c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0046:
            c.b.b.b.d.f.C0336gd.a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof c.b.b.b.d.f.C0329fd
            if (r1 == 0) goto L_0x005f
            c.b.b.b.d.f.dc r1 = new c.b.b.b.d.f.dc
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            c.b.b.b.d.f.fd r0 = (c.b.b.b.d.f.C0329fd) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof c.b.b.b.d.f.Hc
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof c.b.b.b.d.f.Tb
            if (r1 == 0) goto L_0x007a
            r1 = r0
            c.b.b.b.d.f.Tb r1 = (c.b.b.b.d.f.Tb) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            c.b.b.b.d.f.Tb r0 = r1.a(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0349ic.a(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> b(Object obj, long j) {
        return (List) C0336gd.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) C0336gd.f(obj, j);
        if (list instanceof C0307cc) {
            obj2 = ((C0307cc) list).t();
        } else if (!f4479c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof Hc) || !(list instanceof Tb)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                Tb tb = (Tb) list;
                if (tb.a()) {
                    tb.m();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C0336gd.a(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    public final <E> void a(Object obj, Object obj2, long j) {
        List b2 = b(obj2, j);
        List a2 = a(obj, j, b2.size());
        int size = a2.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(b2);
        }
        if (size > 0) {
            b2 = a2;
        }
        C0336gd.a(obj, j, (Object) b2);
    }
}
