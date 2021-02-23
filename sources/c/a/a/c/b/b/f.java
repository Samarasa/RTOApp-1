package c.a.a.c.b.b;

import android.content.Context;
import c.a.a.c.b.b.d;
import java.io.File;

class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f3086a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f3087b;

    f(Context context, String str) {
        this.f3086a = context;
        this.f3087b = str;
    }

    public File a() {
        File cacheDir = this.f3086a.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = this.f3087b;
        return str != null ? new File(cacheDir, str) : cacheDir;
    }
}
