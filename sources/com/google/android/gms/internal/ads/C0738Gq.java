package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gq  reason: case insensitive filesystem */
public final class C0738Gq implements Xga<Set<C3108zx<C0872Lu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0660Dq> f7093a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7094b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<JSONObject> f7095c;

    private C0738Gq(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        this.f7093a = iha;
        this.f7094b = iha2;
        this.f7095c = iha3;
    }

    public static C0738Gq a(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        return new C0738Gq(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = this.f7095c.get() == null ? Collections.emptySet() : Collections.singleton(new C3108zx(this.f7093a.get(), this.f7094b.get()));
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
