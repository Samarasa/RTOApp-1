package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.B;

final /* synthetic */ class x implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f3776a;

    private x(String str) {
        this.f3776a = str;
    }

    public static B.a a(String str) {
        return new x(str);
    }

    public Object apply(Object obj) {
        return B.a(this.f3776a, (SQLiteDatabase) obj);
    }
}
