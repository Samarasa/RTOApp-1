package b.c.a;

import a.a.a.a;
import a.a.a.b;
import android.content.ComponentName;
import android.os.IBinder;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2190a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final b f2191b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2192c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f2193d;

    l(b bVar, a aVar, ComponentName componentName) {
        this.f2191b = bVar;
        this.f2192c = aVar;
        this.f2193d = componentName;
    }

    /* access modifiers changed from: package-private */
    public IBinder a() {
        return this.f2192c.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName b() {
        return this.f2193d;
    }
}
