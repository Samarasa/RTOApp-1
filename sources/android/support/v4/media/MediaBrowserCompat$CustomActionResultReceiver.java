package android.support.v4.media;

import a.a.b.a.c;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

class MediaBrowserCompat$CustomActionResultReceiver extends c {

    /* renamed from: d  reason: collision with root package name */
    private final String f10d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f11e;

    /* renamed from: f  reason: collision with root package name */
    private final a f12f;

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
        if (this.f12f != null) {
            MediaSessionCompat.a(bundle);
            if (i == -1) {
                this.f12f.a(this.f10d, this.f11e, bundle);
            } else if (i == 0) {
                this.f12f.c(this.f10d, this.f11e, bundle);
            } else if (i != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f11e + ", resultData=" + bundle + ")");
            } else {
                this.f12f.b(this.f10d, this.f11e, bundle);
            }
        }
    }
}
