package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.B;
import c.b.b.a.a.p;

final /* synthetic */ class z implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final B f3778a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3779b;

    private z(B b2, p pVar) {
        this.f3778a = b2;
        this.f3779b = pVar;
    }

    public static B.a a(B b2, p pVar) {
        return new z(b2, pVar);
    }

    public Object apply(Object obj) {
        return B.a(this.f3778a, this.f3779b, (SQLiteDatabase) obj);
    }
}
