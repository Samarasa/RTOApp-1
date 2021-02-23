package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import c.b.b.b.d.f.C;
import c.b.b.b.d.f.F;
import c.b.b.b.d.f.Le;
import c.b.b.b.d.f.T;
import c.b.b.b.d.f.V;
import c.b.b.b.d.f.X;
import com.google.android.gms.common.internal.C0563t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.d  reason: case insensitive filesystem */
final class C3129d extends C3158he {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f13535d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f13536e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f13537f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f13538g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f13539h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */
    public static final String[] k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final C3135e l = new C3135e(this, f(), "google_app_measurement.db");
    /* access modifiers changed from: private */
    public final C3128ce m = new C3128ce(j());

    C3129d(C3176ke keVar) {
        super(keVar);
    }

    private final boolean O() {
        return f().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long a(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j3;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            h().t().a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            h().t().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                h().t().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            h().t().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        C0563t.b(str);
        C0563t.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final boolean a(String str, int i2, C c2) {
        r();
        c();
        C0563t.b(str);
        C0563t.a(c2);
        Integer num = null;
        if (TextUtils.isEmpty(c2.q())) {
            Db w = h().w();
            Object a2 = Bb.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (c2.o()) {
                num = Integer.valueOf(c2.p());
            }
            w.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] g2 = c2.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", c2.o() ? Integer.valueOf(c2.p()) : null);
        contentValues.put("event_name", c2.q());
        if (m().e(str, C3202q.na)) {
            contentValues.put("session_scoped", c2.x() ? Boolean.valueOf(c2.y()) : null);
        }
        contentValues.put("data", g2);
        try {
            if (v().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().t().a("Failed to insert event filter (got -1). appId", Bb.a(str));
            return true;
        } catch (SQLiteException e2) {
            h().t().a("Error storing event filter. appId", Bb.a(str), e2);
            return false;
        }
    }

    private final boolean a(String str, int i2, F f2) {
        r();
        c();
        C0563t.b(str);
        C0563t.a(f2);
        Integer num = null;
        if (TextUtils.isEmpty(f2.q())) {
            Db w = h().w();
            Object a2 = Bb.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (f2.o()) {
                num = Integer.valueOf(f2.p());
            }
            w.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] g2 = f2.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", f2.o() ? Integer.valueOf(f2.p()) : null);
        contentValues.put("property_name", f2.q());
        if (m().e(str, C3202q.na)) {
            contentValues.put("session_scoped", f2.u() ? Boolean.valueOf(f2.v()) : null);
        }
        contentValues.put("data", g2);
        try {
            if (v().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().t().a("Failed to insert property filter (got -1). appId", Bb.a(str));
            return false;
        } catch (SQLiteException e2) {
            h().t().a("Error storing property filter. appId", Bb.a(str), e2);
            return false;
        }
    }

    private final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = v().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            h().t().a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean c(String str, List<Integer> list) {
        C0563t.b(str);
        r();
        c();
        SQLiteDatabase v = v();
        try {
            long b2 = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, m().b(str, C3202q.H)));
            if (b2 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return v.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            h().t().a("Database error querying filters. appId", Bb.a(str), e2);
            return false;
        }
    }

    public final void G() {
        r();
        v().beginTransaction();
    }

    public final void H() {
        r();
        v().endTransaction();
    }

    public final boolean I() {
        return b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void J() {
        int delete;
        c();
        r();
        if (O()) {
            long a2 = l().i.a();
            long b2 = j().b();
            if (Math.abs(b2 - a2) > C3202q.A.a(null).longValue()) {
                l().i.a(b2);
                c();
                r();
                if (O() && (delete = v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(j().a()), String.valueOf(Ie.s())})) > 0) {
                    h().B().a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final long K() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long L() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final boolean M() {
        return b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean N() {
        return b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long a(X x) {
        c();
        r();
        C0563t.a(x);
        C0563t.b(x.ra());
        byte[] g2 = x.g();
        long a2 = n().a(g2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", x.ra());
        contentValues.put("metadata_fingerprint", Long.valueOf(a2));
        contentValues.put("metadata", g2);
        try {
            v().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return a2;
        } catch (SQLiteException e2) {
            h().t().a("Error storing raw event metadata. appId", Bb.a(x.ra()), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<c.b.b.b.d.f.T, java.lang.Long> a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.c()
            r7.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.v()     // Catch:{ SQLiteException -> 0x007b, all -> 0x0078 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007b, all -> 0x0078 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x007b, all -> 0x0078 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x007b, all -> 0x0078 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x007b, all -> 0x0078 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x007b, all -> 0x0078 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.Bb r8 = r7.h()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.Db r8 = r8.B()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0076 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0076 }
            c.b.b.b.d.f.T$a r4 = c.b.b.b.d.f.T.x()     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.measurement.internal.oe.a(r4, (byte[]) r2)     // Catch:{ IOException -> 0x005e }
            c.b.b.b.d.f.T$a r4 = (c.b.b.b.d.f.T.a) r4     // Catch:{ IOException -> 0x005e }
            c.b.b.b.d.f.wc r2 = r4.j()     // Catch:{ IOException -> 0x005e }
            c.b.b.b.d.f.Lb r2 = (c.b.b.b.d.f.Lb) r2     // Catch:{ IOException -> 0x005e }
            c.b.b.b.d.f.T r2 = (c.b.b.b.d.f.T) r2     // Catch:{ IOException -> 0x005e }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            return r8
        L_0x005e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.Bb r3 = r7.h()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x0076 }
            r3.a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r8 = move-exception
            goto L_0x007d
        L_0x0078:
            r8 = move-exception
            r1 = r0
            goto L_0x0091
        L_0x007b:
            r8 = move-exception
            r1 = r0
        L_0x007d:
            com.google.android.gms.measurement.internal.Bb r9 = r7.h()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.measurement.internal.Db r9 = r9.t()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "Error selecting main event"
            r9.a(r2, r8)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008f
            r1.close()
        L_0x008f:
            return r0
        L_0x0090:
            r8 = move-exception
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()
        L_0x0096:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final C3123c a(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C0563t.b(str);
        c();
        r();
        String[] strArr = {str};
        C3123c cVar = new C3123c();
        Cursor cursor = null;
        try {
            SQLiteDatabase v = v();
            cursor = v.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                h().w().a("Not updating daily counts, app is not known. appId", Bb.a(str));
                if (cursor != null) {
                    cursor.close();
                }
                return cVar;
            }
            if (cursor.getLong(0) == j2) {
                cVar.f13522b = cursor.getLong(1);
                cVar.f13521a = cursor.getLong(2);
                cVar.f13523c = cursor.getLong(3);
                cVar.f13524d = cursor.getLong(4);
                cVar.f13525e = cursor.getLong(5);
            }
            if (z) {
                cVar.f13522b++;
            }
            if (z2) {
                cVar.f13521a++;
            }
            if (z3) {
                cVar.f13523c++;
            }
            if (z4) {
                cVar.f13524d++;
            }
            if (z5) {
                cVar.f13525e++;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(cVar.f13521a));
            contentValues.put("daily_events_count", Long.valueOf(cVar.f13522b));
            contentValues.put("daily_conversions_count", Long.valueOf(cVar.f13523c));
            contentValues.put("daily_error_events_count", Long.valueOf(cVar.f13524d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(cVar.f13525e));
            v.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return cVar;
        } catch (SQLiteException e2) {
            h().t().a("Error updating daily counts. appId", Bb.a(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return cVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C3171k a(java.lang.String r27, java.lang.String r28) {
        /*
            r26 = this;
            r15 = r27
            r14 = r28
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r27)
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r28)
            r26.c()
            r26.r()
            com.google.android.gms.measurement.internal.Ie r0 = r26.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C3202q.oa
            boolean r0 = r0.e(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = "current_session_count"
            r1.add(r2)
        L_0x003e:
            r18 = 0
            android.database.sqlite.SQLiteDatabase r2 = r26.v()     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r4 = r1
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            java.lang.String r5 = "app_id=? and name=?"
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r6[r10] = r15     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r11 = 1
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0134, all -> 0x0130 }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 != 0) goto L_0x006d
            if (r12 == 0) goto L_0x006c
            r12.close()
        L_0x006c:
            return r18
        L_0x006d:
            long r4 = r12.getLong(r10)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            long r6 = r12.getLong(r11)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            long r16 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r1 = 3
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r8 = 0
            if (r2 == 0) goto L_0x0085
            r19 = r8
            goto L_0x008b
        L_0x0085:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r19 = r1
        L_0x008b:
            r1 = 4
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 == 0) goto L_0x0095
            r21 = r18
            goto L_0x009f
        L_0x0095:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r21 = r1
        L_0x009f:
            r1 = 5
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 == 0) goto L_0x00a9
            r22 = r18
            goto L_0x00b3
        L_0x00a9:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r22 = r1
        L_0x00b3:
            r1 = 6
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 == 0) goto L_0x00bd
            r23 = r18
            goto L_0x00c7
        L_0x00bd:
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r23 = r1
        L_0x00c7:
            r1 = 7
            boolean r2 = r12.isNull(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r2 != 0) goto L_0x00e0
            long r1 = r12.getLong(r1)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r24 = 1
            int r3 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r3 != 0) goto L_0x00d9
            r10 = 1
        L_0x00d9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r24 = r1
            goto L_0x00e2
        L_0x00e0:
            r24 = r18
        L_0x00e2:
            if (r0 == 0) goto L_0x00f1
            r0 = 8
            boolean r1 = r12.isNull(r0)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            if (r1 != 0) goto L_0x00f1
            long r0 = r12.getLong(r0)     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r8 = r0
        L_0x00f1:
            com.google.android.gms.measurement.internal.k r0 = new com.google.android.gms.measurement.internal.k     // Catch:{ SQLiteException -> 0x012c, all -> 0x0128 }
            r1 = r0
            r2 = r27
            r3 = r28
            r10 = r16
            r25 = r12
            r12 = r19
            r14 = r21
            r15 = r22
            r16 = r23
            r17 = r24
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0126 }
            boolean r1 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0126 }
            if (r1 == 0) goto L_0x0120
            com.google.android.gms.measurement.internal.Bb r1 = r26.h()     // Catch:{ SQLiteException -> 0x0126 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ SQLiteException -> 0x0126 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r27)     // Catch:{ SQLiteException -> 0x0126 }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x0126 }
        L_0x0120:
            if (r25 == 0) goto L_0x0125
            r25.close()
        L_0x0125:
            return r0
        L_0x0126:
            r0 = move-exception
            goto L_0x0137
        L_0x0128:
            r0 = move-exception
            r25 = r12
            goto L_0x0159
        L_0x012c:
            r0 = move-exception
            r25 = r12
            goto L_0x0137
        L_0x0130:
            r0 = move-exception
            r25 = r18
            goto L_0x0159
        L_0x0134:
            r0 = move-exception
            r25 = r18
        L_0x0137:
            com.google.android.gms.measurement.internal.Bb r1 = r26.h()     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r27)     // Catch:{ all -> 0x0158 }
            com.google.android.gms.measurement.internal.zb r4 = r26.e()     // Catch:{ all -> 0x0158 }
            r5 = r28
            java.lang.String r4 = r4.a((java.lang.String) r5)     // Catch:{ all -> 0x0158 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x0158 }
            if (r25 == 0) goto L_0x0157
            r25.close()
        L_0x0157:
            return r18
        L_0x0158:
            r0 = move-exception
        L_0x0159:
            if (r25 == 0) goto L_0x015e
            r25.close()
        L_0x015e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.k");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(long r5) {
        /*
            r4 = this;
            r4.c()
            r4.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.v()     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.Bb r6 = r4.h()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.Db r6 = r6.B()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0045
        L_0x0040:
            r6 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0043:
            r6 = move-exception
            r5 = r0
        L_0x0045:
            com.google.android.gms.measurement.internal.Bb r1 = r4.h()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.a(r2, r6)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            r5.close()
        L_0x0057:
            return r0
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.te> a(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r14)
            r13.c()
            r13.r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.v()     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.a((android.database.Cursor) r2, (int) r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.Bb r3 = r13.h()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.a(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.measurement.internal.te r3 = new com.google.android.gms.measurement.internal.te     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0087
        L_0x0082:
            r14 = move-exception
            r2 = r1
            goto L_0x009f
        L_0x0085:
            r0 = move-exception
            r2 = r1
        L_0x0087:
            com.google.android.gms.measurement.internal.Bb r3 = r13.h()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r14)     // Catch:{ all -> 0x009e }
            r3.a(r4, r14, r0)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x009d
            r2.close()
        L_0x009d:
            return r1
        L_0x009e:
            r14 = move-exception
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            r2.close()
        L_0x00a4:
            goto L_0x00a6
        L_0x00a5:
            throw r14
        L_0x00a6:
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[LOOP:0: B:18:0x0054->B:42:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[EDGE_INSN: B:56:0x00c6->B:43:0x00c6 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<c.b.b.b.d.f.X, java.lang.Long>> a(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.c()
            r12.r()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.google.android.gms.common.internal.C0563t.a((boolean) r2)
            if (r15 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            com.google.android.gms.common.internal.C0563t.a((boolean) r2)
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.v()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ce }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00ce }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00ce }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ce }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00ce }
            if (r14 != 0) goto L_0x004e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00ce }
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r13
        L_0x004e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ce }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00ce }
            r3 = 0
        L_0x0054:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00ce }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ae }
            com.google.android.gms.measurement.internal.oe r7 = r12.n()     // Catch:{ IOException -> 0x00ae }
            byte[] r6 = r7.b(r6)     // Catch:{ IOException -> 0x00ae }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00ce }
            if (r7 != 0) goto L_0x006e
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c6
        L_0x006e:
            c.b.b.b.d.f.X$a r7 = c.b.b.b.d.f.X.V()     // Catch:{ IOException -> 0x009b }
            com.google.android.gms.measurement.internal.oe.a(r7, (byte[]) r6)     // Catch:{ IOException -> 0x009b }
            c.b.b.b.d.f.X$a r7 = (c.b.b.b.d.f.X.a) r7     // Catch:{ IOException -> 0x009b }
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch:{ SQLiteException -> 0x00ce }
            if (r9 != 0) goto L_0x0085
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00ce }
            r7.i((int) r8)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x0085:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r3 = r3 + r6
            c.b.b.b.d.f.wc r6 = r7.j()     // Catch:{ SQLiteException -> 0x00ce }
            c.b.b.b.d.f.Lb r6 = (c.b.b.b.d.f.Lb) r6     // Catch:{ SQLiteException -> 0x00ce }
            c.b.b.b.d.f.X r6 = (c.b.b.b.d.f.X) r6     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ce }
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch:{ SQLiteException -> 0x00ce }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x009b:
            r4 = move-exception
            com.google.android.gms.measurement.internal.Bb r5 = r12.h()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x00aa:
            r5.a(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x00ae:
            r4 = move-exception
            com.google.android.gms.measurement.internal.Bb r5 = r12.h()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00aa
        L_0x00be:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ce }
            if (r4 == 0) goto L_0x00c6
            if (r3 <= r15) goto L_0x0054
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            r2.close()
        L_0x00cb:
            return r14
        L_0x00cc:
            r13 = move-exception
            goto L_0x00ea
        L_0x00ce:
            r14 = move-exception
            com.google.android.gms.measurement.internal.Bb r15 = r12.h()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.Db r15 = r15.t()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ all -> 0x00cc }
            r15.a(r0, r13, r14)     // Catch:{ all -> 0x00cc }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00e9
            r2.close()
        L_0x00e9:
            return r13
        L_0x00ea:
            if (r2 == 0) goto L_0x00ef
            r2.close()
        L_0x00ef:
            goto L_0x00f1
        L_0x00f0:
            throw r13
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.te> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r22)
            r21.c()
            r21.r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r12 = r21.v()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r4 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x0087
            r2.close()
        L_0x0087:
            return r0
        L_0x0088:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a4
            com.google.android.gms.measurement.internal.Bb r3 = r21.h()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r3.a(r4, r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r12 = r21
            goto L_0x00e3
        L_0x00a4:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.a((android.database.Cursor) r2, (int) r4)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00ee }
            if (r10 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.Bb r4 = r21.h()     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.measurement.internal.Db r4 = r4.t()     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r22)     // Catch:{ SQLiteException -> 0x00eb }
            r14 = r24
            r4.a(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00eb }
            goto L_0x00dd
        L_0x00cf:
            r14 = r24
            com.google.android.gms.measurement.internal.te r15 = new com.google.android.gms.measurement.internal.te     // Catch:{ SQLiteException -> 0x00eb }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00eb }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00eb }
        L_0x00dd:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00eb }
            if (r4 != 0) goto L_0x00e9
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            return r0
        L_0x00e9:
            r5 = r13
            goto L_0x0088
        L_0x00eb:
            r0 = move-exception
            r5 = r13
            goto L_0x010c
        L_0x00ee:
            r0 = move-exception
            goto L_0x010c
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0124
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x010c
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x010b
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            goto L_0x0109
        L_0x0100:
            r0 = move-exception
            r12 = r21
            goto L_0x0125
        L_0x0104:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0109:
            r5 = r23
        L_0x010b:
            r2 = r1
        L_0x010c:
            com.google.android.gms.measurement.internal.Bb r3 = r21.h()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r22)     // Catch:{ all -> 0x0123 }
            r3.a(r4, r6, r5, r0)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0122
            r2.close()
        L_0x0122:
            return r1
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            r1 = r2
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            r1.close()
        L_0x012a:
            goto L_0x012c
        L_0x012b:
            throw r0
        L_0x012c:
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final List<Ge> a(String str, String[] strArr) {
        c();
        r();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = v().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object a2 = a(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    long j3 = cursor.getLong(8);
                    long j4 = cursor.getLong(10);
                    boolean z2 = z;
                    Ge ge = r3;
                    Ge ge2 = new Ge(string, string2, new re(string3, j4, a2, string2), j3, z2, string4, (C3192o) n().a(cursor.getBlob(7), C3192o.CREATOR), j2, (C3192o) n().a(cursor.getBlob(9), C3192o.CREATOR), cursor.getLong(11), (C3192o) n().a(cursor.getBlob(12), C3192o.CREATOR));
                    arrayList.add(ge);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    h().t().a("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            h().t().a("Error querying conditional user property value", e2);
            List<Ge> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> a(java.lang.String r13, java.util.List<java.lang.String> r14) {
        /*
            r12 = this;
            r12.r()
            r12.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r13)
            com.google.android.gms.common.internal.C0563t.a(r14)
            b.e.b r0 = new b.e.b
            r0.<init>()
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_id=? AND property_name in ("
            r1.append(r2)
            r2 = 0
            r3 = 0
        L_0x0024:
            int r4 = r14.size()
            if (r3 >= r4) goto L_0x0039
            if (r3 <= 0) goto L_0x0031
            java.lang.String r4 = ","
            r1.append(r4)
        L_0x0031:
            java.lang.String r4 = "?"
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0039:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r14)
            r3.add(r2, r13)
            android.database.sqlite.SQLiteDatabase r4 = r12.v()
            r14 = 0
            java.lang.String r5 = "property_filters"
            java.lang.String r6 = "audience_id"
            java.lang.String r7 = "filter_id"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x00ae, all -> 0x00ab }
            java.lang.String r7 = r1.toString()     // Catch:{ SQLiteException -> 0x00ae, all -> 0x00ab }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00ae, all -> 0x00ab }
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch:{ SQLiteException -> 0x00ae, all -> 0x00ab }
            r8 = r1
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ SQLiteException -> 0x00ae, all -> 0x00ab }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ae, all -> 0x00ab }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00a9 }
            if (r3 != 0) goto L_0x0075
            if (r1 == 0) goto L_0x0074
            r1.close()
        L_0x0074:
            return r0
        L_0x0075:
            int r3 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x00a9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00a9 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x00a9 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x00a9 }
            if (r4 != 0) goto L_0x0091
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00a9 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x00a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00a9 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x00a9 }
        L_0x0091:
            r3 = 1
            int r3 = r1.getInt(r3)     // Catch:{ SQLiteException -> 0x00a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00a9 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x00a9 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x00a9 }
            if (r3 != 0) goto L_0x0075
            if (r1 == 0) goto L_0x00a8
            r1.close()
        L_0x00a8:
            return r0
        L_0x00a9:
            r0 = move-exception
            goto L_0x00b0
        L_0x00ab:
            r13 = move-exception
            r1 = r14
            goto L_0x00c8
        L_0x00ae:
            r0 = move-exception
            r1 = r14
        L_0x00b0:
            com.google.android.gms.measurement.internal.Bb r2 = r12.h()     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.measurement.internal.Db r2 = r2.t()     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ all -> 0x00c7 }
            r2.a(r3, r13, r0)     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x00c6
            r1.close()
        L_0x00c6:
            return r14
        L_0x00c7:
            r13 = move-exception
        L_0x00c8:
            if (r1 == 0) goto L_0x00cd
            r1.close()
        L_0x00cd:
            goto L_0x00cf
        L_0x00ce:
            throw r13
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.a(java.lang.String, java.util.List):java.util.Map");
    }

    public final void a(C3138ec ecVar) {
        C0563t.a(ecVar);
        c();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ecVar.l());
        contentValues.put("app_instance_id", ecVar.m());
        contentValues.put("gmp_app_id", ecVar.n());
        contentValues.put("resettable_device_id_hash", ecVar.q());
        contentValues.put("last_bundle_index", Long.valueOf(ecVar.B()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(ecVar.s()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(ecVar.t()));
        contentValues.put("app_version", ecVar.u());
        contentValues.put("app_store", ecVar.w());
        contentValues.put("gmp_version", Long.valueOf(ecVar.x()));
        contentValues.put("dev_cert_hash", Long.valueOf(ecVar.y()));
        contentValues.put("measurement_enabled", Boolean.valueOf(ecVar.A()));
        contentValues.put("day", Long.valueOf(ecVar.F()));
        contentValues.put("daily_public_events_count", Long.valueOf(ecVar.G()));
        contentValues.put("daily_events_count", Long.valueOf(ecVar.H()));
        contentValues.put("daily_conversions_count", Long.valueOf(ecVar.I()));
        contentValues.put("config_fetched_time", Long.valueOf(ecVar.C()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(ecVar.D()));
        contentValues.put("app_version_int", Long.valueOf(ecVar.v()));
        contentValues.put("firebase_instance_id", ecVar.r());
        contentValues.put("daily_error_events_count", Long.valueOf(ecVar.c()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(ecVar.b()));
        contentValues.put("health_monitor_sample", ecVar.d());
        contentValues.put("android_id", Long.valueOf(ecVar.f()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(ecVar.g()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(ecVar.h()));
        contentValues.put("admob_app_id", ecVar.o());
        contentValues.put("dynamite_version", Long.valueOf(ecVar.z()));
        if (ecVar.j() != null) {
            if (ecVar.j().size() == 0) {
                h().w().a("Safelisted events should not be an empty list. appId", ecVar.l());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", ecVar.j()));
            }
        }
        if (Le.b() && m().e(ecVar.l(), C3202q.Fa)) {
            contentValues.put("ga_app_id", ecVar.p());
        }
        try {
            SQLiteDatabase v = v();
            if (((long) v.update("apps", contentValues, "app_id = ?", new String[]{ecVar.l()})) == 0 && v.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                h().t().a("Failed to insert/update app (got -1). appId", Bb.a(ecVar.l()));
            }
        } catch (SQLiteException e2) {
            h().t().a("Error storing app. appId", Bb.a(ecVar.l()), e2);
        }
    }

    public final void a(C3171k kVar) {
        C0563t.a(kVar);
        c();
        r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", kVar.f13623a);
        contentValues.put("name", kVar.f13624b);
        contentValues.put("lifetime_count", Long.valueOf(kVar.f13625c));
        contentValues.put("current_bundle_count", Long.valueOf(kVar.f13626d));
        contentValues.put("last_fire_timestamp", Long.valueOf(kVar.f13628f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(kVar.f13629g));
        contentValues.put("last_bundled_day", kVar.f13630h);
        contentValues.put("last_sampled_complex_event_id", kVar.i);
        contentValues.put("last_sampling_rate", kVar.j);
        if (m().e(kVar.f13623a, C3202q.oa)) {
            contentValues.put("current_session_count", Long.valueOf(kVar.f13627e));
        }
        Boolean bool = kVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (v().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                h().t().a("Failed to insert/update event aggregates (got -1). appId", Bb.a(kVar.f13623a));
            }
        } catch (SQLiteException e2) {
            h().t().a("Error storing event aggregates. appId", Bb.a(kVar.f13623a), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<Long> list) {
        c();
        r();
        C0563t.a(list);
        C0563t.a(list.size());
        if (O()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (b(sb3.toString(), (String[]) null) > 0) {
                h().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase v = v();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                h().t().a("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean a(X x, boolean z) {
        Db t;
        Object a2;
        String str;
        c();
        r();
        C0563t.a(x);
        C0563t.b(x.ra());
        C0563t.b(x.fa());
        J();
        long a3 = j().a();
        if (x.ga() < a3 - Ie.s() || x.ga() > Ie.s() + a3) {
            h().w().a("Storing bundle outside of the max uploading time span. appId, now, timestamp", Bb.a(x.ra()), Long.valueOf(a3), Long.valueOf(x.ga()));
        }
        try {
            byte[] c2 = n().c(x.g());
            h().B().a("Saving bundle, size", Integer.valueOf(c2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", x.ra());
            contentValues.put("bundle_end_timestamp", Long.valueOf(x.ga()));
            contentValues.put("data", c2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (x.O()) {
                contentValues.put("retry_count", Integer.valueOf(x.Q()));
            }
            try {
                if (v().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                h().t().a("Failed to insert bundle (got -1). appId", Bb.a(x.ra()));
                return false;
            } catch (SQLiteException e2) {
                e = e2;
                t = h().t();
                a2 = Bb.a(x.ra());
                str = "Error storing bundle. appId";
                t.a(str, a2, e);
                return false;
            }
        } catch (IOException e3) {
            e = e3;
            t = h().t();
            a2 = Bb.a(x.ra());
            str = "Data loss. Failed to serialize bundle. appId";
            t.a(str, a2, e);
            return false;
        }
    }

    public final boolean a(Ge ge) {
        C0563t.a(ge);
        c();
        r();
        if (c(ge.f13267a, ge.f13269c.f13747b) == null) {
            if (b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{ge.f13267a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ge.f13267a);
        contentValues.put("origin", ge.f13268b);
        contentValues.put("name", ge.f13269c.f13747b);
        a(contentValues, "value", ge.f13269c.a());
        contentValues.put("active", Boolean.valueOf(ge.f13271e));
        contentValues.put("trigger_event_name", ge.f13272f);
        contentValues.put("trigger_timeout", Long.valueOf(ge.f13274h));
        k();
        contentValues.put("timed_out_event", se.a((Parcelable) ge.f13273g));
        contentValues.put("creation_timestamp", Long.valueOf(ge.f13270d));
        k();
        contentValues.put("triggered_event", se.a((Parcelable) ge.i));
        contentValues.put("triggered_timestamp", Long.valueOf(ge.f13269c.f13748c));
        contentValues.put("time_to_live", Long.valueOf(ge.j));
        k();
        contentValues.put("expired_event", se.a((Parcelable) ge.k));
        try {
            if (v().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                h().t().a("Failed to insert/update conditional user property (got -1)", Bb.a(ge.f13267a));
            }
        } catch (SQLiteException e2) {
            h().t().a("Error storing conditional user property", Bb.a(ge.f13267a), e2);
        }
        return true;
    }

    public final boolean a(C3177l lVar, long j2, boolean z) {
        c();
        r();
        C0563t.a(lVar);
        C0563t.b(lVar.f13654a);
        T.a x = T.x();
        x.b(lVar.f13658e);
        Iterator<String> it = lVar.f13659f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            V.a v = V.v();
            v.a(next);
            n().a(v, lVar.f13659f.a(next));
            x.a(v);
        }
        byte[] g2 = ((T) x.j()).g();
        h().B().a("Saving event, name, data size", e().a(lVar.f13655b), Integer.valueOf(g2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.f13654a);
        contentValues.put("name", lVar.f13655b);
        contentValues.put("timestamp", Long.valueOf(lVar.f13657d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", g2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (v().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            h().t().a("Failed to insert raw event (got -1). appId", Bb.a(lVar.f13654a));
            return false;
        } catch (SQLiteException e2) {
            h().t().a("Error storing raw event. appId", Bb.a(lVar.f13654a), e2);
            return false;
        }
    }

    public final boolean a(te teVar) {
        C0563t.a(teVar);
        c();
        r();
        if (c(teVar.f13774a, teVar.f13776c) == null) {
            if (se.a(teVar.f13776c)) {
                if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{teVar.f13774a}) >= 25) {
                    return false;
                }
            } else if (!m().e(teVar.f13774a, C3202q.ca)) {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{teVar.f13774a, teVar.f13775b}) >= 25) {
                    return false;
                }
            } else if (!"_npa".equals(teVar.f13776c)) {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{teVar.f13774a, teVar.f13775b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", teVar.f13774a);
        contentValues.put("origin", teVar.f13775b);
        contentValues.put("name", teVar.f13776c);
        contentValues.put("set_timestamp", Long.valueOf(teVar.f13777d));
        a(contentValues, "value", teVar.f13778e);
        try {
            if (v().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                h().t().a("Failed to insert/update user property (got -1). appId", Bb.a(teVar.f13774a));
            }
        } catch (SQLiteException e2) {
            h().t().a("Error storing user property. appId", Bb.a(teVar.f13774a), e2);
        }
        return true;
    }

    public final boolean a(String str, Long l2, long j2, T t) {
        c();
        r();
        C0563t.a(t);
        C0563t.b(str);
        C0563t.a(l2);
        byte[] g2 = t.g();
        h().B().a("Saving complex main event, appId, data size", e().a(str), Integer.valueOf(g2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", g2);
        try {
            if (v().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            h().t().a("Failed to insert complex main event (got -1). appId", Bb.a(str));
            return false;
        } catch (SQLiteException e2) {
            h().t().a("Error storing complex main event. appId", Bb.a(str), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011b A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011f A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0155 A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0157 A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0166 A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017b A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0197 A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0198 A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a7 A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01dd A[Catch:{ SQLiteException -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C3138ec b(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r35
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r35)
            r34.c()
            r34.r()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r34.v()     // Catch:{ SQLiteException -> 0x0203, all -> 0x01fe }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x0203, all -> 0x01fe }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0203, all -> 0x01fe }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x0203, all -> 0x01fe }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0203, all -> 0x01fe }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            if (r4 != 0) goto L_0x006b
            if (r3 == 0) goto L_0x006a
            r3.close()
        L_0x006a:
            return r2
        L_0x006b:
            com.google.android.gms.measurement.internal.ec r4 = new com.google.android.gms.measurement.internal.ec     // Catch:{ SQLiteException -> 0x01fa, all -> 0x01f6 }
            r5 = r34
            com.google.android.gms.measurement.internal.ke r6 = r5.f13609b     // Catch:{ SQLiteException -> 0x01f4 }
            com.google.android.gms.measurement.internal.fc r6 = r6.t()     // Catch:{ SQLiteException -> 0x01f4 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x01f4 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.a((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.b((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.e((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.g((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.a((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.b((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.g((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.h((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.d((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.e((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r7 != 0) goto L_0x00d9
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = 0
            goto L_0x00da
        L_0x00d9:
            r6 = 1
        L_0x00da:
            r4.a((boolean) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.j(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.k(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.l(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.m(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.h((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.i((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01f4 }
        L_0x0124:
            r4.c((long) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.f((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.o(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.n(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.i((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 22
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r8 = 0
            if (r7 == 0) goto L_0x0157
            r6 = r8
            goto L_0x015b
        L_0x0157:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01f4 }
        L_0x015b:
            r4.p(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r7 != 0) goto L_0x016f
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r6 == 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r6 = 0
            goto L_0x0170
        L_0x016f:
            r6 = 1
        L_0x0170:
            r4.b((boolean) r6)     // Catch:{ SQLiteException -> 0x01f4 }
            r6 = 24
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r7 != 0) goto L_0x0183
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r6 == 0) goto L_0x0182
            goto L_0x0183
        L_0x0182:
            r0 = 0
        L_0x0183:
            r4.c((boolean) r0)     // Catch:{ SQLiteException -> 0x01f4 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.c((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x01f4 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r6 == 0) goto L_0x0198
            goto L_0x019c
        L_0x0198:
            long r8 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x01f4 }
        L_0x019c:
            r4.f((long) r8)     // Catch:{ SQLiteException -> 0x01f4 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r6 != 0) goto L_0x01b9
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01f4 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.a((java.util.List<java.lang.String>) r0)     // Catch:{ SQLiteException -> 0x01f4 }
        L_0x01b9:
            boolean r0 = c.b.b.b.d.f.Le.b()     // Catch:{ SQLiteException -> 0x01f4 }
            if (r0 == 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.Ie r0 = r34.m()     // Catch:{ SQLiteException -> 0x01f4 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C3202q.Fa     // Catch:{ SQLiteException -> 0x01f4 }
            boolean r0 = r0.e(r1, r6)     // Catch:{ SQLiteException -> 0x01f4 }
            if (r0 == 0) goto L_0x01d4
            r0 = 28
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x01f4 }
            r4.d((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x01f4 }
        L_0x01d4:
            r4.k()     // Catch:{ SQLiteException -> 0x01f4 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01f4 }
            if (r0 == 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.Bb r0 = r34.h()     // Catch:{ SQLiteException -> 0x01f4 }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ SQLiteException -> 0x01f4 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r35)     // Catch:{ SQLiteException -> 0x01f4 }
            r0.a(r6, r7)     // Catch:{ SQLiteException -> 0x01f4 }
        L_0x01ee:
            if (r3 == 0) goto L_0x01f3
            r3.close()
        L_0x01f3:
            return r4
        L_0x01f4:
            r0 = move-exception
            goto L_0x0207
        L_0x01f6:
            r0 = move-exception
            r5 = r34
            goto L_0x021f
        L_0x01fa:
            r0 = move-exception
            r5 = r34
            goto L_0x0207
        L_0x01fe:
            r0 = move-exception
            r5 = r34
            r3 = r2
            goto L_0x021f
        L_0x0203:
            r0 = move-exception
            r5 = r34
            r3 = r2
        L_0x0207:
            com.google.android.gms.measurement.internal.Bb r4 = r34.h()     // Catch:{ all -> 0x021e }
            com.google.android.gms.measurement.internal.Db r4 = r4.t()     // Catch:{ all -> 0x021e }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r35)     // Catch:{ all -> 0x021e }
            r4.a(r6, r1, r0)     // Catch:{ all -> 0x021e }
            if (r3 == 0) goto L_0x021d
            r3.close()
        L_0x021d:
            return r2
        L_0x021e:
            r0 = move-exception
        L_0x021f:
            if (r3 == 0) goto L_0x0224
            r3.close()
        L_0x0224:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.b(java.lang.String):com.google.android.gms.measurement.internal.ec");
    }

    public final List<Ge> b(String str, String str2, String str3) {
        C0563t.b(str);
        c();
        r();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void b(String str, String str2) {
        C0563t.b(str);
        C0563t.b(str2);
        c();
        r();
        try {
            h().B().a("Deleted user attribute rows", Integer.valueOf(v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e2) {
            h().t().a("Error deleting user attribute. appId", Bb.a(str), e().c(str2), e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0159, code lost:
        r8.a(r10, r11, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r18, java.util.List<c.b.b.b.d.f.B> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "app_id=? and audience_id=?"
            java.lang.String r4 = "event_filters"
            java.lang.String r5 = "app_id=?"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.C0563t.a(r19)
            r8 = 0
        L_0x0012:
            int r9 = r19.size()
            if (r8 >= r9) goto L_0x00c5
            java.lang.Object r9 = r2.get(r8)
            c.b.b.b.d.f.B r9 = (c.b.b.b.d.f.B) r9
            c.b.b.b.d.f.Lb$b r9 = r9.k()
            c.b.b.b.d.f.B$a r9 = (c.b.b.b.d.f.B.a) r9
            int r11 = r9.l()
            if (r11 == 0) goto L_0x008e
            r11 = 0
        L_0x002b:
            int r12 = r9.l()
            if (r11 >= r12) goto L_0x008e
            c.b.b.b.d.f.C r12 = r9.b(r11)
            c.b.b.b.d.f.Lb$b r12 = r12.k()
            c.b.b.b.d.f.C$a r12 = (c.b.b.b.d.f.C.a) r12
            java.lang.Object r13 = r12.clone()
            c.b.b.b.d.f.C$a r13 = (c.b.b.b.d.f.C.a) r13
            java.lang.String r14 = r12.k()
            java.lang.String r14 = com.google.android.gms.measurement.internal.Ac.a(r14)
            if (r14 == 0) goto L_0x0050
            r13.a((java.lang.String) r14)
            r14 = 1
            goto L_0x0051
        L_0x0050:
            r14 = 0
        L_0x0051:
            r15 = r14
            r14 = 0
        L_0x0053:
            int r7 = r12.l()
            if (r14 >= r7) goto L_0x007d
            c.b.b.b.d.f.D r7 = r12.a((int) r14)
            java.lang.String r16 = r7.u()
            java.lang.String r10 = com.google.android.gms.measurement.internal.Dc.a(r16)
            if (r10 == 0) goto L_0x007a
            c.b.b.b.d.f.Lb$b r7 = r7.k()
            c.b.b.b.d.f.D$a r7 = (c.b.b.b.d.f.D.a) r7
            r7.a(r10)
            c.b.b.b.d.f.wc r7 = r7.j()
            c.b.b.b.d.f.D r7 = (c.b.b.b.d.f.D) r7
            r13.a(r14, r7)
            r15 = 1
        L_0x007a:
            int r14 = r14 + 1
            goto L_0x0053
        L_0x007d:
            if (r15 == 0) goto L_0x008b
            r9.a((int) r11, (c.b.b.b.d.f.C.a) r13)
            c.b.b.b.d.f.wc r7 = r9.j()
            c.b.b.b.d.f.B r7 = (c.b.b.b.d.f.B) r7
            r2.set(r8, r7)
        L_0x008b:
            int r11 = r11 + 1
            goto L_0x002b
        L_0x008e:
            int r7 = r9.k()
            if (r7 == 0) goto L_0x00c1
            r7 = 0
        L_0x0095:
            int r10 = r9.k()
            if (r7 >= r10) goto L_0x00c1
            c.b.b.b.d.f.F r10 = r9.a(r7)
            java.lang.String r11 = r10.q()
            java.lang.String r11 = com.google.android.gms.measurement.internal.Cc.a(r11)
            if (r11 == 0) goto L_0x00be
            c.b.b.b.d.f.Lb$b r10 = r10.k()
            c.b.b.b.d.f.F$a r10 = (c.b.b.b.d.f.F.a) r10
            r10.a(r11)
            r9.a((int) r7, (c.b.b.b.d.f.F.a) r10)
            c.b.b.b.d.f.wc r10 = r9.j()
            c.b.b.b.d.f.B r10 = (c.b.b.b.d.f.B) r10
            r2.set(r8, r10)
        L_0x00be:
            int r7 = r7 + 1
            goto L_0x0095
        L_0x00c1:
            int r8 = r8 + 1
            goto L_0x0012
        L_0x00c5:
            r17.r()
            r17.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r18)
            com.google.android.gms.common.internal.C0563t.a(r19)
            android.database.sqlite.SQLiteDatabase r7 = r17.v()
            r7.beginTransaction()
            r17.r()     // Catch:{ all -> 0x022b }
            r17.c()     // Catch:{ all -> 0x022b }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r18)     // Catch:{ all -> 0x022b }
            android.database.sqlite.SQLiteDatabase r8 = r17.v()     // Catch:{ all -> 0x022b }
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x022b }
            r11 = 0
            r10[r11] = r0     // Catch:{ all -> 0x022b }
            r8.delete(r6, r5, r10)     // Catch:{ all -> 0x022b }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x022b }
            r10[r11] = r0     // Catch:{ all -> 0x022b }
            r8.delete(r4, r5, r10)     // Catch:{ all -> 0x022b }
            java.util.Iterator r5 = r19.iterator()     // Catch:{ all -> 0x022b }
        L_0x00f9:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x022b }
            if (r8 == 0) goto L_0x01f8
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x022b }
            c.b.b.b.d.f.B r8 = (c.b.b.b.d.f.B) r8     // Catch:{ all -> 0x022b }
            r17.r()     // Catch:{ all -> 0x022b }
            r17.c()     // Catch:{ all -> 0x022b }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r18)     // Catch:{ all -> 0x022b }
            com.google.android.gms.common.internal.C0563t.a(r8)     // Catch:{ all -> 0x022b }
            boolean r9 = r8.o()     // Catch:{ all -> 0x022b }
            if (r9 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.Bb r8 = r17.h()     // Catch:{ all -> 0x022b }
            com.google.android.gms.measurement.internal.Db r8 = r8.w()     // Catch:{ all -> 0x022b }
            java.lang.String r9 = "Audience with no ID. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r18)     // Catch:{ all -> 0x022b }
            r8.a(r9, r10)     // Catch:{ all -> 0x022b }
            goto L_0x00f9
        L_0x0129:
            int r9 = r8.p()     // Catch:{ all -> 0x022b }
            java.util.List r10 = r8.s()     // Catch:{ all -> 0x022b }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x022b }
        L_0x0135:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x022b }
            if (r11 == 0) goto L_0x015d
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x022b }
            c.b.b.b.d.f.C r11 = (c.b.b.b.d.f.C) r11     // Catch:{ all -> 0x022b }
            boolean r11 = r11.o()     // Catch:{ all -> 0x022b }
            if (r11 != 0) goto L_0x0135
            com.google.android.gms.measurement.internal.Bb r8 = r17.h()     // Catch:{ all -> 0x022b }
            com.google.android.gms.measurement.internal.Db r8 = r8.w()     // Catch:{ all -> 0x022b }
            java.lang.String r10 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r18)     // Catch:{ all -> 0x022b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x022b }
        L_0x0159:
            r8.a(r10, r11, r9)     // Catch:{ all -> 0x022b }
            goto L_0x00f9
        L_0x015d:
            java.util.List r10 = r8.q()     // Catch:{ all -> 0x022b }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x022b }
        L_0x0165:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x022b }
            if (r11 == 0) goto L_0x018a
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x022b }
            c.b.b.b.d.f.F r11 = (c.b.b.b.d.f.F) r11     // Catch:{ all -> 0x022b }
            boolean r11 = r11.o()     // Catch:{ all -> 0x022b }
            if (r11 != 0) goto L_0x0165
            com.google.android.gms.measurement.internal.Bb r8 = r17.h()     // Catch:{ all -> 0x022b }
            com.google.android.gms.measurement.internal.Db r8 = r8.w()     // Catch:{ all -> 0x022b }
            java.lang.String r10 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r18)     // Catch:{ all -> 0x022b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x022b }
            goto L_0x0159
        L_0x018a:
            java.util.List r10 = r8.s()     // Catch:{ all -> 0x022b }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x022b }
        L_0x0192:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x022b }
            if (r11 == 0) goto L_0x01a6
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x022b }
            c.b.b.b.d.f.C r11 = (c.b.b.b.d.f.C) r11     // Catch:{ all -> 0x022b }
            boolean r11 = r1.a((java.lang.String) r0, (int) r9, (c.b.b.b.d.f.C) r11)     // Catch:{ all -> 0x022b }
            if (r11 != 0) goto L_0x0192
            r10 = 0
            goto L_0x01a7
        L_0x01a6:
            r10 = 1
        L_0x01a7:
            if (r10 == 0) goto L_0x01c4
            java.util.List r8 = r8.q()     // Catch:{ all -> 0x022b }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x022b }
        L_0x01b1:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x022b }
            if (r11 == 0) goto L_0x01c4
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x022b }
            c.b.b.b.d.f.F r11 = (c.b.b.b.d.f.F) r11     // Catch:{ all -> 0x022b }
            boolean r11 = r1.a((java.lang.String) r0, (int) r9, (c.b.b.b.d.f.F) r11)     // Catch:{ all -> 0x022b }
            if (r11 != 0) goto L_0x01b1
            r10 = 0
        L_0x01c4:
            if (r10 != 0) goto L_0x01f4
            r17.r()     // Catch:{ all -> 0x022b }
            r17.c()     // Catch:{ all -> 0x022b }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r18)     // Catch:{ all -> 0x022b }
            android.database.sqlite.SQLiteDatabase r8 = r17.v()     // Catch:{ all -> 0x022b }
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x022b }
            r12 = 0
            r11[r12] = r0     // Catch:{ all -> 0x022b }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x022b }
            r13 = 1
            r11[r13] = r12     // Catch:{ all -> 0x022b }
            r8.delete(r6, r3, r11)     // Catch:{ all -> 0x022b }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x022b }
            r11 = 0
            r10[r11] = r0     // Catch:{ all -> 0x022b }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x022b }
            r12 = 1
            r10[r12] = r9     // Catch:{ all -> 0x022b }
            r8.delete(r4, r3, r10)     // Catch:{ all -> 0x022b }
            goto L_0x00f9
        L_0x01f4:
            r11 = 0
            r12 = 1
            goto L_0x00f9
        L_0x01f8:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x022b }
            r3.<init>()     // Catch:{ all -> 0x022b }
            java.util.Iterator r2 = r19.iterator()     // Catch:{ all -> 0x022b }
        L_0x0201:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x022b }
            if (r4 == 0) goto L_0x0221
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x022b }
            c.b.b.b.d.f.B r4 = (c.b.b.b.d.f.B) r4     // Catch:{ all -> 0x022b }
            boolean r5 = r4.o()     // Catch:{ all -> 0x022b }
            if (r5 == 0) goto L_0x021c
            int r4 = r4.p()     // Catch:{ all -> 0x022b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x022b }
            goto L_0x021d
        L_0x021c:
            r4 = 0
        L_0x021d:
            r3.add(r4)     // Catch:{ all -> 0x022b }
            goto L_0x0201
        L_0x0221:
            r1.c((java.lang.String) r0, (java.util.List<java.lang.Integer>) r3)     // Catch:{ all -> 0x022b }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x022b }
            r7.endTransaction()
            return
        L_0x022b:
            r0 = move-exception
            r7.endTransaction()
            goto L_0x0231
        L_0x0230:
            throw r0
        L_0x0231:
            goto L_0x0230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.b(java.lang.String, java.util.List):void");
    }

    public final long c(String str) {
        C0563t.b(str);
        c();
        r();
        try {
            return (long) v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, m().b(str, C3202q.r))))});
        } catch (SQLiteException e2) {
            h().t().a("Error deleting over the limit events. appId", Bb.a(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.te c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r19)
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r20)
            r18.c()
            r18.r()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.v()     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.a((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.te r0 = new com.google.android.gms.measurement.internal.te     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.Bb r1 = r18.h()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0087
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0087
        L_0x007e:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00a7
        L_0x0083:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0087:
            com.google.android.gms.measurement.internal.Bb r1 = r18.h()     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r19)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.zb r4 = r18.e()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = r4.c(r8)     // Catch:{ all -> 0x00a6 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x00a6 }
            if (r10 == 0) goto L_0x00a5
            r10.close()
        L_0x00a5:
            return r9
        L_0x00a6:
            r0 = move-exception
        L_0x00a7:
            if (r10 == 0) goto L_0x00ac
            r10.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.te");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.Ge d(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r30)
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r31)
            r29.c()
            r29.r()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.v()     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.a((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = 1
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.oe r0 = r29.n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.o> r2 = com.google.android.gms.measurement.internal.C3192o.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.measurement.internal.o r22 = (com.google.android.gms.measurement.internal.C3192o) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.oe r0 = r29.n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.o> r2 = com.google.android.gms.measurement.internal.C3192o.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.measurement.internal.o r25 = (com.google.android.gms.measurement.internal.C3192o) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.oe r0 = r29.n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.o> r2 = com.google.android.gms.measurement.internal.C3192o.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.measurement.internal.o r28 = (com.google.android.gms.measurement.internal.C3192o) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.re r17 = new com.google.android.gms.measurement.internal.re     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.Ge r0 = new com.google.android.gms.measurement.internal.Ge     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.Bb r1 = r29.h()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zb r4 = r29.e()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.c(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0103
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0103
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            r9 = r8
            goto L_0x0123
        L_0x00ff:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0103:
            com.google.android.gms.measurement.internal.Bb r1 = r29.h()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r30)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.zb r4 = r29.e()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = r4.c(r7)     // Catch:{ all -> 0x0122 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x0122 }
            if (r9 == 0) goto L_0x0121
            r9.close()
        L_0x0121:
            return r8
        L_0x0122:
            r0 = move-exception
        L_0x0123:
            if (r9 == 0) goto L_0x0128
            r9.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.Ge");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r11)
            r10.c()
            r10.r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.v()     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.Bb r3 = r10.h()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.a(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0059
        L_0x0054:
            r11 = move-exception
            r1 = r0
            goto L_0x0071
        L_0x0057:
            r2 = move-exception
            r1 = r0
        L_0x0059:
            com.google.android.gms.measurement.internal.Bb r3 = r10.h()     // Catch:{ all -> 0x0070 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r11)     // Catch:{ all -> 0x0070 }
            r3.a(r4, r11, r2)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x006f
            r1.close()
        L_0x006f:
            return r0
        L_0x0070:
            r11 = move-exception
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.d(java.lang.String):byte[]");
    }

    public final int e(String str, String str2) {
        C0563t.b(str);
        C0563t.b(str2);
        c();
        r();
        try {
            return v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            h().t().a("Error deleting conditional property", Bb.a(str), e().c(str2), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> e(java.lang.String r8) {
        /*
            r7 = this;
            r7.r()
            r7.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r8)
            b.e.b r0 = new b.e.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.v()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006c
        L_0x0067:
            r8 = move-exception
            r1 = r2
            goto L_0x0084
        L_0x006a:
            r0 = move-exception
            r1 = r2
        L_0x006c:
            com.google.android.gms.measurement.internal.Bb r3 = r7.h()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r8)     // Catch:{ all -> 0x0083 }
            r3.a(r4, r8, r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            return r2
        L_0x0083:
            r8 = move-exception
        L_0x0084:
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            goto L_0x008b
        L_0x008a:
            throw r8
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.e(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, c.b.b.b.d.f.Z> f(java.lang.String r12) {
        /*
            r11 = this;
            r11.r()
            r11.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.v()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x0080, all -> 0x007d }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0080, all -> 0x007d }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x0080, all -> 0x007d }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0080, all -> 0x007d }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x007b }
            if (r1 != 0) goto L_0x0033
            if (r0 == 0) goto L_0x0032
            r0.close()
        L_0x0032:
            return r8
        L_0x0033:
            b.e.b r1 = new b.e.b     // Catch:{ SQLiteException -> 0x007b }
            r1.<init>()     // Catch:{ SQLiteException -> 0x007b }
        L_0x0038:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x007b }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x007b }
            c.b.b.b.d.f.Z$a r4 = c.b.b.b.d.f.Z.w()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.measurement.internal.oe.a(r4, (byte[]) r3)     // Catch:{ IOException -> 0x0059 }
            c.b.b.b.d.f.Z$a r4 = (c.b.b.b.d.f.Z.a) r4     // Catch:{ IOException -> 0x0059 }
            c.b.b.b.d.f.wc r3 = r4.j()     // Catch:{ IOException -> 0x0059 }
            c.b.b.b.d.f.Lb r3 = (c.b.b.b.d.f.Lb) r3     // Catch:{ IOException -> 0x0059 }
            c.b.b.b.d.f.Z r3 = (c.b.b.b.d.f.Z) r3     // Catch:{ IOException -> 0x0059 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007b }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x007b }
            goto L_0x006f
        L_0x0059:
            r3 = move-exception
            com.google.android.gms.measurement.internal.Bb r4 = r11.h()     // Catch:{ SQLiteException -> 0x007b }
            com.google.android.gms.measurement.internal.Db r4 = r4.t()     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007b }
            r4.a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x007b }
        L_0x006f:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x007b }
            if (r2 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x007a
            r0.close()
        L_0x007a:
            return r1
        L_0x007b:
            r1 = move-exception
            goto L_0x0082
        L_0x007d:
            r12 = move-exception
            r0 = r8
            goto L_0x009a
        L_0x0080:
            r1 = move-exception
            r0 = r8
        L_0x0082:
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()     // Catch:{ all -> 0x0099 }
            com.google.android.gms.measurement.internal.Db r2 = r2.t()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r12)     // Catch:{ all -> 0x0099 }
            r2.a(r3, r12, r1)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0098
            r0.close()
        L_0x0098:
            return r8
        L_0x0099:
            r12 = move-exception
        L_0x009a:
            if (r0 == 0) goto L_0x009f
            r0.close()
        L_0x009f:
            goto L_0x00a1
        L_0x00a0:
            throw r12
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.f(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<c.b.b.b.d.f.C>> f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.r()
            r12.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r13)
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r14)
            b.e.b r0 = new b.e.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            c.b.b.b.d.f.C$a r2 = c.b.b.b.d.f.C.z()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.oe.a(r2, (byte[]) r1)     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.C$a r2 = (c.b.b.b.d.f.C.a) r2     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.wc r1 = r2.j()     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.Lb r1 = (c.b.b.b.d.f.Lb) r1     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.C r1 = (c.b.b.b.d.f.C) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.Bb r2 = r12.h()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.Db r2 = r2.t()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009c
        L_0x0097:
            r13 = move-exception
            r14 = r9
            goto L_0x00b4
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            com.google.android.gms.measurement.internal.Bb r1 = r12.h()     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ all -> 0x00b3 }
            r1.a(r2, r13, r0)     // Catch:{ all -> 0x00b3 }
            if (r14 == 0) goto L_0x00b2
            r14.close()
        L_0x00b2:
            return r9
        L_0x00b3:
            r13 = move-exception
        L_0x00b4:
            if (r14 == 0) goto L_0x00b9
            r14.close()
        L_0x00b9:
            goto L_0x00bb
        L_0x00ba:
            throw r13
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.f(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long g(String str) {
        C0563t.b(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<c.b.b.b.d.f.F>> g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.r()
            r12.c()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r13)
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r14)
            b.e.b r0 = new b.e.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.v()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            c.b.b.b.d.f.F$a r2 = c.b.b.b.d.f.F.w()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.oe.a(r2, (byte[]) r1)     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.F$a r2 = (c.b.b.b.d.f.F.a) r2     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.wc r1 = r2.j()     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.Lb r1 = (c.b.b.b.d.f.Lb) r1     // Catch:{ IOException -> 0x0077 }
            c.b.b.b.d.f.F r1 = (c.b.b.b.d.f.F) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.Bb r2 = r12.h()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.Db r2 = r2.t()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009c
        L_0x0097:
            r13 = move-exception
            r14 = r9
            goto L_0x00b4
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            com.google.android.gms.measurement.internal.Bb r1 = r12.h()     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.measurement.internal.Db r1 = r1.t()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ all -> 0x00b3 }
            r1.a(r2, r13, r0)     // Catch:{ all -> 0x00b3 }
            if (r14 == 0) goto L_0x00b2
            r14.close()
        L_0x00b2:
            return r9
        L_0x00b3:
            r13 = move-exception
        L_0x00b4:
            if (r14 == 0) goto L_0x00b9
            r14.close()
        L_0x00b9:
            goto L_0x00bb
        L_0x00ba:
            throw r13
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    public final long h(String str, String str2) {
        long j2;
        String str3 = str;
        String str4 = str2;
        C0563t.b(str);
        C0563t.b(str2);
        c();
        r();
        SQLiteDatabase v = v();
        v.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                j2 = a(sb.toString(), new String[]{str3}, -1);
                if (j2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (v.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        h().t().a("Failed to insert column (got -1). appId", Bb.a(str), str4);
                        v.endTransaction();
                        return -1;
                    }
                    j2 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str3);
                    contentValues2.put(str4, Long.valueOf(1 + j2));
                    if (((long) v.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                        h().t().a("Failed to update column (got 0). appId", Bb.a(str), str4);
                        v.endTransaction();
                        return -1;
                    }
                    v.setTransactionSuccessful();
                    v.endTransaction();
                    return j2;
                } catch (SQLiteException e2) {
                    e = e2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                j2 = 0;
                try {
                    h().t().a("Error inserting column. appId", Bb.a(str), str4, e);
                    v.endTransaction();
                    return j2;
                } catch (Throwable th) {
                    th = th;
                    v.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e4) {
            e = e4;
            j2 = 0;
            h().t().a("Error inserting column. appId", Bb.a(str), str4, e);
            v.endTransaction();
            return j2;
        } catch (Throwable th2) {
            th = th2;
            v.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    public final void u() {
        r();
        v().setTransactionSuccessful();
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase v() {
        c();
        try {
            return this.l.getWritableDatabase();
        } catch (SQLiteException e2) {
            h().w().a("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.v()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.Bb r3 = r6.h()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3129d.w():java.lang.String");
    }

    public final long x() {
        Cursor cursor = null;
        try {
            cursor = v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j2 = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            h().t().a("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
