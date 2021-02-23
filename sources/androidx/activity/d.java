package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f104a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f105b = new CopyOnWriteArrayList<>();

    public d(boolean z) {
        this.f104a = z;
    }

    public abstract void a();

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f105b.add(aVar);
    }

    public final void a(boolean z) {
        this.f104a = z;
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f105b.remove(aVar);
    }

    public final boolean b() {
        return this.f104a;
    }

    public final void c() {
        Iterator<a> it = this.f105b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
