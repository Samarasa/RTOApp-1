package c.b.b.b.d.f;

import android.app.Activity;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.v  reason: case insensitive filesystem */
final class C0435v extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4598e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Vf.b f4599f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0435v(Vf.b bVar, Activity activity) {
        super(Vf.this);
        this.f4599f = bVar;
        this.f4598e = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Vf.this.p.onActivityResumed(b.a(this.f4598e), this.f4321b);
    }
}
