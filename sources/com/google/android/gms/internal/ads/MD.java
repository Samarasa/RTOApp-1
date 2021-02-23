package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class MD implements Xga<Set<C3108zx<C1290aV>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f7801a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f7802b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f7803c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Map<SU, SD>> f7804d;

    public MD(C1876iha<String> iha, C1876iha<Context> iha2, C1876iha<Executor> iha3, C1876iha<Map<SU, SD>> iha4) {
        this.f7801a = iha;
        this.f7802b = iha2;
        this.f7803c = iha3;
        this.f7804d = iha4;
    }

    public final /* synthetic */ Object get() {
        Set set;
        String str = this.f7801a.get();
        Context context = this.f7802b.get();
        Executor executor = this.f7803c.get();
        Map map = this.f7804d.get();
        if (((Boolean) Qqa.e().a(F.id)).booleanValue()) {
            Soa soa = new Soa(new Woa(context));
            soa.a((Voa) new OD(str));
            set = Collections.singleton(new C3108zx(new QD(soa, map), executor));
        } else {
            set = Collections.emptySet();
        }
        C1452cha.a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
