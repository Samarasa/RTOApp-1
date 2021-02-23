package androidx.work.impl;

import android.content.Context;
import androidx.room.r;
import androidx.room.s;
import androidx.work.impl.c.B;
import androidx.work.impl.c.C0190b;
import androidx.work.impl.c.C0194f;
import androidx.work.impl.c.p;
import androidx.work.impl.k;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends s {
    private static final long l = TimeUnit.DAYS.toMillis(7);

    public static WorkDatabase a(Context context, Executor executor, boolean z) {
        s.a<WorkDatabase> aVar;
        if (z) {
            aVar = r.a(context, WorkDatabase.class);
            aVar.a();
        } else {
            s.a<WorkDatabase> a2 = r.a(context, WorkDatabase.class, "androidx.work.workdb");
            a2.a(executor);
            aVar = a2;
        }
        aVar.a(m());
        aVar.a(k.f1924a);
        aVar.a(new k.a(context, 2, 3));
        aVar.a(k.f1925b);
        aVar.a(k.f1926c);
        aVar.a(new k.a(context, 5, 6));
        aVar.c();
        return aVar.b();
    }

    static s.b m() {
        return new g();
    }

    static long n() {
        return System.currentTimeMillis() - l;
    }

    static String o() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + n() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract C0190b l();

    public abstract C0194f p();

    public abstract androidx.work.impl.c.k q();

    public abstract p r();

    public abstract B s();
}
