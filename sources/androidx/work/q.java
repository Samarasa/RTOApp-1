package androidx.work;

import androidx.work.impl.c.o;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private UUID f2042a;

    /* renamed from: b  reason: collision with root package name */
    private o f2043b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f2044c;

    public static abstract class a<B extends a, W extends q> {

        /* renamed from: a  reason: collision with root package name */
        boolean f2045a = false;

        /* renamed from: b  reason: collision with root package name */
        UUID f2046b = UUID.randomUUID();

        /* renamed from: c  reason: collision with root package name */
        o f2047c;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f2048d = new HashSet();

        a(Class<? extends ListenableWorker> cls) {
            this.f2047c = new o(this.f2046b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(c cVar) {
            this.f2047c.l = cVar;
            c();
            return this;
        }

        public final B a(e eVar) {
            this.f2047c.f1894g = eVar;
            c();
            return this;
        }

        public final B a(String str) {
            this.f2048d.add(str);
            c();
            return this;
        }

        public final W a() {
            W b2 = b();
            this.f2046b = UUID.randomUUID();
            this.f2047c = new o(this.f2047c);
            this.f2047c.f1890c = this.f2046b.toString();
            return b2;
        }

        /* access modifiers changed from: package-private */
        public abstract W b();

        /* access modifiers changed from: package-private */
        public abstract B c();
    }

    protected q(UUID uuid, o oVar, Set<String> set) {
        this.f2042a = uuid;
        this.f2043b = oVar;
        this.f2044c = set;
    }

    public String a() {
        return this.f2042a.toString();
    }

    public Set<String> b() {
        return this.f2044c;
    }

    public o c() {
        return this.f2043b;
    }
}
