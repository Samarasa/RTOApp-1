package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import androidx.room.d;
import b.e.j;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    int f1506a = 0;

    /* renamed from: b  reason: collision with root package name */
    final j<String> f1507b = new j<>();

    /* renamed from: c  reason: collision with root package name */
    final RemoteCallbackList<c> f1508c = new p(this);

    /* renamed from: d  reason: collision with root package name */
    private final d.a f1509d = new q(this);

    public IBinder onBind(Intent intent) {
        return this.f1509d;
    }
}
