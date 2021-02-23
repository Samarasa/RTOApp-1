package c.a.a.c.c.a;

import android.net.Uri;
import c.a.a.c.c.l;
import c.a.a.c.c.u;
import c.a.a.c.c.v;
import c.a.a.c.c.y;
import c.a.a.c.k;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class b implements u<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f3273a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: b  reason: collision with root package name */
    private final u<l, InputStream> f3274b;

    public static class a implements v<Uri, InputStream> {
        public u<Uri, InputStream> a(y yVar) {
            return new b(yVar.a(l.class, InputStream.class));
        }
    }

    public b(u<l, InputStream> uVar) {
        this.f3274b = uVar;
    }

    public u.a<InputStream> a(Uri uri, int i, int i2, k kVar) {
        return this.f3274b.a(new l(uri.toString()), i, i2, kVar);
    }

    public boolean a(Uri uri) {
        return f3273a.contains(uri.getScheme());
    }
}
