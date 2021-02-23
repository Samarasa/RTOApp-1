package c.a.a.c.c;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.a.a.c.a.j;
import c.a.a.c.a.o;
import c.a.a.c.c.u;
import c.a.a.c.k;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class D<Data> implements u<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f3259a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: b  reason: collision with root package name */
    private final c<Data> f3260b;

    public static final class a implements v<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f3261a;

        public a(ContentResolver contentResolver) {
            this.f3261a = contentResolver;
        }

        public c.a.a.c.a.d<AssetFileDescriptor> a(Uri uri) {
            return new c.a.a.c.a.a(this.f3261a, uri);
        }

        public u<Uri, AssetFileDescriptor> a(y yVar) {
            return new D(this);
        }
    }

    public static class b implements v<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f3262a;

        public b(ContentResolver contentResolver) {
            this.f3262a = contentResolver;
        }

        public c.a.a.c.a.d<ParcelFileDescriptor> a(Uri uri) {
            return new j(this.f3262a, uri);
        }

        public u<Uri, ParcelFileDescriptor> a(y yVar) {
            return new D(this);
        }
    }

    public interface c<Data> {
        c.a.a.c.a.d<Data> a(Uri uri);
    }

    public static class d implements v<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f3263a;

        public d(ContentResolver contentResolver) {
            this.f3263a = contentResolver;
        }

        public c.a.a.c.a.d<InputStream> a(Uri uri) {
            return new o(this.f3263a, uri);
        }

        public u<Uri, InputStream> a(y yVar) {
            return new D(this);
        }
    }

    public D(c<Data> cVar) {
        this.f3260b = cVar;
    }

    public u.a<Data> a(Uri uri, int i, int i2, k kVar) {
        return new u.a<>(new c.a.a.h.c(uri), this.f3260b.a(uri));
    }

    public boolean a(Uri uri) {
        return f3259a.contains(uri.getScheme());
    }
}
