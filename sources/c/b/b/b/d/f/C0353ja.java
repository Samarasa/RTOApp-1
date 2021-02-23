package c.b.b.b.d.f;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: c.b.b.b.d.f.ja  reason: case insensitive filesystem */
final class C0353ja extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0340ha f4483a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0353ja(C0340ha haVar, Handler handler) {
        super((Handler) null);
        this.f4483a = haVar;
    }

    public final void onChange(boolean z) {
        this.f4483a.b();
    }
}
