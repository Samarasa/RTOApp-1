package b.f.a.a;

import b.f.a.a.h;
import b.f.a.e;
import b.f.a.i;
import java.util.ArrayList;

public class b extends m {
    private int xa = 0;
    private ArrayList<p> ya = new ArrayList<>(4);
    private boolean za = true;

    public void F() {
        super.F();
        this.ya.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G() {
        /*
            r11 = this;
            int r0 = r11.xa
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0020
            if (r0 == r4) goto L_0x0018
            if (r0 == r3) goto L_0x0015
            if (r0 == r2) goto L_0x0012
            return
        L_0x0012:
            b.f.a.a.f r0 = r11.y
            goto L_0x001a
        L_0x0015:
            b.f.a.a.f r0 = r11.w
            goto L_0x0022
        L_0x0018:
            b.f.a.a.f r0 = r11.x
        L_0x001a:
            b.f.a.a.p r0 = r0.d()
            r1 = 0
            goto L_0x0026
        L_0x0020:
            b.f.a.a.f r0 = r11.v
        L_0x0022:
            b.f.a.a.p r0 = r0.d()
        L_0x0026:
            java.util.ArrayList<b.f.a.a.p> r5 = r11.ya
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L_0x002e:
            if (r7 >= r5) goto L_0x0058
            java.util.ArrayList<b.f.a.a.p> r8 = r11.ya
            java.lang.Object r8 = r8.get(r7)
            b.f.a.a.p r8 = (b.f.a.a.p) r8
            int r9 = r8.f2321b
            if (r9 == r4) goto L_0x003d
            return
        L_0x003d:
            int r9 = r11.xa
            if (r9 == 0) goto L_0x004b
            if (r9 != r3) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            float r9 = r8.f2318h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x0055
            goto L_0x0051
        L_0x004b:
            float r9 = r8.f2318h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0055
        L_0x0051:
            b.f.a.a.p r1 = r8.f2317g
            r6 = r1
            r1 = r9
        L_0x0055:
            int r7 = r7 + 1
            goto L_0x002e
        L_0x0058:
            b.f.a.f r5 = b.f.a.e.e()
            if (r5 == 0) goto L_0x0069
            b.f.a.f r5 = b.f.a.e.e()
            long r7 = r5.y
            r9 = 1
            long r7 = r7 + r9
            r5.y = r7
        L_0x0069:
            r0.f2317g = r6
            r0.f2318h = r1
            r0.a()
            int r0 = r11.xa
            if (r0 == 0) goto L_0x0084
            if (r0 == r4) goto L_0x0081
            if (r0 == r3) goto L_0x007e
            if (r0 == r2) goto L_0x007b
            return
        L_0x007b:
            b.f.a.a.f r0 = r11.w
            goto L_0x0086
        L_0x007e:
            b.f.a.a.f r0 = r11.y
            goto L_0x0086
        L_0x0081:
            b.f.a.a.f r0 = r11.v
            goto L_0x0086
        L_0x0084:
            b.f.a.a.f r0 = r11.x
        L_0x0086:
            b.f.a.a.p r0 = r0.d()
            r0.a((b.f.a.a.p) r6, (float) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.b.G():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r8) {
        /*
            r7 = this;
            b.f.a.a.h r8 = r7.G
            if (r8 != 0) goto L_0x0005
            return
        L_0x0005:
            b.f.a.a.i r8 = (b.f.a.a.i) r8
            r0 = 2
            boolean r8 = r8.t(r0)
            if (r8 != 0) goto L_0x000f
            return
        L_0x000f:
            int r8 = r7.xa
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L_0x0025
            if (r8 == r2) goto L_0x0022
            if (r8 == r0) goto L_0x001f
            if (r8 == r1) goto L_0x001c
            return
        L_0x001c:
            b.f.a.a.f r8 = r7.y
            goto L_0x0027
        L_0x001f:
            b.f.a.a.f r8 = r7.w
            goto L_0x0027
        L_0x0022:
            b.f.a.a.f r8 = r7.x
            goto L_0x0027
        L_0x0025:
            b.f.a.a.f r8 = r7.v
        L_0x0027:
            b.f.a.a.p r8 = r8.d()
            r3 = 5
            r8.b(r3)
            int r3 = r7.xa
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0044
            if (r3 != r2) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            b.f.a.a.f r3 = r7.v
            b.f.a.a.p r3 = r3.d()
            r3.a((b.f.a.a.p) r5, (float) r4)
            b.f.a.a.f r3 = r7.x
            goto L_0x004f
        L_0x0044:
            b.f.a.a.f r3 = r7.w
            b.f.a.a.p r3 = r3.d()
            r3.a((b.f.a.a.p) r5, (float) r4)
            b.f.a.a.f r3 = r7.y
        L_0x004f:
            b.f.a.a.p r3 = r3.d()
            r3.a((b.f.a.a.p) r5, (float) r4)
            java.util.ArrayList<b.f.a.a.p> r3 = r7.ya
            r3.clear()
            r3 = 0
        L_0x005c:
            int r4 = r7.wa
            if (r3 >= r4) goto L_0x0097
            b.f.a.a.h[] r4 = r7.va
            r4 = r4[r3]
            boolean r6 = r7.za
            if (r6 != 0) goto L_0x006f
            boolean r6 = r4.a()
            if (r6 != 0) goto L_0x006f
            goto L_0x0094
        L_0x006f:
            int r6 = r7.xa
            if (r6 == 0) goto L_0x0084
            if (r6 == r2) goto L_0x0081
            if (r6 == r0) goto L_0x007e
            if (r6 == r1) goto L_0x007b
            r4 = r5
            goto L_0x008a
        L_0x007b:
            b.f.a.a.f r4 = r4.y
            goto L_0x0086
        L_0x007e:
            b.f.a.a.f r4 = r4.w
            goto L_0x0086
        L_0x0081:
            b.f.a.a.f r4 = r4.x
            goto L_0x0086
        L_0x0084:
            b.f.a.a.f r4 = r4.v
        L_0x0086:
            b.f.a.a.p r4 = r4.d()
        L_0x008a:
            if (r4 == 0) goto L_0x0094
            java.util.ArrayList<b.f.a.a.p> r6 = r7.ya
            r6.add(r4)
            r4.a(r8)
        L_0x0094:
            int r3 = r3 + 1
            goto L_0x005c
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.b.a(int):void");
    }

    public void a(e eVar) {
        f[] fVarArr;
        boolean z;
        i iVar;
        f fVar;
        int i;
        int i2;
        f[] fVarArr2 = this.D;
        fVarArr2[0] = this.v;
        fVarArr2[2] = this.w;
        fVarArr2[1] = this.x;
        fVarArr2[3] = this.y;
        int i3 = 0;
        while (true) {
            fVarArr = this.D;
            if (i3 >= fVarArr.length) {
                break;
            }
            fVarArr[i3].j = eVar.a((Object) fVarArr[i3]);
            i3++;
        }
        int i4 = this.xa;
        if (i4 >= 0 && i4 < 4) {
            f fVar2 = fVarArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.wa) {
                    z = false;
                    break;
                }
                h hVar = this.va[i5];
                if ((this.za || hVar.a()) && ((((i = this.xa) == 0 || i == 1) && hVar.j() == h.a.MATCH_CONSTRAINT) || (((i2 = this.xa) == 2 || i2 == 3) && hVar.q() == h.a.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            int i6 = this.xa;
            if (i6 == 0 || i6 == 1 ? k().j() == h.a.WRAP_CONTENT : k().q() == h.a.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.wa; i7++) {
                h hVar2 = this.va[i7];
                if (this.za || hVar2.a()) {
                    i a2 = eVar.a((Object) hVar2.D[this.xa]);
                    f[] fVarArr3 = hVar2.D;
                    int i8 = this.xa;
                    fVarArr3[i8].j = a2;
                    if (i8 == 0 || i8 == 2) {
                        eVar.b(fVar2.j, a2, z);
                    } else {
                        eVar.a(fVar2.j, a2, z);
                    }
                }
            }
            int i9 = this.xa;
            if (i9 == 0) {
                eVar.a(this.x.j, this.v.j, 0, 6);
                if (!z) {
                    iVar = this.v.j;
                    fVar = this.G.x;
                } else {
                    return;
                }
            } else if (i9 == 1) {
                eVar.a(this.v.j, this.x.j, 0, 6);
                if (!z) {
                    iVar = this.v.j;
                    fVar = this.G.v;
                } else {
                    return;
                }
            } else if (i9 == 2) {
                eVar.a(this.y.j, this.w.j, 0, 6);
                if (!z) {
                    iVar = this.w.j;
                    fVar = this.G.y;
                } else {
                    return;
                }
            } else if (i9 == 3) {
                eVar.a(this.w.j, this.y.j, 0, 6);
                if (!z) {
                    iVar = this.w.j;
                    fVar = this.G.w;
                } else {
                    return;
                }
            } else {
                return;
            }
            eVar.a(iVar, fVar.j, 0, 5);
        }
    }

    public boolean a() {
        return true;
    }

    public void c(boolean z) {
        this.za = z;
    }

    public void t(int i) {
        this.xa = i;
    }
}
