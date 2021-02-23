package androidx.work.impl.c;

import android.database.Cursor;
import androidx.room.b;
import androidx.room.b.a;
import androidx.room.s;
import androidx.room.v;
import androidx.room.w;
import b.p.a.f;

public final class i implements C0194f {

    /* renamed from: a  reason: collision with root package name */
    private final s f1880a;

    /* renamed from: b  reason: collision with root package name */
    private final b f1881b;

    /* renamed from: c  reason: collision with root package name */
    private final w f1882c;

    public i(s sVar) {
        this.f1880a = sVar;
        this.f1881b = new g(this, sVar);
        this.f1882c = new h(this, sVar);
    }

    public C0193e a(String str) {
        v a2 = v.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1880a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1880a, a2, false);
        try {
            return a3.moveToFirst() ? new C0193e(a3.getString(a.a(a3, "work_spec_id")), a3.getInt(a.a(a3, "system_id"))) : null;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public void a(C0193e eVar) {
        this.f1880a.b();
        this.f1880a.c();
        try {
            this.f1881b.a(eVar);
            this.f1880a.k();
        } finally {
            this.f1880a.e();
        }
    }

    public void b(String str) {
        this.f1880a.b();
        f a2 = this.f1882c.a();
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1880a.c();
        try {
            a2.c();
            this.f1880a.k();
        } finally {
            this.f1880a.e();
            this.f1882c.a(a2);
        }
    }
}
