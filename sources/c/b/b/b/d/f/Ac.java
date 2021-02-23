package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.Map;

final class Ac<T> implements Kc<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C0445wc f4093a;

    /* renamed from: b  reason: collision with root package name */
    private final C0294ad<?, ?> f4094b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4095c;

    /* renamed from: d  reason: collision with root package name */
    private final Ab<?> f4096d;

    private Ac(C0294ad<?, ?> adVar, Ab<?> ab, C0445wc wcVar) {
        this.f4094b = adVar;
        this.f4095c = ab.a(wcVar);
        this.f4096d = ab;
        this.f4093a = wcVar;
    }

    static <T> Ac<T> a(C0294ad<?, ?> adVar, Ab<?> ab, C0445wc wcVar) {
        return new Ac<>(adVar, ab, wcVar);
    }

    public final T a() {
        return this.f4093a.b().c();
    }

    public final void a(T t, C0453xd xdVar) {
        Iterator<Map.Entry<?, Object>> d2 = this.f4096d.a((Object) t).d();
        if (!d2.hasNext()) {
            C0294ad<?, ?> adVar = this.f4094b;
            adVar.b(adVar.a(t), xdVar);
            return;
        }
        ((Fb) d2.next().getKey()).l();
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: c.b.b.b.d.f.Lb$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r10, byte[] r11, int r12, int r13, c.b.b.b.d.f.C0313db r14) {
        /*
            r9 = this;
            r0 = r10
            c.b.b.b.d.f.Lb r0 = (c.b.b.b.d.f.Lb) r0
            c.b.b.b.d.f.dd r1 = r0.zzb
            c.b.b.b.d.f.dd r2 = c.b.b.b.d.f.C0315dd.a()
            if (r1 != r2) goto L_0x0011
            c.b.b.b.d.f.dd r1 = c.b.b.b.d.f.C0315dd.b()
            r0.zzb = r1
        L_0x0011:
            c.b.b.b.d.f.Lb$d r10 = (c.b.b.b.d.f.Lb.d) r10
            r10.o()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = c.b.b.b.d.f.C0292ab.a(r11, r12, r14)
            int r2 = r14.f4399a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            c.b.b.b.d.f.Ab<?> r12 = r9.f4096d
            c.b.b.b.d.f.yb r0 = r14.f4402d
            c.b.b.b.d.f.wc r3 = r9.f4093a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.a(r0, r3, r5)
            r0 = r12
            c.b.b.b.d.f.Lb$f r0 = (c.b.b.b.d.f.Lb.f) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = c.b.b.b.d.f.C0292ab.a((int) r2, (byte[]) r3, (int) r4, (int) r5, (c.b.b.b.d.f.C0315dd) r6, (c.b.b.b.d.f.C0313db) r7)
            goto L_0x0018
        L_0x0043:
            c.b.b.b.d.f.Fc.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = c.b.b.b.d.f.C0292ab.a((int) r2, (byte[]) r11, (int) r4, (int) r13, (c.b.b.b.d.f.C0313db) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = c.b.b.b.d.f.C0292ab.a(r11, r4, r14)
            int r5 = r14.f4399a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = c.b.b.b.d.f.C0292ab.e(r11, r4, r14)
            java.lang.Object r2 = r14.f4401c
            c.b.b.b.d.f.eb r2 = (c.b.b.b.d.f.C0320eb) r2
            goto L_0x0053
        L_0x0072:
            c.b.b.b.d.f.Fc.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = c.b.b.b.d.f.C0292ab.a(r11, r4, r14)
            int r12 = r14.f4399a
            c.b.b.b.d.f.Ab<?> r0 = r9.f4096d
            c.b.b.b.d.f.yb r5 = r14.f4402d
            c.b.b.b.d.f.wc r6 = r9.f4093a
            java.lang.Object r0 = r0.a(r5, r6, r12)
            c.b.b.b.d.f.Lb$f r0 = (c.b.b.b.d.f.Lb.f) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = c.b.b.b.d.f.C0292ab.a((int) r5, (byte[]) r11, (int) r4, (int) r13, (c.b.b.b.d.f.C0313db) r14)
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
            c.b.b.b.d.f.Wb r10 = c.b.b.b.d.f.Wb.e()
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.Ac.a(java.lang.Object, byte[], int, int, c.b.b.b.d.f.db):void");
    }

    public final boolean a(T t, T t2) {
        if (!this.f4094b.a(t).equals(this.f4094b.a(t2))) {
            return false;
        }
        if (this.f4095c) {
            return this.f4096d.a((Object) t).equals(this.f4096d.a((Object) t2));
        }
        return true;
    }

    public final int b(T t) {
        C0294ad<?, ?> adVar = this.f4094b;
        int c2 = adVar.c(adVar.a(t)) + 0;
        return this.f4095c ? c2 + this.f4096d.a((Object) t).g() : c2;
    }

    public final void b(T t, T t2) {
        Lc.a(this.f4094b, t, t2);
        if (this.f4095c) {
            Lc.a(this.f4096d, t, t2);
        }
    }

    public final int c(T t) {
        int hashCode = this.f4094b.a(t).hashCode();
        return this.f4095c ? (hashCode * 53) + this.f4096d.a((Object) t).hashCode() : hashCode;
    }

    public final boolean e(T t) {
        return this.f4096d.a((Object) t).f();
    }

    public final void f(T t) {
        this.f4094b.b(t);
        this.f4096d.c(t);
    }
}
