package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.B;
import c.b.b.a.a.p;

final /* synthetic */ class j implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f3757a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3758b;

    private j(long j, p pVar) {
        this.f3757a = j;
        this.f3758b = pVar;
    }

    public static B.a a(long j, p pVar) {
        return new j(j, pVar);
    }

    public Object apply(Object obj) {
        return B.a(this.f3757a, this.f3758b, (SQLiteDatabase) obj);
    }
}
