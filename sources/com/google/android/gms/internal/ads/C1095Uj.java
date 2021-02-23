package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Uj  reason: case insensitive filesystem */
final class C1095Uj {

    /* renamed from: a  reason: collision with root package name */
    long f8919a;

    /* renamed from: b  reason: collision with root package name */
    final String f8920b;

    /* renamed from: c  reason: collision with root package name */
    final String f8921c;

    /* renamed from: d  reason: collision with root package name */
    final long f8922d;

    /* renamed from: e  reason: collision with root package name */
    final long f8923e;

    /* renamed from: f  reason: collision with root package name */
    final long f8924f;

    /* renamed from: g  reason: collision with root package name */
    final long f8925g;

    /* renamed from: h  reason: collision with root package name */
    final List<Zoa> f8926h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1095Uj(java.lang.String r14, com.google.android.gms.internal.ads.C3019yla r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f12971b
            long r3 = r15.f12972c
            long r5 = r15.f12973d
            long r7 = r15.f12974e
            long r9 = r15.f12975f
            java.util.List<com.google.android.gms.internal.ads.Zoa> r0 = r15.f12977h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f12976g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.Zoa r11 = new com.google.android.gms.internal.ads.Zoa
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1095Uj.<init>(java.lang.String, com.google.android.gms.internal.ads.yla):void");
    }

    private C1095Uj(String str, String str2, long j, long j2, long j3, long j4, List<Zoa> list) {
        this.f8920b = str;
        this.f8921c = BuildConfig.FLAVOR.equals(str2) ? null : str2;
        this.f8922d = j;
        this.f8923e = j2;
        this.f8924f = j3;
        this.f8925g = j4;
        this.f8926h = list;
    }

    static C1095Uj a(C2521rl rlVar) {
        if (C1738gj.a((InputStream) rlVar) == 538247942) {
            return new C1095Uj(C1738gj.a(rlVar), C1738gj.a(rlVar), C1738gj.b((InputStream) rlVar), C1738gj.b((InputStream) rlVar), C1738gj.b((InputStream) rlVar), C1738gj.b((InputStream) rlVar), C1738gj.b(rlVar));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(OutputStream outputStream) {
        try {
            C1738gj.a(outputStream, 538247942);
            C1738gj.a(outputStream, this.f8920b);
            C1738gj.a(outputStream, this.f8921c == null ? BuildConfig.FLAVOR : this.f8921c);
            C1738gj.a(outputStream, this.f8922d);
            C1738gj.a(outputStream, this.f8923e);
            C1738gj.a(outputStream, this.f8924f);
            C1738gj.a(outputStream, this.f8925g);
            List<Zoa> list = this.f8926h;
            if (list != null) {
                C1738gj.a(outputStream, list.size());
                for (Zoa next : list) {
                    C1738gj.a(outputStream, next.a());
                    C1738gj.a(outputStream, next.b());
                }
            } else {
                C1738gj.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            C0936Og.a("%s", e2.toString());
            return false;
        }
    }
}
