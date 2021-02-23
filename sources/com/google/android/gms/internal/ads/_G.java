package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C2885wpa;
import com.google.android.gms.internal.ads.Cpa;
import java.util.ArrayList;

public final class _G {

    /* renamed from: a  reason: collision with root package name */
    private Soa f9625a;

    /* renamed from: b  reason: collision with root package name */
    private Context f9626b;

    /* renamed from: c  reason: collision with root package name */
    private JG f9627c;

    /* renamed from: d  reason: collision with root package name */
    private C1200Yk f9628d;

    public _G(Context context, C1200Yk yk, Soa soa, JG jg) {
        this.f9626b = context;
        this.f9628d = yk;
        this.f9625a = soa;
        this.f9627c = jg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ArrayList<C2885wpa.a> a2 = C1276aH.a(sQLiteDatabase);
        C2885wpa.b o = C2885wpa.o();
        o.a(this.f9626b.getPackageName());
        o.b(Build.MODEL);
        int i = 0;
        o.a(C1276aH.a(sQLiteDatabase2, 0));
        o.a((Iterable<? extends C2885wpa.a>) a2);
        o.b(C1276aH.a(sQLiteDatabase2, 1));
        o.a(p.j().a());
        o.b(C1276aH.b(sQLiteDatabase2, 2));
        C2885wpa wpa = (C2885wpa) o.k();
        int size = a2.size();
        long j = 0;
        int i2 = 0;
        while (i2 < size) {
            C2885wpa.a aVar = a2.get(i2);
            i2++;
            C2885wpa.a aVar2 = aVar;
            if (aVar2.p() == Rpa.ENUM_TRUE && aVar2.o() > j) {
                j = aVar2.o();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
        this.f9625a.a((Voa) new C1347bH(wpa));
        Cpa.a o2 = Cpa.o();
        o2.a(this.f9628d.f9457b);
        o2.b(this.f9628d.f9458c);
        if (!this.f9628d.f9459d) {
            i = 2;
        }
        o2.c(i);
        this.f9625a.a((Voa) new C1559eH((Cpa) o2.k()));
        this.f9625a.a(Uoa.OFFLINE_UPLOAD);
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    public final void a() {
        try {
            this.f9627c.a(new C1418cH(this));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            C1018Rk.b(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }
}
