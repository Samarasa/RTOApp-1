package b.c.a;

import a.a.a.b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public abstract class k implements ServiceConnection {
    public abstract void a(ComponentName componentName, h hVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(componentName, new j(this, b.a.a(iBinder), componentName));
    }
}
