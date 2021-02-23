package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.jH  reason: case insensitive filesystem */
final /* synthetic */ class C1913jH implements BU {

    /* renamed from: a  reason: collision with root package name */
    private final C1701gH f10892a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10893b;

    C1913jH(C1701gH gHVar, String str) {
        this.f10892a = gHVar;
        this.f10893b = str;
    }

    public final Object apply(Object obj) {
        C1701gH.a((SQLiteDatabase) obj, this.f10893b);
        return null;
    }
}
