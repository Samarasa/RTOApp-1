package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import c.b.b.b.d.d.Ba;
import c.b.b.b.d.d.C0286w;
import c.b.b.b.g.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.e;
import com.google.android.gms.common.util.h;
import com.google.firebase.auth.C3278c;

/* renamed from: com.google.firebase.auth.internal.n  reason: case insensitive filesystem */
public final class C3298n {

    /* renamed from: a  reason: collision with root package name */
    private static final C0286w<String> f14388a = C0286w.a("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b  reason: collision with root package name */
    private static final C3298n f14389b = new C3298n();

    /* renamed from: c  reason: collision with root package name */
    private i<C3278c> f14390c;

    /* renamed from: d  reason: collision with root package name */
    private long f14391d = 0;

    private C3298n() {
    }

    public static C3298n a() {
        return f14389b;
    }

    public static void a(Context context, Ba ba, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", e.b(ba));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", h.d().a());
        edit.commit();
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.g());
        edit.putString("statusMessage", status.h());
        edit.putLong("timestamp", h.d().a());
        edit.commit();
    }

    private static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C0286w<String> wVar = f14388a;
        int size = wVar.size();
        int i = 0;
        while (i < size) {
            String str = wVar.get(i);
            i++;
            edit.remove(str);
        }
        edit.commit();
    }

    public final void a(Context context) {
        C0563t.a(context);
        a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f14390c = null;
        this.f14391d = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r4.equals("com.google.firebase.auth.internal.SIGN_IN") == false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.C0563t.a(r12)
            c.b.d.e r0 = r12.e()
            android.content.Context r0 = r0.b()
            r1 = 0
            java.lang.String r2 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            java.lang.String r2 = ""
            java.lang.String r3 = "firebaseAppName"
            java.lang.String r3 = r0.getString(r3, r2)
            c.b.d.e r4 = r12.e()
            java.lang.String r4 = r4.d()
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.String r3 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r3)
            r5 = 0
            java.lang.String r7 = "timestamp"
            if (r4 == 0) goto L_0x00e4
            java.lang.String r3 = r0.getString(r3, r2)
            android.os.Parcelable$Creator<c.b.b.b.d.d.Ba> r4 = c.b.b.b.d.d.Ba.CREATOR
            com.google.android.gms.common.internal.a.d r3 = com.google.android.gms.common.internal.a.e.a((java.lang.String) r3, r4)
            c.b.b.b.d.d.Ba r3 = (c.b.b.b.d.d.Ba) r3
            java.lang.String r4 = "operation"
            java.lang.String r4 = r0.getString(r4, r2)
            r8 = 0
            java.lang.String r9 = "tenantId"
            java.lang.String r9 = r0.getString(r9, r8)
            java.lang.String r10 = "firebaseUserUid"
            java.lang.String r2 = r0.getString(r10, r2)
            long r5 = r0.getLong(r7, r5)
            r11.f14391d = r5
            if (r9 == 0) goto L_0x0062
            r12.a((java.lang.String) r9)
            r3.a((java.lang.String) r9)
        L_0x0062:
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -1843829902(0xffffffff92196372, float:-4.8400863E-28)
            r9 = 2
            r10 = 1
            if (r6 == r7) goto L_0x008c
            r7 = -286760092(0xffffffffeee86364, float:-3.596034E28)
            if (r6 == r7) goto L_0x0082
            r7 = 1731327805(0x6731f73d, float:8.404196E23)
            if (r6 == r7) goto L_0x0079
            goto L_0x0096
        L_0x0079:
            java.lang.String r6 = "com.google.firebase.auth.internal.SIGN_IN"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0082:
            java.lang.String r1 = "com.google.firebase.auth.internal.LINK"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0096
            r1 = 1
            goto L_0x0097
        L_0x008c:
            java.lang.String r1 = "com.google.firebase.auth.internal.REAUTHENTICATE"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0096
            r1 = 2
            goto L_0x0097
        L_0x0096:
            r1 = -1
        L_0x0097:
            if (r1 == 0) goto L_0x00d6
            if (r1 == r10) goto L_0x00bb
            if (r1 == r9) goto L_0x00a0
        L_0x009d:
            r11.f14390c = r8
            goto L_0x00e0
        L_0x00a0:
            com.google.firebase.auth.p r1 = r12.a()
            java.lang.String r1 = r1.h()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009d
            com.google.firebase.auth.p r12 = r12.a()
            com.google.firebase.auth.J r1 = com.google.firebase.auth.J.a(r3)
            c.b.b.b.g.i r12 = r12.b((com.google.firebase.auth.C3277b) r1)
            goto L_0x00de
        L_0x00bb:
            com.google.firebase.auth.p r1 = r12.a()
            java.lang.String r1 = r1.h()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009d
            com.google.firebase.auth.p r12 = r12.a()
            com.google.firebase.auth.J r1 = com.google.firebase.auth.J.a(r3)
            c.b.b.b.g.i r12 = r12.a((com.google.firebase.auth.C3277b) r1)
            goto L_0x00de
        L_0x00d6:
            com.google.firebase.auth.J r1 = com.google.firebase.auth.J.a(r3)
            c.b.b.b.g.i r12 = r12.a((com.google.firebase.auth.C3277b) r1)
        L_0x00de:
            r11.f14390c = r12
        L_0x00e0:
            a((android.content.SharedPreferences) r0)
            return
        L_0x00e4:
            java.lang.String r12 = "statusCode"
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L_0x0110
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r12 = r0.getInt(r12, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r2)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>(r12, r1)
            long r3 = r0.getLong(r7, r5)
            r11.f14391d = r3
            a((android.content.SharedPreferences) r0)
            c.b.d.f r12 = com.google.firebase.auth.a.a.O.a((com.google.android.gms.common.api.Status) r2)
            c.b.b.b.g.i r12 = c.b.b.b.g.l.a((java.lang.Exception) r12)
            r11.f14390c = r12
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.C3298n.a(com.google.firebase.auth.FirebaseAuth):void");
    }
}
