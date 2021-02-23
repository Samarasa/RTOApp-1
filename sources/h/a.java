package h;

import java.io.IOException;

class a implements v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f15316a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f15317b;

    a(c cVar, v vVar) {
        this.f15317b = cVar;
        this.f15316a = vVar;
    }

    public void b(e eVar, long j) {
        z.a(eVar.f15328c, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                s sVar = eVar.f15327b;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    s sVar2 = eVar.f15327b;
                    j2 += (long) (sVar2.f15358c - sVar2.f15357b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    sVar = sVar.f15361f;
                }
                this.f15317b.h();
                try {
                    this.f15316a.b(eVar, j2);
                    j -= j2;
                    this.f15317b.a(true);
                } catch (IOException e2) {
                    throw this.f15317b.a(e2);
                } catch (Throwable th) {
                    this.f15317b.a(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public void close() {
        this.f15317b.h();
        try {
            this.f15316a.close();
            this.f15317b.a(true);
        } catch (IOException e2) {
            throw this.f15317b.a(e2);
        } catch (Throwable th) {
            this.f15317b.a(false);
            throw th;
        }
    }

    public void flush() {
        this.f15317b.h();
        try {
            this.f15316a.flush();
            this.f15317b.a(true);
        } catch (IOException e2) {
            throw this.f15317b.a(e2);
        } catch (Throwable th) {
            this.f15317b.a(false);
            throw th;
        }
    }

    public y timeout() {
        return this.f15317b;
    }

    public String toString() {
        return "AsyncTimeout.sink(" + this.f15316a + ")";
    }
}
