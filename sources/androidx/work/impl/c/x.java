package androidx.work.impl.c;

import androidx.room.s;
import androidx.room.w;

class x extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1905d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x(z zVar, s sVar) {
        super(sVar);
        this.f1905d = zVar;
    }

    public String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
