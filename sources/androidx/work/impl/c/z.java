package androidx.work.impl.c;

import android.database.Cursor;
import androidx.room.b;
import androidx.room.b.a;
import androidx.room.b.c;
import androidx.room.s;
import androidx.room.v;
import androidx.room.w;
import androidx.work.e;
import androidx.work.impl.c.o;
import androidx.work.o;
import b.p.a.f;
import java.util.ArrayList;
import java.util.List;

public final class z implements p {

    /* renamed from: a  reason: collision with root package name */
    private final s f1907a;

    /* renamed from: b  reason: collision with root package name */
    private final b f1908b;

    /* renamed from: c  reason: collision with root package name */
    private final w f1909c;

    /* renamed from: d  reason: collision with root package name */
    private final w f1910d;

    /* renamed from: e  reason: collision with root package name */
    private final w f1911e;

    /* renamed from: f  reason: collision with root package name */
    private final w f1912f;

    /* renamed from: g  reason: collision with root package name */
    private final w f1913g;

    /* renamed from: h  reason: collision with root package name */
    private final w f1914h;
    private final w i;
    private final w j;

    public z(s sVar) {
        this.f1907a = sVar;
        this.f1908b = new q(this, sVar);
        this.f1909c = new r(this, sVar);
        this.f1910d = new s(this, sVar);
        this.f1911e = new t(this, sVar);
        this.f1912f = new u(this, sVar);
        this.f1913g = new v(this, sVar);
        this.f1914h = new w(this, sVar);
        this.i = new x(this, sVar);
        this.j = new y(this, sVar);
    }

    public int a(o oVar, String... strArr) {
        this.f1907a.b();
        StringBuilder a2 = c.a();
        a2.append("UPDATE workspec SET state=");
        a2.append("?");
        a2.append(" WHERE id IN (");
        c.a(a2, strArr.length);
        a2.append(")");
        f a3 = this.f1907a.a(a2.toString());
        a3.a(1, (long) F.a(oVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                a3.a(i2);
            } else {
                a3.a(i2, str);
            }
            i2++;
        }
        this.f1907a.c();
        try {
            int c2 = a3.c();
            this.f1907a.k();
            return c2;
        } finally {
            this.f1907a.e();
        }
    }

    public int a(String str, long j2) {
        this.f1907a.b();
        f a2 = this.f1914h.a();
        a2.a(1, j2);
        if (str == null) {
            a2.a(2);
        } else {
            a2.a(2, str);
        }
        this.f1907a.c();
        try {
            int c2 = a2.c();
            this.f1907a.k();
            return c2;
        } finally {
            this.f1907a.e();
            this.f1914h.a(a2);
        }
    }

    public List<o> a() {
        v vVar;
        v a2 = v.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            int a4 = a.a(a3, "id");
            int a5 = a.a(a3, "state");
            int a6 = a.a(a3, "worker_class_name");
            int a7 = a.a(a3, "input_merger_class_name");
            int a8 = a.a(a3, "input");
            int a9 = a.a(a3, "output");
            int a10 = a.a(a3, "initial_delay");
            int a11 = a.a(a3, "interval_duration");
            int a12 = a.a(a3, "flex_duration");
            int a13 = a.a(a3, "run_attempt_count");
            int a14 = a.a(a3, "backoff_policy");
            int a15 = a.a(a3, "backoff_delay_duration");
            int a16 = a.a(a3, "period_start_time");
            int a17 = a.a(a3, "minimum_retention_duration");
            vVar = a2;
            try {
                int a18 = a.a(a3, "schedule_requested_at");
                int a19 = a.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = a.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = a.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = a.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = a.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = a.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = a.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = a.a(a3, "content_uri_triggers");
                int i9 = a10;
                int i10 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i11 = a4;
                    String string2 = a3.getString(a6);
                    int i12 = a6;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = a19;
                    cVar.a(F.b(a3.getInt(a19)));
                    cVar.b(a3.getInt(a20) != 0);
                    cVar.c(a3.getInt(a21) != 0);
                    cVar.a(a3.getInt(a22) != 0);
                    cVar.d(a3.getInt(a23) != 0);
                    int i14 = a21;
                    int i15 = a20;
                    cVar.a(a3.getLong(a24));
                    cVar.b(a3.getLong(a25));
                    cVar.a(F.a(a3.getBlob(a26)));
                    o oVar = new o(string, string2);
                    oVar.f1891d = F.c(a3.getInt(a5));
                    oVar.f1893f = a3.getString(a7);
                    oVar.f1894g = e.b(a3.getBlob(a8));
                    int i16 = i10;
                    oVar.f1895h = e.b(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    oVar.i = a3.getLong(i18);
                    i9 = i18;
                    int i19 = i8;
                    oVar.j = a3.getLong(i19);
                    i8 = i19;
                    int i20 = i7;
                    oVar.k = a3.getLong(i20);
                    int i21 = i6;
                    oVar.m = a3.getInt(i21);
                    int i22 = i5;
                    i6 = i21;
                    oVar.n = F.a(a3.getInt(i22));
                    i7 = i20;
                    int i23 = i4;
                    int i24 = a5;
                    oVar.o = a3.getLong(i23);
                    int i25 = i23;
                    i5 = i22;
                    int i26 = i3;
                    oVar.p = a3.getLong(i26);
                    i3 = i26;
                    int i27 = i2;
                    oVar.q = a3.getLong(i27);
                    i2 = i27;
                    int i28 = i25;
                    int i29 = a18;
                    oVar.r = a3.getLong(i29);
                    oVar.l = cVar;
                    arrayList.add(oVar);
                    a18 = i29;
                    a20 = i17;
                    a4 = i11;
                    a6 = i12;
                    a21 = i14;
                    a19 = i13;
                    int i30 = i24;
                    i4 = i28;
                    a5 = i30;
                }
                a3.close();
                vVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                vVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = a2;
            a3.close();
            vVar.b();
            throw th;
        }
    }

    public List<o> a(int i2) {
        v vVar;
        v a2 = v.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a2.a(1, (long) i2);
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            int a4 = a.a(a3, "id");
            int a5 = a.a(a3, "state");
            int a6 = a.a(a3, "worker_class_name");
            int a7 = a.a(a3, "input_merger_class_name");
            int a8 = a.a(a3, "input");
            int a9 = a.a(a3, "output");
            int a10 = a.a(a3, "initial_delay");
            int a11 = a.a(a3, "interval_duration");
            int a12 = a.a(a3, "flex_duration");
            int a13 = a.a(a3, "run_attempt_count");
            int a14 = a.a(a3, "backoff_policy");
            int a15 = a.a(a3, "backoff_delay_duration");
            int a16 = a.a(a3, "period_start_time");
            int a17 = a.a(a3, "minimum_retention_duration");
            vVar = a2;
            try {
                int a18 = a.a(a3, "schedule_requested_at");
                int a19 = a.a(a3, "required_network_type");
                int i3 = a17;
                int a20 = a.a(a3, "requires_charging");
                int i4 = a16;
                int a21 = a.a(a3, "requires_device_idle");
                int i5 = a15;
                int a22 = a.a(a3, "requires_battery_not_low");
                int i6 = a14;
                int a23 = a.a(a3, "requires_storage_not_low");
                int i7 = a13;
                int a24 = a.a(a3, "trigger_content_update_delay");
                int i8 = a12;
                int a25 = a.a(a3, "trigger_max_content_delay");
                int i9 = a11;
                int a26 = a.a(a3, "content_uri_triggers");
                int i10 = a10;
                int i11 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i12 = a4;
                    String string2 = a3.getString(a6);
                    int i13 = a6;
                    androidx.work.c cVar = new androidx.work.c();
                    int i14 = a19;
                    cVar.a(F.b(a3.getInt(a19)));
                    cVar.b(a3.getInt(a20) != 0);
                    cVar.c(a3.getInt(a21) != 0);
                    cVar.a(a3.getInt(a22) != 0);
                    cVar.d(a3.getInt(a23) != 0);
                    int i15 = a22;
                    int i16 = a20;
                    cVar.a(a3.getLong(a24));
                    cVar.b(a3.getLong(a25));
                    cVar.a(F.a(a3.getBlob(a26)));
                    o oVar = new o(string, string2);
                    oVar.f1891d = F.c(a3.getInt(a5));
                    oVar.f1893f = a3.getString(a7);
                    oVar.f1894g = e.b(a3.getBlob(a8));
                    int i17 = i11;
                    oVar.f1895h = e.b(a3.getBlob(i17));
                    i11 = i17;
                    int i18 = i16;
                    int i19 = i10;
                    oVar.i = a3.getLong(i19);
                    i10 = i19;
                    int i20 = i9;
                    oVar.j = a3.getLong(i20);
                    i9 = i20;
                    int i21 = a21;
                    int i22 = i8;
                    oVar.k = a3.getLong(i22);
                    int i23 = i7;
                    oVar.m = a3.getInt(i23);
                    int i24 = i6;
                    i7 = i23;
                    oVar.n = F.a(a3.getInt(i24));
                    i8 = i22;
                    int i25 = i5;
                    int i26 = i21;
                    oVar.o = a3.getLong(i25);
                    int i27 = i25;
                    i6 = i24;
                    int i28 = i4;
                    oVar.p = a3.getLong(i28);
                    i4 = i28;
                    int i29 = i3;
                    oVar.q = a3.getLong(i29);
                    i3 = i29;
                    int i30 = i27;
                    int i31 = a18;
                    oVar.r = a3.getLong(i31);
                    oVar.l = cVar;
                    arrayList.add(oVar);
                    a18 = i31;
                    a20 = i18;
                    a21 = i26;
                    a6 = i13;
                    a22 = i15;
                    a19 = i14;
                    i5 = i30;
                    a4 = i12;
                }
                a3.close();
                vVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                vVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = a2;
            a3.close();
            vVar.b();
            throw th;
        }
    }

    public List<o.a> a(String str) {
        v a2 = v.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            int a4 = a.a(a3, "id");
            int a5 = a.a(a3, "state");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                o.a aVar = new o.a();
                aVar.f1896a = a3.getString(a4);
                aVar.f1897b = F.c(a3.getInt(a5));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public void a(o oVar) {
        this.f1907a.b();
        this.f1907a.c();
        try {
            this.f1908b.a(oVar);
            this.f1907a.k();
        } finally {
            this.f1907a.e();
        }
    }

    public void a(String str, e eVar) {
        this.f1907a.b();
        f a2 = this.f1910d.a();
        byte[] a3 = e.a(eVar);
        if (a3 == null) {
            a2.a(1);
        } else {
            a2.a(1, a3);
        }
        if (str == null) {
            a2.a(2);
        } else {
            a2.a(2, str);
        }
        this.f1907a.c();
        try {
            a2.c();
            this.f1907a.k();
        } finally {
            this.f1907a.e();
            this.f1910d.a(a2);
        }
    }

    public List<o> b() {
        v vVar;
        v a2 = v.a("SELECT * FROM workspec WHERE state=1", 0);
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            int a4 = a.a(a3, "id");
            int a5 = a.a(a3, "state");
            int a6 = a.a(a3, "worker_class_name");
            int a7 = a.a(a3, "input_merger_class_name");
            int a8 = a.a(a3, "input");
            int a9 = a.a(a3, "output");
            int a10 = a.a(a3, "initial_delay");
            int a11 = a.a(a3, "interval_duration");
            int a12 = a.a(a3, "flex_duration");
            int a13 = a.a(a3, "run_attempt_count");
            int a14 = a.a(a3, "backoff_policy");
            int a15 = a.a(a3, "backoff_delay_duration");
            int a16 = a.a(a3, "period_start_time");
            int a17 = a.a(a3, "minimum_retention_duration");
            vVar = a2;
            try {
                int a18 = a.a(a3, "schedule_requested_at");
                int a19 = a.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = a.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = a.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = a.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = a.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = a.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = a.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = a.a(a3, "content_uri_triggers");
                int i9 = a10;
                int i10 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i11 = a4;
                    String string2 = a3.getString(a6);
                    int i12 = a6;
                    androidx.work.c cVar = new androidx.work.c();
                    int i13 = a19;
                    cVar.a(F.b(a3.getInt(a19)));
                    cVar.b(a3.getInt(a20) != 0);
                    cVar.c(a3.getInt(a21) != 0);
                    cVar.a(a3.getInt(a22) != 0);
                    cVar.d(a3.getInt(a23) != 0);
                    int i14 = a21;
                    int i15 = a20;
                    cVar.a(a3.getLong(a24));
                    cVar.b(a3.getLong(a25));
                    cVar.a(F.a(a3.getBlob(a26)));
                    o oVar = new o(string, string2);
                    oVar.f1891d = F.c(a3.getInt(a5));
                    oVar.f1893f = a3.getString(a7);
                    oVar.f1894g = e.b(a3.getBlob(a8));
                    int i16 = i10;
                    oVar.f1895h = e.b(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    oVar.i = a3.getLong(i18);
                    i9 = i18;
                    int i19 = i8;
                    oVar.j = a3.getLong(i19);
                    i8 = i19;
                    int i20 = i7;
                    oVar.k = a3.getLong(i20);
                    int i21 = i6;
                    oVar.m = a3.getInt(i21);
                    int i22 = i5;
                    i6 = i21;
                    oVar.n = F.a(a3.getInt(i22));
                    i7 = i20;
                    int i23 = i4;
                    int i24 = a5;
                    oVar.o = a3.getLong(i23);
                    int i25 = i23;
                    i5 = i22;
                    int i26 = i3;
                    oVar.p = a3.getLong(i26);
                    i3 = i26;
                    int i27 = i2;
                    oVar.q = a3.getLong(i27);
                    i2 = i27;
                    int i28 = i25;
                    int i29 = a18;
                    oVar.r = a3.getLong(i29);
                    oVar.l = cVar;
                    arrayList.add(oVar);
                    a18 = i29;
                    a20 = i17;
                    a4 = i11;
                    a6 = i12;
                    a21 = i14;
                    a19 = i13;
                    int i30 = i24;
                    i4 = i28;
                    a5 = i30;
                }
                a3.close();
                vVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                vVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = a2;
            a3.close();
            vVar.b();
            throw th;
        }
    }

    public List<String> b(String str) {
        v a2 = v.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public void b(String str, long j2) {
        this.f1907a.b();
        f a2 = this.f1911e.a();
        a2.a(1, j2);
        if (str == null) {
            a2.a(2);
        } else {
            a2.a(2, str);
        }
        this.f1907a.c();
        try {
            a2.c();
            this.f1907a.k();
        } finally {
            this.f1907a.e();
            this.f1911e.a(a2);
        }
    }

    public androidx.work.o c(String str) {
        v a2 = v.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            return a3.moveToFirst() ? F.c(a3.getInt(0)) : null;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public List<String> c() {
        v a2 = v.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public int d() {
        this.f1907a.b();
        f a2 = this.i.a();
        this.f1907a.c();
        try {
            int c2 = a2.c();
            this.f1907a.k();
            return c2;
        } finally {
            this.f1907a.e();
            this.i.a(a2);
        }
    }

    public o d(String str) {
        v vVar;
        o oVar;
        String str2 = str;
        v a2 = v.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a2.a(1);
        } else {
            a2.a(1, str2);
        }
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            int a4 = a.a(a3, "id");
            int a5 = a.a(a3, "state");
            int a6 = a.a(a3, "worker_class_name");
            int a7 = a.a(a3, "input_merger_class_name");
            int a8 = a.a(a3, "input");
            int a9 = a.a(a3, "output");
            int a10 = a.a(a3, "initial_delay");
            int a11 = a.a(a3, "interval_duration");
            int a12 = a.a(a3, "flex_duration");
            int a13 = a.a(a3, "run_attempt_count");
            int a14 = a.a(a3, "backoff_policy");
            int a15 = a.a(a3, "backoff_delay_duration");
            int a16 = a.a(a3, "period_start_time");
            int a17 = a.a(a3, "minimum_retention_duration");
            vVar = a2;
            try {
                int a18 = a.a(a3, "schedule_requested_at");
                int a19 = a.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = a.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = a.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = a.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = a.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = a.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = a.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = a.a(a3, "content_uri_triggers");
                if (a3.moveToFirst()) {
                    String string = a3.getString(a4);
                    String string2 = a3.getString(a6);
                    int i9 = a10;
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.a(F.b(a3.getInt(a19)));
                    cVar.b(a3.getInt(a20) != 0);
                    cVar.c(a3.getInt(a21) != 0);
                    cVar.a(a3.getInt(a22) != 0);
                    cVar.d(a3.getInt(a23) != 0);
                    cVar.a(a3.getLong(a24));
                    cVar.b(a3.getLong(a25));
                    cVar.a(F.a(a3.getBlob(a26)));
                    oVar = new o(string, string2);
                    oVar.f1891d = F.c(a3.getInt(a5));
                    oVar.f1893f = a3.getString(a7);
                    oVar.f1894g = e.b(a3.getBlob(a8));
                    oVar.f1895h = e.b(a3.getBlob(a9));
                    oVar.i = a3.getLong(i9);
                    oVar.j = a3.getLong(i8);
                    oVar.k = a3.getLong(i7);
                    oVar.m = a3.getInt(i6);
                    oVar.n = F.a(a3.getInt(i5));
                    oVar.o = a3.getLong(i4);
                    oVar.p = a3.getLong(i3);
                    oVar.q = a3.getLong(i2);
                    oVar.r = a3.getLong(a18);
                    oVar.l = cVar;
                } else {
                    oVar = null;
                }
                a3.close();
                vVar.b();
                return oVar;
            } catch (Throwable th) {
                th = th;
                a3.close();
                vVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = a2;
            a3.close();
            vVar.b();
            throw th;
        }
    }

    public void delete(String str) {
        this.f1907a.b();
        f a2 = this.f1909c.a();
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.c();
        try {
            a2.c();
            this.f1907a.k();
        } finally {
            this.f1907a.e();
            this.f1909c.a(a2);
        }
    }

    public int e(String str) {
        this.f1907a.b();
        f a2 = this.f1913g.a();
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.c();
        try {
            int c2 = a2.c();
            this.f1907a.k();
            return c2;
        } finally {
            this.f1907a.e();
            this.f1913g.a(a2);
        }
    }

    public List<String> f(String str) {
        v a2 = v.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public List<e> g(String str) {
        v a2 = v.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1907a, a2, false);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(e.b(a3.getBlob(0)));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public int h(String str) {
        this.f1907a.b();
        f a2 = this.f1912f.a();
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1907a.c();
        try {
            int c2 = a2.c();
            this.f1907a.k();
            return c2;
        } finally {
            this.f1907a.e();
            this.f1912f.a(a2);
        }
    }
}
