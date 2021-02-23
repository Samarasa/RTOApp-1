package c.a.a.c.a.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import c.a.a.c.a.d;
import c.a.a.c.a.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f2949a;

    /* renamed from: b  reason: collision with root package name */
    private final e f2950b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f2951c;

    static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f2952a = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        private final ContentResolver f2953b;

        a(ContentResolver contentResolver) {
            this.f2953b = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f2953b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f2952a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f2954a = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        private final ContentResolver f2955b;

        b(ContentResolver contentResolver) {
            this.f2955b = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f2955b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f2954a, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    c(Uri uri, e eVar) {
        this.f2949a = uri;
        this.f2950b = eVar;
    }

    public static c a(Context context, Uri uri) {
        return a(context, uri, new a(context.getContentResolver()));
    }

    private static c a(Context context, Uri uri, d dVar) {
        return new c(uri, new e(c.a.a.c.a(context).g().a(), dVar, c.a.a.c.a(context).b(), context.getContentResolver()));
    }

    public static c b(Context context, Uri uri) {
        return a(context, uri, new b(context.getContentResolver()));
    }

    private InputStream d() {
        InputStream b2 = this.f2950b.b(this.f2949a);
        int a2 = b2 != null ? this.f2950b.a(this.f2949a) : -1;
        return a2 != -1 ? new h(b2, a2) : b2;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void a(c.a.a.h hVar, d.a<? super InputStream> aVar) {
        try {
            this.f2951c = d();
            aVar.a(this.f2951c);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.a((Exception) e2);
        }
    }

    public void b() {
        InputStream inputStream = this.f2951c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public c.a.a.c.a c() {
        return c.a.a.c.a.LOCAL;
    }

    public void cancel() {
    }
}
