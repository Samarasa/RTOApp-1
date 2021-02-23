package b.f.a.a;

import b.f.a.e;

class c {
    static void a(i iVar, e eVar, int i) {
        int i2;
        d[] dVarArr;
        int i3;
        if (i == 0) {
            int i4 = iVar.Da;
            dVarArr = iVar.Ga;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = iVar.Ea;
            i2 = i5;
            dVarArr = iVar.Fa;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            d dVar = dVarArr[i6];
            dVar.a();
            if (!iVar.t(4) || !n.a(iVar, eVar, i, i3, dVar)) {
                a(iVar, eVar, i, i3, dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.ma == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.na == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0364 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(b.f.a.a.i r36, b.f.a.e r37, int r38, int r39, b.f.a.a.d r40) {
        /*
            r0 = r36
            r9 = r37
            r1 = r40
            b.f.a.a.h r10 = r1.f2256a
            b.f.a.a.h r11 = r1.f2258c
            b.f.a.a.h r12 = r1.f2257b
            b.f.a.a.h r13 = r1.f2259d
            b.f.a.a.h r2 = r1.f2260e
            float r3 = r1.k
            b.f.a.a.h r4 = r1.f2261f
            b.f.a.a.h r4 = r1.f2262g
            b.f.a.a.h$a[] r4 = r0.F
            r4 = r4[r38]
            b.f.a.a.h$a r5 = b.f.a.a.h.a.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.ma
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.ma
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.ma
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.na
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.na
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.na
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x0053:
            r21 = 0
            if (r5 != 0) goto L_0x0124
            b.f.a.a.f[] r7 = r8.D
            r7 = r7[r39]
            if (r4 != 0) goto L_0x0063
            if (r14 == 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r23 = 4
            goto L_0x0065
        L_0x0063:
            r23 = 1
        L_0x0065:
            int r24 = r7.b()
            b.f.a.a.f r6 = r7.f2268d
            if (r6 == 0) goto L_0x0075
            if (r8 == r10) goto L_0x0075
            int r6 = r6.b()
            int r24 = r24 + r6
        L_0x0075:
            r6 = r24
            if (r14 == 0) goto L_0x0083
            if (r8 == r10) goto L_0x0083
            if (r8 == r12) goto L_0x0083
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0093
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0093:
            b.f.a.a.f r5 = r7.f2268d
            if (r5 == 0) goto L_0x00bc
            if (r8 != r12) goto L_0x00a6
            r25 = r15
            b.f.a.i r15 = r7.j
            b.f.a.i r5 = r5.j
            r26 = r2
            r2 = 5
            r9.b(r15, r5, r6, r2)
            goto L_0x00b2
        L_0x00a6:
            r26 = r2
            r25 = r15
            b.f.a.i r2 = r7.j
            b.f.a.i r5 = r5.j
            r15 = 6
            r9.b(r2, r5, r6, r15)
        L_0x00b2:
            b.f.a.i r2 = r7.j
            b.f.a.a.f r5 = r7.f2268d
            b.f.a.i r5 = r5.j
            r9.a((b.f.a.i) r2, (b.f.a.i) r5, (int) r6, (int) r3)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r25 = r15
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r8.r()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            b.f.a.a.h$a[] r2 = r8.F
            r2 = r2[r38]
            b.f.a.a.h$a r3 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            b.f.a.a.f[] r2 = r8.D
            int r3 = r39 + 1
            r3 = r2[r3]
            b.f.a.i r3 = r3.j
            r2 = r2[r39]
            b.f.a.i r2 = r2.j
            r5 = 5
            r6 = 0
            r9.b(r3, r2, r6, r5)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            b.f.a.a.f[] r2 = r8.D
            r2 = r2[r39]
            b.f.a.i r2 = r2.j
            b.f.a.a.f[] r3 = r0.D
            r3 = r3[r39]
            b.f.a.i r3 = r3.j
            r5 = 6
            r9.b(r2, r3, r6, r5)
        L_0x00f5:
            b.f.a.a.f[] r2 = r8.D
            int r3 = r39 + 1
            r2 = r2[r3]
            b.f.a.a.f r2 = r2.f2268d
            if (r2 == 0) goto L_0x0114
            b.f.a.a.h r2 = r2.f2266b
            b.f.a.a.f[] r3 = r2.D
            r5 = r3[r39]
            b.f.a.a.f r5 = r5.f2268d
            if (r5 == 0) goto L_0x0114
            r3 = r3[r39]
            b.f.a.a.f r3 = r3.f2268d
            b.f.a.a.h r3 = r3.f2266b
            if (r3 == r8) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r8 = r21
            r5 = r23
            goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x0053
        L_0x0124:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x014c
            b.f.a.a.f[] r2 = r11.D
            int r3 = r39 + 1
            r5 = r2[r3]
            b.f.a.a.f r5 = r5.f2268d
            if (r5 == 0) goto L_0x014c
            b.f.a.a.f[] r5 = r13.D
            r5 = r5[r3]
            b.f.a.i r6 = r5.j
            r2 = r2[r3]
            b.f.a.a.f r2 = r2.f2268d
            b.f.a.i r2 = r2.j
            int r3 = r5.b()
            int r3 = -r3
            r7 = 5
            r9.c(r6, r2, r3, r7)
            goto L_0x014d
        L_0x014c:
            r7 = 5
        L_0x014d:
            if (r4 == 0) goto L_0x0167
            b.f.a.a.f[] r0 = r0.D
            int r2 = r39 + 1
            r0 = r0[r2]
            b.f.a.i r0 = r0.j
            b.f.a.a.f[] r3 = r11.D
            r4 = r3[r2]
            b.f.a.i r4 = r4.j
            r2 = r3[r2]
            int r2 = r2.b()
            r3 = 6
            r9.b(r0, r4, r2, r3)
        L_0x0167:
            java.util.ArrayList<b.f.a.a.h> r0 = r1.f2263h
            if (r0 == 0) goto L_0x0216
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0216
            boolean r4 = r1.n
            if (r4 == 0) goto L_0x017e
            boolean r4 = r1.p
            if (r4 != 0) goto L_0x017e
            int r4 = r1.j
            float r4 = (float) r4
            goto L_0x0180
        L_0x017e:
            r4 = r24
        L_0x0180:
            r5 = 0
            r8 = r21
            r6 = 0
            r28 = 0
        L_0x0186:
            if (r6 >= r2) goto L_0x0216
            java.lang.Object r15 = r0.get(r6)
            b.f.a.a.h r15 = (b.f.a.a.h) r15
            float[] r3 = r15.qa
            r3 = r3[r38]
            int r23 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r23 >= 0) goto L_0x01b2
            boolean r3 = r1.p
            if (r3 == 0) goto L_0x01ad
            b.f.a.a.f[] r3 = r15.D
            int r15 = r39 + 1
            r15 = r3[r15]
            b.f.a.i r15 = r15.j
            r3 = r3[r39]
            b.f.a.i r3 = r3.j
            r5 = 0
            r7 = 4
            r9.a((b.f.a.i) r15, (b.f.a.i) r3, (int) r5, (int) r7)
            r7 = 6
            goto L_0x01c8
        L_0x01ad:
            r7 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto L_0x01b3
        L_0x01b2:
            r7 = 4
        L_0x01b3:
            int r20 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r20 != 0) goto L_0x01cd
            b.f.a.a.f[] r3 = r15.D
            int r15 = r39 + 1
            r15 = r3[r15]
            b.f.a.i r15 = r15.j
            r3 = r3[r39]
            b.f.a.i r3 = r3.j
            r5 = 0
            r7 = 6
            r9.a((b.f.a.i) r15, (b.f.a.i) r3, (int) r5, (int) r7)
        L_0x01c8:
            r24 = r0
            r22 = r2
            goto L_0x020b
        L_0x01cd:
            r5 = 0
            r7 = 6
            if (r8 == 0) goto L_0x0204
            b.f.a.a.f[] r8 = r8.D
            r5 = r8[r39]
            b.f.a.i r5 = r5.j
            int r22 = r39 + 1
            r8 = r8[r22]
            b.f.a.i r8 = r8.j
            b.f.a.a.f[] r7 = r15.D
            r24 = r0
            r0 = r7[r39]
            b.f.a.i r0 = r0.j
            r7 = r7[r22]
            b.f.a.i r7 = r7.j
            r22 = r2
            b.f.a.b r2 = r37.b()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r5
            r32 = r8
            r33 = r0
            r34 = r7
            r27.a((float) r28, (float) r29, (float) r30, (b.f.a.i) r31, (b.f.a.i) r32, (b.f.a.i) r33, (b.f.a.i) r34)
            r9.a((b.f.a.b) r2)
            goto L_0x0208
        L_0x0204:
            r24 = r0
            r22 = r2
        L_0x0208:
            r28 = r3
            r8 = r15
        L_0x020b:
            int r6 = r6 + 1
            r2 = r22
            r0 = r24
            r3 = 1
            r5 = 0
            r7 = 5
            goto L_0x0186
        L_0x0216:
            if (r12 == 0) goto L_0x0278
            if (r12 == r13) goto L_0x021c
            if (r14 == 0) goto L_0x0278
        L_0x021c:
            b.f.a.a.f[] r0 = r10.D
            r1 = r0[r39]
            b.f.a.a.f[] r2 = r11.D
            int r3 = r39 + 1
            r2 = r2[r3]
            r4 = r0[r39]
            b.f.a.a.f r4 = r4.f2268d
            if (r4 == 0) goto L_0x0234
            r0 = r0[r39]
            b.f.a.a.f r0 = r0.f2268d
            b.f.a.i r0 = r0.j
            r4 = r0
            goto L_0x0236
        L_0x0234:
            r4 = r21
        L_0x0236:
            b.f.a.a.f[] r0 = r11.D
            r5 = r0[r3]
            b.f.a.a.f r5 = r5.f2268d
            if (r5 == 0) goto L_0x0246
            r0 = r0[r3]
            b.f.a.a.f r0 = r0.f2268d
            b.f.a.i r0 = r0.j
            r5 = r0
            goto L_0x0248
        L_0x0246:
            r5 = r21
        L_0x0248:
            if (r12 != r13) goto L_0x0250
            b.f.a.a.f[] r0 = r12.D
            r1 = r0[r39]
            r2 = r0[r3]
        L_0x0250:
            if (r4 == 0) goto L_0x0495
            if (r5 == 0) goto L_0x0495
            if (r38 != 0) goto L_0x025b
            r0 = r26
            float r0 = r0.aa
            goto L_0x025f
        L_0x025b:
            r0 = r26
            float r0 = r0.ba
        L_0x025f:
            r6 = r0
            int r3 = r1.b()
            int r7 = r2.b()
            b.f.a.i r1 = r1.j
            b.f.a.i r8 = r2.j
            r10 = 5
            r0 = r37
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0495
        L_0x0278:
            if (r25 == 0) goto L_0x0368
            if (r12 == 0) goto L_0x0368
            int r0 = r1.j
            if (r0 <= 0) goto L_0x0287
            int r1 = r1.i
            if (r1 != r0) goto L_0x0287
            r17 = 1
            goto L_0x0289
        L_0x0287:
            r17 = 0
        L_0x0289:
            r14 = r12
            r15 = r14
        L_0x028b:
            if (r14 == 0) goto L_0x0495
            b.f.a.a.h[] r0 = r14.sa
            r0 = r0[r38]
            r8 = r0
        L_0x0292:
            if (r8 == 0) goto L_0x02a1
            int r0 = r8.r()
            r7 = 8
            if (r0 != r7) goto L_0x02a3
            b.f.a.a.h[] r0 = r8.sa
            r8 = r0[r38]
            goto L_0x0292
        L_0x02a1:
            r7 = 8
        L_0x02a3:
            if (r8 != 0) goto L_0x02b0
            if (r14 != r13) goto L_0x02a8
            goto L_0x02b0
        L_0x02a8:
            r18 = r8
            r19 = 4
            r20 = 6
            goto L_0x035b
        L_0x02b0:
            b.f.a.a.f[] r0 = r14.D
            r0 = r0[r39]
            b.f.a.i r1 = r0.j
            b.f.a.a.f r2 = r0.f2268d
            if (r2 == 0) goto L_0x02bd
            b.f.a.i r2 = r2.j
            goto L_0x02bf
        L_0x02bd:
            r2 = r21
        L_0x02bf:
            if (r15 == r14) goto L_0x02ca
            b.f.a.a.f[] r2 = r15.D
            int r3 = r39 + 1
            r2 = r2[r3]
        L_0x02c7:
            b.f.a.i r2 = r2.j
            goto L_0x02dd
        L_0x02ca:
            if (r14 != r12) goto L_0x02dd
            if (r15 != r14) goto L_0x02dd
            b.f.a.a.f[] r2 = r10.D
            r3 = r2[r39]
            b.f.a.a.f r3 = r3.f2268d
            if (r3 == 0) goto L_0x02db
            r2 = r2[r39]
            b.f.a.a.f r2 = r2.f2268d
            goto L_0x02c7
        L_0x02db:
            r2 = r21
        L_0x02dd:
            int r0 = r0.b()
            b.f.a.a.f[] r3 = r14.D
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.b()
            if (r8 == 0) goto L_0x02fa
            b.f.a.a.f[] r5 = r8.D
            r5 = r5[r39]
            b.f.a.i r6 = r5.j
            b.f.a.a.f[] r7 = r14.D
            r7 = r7[r4]
        L_0x02f7:
            b.f.a.i r7 = r7.j
            goto L_0x030c
        L_0x02fa:
            b.f.a.a.f[] r5 = r11.D
            r5 = r5[r4]
            b.f.a.a.f r5 = r5.f2268d
            if (r5 == 0) goto L_0x0305
            b.f.a.i r6 = r5.j
            goto L_0x0307
        L_0x0305:
            r6 = r21
        L_0x0307:
            b.f.a.a.f[] r7 = r14.D
            r7 = r7[r4]
            goto L_0x02f7
        L_0x030c:
            if (r5 == 0) goto L_0x0313
            int r5 = r5.b()
            int r3 = r3 + r5
        L_0x0313:
            if (r15 == 0) goto L_0x031e
            b.f.a.a.f[] r5 = r15.D
            r5 = r5[r4]
            int r5 = r5.b()
            int r0 = r0 + r5
        L_0x031e:
            if (r1 == 0) goto L_0x02a8
            if (r2 == 0) goto L_0x02a8
            if (r6 == 0) goto L_0x02a8
            if (r7 == 0) goto L_0x02a8
            if (r14 != r12) goto L_0x0330
            b.f.a.a.f[] r0 = r12.D
            r0 = r0[r39]
            int r0 = r0.b()
        L_0x0330:
            r5 = r0
            if (r14 != r13) goto L_0x033e
            b.f.a.a.f[] r0 = r13.D
            r0 = r0[r4]
            int r0 = r0.b()
            r18 = r0
            goto L_0x0340
        L_0x033e:
            r18 = r3
        L_0x0340:
            if (r17 == 0) goto L_0x0345
            r22 = 6
            goto L_0x0347
        L_0x0345:
            r22 = 4
        L_0x0347:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r5 = r6
            r6 = r7
            r19 = 4
            r20 = 6
            r7 = r18
            r18 = r8
            r8 = r22
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x035b:
            int r0 = r14.r()
            r8 = 8
            if (r0 == r8) goto L_0x0364
            r15 = r14
        L_0x0364:
            r14 = r18
            goto L_0x028b
        L_0x0368:
            r8 = 8
            r19 = 4
            r20 = 6
            if (r16 == 0) goto L_0x0495
            if (r12 == 0) goto L_0x0495
            int r0 = r1.j
            if (r0 <= 0) goto L_0x037d
            int r1 = r1.i
            if (r1 != r0) goto L_0x037d
            r17 = 1
            goto L_0x037f
        L_0x037d:
            r17 = 0
        L_0x037f:
            r14 = r12
            r15 = r14
        L_0x0381:
            if (r14 == 0) goto L_0x0437
            b.f.a.a.h[] r0 = r14.sa
            r0 = r0[r38]
        L_0x0387:
            if (r0 == 0) goto L_0x0394
            int r1 = r0.r()
            if (r1 != r8) goto L_0x0394
            b.f.a.a.h[] r0 = r0.sa
            r0 = r0[r38]
            goto L_0x0387
        L_0x0394:
            if (r14 == r12) goto L_0x0424
            if (r14 == r13) goto L_0x0424
            if (r0 == 0) goto L_0x0424
            if (r0 != r13) goto L_0x039f
            r7 = r21
            goto L_0x03a0
        L_0x039f:
            r7 = r0
        L_0x03a0:
            b.f.a.a.f[] r0 = r14.D
            r0 = r0[r39]
            b.f.a.i r1 = r0.j
            b.f.a.a.f r2 = r0.f2268d
            if (r2 == 0) goto L_0x03ac
            b.f.a.i r2 = r2.j
        L_0x03ac:
            b.f.a.a.f[] r2 = r15.D
            int r3 = r39 + 1
            r2 = r2[r3]
            b.f.a.i r2 = r2.j
            int r0 = r0.b()
            b.f.a.a.f[] r4 = r14.D
            r4 = r4[r3]
            int r4 = r4.b()
            if (r7 == 0) goto L_0x03d0
            b.f.a.a.f[] r5 = r7.D
            r5 = r5[r39]
            b.f.a.i r6 = r5.j
            b.f.a.a.f r8 = r5.f2268d
            if (r8 == 0) goto L_0x03cd
            goto L_0x03e1
        L_0x03cd:
            r8 = r21
            goto L_0x03e3
        L_0x03d0:
            b.f.a.a.f[] r5 = r14.D
            r5 = r5[r3]
            b.f.a.a.f r5 = r5.f2268d
            if (r5 == 0) goto L_0x03db
            b.f.a.i r6 = r5.j
            goto L_0x03dd
        L_0x03db:
            r6 = r21
        L_0x03dd:
            b.f.a.a.f[] r8 = r14.D
            r8 = r8[r3]
        L_0x03e1:
            b.f.a.i r8 = r8.j
        L_0x03e3:
            if (r5 == 0) goto L_0x03ea
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x03ea:
            r18 = r4
            if (r15 == 0) goto L_0x03f7
            b.f.a.a.f[] r4 = r15.D
            r3 = r4[r3]
            int r3 = r3.b()
            int r0 = r0 + r3
        L_0x03f7:
            r3 = r0
            if (r17 == 0) goto L_0x03fd
            r22 = 6
            goto L_0x03ff
        L_0x03fd:
            r22 = 4
        L_0x03ff:
            if (r1 == 0) goto L_0x041b
            if (r2 == 0) goto L_0x041b
            if (r6 == 0) goto L_0x041b
            if (r8 == 0) goto L_0x041b
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r6 = r8
            r23 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r22
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0421
        L_0x041b:
            r23 = r7
            r18 = r15
            r15 = 8
        L_0x0421:
            r0 = r23
            goto L_0x0428
        L_0x0424:
            r18 = r15
            r15 = 8
        L_0x0428:
            int r1 = r14.r()
            if (r1 == r15) goto L_0x042f
            goto L_0x0431
        L_0x042f:
            r14 = r18
        L_0x0431:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x0381
        L_0x0437:
            b.f.a.a.f[] r0 = r12.D
            r0 = r0[r39]
            b.f.a.a.f[] r1 = r10.D
            r1 = r1[r39]
            b.f.a.a.f r1 = r1.f2268d
            b.f.a.a.f[] r2 = r13.D
            int r3 = r39 + 1
            r10 = r2[r3]
            b.f.a.a.f[] r2 = r11.D
            r2 = r2[r3]
            b.f.a.a.f r14 = r2.f2268d
            if (r1 == 0) goto L_0x0484
            if (r12 == r13) goto L_0x045e
            b.f.a.i r2 = r0.j
            b.f.a.i r1 = r1.j
            int r0 = r0.b()
            r15 = 5
            r9.a((b.f.a.i) r2, (b.f.a.i) r1, (int) r0, (int) r15)
            goto L_0x0485
        L_0x045e:
            r15 = 5
            if (r14 == 0) goto L_0x0485
            b.f.a.i r2 = r0.j
            b.f.a.i r3 = r1.j
            int r4 = r0.b()
            r5 = 1056964608(0x3f000000, float:0.5)
            b.f.a.i r6 = r10.j
            b.f.a.i r7 = r14.j
            int r8 = r10.b()
            r17 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0485
        L_0x0484:
            r15 = 5
        L_0x0485:
            if (r14 == 0) goto L_0x0495
            if (r12 == r13) goto L_0x0495
            b.f.a.i r0 = r10.j
            b.f.a.i r1 = r14.j
            int r2 = r10.b()
            int r2 = -r2
            r9.a((b.f.a.i) r0, (b.f.a.i) r1, (int) r2, (int) r15)
        L_0x0495:
            if (r25 != 0) goto L_0x0499
            if (r16 == 0) goto L_0x04f9
        L_0x0499:
            if (r12 == 0) goto L_0x04f9
            b.f.a.a.f[] r0 = r12.D
            r0 = r0[r39]
            b.f.a.a.f[] r1 = r13.D
            int r2 = r39 + 1
            r1 = r1[r2]
            b.f.a.a.f r3 = r0.f2268d
            if (r3 == 0) goto L_0x04ac
            b.f.a.i r3 = r3.j
            goto L_0x04ae
        L_0x04ac:
            r3 = r21
        L_0x04ae:
            b.f.a.a.f r4 = r1.f2268d
            if (r4 == 0) goto L_0x04b5
            b.f.a.i r4 = r4.j
            goto L_0x04b7
        L_0x04b5:
            r4 = r21
        L_0x04b7:
            if (r11 == r13) goto L_0x04c6
            b.f.a.a.f[] r4 = r11.D
            r4 = r4[r2]
            b.f.a.a.f r4 = r4.f2268d
            if (r4 == 0) goto L_0x04c4
            b.f.a.i r4 = r4.j
            goto L_0x04c6
        L_0x04c4:
            r4 = r21
        L_0x04c6:
            r5 = r4
            if (r12 != r13) goto L_0x04d4
            b.f.a.a.f[] r0 = r12.D
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x04d4:
            if (r3 == 0) goto L_0x04f9
            if (r5 == 0) goto L_0x04f9
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.b()
            if (r13 != 0) goto L_0x04e1
            goto L_0x04e2
        L_0x04e1:
            r11 = r13
        L_0x04e2:
            b.f.a.a.f[] r7 = r11.D
            r2 = r7[r2]
            int r7 = r2.b()
            b.f.a.i r2 = r0.j
            b.f.a.i r8 = r1.j
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.c.a(b.f.a.a.i, b.f.a.e, int, int, b.f.a.a.d):void");
    }
}
