package androidx.room;

import b.p.a.f;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f1617a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final s f1618b;

    /* renamed from: c  reason: collision with root package name */
    private volatile f f1619c;

    public w(s sVar) {
        this.f1618b = sVar;
    }

    private f a(boolean z) {
        if (!z) {
            return d();
        }
        if (this.f1619c == null) {
            this.f1619c = d();
        }
        return this.f1619c;
    }

    private f d() {
        return this.f1618b.a(c());
    }

    public f a() {
        b();
        return a(this.f1617a.compareAndSet(false, true));
    }

    public void a(f fVar) {
        if (fVar == this.f1619c) {
            this.f1617a.set(false);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f1618b.a();
    }

    /* access modifiers changed from: protected */
    public abstract String c();
}
