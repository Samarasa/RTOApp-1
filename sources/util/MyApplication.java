package util;

import android.app.Application;
import com.google.android.gms.ads.p;

public class MyApplication extends Application {

    /* renamed from: a  reason: collision with root package name */
    public static AppOpenManager f15646a;

    public void onCreate() {
        super.onCreate();
        p.a(this, new c(this));
        f15646a = new AppOpenManager(this);
    }
}
