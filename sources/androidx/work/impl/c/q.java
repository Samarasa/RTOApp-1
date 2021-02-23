package androidx.work.impl.c;

import androidx.room.b;
import androidx.room.s;
import androidx.work.c;
import androidx.work.e;
import b.p.a.f;

class q extends b<o> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z f1898d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(z zVar, s sVar) {
        super(sVar);
        this.f1898d = zVar;
    }

    public void a(f fVar, o oVar) {
        String str = oVar.f1890c;
        if (str == null) {
            fVar.a(1);
        } else {
            fVar.a(1, str);
        }
        fVar.a(2, (long) F.a(oVar.f1891d));
        String str2 = oVar.f1892e;
        if (str2 == null) {
            fVar.a(3);
        } else {
            fVar.a(3, str2);
        }
        String str3 = oVar.f1893f;
        if (str3 == null) {
            fVar.a(4);
        } else {
            fVar.a(4, str3);
        }
        byte[] a2 = e.a(oVar.f1894g);
        if (a2 == null) {
            fVar.a(5);
        } else {
            fVar.a(5, a2);
        }
        byte[] a3 = e.a(oVar.f1895h);
        if (a3 == null) {
            fVar.a(6);
        } else {
            fVar.a(6, a3);
        }
        fVar.a(7, oVar.i);
        fVar.a(8, oVar.j);
        fVar.a(9, oVar.k);
        fVar.a(10, (long) oVar.m);
        fVar.a(11, (long) F.a(oVar.n));
        fVar.a(12, oVar.o);
        fVar.a(13, oVar.p);
        fVar.a(14, oVar.q);
        fVar.a(15, oVar.r);
        c cVar = oVar.l;
        if (cVar != null) {
            fVar.a(16, (long) F.a(cVar.b()));
            fVar.a(17, cVar.g() ? 1 : 0);
            fVar.a(18, cVar.h() ? 1 : 0);
            fVar.a(19, cVar.f() ? 1 : 0);
            fVar.a(20, cVar.i() ? 1 : 0);
            fVar.a(21, cVar.c());
            fVar.a(22, cVar.d());
            byte[] a4 = F.a(cVar.a());
            if (a4 != null) {
                fVar.a(23, a4);
                return;
            }
        } else {
            fVar.a(16);
            fVar.a(17);
            fVar.a(18);
            fVar.a(19);
            fVar.a(20);
            fVar.a(21);
            fVar.a(22);
        }
        fVar.a(23);
    }

    public String c() {
        return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
