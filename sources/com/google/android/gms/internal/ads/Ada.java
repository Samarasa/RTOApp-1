package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class Ada extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f6141a;

    public Ada(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f6141a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Ada.class) {
            if (this == obj) {
                return true;
            }
            Ada ada = (Ada) obj;
            return this.f6141a == ada.f6141a && get() == ada.get();
        }
    }

    public final int hashCode() {
        return this.f6141a;
    }
}
