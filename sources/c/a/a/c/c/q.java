package c.a.a.c.c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import c.a.a.c.a.d;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.h;
import c.a.a.h.c;
import java.io.File;
import java.io.FileNotFoundException;

public final class q implements u<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3315a;

    public static final class a implements v<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3316a;

        public a(Context context) {
            this.f3316a = context;
        }

        public u<Uri, File> a(y yVar) {
            return new q(this.f3316a);
        }
    }

    private static class b implements d<File> {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f3317a = {"_data"};

        /* renamed from: b  reason: collision with root package name */
        private final Context f3318b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f3319c;

        b(Context context, Uri uri) {
            this.f3318b = context;
            this.f3319c = uri;
        }

        public Class<File> a() {
            return File.class;
        }

        public void a(h hVar, d.a<? super File> aVar) {
            Cursor query = this.f3318b.getContentResolver().query(this.f3319c, f3317a, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.a((Exception) new FileNotFoundException("Failed to find file path for: " + this.f3319c));
                return;
            }
            aVar.a(new File(str));
        }

        public void b() {
        }

        public c.a.a.c.a c() {
            return c.a.a.c.a.LOCAL;
        }

        public void cancel() {
        }
    }

    public q(Context context) {
        this.f3315a = context;
    }

    public u.a<File> a(Uri uri, int i, int i2, k kVar) {
        return new u.a<>(new c(uri), new b(this.f3315a, uri));
    }

    public boolean a(Uri uri) {
        return c.a.a.c.a.a.b.b(uri);
    }
}
