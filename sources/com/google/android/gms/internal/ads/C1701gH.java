package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.H;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gH  reason: case insensitive filesystem */
public final class C1701gH extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10511a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f10512b;

    public C1701gH(Context context, PY py) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) Qqa.e().a(F.Hf)).intValue());
        this.f10511a = context;
        this.f10512b = py;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public static void a(SQLiteDatabase sQLiteDatabase, C1122Vk vk) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = 1");
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb.toString(), (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            String[] strArr = new String[query.getCount()];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (String a2 : strArr) {
                vk.a(a2);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    static final /* synthetic */ void a(SQLiteDatabase sQLiteDatabase, String str, C1122Vk vk) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        a(sQLiteDatabase, vk);
    }

    private final void a(BU<SQLiteDatabase, Void> bu) {
        DY.a(this.f10512b.a(new C1630fH(this)), new C2055lH(this, bu), (Executor) this.f10512b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(C1122Vk vk, String str, SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, vk, str);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(C2197nH nHVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(nHVar.f11438a));
        contentValues.put("gws_query_id", nHVar.f11439b);
        contentValues.put("url", nHVar.f11440c);
        contentValues.put("event_state", Integer.valueOf(nHVar.f11441d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        p.c();
        H s = oa.s(this.f10511a);
        if (s != null) {
            try {
                s.zzap(b.a(this.f10511a));
            } catch (RemoteException e2) {
                fa.e("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(SQLiteDatabase sQLiteDatabase, C1122Vk vk, String str) {
        this.f10512b.execute(new C1772hH(sQLiteDatabase, str, vk));
    }

    public final void a(C1122Vk vk) {
        a((BU<SQLiteDatabase, Void>) new C1843iH(vk));
    }

    public final void a(C1122Vk vk, String str) {
        a((BU<SQLiteDatabase, Void>) new C1984kH(this, vk, str));
    }

    public final void a(C2197nH nHVar) {
        a((BU<SQLiteDatabase, Void>) new C2126mH(this, nHVar));
    }

    public final void e(String str) {
        a((BU<SQLiteDatabase, Void>) new C1913jH(this, str));
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
