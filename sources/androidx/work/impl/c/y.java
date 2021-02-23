package androidx.work.impl.c;

import androidx.room.s;
import androidx.room.w;

class y extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1906d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    y(z zVar, s sVar) {
        super(sVar);
        this.f1906d = zVar;
    }

    public String c() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
