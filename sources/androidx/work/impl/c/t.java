package androidx.work.impl.c;

import androidx.room.s;
import androidx.room.w;

class t extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1901d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(z zVar, s sVar) {
        super(sVar);
        this.f1901d = zVar;
    }

    public String c() {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
    }
}
