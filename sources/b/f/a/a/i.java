package b.f.a.a;

import b.f.a.a.f;
import b.f.a.a.h;
import b.f.a.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class i extends t {
    int Aa;
    int Ba;
    int Ca;
    int Da = 0;
    int Ea = 0;
    d[] Fa = new d[4];
    d[] Ga = new d[4];
    public List<j> Ha = new ArrayList();
    public boolean Ia = false;
    public boolean Ja = false;
    public boolean Ka = false;
    public int La = 0;
    public int Ma = 0;
    private int Na = 7;
    public boolean Oa = false;
    private boolean Pa = false;
    private boolean Qa = false;
    int Ra = 0;
    private boolean wa = false;
    protected e xa = new e();
    private s ya;
    int za;

    private void V() {
        this.Da = 0;
        this.Ea = 0;
    }

    private void d(h hVar) {
        int i = this.Da + 1;
        d[] dVarArr = this.Ga;
        if (i >= dVarArr.length) {
            this.Ga = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.Ga[this.Da] = new d(hVar, 0, P());
        this.Da++;
    }

    private void e(h hVar) {
        int i = this.Ea + 1;
        d[] dVarArr = this.Fa;
        if (i >= dVarArr.length) {
            this.Fa = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.Fa[this.Ea] = new d(hVar, 1, P());
        this.Ea++;
    }

    public void D() {
        this.xa.g();
        this.za = 0;
        this.Ba = 0;
        this.Aa = 0;
        this.Ca = 0;
        this.Ha.clear();
        this.Oa = false;
        super.D();
    }

    /* JADX WARNING: type inference failed for: r8v15, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.L
            int r3 = r1.M
            int r0 = r21.s()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.i()
            int r6 = java.lang.Math.max(r4, r0)
            r1.Pa = r4
            r1.Qa = r4
            b.f.a.a.h r0 = r1.G
            if (r0 == 0) goto L_0x0046
            b.f.a.a.s r0 = r1.ya
            if (r0 != 0) goto L_0x002a
            b.f.a.a.s r0 = new b.f.a.a.s
            r0.<init>(r1)
            r1.ya = r0
        L_0x002a:
            b.f.a.a.s r0 = r1.ya
            r0.b(r1)
            int r0 = r1.za
            r1.r(r0)
            int r0 = r1.Aa
            r1.s(r0)
            r21.E()
            b.f.a.e r0 = r1.xa
            b.f.a.c r0 = r0.d()
            r1.a(r0)
            goto L_0x004a
        L_0x0046:
            r1.L = r4
            r1.M = r4
        L_0x004a:
            int r0 = r1.Na
            r7 = 32
            r8 = 8
            r9 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.t(r8)
            if (r0 != 0) goto L_0x005c
            r21.S()
        L_0x005c:
            boolean r0 = r1.t(r7)
            if (r0 != 0) goto L_0x0065
            r21.R()
        L_0x0065:
            b.f.a.e r0 = r1.xa
            r0.i = r9
            goto L_0x006e
        L_0x006a:
            b.f.a.e r0 = r1.xa
            r0.i = r4
        L_0x006e:
            b.f.a.a.h$a[] r0 = r1.F
            r10 = r0[r9]
            r11 = r0[r4]
            r21.V()
            java.util.List<b.f.a.a.j> r0 = r1.Ha
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0090
            java.util.List<b.f.a.a.j> r0 = r1.Ha
            r0.clear()
            java.util.List<b.f.a.a.j> r0 = r1.Ha
            b.f.a.a.j r12 = new b.f.a.a.j
            java.util.ArrayList<b.f.a.a.h> r13 = r1.va
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x0090:
            java.util.List<b.f.a.a.j> r0 = r1.Ha
            int r12 = r0.size()
            java.util.ArrayList<b.f.a.a.h> r13 = r1.va
            b.f.a.a.h$a r0 = r21.j()
            b.f.a.a.h$a r14 = b.f.a.a.h.a.WRAP_CONTENT
            if (r0 == r14) goto L_0x00ab
            b.f.a.a.h$a r0 = r21.q()
            b.f.a.a.h$a r14 = b.f.a.a.h.a.WRAP_CONTENT
            if (r0 != r14) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r14 = 0
            goto L_0x00ac
        L_0x00ab:
            r14 = 1
        L_0x00ac:
            r0 = 0
            r15 = 0
        L_0x00ae:
            if (r15 >= r12) goto L_0x02f0
            boolean r8 = r1.Oa
            if (r8 != 0) goto L_0x02f0
            java.util.List<b.f.a.a.j> r8 = r1.Ha
            java.lang.Object r8 = r8.get(r15)
            b.f.a.a.j r8 = (b.f.a.a.j) r8
            boolean r8 = r8.f2306d
            if (r8 == 0) goto L_0x00c4
            r19 = r12
            goto L_0x02e4
        L_0x00c4:
            boolean r8 = r1.t(r7)
            if (r8 == 0) goto L_0x00f5
            b.f.a.a.h$a r8 = r21.j()
            b.f.a.a.h$a r7 = b.f.a.a.h.a.FIXED
            if (r8 != r7) goto L_0x00e7
            b.f.a.a.h$a r7 = r21.q()
            b.f.a.a.h$a r8 = b.f.a.a.h.a.FIXED
            if (r7 != r8) goto L_0x00e7
            java.util.List<b.f.a.a.j> r7 = r1.Ha
            java.lang.Object r7 = r7.get(r15)
            b.f.a.a.j r7 = (b.f.a.a.j) r7
            java.util.List r7 = r7.a()
            goto L_0x00f1
        L_0x00e7:
            java.util.List<b.f.a.a.j> r7 = r1.Ha
            java.lang.Object r7 = r7.get(r15)
            b.f.a.a.j r7 = (b.f.a.a.j) r7
            java.util.List<b.f.a.a.h> r7 = r7.f2303a
        L_0x00f1:
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.va = r7
        L_0x00f5:
            r21.V()
            java.util.ArrayList<b.f.a.a.h> r7 = r1.va
            int r7 = r7.size()
            r8 = 0
        L_0x00ff:
            if (r8 >= r7) goto L_0x0117
            java.util.ArrayList<b.f.a.a.h> r4 = r1.va
            java.lang.Object r4 = r4.get(r8)
            b.f.a.a.h r4 = (b.f.a.a.h) r4
            boolean r9 = r4 instanceof b.f.a.a.t
            if (r9 == 0) goto L_0x0112
            b.f.a.a.t r4 = (b.f.a.a.t) r4
            r4.K()
        L_0x0112:
            int r8 = r8 + 1
            r4 = 0
            r9 = 1
            goto L_0x00ff
        L_0x0117:
            r9 = r0
            r0 = 0
            r4 = 1
        L_0x011a:
            if (r4 == 0) goto L_0x02d3
            r17 = r4
            r8 = 1
            int r4 = r0 + 1
            b.f.a.e r0 = r1.xa     // Catch:{ Exception -> 0x015e }
            r0.g()     // Catch:{ Exception -> 0x015e }
            r21.V()     // Catch:{ Exception -> 0x015e }
            b.f.a.e r0 = r1.xa     // Catch:{ Exception -> 0x015e }
            r1.b((b.f.a.e) r0)     // Catch:{ Exception -> 0x015e }
            r0 = 0
        L_0x012f:
            if (r0 >= r7) goto L_0x0145
            java.util.ArrayList<b.f.a.a.h> r8 = r1.va     // Catch:{ Exception -> 0x015e }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ Exception -> 0x015e }
            b.f.a.a.h r8 = (b.f.a.a.h) r8     // Catch:{ Exception -> 0x015e }
            r18 = r9
            b.f.a.e r9 = r1.xa     // Catch:{ Exception -> 0x015c }
            r8.b((b.f.a.e) r9)     // Catch:{ Exception -> 0x015c }
            int r0 = r0 + 1
            r9 = r18
            goto L_0x012f
        L_0x0145:
            r18 = r9
            b.f.a.e r0 = r1.xa     // Catch:{ Exception -> 0x015c }
            boolean r8 = r1.d((b.f.a.e) r0)     // Catch:{ Exception -> 0x015c }
            if (r8 == 0) goto L_0x0157
            b.f.a.e r0 = r1.xa     // Catch:{ Exception -> 0x0155 }
            r0.f()     // Catch:{ Exception -> 0x0155 }
            goto L_0x0157
        L_0x0155:
            r0 = move-exception
            goto L_0x0163
        L_0x0157:
            r17 = r8
            r19 = r12
            goto L_0x0180
        L_0x015c:
            r0 = move-exception
            goto L_0x0161
        L_0x015e:
            r0 = move-exception
            r18 = r9
        L_0x0161:
            r8 = r17
        L_0x0163:
            r0.printStackTrace()
            java.io.PrintStream r9 = java.lang.System.out
            r17 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r8.append(r12)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r9.println(r0)
        L_0x0180:
            if (r17 == 0) goto L_0x018b
            b.f.a.e r8 = r1.xa
            boolean[] r9 = b.f.a.a.n.f2312a
            r1.a((b.f.a.e) r8, (boolean[]) r9)
        L_0x0189:
            r9 = 2
            goto L_0x01d4
        L_0x018b:
            b.f.a.e r8 = r1.xa
            r1.c((b.f.a.e) r8)
            r8 = 0
        L_0x0191:
            if (r8 >= r7) goto L_0x0189
            java.util.ArrayList<b.f.a.a.h> r9 = r1.va
            java.lang.Object r9 = r9.get(r8)
            b.f.a.a.h r9 = (b.f.a.a.h) r9
            b.f.a.a.h$a[] r12 = r9.F
            r16 = 0
            r12 = r12[r16]
            b.f.a.a.h$a r0 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x01b6
            int r0 = r9.s()
            int r12 = r9.u()
            if (r0 >= r12) goto L_0x01b6
            boolean[] r0 = b.f.a.a.n.f2312a
            r8 = 2
            r12 = 1
            r0[r8] = r12
            goto L_0x0189
        L_0x01b6:
            r12 = 1
            b.f.a.a.h$a[] r0 = r9.F
            r0 = r0[r12]
            b.f.a.a.h$a r12 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r0 != r12) goto L_0x01d0
            int r0 = r9.i()
            int r9 = r9.t()
            if (r0 >= r9) goto L_0x01d0
            boolean[] r0 = b.f.a.a.n.f2312a
            r8 = 1
            r9 = 2
            r0[r9] = r8
            goto L_0x01d4
        L_0x01d0:
            r9 = 2
            int r8 = r8 + 1
            goto L_0x0191
        L_0x01d4:
            if (r14 == 0) goto L_0x024e
            r8 = 8
            if (r4 >= r8) goto L_0x024e
            boolean[] r0 = b.f.a.a.n.f2312a
            boolean r0 = r0[r9]
            if (r0 == 0) goto L_0x024e
            r0 = 0
            r9 = 0
            r12 = 0
        L_0x01e3:
            if (r0 >= r7) goto L_0x020d
            java.util.ArrayList<b.f.a.a.h> r8 = r1.va
            java.lang.Object r8 = r8.get(r0)
            b.f.a.a.h r8 = (b.f.a.a.h) r8
            r17 = r4
            int r4 = r8.L
            int r20 = r8.s()
            int r4 = r4 + r20
            int r9 = java.lang.Math.max(r9, r4)
            int r4 = r8.M
            int r8 = r8.i()
            int r4 = r4 + r8
            int r12 = java.lang.Math.max(r12, r4)
            int r0 = r0 + 1
            r4 = r17
            r8 = 8
            goto L_0x01e3
        L_0x020d:
            r17 = r4
            int r0 = r1.W
            int r0 = java.lang.Math.max(r0, r9)
            int r4 = r1.X
            int r4 = java.lang.Math.max(r4, r12)
            b.f.a.a.h$a r8 = b.f.a.a.h.a.WRAP_CONTENT
            if (r11 != r8) goto L_0x0233
            int r8 = r21.s()
            if (r8 >= r0) goto L_0x0233
            r1.o(r0)
            b.f.a.a.h$a[] r0 = r1.F
            b.f.a.a.h$a r8 = b.f.a.a.h.a.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r18 = 1
            goto L_0x0234
        L_0x0233:
            r0 = 0
        L_0x0234:
            b.f.a.a.h$a r8 = b.f.a.a.h.a.WRAP_CONTENT
            if (r10 != r8) goto L_0x024b
            int r8 = r21.i()
            if (r8 >= r4) goto L_0x024b
            r1.g(r4)
            b.f.a.a.h$a[] r0 = r1.F
            b.f.a.a.h$a r4 = b.f.a.a.h.a.WRAP_CONTENT
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x0253
        L_0x024b:
            r9 = r18
            goto L_0x0253
        L_0x024e:
            r17 = r4
            r9 = r18
            r0 = 0
        L_0x0253:
            int r4 = r1.W
            int r8 = r21.s()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.s()
            if (r4 <= r8) goto L_0x026f
            r1.o(r4)
            b.f.a.a.h$a[] r0 = r1.F
            b.f.a.a.h$a r4 = b.f.a.a.h.a.FIXED
            r8 = 0
            r0[r8] = r4
            r0 = 1
            r9 = 1
        L_0x026f:
            int r4 = r1.X
            int r8 = r21.i()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.i()
            if (r4 <= r8) goto L_0x028c
            r1.g(r4)
            b.f.a.a.h$a[] r0 = r1.F
            b.f.a.a.h$a r4 = b.f.a.a.h.a.FIXED
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x028d
        L_0x028c:
            r8 = 1
        L_0x028d:
            if (r9 != 0) goto L_0x02cc
            b.f.a.a.h$a[] r4 = r1.F
            r12 = 0
            r4 = r4[r12]
            b.f.a.a.h$a r12 = b.f.a.a.h.a.WRAP_CONTENT
            if (r4 != r12) goto L_0x02ae
            if (r5 <= 0) goto L_0x02ae
            int r4 = r21.s()
            if (r4 <= r5) goto L_0x02ae
            r1.Pa = r8
            b.f.a.a.h$a[] r0 = r1.F
            b.f.a.a.h$a r4 = b.f.a.a.h.a.FIXED
            r9 = 0
            r0[r9] = r4
            r1.o(r5)
            r0 = 1
            r9 = 1
        L_0x02ae:
            b.f.a.a.h$a[] r4 = r1.F
            r4 = r4[r8]
            b.f.a.a.h$a r12 = b.f.a.a.h.a.WRAP_CONTENT
            if (r4 != r12) goto L_0x02cc
            if (r6 <= 0) goto L_0x02cc
            int r4 = r21.i()
            if (r4 <= r6) goto L_0x02cc
            r1.Qa = r8
            b.f.a.a.h$a[] r0 = r1.F
            b.f.a.a.h$a r4 = b.f.a.a.h.a.FIXED
            r0[r8] = r4
            r1.g(r6)
            r4 = 1
            r9 = 1
            goto L_0x02cd
        L_0x02cc:
            r4 = r0
        L_0x02cd:
            r0 = r17
            r12 = r19
            goto L_0x011a
        L_0x02d3:
            r18 = r9
            r19 = r12
            java.util.List<b.f.a.a.j> r0 = r1.Ha
            java.lang.Object r0 = r0.get(r15)
            b.f.a.a.j r0 = (b.f.a.a.j) r0
            r0.b()
            r0 = r18
        L_0x02e4:
            int r15 = r15 + 1
            r12 = r19
            r4 = 0
            r7 = 32
            r8 = 8
            r9 = 1
            goto L_0x00ae
        L_0x02f0:
            r1.va = r13
            b.f.a.a.h r4 = r1.G
            if (r4 == 0) goto L_0x0322
            int r2 = r1.W
            int r3 = r21.s()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.X
            int r4 = r21.i()
            int r3 = java.lang.Math.max(r3, r4)
            b.f.a.a.s r4 = r1.ya
            r4.a(r1)
            int r4 = r1.za
            int r2 = r2 + r4
            int r4 = r1.Ba
            int r2 = r2 + r4
            r1.o(r2)
            int r2 = r1.Aa
            int r3 = r3 + r2
            int r2 = r1.Ca
            int r3 = r3 + r2
            r1.g(r3)
            goto L_0x0326
        L_0x0322:
            r1.L = r2
            r1.M = r3
        L_0x0326:
            if (r0 == 0) goto L_0x0330
            b.f.a.a.h$a[] r0 = r1.F
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r10
        L_0x0330:
            b.f.a.e r0 = r1.xa
            b.f.a.c r0 = r0.d()
            r1.a(r0)
            b.f.a.a.i r0 = r21.J()
            if (r1 != r0) goto L_0x0342
            r21.H()
        L_0x0342:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.i.K():void");
    }

    public int M() {
        return this.Na;
    }

    public boolean N() {
        return false;
    }

    public boolean O() {
        return this.Qa;
    }

    public boolean P() {
        return this.wa;
    }

    public boolean Q() {
        return this.Pa;
    }

    public void R() {
        if (!t(8)) {
            a(this.Na);
        }
        U();
    }

    public void S() {
        int size = this.va.size();
        F();
        for (int i = 0; i < size; i++) {
            this.va.get(i).F();
        }
    }

    public void T() {
        S();
        a(this.Na);
    }

    public void U() {
        p d2 = a(f.c.LEFT).d();
        p d3 = a(f.c.TOP).d();
        d2.a((p) null, 0.0f);
        d3.a((p) null, 0.0f);
    }

    public void a(int i) {
        super.a(i);
        int size = this.va.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.va.get(i2).a(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, int i) {
        if (i == 0) {
            d(hVar);
        } else if (i == 1) {
            e(hVar);
        }
    }

    public void a(e eVar, boolean[] zArr) {
        zArr[2] = false;
        c(eVar);
        int size = this.va.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.va.get(i);
            hVar.c(eVar);
            if (hVar.F[0] == h.a.MATCH_CONSTRAINT && hVar.s() < hVar.u()) {
                zArr[2] = true;
            }
            if (hVar.F[1] == h.a.MATCH_CONSTRAINT && hVar.i() < hVar.t()) {
                zArr[2] = true;
            }
        }
    }

    public void c(boolean z) {
        this.wa = z;
    }

    public boolean d(e eVar) {
        a(eVar);
        int size = this.va.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.va.get(i);
            if (hVar instanceof i) {
                h.a[] aVarArr = hVar.F;
                h.a aVar = aVarArr[0];
                h.a aVar2 = aVarArr[1];
                if (aVar == h.a.WRAP_CONTENT) {
                    hVar.a(h.a.FIXED);
                }
                if (aVar2 == h.a.WRAP_CONTENT) {
                    hVar.b(h.a.FIXED);
                }
                hVar.a(eVar);
                if (aVar == h.a.WRAP_CONTENT) {
                    hVar.a(aVar);
                }
                if (aVar2 == h.a.WRAP_CONTENT) {
                    hVar.b(aVar2);
                }
            } else {
                n.a(this, eVar, hVar);
                hVar.a(eVar);
            }
        }
        if (this.Da > 0) {
            c.a(this, eVar, 0);
        }
        if (this.Ea > 0) {
            c.a(this, eVar, 1);
        }
        return true;
    }

    public void f(int i, int i2) {
        q qVar;
        q qVar2;
        if (!(this.F[0] == h.a.WRAP_CONTENT || (qVar2 = this.f2293d) == null)) {
            qVar2.a(i);
        }
        if (this.F[1] != h.a.WRAP_CONTENT && (qVar = this.f2294e) != null) {
            qVar.a(i2);
        }
    }

    public boolean t(int i) {
        return (this.Na & i) == i;
    }

    public void u(int i) {
        this.Na = i;
    }
}
