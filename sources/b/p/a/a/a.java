package b.p.a.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import b.p.a.e;

class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f2653a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f2654b;

    a(b bVar, e eVar) {
        this.f2654b = bVar;
        this.f2653a = eVar;
    }

    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f2653a.a(new f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
