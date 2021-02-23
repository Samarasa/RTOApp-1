package b.h.g;

import android.os.Handler;
import b.h.g.k;
import java.util.concurrent.Callable;

class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Callable f2449a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Handler f2450b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k.a f2451c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f2452d;

    i(k kVar, Callable callable, Handler handler, k.a aVar) {
        this.f2452d = kVar;
        this.f2449a = callable;
        this.f2450b = handler;
        this.f2451c = aVar;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f2449a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f2450b.post(new h(this, obj));
    }
}
