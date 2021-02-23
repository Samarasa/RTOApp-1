package c.a.a.c.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.a.a.i.k;

class I {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3021a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3022b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((F) message.obj).a();
            return true;
        }
    }

    I() {
    }

    /* access modifiers changed from: package-private */
    public void a(F<?> f2) {
        k.a();
        if (this.f3021a) {
            this.f3022b.obtainMessage(1, f2).sendToTarget();
            return;
        }
        this.f3021a = true;
        f2.a();
        this.f3021a = false;
    }
}
