package androidx.work.impl.b.b;

import androidx.work.impl.b.a;
import java.util.List;

class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f1766a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f f1767b;

    e(f fVar, List list) {
        this.f1767b = fVar;
        this.f1766a = list;
    }

    public void run() {
        for (a a2 : this.f1766a) {
            a2.a(this.f1767b.f1773f);
        }
    }
}
