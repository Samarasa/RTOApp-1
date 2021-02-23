package androidx.work.impl.c;

import androidx.room.w;

class s extends w {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1900d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s(z zVar, androidx.room.s sVar) {
        super(sVar);
        this.f1900d = zVar;
    }

    public String c() {
        return "UPDATE workspec SET output=? WHERE id=?";
    }
}
