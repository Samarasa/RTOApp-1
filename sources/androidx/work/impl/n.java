package androidx.work.impl;

import androidx.work.h;
import androidx.work.impl.utils.a.e;

class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f1937a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f1938b;

    n(p pVar, e eVar) {
        this.f1938b = pVar;
        this.f1937a = eVar;
    }

    public void run() {
        try {
            h.a().a(p.f1942a, String.format("Starting work for %s", new Object[]{this.f1938b.f1947f.f1892e}), new Throwable[0]);
            this.f1938b.r = this.f1938b.f1948g.startWork();
            this.f1937a.b(this.f1938b.r);
        } catch (Throwable th) {
            this.f1937a.a(th);
        }
    }
}
