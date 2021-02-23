package b.p.a.a;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import b.p.a.a.d;
import b.p.a.c;

class c implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c.a f2658a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b[] f2659b;

    c(c.a aVar, b[] bVarArr) {
        this.f2658a = aVar;
        this.f2659b = bVarArr;
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        this.f2658a.b(d.a.a(this.f2659b, sQLiteDatabase));
    }
}
