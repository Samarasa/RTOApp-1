package androidx.core.app;

import android.util.Log;

class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f861a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f862b;

    g(Object obj, Object obj2) {
        this.f861a = obj;
        this.f862b = obj2;
    }

    public void run() {
        try {
            if (h.f866d != null) {
                h.f866d.invoke(this.f861a, new Object[]{this.f862b, false, "AppCompat recreation"});
                return;
            }
            h.f867e.invoke(this.f861a, new Object[]{this.f862b, false});
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
