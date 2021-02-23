package c.b.b.b.d.f;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.b.b.b.d.f.fe  reason: case insensitive filesystem */
public final class C0330fe extends Pf {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<Bundle> f4429a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f4430b;

    public static <T> T a(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e2);
            throw e2;
        }
    }

    public final String b(long j) {
        return (String) a(c(j), String.class);
    }

    public final Bundle c(long j) {
        Bundle bundle;
        synchronized (this.f4429a) {
            if (!this.f4430b) {
                try {
                    this.f4429a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f4429a.get();
        }
        return bundle;
    }

    public final void c(Bundle bundle) {
        synchronized (this.f4429a) {
            try {
                this.f4429a.set(bundle);
                this.f4430b = true;
                this.f4429a.notify();
            } catch (Throwable th) {
                this.f4429a.notify();
                throw th;
            }
        }
    }
}
