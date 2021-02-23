package androidx.work.impl.c;

import androidx.room.b;
import androidx.room.s;

public final class m implements k {

    /* renamed from: a  reason: collision with root package name */
    private final s f1886a;

    /* renamed from: b  reason: collision with root package name */
    private final b f1887b;

    public m(s sVar) {
        this.f1886a = sVar;
        this.f1887b = new l(this, sVar);
    }

    public void a(j jVar) {
        this.f1886a.b();
        this.f1886a.c();
        try {
            this.f1887b.a(jVar);
            this.f1886a.k();
        } finally {
            this.f1886a.e();
        }
    }
}
