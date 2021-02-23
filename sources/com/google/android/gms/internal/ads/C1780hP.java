package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hP  reason: case insensitive filesystem */
public final class C1780hP implements JO<C1851iP> {

    /* renamed from: a  reason: collision with root package name */
    private final C2728ui f10665a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10666b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10667c;

    /* renamed from: d  reason: collision with root package name */
    private final PY f10668d;

    public C1780hP(C2728ui uiVar, Context context, String str, PY py) {
        this.f10665a = uiVar;
        this.f10666b = context;
        this.f10667c = str;
        this.f10668d = py;
    }

    public final LY<C1851iP> a() {
        return this.f10668d.a(new C1992kP(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1851iP b() {
        JSONObject jSONObject = new JSONObject();
        C2728ui uiVar = this.f10665a;
        if (uiVar != null) {
            uiVar.a(this.f10666b, this.f10667c, jSONObject);
        }
        return new C1851iP(jSONObject);
    }
}
