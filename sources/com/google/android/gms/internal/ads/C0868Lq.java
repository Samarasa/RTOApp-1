package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lq  reason: case insensitive filesystem */
public final class C0868Lq implements Xga<Set<C3108zx<C0950Ou>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0660Dq> f7757a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7758b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<JSONObject> f7759c;

    private C0868Lq(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        this.f7757a = iha;
        this.f7758b = iha2;
        this.f7759c = iha3;
    }

    public static C0868Lq a(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        return new C0868Lq(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = this.f7759c.get() == null ? Collections.emptySet() : Collections.singleton(new C3108zx(this.f7757a.get(), this.f7758b.get()));
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
