package c.a.a.c.a.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import c.a.a.c.b.a.b;
import c.a.a.c.f;
import c.a.a.c.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class e {

    /* renamed from: a  reason: collision with root package name */
    private static final a f2956a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final a f2957b;

    /* renamed from: c  reason: collision with root package name */
    private final d f2958c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2959d;

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f2960e;

    /* renamed from: f  reason: collision with root package name */
    private final List<f> f2961f;

    e(List<f> list, a aVar, d dVar, b bVar, ContentResolver contentResolver) {
        this.f2957b = aVar;
        this.f2958c = dVar;
        this.f2959d = bVar;
        this.f2960e = contentResolver;
        this.f2961f = list;
    }

    e(List<f> list, d dVar, b bVar, ContentResolver contentResolver) {
        this(list, f2956a, dVar, bVar, contentResolver);
    }

    private boolean a(File file) {
        return this.f2957b.a(file) && 0 < this.f2957b.b(file);
    }

    private String c(Uri uri) {
        Cursor a2 = this.f2958c.a(uri);
        if (a2 != null) {
            try {
                if (a2.moveToFirst()) {
                    return a2.getString(0);
                }
            } finally {
                if (a2 != null) {
                    a2.close();
                }
            }
        }
        if (a2 != null) {
            a2.close();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f2960e.openInputStream(uri);
            int a2 = g.a(this.f2961f, openInputStream, this.f2959d);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return a2;
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e2);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public InputStream b(Uri uri) {
        String c2 = c(uri);
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        File a2 = this.f2957b.a(c2);
        if (!a(a2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a2);
        try {
            return this.f2960e.openInputStream(fromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e2));
        }
    }
}
