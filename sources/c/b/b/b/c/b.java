package c.b.b.b.c;

import android.os.IBinder;
import c.b.b.b.c.a;
import java.lang.reflect.Field;

public final class b<T> extends a.C0060a {

    /* renamed from: a  reason: collision with root package name */
    private final T f3914a;

    private b(T t) {
        this.f3914a = t;
    }

    public static <T> T Q(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f3914a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("Binder object is null.", e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }

    public static <T> a a(T t) {
        return new b(t);
    }
}
