package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.f;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    final Object f75a;

    /* renamed from: b  reason: collision with root package name */
    a f76b;

    /* renamed from: c  reason: collision with root package name */
    a f77c;

    private class a extends Handler {
    }

    private static class b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78a;

        b(c cVar) {
            this.f78a = new WeakReference<>(cVar);
        }

        public void P() {
            c cVar = (c) this.f78a.get();
            if (cVar != null) {
                cVar.a();
            }
        }

        public void a(int i, int i2, int i3, int i4, int i5) {
            c cVar = (c) this.f78a.get();
            if (cVar != null) {
                cVar.a(new e(i, i2, i3, i4, i5));
            }
        }

        public void a(Bundle bundle) {
            c cVar = (c) this.f78a.get();
            if (cVar != null) {
                cVar.a(bundle);
            }
        }

        public void a(CharSequence charSequence) {
            c cVar = (c) this.f78a.get();
            if (cVar != null) {
                cVar.a(charSequence);
            }
        }

        public void a(Object obj) {
            c cVar = (c) this.f78a.get();
            if (cVar != null) {
                cVar.a(MediaMetadataCompat.a(obj));
            }
        }

        public void a(String str, Bundle bundle) {
            c cVar = (c) this.f78a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f77c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.a(str, bundle);
            }
        }

        public void a(List<?> list) {
            c cVar = (c) this.f78a.get();
            if (cVar != null) {
                cVar.a(MediaSessionCompat.QueueItem.a(list));
            }
        }

        public void b(Object obj) {
            c cVar = (c) this.f78a.get();
            if (cVar != null && cVar.f77c == null) {
                cVar.a(PlaybackStateCompat.a(obj));
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    private static class C0006c extends a.C0004a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f79a;

        C0006c(c cVar) {
            this.f79a = new WeakReference<>(cVar);
        }

        public void P() {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(8, (Object) null, (Bundle) null);
            }
        }

        public void a(Bundle bundle) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(7, bundle, (Bundle) null);
            }
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(4, parcelableVolumeInfo != null ? new e(parcelableVolumeInfo.f56a, parcelableVolumeInfo.f57b, parcelableVolumeInfo.f58c, parcelableVolumeInfo.f59d, parcelableVolumeInfo.f60e) : null, (Bundle) null);
            }
        }

        public void a(PlaybackStateCompat playbackStateCompat) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(2, playbackStateCompat, (Bundle) null);
            }
        }

        public void a(CharSequence charSequence) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(6, charSequence, (Bundle) null);
            }
        }

        public void a(List<MediaSessionCompat.QueueItem> list) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(5, list, (Bundle) null);
            }
        }

        public void c(int i) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        public void c(String str, Bundle bundle) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(1, str, bundle);
            }
        }

        public void c(boolean z) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        public void d(boolean z) {
        }

        public void e(int i) {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        public void la() {
            c cVar = (c) this.f79a.get();
            if (cVar != null) {
                cVar.a(13, (Object) null, (Bundle) null);
            }
        }
    }

    public c() {
        C0006c cVar;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar = f.a(new b(this));
        } else {
            C0006c cVar2 = new C0006c(this);
            this.f77c = cVar2;
            cVar = cVar2;
        }
        this.f75a = cVar;
    }

    public void a() {
    }

    /* access modifiers changed from: package-private */
    public void a(int i, Object obj, Bundle bundle) {
        a aVar = this.f76b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public void a(Bundle bundle) {
    }

    public void a(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void a(PlaybackStateCompat playbackStateCompat) {
    }

    public void a(e eVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void a(String str, Bundle bundle) {
    }

    public void a(List<MediaSessionCompat.QueueItem> list) {
    }

    public void binderDied() {
        a(8, (Object) null, (Bundle) null);
    }
}
