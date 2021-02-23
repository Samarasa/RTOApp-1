package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.B;
import c.b.b.a.a.p;

final /* synthetic */ class k implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final B f3759a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3760b;

    private k(B b2, p pVar) {
        this.f3759a = b2;
        this.f3760b = pVar;
    }

    public static B.a a(B b2, p pVar) {
        return new k(b2, pVar);
    }

    public Object apply(Object obj) {
        return B.b(this.f3759a, this.f3760b, (SQLiteDatabase) obj);
    }
}
