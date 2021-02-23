package h;

import java.io.IOException;
import java.io.InputStream;

class n implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y f15347a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InputStream f15348b;

    n(y yVar, InputStream inputStream) {
        this.f15347a = yVar;
        this.f15348b = inputStream;
    }

    public long a(e eVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            try {
                this.f15347a.e();
                s b2 = eVar.b(1);
                int read = this.f15348b.read(b2.f15356a, b2.f15358c, (int) Math.min(j, (long) (8192 - b2.f15358c)));
                if (read == -1) {
                    return -1;
                }
                b2.f15358c += read;
                long j2 = (long) read;
                eVar.f15328c += j2;
                return j2;
            } catch (AssertionError e2) {
                if (p.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }
    }

    public void close() {
        this.f15348b.close();
    }

    public y timeout() {
        return this.f15347a;
    }

    public String toString() {
        return "source(" + this.f15348b + ")";
    }
}
