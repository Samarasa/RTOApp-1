package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tq  reason: case insensitive filesystem */
public final class C2673tq {

    /* renamed from: a  reason: collision with root package name */
    private final String f12268a;

    /* renamed from: b  reason: collision with root package name */
    private final C2084lf f12269b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f12270c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C0660Dq f12271d;

    /* renamed from: e  reason: collision with root package name */
    private final C1088Uc<Object> f12272e = new C2957xq(this);

    /* renamed from: f  reason: collision with root package name */
    private final C1088Uc<Object> f12273f = new C3099zq(this);

    public C2673tq(String str, C2084lf lfVar, Executor executor) {
        this.f12268a = str;
        this.f12269b = lfVar;
        this.f12270c = executor;
    }

    /* access modifiers changed from: private */
    public final boolean a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f12268a);
    }

    public final void a() {
        this.f12269b.b("/updateActiveView", this.f12272e);
        this.f12269b.b("/untrackActiveViewUnit", this.f12273f);
    }

    public final void a(C0660Dq dq) {
        this.f12269b.a("/updateActiveView", this.f12272e);
        this.f12269b.a("/untrackActiveViewUnit", this.f12273f);
        this.f12271d = dq;
    }

    public final void a(C2313on onVar) {
        onVar.b("/updateActiveView", this.f12272e);
        onVar.b("/untrackActiveViewUnit", this.f12273f);
    }

    public final void b(C2313on onVar) {
        onVar.a("/updateActiveView", (C1088Uc<? super C2313on>) this.f12272e);
        onVar.a("/untrackActiveViewUnit", (C1088Uc<? super C2313on>) this.f12273f);
    }
}
