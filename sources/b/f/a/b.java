package b.f.a;

import b.f.a.e;
import b.f.a.i;

public class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    i f2332a = null;

    /* renamed from: b  reason: collision with root package name */
    float f2333b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f2334c = false;

    /* renamed from: d  reason: collision with root package name */
    public final a f2335d;

    /* renamed from: e  reason: collision with root package name */
    boolean f2336e = false;

    public b(c cVar) {
        this.f2335d = new a(this, cVar);
    }

    public b a(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f2333b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar2, -1.0f);
            this.f2335d.a(iVar4, 1.0f);
            this.f2335d.a(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f2335d.a(iVar3, 1.0f);
            this.f2335d.a(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar2, -1.0f);
            this.f2335d.a(iVar4, f5);
            this.f2335d.a(iVar3, -f5);
        }
        return this;
    }

    public b a(e eVar, int i) {
        this.f2335d.a(eVar.a(i, "ep"), 1.0f);
        this.f2335d.a(eVar.a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i iVar, int i) {
        this.f2335d.a(iVar, (float) i);
        return this;
    }

    public b a(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2333b = (float) i;
        }
        if (!z) {
            this.f2335d.a(iVar, -1.0f);
            this.f2335d.a(iVar2, 1.0f);
        } else {
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i2) {
        float f3;
        if (iVar2 == iVar3) {
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar4, 1.0f);
            this.f2335d.a(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar2, -1.0f);
            this.f2335d.a(iVar3, -1.0f);
            this.f2335d.a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f3 = (float) ((-i) + i2);
            }
            return this;
        } else if (f2 <= 0.0f) {
            this.f2335d.a(iVar, -1.0f);
            this.f2335d.a(iVar2, 1.0f);
            f3 = (float) i;
        } else if (f2 >= 1.0f) {
            this.f2335d.a(iVar3, -1.0f);
            this.f2335d.a(iVar4, 1.0f);
            f3 = (float) i2;
        } else {
            float f4 = 1.0f - f2;
            this.f2335d.a(iVar, f4 * 1.0f);
            this.f2335d.a(iVar2, f4 * -1.0f);
            this.f2335d.a(iVar3, -1.0f * f2);
            this.f2335d.a(iVar4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                f3 = (((float) (-i)) * f4) + (((float) i2) * f2);
            }
            return this;
        }
        this.f2333b = f3;
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i iVar, i iVar2, i iVar3, float f2) {
        this.f2335d.a(iVar, -1.0f);
        this.f2335d.a(iVar2, 1.0f - f2);
        this.f2335d.a(iVar3, f2);
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2333b = (float) i;
        }
        if (!z) {
            this.f2335d.a(iVar, -1.0f);
            this.f2335d.a(iVar2, 1.0f);
            this.f2335d.a(iVar3, 1.0f);
        } else {
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar2, -1.0f);
            this.f2335d.a(iVar3, -1.0f);
        }
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2335d.a(iVar, -1.0f);
        this.f2335d.a(iVar2, 1.0f);
        this.f2335d.a(iVar3, f2);
        this.f2335d.a(iVar4, -f2);
        return this;
    }

    public i a(e eVar, boolean[] zArr) {
        return this.f2335d.a(zArr, (i) null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float f2 = this.f2333b;
        if (f2 < 0.0f) {
            this.f2333b = f2 * -1.0f;
            this.f2335d.b();
        }
    }

    public void a(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f2332a = null;
            this.f2335d.a();
            int i = 0;
            while (true) {
                a aVar2 = bVar.f2335d;
                if (i < aVar2.f2248a) {
                    this.f2335d.a(aVar2.a(i), bVar.f2335d.b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void a(i iVar) {
        int i = iVar.f2362e;
        float f2 = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f2 = 1000.0f;
            } else if (i == 3) {
                f2 = 1000000.0f;
            } else if (i == 4) {
                f2 = 1.0E9f;
            } else if (i == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f2335d.a(iVar, f2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(e eVar) {
        boolean z;
        i a2 = this.f2335d.a(eVar);
        if (a2 == null) {
            z = true;
        } else {
            d(a2);
            z = false;
        }
        if (this.f2335d.f2248a == 0) {
            this.f2336e = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public b b(i iVar, int i) {
        this.f2332a = iVar;
        float f2 = (float) i;
        iVar.f2363f = f2;
        this.f2333b = f2;
        this.f2336e = true;
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2333b = (float) i;
        }
        if (!z) {
            this.f2335d.a(iVar, -1.0f);
            this.f2335d.a(iVar2, 1.0f);
            this.f2335d.a(iVar3, -1.0f);
        } else {
            this.f2335d.a(iVar, 1.0f);
            this.f2335d.a(iVar2, -1.0f);
            this.f2335d.a(iVar3, 1.0f);
        }
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2335d.a(iVar3, 0.5f);
        this.f2335d.a(iVar4, 0.5f);
        this.f2335d.a(iVar, -0.5f);
        this.f2335d.a(iVar2, -0.5f);
        this.f2333b = -f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        i iVar = this.f2332a;
        return iVar != null && (iVar.f2365h == i.a.UNRESTRICTED || this.f2333b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean b(i iVar) {
        return this.f2335d.a(iVar);
    }

    public b c(i iVar, int i) {
        a aVar;
        float f2;
        if (i < 0) {
            this.f2333b = (float) (i * -1);
            aVar = this.f2335d;
            f2 = 1.0f;
        } else {
            this.f2333b = (float) i;
            aVar = this.f2335d;
            f2 = -1.0f;
        }
        aVar.a(iVar, f2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public i c(i iVar) {
        return this.f2335d.a((boolean[]) null, iVar);
    }

    public boolean c() {
        return this.f2332a == null && this.f2333b == 0.0f && this.f2335d.f2248a == 0;
    }

    public void clear() {
        this.f2335d.a();
        this.f2332a = null;
        this.f2333b = 0.0f;
    }

    public void d() {
        this.f2332a = null;
        this.f2335d.a();
        this.f2333b = 0.0f;
        this.f2336e = false;
    }

    /* access modifiers changed from: package-private */
    public void d(i iVar) {
        i iVar2 = this.f2332a;
        if (iVar2 != null) {
            this.f2335d.a(iVar2, -1.0f);
            this.f2332a = null;
        }
        float a2 = this.f2335d.a(iVar, true) * -1.0f;
        this.f2332a = iVar;
        if (a2 != 1.0f) {
            this.f2333b /= a2;
            this.f2335d.a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String e() {
        /*
            r9 = this;
            b.f.a.i r0 = r9.f2332a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            b.f.a.i r1 = r9.f2332a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f2333b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f2333b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            b.f.a.a r5 = r9.f2335d
            int r5 = r5.f2248a
        L_0x0057:
            if (r2 >= r5) goto L_0x00d4
            b.f.a.a r6 = r9.f2335d
            b.f.a.i r6 = r6.a((int) r2)
            if (r6 != 0) goto L_0x0062
            goto L_0x00d1
        L_0x0062:
            b.f.a.a r7 = r9.f2335d
            float r7 = r7.b((int) r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006d
            goto L_0x00d1
        L_0x006d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0084
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a4
        L_0x0084:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ad
        L_0x009a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        L_0x00ad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c6
        L_0x00b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x00d4:
            if (r1 != 0) goto L_0x00e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.b.e():java.lang.String");
    }

    public i getKey() {
        return this.f2332a;
    }

    public String toString() {
        return e();
    }
}
