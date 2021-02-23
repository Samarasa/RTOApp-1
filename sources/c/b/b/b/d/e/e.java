package c.b.b.b.d.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class e extends Handler {
    public e(Looper looper) {
        super(looper);
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
