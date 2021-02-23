package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.kH  reason: case insensitive filesystem */
final /* synthetic */ class C1984kH implements BU {

    /* renamed from: a  reason: collision with root package name */
    private final C1701gH f11041a;

    /* renamed from: b  reason: collision with root package name */
    private final C1122Vk f11042b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11043c;

    C1984kH(C1701gH gHVar, C1122Vk vk, String str) {
        this.f11041a = gHVar;
        this.f11042b = vk;
        this.f11043c = str;
    }

    public final Object apply(Object obj) {
        return this.f11041a.a(this.f11042b, this.f11043c, (SQLiteDatabase) obj);
    }
}
