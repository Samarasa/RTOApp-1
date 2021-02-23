package c.a.a.c.a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import c.a.a.c.a;
import c.a.a.c.a.d;
import c.a.a.h;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class m<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f2986a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f2987b;

    /* renamed from: c  reason: collision with root package name */
    private T f2988c;

    public m(ContentResolver contentResolver, Uri uri) {
        this.f2987b = contentResolver;
        this.f2986a = uri;
    }

    /* access modifiers changed from: protected */
    public abstract T a(Uri uri, ContentResolver contentResolver);

    public final void a(h hVar, d.a<? super T> aVar) {
        try {
            this.f2988c = a(this.f2986a, this.f2987b);
            aVar.a(this.f2988c);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.a((Exception) e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public void b() {
        T t = this.f2988c;
        if (t != null) {
            try {
                a(t);
            } catch (IOException unused) {
            }
        }
    }

    public a c() {
        return a.LOCAL;
    }

    public void cancel() {
    }
}
