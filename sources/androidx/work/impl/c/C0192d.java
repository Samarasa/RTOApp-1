package androidx.work.impl.c;

import android.database.Cursor;
import androidx.room.b;
import androidx.room.s;
import androidx.room.v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.c.d  reason: case insensitive filesystem */
public final class C0192d implements C0190b {

    /* renamed from: a  reason: collision with root package name */
    private final s f1874a;

    /* renamed from: b  reason: collision with root package name */
    private final b f1875b;

    public C0192d(s sVar) {
        this.f1874a = sVar;
        this.f1875b = new C0191c(this, sVar);
    }

    public List<String> a(String str) {
        v a2 = v.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1874a.b();
        Cursor a3 = androidx.room.b.b.a(this.f1874a, a2, false);
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

    public void a(C0189a aVar) {
        this.f1874a.b();
        this.f1874a.c();
        try {
            this.f1875b.a(aVar);
            this.f1874a.k();
        } finally {
            this.f1874a.e();
        }
    }

    public boolean b(String str) {
        v a2 = v.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1874a.b();
        boolean z = false;
        Cursor a3 = androidx.room.b.b.a(this.f1874a, a2, false);
        try {
            if (a3.moveToFirst() && a3.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public boolean c(String str) {
        v a2 = v.a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.a(1);
        } else {
            a2.a(1, str);
        }
        this.f1874a.b();
        boolean z = false;
        Cursor a3 = androidx.room.b.b.a(this.f1874a, a2, false);
        try {
            if (a3.moveToFirst() && a3.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a3.close();
            a2.b();
        }
    }
}
