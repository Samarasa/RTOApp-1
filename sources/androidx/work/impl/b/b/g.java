package androidx.work.impl.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.h;

public class g extends f<androidx.work.impl.b.b> {

    /* renamed from: g  reason: collision with root package name */
    static final String f1774g = h.a("NetworkStateTracker");

    /* renamed from: h  reason: collision with root package name */
    private final ConnectivityManager f1775h = ((ConnectivityManager) this.f1770c.getSystemService("connectivity"));
    private b i;
    private a j;

    private class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                h.a().a(g.f1774g, "Network broadcast received", new Throwable[0]);
                g gVar = g.this;
                gVar.a(gVar.d());
            }
        }
    }

    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h.a().a(g.f1774g, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            g gVar = g.this;
            gVar.a(gVar.d());
        }

        public void onLost(Network network) {
            h.a().a(g.f1774g, "Network connection lost", new Throwable[0]);
            g gVar = g.this;
            gVar.a(gVar.d());
        }
    }

    public g(Context context, androidx.work.impl.utils.b.a aVar) {
        super(context, aVar);
        if (f()) {
            this.i = new b();
        } else {
            this.j = new a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.f1775h.getNetworkCapabilities(r3.f1775h.getActiveNetwork());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            android.net.ConnectivityManager r0 = r3.f1775h
            android.net.Network r0 = r0.getActiveNetwork()
            android.net.ConnectivityManager r2 = r3.f1775h
            android.net.NetworkCapabilities r0 = r2.getNetworkCapabilities(r0)
            if (r0 == 0) goto L_0x001f
            r2 = 16
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L_0x001f
            r1 = 1
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.b.b.g.e():boolean");
    }

    private static boolean f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public androidx.work.impl.b.b a() {
        return d();
    }

    public void b() {
        if (f()) {
            h.a().a(f1774g, "Registering network callback", new Throwable[0]);
            this.f1775h.registerDefaultNetworkCallback(this.i);
            return;
        }
        h.a().a(f1774g, "Registering broadcast receiver", new Throwable[0]);
        this.f1770c.registerReceiver(this.j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void c() {
        if (f()) {
            try {
                h.a().a(f1774g, "Unregistering network callback", new Throwable[0]);
                this.f1775h.unregisterNetworkCallback(this.i);
            } catch (IllegalArgumentException e2) {
                h.a().b(f1774g, "Received exception while unregistering network callback", e2);
            }
        } else {
            h.a().a(f1774g, "Unregistering broadcast receiver", new Throwable[0]);
            this.f1770c.unregisterReceiver(this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.b.b d() {
        NetworkInfo activeNetworkInfo = this.f1775h.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean e2 = e();
        boolean a2 = b.h.e.a.a(this.f1775h);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new androidx.work.impl.b.b(z2, e2, a2, z);
    }
}
