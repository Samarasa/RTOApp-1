package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.j;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.gW  reason: case insensitive filesystem */
public final class C1716gW {

    /* renamed from: a  reason: collision with root package name */
    private final File f10544a;

    /* renamed from: b  reason: collision with root package name */
    private final File f10545b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f10546c;

    /* renamed from: d  reason: collision with root package name */
    private final C1949jia f10547d;

    public C1716gW(Context context, C1949jia jia) {
        this.f10546c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        C1999kW.a(dir, false);
        this.f10544a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        C1999kW.a(dir2, true);
        this.f10545b = dir2;
        this.f10547d = jia;
    }

    private final File a() {
        File file = new File(this.f10544a, Integer.toString(this.f10547d.a()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String a(C2375pia pia) {
        return j.a(pia.g().c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[SYNTHETIC, Splitter:B:11:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C2375pia b(int r6) {
        /*
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.C2354pW.f11723a
            r1 = 0
            if (r6 != r0) goto L_0x0010
            android.content.SharedPreferences r6 = r5.f10546c
            java.lang.String r0 = r5.c()
        L_0x000b:
            java.lang.String r6 = r6.getString(r0, r1)
            goto L_0x001c
        L_0x0010:
            int r0 = com.google.android.gms.internal.ads.C2354pW.f11724b
            if (r6 != r0) goto L_0x001b
            android.content.SharedPreferences r6 = r5.f10546c
            java.lang.String r0 = r5.b()
            goto L_0x000b
        L_0x001b:
            r6 = r1
        L_0x001c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0023
            return r1
        L_0x0023:
            byte[] r6 = com.google.android.gms.common.util.j.a((java.lang.String) r6)     // Catch:{ Iea -> 0x0069 }
            com.google.android.gms.internal.ads.Lda r6 = com.google.android.gms.internal.ads.Lda.a((byte[]) r6)     // Catch:{ Iea -> 0x0069 }
            com.google.android.gms.internal.ads.pia r6 = com.google.android.gms.internal.ads.C2375pia.a((com.google.android.gms.internal.ads.Lda) r6)     // Catch:{ Iea -> 0x0069 }
            java.lang.String r0 = r6.o()     // Catch:{ Iea -> 0x0069 }
            java.lang.String r2 = "pcam.jar"
            java.io.File r3 = r5.a()     // Catch:{ Iea -> 0x0069 }
            java.io.File r2 = com.google.android.gms.internal.ads.C1999kW.a(r0, r2, r3)     // Catch:{ Iea -> 0x0069 }
            boolean r3 = r2.exists()     // Catch:{ Iea -> 0x0069 }
            if (r3 != 0) goto L_0x004d
            java.lang.String r2 = "pcam"
            java.io.File r3 = r5.a()     // Catch:{ Iea -> 0x0069 }
            java.io.File r2 = com.google.android.gms.internal.ads.C1999kW.a(r0, r2, r3)     // Catch:{ Iea -> 0x0069 }
        L_0x004d:
            java.lang.String r3 = "pcbc"
            java.io.File r4 = r5.a()     // Catch:{ Iea -> 0x0069 }
            java.io.File r0 = com.google.android.gms.internal.ads.C1999kW.a(r0, r3, r4)     // Catch:{ Iea -> 0x0069 }
            boolean r2 = r2.exists()     // Catch:{ Iea -> 0x0069 }
            if (r2 == 0) goto L_0x0065
            boolean r0 = r0.exists()     // Catch:{ Iea -> 0x0069 }
            if (r0 == 0) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x0069
            return r6
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1716gW.b(int):com.google.android.gms.internal.ads.pia");
    }

    private final String b() {
        int a2 = this.f10547d.a();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(a2);
        return sb.toString();
    }

    private final String c() {
        int a2 = this.f10547d.a();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(a2);
        return sb.toString();
    }

    public final C1858iW a(int i) {
        C2375pia b2 = b(i);
        if (b2 == null) {
            return null;
        }
        String o = b2.o();
        File a2 = C1999kW.a(o, "pcam.jar", a());
        if (!a2.exists()) {
            a2 = C1999kW.a(o, "pcam", a());
        }
        return new C1858iW(b2, a2, C1999kW.a(o, "pcbc", a()), C1999kW.a(o, "pcopt", a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0139, code lost:
        if (r0.commit() != false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.C2091lia r9, com.google.android.gms.internal.ads.C2212nW r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.pia r0 = r9.o()
            java.lang.String r0 = r0.o()
            com.google.android.gms.internal.ads.Lda r1 = r9.p()
            byte[] r1 = r1.c()
            com.google.android.gms.internal.ads.Lda r2 = r9.q()
            byte[] r2 = r2.c()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = "pcbc"
            java.lang.String r5 = "pcam.jar"
            r6 = 0
            if (r3 != 0) goto L_0x0059
            if (r2 == 0) goto L_0x0059
            int r3 = r2.length
            if (r3 != 0) goto L_0x0029
            goto L_0x0059
        L_0x0029:
            java.io.File r3 = r8.f10545b
            com.google.android.gms.internal.ads.C1999kW.a(r3)
            java.io.File r3 = r8.f10545b
            r3.mkdirs()
            java.io.File r3 = r8.f10545b
            java.io.File r3 = com.google.android.gms.internal.ads.C1999kW.a((java.lang.String) r0, (java.io.File) r3)
            r3.mkdirs()
            java.io.File r3 = r8.f10545b
            java.io.File r3 = com.google.android.gms.internal.ads.C1999kW.a(r0, r5, r3)
            if (r1 == 0) goto L_0x004e
            int r7 = r1.length
            if (r7 <= 0) goto L_0x004e
            boolean r1 = com.google.android.gms.internal.ads.C1999kW.a((java.io.File) r3, (byte[]) r1)
            if (r1 != 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            java.io.File r1 = r8.f10545b
            java.io.File r0 = com.google.android.gms.internal.ads.C1999kW.a(r0, r4, r1)
            boolean r0 = com.google.android.gms.internal.ads.C1999kW.a((java.io.File) r0, (byte[]) r2)
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            return r6
        L_0x005d:
            com.google.android.gms.internal.ads.pia r0 = r9.o()
            java.lang.String r0 = r0.o()
            java.io.File r1 = r8.f10545b
            java.io.File r0 = com.google.android.gms.internal.ads.C1999kW.a(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x007a
            if (r10 == 0) goto L_0x007a
            boolean r10 = r10.a(r0)
            if (r10 != 0) goto L_0x007a
            return r6
        L_0x007a:
            com.google.android.gms.internal.ads.pia r10 = r9.o()
            java.lang.String r10 = r10.o()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 1
            if (r0 != 0) goto L_0x00bf
            java.io.File r0 = r8.f10545b
            java.io.File r0 = com.google.android.gms.internal.ads.C1999kW.a(r10, r5, r0)
            java.io.File r2 = r8.f10545b
            java.io.File r2 = com.google.android.gms.internal.ads.C1999kW.a(r10, r4, r2)
            java.io.File r3 = r8.a()
            java.io.File r3 = com.google.android.gms.internal.ads.C1999kW.a(r10, r5, r3)
            java.io.File r5 = r8.a()
            java.io.File r10 = com.google.android.gms.internal.ads.C1999kW.a(r10, r4, r5)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L_0x00b1
            boolean r0 = r0.renameTo(r3)
            if (r0 == 0) goto L_0x00bf
        L_0x00b1:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00bf
            boolean r10 = r2.renameTo(r10)
            if (r10 == 0) goto L_0x00bf
            r10 = 1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            if (r10 == 0) goto L_0x013c
            com.google.android.gms.internal.ads.pia$a r10 = com.google.android.gms.internal.ads.C2375pia.t()
            com.google.android.gms.internal.ads.pia r0 = r9.o()
            java.lang.String r0 = r0.o()
            r10.a((java.lang.String) r0)
            com.google.android.gms.internal.ads.pia r0 = r9.o()
            java.lang.String r0 = r0.p()
            r10.b((java.lang.String) r0)
            com.google.android.gms.internal.ads.pia r0 = r9.o()
            long r2 = r0.r()
            r10.b((long) r2)
            com.google.android.gms.internal.ads.pia r0 = r9.o()
            long r2 = r0.s()
            r10.c(r2)
            com.google.android.gms.internal.ads.pia r9 = r9.o()
            long r2 = r9.q()
            r10.a((long) r2)
            com.google.android.gms.internal.ads.ifa r9 = r10.k()
            com.google.android.gms.internal.ads.pia r9 = (com.google.android.gms.internal.ads.C2375pia) r9
            int r10 = com.google.android.gms.internal.ads.C2354pW.f11723a
            com.google.android.gms.internal.ads.pia r10 = r8.b(r10)
            android.content.SharedPreferences r0 = r8.f10546c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r10 == 0) goto L_0x012a
            java.lang.String r2 = r9.o()
            java.lang.String r3 = r10.o()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x012a
            java.lang.String r2 = r8.b()
            java.lang.String r10 = a((com.google.android.gms.internal.ads.C2375pia) r10)
            r0.putString(r2, r10)
        L_0x012a:
            java.lang.String r10 = r8.c()
            java.lang.String r9 = a((com.google.android.gms.internal.ads.C2375pia) r9)
            r0.putString(r10, r9)
            boolean r9 = r0.commit()
            if (r9 == 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r1 = 0
        L_0x013d:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            int r10 = com.google.android.gms.internal.ads.C2354pW.f11723a
            com.google.android.gms.internal.ads.pia r10 = r8.b(r10)
            if (r10 == 0) goto L_0x0151
            java.lang.String r10 = r10.o()
            r9.add(r10)
        L_0x0151:
            int r10 = com.google.android.gms.internal.ads.C2354pW.f11724b
            com.google.android.gms.internal.ads.pia r10 = r8.b(r10)
            if (r10 == 0) goto L_0x0160
            java.lang.String r10 = r10.o()
            r9.add(r10)
        L_0x0160:
            java.io.File r10 = r8.a()
            java.io.File[] r10 = r10.listFiles()
            int r0 = r10.length
        L_0x0169:
            if (r6 >= r0) goto L_0x0185
            r2 = r10[r6]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0182
            java.io.File r3 = r8.a()
            java.io.File r2 = com.google.android.gms.internal.ads.C1999kW.a((java.lang.String) r2, (java.io.File) r3)
            com.google.android.gms.internal.ads.C1999kW.a(r2)
        L_0x0182:
            int r6 = r6 + 1
            goto L_0x0169
        L_0x0185:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1716gW.a(com.google.android.gms.internal.ads.lia, com.google.android.gms.internal.ads.nW):boolean");
    }
}
