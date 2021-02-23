package c.a.a.c.c;

import android.net.Uri;
import c.a.a.c.c.u;
import c.a.a.c.k;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class E<Data> implements u<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f3264a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: b  reason: collision with root package name */
    private final u<l, Data> f3265b;

    public static class a implements v<Uri, InputStream> {
        public u<Uri, InputStream> a(y yVar) {
            return new E(yVar.a(l.class, InputStream.class));
        }
    }

    public E(u<l, Data> uVar) {
        this.f3265b = uVar;
    }

    public u.a<Data> a(Uri uri, int i, int i2, k kVar) {
        return this.f3265b.a(new l(uri.toString()), i, i2, kVar);
    }

    public boolean a(Uri uri) {
        return f3264a.contains(uri.getScheme());
    }
}
