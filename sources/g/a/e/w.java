package g.a.e;

import java.util.concurrent.CountDownLatch;

final class w {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f15181a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private long f15182b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f15183c = -1;

    w() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f15183c == -1) {
            long j = this.f15182b;
            if (j != -1) {
                this.f15183c = j - 1;
                this.f15181a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f15183c != -1 || this.f15182b == -1) {
            throw new IllegalStateException();
        }
        this.f15183c = System.nanoTime();
        this.f15181a.countDown();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f15182b == -1) {
            this.f15182b = System.nanoTime();
            return;
        }
        throw new IllegalStateException();
    }
}
