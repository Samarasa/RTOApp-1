package c.a.a.d;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import c.a.a.d.c;
import c.a.a.i.i;

final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3513a;

    /* renamed from: b  reason: collision with root package name */
    final c.a f3514b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3515c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3516d;

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f3517e = new e(this);

    f(Context context, c.a aVar) {
        this.f3513a = context.getApplicationContext();
        this.f3514b = aVar;
    }

    private void a() {
        if (!this.f3516d) {
            this.f3515c = a(this.f3513a);
            try {
                this.f3513a.registerReceiver(this.f3517e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f3516d = true;
            } catch (SecurityException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e2);
                }
            }
        }
    }

    private void b() {
        if (this.f3516d) {
            this.f3513a.unregisterReceiver(this.f3517e);
            this.f3516d = false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        i.a(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    public void m() {
        a();
    }

    public void n() {
        b();
    }

    public void onDestroy() {
    }
}
