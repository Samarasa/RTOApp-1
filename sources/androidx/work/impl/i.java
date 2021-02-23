package androidx.work.impl;

import android.os.Build;
import androidx.room.a.a;
import b.p.a.b;

class i extends a {
    i(int i, int i2) {
        super(i, i2);
    }

    public void a(b bVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            bVar.b("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }
}
