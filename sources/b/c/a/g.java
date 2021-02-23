package b.c.a;

import a.a.a.a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

class g extends a.C0000a {

    /* renamed from: a  reason: collision with root package name */
    private Handler f2177a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f2178b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f2179c;

    g(h hVar, a aVar) {
        this.f2179c = hVar;
        this.f2178b = aVar;
    }

    public void a(int i, Uri uri, boolean z, Bundle bundle) {
        if (this.f2178b != null) {
            this.f2177a.post(new f(this, i, uri, z, bundle));
        }
    }

    public void a(String str, Bundle bundle) {
        if (this.f2178b != null) {
            this.f2177a.post(new c(this, str, bundle));
        }
    }

    public void b(int i, Bundle bundle) {
        if (this.f2178b != null) {
            this.f2177a.post(new b(this, i, bundle));
        }
    }

    public void b(String str, Bundle bundle) {
        if (this.f2178b != null) {
            this.f2177a.post(new e(this, str, bundle));
        }
    }

    public void g(Bundle bundle) {
        if (this.f2178b != null) {
            this.f2177a.post(new d(this, bundle));
        }
    }
}
