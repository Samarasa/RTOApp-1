package androidx.work.impl.c;

import androidx.room.b;
import androidx.room.s;
import b.p.a.f;

/* renamed from: androidx.work.impl.c.c  reason: case insensitive filesystem */
class C0191c extends b<C0189a> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0192d f1873d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0191c(C0192d dVar, s sVar) {
        super(sVar);
        this.f1873d = dVar;
    }

    public void a(f fVar, C0189a aVar) {
        String str = aVar.f1871a;
        if (str == null) {
            fVar.a(1);
        } else {
            fVar.a(1, str);
        }
        String str2 = aVar.f1872b;
        if (str2 == null) {
            fVar.a(2);
        } else {
            fVar.a(2, str2);
        }
    }

    public String c() {
        return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
