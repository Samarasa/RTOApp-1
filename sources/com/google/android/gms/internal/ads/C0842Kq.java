package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Kq  reason: case insensitive filesystem */
public final class C0842Kq implements Xga<Set<C3108zx<C2739una>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0660Dq> f7625a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7626b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<JSONObject> f7627c;

    private C0842Kq(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        this.f7625a = iha;
        this.f7626b = iha2;
        this.f7627c = iha3;
    }

    public static C0842Kq a(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        return new C0842Kq(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = this.f7627c.get() == null ? Collections.emptySet() : Collections.singleton(new C3108zx(this.f7625a.get(), this.f7626b.get()));
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
