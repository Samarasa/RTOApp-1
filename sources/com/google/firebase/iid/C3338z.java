package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import b.e.b;
import c.b.b.b.g.j;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.z  reason: case insensitive filesystem */
final class C3338z {

    /* renamed from: a  reason: collision with root package name */
    private int f14620a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, j<Void>> f14621b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final C3334v f14622c;

    C3338z(C3334v vVar) {
        this.f14622c = vVar;
    }

    private static boolean a(FirebaseInstanceId firebaseInstanceId, String str) {
        String sb;
        String str2;
        String[] split = str.split("!");
        if (split.length == 2) {
            String str3 = split[0];
            String str4 = split[1];
            char c2 = 65535;
            try {
                int hashCode = str3.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str3.equals("U")) {
                            c2 = 1;
                        }
                    }
                } else if (str3.equals("S")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    firebaseInstanceId.a(str4);
                    if (FirebaseInstanceId.g()) {
                        str2 = "subscribe operation succeeded";
                    }
                } else if (c2 == 1) {
                    firebaseInstanceId.b(str4);
                    if (FirebaseInstanceId.g()) {
                        str2 = "unsubscribe operation succeeded";
                    }
                }
                Log.d("FirebaseInstanceId", str2);
            } catch (IOException e2) {
                if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                    String message = e2.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 53);
                    sb2.append("Topic operation failed: ");
                    sb2.append(message);
                    sb2.append(". Will retry Topic operation.");
                    sb = sb2.toString();
                } else if (e2.getMessage() == null) {
                    sb = "Topic operation failed without exception message. Will retry Topic operation.";
                } else {
                    throw e2;
                }
                Log.e("FirebaseInstanceId", sb);
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean a(String str) {
        synchronized (this.f14622c) {
            String a2 = this.f14622c.a();
            String valueOf = String.valueOf(str);
            if (!a2.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                return false;
            }
            String valueOf2 = String.valueOf(str);
            this.f14622c.a(a2.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
            return true;
        }
    }

    private final String b() {
        String a2;
        synchronized (this.f14622c) {
            a2 = this.f14622c.a();
        }
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String[] split = a2.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a() {
        return b() != null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (a(r5, r0) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r4.f14621b.remove(java.lang.Integer.valueOf(r4.f14620a));
        a(r0);
        r4.f14620a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r2.a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.b()     // Catch:{ all -> 0x0042 }
            r1 = 1
            if (r0 != 0) goto L_0x0017
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.g()     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0015
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0042 }
        L_0x0015:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            return r1
        L_0x0017:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            boolean r2 = a(r5, r0)
            if (r2 != 0) goto L_0x0020
            r5 = 0
            return r5
        L_0x0020:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, c.b.b.b.g.j<java.lang.Void>> r2 = r4.f14621b     // Catch:{ all -> 0x003f }
            int r3 = r4.f14620a     // Catch:{ all -> 0x003f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x003f }
            c.b.b.b.g.j r2 = (c.b.b.b.g.j) r2     // Catch:{ all -> 0x003f }
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x003f }
            int r0 = r4.f14620a     // Catch:{ all -> 0x003f }
            int r0 = r0 + r1
            r4.f14620a = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.a(r0)
            goto L_0x0000
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            throw r5
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0045:
            throw r5
        L_0x0046:
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3338z.a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }
}
