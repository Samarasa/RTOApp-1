package c.b.b.b.d.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class d extends Handler {
    public d(Looper looper) {
        super(looper);
    }

    public d(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
