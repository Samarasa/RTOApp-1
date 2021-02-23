package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.eE  reason: case insensitive filesystem */
public final class C1556eE {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f10230a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1627fE f10231b;

    C1556eE(C1627fE fEVar) {
        this.f10231b = fEVar;
    }

    /* access modifiers changed from: private */
    public final C1556eE d() {
        this.f10230a.putAll(this.f10231b.f10365c);
        return this;
    }

    public final C1556eE a(DS ds) {
        this.f10230a.put("gqi", ds.f6547b);
        return this;
    }

    public final C1556eE a(C2988yS ySVar) {
        this.f10230a.put("aai", ySVar.v);
        return this;
    }

    public final C1556eE a(String str, String str2) {
        this.f10230a.put(str, str2);
        return this;
    }

    public final void a() {
        this.f10231b.f10364b.execute(new C1769hE(this));
    }

    public final String b() {
        return this.f10231b.f10363a.b(this.f10230a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f10231b.f10363a.a(this.f10230a);
    }
}
