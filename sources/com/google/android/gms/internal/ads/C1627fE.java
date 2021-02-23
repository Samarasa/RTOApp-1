package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fE  reason: case insensitive filesystem */
public final class C1627fE {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1981kE f10363a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f10364b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f10365c;

    public C1627fE(C1981kE kEVar, Executor executor) {
        this.f10363a = kEVar;
        this.f10365c = kEVar.a();
        this.f10364b = executor;
    }

    public final C1556eE a() {
        C1556eE eEVar = new C1556eE(this);
        C1556eE unused = eEVar.d();
        return eEVar;
    }
}
