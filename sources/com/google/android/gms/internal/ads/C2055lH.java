package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.lH  reason: case insensitive filesystem */
final class C2055lH implements AY<SQLiteDatabase> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BU f11152a;

    C2055lH(C1701gH gHVar, BU bu) {
        this.f11152a = bu;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            this.f11152a.apply((SQLiteDatabase) obj);
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            C1018Rk.b(valueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(valueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }

    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        C1018Rk.b(valueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(valueOf) : new String("Failed to get offline buffered ping database: "));
    }
}
