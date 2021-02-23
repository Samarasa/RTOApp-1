package b.f.a;

import b.f.a.i;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;

public class a {

    /* renamed from: a  reason: collision with root package name */
    int f2248a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f2249b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2250c;

    /* renamed from: d  reason: collision with root package name */
    private int f2251d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f2252e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f2253f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f2254g;

    /* renamed from: h  reason: collision with root package name */
    private float[] f2255h;
    private int i;
    private int j;
    private boolean k;

    a(b bVar, c cVar) {
        int i2 = this.f2251d;
        this.f2253f = new int[i2];
        this.f2254g = new int[i2];
        this.f2255h = new float[i2];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f2249b = bVar;
        this.f2250c = cVar;
    }

    private boolean a(i iVar, e eVar) {
        return iVar.k <= 1;
    }

    public final float a(i iVar, boolean z) {
        if (this.f2252e == iVar) {
            this.f2252e = null;
        }
        int i2 = this.i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f2248a) {
            if (this.f2253f[i2] == iVar.f2360c) {
                if (i2 == this.i) {
                    this.i = this.f2254g[i2];
                } else {
                    int[] iArr = this.f2254g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.b(this.f2249b);
                }
                iVar.k--;
                this.f2248a--;
                this.f2253f[i2] = -1;
                if (this.k) {
                    this.j = i2;
                }
                return this.f2255h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2254g[i2];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final i a(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f2248a) {
            if (i4 == i2) {
                return this.f2250c.f2339c[this.f2253f[i3]];
            }
            i3 = this.f2254g[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.f.a.i a(b.f.a.e r15) {
        /*
            r14 = this;
            int r0 = r14.i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0089
            int r9 = r14.f2248a
            if (r2 >= r9) goto L_0x0089
            float[] r9 = r14.f2255h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            b.f.a.c r12 = r14.f2250c
            b.f.a.i[] r12 = r12.f2339c
            int[] r13 = r14.f2253f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0030
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x003c
            r9[r0] = r3
            goto L_0x0036
        L_0x0030:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x003c
            r9[r0] = r3
        L_0x0036:
            b.f.a.b r9 = r14.f2249b
            r12.b(r9)
            r10 = 0
        L_0x003c:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0082
            b.f.a.i$a r11 = r12.f2365h
            b.f.a.i$a r13 = b.f.a.i.a.UNRESTRICTED
            if (r11 != r13) goto L_0x0062
            if (r4 != 0) goto L_0x0051
        L_0x0049:
            boolean r4 = r14.a((b.f.a.i) r12, (b.f.a.e) r15)
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x0082
        L_0x0051:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0056
            goto L_0x0049
        L_0x0056:
            if (r6 != 0) goto L_0x0082
            boolean r11 = r14.a((b.f.a.i) r12, (b.f.a.e) r15)
            if (r11 == 0) goto L_0x0082
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x0082
        L_0x0062:
            if (r4 != 0) goto L_0x0082
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0082
            if (r1 != 0) goto L_0x0072
        L_0x006a:
            boolean r1 = r14.a((b.f.a.i) r12, (b.f.a.e) r15)
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x0082
        L_0x0072:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0077
            goto L_0x006a
        L_0x0077:
            if (r8 != 0) goto L_0x0082
            boolean r11 = r14.a((b.f.a.i) r12, (b.f.a.e) r15)
            if (r11 == 0) goto L_0x0082
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x0082:
            int[] r9 = r14.f2254g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0089:
            if (r4 == 0) goto L_0x008c
            return r4
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.a(b.f.a.e):b.f.a.i");
    }

    /* access modifiers changed from: package-private */
    public i a(boolean[] zArr, i iVar) {
        i.a aVar;
        int i2 = this.i;
        int i3 = 0;
        i iVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.f2248a) {
            if (this.f2255h[i2] < 0.0f) {
                i iVar3 = this.f2250c.f2339c[this.f2253f[i2]];
                if ((zArr == null || !zArr[iVar3.f2360c]) && iVar3 != iVar && ((aVar = iVar3.f2365h) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float f3 = this.f2255h[i2];
                    if (f3 < f2) {
                        iVar2 = iVar3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.f2254g[i2];
            i3++;
        }
        return iVar2;
    }

    public final void a() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2248a) {
            i iVar = this.f2250c.f2339c[this.f2253f[i2]];
            if (iVar != null) {
                iVar.b(this.f2249b);
            }
            i2 = this.f2254g[i2];
            i3++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f2248a = 0;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2248a) {
            float[] fArr = this.f2255h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2254g[i2];
            i3++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar, b bVar2, boolean z) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.f2248a) {
                int i4 = this.f2253f[i2];
                i iVar = bVar2.f2332a;
                if (i4 == iVar.f2360c) {
                    float f2 = this.f2255h[i2];
                    a(iVar, z);
                    a aVar = bVar2.f2335d;
                    int i5 = aVar.i;
                    int i6 = 0;
                    while (i5 != -1 && i6 < aVar.f2248a) {
                        a(this.f2250c.f2339c[aVar.f2253f[i5]], aVar.f2255h[i5] * f2, z);
                        i5 = aVar.f2254g[i5];
                        i6++;
                    }
                    bVar.f2333b += bVar2.f2333b * f2;
                    if (z) {
                        bVar2.f2332a.b(bVar);
                    }
                    i2 = this.i;
                } else {
                    i2 = this.f2254g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, b[] bVarArr) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.f2248a) {
                i iVar = this.f2250c.f2339c[this.f2253f[i2]];
                if (iVar.f2361d != -1) {
                    float f2 = this.f2255h[i2];
                    a(iVar, true);
                    b bVar2 = bVarArr[iVar.f2361d];
                    if (!bVar2.f2336e) {
                        a aVar = bVar2.f2335d;
                        int i4 = aVar.i;
                        int i5 = 0;
                        while (i4 != -1 && i5 < aVar.f2248a) {
                            a(this.f2250c.f2339c[aVar.f2253f[i4]], aVar.f2255h[i4] * f2, true);
                            i4 = aVar.f2254g[i4];
                            i5++;
                        }
                    }
                    bVar.f2333b += bVar2.f2333b * f2;
                    bVar2.f2332a.b(bVar);
                    i2 = this.i;
                } else {
                    i2 = this.f2254g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    public final void a(i iVar, float f2) {
        if (f2 == 0.0f) {
            a(iVar, true);
            return;
        }
        int i2 = this.i;
        if (i2 == -1) {
            this.i = 0;
            float[] fArr = this.f2255h;
            int i3 = this.i;
            fArr[i3] = f2;
            this.f2253f[i3] = iVar.f2360c;
            this.f2254g[i3] = -1;
            iVar.k++;
            iVar.a(this.f2249b);
            this.f2248a++;
            if (!this.k) {
                this.j++;
                int i4 = this.j;
                int[] iArr = this.f2253f;
                if (i4 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i5 = 0;
        int i6 = -1;
        while (i2 != -1 && i5 < this.f2248a) {
            int[] iArr2 = this.f2253f;
            int i7 = iArr2[i2];
            int i8 = iVar.f2360c;
            if (i7 == i8) {
                this.f2255h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i8) {
                i6 = i2;
            }
            i2 = this.f2254g[i2];
            i5++;
        }
        int i9 = this.j;
        int i10 = i9 + 1;
        if (this.k) {
            int[] iArr3 = this.f2253f;
            if (iArr3[i9] != -1) {
                i9 = iArr3.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr4 = this.f2253f;
        if (i9 >= iArr4.length && this.f2248a < iArr4.length) {
            int i11 = 0;
            while (true) {
                int[] iArr5 = this.f2253f;
                if (i11 >= iArr5.length) {
                    break;
                } else if (iArr5[i11] == -1) {
                    i9 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        int[] iArr6 = this.f2253f;
        if (i9 >= iArr6.length) {
            i9 = iArr6.length;
            this.f2251d *= 2;
            this.k = false;
            this.j = i9 - 1;
            this.f2255h = Arrays.copyOf(this.f2255h, this.f2251d);
            this.f2253f = Arrays.copyOf(this.f2253f, this.f2251d);
            this.f2254g = Arrays.copyOf(this.f2254g, this.f2251d);
        }
        this.f2253f[i9] = iVar.f2360c;
        this.f2255h[i9] = f2;
        if (i6 != -1) {
            int[] iArr7 = this.f2254g;
            iArr7[i9] = iArr7[i6];
            iArr7[i6] = i9;
        } else {
            this.f2254g[i9] = this.i;
            this.i = i9;
        }
        iVar.k++;
        iVar.a(this.f2249b);
        this.f2248a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f2248a >= this.f2253f.length) {
            this.k = true;
        }
        int i12 = this.j;
        int[] iArr8 = this.f2253f;
        if (i12 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(i iVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.i;
            if (i2 == -1) {
                this.i = 0;
                float[] fArr = this.f2255h;
                int i3 = this.i;
                fArr[i3] = f2;
                this.f2253f[i3] = iVar.f2360c;
                this.f2254g[i3] = -1;
                iVar.k++;
                iVar.a(this.f2249b);
                this.f2248a++;
                if (!this.k) {
                    this.j++;
                    int i4 = this.j;
                    int[] iArr = this.f2253f;
                    if (i4 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i5 = 0;
            int i6 = -1;
            while (i2 != -1 && i5 < this.f2248a) {
                int[] iArr2 = this.f2253f;
                int i7 = iArr2[i2];
                int i8 = iVar.f2360c;
                if (i7 == i8) {
                    float[] fArr2 = this.f2255h;
                    fArr2[i2] = fArr2[i2] + f2;
                    if (fArr2[i2] == 0.0f) {
                        if (i2 == this.i) {
                            this.i = this.f2254g[i2];
                        } else {
                            int[] iArr3 = this.f2254g;
                            iArr3[i6] = iArr3[i2];
                        }
                        if (z) {
                            iVar.b(this.f2249b);
                        }
                        if (this.k) {
                            this.j = i2;
                        }
                        iVar.k--;
                        this.f2248a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i8) {
                    i6 = i2;
                }
                i2 = this.f2254g[i2];
                i5++;
            }
            int i9 = this.j;
            int i10 = i9 + 1;
            if (this.k) {
                int[] iArr4 = this.f2253f;
                if (iArr4[i9] != -1) {
                    i9 = iArr4.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr5 = this.f2253f;
            if (i9 >= iArr5.length && this.f2248a < iArr5.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr6 = this.f2253f;
                    if (i11 >= iArr6.length) {
                        break;
                    } else if (iArr6[i11] == -1) {
                        i9 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int[] iArr7 = this.f2253f;
            if (i9 >= iArr7.length) {
                i9 = iArr7.length;
                this.f2251d *= 2;
                this.k = false;
                this.j = i9 - 1;
                this.f2255h = Arrays.copyOf(this.f2255h, this.f2251d);
                this.f2253f = Arrays.copyOf(this.f2253f, this.f2251d);
                this.f2254g = Arrays.copyOf(this.f2254g, this.f2251d);
            }
            this.f2253f[i9] = iVar.f2360c;
            this.f2255h[i9] = f2;
            if (i6 != -1) {
                int[] iArr8 = this.f2254g;
                iArr8[i9] = iArr8[i6];
                iArr8[i6] = i9;
            } else {
                this.f2254g[i9] = this.i;
                this.i = i9;
            }
            iVar.k++;
            iVar.a(this.f2249b);
            this.f2248a++;
            if (!this.k) {
                this.j++;
            }
            int i12 = this.j;
            int[] iArr9 = this.f2253f;
            if (i12 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(i iVar) {
        int i2 = this.i;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2248a) {
            if (this.f2253f[i2] == iVar.f2360c) {
                return true;
            }
            i2 = this.f2254g[i2];
            i3++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final float b(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f2248a) {
            if (i4 == i2) {
                return this.f2255h[i3];
            }
            i3 = this.f2254g[i3];
            i4++;
        }
        return 0.0f;
    }

    public final float b(i iVar) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2248a) {
            if (this.f2253f[i2] == iVar.f2360c) {
                return this.f2255h[i2];
            }
            i2 = this.f2254g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2248a) {
            float[] fArr = this.f2255h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f2254g[i2];
            i3++;
        }
    }

    public String toString() {
        int i2 = this.i;
        String str = BuildConfig.FLAVOR;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2248a) {
            str = ((str + " -> ") + this.f2255h[i2] + " : ") + this.f2250c.f2339c[this.f2253f[i2]];
            i2 = this.f2254g[i2];
            i3++;
        }
        return str;
    }
}
