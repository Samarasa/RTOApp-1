package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0563t;

public final class ZL implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final SS f9537a;

    public ZL(SS ss) {
        C0563t.a(ss, (Object) "the targeting must not be null");
        this.f9537a = ss;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r14) {
        /*
            r13 = this;
            android.os.Bundle r14 = (android.os.Bundle) r14
            com.google.android.gms.internal.ads.SS r0 = r13.f9537a
            com.google.android.gms.internal.ads.nqa r0 = r0.f8618d
            int r1 = r0.w
            java.lang.String r2 = "http_timeout_millis"
            r14.putInt(r2, r1)
            com.google.android.gms.internal.ads.SS r1 = r13.f9537a
            java.lang.String r1 = r1.f8620f
            java.lang.String r2 = "slotname"
            r14.putString(r2, r1)
            int[] r1 = com.google.android.gms.internal.ads.C1352bM.f9899a
            com.google.android.gms.internal.ads.SS r2 = r13.f9537a
            com.google.android.gms.internal.ads.FS r2 = r2.n
            int r2 = r2.f6849a
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            r2 = 2
            if (r1 == r3) goto L_0x002b
            if (r1 == r2) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            java.lang.String r1 = "is_rewarded_interstitial"
            goto L_0x002d
        L_0x002b:
            java.lang.String r1 = "is_new_rewarded"
        L_0x002d:
            r14.putBoolean(r1, r3)
        L_0x0030:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "yyyyMMdd"
            r1.<init>(r5, r4)
            java.util.Date r4 = new java.util.Date
            long r5 = r0.f11535b
            r4.<init>(r5)
            java.lang.String r1 = r1.format(r4)
            long r4 = r0.f11535b
            r6 = -1
            r8 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x004f
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            java.lang.String r5 = "cust_age"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r5, (java.lang.String) r1, (boolean) r4)
            android.os.Bundle r1 = r0.f11536c
            java.lang.String r4 = "extras"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r4, (android.os.Bundle) r1)
            int r1 = r0.f11537d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r4 = r0.f11537d
            r5 = -1
            if (r4 == r5) goto L_0x0069
            r4 = 1
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            java.lang.String r6 = "cust_gender"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r6, (java.lang.Integer) r1, (boolean) r4)
            java.util.List<java.lang.String> r1 = r0.f11538e
            java.lang.String r4 = "kw"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r4, (java.util.List<java.lang.String>) r1)
            int r1 = r0.f11540g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r4 = r0.f11540g
            if (r4 == r5) goto L_0x0082
            r4 = 1
            goto L_0x0083
        L_0x0082:
            r4 = 0
        L_0x0083:
            java.lang.String r6 = "tag_for_child_directed_treatment"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r6, (java.lang.Integer) r1, (boolean) r4)
            boolean r1 = r0.f11539f
            if (r1 == 0) goto L_0x0091
            java.lang.String r4 = "test_request"
            r14.putBoolean(r4, r1)
        L_0x0091:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            int r4 = r0.f11534a
            if (r4 < r2) goto L_0x009f
            boolean r4 = r0.f11541h
            if (r4 == 0) goto L_0x009f
            r4 = 1
            goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            java.lang.String r6 = "d_imp_hdr"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r6, (java.lang.Integer) r1, (boolean) r4)
            java.lang.String r1 = r0.i
            int r4 = r0.f11534a
            if (r4 < r2) goto L_0x00b3
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00b3
            r2 = 1
            goto L_0x00b4
        L_0x00b3:
            r2 = 0
        L_0x00b4:
            java.lang.String r4 = "ppid"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r4, (java.lang.String) r1, (boolean) r2)
            android.location.Location r1 = r0.k
            if (r1 == 0) goto L_0x011e
            float r2 = r1.getAccuracy()
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            long r6 = r1.getTime()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r9
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            double r6 = r1.getLatitude()
            r9 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r6 = r6 * r9
            long r6 = (long) r6
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            double r11 = r1.getLongitude()
            double r11 = r11 * r9
            long r9 = (long) r11
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            float r2 = r2.floatValue()
            java.lang.String r9 = "radius"
            r7.putFloat(r9, r2)
            long r9 = r6.longValue()
            java.lang.String r2 = "lat"
            r7.putLong(r2, r9)
            long r1 = r1.longValue()
            java.lang.String r6 = "long"
            r7.putLong(r6, r1)
            long r1 = r4.longValue()
            java.lang.String r4 = "time"
            r7.putLong(r4, r1)
            java.lang.String r1 = "uule"
            r14.putBundle(r1, r7)
        L_0x011e:
            java.lang.String r1 = r0.l
            java.lang.String r2 = "url"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r2, (java.lang.String) r1)
            java.util.List<java.lang.String> r1 = r0.v
            java.lang.String r2 = "neighboring_content_urls"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r2, (java.util.List<java.lang.String>) r1)
            android.os.Bundle r1 = r0.n
            java.lang.String r2 = "custom_targeting"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r2, (android.os.Bundle) r1)
            java.util.List<java.lang.String> r1 = r0.o
            java.lang.String r2 = "category_exclusions"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r2, (java.util.List<java.lang.String>) r1)
            java.lang.String r1 = r0.p
            java.lang.String r2 = "request_agent"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r2, (java.lang.String) r1)
            java.lang.String r1 = r0.q
            java.lang.String r2 = "request_pkg"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r2, (java.lang.String) r1)
            boolean r1 = r0.r
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r2 = r0.f11534a
            r4 = 7
            if (r2 < r4) goto L_0x0155
            r2 = 1
            goto L_0x0156
        L_0x0155:
            r2 = 0
        L_0x0156:
            java.lang.String r4 = "is_designed_for_families"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r4, (java.lang.Boolean) r1, (boolean) r2)
            int r1 = r0.f11534a
            r2 = 8
            if (r1 < r2) goto L_0x0179
            int r1 = r0.t
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r0.t
            if (r2 == r5) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r3 = 0
        L_0x016d:
            java.lang.String r2 = "tag_for_under_age_of_consent"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r2, (java.lang.Integer) r1, (boolean) r3)
            java.lang.String r0 = r0.u
            java.lang.String r1 = "max_ad_content_rating"
            com.google.android.gms.internal.ads.C1359bT.a((android.os.Bundle) r14, (java.lang.String) r1, (java.lang.String) r0)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZL.a(java.lang.Object):void");
    }
}
