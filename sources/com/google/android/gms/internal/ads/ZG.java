package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C2885wpa;
import java.util.ArrayList;

final /* synthetic */ class ZG implements BU {

    /* renamed from: a  reason: collision with root package name */
    private final WG f9523a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9524b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f9525c;

    /* renamed from: d  reason: collision with root package name */
    private final C2743upa f9526d;

    /* renamed from: e  reason: collision with root package name */
    private final C2885wpa.c f9527e;

    ZG(WG wg, boolean z, ArrayList arrayList, C2743upa upa, C2885wpa.c cVar) {
        this.f9523a = wg;
        this.f9524b = z;
        this.f9525c = arrayList;
        this.f9526d = upa;
        this.f9527e = cVar;
    }

    public final Object apply(Object obj) {
        WG wg = this.f9523a;
        boolean z = this.f9524b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] a2 = wg.f9118b.a(z, this.f9525c, this.f9526d, this.f9527e);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(p.j().a()));
        contentValues.put("serialized_proto_data", a2);
        sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
        return null;
    }
}
