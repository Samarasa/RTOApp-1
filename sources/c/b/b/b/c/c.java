package c.b.b.b.c;

import android.content.Context;
import android.os.IBinder;
import c.b.b.b.b.j;
import com.google.android.gms.common.internal.C0563t;

public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f3915a;

    /* renamed from: b  reason: collision with root package name */
    private T f3916b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f3915a = str;
    }

    /* access modifiers changed from: protected */
    public final T a(Context context) {
        if (this.f3916b == null) {
            C0563t.a(context);
            Context b2 = j.b(context);
            if (b2 != null) {
                try {
                    this.f3916b = a((IBinder) b2.getClassLoader().loadClass(this.f3915a).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new a("Could not load creator class.", e2);
                } catch (InstantiationException e3) {
                    throw new a("Could not instantiate creator.", e3);
                } catch (IllegalAccessException e4) {
                    throw new a("Could not access creator.", e4);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.f3916b;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);
}
