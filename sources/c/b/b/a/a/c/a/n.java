package c.b.b.a.a.c.a;

import android.database.Cursor;
import c.b.b.a.a.c.a.B;
import c.b.b.a.a.p;
import java.util.List;

final /* synthetic */ class n implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final List f3763a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3764b;

    private n(List list, p pVar) {
        this.f3763a = list;
        this.f3764b = pVar;
    }

    public static B.a a(List list, p pVar) {
        return new n(list, pVar);
    }

    public Object apply(Object obj) {
        return B.a(this.f3763a, this.f3764b, (Cursor) obj);
    }
}
