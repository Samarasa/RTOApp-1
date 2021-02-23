package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 implements d {

    /* renamed from: a  reason: collision with root package name */
    final Object f44a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f45b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f46c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f47d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f48a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f48a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f44a) {
                    mediaControllerCompat$MediaControllerImplApi21.f47d.a(b.a.a(j.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f47d.a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    private static class a extends c.C0006c {
        a(c cVar) {
            super(cVar);
        }

        public void P() {
            throw new AssertionError();
        }

        public void a(Bundle bundle) {
            throw new AssertionError();
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        public void a(CharSequence charSequence) {
            throw new AssertionError();
        }

        public void a(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f47d.a() != null) {
            for (c next : this.f45b) {
                a aVar = new a(next);
                this.f46c.put(next, aVar);
                next.f77c = aVar;
                try {
                    this.f47d.a().a(aVar);
                    next.a(13, (Object) null, (Bundle) null);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.f45b.clear();
        }
    }
}
