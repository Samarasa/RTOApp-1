package util;

import android.util.Log;
import com.google.android.gms.ads.e.a;
import com.google.android.gms.ads.e.b;
import java.util.Map;

class c implements com.google.android.gms.ads.e.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MyApplication f15649a;

    c(MyApplication myApplication) {
        this.f15649a = myApplication;
    }

    public void onInitializationComplete(b bVar) {
        Map<String, a> a2 = bVar.a();
        for (String next : a2.keySet()) {
            a aVar = a2.get(next);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", new Object[]{next, aVar.Q(), Integer.valueOf(aVar.R())}));
        }
    }
}
