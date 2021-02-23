package b.h.g;

import android.os.Handler;
import android.os.Message;

class g implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f2446a;

    g(k kVar) {
        this.f2446a = kVar;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f2446a.a();
            return true;
        } else if (i != 1) {
            return true;
        } else {
            this.f2446a.a((Runnable) message.obj);
            return true;
        }
    }
}
