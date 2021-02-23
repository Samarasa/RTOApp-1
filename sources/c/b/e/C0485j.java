package c.b.e;

import c.b.e.C0485j.a;
import c.b.e.M;
import c.b.e.p;
import c.b.e.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.b.e.j  reason: case insensitive filesystem */
final class C0485j<FieldDescriptorType extends a<FieldDescriptorType>> {

    /* renamed from: a  reason: collision with root package name */
    private static final C0485j f5027a = new C0485j(true);

    /* renamed from: b  reason: collision with root package name */
    private final z<FieldDescriptorType, Object> f5028b = z.b(16);

    /* renamed from: c  reason: collision with root package name */
    private boolean f5029c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5030d = false;

    /* renamed from: c.b.e.j$a */
    public interface a<T extends a<T>> extends Comparable<T> {
        r.a a(r.a aVar, r rVar);

        boolean f();

        M.a g();

        M.b j();
    }

    private C0485j() {
    }

    private C0485j(boolean z) {
        c();
    }

    private Object a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r3 instanceof c.b.e.p) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 instanceof java.lang.Integer) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(c.b.e.M.a r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x0048
            int[] r0 = c.b.e.C0484i.f5025a
            c.b.e.M$b r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003b;
                case 2: goto L_0x0038;
                case 3: goto L_0x0035;
                case 4: goto L_0x0032;
                case 5: goto L_0x002f;
                case 6: goto L_0x002c;
                case 7: goto L_0x0023;
                case 8: goto L_0x001e;
                case 9: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003d
        L_0x0014:
            boolean r2 = r3 instanceof c.b.e.r
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof c.b.e.p
            if (r2 == 0) goto L_0x003d
        L_0x001c:
            r1 = 1
            goto L_0x003d
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x001c
            goto L_0x003d
        L_0x0023:
            boolean r2 = r3 instanceof c.b.e.C0480e
            if (r2 != 0) goto L_0x001c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x003d
            goto L_0x001c
        L_0x002c:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x003d
        L_0x002f:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x003d
        L_0x0032:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x003d
        L_0x0035:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x003d
        L_0x0038:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x003d
        L_0x003b:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x003d:
            if (r1 == 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x0048:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
            goto L_0x004f
        L_0x004e:
            throw r2
        L_0x004f:
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.C0485j.a(c.b.e.M$a, java.lang.Object):void");
    }

    private void a(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        z<FieldDescriptorType, Object> zVar;
        Object a2;
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof p) {
            value = ((p) value).a();
        }
        if (aVar.f()) {
            Object a3 = a(aVar);
            if (a3 == null) {
                a3 = new ArrayList();
            }
            for (Object a4 : (List) value) {
                ((List) a3).add(a(a4));
            }
            this.f5028b.put(aVar, a3);
            return;
        }
        if (aVar.j() != M.b.MESSAGE || (a2 = a(aVar)) == null) {
            zVar = this.f5028b;
            obj = a(value);
        } else {
            obj = aVar.a(((r) a2).b(), (r) value).build();
            zVar = this.f5028b;
        }
        zVar.put(aVar, obj);
    }

    public static <T extends a<T>> C0485j<T> d() {
        return new C0485j<>();
    }

    public Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f5028b.get(fielddescriptortype);
        return obj instanceof p ? ((p) obj).a() : obj;
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.f()) {
            a(fielddescriptortype.g(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object a2 : arrayList) {
                a(fielddescriptortype.g(), a2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof p) {
            this.f5030d = true;
        }
        this.f5028b.put(fielddescriptortype, obj);
    }

    public void a(C0485j<FieldDescriptorType> jVar) {
        for (int i = 0; i < jVar.f5028b.a(); i++) {
            a(jVar.f5028b.a(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> a2 : jVar.f5028b.c()) {
            a(a2);
        }
    }

    public boolean a() {
        return this.f5029c;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> b() {
        return this.f5030d ? new p.b(this.f5028b.entrySet().iterator()) : this.f5028b.entrySet().iterator();
    }

    public void c() {
        if (!this.f5029c) {
            this.f5028b.e();
            this.f5029c = true;
        }
    }

    public C0485j<FieldDescriptorType> clone() {
        C0485j<FieldDescriptorType> d2 = d();
        for (int i = 0; i < this.f5028b.a(); i++) {
            Map.Entry<FieldDescriptorType, Object> a2 = this.f5028b.a(i);
            d2.a((FieldDescriptorType) (a) a2.getKey(), a2.getValue());
        }
        for (Map.Entry next : this.f5028b.c()) {
            d2.a((FieldDescriptorType) (a) next.getKey(), next.getValue());
        }
        d2.f5030d = this.f5030d;
        return d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0485j)) {
            return false;
        }
        return this.f5028b.equals(((C0485j) obj).f5028b);
    }

    public int hashCode() {
        return this.f5028b.hashCode();
    }
}
