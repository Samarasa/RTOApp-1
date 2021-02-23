package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.measurement.internal.xb  reason: case insensitive filesystem */
public final class C3238xb extends C3137eb {

    /* renamed from: c  reason: collision with root package name */
    private final C3233wb f13814c = new C3233wb(this, f(), "google_app_measurement_local.db");

    /* renamed from: d  reason: collision with root package name */
    private boolean f13815d;

    C3238xb(C3144fc fcVar) {
        super(fcVar);
    }

    private final SQLiteDatabase E() {
        if (this.f13815d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f13814c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f13815d = true;
        return null;
    }

    private final boolean F() {
        return f().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        if (r8.inTransaction() != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        r8.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f6, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fb, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ff, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0100, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010c, code lost:
        r8.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:9:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd A[SYNTHETIC, Splitter:B:55:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "Error writing entry to local database"
            r17.a()
            r17.c()
            boolean r0 = r1.f13815d
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.String r5 = "type"
            r4.put(r5, r0)
            java.lang.String r0 = "entry"
            r5 = r19
            r4.put(r0, r5)
            r5 = 5
            r6 = 0
            r7 = 5
        L_0x0028:
            if (r6 >= r5) goto L_0x0141
            r8 = 0
            r9 = 1
            android.database.sqlite.SQLiteDatabase r10 = r17.E()     // Catch:{ SQLiteFullException -> 0x0115, SQLiteDatabaseLockedException -> 0x0102, SQLiteException -> 0x00d8, all -> 0x00d2 }
            if (r10 != 0) goto L_0x0041
            r1.f13815d = r9     // Catch:{ SQLiteFullException -> 0x003e, SQLiteDatabaseLockedException -> 0x00cc, SQLiteException -> 0x003a }
            if (r10 == 0) goto L_0x0039
            r10.close()
        L_0x0039:
            return r3
        L_0x003a:
            r0 = move-exception
            r13 = r8
            goto L_0x00ca
        L_0x003e:
            r0 = move-exception
            goto L_0x0118
        L_0x0041:
            r10.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00cf, SQLiteDatabaseLockedException -> 0x00cc, SQLiteException -> 0x00c7, all -> 0x00c2 }
            r11 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r13 = r10.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00cf, SQLiteDatabaseLockedException -> 0x00cc, SQLiteException -> 0x00c7, all -> 0x00c2 }
            if (r13 == 0) goto L_0x0063
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            if (r0 == 0) goto L_0x0063
            long r11 = r13.getLong(r3)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            goto L_0x0063
        L_0x0059:
            r0 = move-exception
            goto L_0x0136
        L_0x005c:
            r0 = move-exception
            goto L_0x00ca
        L_0x005f:
            r0 = move-exception
            r8 = r13
            goto L_0x0118
        L_0x0063:
            java.lang.String r0 = "messages"
            r14 = 100000(0x186a0, double:4.94066E-319)
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00aa
            com.google.android.gms.measurement.internal.Bb r16 = r17.h()     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            com.google.android.gms.measurement.internal.Db r5 = r16.t()     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            java.lang.String r8 = "Data loss, local db full"
            r5.a(r8)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            long r14 = r14 - r11
            r11 = 1
            long r14 = r14 + r11
            java.lang.String r5 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            java.lang.String r11 = java.lang.Long.toString(r14)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            r8[r3] = r11     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            int r5 = r10.delete(r0, r5, r8)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            long r11 = (long) r5     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x00aa
            com.google.android.gms.measurement.internal.Bb r5 = r17.h()     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            java.lang.String r8 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            long r14 = r14 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            r5.a(r8, r3, r9, r11)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
        L_0x00aa:
            r3 = 0
            r10.insertOrThrow(r0, r3, r4)     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            r10.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            r10.endTransaction()     // Catch:{ SQLiteFullException -> 0x005f, SQLiteDatabaseLockedException -> 0x00c0, SQLiteException -> 0x005c, all -> 0x0059 }
            if (r13 == 0) goto L_0x00b9
            r13.close()
        L_0x00b9:
            if (r10 == 0) goto L_0x00be
            r10.close()
        L_0x00be:
            r2 = 1
            return r2
        L_0x00c0:
            r8 = r13
            goto L_0x0104
        L_0x00c2:
            r0 = move-exception
            r3 = r8
            r13 = r3
            goto L_0x0136
        L_0x00c7:
            r0 = move-exception
            r3 = r8
            r13 = r3
        L_0x00ca:
            r8 = r10
            goto L_0x00db
        L_0x00cc:
            r3 = r8
            r8 = r3
            goto L_0x0104
        L_0x00cf:
            r0 = move-exception
            r3 = r8
            goto L_0x0118
        L_0x00d2:
            r0 = move-exception
            r3 = r8
            r10 = r3
            r13 = r10
            goto L_0x0136
        L_0x00d8:
            r0 = move-exception
            r3 = r8
            r13 = r8
        L_0x00db:
            if (r8 == 0) goto L_0x00e6
            boolean r3 = r8.inTransaction()     // Catch:{ all -> 0x00ff }
            if (r3 == 0) goto L_0x00e6
            r8.endTransaction()     // Catch:{ all -> 0x00ff }
        L_0x00e6:
            com.google.android.gms.measurement.internal.Bb r3 = r17.h()     // Catch:{ all -> 0x00ff }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x00ff }
            r3.a(r2, r0)     // Catch:{ all -> 0x00ff }
            r3 = 1
            r1.f13815d = r3     // Catch:{ all -> 0x00ff }
            if (r13 == 0) goto L_0x00f9
            r13.close()
        L_0x00f9:
            if (r8 == 0) goto L_0x012e
            r8.close()
            goto L_0x012e
        L_0x00ff:
            r0 = move-exception
            r10 = r8
            goto L_0x0136
        L_0x0102:
            r3 = r8
            r10 = r8
        L_0x0104:
            long r11 = (long) r7
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0134 }
            int r7 = r7 + 20
            if (r8 == 0) goto L_0x010f
            r8.close()
        L_0x010f:
            if (r10 == 0) goto L_0x012e
        L_0x0111:
            r10.close()
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r3 = r8
            r10 = r8
        L_0x0118:
            com.google.android.gms.measurement.internal.Bb r3 = r17.h()     // Catch:{ all -> 0x0134 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x0134 }
            r3.a(r2, r0)     // Catch:{ all -> 0x0134 }
            r3 = 1
            r1.f13815d = r3     // Catch:{ all -> 0x0134 }
            if (r8 == 0) goto L_0x012b
            r8.close()
        L_0x012b:
            if (r10 == 0) goto L_0x012e
            goto L_0x0111
        L_0x012e:
            int r6 = r6 + 1
            r3 = 0
            r5 = 5
            goto L_0x0028
        L_0x0134:
            r0 = move-exception
            r13 = r8
        L_0x0136:
            if (r13 == 0) goto L_0x013b
            r13.close()
        L_0x013b:
            if (r10 == 0) goto L_0x0140
            r10.close()
        L_0x0140:
            throw r0
        L_0x0141:
            com.google.android.gms.measurement.internal.Bb r0 = r17.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.w()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3238xb.a(int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean A() {
        return false;
    }

    public final void B() {
        a();
        c();
        try {
            int delete = E().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                h().B().a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            h().t().a("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean C() {
        return a(3, new byte[0]);
    }

    public final boolean D() {
        c();
        a();
        if (this.f13815d || !F()) {
            return false;
        }
        int i = 0;
        int i2 = 5;
        while (i < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = E();
                if (sQLiteDatabase == null) {
                    this.f13815d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            } catch (SQLiteFullException e2) {
                h().t().a("Error deleting app launch break from local database", e2);
                this.f13815d = true;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i2);
                i2 += 20;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteException e3) {
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                h().t().a("Error deleting app launch break from local database", e3);
                this.f13815d = true;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    i++;
                } else {
                    i++;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        h().w().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v15, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v17, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v41, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v42, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v43, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v44, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v45, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v46, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v48, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v51, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v54, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v55, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v56, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v57, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r24v14 */
    /* JADX WARNING: type inference failed for: r24v31 */
    /* JADX WARNING: type inference failed for: r24v49 */
    /* JADX WARNING: type inference failed for: r24v52 */
    /* JADX WARNING: type inference failed for: r24v53 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:77|78|79|80) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:92|93|94|95) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:62|63|64|65|197) */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01e0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e1, code lost:
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e6, code lost:
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01e9, code lost:
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01ed, code lost:
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01fd, code lost:
        if (r13.inTransaction() != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01ff, code lost:
        r13.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0211, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0221, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x023c, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0246, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0249, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x024e, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r10 = null;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r10 = null;
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r10 = null;
        r13 = r15;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        h().t().a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        h().t().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        h().t().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0120 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0151 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01f9 A[SYNTHETIC, Splitter:B:152:0x01f9] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0242 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0242 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0242 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.a.a> a(int r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r2 = "Error reading entries from local database"
            r23.c()
            r23.a()
            boolean r0 = r1.f13815d
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r23.F()
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x001c:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x0020:
            if (r7 >= r5) goto L_0x0252
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r23.E()     // Catch:{ SQLiteFullException -> 0x022a, SQLiteDatabaseLockedException -> 0x0217, SQLiteException -> 0x01f4, all -> 0x01f0 }
            if (r15 != 0) goto L_0x0040
            r1.f13815d = r9     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x0036, all -> 0x0031 }
            if (r15 == 0) goto L_0x0030
            r15.close()
        L_0x0030:
            return r3
        L_0x0031:
            r0 = move-exception
            r10 = r3
            r13 = r15
            goto L_0x0247
        L_0x0036:
            r0 = move-exception
            r10 = r3
            r13 = r15
            goto L_0x01f7
        L_0x003b:
            r0 = move-exception
            r10 = r3
            r13 = r15
            goto L_0x022d
        L_0x0040:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01ec, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x01e5, all -> 0x01e0 }
            com.google.android.gms.measurement.internal.Ie r0 = r23.m()     // Catch:{ SQLiteFullException -> 0x01ec, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x01e5, all -> 0x01e0 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C3202q.ya     // Catch:{ SQLiteFullException -> 0x01ec, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x01e5, all -> 0x01e0 }
            boolean r0 = r0.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r10)     // Catch:{ SQLiteFullException -> 0x01ec, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x01e5, all -> 0x01e0 }
            r10 = 100
            java.lang.String r11 = "entry"
            java.lang.String r12 = "type"
            java.lang.String r13 = "rowid"
            r19 = -1
            if (r0 == 0) goto L_0x00a0
            long r16 = a((android.database.sqlite.SQLiteDatabase) r15)     // Catch:{ SQLiteFullException -> 0x009b, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x0096, all -> 0x0091 }
            int r0 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x0036, all -> 0x0031 }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x0036, all -> 0x0031 }
            r14[r6] = r16     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x0036, all -> 0x0031 }
            goto L_0x006e
        L_0x006c:
            r0 = r3
            r14 = r0
        L_0x006e:
            java.lang.String r16 = "messages"
            java.lang.String[] r12 = new java.lang.String[]{r13, r12, r11}     // Catch:{ SQLiteFullException -> 0x009b, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x0096, all -> 0x0091 }
            r17 = 0
            r18 = 0
            java.lang.String r21 = "rowid asc"
            java.lang.String r22 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x009b, SQLiteDatabaseLockedException -> 0x01e9, SQLiteException -> 0x0096, all -> 0x0091 }
            r10 = r15
            r11 = r16
            r13 = r0
            r24 = r15
            r15 = r17
            r16 = r18
            r17 = r21
            r18 = r22
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x01dc, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d5, all -> 0x01d1 }
            goto L_0x00ba
        L_0x0091:
            r0 = move-exception
            r24 = r15
            goto L_0x01d2
        L_0x0096:
            r0 = move-exception
            r24 = r15
            goto L_0x01d6
        L_0x009b:
            r0 = move-exception
            r24 = r15
            goto L_0x01dd
        L_0x00a0:
            r24 = r15
            java.lang.String r0 = "messages"
            java.lang.String[] r12 = new java.lang.String[]{r13, r12, r11}     // Catch:{ SQLiteFullException -> 0x01dc, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d5, all -> 0x01d1 }
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x01dc, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d5, all -> 0x01d1 }
            r10 = r24
            r11 = r0
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x01dc, SQLiteDatabaseLockedException -> 0x01d9, SQLiteException -> 0x01d5, all -> 0x01d1 }
        L_0x00ba:
            r10 = r0
        L_0x00bb:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            if (r0 == 0) goto L_0x0184
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            if (r0 != 0) goto L_0x0103
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            int r0 = r12.length     // Catch:{ a -> 0x00ee }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00ee }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00ee }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.o> r0 = com.google.android.gms.measurement.internal.C3192o.CREATOR     // Catch:{ a -> 0x00ee }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00ee }
            com.google.android.gms.measurement.internal.o r0 = (com.google.android.gms.measurement.internal.C3192o) r0     // Catch:{ a -> 0x00ee }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            if (r0 == 0) goto L_0x00bb
        L_0x00e8:
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            goto L_0x00bb
        L_0x00ec:
            r0 = move-exception
            goto L_0x00ff
        L_0x00ee:
            com.google.android.gms.measurement.internal.Bb r0 = r23.h()     // Catch:{ all -> 0x00ec }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ all -> 0x00ec }
            java.lang.String r12 = "Failed to load event from local database"
            r0.a(r12)     // Catch:{ all -> 0x00ec }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            goto L_0x00bb
        L_0x00ff:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
        L_0x0103:
            java.lang.String r13 = "Failed to load user property from local database"
            if (r0 != r9) goto L_0x0136
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            int r0 = r12.length     // Catch:{ a -> 0x0120 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x0120 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x0120 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.re> r0 = com.google.android.gms.measurement.internal.re.CREATOR     // Catch:{ a -> 0x0120 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x0120 }
            com.google.android.gms.measurement.internal.re r0 = (com.google.android.gms.measurement.internal.re) r0     // Catch:{ a -> 0x0120 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            goto L_0x012f
        L_0x011e:
            r0 = move-exception
            goto L_0x0132
        L_0x0120:
            com.google.android.gms.measurement.internal.Bb r0 = r23.h()     // Catch:{ all -> 0x011e }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ all -> 0x011e }
            r0.a(r13)     // Catch:{ all -> 0x011e }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r0 = r3
        L_0x012f:
            if (r0 == 0) goto L_0x00bb
            goto L_0x00e8
        L_0x0132:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
        L_0x0136:
            if (r0 != r11) goto L_0x0167
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            int r0 = r12.length     // Catch:{ a -> 0x0151 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x0151 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x0151 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.Ge> r0 = com.google.android.gms.measurement.internal.Ge.CREATOR     // Catch:{ a -> 0x0151 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x0151 }
            com.google.android.gms.measurement.internal.Ge r0 = (com.google.android.gms.measurement.internal.Ge) r0     // Catch:{ a -> 0x0151 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            goto L_0x0160
        L_0x014f:
            r0 = move-exception
            goto L_0x0163
        L_0x0151:
            com.google.android.gms.measurement.internal.Bb r0 = r23.h()     // Catch:{ all -> 0x014f }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ all -> 0x014f }
            r0.a(r13)     // Catch:{ all -> 0x014f }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r0 = r3
        L_0x0160:
            if (r0 == 0) goto L_0x00bb
            goto L_0x00e8
        L_0x0163:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            throw r0     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
        L_0x0167:
            r11 = 3
            if (r0 != r11) goto L_0x0179
            com.google.android.gms.measurement.internal.Bb r0 = r23.h()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            com.google.android.gms.measurement.internal.Db r0 = r0.w()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            java.lang.String r11 = "Skipping app launch break"
        L_0x0174:
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            goto L_0x00bb
        L_0x0179:
            com.google.android.gms.measurement.internal.Bb r0 = r23.h()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            java.lang.String r11 = "Unknown record type in local database"
            goto L_0x0174
        L_0x0184:
            java.lang.String r0 = "messages"
            java.lang.String r11 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            java.lang.String r13 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r12[r6] = r13     // Catch:{ SQLiteFullException -> 0x01cc, SQLiteDatabaseLockedException -> 0x01c8, SQLiteException -> 0x01c4, all -> 0x01bf }
            r13 = r24
            int r0 = r13.delete(r0, r11, r12)     // Catch:{ SQLiteFullException -> 0x01bc, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x01ba }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x01bc, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x01ba }
            if (r0 >= r11) goto L_0x01a9
            com.google.android.gms.measurement.internal.Bb r0 = r23.h()     // Catch:{ SQLiteFullException -> 0x01bc, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x01ba }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ SQLiteFullException -> 0x01bc, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x01ba }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.a(r11)     // Catch:{ SQLiteFullException -> 0x01bc, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x01ba }
        L_0x01a9:
            r13.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01bc, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x01ba }
            r13.endTransaction()     // Catch:{ SQLiteFullException -> 0x01bc, SQLiteDatabaseLockedException -> 0x0219, SQLiteException -> 0x01ba }
            if (r10 == 0) goto L_0x01b4
            r10.close()
        L_0x01b4:
            if (r13 == 0) goto L_0x01b9
            r13.close()
        L_0x01b9:
            return r4
        L_0x01ba:
            r0 = move-exception
            goto L_0x01f7
        L_0x01bc:
            r0 = move-exception
            goto L_0x022d
        L_0x01bf:
            r0 = move-exception
            r13 = r24
            goto L_0x0247
        L_0x01c4:
            r0 = move-exception
            r13 = r24
            goto L_0x01f7
        L_0x01c8:
            r13 = r24
            goto L_0x0219
        L_0x01cc:
            r0 = move-exception
            r13 = r24
            goto L_0x022d
        L_0x01d1:
            r0 = move-exception
        L_0x01d2:
            r13 = r24
            goto L_0x01e2
        L_0x01d5:
            r0 = move-exception
        L_0x01d6:
            r13 = r24
            goto L_0x01e7
        L_0x01d9:
            r13 = r24
            goto L_0x01ea
        L_0x01dc:
            r0 = move-exception
        L_0x01dd:
            r13 = r24
            goto L_0x01ee
        L_0x01e0:
            r0 = move-exception
            r13 = r15
        L_0x01e2:
            r10 = r3
            goto L_0x0247
        L_0x01e5:
            r0 = move-exception
            r13 = r15
        L_0x01e7:
            r10 = r3
            goto L_0x01f7
        L_0x01e9:
            r13 = r15
        L_0x01ea:
            r10 = r3
            goto L_0x0219
        L_0x01ec:
            r0 = move-exception
            r13 = r15
        L_0x01ee:
            r10 = r3
            goto L_0x022d
        L_0x01f0:
            r0 = move-exception
            r10 = r3
            r13 = r10
            goto L_0x0247
        L_0x01f4:
            r0 = move-exception
            r10 = r3
            r13 = r10
        L_0x01f7:
            if (r13 == 0) goto L_0x0202
            boolean r11 = r13.inTransaction()     // Catch:{ all -> 0x0246 }
            if (r11 == 0) goto L_0x0202
            r13.endTransaction()     // Catch:{ all -> 0x0246 }
        L_0x0202:
            com.google.android.gms.measurement.internal.Bb r11 = r23.h()     // Catch:{ all -> 0x0246 }
            com.google.android.gms.measurement.internal.Db r11 = r11.t()     // Catch:{ all -> 0x0246 }
            r11.a(r2, r0)     // Catch:{ all -> 0x0246 }
            r1.f13815d = r9     // Catch:{ all -> 0x0246 }
            if (r10 == 0) goto L_0x0214
            r10.close()
        L_0x0214:
            if (r13 == 0) goto L_0x0242
            goto L_0x0226
        L_0x0217:
            r10 = r3
            r13 = r10
        L_0x0219:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0246 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x0224
            r10.close()
        L_0x0224:
            if (r13 == 0) goto L_0x0242
        L_0x0226:
            r13.close()
            goto L_0x0242
        L_0x022a:
            r0 = move-exception
            r10 = r3
            r13 = r10
        L_0x022d:
            com.google.android.gms.measurement.internal.Bb r11 = r23.h()     // Catch:{ all -> 0x0246 }
            com.google.android.gms.measurement.internal.Db r11 = r11.t()     // Catch:{ all -> 0x0246 }
            r11.a(r2, r0)     // Catch:{ all -> 0x0246 }
            r1.f13815d = r9     // Catch:{ all -> 0x0246 }
            if (r10 == 0) goto L_0x023f
            r10.close()
        L_0x023f:
            if (r13 == 0) goto L_0x0242
            goto L_0x0226
        L_0x0242:
            int r7 = r7 + 1
            goto L_0x0020
        L_0x0246:
            r0 = move-exception
        L_0x0247:
            if (r10 == 0) goto L_0x024c
            r10.close()
        L_0x024c:
            if (r13 == 0) goto L_0x0251
            r13.close()
        L_0x0251:
            throw r0
        L_0x0252:
            com.google.android.gms.measurement.internal.Bb r0 = r23.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.w()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3238xb.a(int):java.util.List");
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final boolean a(Ge ge) {
        k();
        byte[] a2 = se.a((Parcelable) ge);
        if (a2.length <= 131072) {
            return a(2, a2);
        }
        h().w().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean a(C3192o oVar) {
        Parcel obtain = Parcel.obtain();
        oVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(0, marshall);
        }
        h().w().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean a(re reVar) {
        Parcel obtain = Parcel.obtain();
        reVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(1, marshall);
        }
        h().w().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }
}
