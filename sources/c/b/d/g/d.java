package c.b.d.g;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f4957a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f> f4958b = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f4957a;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f4957a;
                if (dVar == null) {
                    dVar = new d();
                    f4957a = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f4958b) {
            unmodifiableSet = Collections.unmodifiableSet(this.f4958b);
        }
        return unmodifiableSet;
    }
}
