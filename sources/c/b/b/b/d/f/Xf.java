package c.b.b.b.d.f;

import android.os.Bundle;
import c.b.b.b.d.f.Vf;

final class Xf extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f4335e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4336f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Bundle f4337g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Vf f4338h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Xf(Vf vf, String str, String str2, Bundle bundle) {
        super(vf);
        this.f4338h = vf;
        this.f4335e = str;
        this.f4336f = str2;
        this.f4337g = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f4338h.p.clearConditionalUserProperty(this.f4335e, this.f4336f, this.f4337g);
    }
}
