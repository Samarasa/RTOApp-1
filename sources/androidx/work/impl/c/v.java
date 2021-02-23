package androidx.work.impl.c;

import androidx.room.s;
import androidx.room.w;

class v extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1903d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v(z zVar, s sVar) {
        super(sVar);
        this.f1903d = zVar;
    }

    public String c() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
