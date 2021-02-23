package c.b.b.b.d.f;

import android.app.Activity;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

final class A extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4090e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C0330fe f4091f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Vf.b f4092g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    A(Vf.b bVar, Activity activity, C0330fe feVar) {
        super(Vf.this);
        this.f4092g = bVar;
        this.f4090e = activity;
        this.f4091f = feVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Vf.this.p.onActivitySaveInstanceState(b.a(this.f4090e), this.f4091f, this.f4321b);
    }
}
