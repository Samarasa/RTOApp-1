package androidx.work.impl;

import androidx.room.a.a;
import b.p.a.b;

class j extends a {
    j(int i, int i2) {
        super(i, i2);
    }

    public void a(b bVar) {
        bVar.b("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        bVar.b("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
