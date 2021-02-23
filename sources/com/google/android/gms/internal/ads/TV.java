package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class TV {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8783a;

    /* renamed from: b  reason: collision with root package name */
    private final C2353pV f8784b;

    public TV(Context context, C2353pV pVVar) {
        this.f8783a = context;
        this.f8784b = pVVar;
    }

    private final void a(byte[] bArr, String str) {
        if (this.f8784b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("os.arch:");
            sb.append(C2071lX.OS_ARCH.a());
            sb.append(";");
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
                if (strArr != null) {
                    sb.append("supported_abis:");
                    sb.append(Arrays.toString(strArr));
                    sb.append(";");
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            sb.append("CPU_ABI:");
            sb.append(Build.CPU_ABI);
            sb.append(";");
            sb.append("CPU_ABI2:");
            sb.append(Build.CPU_ABI2);
            sb.append(";");
            if (bArr != null) {
                sb.append("ELF:");
                sb.append(Arrays.toString(bArr));
                sb.append(";");
            }
            if (str != null) {
                sb.append("dbg:");
                sb.append(str);
                sb.append(";");
            }
            this.f8784b.a(4007, sb.toString());
        }
    }

    public static boolean a(C1949jia jia) {
        int i = WV.f9143a[jia.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r4 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4.a(2024, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r4 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b() {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "i686"
            java.lang.String r2 = "armv71"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.ads.lX r1 = com.google.android.gms.internal.ads.C2071lX.OS_ARCH
            java.lang.String r1 = r1.a()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0024
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0024
            return r1
        L_0x0024:
            r0 = 0
            r2 = 2024(0x7e8, float:2.836E-42)
            java.lang.Class<android.os.Build> r3 = android.os.Build.class
            java.lang.String r4 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            if (r3 == 0) goto L_0x004f
            int r4 = r3.length     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            if (r4 <= 0) goto L_0x004f
            r4 = 0
            r0 = r3[r4]     // Catch:{ NoSuchFieldException -> 0x0049, IllegalAccessException -> 0x0040 }
            return r0
        L_0x0040:
            r3 = move-exception
            com.google.android.gms.internal.ads.pV r4 = r5.f8784b
            if (r4 == 0) goto L_0x004f
        L_0x0045:
            r4.a((int) r2, (long) r0, (java.lang.Exception) r3)
            goto L_0x004f
        L_0x0049:
            r3 = move-exception
            com.google.android.gms.internal.ads.pV r4 = r5.f8784b
            if (r4 == 0) goto L_0x004f
            goto L_0x0045
        L_0x004f:
            java.lang.String r0 = android.os.Build.CPU_ABI
            if (r0 == 0) goto L_0x0054
            return r0
        L_0x0054:
            java.lang.String r0 = android.os.Build.CPU_ABI2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.TV.b():java.lang.String");
    }

    private final C1949jia c() {
        FileInputStream fileInputStream;
        File file = new File(new File(this.f8783a.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            C2353pV pVVar = this.f8784b;
            if (pVVar != null) {
                pVVar.a(5017, "No lib/");
            }
            return C1949jia.UNKNOWN;
        }
        File[] listFiles = file.listFiles(new UX(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            C2353pV pVVar2 = this.f8784b;
            if (pVVar2 != null) {
                pVVar2.a(5017, "No .so");
            }
            return C1949jia.UNKNOWN;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            byte[] bArr = new byte[20];
            if (fileInputStream.read(bArr) == 20) {
                byte[] bArr2 = {0, 0};
                if (bArr[5] == 2) {
                    a(bArr, (String) null);
                    C1949jia jia = C1949jia.UNSUPPORTED;
                    fileInputStream.close();
                    return jia;
                }
                bArr2[0] = bArr[19];
                bArr2[1] = bArr[18];
                short s = ByteBuffer.wrap(bArr2).getShort();
                if (s == 3) {
                    C1949jia jia2 = C1949jia.X86;
                    fileInputStream.close();
                    return jia2;
                } else if (s == 40) {
                    C1949jia jia3 = C1949jia.ARM7;
                    fileInputStream.close();
                    return jia3;
                } else if (s == 62) {
                    C1949jia jia4 = C1949jia.X86_64;
                    fileInputStream.close();
                    return jia4;
                } else if (s != 183) {
                    a(bArr, (String) null);
                    C1949jia jia5 = C1949jia.UNSUPPORTED;
                    fileInputStream.close();
                    return jia5;
                } else {
                    C1949jia jia6 = C1949jia.ARM64;
                    fileInputStream.close();
                    return jia6;
                }
            } else {
                fileInputStream.close();
                return C1949jia.UNSUPPORTED;
            }
        } catch (IOException e2) {
            a((byte[]) null, e2.toString());
        } catch (Throwable th) {
            C2790vda.a(th, th);
        }
        throw th;
    }

    public final C1949jia a() {
        C1949jia c2 = c();
        if (c2 == C1949jia.UNKNOWN) {
            String b2 = b();
            if (TextUtils.isEmpty(b2)) {
                b2 = "Empty dev arch";
            } else if (b2.equalsIgnoreCase("i686") || b2.equalsIgnoreCase("x86")) {
                c2 = C1949jia.X86;
            } else if (b2.equalsIgnoreCase("x86_64")) {
                c2 = C1949jia.X86_64;
            } else if (b2.equalsIgnoreCase("arm64-v8a")) {
                c2 = C1949jia.ARM64;
            } else if (b2.equalsIgnoreCase("armeabi-v7a") || b2.equalsIgnoreCase("armv71")) {
                c2 = C1949jia.ARM7;
            }
            a((byte[]) null, b2);
            c2 = C1949jia.UNSUPPORTED;
        }
        C2353pV pVVar = this.f8784b;
        if (pVVar != null) {
            pVVar.a(5018, c2.name());
        }
        return c2;
    }
}
