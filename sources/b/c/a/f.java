package b.c.a;

import android.net.Uri;
import android.os.Bundle;

class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f2172a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Uri f2173b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f2174c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Bundle f2175d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g f2176e;

    f(g gVar, int i, Uri uri, boolean z, Bundle bundle) {
        this.f2176e = gVar;
        this.f2172a = i;
        this.f2173b = uri;
        this.f2174c = z;
        this.f2175d = bundle;
    }

    public void run() {
        this.f2176e.f2178b.a(this.f2172a, this.f2173b, this.f2174c, this.f2175d);
        throw null;
    }
}
