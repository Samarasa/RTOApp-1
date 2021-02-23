package h;

import java.io.IOException;

class b implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f15318a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f15319b;

    b(c cVar, w wVar) {
        this.f15319b = cVar;
        this.f15318a = wVar;
    }

    public long a(e eVar, long j) {
        this.f15319b.h();
        try {
            long a2 = this.f15318a.a(eVar, j);
            this.f15319b.a(true);
            return a2;
        } catch (IOException e2) {
            throw this.f15319b.a(e2);
        } catch (Throwable th) {
            this.f15319b.a(false);
            throw th;
        }
    }

    public void close() {
        try {
            this.f15318a.close();
            this.f15319b.a(true);
        } catch (IOException e2) {
            throw this.f15319b.a(e2);
        } catch (Throwable th) {
            this.f15319b.a(false);
            throw th;
        }
    }

    public y timeout() {
        return this.f15319b;
    }

    public String toString() {
        return "AsyncTimeout.source(" + this.f15318a + ")";
    }
}
