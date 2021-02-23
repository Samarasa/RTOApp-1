package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import c.b.b.b.b.g;
import c.b.b.b.b.h;
import com.google.android.gms.ads.c.a;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.wha  reason: case insensitive filesystem */
public class C2869wha {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12650a = "wha";

    /* renamed from: b  reason: collision with root package name */
    protected Context f12651b;

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f12652c;

    /* renamed from: d  reason: collision with root package name */
    private DexClassLoader f12653d;

    /* renamed from: e  reason: collision with root package name */
    private Rca f12654e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f12655f;

    /* renamed from: g  reason: collision with root package name */
    private volatile a f12656g = null;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f12657h;
    private Future i;
    private boolean j;
    /* access modifiers changed from: private */
    public volatile C1766hB k;
    private Future l;
    private HV m;
    private boolean n;
    private boolean o;
    private Map<Pair<String, String>, C1666fia> p;
    private boolean q;
    private C2656tha r;

    private C2869wha(Context context) {
        boolean z = false;
        this.f12657h = false;
        this.i = null;
        this.k = null;
        this.l = null;
        this.n = false;
        this.o = false;
        this.q = false;
        Context applicationContext = context.getApplicationContext();
        this.j = applicationContext != null ? true : z;
        this.f12651b = this.j ? applicationContext : context;
        this.p = new HashMap();
        if (this.r == null) {
            this.r = new C2656tha(this.f12651b);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|66) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ qea -> 0x0131, oha -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[Catch:{ all -> 0x0100, FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4 A[Catch:{ all -> 0x0100, FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C2869wha a(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            com.google.android.gms.internal.ads.wha r1 = new com.google.android.gms.internal.ads.wha
            r1.<init>(r9)
            com.google.android.gms.internal.ads.uha r9 = new com.google.android.gms.internal.ads.uha     // Catch:{ oha -> 0x0138 }
            r9.<init>()     // Catch:{ oha -> 0x0138 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ oha -> 0x0138 }
            r1.f12652c = r9     // Catch:{ oha -> 0x0138 }
            r1.f12657h = r12     // Catch:{ oha -> 0x0138 }
            if (r12 == 0) goto L_0x0023
            java.util.concurrent.ExecutorService r9 = r1.f12652c     // Catch:{ oha -> 0x0138 }
            com.google.android.gms.internal.ads.yha r12 = new com.google.android.gms.internal.ads.yha     // Catch:{ oha -> 0x0138 }
            r12.<init>(r1)     // Catch:{ oha -> 0x0138 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ oha -> 0x0138 }
            r1.i = r9     // Catch:{ oha -> 0x0138 }
        L_0x0023:
            java.util.concurrent.ExecutorService r9 = r1.f12652c     // Catch:{ oha -> 0x0138 }
            com.google.android.gms.internal.ads.Aha r12 = new com.google.android.gms.internal.ads.Aha     // Catch:{ oha -> 0x0138 }
            r12.<init>(r1)     // Catch:{ oha -> 0x0138 }
            r9.execute(r12)     // Catch:{ oha -> 0x0138 }
            r9 = 1
            r12 = 0
            c.b.b.b.b.f r2 = c.b.b.b.b.f.a()     // Catch:{ Throwable -> 0x004d }
            android.content.Context r3 = r1.f12651b     // Catch:{ Throwable -> 0x004d }
            int r3 = r2.a((android.content.Context) r3)     // Catch:{ Throwable -> 0x004d }
            if (r3 <= 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            r1.n = r3     // Catch:{ Throwable -> 0x004d }
            android.content.Context r3 = r1.f12651b     // Catch:{ Throwable -> 0x004d }
            int r2 = r2.b((android.content.Context) r3)     // Catch:{ Throwable -> 0x004d }
            if (r2 != 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r1.o = r2     // Catch:{ Throwable -> 0x004d }
        L_0x004d:
            r1.a((int) r12, (boolean) r9)     // Catch:{ oha -> 0x0138 }
            boolean r2 = com.google.android.gms.internal.ads.Bha.a()     // Catch:{ oha -> 0x0138 }
            if (r2 == 0) goto L_0x0071
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.F.Pb     // Catch:{ oha -> 0x0138 }
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ oha -> 0x0138 }
            java.lang.Object r2 = r3.a(r2)     // Catch:{ oha -> 0x0138 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ oha -> 0x0138 }
            boolean r2 = r2.booleanValue()     // Catch:{ oha -> 0x0138 }
            if (r2 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ oha -> 0x0138 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ oha -> 0x0138 }
            throw r9     // Catch:{ oha -> 0x0138 }
        L_0x0071:
            com.google.android.gms.internal.ads.Rca r2 = new com.google.android.gms.internal.ads.Rca     // Catch:{ oha -> 0x0138 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ oha -> 0x0138 }
            r1.f12654e = r2     // Catch:{ oha -> 0x0138 }
            com.google.android.gms.internal.ads.Rca r2 = r1.f12654e     // Catch:{ qea -> 0x0131 }
            byte[] r10 = r2.a(r10)     // Catch:{ qea -> 0x0131 }
            r1.f12655f = r10     // Catch:{ qea -> 0x0131 }
            android.content.Context r10 = r1.f12651b     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            if (r10 != 0) goto L_0x009a
            android.content.Context r10 = r1.f12651b     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.lang.String r2 = "dex"
            java.io.File r10 = r10.getDir(r2, r12)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            if (r10 == 0) goto L_0x0094
            goto L_0x009a
        L_0x0094:
            com.google.android.gms.internal.ads.oha r9 = new com.google.android.gms.internal.ads.oha     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            throw r9     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
        L_0x009a:
            java.lang.String r2 = "1596060835607"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.lang.String r5 = "%s/%s.jar"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r7[r12] = r10     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r7[r9] = r2     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            if (r5 != 0) goto L_0x00cb
            com.google.android.gms.internal.ads.Rca r5 = r1.f12654e     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            byte[] r7 = r1.f12655f     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            byte[] r11 = r5.a((byte[]) r7, (java.lang.String) r11)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            int r7 = r11.length     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r5.write(r11, r12, r7)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
        L_0x00cb:
            r1.b((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            dalvik.system.DexClassLoader r11 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x0100 }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x0100 }
            java.lang.String r7 = r10.getAbsolutePath()     // Catch:{ all -> 0x0100 }
            android.content.Context r8 = r1.f12651b     // Catch:{ all -> 0x0100 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x0100 }
            r11.<init>(r5, r7, r3, r8)     // Catch:{ all -> 0x0100 }
            r1.f12653d = r11     // Catch:{ all -> 0x0100 }
            a((java.io.File) r4)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r1.a((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r11[r12] = r10     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r11[r9] = r2     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.lang.String r10 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            a((java.lang.String) r10)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            com.google.android.gms.internal.ads.HV r10 = new com.google.android.gms.internal.ads.HV     // Catch:{ oha -> 0x0138 }
            r10.<init>(r1)     // Catch:{ oha -> 0x0138 }
            r1.m = r10     // Catch:{ oha -> 0x0138 }
            r1.q = r9     // Catch:{ oha -> 0x0138 }
            goto L_0x0138
        L_0x0100:
            r11 = move-exception
            a((java.io.File) r4)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r1.a((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r3[r12] = r10     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            r3[r9] = r2     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            a((java.lang.String) r9)     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
            throw r11     // Catch:{ FileNotFoundException -> 0x012a, IOException -> 0x0123, qea -> 0x011c, NullPointerException -> 0x0115 }
        L_0x0115:
            r9 = move-exception
            com.google.android.gms.internal.ads.oha r10 = new com.google.android.gms.internal.ads.oha     // Catch:{ oha -> 0x0138 }
            r10.<init>(r9)     // Catch:{ oha -> 0x0138 }
            throw r10     // Catch:{ oha -> 0x0138 }
        L_0x011c:
            r9 = move-exception
            com.google.android.gms.internal.ads.oha r10 = new com.google.android.gms.internal.ads.oha     // Catch:{ oha -> 0x0138 }
            r10.<init>(r9)     // Catch:{ oha -> 0x0138 }
            throw r10     // Catch:{ oha -> 0x0138 }
        L_0x0123:
            r9 = move-exception
            com.google.android.gms.internal.ads.oha r10 = new com.google.android.gms.internal.ads.oha     // Catch:{ oha -> 0x0138 }
            r10.<init>(r9)     // Catch:{ oha -> 0x0138 }
            throw r10     // Catch:{ oha -> 0x0138 }
        L_0x012a:
            r9 = move-exception
            com.google.android.gms.internal.ads.oha r10 = new com.google.android.gms.internal.ads.oha     // Catch:{ oha -> 0x0138 }
            r10.<init>(r9)     // Catch:{ oha -> 0x0138 }
            throw r10     // Catch:{ oha -> 0x0138 }
        L_0x0131:
            r9 = move-exception
            com.google.android.gms.internal.ads.oha r10 = new com.google.android.gms.internal.ads.oha     // Catch:{ oha -> 0x0138 }
            r10.<init>(r9)     // Catch:{ oha -> 0x0138 }
            throw r10     // Catch:{ oha -> 0x0138 }
        L_0x0138:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2869wha.a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.wha");
    }

    private static void a(File file) {
        if (!file.exists()) {
            Log.d(f12650a, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[SYNTHETIC, Splitter:B:39:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4 A[SYNTHETIC, Splitter:B:43:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00de A[SYNTHETIC, Splitter:B:52:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3 A[SYNTHETIC, Splitter:B:56:0x00e3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r3 = new java.io.File
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            r3.<init>(r10)
            boolean r10 = r3.exists()
            if (r10 != 0) goto L_0x0035
            return
        L_0x0035:
            long r5 = r3.length()
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0040
            return
        L_0x0040:
            int r10 = (int) r5
            byte[] r10 = new byte[r10]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            r5.<init>(r3)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            int r6 = r5.read(r10)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            if (r6 > 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            a((java.io.File) r3)
            return
        L_0x0056:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r6.print(r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r6.print(r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r6.print(r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            com.google.android.gms.internal.ads.jB$a r0 = com.google.android.gms.internal.ads.C1907jB.s()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            byte[] r6 = r6.getBytes()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            com.google.android.gms.internal.ads.Lda r6 = com.google.android.gms.internal.ads.Lda.a((byte[]) r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r0.d(r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            byte[] r11 = r11.getBytes()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            com.google.android.gms.internal.ads.Lda r11 = com.google.android.gms.internal.ads.Lda.a((byte[]) r11)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r0.c(r11)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            com.google.android.gms.internal.ads.Rca r11 = r9.f12654e     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            byte[] r6 = r9.f12655f     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            java.lang.String r10 = r11.a((byte[]) r6, (byte[]) r10)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            byte[] r10 = r10.getBytes()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            com.google.android.gms.internal.ads.Lda r11 = com.google.android.gms.internal.ads.Lda.a((byte[]) r10)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r0.a(r11)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            byte[] r10 = com.google.android.gms.internal.ads.C2767vK.a((byte[]) r10)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            com.google.android.gms.internal.ads.Lda r10 = com.google.android.gms.internal.ads.Lda.a((byte[]) r10)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r0.b(r10)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r1.createNewFile()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            r10.<init>(r1)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00dc, all -> 0x00c9 }
            com.google.android.gms.internal.ads.ifa r11 = r0.k()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.internal.ads.xea r11 = (com.google.android.gms.internal.ads.C2934xea) r11     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.internal.ads.jB r11 = (com.google.android.gms.internal.ads.C1907jB) r11     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            byte[] r11 = r11.f()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            int r0 = r11.length     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            r10.write(r11, r4, r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            r10.close()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00c7, all -> 0x00c4 }
            r5.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r10.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            a((java.io.File) r3)
            return
        L_0x00c4:
            r11 = move-exception
            r2 = r10
            goto L_0x00cd
        L_0x00c7:
            r2 = r10
            goto L_0x00dc
        L_0x00c9:
            r11 = move-exception
            goto L_0x00cd
        L_0x00cb:
            r11 = move-exception
            r5 = r2
        L_0x00cd:
            if (r5 == 0) goto L_0x00d2
            r5.close()     // Catch:{ IOException -> 0x00d2 }
        L_0x00d2:
            if (r2 == 0) goto L_0x00d7
            r2.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            a((java.io.File) r3)
            throw r11
        L_0x00db:
            r5 = r2
        L_0x00dc:
            if (r5 == 0) goto L_0x00e1
            r5.close()     // Catch:{ IOException -> 0x00e1 }
        L_0x00e1:
            if (r2 == 0) goto L_0x00e6
            r2.close()     // Catch:{ IOException -> 0x00e6 }
        L_0x00e6:
            a((java.io.File) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2869wha.a(java.io.File, java.lang.String):void");
    }

    private static void a(String str) {
        a(new File(str));
    }

    /* access modifiers changed from: private */
    public static boolean b(int i2, C1766hB hBVar) {
        if (i2 < 4) {
            return hBVar == null || !hBVar.p() || hBVar.o().equals("0000000000000000000000000000000000000000000000000000000000000000") || !hBVar.t() || !hBVar.u().o() || hBVar.u().p() == -2;
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2 A[SYNTHETIC, Splitter:B:52:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7 A[SYNTHETIC, Splitter:B:56:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee A[SYNTHETIC, Splitter:B:64:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f3 A[SYNTHETIC, Splitter:B:68:0x00f3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0042
            a((java.io.File) r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            return r3
        L_0x0042:
            int r1 = (int) r5     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            byte[] r1 = new byte[r1]     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            r5.<init>(r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            int r6 = r5.read(r1)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = f12650a     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            a((java.io.File) r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            com.google.android.gms.internal.ads.kea r6 = com.google.android.gms.internal.ads.C2012kea.b()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.jB r1 = com.google.android.gms.internal.ads.C1907jB.a((byte[]) r1, (com.google.android.gms.internal.ads.C2012kea) r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r6 = new java.lang.String     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.Lda r7 = r1.q()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r7 = r7.c()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r6.<init>(r7)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            boolean r11 = r11.equals(r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r11 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.Lda r11 = r1.p()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r11 = r11.c()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.Lda r6 = r1.o()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r6 = r6.c()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r6 = com.google.android.gms.internal.ads.C2767vK.a((byte[]) r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r11 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.Lda r11 = r1.r()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r11 = r11.c()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r6 = r6.getBytes()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r11 != 0) goto L_0x00a8
            goto L_0x00d5
        L_0x00a8:
            com.google.android.gms.internal.ads.Rca r11 = r9.f12654e     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r0 = r9.f12655f     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r6 = new java.lang.String     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.Lda r1 = r1.o()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r1 = r1.c()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r6.<init>(r1)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r11 = r11.a((byte[]) r0, (java.lang.String) r6)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r2.createNewFile()     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r0.<init>(r2)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            int r10 = r11.length     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00d3, all -> 0x00d0 }
            r0.write(r11, r3, r10)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00d3, all -> 0x00d0 }
            r5.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            r0.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            return r4
        L_0x00d0:
            r11 = move-exception
            r10 = r0
            goto L_0x00e0
        L_0x00d3:
            r10 = r0
            goto L_0x00ec
        L_0x00d5:
            a((java.io.File) r0)     // Catch:{ qea | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r5.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            return r3
        L_0x00dc:
            r11 = move-exception
            goto L_0x00e0
        L_0x00de:
            r11 = move-exception
            r5 = r10
        L_0x00e0:
            if (r5 == 0) goto L_0x00e5
            r5.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e5:
            if (r10 == 0) goto L_0x00ea
            r10.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            throw r11
        L_0x00eb:
            r5 = r10
        L_0x00ec:
            if (r5 == 0) goto L_0x00f1
            r5.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            if (r10 == 0) goto L_0x00f6
            r10.close()     // Catch:{ IOException -> 0x00f6 }
        L_0x00f6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2869wha.b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void p() {
        try {
            if (this.f12656g == null && this.j) {
                a aVar = new a(this.f12651b);
                aVar.c();
                this.f12656g = aVar;
            }
        } catch (g | h | IOException unused) {
            this.f12656g = null;
        }
    }

    private final C1766hB q() {
        try {
            return C2849wV.a(this.f12651b, this.f12651b.getPackageName(), Integer.toString(this.f12651b.getPackageManager().getPackageInfo(this.f12651b.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Context a() {
        return this.f12651b;
    }

    public final Method a(String str, String str2) {
        C1666fia fia = this.p.get(new Pair(str, str2));
        if (fia == null) {
            return null;
        }
        return fia.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.o) {
            Future<?> submit = this.f12652c.submit(new C2940xha(this, i2, z));
            if (i2 == 0) {
                this.l = submit;
            }
        }
    }

    public final boolean a(String str, String str2, Class<?>... clsArr) {
        if (this.p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.p.put(new Pair(str, str2), new C1666fia(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final C1766hB b(int i2, boolean z) {
        if (i2 > 0 && z) {
            try {
                Thread.sleep((long) (i2 * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return q();
    }

    public final boolean b() {
        return this.q;
    }

    public final int c() {
        if (this.m != null) {
            return HV.a();
        }
        return Integer.MIN_VALUE;
    }

    public final boolean d() {
        return this.r.a();
    }

    public final ExecutorService e() {
        return this.f12652c;
    }

    public final DexClassLoader f() {
        return this.f12653d;
    }

    public final Rca g() {
        return this.f12654e;
    }

    public final byte[] h() {
        return this.f12655f;
    }

    public final boolean i() {
        return this.n;
    }

    public final HV j() {
        return this.m;
    }

    public final boolean k() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final C2656tha l() {
        return this.r;
    }

    public final C1766hB m() {
        return this.k;
    }

    public final Future n() {
        return this.l;
    }

    public final a o() {
        if (!this.f12657h) {
            return null;
        }
        if (this.f12656g != null) {
            return this.f12656g;
        }
        Future future = this.i;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.i = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.i.cancel(true);
            }
        }
        return this.f12656g;
    }
}
