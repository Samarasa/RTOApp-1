package androidx.work.impl.c;

import androidx.room.b;
import androidx.room.s;
import b.p.a.f;

class g extends b<C0193e> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i f1878d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(i iVar, s sVar) {
        super(sVar);
        this.f1878d = iVar;
    }

    public void a(f fVar, C0193e eVar) {
        String str = eVar.f1876a;
        if (str == null) {
            fVar.a(1);
        } else {
            fVar.a(1, str);
        }
        fVar.a(2, (long) eVar.f1877b);
    }

    public String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
    }
}
