package c.a.a.c.d.a;

import c.a.a.c.b.a.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class t extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private volatile byte[] f3409a;

    /* renamed from: b  reason: collision with root package name */
    private int f3410b;

    /* renamed from: c  reason: collision with root package name */
    private int f3411c;

    /* renamed from: d  reason: collision with root package name */
    private int f3412d;

    /* renamed from: e  reason: collision with root package name */
    private int f3413e;

    /* renamed from: f  reason: collision with root package name */
    private final b f3414f;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public t(InputStream inputStream, b bVar) {
        this(inputStream, bVar, 65536);
    }

    t(InputStream inputStream, b bVar, int i) {
        super(inputStream);
        this.f3412d = -1;
        this.f3414f = bVar;
        this.f3409a = (byte[]) bVar.b(i, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f3412d;
        if (i2 == -1 || this.f3413e - i2 >= (i = this.f3411c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f3412d = -1;
                this.f3413e = 0;
                this.f3410b = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f3410b == bArr.length) {
            int length = bArr.length * 2;
            if (length > i) {
                length = i;
            }
            byte[] bArr2 = (byte[]) this.f3414f.b(length, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f3409a = bArr2;
            this.f3414f.put(bArr);
            bArr = bArr2;
        } else {
            int i3 = this.f3412d;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
            }
        }
        this.f3413e -= this.f3412d;
        this.f3412d = 0;
        this.f3410b = 0;
        int i4 = this.f3413e;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        this.f3410b = read2 <= 0 ? this.f3413e : this.f3413e + read2;
        return read2;
    }

    private static IOException s() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void a() {
        this.f3411c = this.f3409a.length;
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f3409a == null || inputStream == null) {
            s();
            throw null;
        }
        return (this.f3410b - this.f3413e) + inputStream.available();
    }

    public void close() {
        if (this.f3409a != null) {
            this.f3414f.put(this.f3409a);
            this.f3409a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f3411c = Math.max(this.f3411c, i);
        this.f3412d = this.f3413e;
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized void r() {
        if (this.f3409a != null) {
            this.f3414f.put(this.f3409a);
            this.f3409a = null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f3409a     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f3413e     // Catch:{ all -> 0x003f }
            int r4 = r6.f3410b     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f3409a     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f3409a     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            s()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f3410b     // Catch:{ all -> 0x003f }
            int r2 = r6.f3413e     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.f3413e     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.f3413e = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            s()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.d.a.t.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f3409a     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.f3413e     // Catch:{ all -> 0x009c }
            int r4 = r6.f3410b     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f3410b     // Catch:{ all -> 0x009c }
            int r4 = r6.f3413e     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f3410b     // Catch:{ all -> 0x009c }
            int r4 = r6.f3413e     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.f3413e     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.f3413e     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.f3413e = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.f3412d     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.f3409a     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.f3409a     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            s()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f3410b     // Catch:{ all -> 0x009c }
            int r5 = r6.f3413e     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f3410b     // Catch:{ all -> 0x009c }
            int r5 = r6.f3413e     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.f3413e     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.f3413e     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.f3413e = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            s()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            s()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00a0
        L_0x009f:
            throw r7
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.d.a.t.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        if (this.f3409a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f3412d) {
            this.f3413e = this.f3412d;
        } else {
            throw new a("Mark has been invalidated, pos: " + this.f3413e + " markLimit: " + this.f3411c);
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f3409a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                s();
                throw null;
            } else if (((long) (this.f3410b - this.f3413e)) >= j) {
                this.f3413e = (int) (((long) this.f3413e) + j);
                return j;
            } else {
                long j2 = ((long) this.f3410b) - ((long) this.f3413e);
                this.f3413e = this.f3410b;
                if (this.f3412d == -1 || j > ((long) this.f3411c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f3410b - this.f3413e)) >= j - j2) {
                        this.f3413e = (int) ((((long) this.f3413e) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.f3410b)) - ((long) this.f3413e);
                    this.f3413e = this.f3410b;
                    return j3;
                }
            }
        } else {
            s();
            throw null;
        }
    }
}
