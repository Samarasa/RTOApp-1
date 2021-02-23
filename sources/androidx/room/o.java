package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.room.g;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class o {

    /* renamed from: a  reason: collision with root package name */
    Context f1573a;

    /* renamed from: b  reason: collision with root package name */
    final String f1574b;

    /* renamed from: c  reason: collision with root package name */
    int f1575c;

    /* renamed from: d  reason: collision with root package name */
    final g f1576d;

    /* renamed from: e  reason: collision with root package name */
    final g.b f1577e;

    /* renamed from: f  reason: collision with root package name */
    d f1578f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f1579g;

    /* renamed from: h  reason: collision with root package name */
    final c f1580h = new i(this);
    final AtomicBoolean i = new AtomicBoolean(false);
    final ServiceConnection j = new j(this);
    final Runnable k = new k(this);
    final Runnable l = new l(this);
    private final Runnable m = new m(this);

    o(Context context, String str, g gVar, Executor executor) {
        this.f1573a = context.getApplicationContext();
        this.f1574b = str;
        this.f1576d = gVar;
        this.f1579g = executor;
        this.f1577e = new n(this, gVar.f1549c);
        this.f1573a.bindService(new Intent(this.f1573a, MultiInstanceInvalidationService.class), this.j, 1);
    }
}
