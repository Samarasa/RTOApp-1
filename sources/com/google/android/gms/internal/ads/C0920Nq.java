package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.q;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nq  reason: case insensitive filesystem */
public final class C0920Nq implements Xga<Set<C3108zx<q>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0660Dq> f8029a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f8030b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<JSONObject> f8031c;

    private C0920Nq(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        this.f8029a = iha;
        this.f8030b = iha2;
        this.f8031c = iha3;
    }

    public static C0920Nq a(C1876iha<C0660Dq> iha, C1876iha<Executor> iha2, C1876iha<JSONObject> iha3) {
        return new C0920Nq(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = this.f8031c.get() == null ? Collections.emptySet() : Collections.singleton(new C3108zx(this.f8029a.get(), this.f8030b.get()));
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
