package c.b.e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.b.e.h  reason: case insensitive filesystem */
public class C0483h {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f5022a = b();

    /* renamed from: b  reason: collision with root package name */
    static final C0483h f5023b = new C0483h(true);

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, Object<?, ?>> f5024c;

    C0483h() {
        this.f5024c = new HashMap();
    }

    C0483h(boolean z) {
        this.f5024c = Collections.emptyMap();
    }

    public static C0483h a() {
        return C0482g.a();
    }

    static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
