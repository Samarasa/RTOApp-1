package b.p.a.a;

import android.database.sqlite.SQLiteProgram;
import b.p.a.d;

class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f2664a;

    f(SQLiteProgram sQLiteProgram) {
        this.f2664a = sQLiteProgram;
    }

    public void a(int i) {
        this.f2664a.bindNull(i);
    }

    public void a(int i, double d2) {
        this.f2664a.bindDouble(i, d2);
    }

    public void a(int i, long j) {
        this.f2664a.bindLong(i, j);
    }

    public void a(int i, String str) {
        this.f2664a.bindString(i, str);
    }

    public void a(int i, byte[] bArr) {
        this.f2664a.bindBlob(i, bArr);
    }

    public void close() {
        this.f2664a.close();
    }
}
