package androidx.work.impl.c;

import androidx.room.b;
import androidx.room.s;
import b.p.a.f;

class C extends b<A> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ D f1862d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C(D d2, s sVar) {
        super(sVar);
        this.f1862d = d2;
    }

    public void a(f fVar, A a2) {
        String str = a2.f1860a;
        if (str == null) {
            fVar.a(1);
        } else {
            fVar.a(1, str);
        }
        String str2 = a2.f1861b;
        if (str2 == null) {
            fVar.a(2);
        } else {
            fVar.a(2, str2);
        }
    }

    public String c() {
        return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
