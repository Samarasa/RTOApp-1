package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.B;
import c.b.b.a.a.l;
import c.b.b.a.a.p;

final /* synthetic */ class v implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final B f3772a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3773b;

    /* renamed from: c  reason: collision with root package name */
    private final l f3774c;

    private v(B b2, p pVar, l lVar) {
        this.f3772a = b2;
        this.f3773b = pVar;
        this.f3774c = lVar;
    }

    public static B.a a(B b2, p pVar, l lVar) {
        return new v(b2, pVar, lVar);
    }

    public Object apply(Object obj) {
        return B.a(this.f3772a, this.f3773b, this.f3774c, (SQLiteDatabase) obj);
    }
}
