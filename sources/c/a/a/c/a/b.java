package c.a.a.c.a;

import android.content.res.AssetManager;
import android.util.Log;
import c.a.a.c.a;
import c.a.a.c.a.d;
import c.a.a.h;
import java.io.IOException;

public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2962a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f2963b;

    /* renamed from: c  reason: collision with root package name */
    private T f2964c;

    public b(AssetManager assetManager, String str) {
        this.f2963b = assetManager;
        this.f2962a = str;
    }

    /* access modifiers changed from: protected */
    public abstract T a(AssetManager assetManager, String str);

    public void a(h hVar, d.a<? super T> aVar) {
        try {
            this.f2964c = a(this.f2963b, this.f2962a);
            aVar.a(this.f2964c);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.a((Exception) e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public void b() {
        T t = this.f2964c;
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
