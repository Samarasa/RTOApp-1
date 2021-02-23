package b.p.a.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import b.p.a.a;
import b.p.a.e;
import b.p.a.f;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

class b implements b.p.a.b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f2655a = {BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f2656b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    private final SQLiteDatabase f2657c;

    b(SQLiteDatabase sQLiteDatabase) {
        this.f2657c = sQLiteDatabase;
    }

    public Cursor a(e eVar) {
        return this.f2657c.rawQueryWithFactory(new a(this, eVar), eVar.a(), f2656b, (String) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f2657c == sQLiteDatabase;
    }

    public void b(String str) {
        this.f2657c.execSQL(str);
    }

    public f c(String str) {
        return new g(this.f2657c.compileStatement(str));
    }

    public void close() {
        this.f2657c.close();
    }

    public Cursor d(String str) {
        return a((e) new a(str));
    }

    public String getPath() {
        return this.f2657c.getPath();
    }

    public boolean isOpen() {
        return this.f2657c.isOpen();
    }

    public void k() {
        this.f2657c.beginTransaction();
    }

    public List<Pair<String, String>> m() {
        return this.f2657c.getAttachedDbs();
    }

    public void o() {
        this.f2657c.setTransactionSuccessful();
    }

    public void p() {
        this.f2657c.endTransaction();
    }

    public boolean q() {
        return this.f2657c.inTransaction();
    }
}
