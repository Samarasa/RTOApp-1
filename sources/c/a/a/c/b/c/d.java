package c.a.a.c.b.c;

import android.util.Log;
import c.a.a.c.b.c.b;

class d implements b.C0047b {
    d() {
    }

    public void a(Throwable th) {
        if (th != null && Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        }
    }
}
