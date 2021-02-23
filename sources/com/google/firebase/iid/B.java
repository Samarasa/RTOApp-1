package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class B extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final E f14491a;

    public B(E e2) {
        this.f14491a = e2;
    }

    /* access modifiers changed from: package-private */
    public final void a(G g2) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            this.f14491a.a(g2.f14515a).a(C3315b.a(), new A(g2));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
