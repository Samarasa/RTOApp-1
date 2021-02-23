package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.B;

final /* synthetic */ class m implements B.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f3762a;

    private m(long j) {
        this.f3762a = j;
    }

    public static B.a a(long j) {
        return new m(j);
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f3762a)}));
    }
}
