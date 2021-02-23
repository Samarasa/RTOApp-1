package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.j;
import com.google.android.gms.internal.ads.C2375pia;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.qW  reason: case insensitive filesystem */
public final class C2425qW {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f11850a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f11851b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f11852c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11853d;

    /* renamed from: e  reason: collision with root package name */
    private final VV f11854e;

    public C2425qW(Context context, C1949jia jia, VV vv) {
        this.f11851b = context;
        this.f11853d = Integer.toString(jia.a());
        this.f11852c = context.getSharedPreferences("pcvmspf", 0);
        this.f11854e = vv;
    }

    private final File a(String str) {
        return new File(new File(this.f11851b.getDir("pccache", 0), this.f11853d), str);
    }

    private final String a() {
        String valueOf = String.valueOf(this.f11853d);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    private final void a(int i, long j) {
        VV vv = this.f11854e;
        if (vv != null) {
            vv.a(i, j);
        }
    }

    private final void a(int i, long j, String str) {
        VV vv = this.f11854e;
        if (vv != null) {
            vv.a(i, j, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[SYNTHETIC, Splitter:B:10:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C2375pia b(int r3) {
        /*
            r2 = this;
            int r0 = com.google.android.gms.internal.ads.C2354pW.f11723a
            r1 = 0
            if (r3 != r0) goto L_0x0010
            android.content.SharedPreferences r3 = r2.f11852c
            java.lang.String r0 = r2.b()
        L_0x000b:
            java.lang.String r3 = r3.getString(r0, r1)
            goto L_0x001c
        L_0x0010:
            int r0 = com.google.android.gms.internal.ads.C2354pW.f11724b
            if (r3 != r0) goto L_0x001b
            android.content.SharedPreferences r3 = r2.f11852c
            java.lang.String r0 = r2.a()
            goto L_0x000b
        L_0x001b:
            r3 = r1
        L_0x001c:
            if (r3 != 0) goto L_0x001f
            return r1
        L_0x001f:
            byte[] r3 = com.google.android.gms.common.util.j.a((java.lang.String) r3)     // Catch:{ Iea -> 0x0030 }
            com.google.android.gms.internal.ads.Lda r3 = com.google.android.gms.internal.ads.Lda.a((byte[]) r3)     // Catch:{ Iea -> 0x0030 }
            com.google.android.gms.internal.ads.kea r0 = com.google.android.gms.internal.ads.C2012kea.b()     // Catch:{ Iea -> 0x0030 }
            com.google.android.gms.internal.ads.pia r3 = com.google.android.gms.internal.ads.C2375pia.a((com.google.android.gms.internal.ads.Lda) r3, (com.google.android.gms.internal.ads.C2012kea) r0)     // Catch:{ Iea -> 0x0030 }
            return r3
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2425qW.b(int):com.google.android.gms.internal.ads.pia");
    }

    private final String b() {
        String valueOf = String.valueOf(this.f11853d);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    private static String b(C2091lia lia) {
        C2375pia.a t = C2375pia.t();
        t.a(lia.o().o());
        t.b(lia.o().p());
        t.b(lia.o().r());
        t.c(lia.o().s());
        t.a(lia.o().q());
        return j.a(((C2375pia) t.k()).g().c());
    }

    public final C1858iW a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f11850a) {
            C2375pia b2 = b(i);
            if (b2 == null) {
                a(4022, currentTimeMillis);
                return null;
            }
            File a2 = a(b2.o());
            File file = new File(a2, "pcam.jar");
            if (!file.exists()) {
                file = new File(a2, "pcam");
            }
            File file2 = new File(a2, "pcbc");
            File file3 = new File(a2, "pcopt");
            a(5016, currentTimeMillis);
            C1858iW iWVar = new C1858iW(b2, file, file2, file3);
            return iWVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.C2091lia r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = f11850a
            monitor-enter(r2)
            com.google.android.gms.internal.ads.pia r3 = r7.o()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.o()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.a((java.lang.String) r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.Lda r3 = r7.q()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.c()     // Catch:{ all -> 0x0054 }
            boolean r3 = com.google.android.gms.internal.ads.C1999kW.a((java.io.File) r4, (byte[]) r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.a((int) r7, (long) r0)     // Catch:{ all -> 0x0054 }
            r7 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0030:
            java.lang.String r7 = b((com.google.android.gms.internal.ads.C2091lia) r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.f11852c     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.b()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.a((int) r3, (long) r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.a((int) r3, (long) r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2425qW.a(com.google.android.gms.internal.ads.lia):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.C2091lia r17, com.google.android.gms.internal.ads.C2212nW r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r4 = f11850a
            monitor-enter(r4)
            int r5 = com.google.android.gms.internal.ads.C2354pW.f11723a     // Catch:{ all -> 0x018b }
            com.google.android.gms.internal.ads.pia r5 = r1.b((int) r5)     // Catch:{ all -> 0x018b }
            com.google.android.gms.internal.ads.pia r6 = r17.o()     // Catch:{ all -> 0x018b }
            java.lang.String r6 = r6.o()     // Catch:{ all -> 0x018b }
            r7 = 0
            if (r5 == 0) goto L_0x002d
            java.lang.String r5 = r5.o()     // Catch:{ all -> 0x018b }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x002d
            r0 = 4014(0xfae, float:5.625E-42)
            r1.a((int) r0, (long) r2)     // Catch:{ all -> 0x018b }
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            return r7
        L_0x002d:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x018b }
            java.io.File r5 = r1.a((java.lang.String) r6)     // Catch:{ all -> 0x018b }
            boolean r10 = r5.exists()     // Catch:{ all -> 0x018b }
            r11 = 4015(0xfaf, float:5.626E-42)
            r12 = 1
            if (r10 == 0) goto L_0x0081
            r10 = 4023(0xfb7, float:5.637E-42)
            boolean r13 = r5.isDirectory()     // Catch:{ all -> 0x018b }
            if (r13 == 0) goto L_0x0049
            java.lang.String r13 = "1"
            goto L_0x004b
        L_0x0049:
            java.lang.String r13 = "0"
        L_0x004b:
            boolean r5 = r5.isFile()     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = "1"
            goto L_0x0056
        L_0x0054:
            java.lang.String r5 = "0"
        L_0x0056:
            int r14 = r13.length()     // Catch:{ all -> 0x018b }
            int r14 = r14 + 5
            int r15 = r5.length()     // Catch:{ all -> 0x018b }
            int r14 = r14 + r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x018b }
            r15.<init>(r14)     // Catch:{ all -> 0x018b }
            java.lang.String r14 = "d:"
            r15.append(r14)     // Catch:{ all -> 0x018b }
            r15.append(r13)     // Catch:{ all -> 0x018b }
            java.lang.String r13 = ",f:"
            r15.append(r13)     // Catch:{ all -> 0x018b }
            r15.append(r5)     // Catch:{ all -> 0x018b }
            java.lang.String r5 = r15.toString()     // Catch:{ all -> 0x018b }
            r1.a(r10, r8, r5)     // Catch:{ all -> 0x018b }
            r1.a((int) r11, (long) r8)     // Catch:{ all -> 0x018b }
            goto L_0x00ae
        L_0x0081:
            boolean r10 = r5.mkdirs()     // Catch:{ all -> 0x018b }
            if (r10 != 0) goto L_0x00ae
            r10 = 4024(0xfb8, float:5.639E-42)
            java.lang.String r13 = "cw:"
            boolean r5 = r5.canWrite()     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x0094
            java.lang.String r5 = "1"
            goto L_0x0096
        L_0x0094:
            java.lang.String r5 = "0"
        L_0x0096:
            int r14 = r5.length()     // Catch:{ all -> 0x018b }
            if (r14 == 0) goto L_0x00a1
            java.lang.String r5 = r13.concat(r5)     // Catch:{ all -> 0x018b }
            goto L_0x00a6
        L_0x00a1:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x018b }
            r5.<init>(r13)     // Catch:{ all -> 0x018b }
        L_0x00a6:
            r1.a(r10, r8, r5)     // Catch:{ all -> 0x018b }
            r1.a((int) r11, (long) r8)     // Catch:{ all -> 0x018b }
            r5 = 0
            goto L_0x00af
        L_0x00ae:
            r5 = 1
        L_0x00af:
            if (r5 != 0) goto L_0x00b3
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            return r7
        L_0x00b3:
            java.io.File r5 = r1.a((java.lang.String) r6)     // Catch:{ all -> 0x018b }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x018b }
            java.lang.String r8 = "pcam.jar"
            r6.<init>(r5, r8)     // Catch:{ all -> 0x018b }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x018b }
            java.lang.String r9 = "pcbc"
            r8.<init>(r5, r9)     // Catch:{ all -> 0x018b }
            com.google.android.gms.internal.ads.Lda r9 = r17.p()     // Catch:{ all -> 0x018b }
            byte[] r9 = r9.c()     // Catch:{ all -> 0x018b }
            boolean r9 = com.google.android.gms.internal.ads.C1999kW.a((java.io.File) r6, (byte[]) r9)     // Catch:{ all -> 0x018b }
            if (r9 != 0) goto L_0x00da
            r0 = 4016(0xfb0, float:5.628E-42)
            r1.a((int) r0, (long) r2)     // Catch:{ all -> 0x018b }
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            return r7
        L_0x00da:
            com.google.android.gms.internal.ads.Lda r9 = r17.q()     // Catch:{ all -> 0x018b }
            byte[] r9 = r9.c()     // Catch:{ all -> 0x018b }
            boolean r8 = com.google.android.gms.internal.ads.C1999kW.a((java.io.File) r8, (byte[]) r9)     // Catch:{ all -> 0x018b }
            if (r8 != 0) goto L_0x00ef
            r0 = 4017(0xfb1, float:5.629E-42)
            r1.a((int) r0, (long) r2)     // Catch:{ all -> 0x018b }
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            return r7
        L_0x00ef:
            if (r0 == 0) goto L_0x0101
            boolean r0 = r0.a(r6)     // Catch:{ all -> 0x018b }
            if (r0 != 0) goto L_0x0101
            r0 = 4018(0xfb2, float:5.63E-42)
            r1.a((int) r0, (long) r2)     // Catch:{ all -> 0x018b }
            com.google.android.gms.internal.ads.C1999kW.a(r5)     // Catch:{ all -> 0x018b }
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            return r7
        L_0x0101:
            java.lang.String r0 = b((com.google.android.gms.internal.ads.C2091lia) r17)     // Catch:{ all -> 0x018b }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x018b }
            android.content.SharedPreferences r8 = r1.f11852c     // Catch:{ all -> 0x018b }
            java.lang.String r9 = r16.b()     // Catch:{ all -> 0x018b }
            r10 = 0
            java.lang.String r8 = r8.getString(r9, r10)     // Catch:{ all -> 0x018b }
            android.content.SharedPreferences r9 = r1.f11852c     // Catch:{ all -> 0x018b }
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ all -> 0x018b }
            java.lang.String r10 = r16.b()     // Catch:{ all -> 0x018b }
            r9.putString(r10, r0)     // Catch:{ all -> 0x018b }
            if (r8 == 0) goto L_0x012a
            java.lang.String r0 = r16.a()     // Catch:{ all -> 0x018b }
            r9.putString(r0, r8)     // Catch:{ all -> 0x018b }
        L_0x012a:
            boolean r0 = r9.commit()     // Catch:{ all -> 0x018b }
            if (r0 != 0) goto L_0x0135
            r8 = 4019(0xfb3, float:5.632E-42)
            r1.a((int) r8, (long) r5)     // Catch:{ all -> 0x018b }
        L_0x0135:
            if (r0 != 0) goto L_0x0139
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            return r7
        L_0x0139:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x018b }
            r0.<init>()     // Catch:{ all -> 0x018b }
            int r5 = com.google.android.gms.internal.ads.C2354pW.f11723a     // Catch:{ all -> 0x018b }
            com.google.android.gms.internal.ads.pia r5 = r1.b((int) r5)     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x014d
            java.lang.String r5 = r5.o()     // Catch:{ all -> 0x018b }
            r0.add(r5)     // Catch:{ all -> 0x018b }
        L_0x014d:
            int r5 = com.google.android.gms.internal.ads.C2354pW.f11724b     // Catch:{ all -> 0x018b }
            com.google.android.gms.internal.ads.pia r5 = r1.b((int) r5)     // Catch:{ all -> 0x018b }
            if (r5 == 0) goto L_0x015c
            java.lang.String r5 = r5.o()     // Catch:{ all -> 0x018b }
            r0.add(r5)     // Catch:{ all -> 0x018b }
        L_0x015c:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x018b }
            android.content.Context r6 = r1.f11851b     // Catch:{ all -> 0x018b }
            java.lang.String r8 = "pccache"
            java.io.File r6 = r6.getDir(r8, r7)     // Catch:{ all -> 0x018b }
            java.lang.String r8 = r1.f11853d     // Catch:{ all -> 0x018b }
            r5.<init>(r6, r8)     // Catch:{ all -> 0x018b }
            java.io.File[] r5 = r5.listFiles()     // Catch:{ all -> 0x018b }
            int r6 = r5.length     // Catch:{ all -> 0x018b }
        L_0x0170:
            if (r7 >= r6) goto L_0x0184
            r8 = r5[r7]     // Catch:{ all -> 0x018b }
            java.lang.String r9 = r8.getName()     // Catch:{ all -> 0x018b }
            boolean r9 = r0.contains(r9)     // Catch:{ all -> 0x018b }
            if (r9 != 0) goto L_0x0181
            com.google.android.gms.internal.ads.C1999kW.a(r8)     // Catch:{ all -> 0x018b }
        L_0x0181:
            int r7 = r7 + 1
            goto L_0x0170
        L_0x0184:
            r0 = 5014(0x1396, float:7.026E-42)
            r1.a((int) r0, (long) r2)     // Catch:{ all -> 0x018b }
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            return r12
        L_0x018b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x018b }
            goto L_0x018f
        L_0x018e:
            throw r0
        L_0x018f:
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2425qW.a(com.google.android.gms.internal.ads.lia, com.google.android.gms.internal.ads.nW):boolean");
    }
}
