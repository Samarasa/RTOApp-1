package c.b.b.a.a.c.a;

import android.database.Cursor;
import c.b.b.a.a.c.a.B;

final /* synthetic */ class t implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private static final t f3770a = new t();

    private t() {
    }

    public static B.a a() {
        return f3770a;
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
