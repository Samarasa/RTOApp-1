package com.google.android.gms.internal.ads;

import android.content.Context;

public final class BG implements BU<EG, DG> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6253a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6254b;

    /* renamed from: c  reason: collision with root package name */
    private final C0678Ei f6255c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6256d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6257e;

    public BG(Context context, String str, C0678Ei ei, String str2, int i) {
        this.f6253a = context;
        this.f6254b = str;
        this.f6255c = ei;
        this.f6256d = str2;
        this.f6257e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r7 = new java.io.InputStreamReader(r14.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        com.google.android.gms.ads.internal.p.c();
        r0 = com.google.android.gms.ads.internal.util.oa.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        com.google.android.gms.common.util.k.a(r7);
        r11.a(r0);
        r6.f6513c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b2, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.Qqa.e().a(com.google.android.gms.internal.ads.F.Md)).booleanValue() == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ce, code lost:
        throw new com.google.android.gms.internal.ads.VE(com.google.android.gms.internal.ads.C2351pT.NO_FILL);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cf, code lost:
        r6.f6514d = com.google.android.gms.ads.internal.p.j().b() - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r14.disconnect();
        r1.f6255c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e3, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0289 A[Catch:{ all -> 0x029f }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x029e A[SYNTHETIC, Splitter:B:125:0x029e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.DG a(java.lang.String r21, com.google.android.gms.internal.ads.C2941xi r22, org.json.JSONObject r23, java.lang.String r24) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            java.lang.String r2 = "Received error HTTP response code: "
            java.lang.String r3 = "doritos_v2"
            java.lang.String r4 = "doritos"
            java.lang.String r5 = "http_timeout_millis"
            r6 = 60000(0xea60, float:8.4078E-41)
            int r5 = r0.optInt(r5, r6)     // Catch:{ IOException -> 0x02a9 }
            int r6 = r22.a()     // Catch:{ IOException -> 0x02a9 }
            r7 = -2
            r14 = 1
            if (r6 == r7) goto L_0x0046
            int r0 = r22.a()     // Catch:{ IOException -> 0x02a9 }
            if (r0 != r14) goto L_0x003e
            java.util.List r0 = r22.c()     // Catch:{ IOException -> 0x02a9 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = ", "
            java.util.List r2 = r22.c()     // Catch:{ IOException -> 0x02a9 }
            java.lang.String r0 = android.text.TextUtils.join(r0, r2)     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.internal.ads.C1018Rk.b(r0)     // Catch:{ IOException -> 0x02a9 }
        L_0x0034:
            com.google.android.gms.internal.ads.VE r0 = new com.google.android.gms.internal.ads.VE     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.internal.ads.pT r2 = com.google.android.gms.internal.ads.C2351pT.INVALID_REQUEST     // Catch:{ IOException -> 0x02a9 }
            java.lang.String r3 = "Error building request URL."
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x02a9 }
            throw r0     // Catch:{ IOException -> 0x02a9 }
        L_0x003e:
            com.google.android.gms.internal.ads.VE r0 = new com.google.android.gms.internal.ads.VE     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.internal.ads.pT r2 = com.google.android.gms.internal.ads.C2351pT.INTERNAL_ERROR     // Catch:{ IOException -> 0x02a9 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x02a9 }
            throw r0     // Catch:{ IOException -> 0x02a9 }
        L_0x0046:
            com.google.android.gms.internal.ads.DG r6 = new com.google.android.gms.internal.ads.DG     // Catch:{ IOException -> 0x02a9 }
            r6.<init>()     // Catch:{ IOException -> 0x02a9 }
            java.lang.String r7 = "SDK version: "
            java.lang.String r8 = r1.f6254b     // Catch:{ IOException -> 0x02a9 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x02a9 }
            int r9 = r8.length()     // Catch:{ IOException -> 0x02a9 }
            if (r9 == 0) goto L_0x005e
            java.lang.String r7 = r7.concat(r8)     // Catch:{ IOException -> 0x02a9 }
            goto L_0x0064
        L_0x005e:
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x02a9 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x02a9 }
            r7 = r8
        L_0x0064:
            com.google.android.gms.internal.ads.C1018Rk.c(r7)     // Catch:{ IOException -> 0x02a9 }
            java.lang.String r7 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r8 = java.lang.String.valueOf(r21)     // Catch:{ IOException -> 0x02a9 }
            int r9 = r8.length()     // Catch:{ IOException -> 0x02a9 }
            if (r9 == 0) goto L_0x0078
            java.lang.String r7 = r7.concat(r8)     // Catch:{ IOException -> 0x02a9 }
            goto L_0x007e
        L_0x0078:
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x02a9 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x02a9 }
            r7 = r8
        L_0x007e:
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r7)     // Catch:{ IOException -> 0x02a9 }
            java.net.URL r7 = new java.net.URL     // Catch:{ IOException -> 0x02a9 }
            r8 = r21
            r7.<init>(r8)     // Catch:{ IOException -> 0x02a9 }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ IOException -> 0x02a9 }
            r15.<init>()     // Catch:{ IOException -> 0x02a9 }
            r8 = 0
            com.google.android.gms.common.util.e r9 = com.google.android.gms.ads.internal.p.j()     // Catch:{ IOException -> 0x02a9 }
            long r16 = r9.b()     // Catch:{ IOException -> 0x02a9 }
            r18 = 0
        L_0x0098:
            com.google.android.gms.internal.ads.Ei r8 = r1.f6255c     // Catch:{ IOException -> 0x02a9 }
            int r9 = r1.f6257e     // Catch:{ IOException -> 0x02a9 }
            r8.a(r9)     // Catch:{ IOException -> 0x02a9 }
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ IOException -> 0x02a9 }
            r13 = r7
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.ads.internal.util.oa r7 = com.google.android.gms.ads.internal.p.c()     // Catch:{ VE -> 0x0275, all -> 0x0272 }
            android.content.Context r8 = r1.f6253a     // Catch:{ VE -> 0x0275, all -> 0x0272 }
            java.lang.String r9 = r1.f6254b     // Catch:{ VE -> 0x0275, all -> 0x0272 }
            r10 = 0
            r12 = 0
            r11 = r13
            r14 = r13
            r13 = r5
            r7.a(r8, r9, r10, r11, r12, r13)     // Catch:{ VE -> 0x0270 }
            boolean r7 = android.text.TextUtils.isEmpty(r24)     // Catch:{ VE -> 0x0270 }
            if (r7 != 0) goto L_0x00c4
            java.lang.String r7 = "Cookie"
            r8 = r24
            r14.addRequestProperty(r7, r8)     // Catch:{ VE -> 0x0270 }
            goto L_0x00c6
        L_0x00c4:
            r8 = r24
        L_0x00c6:
            boolean r7 = r22.f()     // Catch:{ VE -> 0x0270 }
            java.lang.String r9 = ""
            if (r7 == 0) goto L_0x0102
            java.lang.String r7 = "pii"
            org.json.JSONObject r7 = r0.optJSONObject(r7)     // Catch:{ VE -> 0x0270 }
            if (r7 == 0) goto L_0x00fd
            java.lang.String r10 = r7.optString(r4, r9)     // Catch:{ VE -> 0x0270 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ VE -> 0x0270 }
            if (r10 != 0) goto L_0x00e9
            java.lang.String r10 = "x-afma-drt-cookie"
            java.lang.String r11 = r7.optString(r4, r9)     // Catch:{ VE -> 0x0270 }
            r14.addRequestProperty(r10, r11)     // Catch:{ VE -> 0x0270 }
        L_0x00e9:
            java.lang.String r10 = r7.optString(r3, r9)     // Catch:{ VE -> 0x0270 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ VE -> 0x0270 }
            if (r10 != 0) goto L_0x0102
            java.lang.String r10 = "x-afma-drt-v2-cookie"
            java.lang.String r7 = r7.optString(r3, r9)     // Catch:{ VE -> 0x0270 }
            r14.addRequestProperty(r10, r7)     // Catch:{ VE -> 0x0270 }
            goto L_0x0102
        L_0x00fd:
            java.lang.String r7 = "DSID signal does not exist."
            com.google.android.gms.ads.internal.util.fa.f(r7)     // Catch:{ VE -> 0x0270 }
        L_0x0102:
            if (r22 == 0) goto L_0x0137
            java.lang.String r10 = r22.e()     // Catch:{ VE -> 0x0270 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ VE -> 0x0270 }
            if (r10 != 0) goto L_0x0137
            r10 = 1
            r14.setDoOutput(r10)     // Catch:{ VE -> 0x0270 }
            java.lang.String r10 = r22.e()     // Catch:{ VE -> 0x0270 }
            byte[] r10 = r10.getBytes()     // Catch:{ VE -> 0x0270 }
            int r11 = r10.length     // Catch:{ VE -> 0x0270 }
            r14.setFixedLengthStreamingMode(r11)     // Catch:{ VE -> 0x0270 }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0131 }
            java.io.OutputStream r12 = r14.getOutputStream()     // Catch:{ all -> 0x0131 }
            r11.<init>(r12)     // Catch:{ all -> 0x0131 }
            r11.write(r10)     // Catch:{ all -> 0x012e }
            com.google.android.gms.common.util.k.a(r11)     // Catch:{ VE -> 0x0270 }
            goto L_0x0138
        L_0x012e:
            r0 = move-exception
            r7 = r11
            goto L_0x0133
        L_0x0131:
            r0 = move-exception
            r7 = 0
        L_0x0133:
            com.google.android.gms.common.util.k.a(r7)     // Catch:{ VE -> 0x0270 }
            throw r0     // Catch:{ VE -> 0x0270 }
        L_0x0137:
            r10 = 0
        L_0x0138:
            com.google.android.gms.internal.ads.Kk r11 = new com.google.android.gms.internal.ads.Kk     // Catch:{ VE -> 0x0270 }
            r11.<init>()     // Catch:{ VE -> 0x0270 }
            r11.a((java.net.HttpURLConnection) r14, (byte[]) r10)     // Catch:{ VE -> 0x0270 }
            int r10 = r14.getResponseCode()     // Catch:{ VE -> 0x0270 }
            java.util.Map r12 = r14.getHeaderFields()     // Catch:{ VE -> 0x0270 }
            java.util.Set r12 = r12.entrySet()     // Catch:{ VE -> 0x0270 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ VE -> 0x0270 }
        L_0x0150:
            boolean r13 = r12.hasNext()     // Catch:{ VE -> 0x0270 }
            if (r13 == 0) goto L_0x0185
            java.lang.Object r13 = r12.next()     // Catch:{ VE -> 0x0270 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ VE -> 0x0270 }
            java.lang.Object r19 = r13.getKey()     // Catch:{ VE -> 0x0270 }
            r7 = r19
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ VE -> 0x0270 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ VE -> 0x0270 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ VE -> 0x0270 }
            boolean r19 = r15.containsKey(r7)     // Catch:{ VE -> 0x0270 }
            if (r19 == 0) goto L_0x017a
            java.lang.Object r7 = r15.get(r7)     // Catch:{ VE -> 0x0270 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ VE -> 0x0270 }
            r7.addAll(r13)     // Catch:{ VE -> 0x0270 }
            goto L_0x0150
        L_0x017a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ VE -> 0x0270 }
            r0.<init>(r13)     // Catch:{ VE -> 0x0270 }
            r15.put(r7, r0)     // Catch:{ VE -> 0x0270 }
            r0 = r23
            goto L_0x0150
        L_0x0185:
            r11.a((java.net.HttpURLConnection) r14, (int) r10)     // Catch:{ VE -> 0x0270 }
            r6.f6511a = r10     // Catch:{ VE -> 0x0270 }
            r6.f6512b = r15     // Catch:{ VE -> 0x0270 }
            r6.f6513c = r9     // Catch:{ VE -> 0x0270 }
            r0 = 200(0xc8, float:2.8E-43)
            r7 = 300(0x12c, float:4.2E-43)
            if (r10 < r0) goto L_0x01ec
            if (r10 >= r7) goto L_0x01ec
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x01e6 }
            java.io.InputStream r0 = r14.getInputStream()     // Catch:{ all -> 0x01e6 }
            r7.<init>(r0)     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.ads.internal.p.c()     // Catch:{ all -> 0x01e4 }
            java.lang.String r0 = com.google.android.gms.ads.internal.util.oa.a((java.io.InputStreamReader) r7)     // Catch:{ all -> 0x01e4 }
            com.google.android.gms.common.util.k.a(r7)     // Catch:{ VE -> 0x0270 }
            r11.a((java.lang.String) r0)     // Catch:{ VE -> 0x0270 }
            r6.f6513c = r0     // Catch:{ VE -> 0x0270 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ VE -> 0x0270 }
            if (r0 == 0) goto L_0x01cf
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.Md     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ VE -> 0x0270 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ VE -> 0x0270 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ VE -> 0x0270 }
            boolean r0 = r0.booleanValue()     // Catch:{ VE -> 0x0270 }
            if (r0 == 0) goto L_0x01c7
            goto L_0x01cf
        L_0x01c7:
            com.google.android.gms.internal.ads.VE r0 = new com.google.android.gms.internal.ads.VE     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.pT r2 = com.google.android.gms.internal.ads.C2351pT.NO_FILL     // Catch:{ VE -> 0x0270 }
            r0.<init>(r2)     // Catch:{ VE -> 0x0270 }
            throw r0     // Catch:{ VE -> 0x0270 }
        L_0x01cf:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.p.j()     // Catch:{ VE -> 0x0270 }
            long r2 = r0.b()     // Catch:{ VE -> 0x0270 }
            long r2 = r2 - r16
            r6.f6514d = r2     // Catch:{ VE -> 0x0270 }
            r14.disconnect()     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.internal.ads.Ei r0 = r1.f6255c     // Catch:{ IOException -> 0x02a9 }
            r0.a()     // Catch:{ IOException -> 0x02a9 }
            return r6
        L_0x01e4:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e6:
            r0 = move-exception
            r7 = 0
        L_0x01e8:
            com.google.android.gms.common.util.k.a(r7)     // Catch:{ VE -> 0x0270 }
            throw r0     // Catch:{ VE -> 0x0270 }
        L_0x01ec:
            if (r10 < r7) goto L_0x0245
            r0 = 400(0x190, float:5.6E-43)
            if (r10 >= r0) goto L_0x0245
            java.lang.String r0 = "Location"
            java.lang.String r0 = r14.getHeaderField(r0)     // Catch:{ VE -> 0x0270 }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ VE -> 0x0270 }
            if (r7 != 0) goto L_0x0236
            java.net.URL r7 = new java.net.URL     // Catch:{ VE -> 0x0270 }
            r7.<init>(r0)     // Catch:{ VE -> 0x0270 }
            r0 = 1
            int r9 = r18 + 1
            com.google.android.gms.internal.ads.p<java.lang.Integer> r10 = com.google.android.gms.internal.ads.F.nd     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.B r11 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ VE -> 0x0270 }
            java.lang.Object r10 = r11.a(r10)     // Catch:{ VE -> 0x0270 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ VE -> 0x0270 }
            int r10 = r10.intValue()     // Catch:{ VE -> 0x0270 }
            if (r9 > r10) goto L_0x0227
            r14.disconnect()     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.internal.ads.Ei r10 = r1.f6255c     // Catch:{ IOException -> 0x02a9 }
            r10.a()     // Catch:{ IOException -> 0x02a9 }
            r0 = r23
            r18 = r9
            r14 = 1
            goto L_0x0098
        L_0x0227:
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.C1018Rk.d(r0)     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.VE r0 = new com.google.android.gms.internal.ads.VE     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.pT r2 = com.google.android.gms.internal.ads.C2351pT.INTERNAL_ERROR     // Catch:{ VE -> 0x0270 }
            java.lang.String r3 = "Too many redirects"
            r0.<init>(r2, r3)     // Catch:{ VE -> 0x0270 }
            throw r0     // Catch:{ VE -> 0x0270 }
        L_0x0236:
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.C1018Rk.d(r0)     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.VE r0 = new com.google.android.gms.internal.ads.VE     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.pT r2 = com.google.android.gms.internal.ads.C2351pT.INTERNAL_ERROR     // Catch:{ VE -> 0x0270 }
            java.lang.String r3 = "No location header to follow redirect"
            r0.<init>(r2, r3)     // Catch:{ VE -> 0x0270 }
            throw r0     // Catch:{ VE -> 0x0270 }
        L_0x0245:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ VE -> 0x0270 }
            r3 = 46
            r0.<init>(r3)     // Catch:{ VE -> 0x0270 }
            r0.append(r2)     // Catch:{ VE -> 0x0270 }
            r0.append(r10)     // Catch:{ VE -> 0x0270 }
            java.lang.String r0 = r0.toString()     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.C1018Rk.d(r0)     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.VE r0 = new com.google.android.gms.internal.ads.VE     // Catch:{ VE -> 0x0270 }
            com.google.android.gms.internal.ads.pT r4 = com.google.android.gms.internal.ads.C2351pT.INTERNAL_ERROR     // Catch:{ VE -> 0x0270 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ VE -> 0x0270 }
            r5.<init>(r3)     // Catch:{ VE -> 0x0270 }
            r5.append(r2)     // Catch:{ VE -> 0x0270 }
            r5.append(r10)     // Catch:{ VE -> 0x0270 }
            java.lang.String r2 = r5.toString()     // Catch:{ VE -> 0x0270 }
            r0.<init>(r4, r2)     // Catch:{ VE -> 0x0270 }
            throw r0     // Catch:{ VE -> 0x0270 }
        L_0x0270:
            r0 = move-exception
            goto L_0x0277
        L_0x0272:
            r0 = move-exception
            r14 = r13
            goto L_0x02a0
        L_0x0275:
            r0 = move-exception
            r14 = r13
        L_0x0277:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.F.Ef     // Catch:{ all -> 0x029f }
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x029f }
            java.lang.Object r2 = r3.a(r2)     // Catch:{ all -> 0x029f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x029f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x029f }
            if (r2 == 0) goto L_0x029e
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.p.j()     // Catch:{ all -> 0x029f }
            long r2 = r0.b()     // Catch:{ all -> 0x029f }
            long r2 = r2 - r16
            r6.f6514d = r2     // Catch:{ all -> 0x029f }
            r14.disconnect()     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.internal.ads.Ei r0 = r1.f6255c     // Catch:{ IOException -> 0x02a9 }
            r0.a()     // Catch:{ IOException -> 0x02a9 }
            return r6
        L_0x029e:
            throw r0     // Catch:{ all -> 0x029f }
        L_0x029f:
            r0 = move-exception
        L_0x02a0:
            r14.disconnect()     // Catch:{ IOException -> 0x02a9 }
            com.google.android.gms.internal.ads.Ei r2 = r1.f6255c     // Catch:{ IOException -> 0x02a9 }
            r2.a()     // Catch:{ IOException -> 0x02a9 }
            throw r0     // Catch:{ IOException -> 0x02a9 }
        L_0x02a9:
            r0 = move-exception
            java.lang.String r2 = "Error while connecting to ad server: "
            java.lang.String r3 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x02bf
            java.lang.String r2 = r2.concat(r3)
            goto L_0x02c5
        L_0x02bf:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x02c5:
            com.google.android.gms.internal.ads.C1018Rk.d(r2)
            com.google.android.gms.internal.ads.VE r3 = new com.google.android.gms.internal.ads.VE
            com.google.android.gms.internal.ads.pT r4 = com.google.android.gms.internal.ads.C2351pT.INTERNAL_ERROR
            r3.<init>(r4, r2, r0)
            goto L_0x02d1
        L_0x02d0:
            throw r3
        L_0x02d1:
            goto L_0x02d0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BG.a(java.lang.String, com.google.android.gms.internal.ads.xi, org.json.JSONObject, java.lang.String):com.google.android.gms.internal.ads.DG");
    }

    public final /* synthetic */ Object apply(Object obj) {
        EG eg = (EG) obj;
        return a(eg.f6678b.b(), eg.f6678b, eg.f6677a, this.f6256d);
    }
}
