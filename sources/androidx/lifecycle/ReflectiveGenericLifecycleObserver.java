package androidx.lifecycle;

import androidx.lifecycle.C0170a;
import androidx.lifecycle.g;

class ReflectiveGenericLifecycleObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1211a;

    /* renamed from: b  reason: collision with root package name */
    private final C0170a.C0015a f1212b = C0170a.f1214a.a(this.f1211a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1211a = obj;
    }

    public void a(k kVar, g.a aVar) {
        this.f1212b.a(kVar, aVar, this.f1211a);
    }
}
