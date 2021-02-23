package c.b.b.a.a.c.a;

import android.database.Cursor;
import c.b.b.a.a.c.a.B;
import java.util.Map;

final /* synthetic */ class o implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f3765a;

    private o(Map map) {
        this.f3765a = map;
    }

    public static B.a a(Map map) {
        return new o(map);
    }

    public Object apply(Object obj) {
        return B.a(this.f3765a, (Cursor) obj);
    }
}
