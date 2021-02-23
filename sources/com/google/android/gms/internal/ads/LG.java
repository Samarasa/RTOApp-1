package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class LG implements AY<SQLiteDatabase> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BU f7653a;

    LG(JG jg, BU bu) {
        this.f7653a = bu;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            this.f7653a.apply((SQLiteDatabase) obj);
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            C1018Rk.b(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }

    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        C1018Rk.b(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }
}
