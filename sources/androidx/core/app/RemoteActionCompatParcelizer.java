package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.b;
import androidx.versionedparcelable.d;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f844a = (IconCompat) bVar.a(remoteActionCompat.f844a, 1);
        remoteActionCompat.f845b = bVar.a(remoteActionCompat.f845b, 2);
        remoteActionCompat.f846c = bVar.a(remoteActionCompat.f846c, 3);
        remoteActionCompat.f847d = (PendingIntent) bVar.a(remoteActionCompat.f847d, 4);
        remoteActionCompat.f848e = bVar.a(remoteActionCompat.f848e, 5);
        remoteActionCompat.f849f = bVar.a(remoteActionCompat.f849f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.a(false, false);
        bVar.b((d) remoteActionCompat.f844a, 1);
        bVar.b(remoteActionCompat.f845b, 2);
        bVar.b(remoteActionCompat.f846c, 3);
        bVar.b((Parcelable) remoteActionCompat.f847d, 4);
        bVar.b(remoteActionCompat.f848e, 5);
        bVar.b(remoteActionCompat.f849f, 6);
    }
}
