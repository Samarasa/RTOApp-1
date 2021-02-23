package androidx.room;

import android.os.RemoteCallbackList;

class p extends RemoteCallbackList<c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MultiInstanceInvalidationService f1581a;

    p(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1581a = multiInstanceInvalidationService;
    }

    /* renamed from: a */
    public void onCallbackDied(c cVar, Object obj) {
        this.f1581a.f1507b.d(((Integer) obj).intValue());
    }
}
