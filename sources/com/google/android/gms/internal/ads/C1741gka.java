package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.gka  reason: case insensitive filesystem */
final class C1741gka implements C1812hka {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10571a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final Stack<C1882ika> f10572b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    private final C2450qka f10573c = new C2450qka();

    /* renamed from: d  reason: collision with root package name */
    private C2024kka f10574d;

    /* renamed from: e  reason: collision with root package name */
    private int f10575e;

    /* renamed from: f  reason: collision with root package name */
    private int f10576f;

    /* renamed from: g  reason: collision with root package name */
    private long f10577g;

    C1741gka() {
    }

    private final long a(Wja wja, int i) {
        wja.readFully(this.f10571a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f10571a[i2] & 255));
        }
        return j;
    }

    public final void a(C2024kka kka) {
        this.f10574d = kka;
    }

    public final boolean a(Wja wja) {
        String str;
        int a2;
        int a3;
        Cma.b(this.f10574d != null);
        while (true) {
            if (this.f10572b.isEmpty() || wja.getPosition() < this.f10572b.peek().f10834b) {
                if (this.f10575e == 0) {
                    long a4 = this.f10573c.a(wja, true, false, 4);
                    if (a4 == -2) {
                        wja.a();
                        while (true) {
                            wja.a(this.f10571a, 0, 4);
                            a2 = C2450qka.a(this.f10571a[0]);
                            if (a2 != -1 && a2 <= 4) {
                                a3 = (int) C2450qka.a(this.f10571a, a2, false);
                                if (this.f10574d.a(a3)) {
                                    break;
                                }
                            }
                            wja.c(1);
                        }
                        wja.c(a2);
                        a4 = (long) a3;
                    }
                    if (a4 == -1) {
                        return false;
                    }
                    this.f10576f = (int) a4;
                    this.f10575e = 1;
                }
                if (this.f10575e == 1) {
                    this.f10577g = this.f10573c.a(wja, false, true, 8);
                    this.f10575e = 2;
                }
                int b2 = this.f10574d.b(this.f10576f);
                if (b2 == 0) {
                    wja.c((int) this.f10577g);
                    this.f10575e = 0;
                } else if (b2 == 1) {
                    long position = wja.getPosition();
                    this.f10572b.add(new C1882ika(this.f10576f, this.f10577g + position));
                    this.f10574d.a(this.f10576f, position, this.f10577g);
                    this.f10575e = 0;
                    return true;
                } else if (b2 == 2) {
                    long j = this.f10577g;
                    if (j <= 8) {
                        this.f10574d.b(this.f10576f, a(wja, (int) j));
                        this.f10575e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j);
                    throw new Sia(sb.toString());
                } else if (b2 == 3) {
                    long j2 = this.f10577g;
                    if (j2 <= 2147483647L) {
                        C2024kka kka = this.f10574d;
                        int i = this.f10576f;
                        int i2 = (int) j2;
                        if (i2 == 0) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            byte[] bArr = new byte[i2];
                            wja.readFully(bArr, 0, i2);
                            str = new String(bArr);
                        }
                        kka.a(i, str);
                        this.f10575e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j2);
                    throw new Sia(sb2.toString());
                } else if (b2 == 4) {
                    this.f10574d.a(this.f10576f, (int) this.f10577g, wja);
                    this.f10575e = 0;
                    return true;
                } else if (b2 == 5) {
                    long j3 = this.f10577g;
                    if (j3 == 4 || j3 == 8) {
                        C2024kka kka2 = this.f10574d;
                        int i3 = this.f10576f;
                        int i4 = (int) this.f10577g;
                        long a5 = a(wja, i4);
                        kka2.a(i3, i4 == 4 ? (double) Float.intBitsToFloat((int) a5) : Double.longBitsToDouble(a5));
                        this.f10575e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j3);
                    throw new Sia(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(b2);
                    throw new Sia(sb4.toString());
                }
            } else {
                this.f10574d.c(this.f10572b.pop().f10833a);
                return true;
            }
        }
    }

    public final void reset() {
        this.f10575e = 0;
        this.f10572b.clear();
        this.f10573c.a();
    }
}
