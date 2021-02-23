package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, o> f14773a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f14774b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14775c;

    private o(Context context, String str) {
        this.f14774b = context;
        this.f14775c = str;
    }

    public static synchronized o a(Context context, String str) {
        o oVar;
        synchronized (o.class) {
            if (!f14773a.containsKey(str)) {
                f14773a.put(str, new o(context, str));
            }
            oVar = f14773a.get(str);
        }
        return oVar;
    }

    public synchronized Void a() {
        this.f14774b.deleteFile(this.f14775c);
        return null;
    }

    public synchronized Void a(h hVar) {
        FileOutputStream openFileOutput = this.f14774b.openFileOutput(this.f14775c, 0);
        try {
            openFileOutput.write(hVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f14775c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[SYNTHETIC, Splitter:B:16:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d A[Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x0030 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.h c() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f14774b     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x0030 }
            java.lang.String r2 = r6.f14775c     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x0030 }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x0030 }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            byte[] r2 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            r3 = 0
            int r4 = r2.length     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            r1.read(r2, r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            java.lang.String r3 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            r2.<init>(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            com.google.firebase.remoteconfig.internal.h r0 = com.google.firebase.remoteconfig.internal.h.a(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x002e, all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x002a:
            monitor-exit(r6)
            return r0
        L_0x002c:
            r0 = move-exception
            goto L_0x0034
        L_0x002e:
            goto L_0x003b
        L_0x0030:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x003a:
            r1 = r0
        L_0x003b:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0044
        L_0x0041:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0044:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.o.c():com.google.firebase.remoteconfig.internal.h");
    }
}
