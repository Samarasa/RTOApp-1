package androidx.work.impl.c;

import androidx.room.s;
import androidx.room.w;

class h extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i f1879d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(i iVar, s sVar) {
        super(sVar);
        this.f1879d = iVar;
    }

    public String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
}
