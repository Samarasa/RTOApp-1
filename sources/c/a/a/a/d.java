package c.a.a.a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f2900a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Charset f2901b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f2902c;

    /* renamed from: d  reason: collision with root package name */
    private int f2903d;

    /* renamed from: e  reason: collision with root package name */
    private int f2904e;

    public d(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(e.f2905a)) {
            this.f2900a = inputStream;
            this.f2901b = charset;
            this.f2902c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public d(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void s() {
        InputStream inputStream = this.f2900a;
        byte[] bArr = this.f2902c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f2903d = 0;
            this.f2904e = read;
            return;
        }
        throw new EOFException();
    }

    public boolean a() {
        return this.f2904e == -1;
    }

    public void close() {
        synchronized (this.f2900a) {
            if (this.f2902c != null) {
                this.f2902c = null;
                this.f2900a.close();
            }
        }
    }

    public String r() {
        int i;
        int i2;
        synchronized (this.f2900a) {
            if (this.f2902c != null) {
                if (this.f2903d >= this.f2904e) {
                    s();
                }
                for (int i3 = this.f2903d; i3 != this.f2904e; i3++) {
                    if (this.f2902c[i3] == 10) {
                        if (i3 != this.f2903d) {
                            i2 = i3 - 1;
                            if (this.f2902c[i2] == 13) {
                                String str = new String(this.f2902c, this.f2903d, i2 - this.f2903d, this.f2901b.name());
                                this.f2903d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f2902c, this.f2903d, i2 - this.f2903d, this.f2901b.name());
                        this.f2903d = i3 + 1;
                        return str2;
                    }
                }
                c cVar = new c(this, (this.f2904e - this.f2903d) + 80);
                loop1:
                while (true) {
                    cVar.write(this.f2902c, this.f2903d, this.f2904e - this.f2903d);
                    this.f2904e = -1;
                    s();
                    i = this.f2903d;
                    while (true) {
                        if (i != this.f2904e) {
                            if (this.f2902c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f2903d) {
                    cVar.write(this.f2902c, this.f2903d, i - this.f2903d);
                }
                this.f2903d = i + 1;
                String cVar2 = cVar.toString();
                return cVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
