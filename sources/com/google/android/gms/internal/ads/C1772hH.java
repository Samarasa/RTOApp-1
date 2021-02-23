package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.hH  reason: case insensitive filesystem */
final /* synthetic */ class C1772hH implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f10652a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10653b;

    /* renamed from: c  reason: collision with root package name */
    private final C1122Vk f10654c;

    C1772hH(SQLiteDatabase sQLiteDatabase, String str, C1122Vk vk) {
        this.f10652a = sQLiteDatabase;
        this.f10653b = str;
        this.f10654c = vk;
    }

    public final void run() {
        C1701gH.a(this.f10652a, this.f10653b, this.f10654c);
    }
}
