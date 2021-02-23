package c.b.b.b.d.f;

import android.app.Activity;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.d  reason: case insensitive filesystem */
final class C0311d extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4394e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4395f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4396g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Vf f4397h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0311d(Vf vf, Activity activity, String str, String str2) {
        super(vf);
        this.f4397h = vf;
        this.f4394e = activity;
        this.f4395f = str;
        this.f4396g = str2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f4397h.p.setCurrentScreen(b.a(this.f4394e), this.f4395f, this.f4396g, this.f4320a);
    }
}
