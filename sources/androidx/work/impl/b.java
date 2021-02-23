package androidx.work.impl;

import androidx.lifecycle.s;
import androidx.work.impl.utils.a.e;
import androidx.work.l;

public class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final s<l.a> f1751a = new s<>();

    /* renamed from: b  reason: collision with root package name */
    private final e<l.a.c> f1752b = e.d();

    public b() {
        a(l.f2033b);
    }

    public void a(l.a aVar) {
        this.f1751a.a(aVar);
        if (aVar instanceof l.a.c) {
            this.f1752b.b((l.a.c) aVar);
        } else if (aVar instanceof l.a.C0025a) {
            this.f1752b.a(((l.a.C0025a) aVar).a());
        }
    }
}
