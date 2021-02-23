package c.a.a.d;

import android.content.Context;
import android.util.Log;
import b.h.a.a;
import c.a.a.d.c;

public class g implements d {
    public c a(Context context, c.a aVar) {
        boolean z = a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new f(context, aVar) : new k();
    }
}
