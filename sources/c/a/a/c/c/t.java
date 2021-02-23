package c.a.a.c.c;

import c.a.a.i.f;
import c.a.a.i.k;
import java.util.Queue;

public class t<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final f<a<A>, B> f3321a;

    static final class a<A> {

        /* renamed from: a  reason: collision with root package name */
        private static final Queue<a<?>> f3322a = k.a(0);

        /* renamed from: b  reason: collision with root package name */
        private int f3323b;

        /* renamed from: c  reason: collision with root package name */
        private int f3324c;

        /* renamed from: d  reason: collision with root package name */
        private A f3325d;

        private a() {
        }

        static <A> a<A> a(A a2, int i, int i2) {
            a<A> poll;
            synchronized (f3322a) {
                poll = f3322a.poll();
            }
            if (poll == null) {
                poll = new a<>();
            }
            poll.b(a2, i, i2);
            return poll;
        }

        private void b(A a2, int i, int i2) {
            this.f3325d = a2;
            this.f3324c = i;
            this.f3323b = i2;
        }

        public void a() {
            synchronized (f3322a) {
                f3322a.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3324c == aVar.f3324c && this.f3323b == aVar.f3323b && this.f3325d.equals(aVar.f3325d);
        }

        public int hashCode() {
            return (((this.f3323b * 31) + this.f3324c) * 31) + this.f3325d.hashCode();
        }
    }

    public t(long j) {
        this.f3321a = new s(this, j);
    }

    public B a(A a2, int i, int i2) {
        a a3 = a.a(a2, i, i2);
        B a4 = this.f3321a.a(a3);
        a3.a();
        return a4;
    }

    public void a(A a2, int i, int i2, B b2) {
        this.f3321a.b(a.a(a2, i, i2), b2);
    }
}
