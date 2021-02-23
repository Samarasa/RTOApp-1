package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.gj  reason: case insensitive filesystem */
public final class C1738gj implements Xja {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C1095Uj> f10565a;

    /* renamed from: b  reason: collision with root package name */
    private long f10566b;

    /* renamed from: c  reason: collision with root package name */
    private final C0992Qk f10567c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10568d;

    public C1738gj(C0992Qk qk) {
        this(qk, 5242880);
    }

    private C1738gj(C0992Qk qk, int i) {
        this.f10565a = new LinkedHashMap(16, 0.75f, true);
        this.f10566b = 0;
        this.f10567c = qk;
        this.f10568d = 5242880;
    }

    public C1738gj(File file, int i) {
        this.f10565a = new LinkedHashMap(16, 0.75f, true);
        this.f10566b = 0;
        this.f10567c = new C2378pk(this, file);
        this.f10568d = 20971520;
    }

    static int a(InputStream inputStream) {
        return (c(inputStream) << 24) | c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    private static InputStream a(File file) {
        return new FileInputStream(file);
    }

    static String a(C2521rl rlVar) {
        return new String(a(rlVar, b((InputStream) rlVar)), "UTF-8");
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final synchronized void a(String str) {
        boolean delete = e(str).delete();
        b(str);
        if (!delete) {
            C0936Og.a("Could not delete cache entry for key=%s, filename=%s", str, c(str));
        }
    }

    private final void a(String str, C1095Uj uj) {
        if (!this.f10565a.containsKey(str)) {
            this.f10566b += uj.f8919a;
        } else {
            this.f10566b += uj.f8919a - this.f10565a.get(str).f8919a;
        }
        this.f10565a.put(str, uj);
    }

    private static byte[] a(C2521rl rlVar, long j) {
        long a2 = rlVar.a();
        if (j >= 0 && j <= a2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(rlVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }

    static long b(InputStream inputStream) {
        return (((long) c(inputStream)) & 255) | 0 | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((255 & ((long) c(inputStream))) << 56);
    }

    static List<Zoa> b(C2521rl rlVar) {
        int a2 = a((InputStream) rlVar);
        if (a2 >= 0) {
            List<Zoa> emptyList = a2 == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < a2; i++) {
                emptyList.add(new Zoa(a(rlVar).intern(), a(rlVar).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(a2);
        throw new IOException(sb.toString());
    }

    private final void b(String str) {
        C1095Uj remove = this.f10565a.remove(str);
        if (remove != null) {
            this.f10566b -= remove.f8919a;
        }
    }

    private static int c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static String c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File e(String str) {
        return new File(this.f10567c.k(), c(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0115, code lost:
        if (r3.delete() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        com.google.android.gms.internal.ads.C0936Og.a("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012e, code lost:
        if (r1.f10567c.k().exists() == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0130, code lost:
        com.google.android.gms.internal.ads.C0936Og.a("Re-initializing cache after external clearing.", new java.lang.Object[0]);
        r1.f10565a.clear();
        r1.f10566b = 0;
        p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0144, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r16, com.google.android.gms.internal.ads.C3019yla r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f10566b     // Catch:{ all -> 0x0145 }
            byte[] r5 = r2.f12970a     // Catch:{ all -> 0x0145 }
            int r5 = r5.length     // Catch:{ all -> 0x0145 }
            long r5 = (long) r5     // Catch:{ all -> 0x0145 }
            long r3 = r3 + r5
            int r5 = r1.f10568d     // Catch:{ all -> 0x0145 }
            long r5 = (long) r5     // Catch:{ all -> 0x0145 }
            r7 = 1063675494(0x3f666666, float:0.9)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0026
            byte[] r3 = r2.f12970a     // Catch:{ all -> 0x0145 }
            int r3 = r3.length     // Catch:{ all -> 0x0145 }
            float r3 = (float) r3     // Catch:{ all -> 0x0145 }
            int r4 = r1.f10568d     // Catch:{ all -> 0x0145 }
            float r4 = (float) r4
            float r4 = r4 * r7
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            monitor-exit(r15)
            return
        L_0x0026:
            java.io.File r3 = r15.e(r16)     // Catch:{ all -> 0x0145 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0111 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0111 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0111 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.Uj r8 = new com.google.android.gms.internal.ads.Uj     // Catch:{ IOException -> 0x0111 }
            r8.<init>(r0, r2)     // Catch:{ IOException -> 0x0111 }
            boolean r9 = r8.a((java.io.OutputStream) r6)     // Catch:{ IOException -> 0x0111 }
            if (r9 == 0) goto L_0x00fb
            byte[] r2 = r2.f12970a     // Catch:{ IOException -> 0x0111 }
            r6.write(r2)     // Catch:{ IOException -> 0x0111 }
            r6.close()     // Catch:{ IOException -> 0x0111 }
            long r9 = r3.length()     // Catch:{ IOException -> 0x0111 }
            r8.f8919a = r9     // Catch:{ IOException -> 0x0111 }
            r15.a((java.lang.String) r0, (com.google.android.gms.internal.ads.C1095Uj) r8)     // Catch:{ IOException -> 0x0111 }
            long r8 = r1.f10566b     // Catch:{ IOException -> 0x0111 }
            int r0 = r1.f10568d     // Catch:{ IOException -> 0x0111 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x0111 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f9
            boolean r0 = com.google.android.gms.internal.ads.C0936Og.f8124b     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.C0936Og.c(r0, r2)     // Catch:{ IOException -> 0x0111 }
        L_0x0066:
            long r8 = r1.f10566b     // Catch:{ IOException -> 0x0111 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0111 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.Uj> r0 = r1.f10565a     // Catch:{ IOException -> 0x0111 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0111 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0111 }
            r2 = 0
        L_0x0077:
            boolean r6 = r0.hasNext()     // Catch:{ IOException -> 0x0111 }
            r12 = 2
            if (r6 == 0) goto L_0x00d0
            java.lang.Object r6 = r0.next()     // Catch:{ IOException -> 0x0111 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0111 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.Uj r6 = (com.google.android.gms.internal.ads.C1095Uj) r6     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = r6.f8920b     // Catch:{ IOException -> 0x0111 }
            java.io.File r13 = r15.e(r13)     // Catch:{ IOException -> 0x0111 }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x0111 }
            if (r13 == 0) goto L_0x00a0
            long r13 = r1.f10566b     // Catch:{ IOException -> 0x0111 }
            r16 = r8
            long r7 = r6.f8919a     // Catch:{ IOException -> 0x0111 }
            long r13 = r13 - r7
            r1.f10566b = r13     // Catch:{ IOException -> 0x0111 }
            goto L_0x00b5
        L_0x00a0:
            r16 = r8
            java.lang.String r7 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r9 = r6.f8920b     // Catch:{ IOException -> 0x0111 }
            r8[r5] = r9     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r6.f8920b     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = c((java.lang.String) r6)     // Catch:{ IOException -> 0x0111 }
            r8[r4] = r6     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.C0936Og.a(r7, r8)     // Catch:{ IOException -> 0x0111 }
        L_0x00b5:
            r0.remove()     // Catch:{ IOException -> 0x0111 }
            int r2 = r2 + 1
            long r6 = r1.f10566b     // Catch:{ IOException -> 0x0111 }
            float r6 = (float) r6     // Catch:{ IOException -> 0x0111 }
            int r7 = r1.f10568d     // Catch:{ IOException -> 0x0111 }
            float r7 = (float) r7     // Catch:{ IOException -> 0x0111 }
            r8 = 1063675494(0x3f666666, float:0.9)
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ca
            goto L_0x00d2
        L_0x00ca:
            r8 = r16
            r7 = 1063675494(0x3f666666, float:0.9)
            goto L_0x0077
        L_0x00d0:
            r16 = r8
        L_0x00d2:
            boolean r0 = com.google.android.gms.internal.ads.C0936Og.f8124b     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0111 }
            r6[r5] = r2     // Catch:{ IOException -> 0x0111 }
            long r7 = r1.f10566b     // Catch:{ IOException -> 0x0111 }
            long r7 = r7 - r16
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0111 }
            r6[r4] = r2     // Catch:{ IOException -> 0x0111 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0111 }
            long r7 = r7 - r10
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0111 }
            r6[r12] = r2     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.C0936Og.c(r0, r6)     // Catch:{ IOException -> 0x0111 }
        L_0x00f9:
            monitor-exit(r15)
            return
        L_0x00fb:
            r6.close()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0111 }
            r2[r5] = r6     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.C0936Og.a(r0, r2)     // Catch:{ IOException -> 0x0111 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0111 }
            r0.<init>()     // Catch:{ IOException -> 0x0111 }
            throw r0     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0145 }
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "Could not clean up file %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0145 }
            r2[r5] = r3     // Catch:{ all -> 0x0145 }
            com.google.android.gms.internal.ads.C0936Og.a(r0, r2)     // Catch:{ all -> 0x0145 }
        L_0x0124:
            com.google.android.gms.internal.ads.Qk r0 = r1.f10567c     // Catch:{ all -> 0x0145 }
            java.io.File r0 = r0.k()     // Catch:{ all -> 0x0145 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0145 }
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0145 }
            com.google.android.gms.internal.ads.C0936Og.a(r0, r2)     // Catch:{ all -> 0x0145 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.Uj> r0 = r1.f10565a     // Catch:{ all -> 0x0145 }
            r0.clear()     // Catch:{ all -> 0x0145 }
            r2 = 0
            r1.f10566b = r2     // Catch:{ all -> 0x0145 }
            r15.p()     // Catch:{ all -> 0x0145 }
        L_0x0143:
            monitor-exit(r15)
            return
        L_0x0145:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x0149
        L_0x0148:
            throw r0
        L_0x0149:
            goto L_0x0148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1738gj.a(java.lang.String, com.google.android.gms.internal.ads.yla):void");
    }

    public final synchronized void a(String str, boolean z) {
        C3019yla d2 = d(str);
        if (d2 != null) {
            d2.f12975f = 0;
            d2.f12974e = 0;
            a(str, d2);
        }
    }

    public final synchronized C3019yla d(String str) {
        C2521rl rlVar;
        C1095Uj uj = this.f10565a.get(str);
        if (uj == null) {
            return null;
        }
        File e2 = e(str);
        try {
            rlVar = new C2521rl(new BufferedInputStream(a(e2)), e2.length());
            C1095Uj a2 = C1095Uj.a(rlVar);
            if (!TextUtils.equals(str, a2.f8920b)) {
                C0936Og.a("%s: key=%s, found=%s", e2.getAbsolutePath(), str, a2.f8920b);
                b(str);
                rlVar.close();
                return null;
            }
            byte[] a3 = a(rlVar, rlVar.a());
            C3019yla yla = new C3019yla();
            yla.f12970a = a3;
            yla.f12971b = uj.f8921c;
            yla.f12972c = uj.f8922d;
            yla.f12973d = uj.f8923e;
            yla.f12974e = uj.f8924f;
            yla.f12975f = uj.f8925g;
            List<Zoa> list = uj.f8926h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Zoa next : list) {
                treeMap.put(next.a(), next.b());
            }
            yla.f12976g = treeMap;
            yla.f12977h = Collections.unmodifiableList(uj.f8926h);
            rlVar.close();
            return yla;
        } catch (IOException e3) {
            C0936Og.a("%s: %s", e2.getAbsolutePath(), e3.toString());
            a(str);
            return null;
        } catch (Throwable th) {
            rlVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void p() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.Qk r0 = r9.f10567c     // Catch:{ all -> 0x005f }
            java.io.File r0 = r0.k()     // Catch:{ all -> 0x005f }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "Unable to create cache dir %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x005f }
            r3[r2] = r0     // Catch:{ all -> 0x005f }
            com.google.android.gms.internal.ads.C0936Og.b(r1, r3)     // Catch:{ all -> 0x005f }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x002c
            monitor-exit(r9)
            return
        L_0x002c:
            int r1 = r0.length     // Catch:{ all -> 0x005f }
        L_0x002d:
            if (r2 >= r1) goto L_0x005d
            r3 = r0[r2]     // Catch:{ all -> 0x005f }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.ads.rl r6 = new com.google.android.gms.internal.ads.rl     // Catch:{ IOException -> 0x0057 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0057 }
            java.io.InputStream r8 = a((java.io.File) r3)     // Catch:{ IOException -> 0x0057 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0057 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.ads.Uj r7 = com.google.android.gms.internal.ads.C1095Uj.a((com.google.android.gms.internal.ads.C2521rl) r6)     // Catch:{ all -> 0x0052 }
            r7.f8919a = r4     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r7.f8920b     // Catch:{ all -> 0x0052 }
            r9.a((java.lang.String) r4, (com.google.android.gms.internal.ads.C1095Uj) r7)     // Catch:{ all -> 0x0052 }
            r6.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005a
        L_0x0052:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0057 }
            throw r4     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r3.delete()     // Catch:{ all -> 0x005f }
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x005d:
            monitor-exit(r9)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0063
        L_0x0062:
            throw r0
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1738gj.p():void");
    }
}
