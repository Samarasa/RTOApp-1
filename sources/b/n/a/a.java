package b.n.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f2637a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(b bVar, Looper looper) {
        super(looper);
        this.f2637a = bVar;
    }

    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else {
            this.f2637a.a();
        }
    }
}
