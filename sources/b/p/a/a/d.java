package b.p.a.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import b.p.a.b;
import b.p.a.c;

class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f2660a;

    static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        final b[] f2661a;

        /* renamed from: b  reason: collision with root package name */
        final c.a f2662b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2663c;

        a(Context context, String str, b[] bVarArr, c.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f2666a, new c(aVar, bVarArr));
            this.f2662b = aVar;
            this.f2661a = bVarArr;
        }

        static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
            b bVar = bVarArr[0];
            if (bVar == null || !bVar.a(sQLiteDatabase)) {
                bVarArr[0] = new b(sQLiteDatabase);
            }
            return bVarArr[0];
        }

        /* access modifiers changed from: package-private */
        public b a(SQLiteDatabase sQLiteDatabase) {
            return a(this.f2661a, sQLiteDatabase);
        }

        /* access modifiers changed from: package-private */
        public synchronized b a() {
            this.f2663c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f2663c) {
                close();
                return a();
            }
            return a(writableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f2661a[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f2662b.a((b) a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f2662b.c(a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f2663c = true;
            this.f2662b.a(a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f2663c) {
                this.f2662b.d(a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f2663c = true;
            this.f2662b.b(a(sQLiteDatabase), i, i2);
        }
    }

    d(Context context, String str, c.a aVar) {
        this.f2660a = a(context, str, aVar);
    }

    private a a(Context context, String str, c.a aVar) {
        return new a(context, str, new b[1], aVar);
    }

    public b a() {
        return this.f2660a.a();
    }

    public void a(boolean z) {
        this.f2660a.setWriteAheadLoggingEnabled(z);
    }
}
