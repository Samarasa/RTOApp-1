package b.c.a;

import android.os.Bundle;

class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f2164a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Bundle f2165b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f2166c;

    c(g gVar, String str, Bundle bundle) {
        this.f2166c = gVar;
        this.f2164a = str;
        this.f2165b = bundle;
    }

    public void run() {
        this.f2166c.f2178b.a(this.f2164a, this.f2165b);
        throw null;
    }
}
