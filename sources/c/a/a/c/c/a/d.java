package c.a.a.c.c.a;

import android.content.Context;
import android.net.Uri;
import c.a.a.c.a.a.b;
import c.a.a.c.c.u;
import c.a.a.c.c.v;
import c.a.a.c.c.y;
import c.a.a.c.d.a.A;
import c.a.a.c.k;
import c.a.a.h.c;
import java.io.InputStream;

public class d implements u<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3278a;

    public static class a implements v<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3279a;

        public a(Context context) {
            this.f3279a = context;
        }

        public u<Uri, InputStream> a(y yVar) {
            return new d(this.f3279a);
        }
    }

    public d(Context context) {
        this.f3278a = context.getApplicationContext();
    }

    private boolean a(k kVar) {
        Long l = (Long) kVar.a(A.f3357a);
        return l != null && l.longValue() == -1;
    }

    public u.a<InputStream> a(Uri uri, int i, int i2, k kVar) {
        if (!b.a(i, i2) || !a(kVar)) {
            return null;
        }
        return new u.a<>(new c(uri), c.a.a.c.a.a.c.b(this.f3278a, uri));
    }

    public boolean a(Uri uri) {
        return b.c(uri);
    }
}
