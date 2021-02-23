package g.a.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f14966a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f14967b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f14966a = method;
    }

    public e(IOException iOException) {
        super(iOException);
        this.f14967b = iOException;
    }

    private void a(IOException iOException, IOException iOException2) {
        Method method = f14966a;
        if (method != null) {
            try {
                method.invoke(iOException, new Object[]{iOException2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public IOException a() {
        return this.f14967b;
    }

    public void a(IOException iOException) {
        a(iOException, this.f14967b);
        this.f14967b = iOException;
    }
}
