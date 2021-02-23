package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class BB {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6244a;

    /* renamed from: b  reason: collision with root package name */
    private final C0894Mq f6245b;

    /* renamed from: c  reason: collision with root package name */
    private final C3037yx f6246c;

    BB(Executor executor, C0894Mq mq, C3037yx yxVar) {
        this.f6244a = executor;
        this.f6246c = yxVar;
        this.f6245b = mq;
    }

    public final void a(C2313on onVar) {
        if (onVar != null) {
            this.f6246c.a(onVar.getView());
            this.f6246c.a(new AB(onVar), this.f6244a);
            this.f6246c.a(new DB(onVar), this.f6244a);
            this.f6246c.a(this.f6245b, this.f6244a);
            this.f6245b.a(onVar);
            onVar.b("/trackActiveViewUnit", new CB(this));
            onVar.b("/untrackActiveViewUnit", new FB(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C2313on onVar, Map map) {
        this.f6245b.H();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(C2313on onVar, Map map) {
        this.f6245b.I();
    }
}
