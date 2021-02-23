package c.a.a.c.a;

import c.a.a.c.b.a.b;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f2965a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f2966b;

    /* renamed from: c  reason: collision with root package name */
    private b f2967c;

    /* renamed from: d  reason: collision with root package name */
    private int f2968d;

    public c(OutputStream outputStream, b bVar) {
        this(outputStream, bVar, 65536);
    }

    c(OutputStream outputStream, b bVar, int i) {
        this.f2965a = outputStream;
        this.f2967c = bVar;
        this.f2966b = (byte[]) bVar.b(i, byte[].class);
    }

    private void a() {
        int i = this.f2968d;
        if (i > 0) {
            this.f2965a.write(this.f2966b, 0, i);
            this.f2968d = 0;
        }
    }

    private void r() {
        if (this.f2968d == this.f2966b.length) {
            a();
        }
    }

    private void s() {
        byte[] bArr = this.f2966b;
        if (bArr != null) {
            this.f2967c.put(bArr);
            this.f2966b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f2965a.close();
            s();
        } catch (Throwable th) {
            this.f2965a.close();
            throw th;
        }
    }

    public void flush() {
        a();
        this.f2965a.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f2966b;
        int i2 = this.f2968d;
        this.f2968d = i2 + 1;
        bArr[i2] = (byte) i;
        r();
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f2968d != 0 || i4 < this.f2966b.length) {
                int min = Math.min(i4, this.f2966b.length - this.f2968d);
                System.arraycopy(bArr, i5, this.f2966b, this.f2968d, min);
                this.f2968d += min;
                i3 += min;
                r();
            } else {
                this.f2965a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
