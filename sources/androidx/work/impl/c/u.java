package androidx.work.impl.c;

import androidx.room.s;
import androidx.room.w;

class u extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1902d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u(z zVar, s sVar) {
        super(sVar);
        this.f1902d = zVar;
    }

    public String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
