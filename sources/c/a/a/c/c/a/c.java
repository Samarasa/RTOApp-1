package c.a.a.c.c.a;

import android.content.Context;
import android.net.Uri;
import c.a.a.c.a.a.b;
import c.a.a.c.c.u;
import c.a.a.c.c.v;
import c.a.a.c.c.y;
import c.a.a.c.k;
import java.io.InputStream;

public class c implements u<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3276a;

    public static class a implements v<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3277a;

        public a(Context context) {
            this.f3277a = context;
        }

        public u<Uri, InputStream> a(y yVar) {
            return new c(this.f3277a);
        }
    }

    public c(Context context) {
        this.f3276a = context.getApplicationContext();
    }

    public u.a<InputStream> a(Uri uri, int i, int i2, k kVar) {
        if (b.a(i, i2)) {
            return new u.a<>(new c.a.a.h.c(uri), c.a.a.c.a.a.c.a(this.f3276a, uri));
        }
        return null;
    }

    public boolean a(Uri uri) {
        return b.a(uri);
    }
}
