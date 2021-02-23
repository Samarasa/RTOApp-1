package c.a.a.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f2874a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2875b;

    /* renamed from: c  reason: collision with root package name */
    private final File f2876c;

    /* renamed from: d  reason: collision with root package name */
    private final File f2877d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2878e;

    /* renamed from: f  reason: collision with root package name */
    private long f2879f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f2880g;

    /* renamed from: h  reason: collision with root package name */
    private long f2881h = 0;
    /* access modifiers changed from: private */
    public Writer i;
    private final LinkedHashMap<String, c> j = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */
    public int k;
    private long l = 0;
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a((a) null));
    private final Callable<Void> n = new a(this);

    private static final class a implements ThreadFactory {
        private a() {
        }

        /* synthetic */ a(a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: c.a.a.a.b$b  reason: collision with other inner class name */
    public final class C0044b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f2882a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f2883b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2884c;

        private C0044b(c cVar) {
            this.f2882a = cVar;
            this.f2883b = cVar.f2890e ? null : new boolean[b.this.f2880g];
        }

        /* synthetic */ C0044b(b bVar, c cVar, a aVar) {
            this(cVar);
        }

        public File a(int i) {
            File b2;
            synchronized (b.this) {
                if (this.f2882a.f2891f == this) {
                    if (!this.f2882a.f2890e) {
                        this.f2883b[i] = true;
                    }
                    b2 = this.f2882a.b(i);
                    if (!b.this.f2874a.exists()) {
                        b.this.f2874a.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b2;
        }

        public void a() {
            b.this.a(this, false);
        }

        public void b() {
            if (!this.f2884c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void c() {
            b.this.a(this, true);
            this.f2884c = true;
        }
    }

    private final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f2886a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long[] f2887b;

        /* renamed from: c  reason: collision with root package name */
        File[] f2888c;

        /* renamed from: d  reason: collision with root package name */
        File[] f2889d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f2890e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C0044b f2891f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public long f2892g;

        private c(String str) {
            this.f2886a = str;
            this.f2887b = new long[b.this.f2880g];
            this.f2888c = new File[b.this.f2880g];
            this.f2889d = new File[b.this.f2880g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < b.this.f2880g; i++) {
                sb.append(i);
                this.f2888c[i] = new File(b.this.f2874a, sb.toString());
                sb.append(".tmp");
                this.f2889d[i] = new File(b.this.f2874a, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ c(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        public void b(String[] strArr) {
            if (strArr.length == b.this.f2880g) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f2887b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        a(strArr);
                        throw null;
                    }
                }
                return;
            }
            a(strArr);
            throw null;
        }

        public File a(int i) {
            return this.f2888c[i];
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f2887b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        public File b(int i) {
            return this.f2889d[i];
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f2894a;

        /* renamed from: b  reason: collision with root package name */
        private final long f2895b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f2896c;

        /* renamed from: d  reason: collision with root package name */
        private final File[] f2897d;

        private d(String str, long j, File[] fileArr, long[] jArr) {
            this.f2894a = str;
            this.f2895b = j;
            this.f2897d = fileArr;
            this.f2896c = jArr;
        }

        /* synthetic */ d(b bVar, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.f2897d[i];
        }
    }

    private b(File file, int i2, int i3, long j2) {
        File file2 = file;
        this.f2874a = file2;
        this.f2878e = i2;
        this.f2875b = new File(file2, "journal");
        this.f2876c = new File(file2, "journal.tmp");
        this.f2877d = new File(file2, "journal.bkp");
        this.f2880g = i3;
        this.f2879f = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized c.a.a.a.b.C0044b a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.r()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c.a.a.a.b$c> r0 = r5.j     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            c.a.a.a.b$c r0 = (c.a.a.a.b.c) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f2892g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            c.a.a.a.b$c r0 = new c.a.a.a.b$c     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c.a.a.a.b$c> r7 = r5.j     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            c.a.a.a.b$b r7 = r0.f2891f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            c.a.a.a.b$b r7 = new c.a.a.a.b$b     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            c.a.a.a.b.C0044b unused = r0.f2891f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.i     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.i     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.i     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.i     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.i     // Catch:{ all -> 0x005d }
            r6.flush()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.b.a(java.lang.String, long):c.a.a.a.b$b");
    }

    public static b a(File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            b bVar = new b(file, i2, i3, j2);
            if (bVar.f2875b.exists()) {
                try {
                    bVar.u();
                    bVar.t();
                    return bVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    bVar.a();
                }
            }
            file.mkdirs();
            b bVar2 = new b(file, i2, i3, j2);
            bVar2.v();
            return bVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(c.a.a.a.b.C0044b r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            c.a.a.a.b$c r0 = r10.f2882a     // Catch:{ all -> 0x010e }
            c.a.a.a.b$b r1 = r0.f2891f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f2890e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f2880g     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f2883b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.b((int) r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f2880g     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.b((int) r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f2887b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f2887b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f2881h     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f2881h = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            a((java.io.File) r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.k     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.k = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            c.a.a.a.b.C0044b unused = r0.f2891f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f2890e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f2890e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f2886a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.l     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.l = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f2892g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, c.a.a.a.b$c> r10 = r9.j     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f2886a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f2886a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.i     // Catch:{ all -> 0x010e }
            r10.flush()     // Catch:{ all -> 0x010e }
            long r10 = r9.f2881h     // Catch:{ all -> 0x010e }
            long r0 = r9.f2879f     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.s()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.m     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.n     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0112
        L_0x0111:
            throw r10
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.b.a(c.a.a.a.b$b, boolean):void");
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void h(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            c cVar = this.j.get(str2);
            if (cVar == null) {
                cVar = new c(this, str2, (a) null);
                this.j.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = cVar.f2890e = true;
                C0044b unused2 = cVar.f2891f = null;
                cVar.b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C0044b unused3 = cVar.f2891f = new C0044b(this, cVar, (a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private void r() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    public boolean s() {
        int i2 = this.k;
        return i2 >= 2000 && i2 >= this.j.size();
    }

    private void t() {
        a(this.f2876c);
        Iterator<c> it = this.j.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i2 = 0;
            if (next.f2891f == null) {
                while (i2 < this.f2880g) {
                    this.f2881h += next.f2887b[i2];
                    i2++;
                }
            } else {
                C0044b unused = next.f2891f = null;
                while (i2 < this.f2880g) {
                    a(next.a(i2));
                    a(next.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.k = r0 - r9.j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.a() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f2875b, true), c.a.a.a.e.f2905a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            c.a.a.a.d r1 = new c.a.a.a.d
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f2875b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = c.a.a.a.e.f2905a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.r()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.r()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.r()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.r()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.r()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f2878e     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f2880g     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.r()     // Catch:{ EOFException -> 0x005f }
            r9.h(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, c.a.a.a.b$c> r2 = r9.j     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.k = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.a()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.v()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f2875b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = c.a.a.a.e.f2905a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.i = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            c.a.a.a.e.a((java.io.Closeable) r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            c.a.a.a.e.a((java.io.Closeable) r1)
            goto L_0x00c0
        L_0x00bf:
            throw r0
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.b.u():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void v() {
        String str;
        if (this.i != null) {
            this.i.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2876c), e.f2905a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2878e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2880g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (c next : this.j.values()) {
                if (next.f2891f != null) {
                    str = "DIRTY " + next.f2886a + 10;
                } else {
                    str = "CLEAN " + next.f2886a + next.a() + 10;
                }
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
            if (this.f2875b.exists()) {
                a(this.f2875b, this.f2877d, true);
            }
            a(this.f2876c, this.f2875b, false);
            this.f2877d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2875b, true), e.f2905a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void w() {
        while (this.f2881h > this.f2879f) {
            g((String) this.j.entrySet().iterator().next().getKey());
        }
    }

    public void a() {
        close();
        e.a(this.f2874a);
    }

    public synchronized void close() {
        if (this.i != null) {
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f2891f != null) {
                    cVar.f2891f.a();
                }
            }
            w();
            this.i.close();
            this.i = null;
        }
    }

    public C0044b e(String str) {
        return a(str, -1);
    }

    public synchronized d f(String str) {
        r();
        c cVar = this.j.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f2890e) {
            return null;
        }
        for (File exists : cVar.f2888c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append("READ");
        this.i.append(' ');
        this.i.append(str);
        this.i.append(10);
        if (s()) {
            this.m.submit(this.n);
        }
        return new d(this, str, cVar.f2892g, cVar.f2888c, cVar.f2887b, (a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean g(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.r()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c.a.a.a.b$c> r0 = r7.j     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            c.a.a.a.b$c r0 = (c.a.a.a.b.c) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            c.a.a.a.b$b r2 = r0.f2891f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f2880g     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f2881h     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f2887b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f2881h = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f2887b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.k     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.k = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.i     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.i     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.i     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.i     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c.a.a.a.b$c> r0 = r7.j     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.s()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.m     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.n     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0093
        L_0x0092:
            throw r8
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.b.g(java.lang.String):boolean");
    }
}
