package androidx.work.impl.c;

import android.database.Cursor;
import androidx.room.b;
import androidx.room.s;
import androidx.room.v;
import java.util.ArrayList;
import java.util.List;

public final class D implements B {

    /* renamed from: a  reason: collision with root package name */
    private final s f1863a;

    /* renamed from: b  reason: collision with root package name */
    private final b f1864b;

    public D(s sVar) {
        this.f1863a = sVar;
        this.f1864b = new C(this, sVar);
    }

    public List<String> a(String str) {
        v a2 = v.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1863a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1863a, a2, false);
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

    public void a(A a2) {
        this.f1863a.b();
        this.f1863a.c();
        try {
            this.f1864b.a(a2);
            this.f1863a.k();
        } finally {
            this.f1863a.e();
        }
    }
}
