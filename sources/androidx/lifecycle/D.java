package androidx.lifecycle;

import java.util.HashMap;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, B> f1193a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public final B a(String str) {
        return this.f1193a.get(str);
    }

    public final void a() {
        for (B a2 : this.f1193a.values()) {
            a2.a();
        }
        this.f1193a.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, B b2) {
        B put = this.f1193a.put(str, b2);
        if (put != null) {
            put.b();
        }
    }
}
