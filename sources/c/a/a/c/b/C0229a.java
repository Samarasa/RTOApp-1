package c.a.a.c.b;

import android.os.Handler;
import android.os.Message;
import c.a.a.c.b.C0231c;

/* renamed from: c.a.a.c.b.a  reason: case insensitive filesystem */
class C0229a implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0231c f3030a;

    C0229a(C0231c cVar) {
        this.f3030a = cVar;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.f3030a.a((C0231c.b) message.obj);
        return true;
    }
}
