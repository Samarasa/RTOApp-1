package androidx.work.impl.c;

import androidx.room.s;
import androidx.room.w;

class r extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1899d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(z zVar, s sVar) {
        super(sVar);
        this.f1899d = zVar;
    }

    public String c() {
        return "DELETE FROM workspec WHERE id=?";
    }
}
