package androidx.work.impl.c;

import androidx.room.b;
import androidx.room.s;
import b.p.a.f;

class l extends b<j> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m f1885d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(m mVar, s sVar) {
        super(sVar);
        this.f1885d = mVar;
    }

    public void a(f fVar, j jVar) {
        String str = jVar.f1883a;
        if (str == null) {
            fVar.a(1);
        } else {
            fVar.a(1, str);
        }
        String str2 = jVar.f1884b;
        if (str2 == null) {
            fVar.a(2);
        } else {
            fVar.a(2, str2);
        }
    }

    public String c() {
        return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
    }
}
