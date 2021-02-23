package b.p.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;

public interface c {

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f2666a;

        public a(int i) {
            this.f2666a = i;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e2) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e2);
                    }
                } catch (Exception e3) {
                    Log.w("SupportSQLite", "delete failed: ", e3);
                }
            }
        }

        public void a(b bVar) {
        }

        public abstract void a(b bVar, int i, int i2);

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(b.p.a.b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.getPath()
                r2.a((java.lang.String) r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.m()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0056
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a((java.lang.String) r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.getPath()
                r2.a((java.lang.String) r3)
            L_0x0055:
                throw r1
            L_0x0056:
                if (r0 == 0) goto L_0x0070
                java.util.Iterator r3 = r0.iterator()
            L_0x005c:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0077
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a((java.lang.String) r0)
                goto L_0x005c
            L_0x0070:
                java.lang.String r3 = r3.getPath()
                r2.a((java.lang.String) r3)
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.a.c.a.b(b.p.a.b):void");
        }

        public abstract void b(b bVar, int i, int i2);

        public abstract void c(b bVar);

        public void d(b bVar) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2667a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2668b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2669c;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f2670a;

            /* renamed from: b  reason: collision with root package name */
            String f2671b;

            /* renamed from: c  reason: collision with root package name */
            a f2672c;

            a(Context context) {
                this.f2670a = context;
            }

            public a a(a aVar) {
                this.f2672c = aVar;
                return this;
            }

            public a a(String str) {
                this.f2671b = str;
                return this;
            }

            public b a() {
                a aVar = this.f2672c;
                if (aVar != null) {
                    Context context = this.f2670a;
                    if (context != null) {
                        return new b(context, this.f2671b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }
        }

        b(Context context, String str, a aVar) {
            this.f2667a = context;
            this.f2668b = str;
            this.f2669c = aVar;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: b.p.a.c$c  reason: collision with other inner class name */
    public interface C0042c {
        c a(b bVar);
    }

    b a();

    void a(boolean z);
}
