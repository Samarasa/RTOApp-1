package c.b.b.b.d.f;

import android.app.Activity;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.z  reason: case insensitive filesystem */
final class C0462z extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4649e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Vf.b f4650f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0462z(Vf.b bVar, Activity activity) {
        super(Vf.this);
        this.f4650f = bVar;
        this.f4649e = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Vf.this.p.onActivityDestroyed(b.a(this.f4649e), this.f4321b);
    }
}
