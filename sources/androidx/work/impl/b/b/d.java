package androidx.work.impl.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.h;
import androidx.work.impl.utils.b.a;

public abstract class d<T> extends f<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final String f1764g = h.a("BrdcstRcvrCnstrntTrckr");

    /* renamed from: h  reason: collision with root package name */
    private final BroadcastReceiver f1765h = new c(this);

    public d(Context context, a aVar) {
        super(context, aVar);
    }

    public abstract void a(Context context, Intent intent);

    public void b() {
        h.a().a(f1764g, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f1770c.registerReceiver(this.f1765h, d());
    }

    public void c() {
        h.a().a(f1764g, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f1770c.unregisterReceiver(this.f1765h);
    }

    public abstract IntentFilter d();
}
