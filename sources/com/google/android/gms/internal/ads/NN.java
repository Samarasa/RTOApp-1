package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.ha;
import java.util.ArrayList;

public final class NN implements JO<KN> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f7955a;

    /* renamed from: b  reason: collision with root package name */
    private final SS f7956b;

    /* renamed from: c  reason: collision with root package name */
    private final PackageInfo f7957c;

    /* renamed from: d  reason: collision with root package name */
    private final ha f7958d;

    public NN(PY py, SS ss, PackageInfo packageInfo, ha haVar) {
        this.f7955a = py;
        this.f7956b = ss;
        this.f7957c = packageInfo;
        this.f7958d = haVar;
    }

    public final LY<KN> a() {
        return this.f7955a.a(new MN(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r9 == 3) goto L_0x011a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 3
            java.lang.String r1 = "native_version"
            r10.putInt(r1, r0)
            java.lang.String r1 = "native_templates"
            r10.putStringArrayList(r1, r9)
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            java.util.ArrayList<java.lang.String> r9 = r9.f8622h
            java.lang.String r1 = "native_custom_templates"
            r10.putStringArrayList(r1, r9)
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.F.jc
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r9 = r1.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.String r1 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            com.google.android.gms.internal.ads.bb r9 = r9.i
            int r9 = r9.f9909a
            if (r9 <= r0) goto L_0x0061
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            com.google.android.gms.internal.ads.bb r9 = r9.i
            int r9 = r9.f9916h
            if (r9 == r6) goto L_0x0055
            if (r9 == r5) goto L_0x0053
            if (r9 == r0) goto L_0x0051
            r7 = 4
            if (r9 == r7) goto L_0x004e
            r9 = r4
            goto L_0x0056
        L_0x004e:
            java.lang.String r9 = "square"
            goto L_0x0056
        L_0x0051:
            r9 = r2
            goto L_0x0056
        L_0x0053:
            r9 = r1
            goto L_0x0056
        L_0x0055:
            r9 = r3
        L_0x0056:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x0061
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x0061:
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            com.google.android.gms.internal.ads.bb r9 = r9.i
            int r9 = r9.f9911c
            if (r9 == 0) goto L_0x0071
            if (r9 == r6) goto L_0x006f
            if (r9 == r5) goto L_0x0072
            r1 = r4
            goto L_0x0072
        L_0x006f:
            r1 = r2
            goto L_0x0072
        L_0x0071:
            r1 = r3
        L_0x0072:
            boolean r9 = r4.equals(r1)
            if (r9 != 0) goto L_0x007d
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r1)
        L_0x007d:
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            com.google.android.gms.internal.ads.bb r9 = r9.i
            boolean r9 = r9.f9912d
            java.lang.String r1 = "native_multiple_images"
            r10.putBoolean(r1, r9)
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            com.google.android.gms.internal.ads.bb r9 = r9.i
            boolean r9 = r9.f9915g
            java.lang.String r1 = "use_custom_mute"
            r10.putBoolean(r1, r9)
            android.content.pm.PackageInfo r9 = r8.f7957c
            if (r9 != 0) goto L_0x0099
            r9 = 0
            goto L_0x009b
        L_0x0099:
            int r9 = r9.versionCode
        L_0x009b:
            com.google.android.gms.ads.internal.util.ha r1 = r8.f7958d
            int r1 = r1.n()
            if (r9 <= r1) goto L_0x00ad
            com.google.android.gms.ads.internal.util.ha r1 = r8.f7958d
            r1.k()
            com.google.android.gms.ads.internal.util.ha r1 = r8.f7958d
            r1.a((int) r9)
        L_0x00ad:
            com.google.android.gms.ads.internal.util.ha r9 = r8.f7958d
            org.json.JSONObject r9 = r9.c()
            if (r9 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.SS r1 = r8.f7956b
            java.lang.String r1 = r1.f8620f
            org.json.JSONArray r9 = r9.optJSONArray(r1)
            if (r9 == 0) goto L_0x00c4
            java.lang.String r9 = r9.toString()
            goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x00d0
            java.lang.String r1 = "native_advanced_settings"
            r10.putString(r1, r9)
        L_0x00d0:
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            int r9 = r9.k
            if (r9 <= r6) goto L_0x00db
            java.lang.String r1 = "max_num_ads"
            r10.putInt(r1, r9)
        L_0x00db:
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            com.google.android.gms.internal.ads.Ld r9 = r9.f8617c
            if (r9 == 0) goto L_0x012d
            java.lang.String r1 = r9.f7689c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0121
            int r1 = r9.f7687a
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r1 < r5) goto L_0x00f8
            int r9 = r9.f7690d
            if (r9 == r5) goto L_0x011b
            if (r9 == r0) goto L_0x011a
            goto L_0x011b
        L_0x00f8:
            int r9 = r9.f7688b
            if (r9 == r6) goto L_0x011b
            if (r9 == r5) goto L_0x011a
            r0 = 52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Instream ad video aspect ratio "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = " is wrong."
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.C1018Rk.b(r9)
            goto L_0x011b
        L_0x011a:
            r3 = r2
        L_0x011b:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r3)
            goto L_0x0128
        L_0x0121:
            java.lang.String r9 = r9.f7689c
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0128:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x012d:
            com.google.android.gms.internal.ads.SS r9 = r8.f7956b
            com.google.android.gms.internal.ads.fc r9 = r9.a()
            if (r9 == 0) goto L_0x013a
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.NN.a(java.util.ArrayList, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ KN b() {
        ArrayList<String> arrayList = this.f7956b.f8621g;
        return arrayList == null ? PN.f8209a : arrayList.isEmpty() ? ON.f8075a : new RN(this, arrayList);
    }
}
