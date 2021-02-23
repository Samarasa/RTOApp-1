package androidx.work.impl.c;

import androidx.room.s;

class w extends androidx.room.w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1904d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w(z zVar, s sVar) {
        super(sVar);
        this.f1904d = zVar;
    }

    public String c() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
