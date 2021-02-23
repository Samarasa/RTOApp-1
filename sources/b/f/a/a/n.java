package b.f.a.a;

import b.f.a.a.h;
import b.f.a.e;

public class n {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f2312a = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e0, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        if (r6 != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c4, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cf, code lost:
        r4.a(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(int r16, b.f.a.a.h r17) {
        /*
            r0 = r17
            r17.I()
            b.f.a.a.f r1 = r0.v
            b.f.a.a.p r1 = r1.d()
            b.f.a.a.f r2 = r0.w
            b.f.a.a.p r2 = r2.d()
            b.f.a.a.f r3 = r0.x
            b.f.a.a.p r3 = r3.d()
            b.f.a.a.f r4 = r0.y
            b.f.a.a.p r4 = r4.d()
            r5 = 8
            r6 = r16 & 8
            r7 = 0
            r8 = 1
            if (r6 != r5) goto L_0x0027
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            b.f.a.a.h$a[] r9 = r0.F
            r9 = r9[r7]
            b.f.a.a.h$a r10 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0038
            boolean r9 = a((b.f.a.a.h) r0, (int) r7)
            if (r9 == 0) goto L_0x0038
            r9 = 1
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r10 = r1.i
            r11 = 3
            r12 = 4
            r13 = 0
            r14 = -1
            r15 = 2
            if (r10 == r12) goto L_0x0181
            int r10 = r3.i
            if (r10 == r12) goto L_0x0181
            b.f.a.a.h$a[] r10 = r0.F
            r10 = r10[r7]
            b.f.a.a.h$a r7 = b.f.a.a.h.a.FIXED
            if (r10 == r7) goto L_0x00d7
            if (r9 == 0) goto L_0x0058
            int r7 = r17.r()
            if (r7 != r5) goto L_0x0058
            goto L_0x00d7
        L_0x0058:
            if (r9 == 0) goto L_0x0181
            int r7 = r17.s()
            r1.b(r8)
            r3.b(r8)
            b.f.a.a.f r9 = r0.v
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x0074
            b.f.a.a.f r9 = r0.x
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x0074
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0074:
            b.f.a.a.f r9 = r0.v
            b.f.a.a.f r9 = r9.f2268d
            if (r9 == 0) goto L_0x0083
            b.f.a.a.f r9 = r0.x
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x0083
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0083:
            b.f.a.a.f r9 = r0.v
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x0093
            b.f.a.a.f r9 = r0.x
            b.f.a.a.f r9 = r9.f2268d
            if (r9 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x013a
            goto L_0x012e
        L_0x0093:
            b.f.a.a.f r9 = r0.v
            b.f.a.a.f r9 = r9.f2268d
            if (r9 == 0) goto L_0x0181
            b.f.a.a.f r9 = r0.x
            b.f.a.a.f r9 = r9.f2268d
            if (r9 == 0) goto L_0x0181
            if (r6 == 0) goto L_0x00af
            b.f.a.a.q r9 = r17.m()
            r9.a(r1)
            b.f.a.a.q r9 = r17.m()
            r9.a(r3)
        L_0x00af:
            float r9 = r0.J
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00c3
            r1.b(r11)
            r3.b(r11)
            r1.b(r3, r13)
            r3.b(r1, r13)
            goto L_0x0181
        L_0x00c3:
            r1.b(r15)
            r3.b(r15)
            int r9 = -r7
            float r9 = (float) r9
            r1.b(r3, r9)
            float r9 = (float) r7
            r3.b(r1, r9)
            r0.o(r7)
            goto L_0x0181
        L_0x00d7:
            b.f.a.a.f r7 = r0.v
            b.f.a.a.f r7 = r7.f2268d
            if (r7 != 0) goto L_0x00fd
            b.f.a.a.f r7 = r0.x
            b.f.a.a.f r7 = r7.f2268d
            if (r7 != 0) goto L_0x00fd
            r1.b(r8)
            r3.b(r8)
            if (r6 == 0) goto L_0x00f4
        L_0x00eb:
            b.f.a.a.q r7 = r17.m()
            r3.a((b.f.a.a.p) r1, (int) r8, (b.f.a.a.q) r7)
            goto L_0x0181
        L_0x00f4:
            int r7 = r17.s()
        L_0x00f8:
            r3.a((b.f.a.a.p) r1, (int) r7)
            goto L_0x0181
        L_0x00fd:
            b.f.a.a.f r7 = r0.v
            b.f.a.a.f r7 = r7.f2268d
            if (r7 == 0) goto L_0x0112
            b.f.a.a.f r7 = r0.x
            b.f.a.a.f r7 = r7.f2268d
            if (r7 != 0) goto L_0x0112
            r1.b(r8)
            r3.b(r8)
            if (r6 == 0) goto L_0x00f4
            goto L_0x00eb
        L_0x0112:
            b.f.a.a.f r7 = r0.v
            b.f.a.a.f r7 = r7.f2268d
            if (r7 != 0) goto L_0x013f
            b.f.a.a.f r7 = r0.x
            b.f.a.a.f r7 = r7.f2268d
            if (r7 == 0) goto L_0x013f
            r1.b(r8)
            r3.b(r8)
            int r7 = r17.s()
            int r7 = -r7
            r1.a((b.f.a.a.p) r3, (int) r7)
            if (r6 == 0) goto L_0x0136
        L_0x012e:
            b.f.a.a.q r7 = r17.m()
            r1.a((b.f.a.a.p) r3, (int) r14, (b.f.a.a.q) r7)
            goto L_0x0181
        L_0x0136:
            int r7 = r17.s()
        L_0x013a:
            int r7 = -r7
            r1.a((b.f.a.a.p) r3, (int) r7)
            goto L_0x0181
        L_0x013f:
            b.f.a.a.f r7 = r0.v
            b.f.a.a.f r7 = r7.f2268d
            if (r7 == 0) goto L_0x0181
            b.f.a.a.f r7 = r0.x
            b.f.a.a.f r7 = r7.f2268d
            if (r7 == 0) goto L_0x0181
            r1.b(r15)
            r3.b(r15)
            if (r6 == 0) goto L_0x0170
            b.f.a.a.q r7 = r17.m()
            r7.a(r1)
            b.f.a.a.q r7 = r17.m()
            r7.a(r3)
            b.f.a.a.q r7 = r17.m()
            r1.b(r3, r14, r7)
            b.f.a.a.q r7 = r17.m()
            r3.b(r1, r8, r7)
            goto L_0x0181
        L_0x0170:
            int r7 = r17.s()
            int r7 = -r7
            float r7 = (float) r7
            r1.b(r3, r7)
            int r7 = r17.s()
            float r7 = (float) r7
            r3.b(r1, r7)
        L_0x0181:
            b.f.a.a.h$a[] r1 = r0.F
            r1 = r1[r8]
            b.f.a.a.h$a r3 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x0191
            boolean r1 = a((b.f.a.a.h) r0, (int) r8)
            if (r1 == 0) goto L_0x0191
            r1 = 1
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            int r3 = r2.i
            if (r3 == r12) goto L_0x0329
            int r3 = r4.i
            if (r3 == r12) goto L_0x0329
            b.f.a.a.h$a[] r3 = r0.F
            r3 = r3[r8]
            b.f.a.a.h$a r7 = b.f.a.a.h.a.FIXED
            if (r3 == r7) goto L_0x0247
            if (r1 == 0) goto L_0x01ac
            int r3 = r17.r()
            if (r3 != r5) goto L_0x01ac
            goto L_0x0247
        L_0x01ac:
            if (r1 == 0) goto L_0x0329
            int r1 = r17.i()
            r2.b(r8)
            r4.b(r8)
            b.f.a.a.f r3 = r0.w
            b.f.a.a.f r3 = r3.f2268d
            if (r3 != 0) goto L_0x01d4
            b.f.a.a.f r3 = r0.y
            b.f.a.a.f r3 = r3.f2268d
            if (r3 != 0) goto L_0x01d4
            if (r6 == 0) goto L_0x01cf
        L_0x01c6:
            b.f.a.a.q r0 = r17.l()
            r4.a((b.f.a.a.p) r2, (int) r8, (b.f.a.a.q) r0)
            goto L_0x0329
        L_0x01cf:
            r4.a((b.f.a.a.p) r2, (int) r1)
            goto L_0x0329
        L_0x01d4:
            b.f.a.a.f r3 = r0.w
            b.f.a.a.f r3 = r3.f2268d
            if (r3 == 0) goto L_0x01e3
            b.f.a.a.f r3 = r0.y
            b.f.a.a.f r3 = r3.f2268d
            if (r3 != 0) goto L_0x01e3
            if (r6 == 0) goto L_0x01cf
            goto L_0x01c6
        L_0x01e3:
            b.f.a.a.f r3 = r0.w
            b.f.a.a.f r3 = r3.f2268d
            if (r3 != 0) goto L_0x0200
            b.f.a.a.f r3 = r0.y
            b.f.a.a.f r3 = r3.f2268d
            if (r3 == 0) goto L_0x0200
            if (r6 == 0) goto L_0x01fa
            b.f.a.a.q r0 = r17.l()
            r2.a((b.f.a.a.p) r4, (int) r14, (b.f.a.a.q) r0)
            goto L_0x0329
        L_0x01fa:
            int r0 = -r1
            r2.a((b.f.a.a.p) r4, (int) r0)
            goto L_0x0329
        L_0x0200:
            b.f.a.a.f r3 = r0.w
            b.f.a.a.f r3 = r3.f2268d
            if (r3 == 0) goto L_0x0329
            b.f.a.a.f r3 = r0.y
            b.f.a.a.f r3 = r3.f2268d
            if (r3 == 0) goto L_0x0329
            if (r6 == 0) goto L_0x021c
            b.f.a.a.q r3 = r17.l()
            r3.a(r2)
            b.f.a.a.q r3 = r17.m()
            r3.a(r4)
        L_0x021c:
            float r3 = r0.J
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0230
            r2.b(r11)
            r4.b(r11)
            r2.b(r4, r13)
            r4.b(r2, r13)
            goto L_0x0329
        L_0x0230:
            r2.b(r15)
            r4.b(r15)
            int r3 = -r1
            float r3 = (float) r3
            r2.b(r4, r3)
            float r3 = (float) r1
            r4.b(r2, r3)
            r0.g(r1)
            int r1 = r0.V
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0247:
            b.f.a.a.f r1 = r0.w
            b.f.a.a.f r1 = r1.f2268d
            if (r1 != 0) goto L_0x0285
            b.f.a.a.f r1 = r0.y
            b.f.a.a.f r1 = r1.f2268d
            if (r1 != 0) goto L_0x0285
            r2.b(r8)
            r4.b(r8)
            if (r6 == 0) goto L_0x0263
            b.f.a.a.q r1 = r17.l()
            r4.a((b.f.a.a.p) r2, (int) r8, (b.f.a.a.q) r1)
            goto L_0x026a
        L_0x0263:
            int r1 = r17.i()
            r4.a((b.f.a.a.p) r2, (int) r1)
        L_0x026a:
            b.f.a.a.f r1 = r0.z
            b.f.a.a.f r3 = r1.f2268d
            if (r3 == 0) goto L_0x0329
            b.f.a.a.p r1 = r1.d()
            r1.b(r8)
            b.f.a.a.f r1 = r0.z
            b.f.a.a.p r1 = r1.d()
            int r0 = r0.V
            int r0 = -r0
            r2.a((int) r8, (b.f.a.a.p) r1, (int) r0)
            goto L_0x0329
        L_0x0285:
            b.f.a.a.f r1 = r0.w
            b.f.a.a.f r1 = r1.f2268d
            if (r1 == 0) goto L_0x02b9
            b.f.a.a.f r1 = r0.y
            b.f.a.a.f r1 = r1.f2268d
            if (r1 != 0) goto L_0x02b9
            r2.b(r8)
            r4.b(r8)
            if (r6 == 0) goto L_0x02a1
            b.f.a.a.q r1 = r17.l()
            r4.a((b.f.a.a.p) r2, (int) r8, (b.f.a.a.q) r1)
            goto L_0x02a8
        L_0x02a1:
            int r1 = r17.i()
            r4.a((b.f.a.a.p) r2, (int) r1)
        L_0x02a8:
            int r1 = r0.V
            if (r1 <= 0) goto L_0x0329
        L_0x02ac:
            b.f.a.a.f r1 = r0.z
            b.f.a.a.p r1 = r1.d()
            int r0 = r0.V
            r1.a((int) r8, (b.f.a.a.p) r2, (int) r0)
            goto L_0x0329
        L_0x02b9:
            b.f.a.a.f r1 = r0.w
            b.f.a.a.f r1 = r1.f2268d
            if (r1 != 0) goto L_0x02e2
            b.f.a.a.f r1 = r0.y
            b.f.a.a.f r1 = r1.f2268d
            if (r1 == 0) goto L_0x02e2
            r2.b(r8)
            r4.b(r8)
            if (r6 == 0) goto L_0x02d5
            b.f.a.a.q r1 = r17.l()
            r2.a((b.f.a.a.p) r4, (int) r14, (b.f.a.a.q) r1)
            goto L_0x02dd
        L_0x02d5:
            int r1 = r17.i()
            int r1 = -r1
            r2.a((b.f.a.a.p) r4, (int) r1)
        L_0x02dd:
            int r1 = r0.V
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x02e2:
            b.f.a.a.f r1 = r0.w
            b.f.a.a.f r1 = r1.f2268d
            if (r1 == 0) goto L_0x0329
            b.f.a.a.f r1 = r0.y
            b.f.a.a.f r1 = r1.f2268d
            if (r1 == 0) goto L_0x0329
            r2.b(r15)
            r4.b(r15)
            if (r6 == 0) goto L_0x0313
            b.f.a.a.q r1 = r17.l()
            r2.b(r4, r14, r1)
            b.f.a.a.q r1 = r17.l()
            r4.b(r2, r8, r1)
            b.f.a.a.q r1 = r17.l()
            r1.a(r2)
            b.f.a.a.q r1 = r17.m()
            r1.a(r4)
            goto L_0x0324
        L_0x0313:
            int r1 = r17.i()
            int r1 = -r1
            float r1 = (float) r1
            r2.b(r4, r1)
            int r1 = r17.i()
            float r1 = (float) r1
            r4.b(r2, r1)
        L_0x0324:
            int r1 = r0.V
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0329:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.n.a(int, b.f.a.a.h):void");
    }

    static void a(h hVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        hVar.D[i3].d().f2317g = hVar.k().v.d();
        hVar.D[i3].d().f2318h = (float) i2;
        hVar.D[i3].d().f2321b = 1;
        hVar.D[i4].d().f2317g = hVar.D[i3].d();
        hVar.D[i4].d().f2318h = (float) hVar.d(i);
        hVar.D[i4].d().f2321b = 1;
    }

    static void a(i iVar, e eVar, h hVar) {
        if (iVar.F[0] != h.a.WRAP_CONTENT && hVar.F[0] == h.a.MATCH_PARENT) {
            int i = hVar.v.f2269e;
            int s = iVar.s() - hVar.x.f2269e;
            f fVar = hVar.v;
            fVar.j = eVar.a((Object) fVar);
            f fVar2 = hVar.x;
            fVar2.j = eVar.a((Object) fVar2);
            eVar.a(hVar.v.j, i);
            eVar.a(hVar.x.j, s);
            hVar.f2291b = 2;
            hVar.a(i, s);
        }
        if (iVar.F[1] != h.a.WRAP_CONTENT && hVar.F[1] == h.a.MATCH_PARENT) {
            int i2 = hVar.w.f2269e;
            int i3 = iVar.i() - hVar.y.f2269e;
            f fVar3 = hVar.w;
            fVar3.j = eVar.a((Object) fVar3);
            f fVar4 = hVar.y;
            fVar4.j = eVar.a((Object) fVar4);
            eVar.a(hVar.w.j, i2);
            eVar.a(hVar.y.j, i3);
            if (hVar.V > 0 || hVar.r() == 8) {
                f fVar5 = hVar.z;
                fVar5.j = eVar.a((Object) fVar5);
                eVar.a(hVar.z.j, hVar.V + i2);
            }
            hVar.f2292c = 2;
            hVar.e(i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(b.f.a.a.h r5, int r6) {
        /*
            b.f.a.a.h$a[] r0 = r5.F
            r1 = r0[r6]
            b.f.a.a.h$a r2 = b.f.a.a.h.a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.J
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001d
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            b.f.a.a.h$a r6 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x001c
        L_0x001c:
            return r3
        L_0x001d:
            if (r6 != 0) goto L_0x002d
            int r6 = r5.f2295f
            if (r6 == 0) goto L_0x0024
            return r3
        L_0x0024:
            int r6 = r5.i
            if (r6 != 0) goto L_0x002c
            int r5 = r5.j
            if (r5 == 0) goto L_0x003b
        L_0x002c:
            return r3
        L_0x002d:
            int r6 = r5.f2296g
            if (r6 == 0) goto L_0x0032
            return r3
        L_0x0032:
            int r6 = r5.l
            if (r6 != 0) goto L_0x003c
            int r5 = r5.m
            if (r5 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.n.a(b.f.a.a.h, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.ma == 2) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7.na == 2) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(b.f.a.a.i r24, b.f.a.e r25, int r26, int r27, b.f.a.a.d r28) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            b.f.a.a.h r3 = r2.f2256a
            b.f.a.a.h r4 = r2.f2258c
            b.f.a.a.h r5 = r2.f2257b
            b.f.a.a.h r6 = r2.f2259d
            b.f.a.a.h r7 = r2.f2260e
            float r8 = r2.k
            b.f.a.a.h r9 = r2.f2261f
            b.f.a.a.h r2 = r2.f2262g
            r9 = r24
            b.f.a.a.h$a[] r2 = r9.F
            r2 = r2[r1]
            b.f.a.a.h$a r9 = b.f.a.a.h.a.WRAP_CONTENT
            r2 = 2
            r10 = 1
            if (r1 != 0) goto L_0x0038
            int r11 = r7.ma
            if (r11 != 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            int r12 = r7.ma
            if (r12 != r10) goto L_0x002f
            r12 = 1
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            int r7 = r7.ma
            if (r7 != r2) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x004b
        L_0x0036:
            r2 = 0
            goto L_0x004b
        L_0x0038:
            int r11 = r7.na
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r12 = r7.na
            if (r12 != r10) goto L_0x0045
            r12 = 1
            goto L_0x0046
        L_0x0045:
            r12 = 0
        L_0x0046:
            int r7 = r7.na
            if (r7 != r2) goto L_0x0036
            goto L_0x0034
        L_0x004b:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0053:
            r7 = 8
            if (r13 != 0) goto L_0x010c
            int r9 = r14.r()
            if (r9 == r7) goto L_0x00a1
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x0066
            int r9 = r14.s()
            goto L_0x006a
        L_0x0066:
            int r9 = r14.i()
        L_0x006a:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x007a
            b.f.a.a.f[] r9 = r14.D
            r9 = r9[r27]
            int r9 = r9.b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007a:
            if (r14 == r6) goto L_0x0089
            b.f.a.a.f[] r9 = r14.D
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x0089:
            b.f.a.a.f[] r9 = r14.D
            r9 = r9[r27]
            int r9 = r9.b()
            float r9 = (float) r9
            float r17 = r17 + r9
            b.f.a.a.f[] r9 = r14.D
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.b()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x00a1:
            b.f.a.a.f[] r9 = r14.D
            r9 = r9[r27]
            int r9 = r14.r()
            if (r9 == r7) goto L_0x00df
            b.f.a.a.h$a[] r7 = r14.F
            r7 = r7[r1]
            b.f.a.a.h$a r9 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r7 != r9) goto L_0x00df
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00c7
            int r7 = r14.f2295f
            if (r7 == 0) goto L_0x00bd
            r7 = 0
            return r7
        L_0x00bd:
            r7 = 0
            int r9 = r14.i
            if (r9 != 0) goto L_0x00c6
            int r9 = r14.j
            if (r9 == 0) goto L_0x00d6
        L_0x00c6:
            return r7
        L_0x00c7:
            r7 = 0
            int r9 = r14.f2296g
            if (r9 == 0) goto L_0x00cd
            return r7
        L_0x00cd:
            int r9 = r14.l
            if (r9 != 0) goto L_0x00de
            int r9 = r14.m
            if (r9 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            float r9 = r14.J
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00df
        L_0x00de:
            return r7
        L_0x00df:
            b.f.a.a.f[] r7 = r14.D
            int r9 = r27 + 1
            r7 = r7[r9]
            b.f.a.a.f r7 = r7.f2268d
            if (r7 == 0) goto L_0x0101
            b.f.a.a.h r7 = r7.f2266b
            b.f.a.a.f[] r9 = r7.D
            r20 = r7
            r7 = r9[r27]
            b.f.a.a.f r7 = r7.f2268d
            if (r7 == 0) goto L_0x0101
            r7 = r9[r27]
            b.f.a.a.f r7 = r7.f2268d
            b.f.a.a.h r7 = r7.f2266b
            if (r7 == r14) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r19 = r20
            goto L_0x0103
        L_0x0101:
            r19 = 0
        L_0x0103:
            if (r19 == 0) goto L_0x0109
            r14 = r19
            goto L_0x0053
        L_0x0109:
            r13 = 1
            goto L_0x0053
        L_0x010c:
            b.f.a.a.f[] r9 = r3.D
            r9 = r9[r27]
            b.f.a.a.p r9 = r9.d()
            b.f.a.a.f[] r13 = r4.D
            int r19 = r27 + 1
            r13 = r13[r19]
            b.f.a.a.p r13 = r13.d()
            b.f.a.a.p r7 = r9.f2315e
            if (r7 == 0) goto L_0x0382
            r21 = r3
            b.f.a.a.p r3 = r13.f2315e
            if (r3 != 0) goto L_0x012a
            goto L_0x0382
        L_0x012a:
            int r7 = r7.f2321b
            r0 = 1
            if (r7 != r0) goto L_0x0380
            int r3 = r3.f2321b
            if (r3 == r0) goto L_0x0135
            goto L_0x0380
        L_0x0135:
            if (r10 <= 0) goto L_0x013b
            if (r10 == r15) goto L_0x013b
            r0 = 0
            return r0
        L_0x013b:
            if (r2 != 0) goto L_0x0144
            if (r11 != 0) goto L_0x0144
            if (r12 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r7 = 0
            goto L_0x015d
        L_0x0144:
            if (r5 == 0) goto L_0x0150
            b.f.a.a.f[] r0 = r5.D
            r0 = r0[r27]
            int r0 = r0.b()
            float r7 = (float) r0
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            if (r6 == 0) goto L_0x015d
            b.f.a.a.f[] r0 = r6.D
            r0 = r0[r19]
            int r0 = r0.b()
            float r0 = (float) r0
            float r7 = r7 + r0
        L_0x015d:
            b.f.a.a.p r0 = r9.f2315e
            float r0 = r0.f2318h
            b.f.a.a.p r3 = r13.f2315e
            float r3 = r3.f2318h
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x016b
            float r3 = r3 - r0
            goto L_0x016d
        L_0x016b:
            float r3 = r0 - r3
        L_0x016d:
            float r3 = r3 - r16
            r22 = 1
            if (r10 <= 0) goto L_0x0223
            if (r10 != r15) goto L_0x0223
            b.f.a.a.h r2 = r14.k()
            if (r2 == 0) goto L_0x0189
            b.f.a.a.h r2 = r14.k()
            b.f.a.a.h$a[] r2 = r2.F
            r2 = r2[r1]
            b.f.a.a.h$a r5 = b.f.a.a.h.a.WRAP_CONTENT
            if (r2 != r5) goto L_0x0189
            r2 = 0
            return r2
        L_0x0189:
            float r3 = r3 + r16
            float r3 = r3 - r17
            r2 = r0
            r0 = r21
        L_0x0190:
            if (r0 == 0) goto L_0x0221
            b.f.a.f r5 = b.f.a.e.f2341b
            if (r5 == 0) goto L_0x01a8
            long r6 = r5.z
            long r6 = r6 - r22
            r5.z = r6
            long r6 = r5.r
            long r6 = r6 + r22
            r5.r = r6
            long r6 = r5.x
            long r6 = r6 + r22
            r5.x = r6
        L_0x01a8:
            b.f.a.a.h[] r5 = r0.sa
            r5 = r5[r1]
            if (r5 != 0) goto L_0x01b4
            if (r0 != r4) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r13 = r25
            goto L_0x021e
        L_0x01b4:
            float r6 = (float) r10
            float r6 = r3 / r6
            r7 = 0
            int r11 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cd
            float[] r6 = r0.qa
            r7 = r6[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01c8
            r7 = 0
            goto L_0x01ce
        L_0x01c8:
            r6 = r6[r1]
            float r6 = r6 * r3
            float r6 = r6 / r8
        L_0x01cd:
            r7 = r6
        L_0x01ce:
            int r6 = r0.r()
            r11 = 8
            if (r6 != r11) goto L_0x01d7
            r7 = 0
        L_0x01d7:
            b.f.a.a.f[] r6 = r0.D
            r6 = r6[r27]
            int r6 = r6.b()
            float r6 = (float) r6
            float r2 = r2 + r6
            b.f.a.a.f[] r6 = r0.D
            r6 = r6[r27]
            b.f.a.a.p r6 = r6.d()
            b.f.a.a.p r11 = r9.f2317g
            r6.a((b.f.a.a.p) r11, (float) r2)
            b.f.a.a.f[] r6 = r0.D
            r6 = r6[r19]
            b.f.a.a.p r6 = r6.d()
            b.f.a.a.p r11 = r9.f2317g
            float r2 = r2 + r7
            r6.a((b.f.a.a.p) r11, (float) r2)
            b.f.a.a.f[] r6 = r0.D
            r6 = r6[r27]
            b.f.a.a.p r6 = r6.d()
            r13 = r25
            r6.a((b.f.a.e) r13)
            b.f.a.a.f[] r6 = r0.D
            r6 = r6[r19]
            b.f.a.a.p r6 = r6.d()
            r6.a((b.f.a.e) r13)
            b.f.a.a.f[] r0 = r0.D
            r0 = r0[r19]
            int r0 = r0.b()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x021e:
            r0 = r5
            goto L_0x0190
        L_0x0221:
            r0 = 1
            return r0
        L_0x0223:
            r13 = r25
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x022d
            r2 = 1
            r11 = 0
            r12 = 0
        L_0x022d:
            if (r2 == 0) goto L_0x02ac
            float r3 = r3 - r7
            r2 = r21
            float r5 = r2.b((int) r1)
            float r3 = r3 * r5
            float r0 = r0 + r3
        L_0x0239:
            if (r2 == 0) goto L_0x02b3
            b.f.a.f r3 = b.f.a.e.f2341b
            if (r3 == 0) goto L_0x0251
            long r5 = r3.z
            long r5 = r5 - r22
            r3.z = r5
            long r5 = r3.r
            long r5 = r5 + r22
            r3.r = r5
            long r5 = r3.x
            long r5 = r5 + r22
            r3.x = r5
        L_0x0251:
            b.f.a.a.h[] r3 = r2.sa
            r3 = r3[r1]
            if (r3 != 0) goto L_0x0259
            if (r2 != r4) goto L_0x02aa
        L_0x0259:
            if (r1 != 0) goto L_0x0260
            int r5 = r2.s()
            goto L_0x0264
        L_0x0260:
            int r5 = r2.i()
        L_0x0264:
            float r5 = (float) r5
            b.f.a.a.f[] r6 = r2.D
            r6 = r6[r27]
            int r6 = r6.b()
            float r6 = (float) r6
            float r0 = r0 + r6
            b.f.a.a.f[] r6 = r2.D
            r6 = r6[r27]
            b.f.a.a.p r6 = r6.d()
            b.f.a.a.p r7 = r9.f2317g
            r6.a((b.f.a.a.p) r7, (float) r0)
            b.f.a.a.f[] r6 = r2.D
            r6 = r6[r19]
            b.f.a.a.p r6 = r6.d()
            b.f.a.a.p r7 = r9.f2317g
            float r0 = r0 + r5
            r6.a((b.f.a.a.p) r7, (float) r0)
            b.f.a.a.f[] r5 = r2.D
            r5 = r5[r27]
            b.f.a.a.p r5 = r5.d()
            r5.a((b.f.a.e) r13)
            b.f.a.a.f[] r5 = r2.D
            r5 = r5[r19]
            b.f.a.a.p r5 = r5.d()
            r5.a((b.f.a.e) r13)
            b.f.a.a.f[] r2 = r2.D
            r2 = r2[r19]
            int r2 = r2.b()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x02aa:
            r2 = r3
            goto L_0x0239
        L_0x02ac:
            r2 = r21
            if (r11 != 0) goto L_0x02b6
            if (r12 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r0 = 1
            goto L_0x037f
        L_0x02b6:
            if (r11 == 0) goto L_0x02ba
        L_0x02b8:
            float r3 = r3 - r7
            goto L_0x02bd
        L_0x02ba:
            if (r12 == 0) goto L_0x02bd
            goto L_0x02b8
        L_0x02bd:
            int r6 = r15 + 1
            float r6 = (float) r6
            float r6 = r3 / r6
            if (r12 == 0) goto L_0x02cf
            r7 = 1
            if (r15 <= r7) goto L_0x02cb
            int r6 = r15 + -1
            float r6 = (float) r6
            goto L_0x02cd
        L_0x02cb:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x02cd:
            float r6 = r3 / r6
        L_0x02cf:
            int r3 = r2.r()
            r7 = 8
            if (r3 == r7) goto L_0x02da
            float r3 = r0 + r6
            goto L_0x02db
        L_0x02da:
            r3 = r0
        L_0x02db:
            if (r12 == 0) goto L_0x02ea
            r7 = 1
            if (r15 <= r7) goto L_0x02ea
            b.f.a.a.f[] r3 = r5.D
            r3 = r3[r27]
            int r3 = r3.b()
            float r3 = (float) r3
            float r3 = r3 + r0
        L_0x02ea:
            if (r11 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            b.f.a.a.f[] r0 = r5.D
            r0 = r0[r27]
            int r0 = r0.b()
            float r0 = (float) r0
            float r3 = r3 + r0
        L_0x02f8:
            if (r2 == 0) goto L_0x02b3
            b.f.a.f r0 = b.f.a.e.f2341b
            if (r0 == 0) goto L_0x0310
            long r7 = r0.z
            long r7 = r7 - r22
            r0.z = r7
            long r7 = r0.r
            long r7 = r7 + r22
            r0.r = r7
            long r7 = r0.x
            long r7 = r7 + r22
            r0.x = r7
        L_0x0310:
            b.f.a.a.h[] r0 = r2.sa
            r0 = r0[r1]
            if (r0 != 0) goto L_0x031c
            if (r2 != r4) goto L_0x0319
            goto L_0x031c
        L_0x0319:
            r7 = 8
            goto L_0x037c
        L_0x031c:
            if (r1 != 0) goto L_0x0323
            int r7 = r2.s()
            goto L_0x0327
        L_0x0323:
            int r7 = r2.i()
        L_0x0327:
            float r7 = (float) r7
            if (r2 == r5) goto L_0x0334
            b.f.a.a.f[] r8 = r2.D
            r8 = r8[r27]
            int r8 = r8.b()
            float r8 = (float) r8
            float r3 = r3 + r8
        L_0x0334:
            b.f.a.a.f[] r8 = r2.D
            r8 = r8[r27]
            b.f.a.a.p r8 = r8.d()
            b.f.a.a.p r10 = r9.f2317g
            r8.a((b.f.a.a.p) r10, (float) r3)
            b.f.a.a.f[] r8 = r2.D
            r8 = r8[r19]
            b.f.a.a.p r8 = r8.d()
            b.f.a.a.p r10 = r9.f2317g
            float r11 = r3 + r7
            r8.a((b.f.a.a.p) r10, (float) r11)
            b.f.a.a.f[] r8 = r2.D
            r8 = r8[r27]
            b.f.a.a.p r8 = r8.d()
            r8.a((b.f.a.e) r13)
            b.f.a.a.f[] r8 = r2.D
            r8 = r8[r19]
            b.f.a.a.p r8 = r8.d()
            r8.a((b.f.a.e) r13)
            b.f.a.a.f[] r2 = r2.D
            r2 = r2[r19]
            int r2 = r2.b()
            float r2 = (float) r2
            float r7 = r7 + r2
            float r3 = r3 + r7
            if (r0 == 0) goto L_0x0319
            int r2 = r0.r()
            r7 = 8
            if (r2 == r7) goto L_0x037c
            float r3 = r3 + r6
        L_0x037c:
            r2 = r0
            goto L_0x02f8
        L_0x037f:
            return r0
        L_0x0380:
            r0 = 0
            return r0
        L_0x0382:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.n.a(b.f.a.a.i, b.f.a.e, int, int, b.f.a.a.d):boolean");
    }
}
