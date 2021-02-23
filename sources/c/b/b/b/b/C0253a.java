package c.b.b.b.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C0563t;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: c.b.b.b.b.a  reason: case insensitive filesystem */
public class C0253a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3856a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<IBinder> f3857b = new LinkedBlockingQueue();

    public IBinder a(long j, TimeUnit timeUnit) {
        C0563t.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f3856a) {
            this.f3856a = true;
            IBinder poll = this.f3857b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3857b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
