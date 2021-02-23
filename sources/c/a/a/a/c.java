package c.a.a.a;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

class c extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f2899a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(d dVar, int i) {
        super(i);
        this.f2899a = dVar;
    }

    public String toString() {
        int i = this.count;
        try {
            return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, this.f2899a.f2901b.name());
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
