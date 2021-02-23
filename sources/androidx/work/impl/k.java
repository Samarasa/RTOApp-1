package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.utils.g;
import b.p.a.b;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static androidx.room.a.a f1924a = new h(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static androidx.room.a.a f1925b = new i(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static androidx.room.a.a f1926c = new j(4, 5);

    public static class a extends androidx.room.a.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f1927c;

        public a(Context context, int i, int i2) {
            super(i, i2);
            this.f1927c = context;
        }

        public void a(b bVar) {
            new g(this.f1927c).a(true);
        }
    }
}
