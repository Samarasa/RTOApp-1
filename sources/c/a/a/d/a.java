package c.a.a.d;

import c.a.a.i.k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Set<j> f3509a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private boolean f3510b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3511c;

    a() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f3511c = true;
        for (T onDestroy : k.a(this.f3509a)) {
            onDestroy.onDestroy();
        }
    }

    public void a(j jVar) {
        this.f3509a.add(jVar);
        if (this.f3511c) {
            jVar.onDestroy();
        } else if (this.f3510b) {
            jVar.m();
        } else {
            jVar.n();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f3510b = true;
        for (T m : k.a(this.f3509a)) {
            m.m();
        }
    }

    public void b(j jVar) {
        this.f3509a.remove(jVar);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f3510b = false;
        for (T n : k.a(this.f3509a)) {
            n.n();
        }
    }
}
