package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import c.b.b.b.d.c.h;
import com.google.android.gms.common.internal.C0554j;
import com.google.android.gms.common.stats.a;
import java.util.HashMap;

final class H extends C0554j {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<C0554j.a, J> f5901d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f5902e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Handler f5903f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final a f5904g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5905h;
    /* access modifiers changed from: private */
    public final long i;

    H(Context context) {
        this.f5902e = context.getApplicationContext();
        this.f5903f = new h(context.getMainLooper(), new I(this));
        this.f5904g = a.a();
        this.f5905h = 5000;
        this.i = 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean a(C0554j.a aVar, ServiceConnection serviceConnection, String str) {
        boolean a2;
        C0563t.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f5901d) {
            J j = this.f5901d.get(aVar);
            if (j == null) {
                j = new J(this, aVar);
                j.a(serviceConnection, serviceConnection, str);
                j.a(str);
                this.f5901d.put(aVar, j);
            } else {
                this.f5903f.removeMessages(0, aVar);
                if (!j.a(serviceConnection)) {
                    j.a(serviceConnection, serviceConnection, str);
                    int b2 = j.b();
                    if (b2 == 1) {
                        serviceConnection.onServiceConnected(j.e(), j.d());
                    } else if (b2 == 2) {
                        j.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            a2 = j.a();
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final void b(C0554j.a aVar, ServiceConnection serviceConnection, String str) {
        C0563t.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f5901d) {
            J j = this.f5901d.get(aVar);
            if (j == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (j.a(serviceConnection)) {
                j.a(serviceConnection, str);
                if (j.c()) {
                    this.f5903f.sendMessageDelayed(this.f5903f.obtainMessage(0, aVar), this.f5905h);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
