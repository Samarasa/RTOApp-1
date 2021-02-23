package c.b.b.b.d.f;

import android.app.Activity;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.x  reason: case insensitive filesystem */
final class C0449x extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4627e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Vf.b f4628f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0449x(Vf.b bVar, Activity activity) {
        super(Vf.this);
        this.f4628f = bVar;
        this.f4627e = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Vf.this.p.onActivityStopped(b.a(this.f4627e), this.f4321b);
    }
}
