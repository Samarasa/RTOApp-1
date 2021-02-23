package c.b.b.b.d.f;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: c.b.b.b.d.f.qc  reason: case insensitive filesystem */
public final class C0404qc<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final C0404qc f4540a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4541b = true;

    static {
        C0404qc qcVar = new C0404qc();
        f4540a = qcVar;
        qcVar.f4541b = false;
    }

    private C0404qc() {
    }

    private C0404qc(Map<K, V> map) {
        super(map);
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return Nb.c((byte[]) obj);
        }
        if (!(obj instanceof Qb)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> C0404qc<K, V> a() {
        return f4540a;
    }

    private final void g() {
        if (!this.f4541b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void a(C0404qc<K, V> qcVar) {
        g();
        if (!qcVar.isEmpty()) {
            putAll(qcVar);
        }
    }

    public final C0404qc<K, V> b() {
        return isEmpty() ? new C0404qc<>() : new C0404qc<>(this);
    }

    public final void clear() {
        g();
        super.clear();
    }

    public final void e() {
        this.f4541b = false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0404qc.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.f4541b;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        g();
        Nb.a(k);
        Nb.a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        g();
        for (Object next : map.keySet()) {
            Nb.a(next);
            Nb.a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        g();
        return super.remove(obj);
    }
}
