package b.c.a;

import android.os.Bundle;

class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f2169a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Bundle f2170b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f2171c;

    e(g gVar, String str, Bundle bundle) {
        this.f2171c = gVar;
        this.f2169a = str;
        this.f2170b = bundle;
    }

    public void run() {
        this.f2171c.f2178b.b(this.f2169a, this.f2170b);
        throw null;
    }
}
