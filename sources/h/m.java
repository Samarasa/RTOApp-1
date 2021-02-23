package h;

import java.io.OutputStream;

class m implements v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y f15345a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OutputStream f15346b;

    m(y yVar, OutputStream outputStream) {
        this.f15345a = yVar;
        this.f15346b = outputStream;
    }

    public void b(e eVar, long j) {
        z.a(eVar.f15328c, 0, j);
        while (j > 0) {
            this.f15345a.e();
            s sVar = eVar.f15327b;
            int min = (int) Math.min(j, (long) (sVar.f15358c - sVar.f15357b));
            this.f15346b.write(sVar.f15356a, sVar.f15357b, min);
            sVar.f15357b += min;
            long j2 = (long) min;
            j -= j2;
            eVar.f15328c -= j2;
            if (sVar.f15357b == sVar.f15358c) {
                eVar.f15327b = sVar.b();
                t.a(sVar);
            }
        }
    }

    public void close() {
        this.f15346b.close();
    }

    public void flush() {
        this.f15346b.flush();
    }

    public y timeout() {
        return this.f15345a;
    }

    public String toString() {
        return "sink(" + this.f15346b + ")";
    }
}
