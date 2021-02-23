package c.a.a.c.c;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.a.a.c.a.d;
import c.a.a.c.a.i;
import c.a.a.c.a.n;
import c.a.a.c.c.u;
import c.a.a.c.k;
import java.io.InputStream;

/* renamed from: c.a.a.c.c.a  reason: case insensitive filesystem */
public class C0239a<Data> implements u<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    private static final int f3266a = 22;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f3267b;

    /* renamed from: c  reason: collision with root package name */
    private final C0048a<Data> f3268c;

    /* renamed from: c.a.a.c.c.a$a  reason: collision with other inner class name */
    public interface C0048a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    /* renamed from: c.a.a.c.c.a$b */
    public static class b implements v<Uri, ParcelFileDescriptor>, C0048a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f3272a;

        public b(AssetManager assetManager) {
            this.f3272a = assetManager;
        }

        public d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new i(assetManager, str);
        }

        public u<Uri, ParcelFileDescriptor> a(y yVar) {
            return new C0239a(this.f3272a, this);
        }
    }

    /* renamed from: c.a.a.c.c.a$c */
    public static class c implements v<Uri, InputStream>, C0048a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f3275a;

        public c(AssetManager assetManager) {
            this.f3275a = assetManager;
        }

        public d<InputStream> a(AssetManager assetManager, String str) {
            return new n(assetManager, str);
        }

        public u<Uri, InputStream> a(y yVar) {
            return new C0239a(this.f3275a, this);
        }
    }

    public C0239a(AssetManager assetManager, C0048a<Data> aVar) {
        this.f3267b = assetManager;
        this.f3268c = aVar;
    }

    public u.a<Data> a(Uri uri, int i, int i2, k kVar) {
        return new u.a<>(new c.a.a.h.c(uri), this.f3268c.a(this.f3267b, uri.toString().substring(f3266a)));
    }

    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
