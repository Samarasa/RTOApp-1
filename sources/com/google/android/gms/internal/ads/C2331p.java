package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.p  reason: case insensitive filesystem */
public abstract class C2331p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f11668a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11669b;

    /* renamed from: c  reason: collision with root package name */
    private final T f11670c;

    private C2331p(int i, String str, T t) {
        this.f11668a = i;
        this.f11669b = str;
        this.f11670c = t;
        Qqa.d().a(this);
    }

    /* synthetic */ C2331p(int i, String str, Object obj, C2543s sVar) {
        this(i, str, obj);
    }

    public static C2331p<String> a(int i, String str) {
        C2331p<String> a2 = a(1, str, (String) null);
        Qqa.d().c(a2);
        return a2;
    }

    public static C2331p<Float> a(int i, String str, float f2) {
        return new C2614t(1, str, Float.valueOf(0.0f));
    }

    public static C2331p<Integer> a(int i, String str, int i2) {
        return new r(1, str, Integer.valueOf(i2));
    }

    public static C2331p<Long> a(int i, String str, long j) {
        return new C2685u(1, str, Long.valueOf(j));
    }

    public static C2331p<Boolean> a(int i, String str, Boolean bool) {
        return new C2543s(i, str, bool);
    }

    public static C2331p<String> a(int i, String str, String str2) {
        return new C2827w(1, str, str2);
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    public abstract T a(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract T a(JSONObject jSONObject);

    public final String a() {
        return this.f11669b;
    }

    public abstract void a(SharedPreferences.Editor editor, T t);

    public final int b() {
        return this.f11668a;
    }

    public final T c() {
        return this.f11670c;
    }
}
