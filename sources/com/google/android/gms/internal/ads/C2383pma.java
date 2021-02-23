package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.pma  reason: case insensitive filesystem */
public final class C2383pma implements C2595sma {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f11757a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<byte[]> f11758b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11759c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11760d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11761e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11762f;

    /* renamed from: g  reason: collision with root package name */
    private final Pma<String> f11763g = null;

    /* renamed from: h  reason: collision with root package name */
    private final C2879wma f11764h;
    private final C2879wma i;
    private final Dma<? super C2383pma> j;
    private C2241nma k;
    private HttpURLConnection l;
    private InputStream m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;

    public C2383pma(String str, Pma<String> pma, Dma<? super C2383pma> dma, int i2, int i3, boolean z, C2879wma wma) {
        Cma.a(str);
        this.f11762f = str;
        this.j = dma;
        this.i = new C2879wma();
        this.f11760d = i2;
        this.f11761e = i3;
        this.f11759c = true;
        this.f11764h = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x0036
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x0038
        L_0x0015:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1)
        L_0x0036:
            r4 = -1
        L_0x0038:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00cb
            java.util.regex.Pattern r1 = f11757a
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00cb
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x00aa }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x006e
            r4 = r6
            goto L_0x00cb
        L_0x006e:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            int r8 = r8.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00aa }
            r8.<init>(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r2)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = r8.toString()     // Catch:{ NumberFormatException -> 0x00aa }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x00aa }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r4 = r0
            goto L_0x00cb
        L_0x00aa:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            android.util.Log.e(r3, r10)
        L_0x00cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2383pma.a(java.net.HttpURLConnection):long");
    }

    private final HttpURLConnection a(URL url, byte[] bArr, long j2, long j3, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f11760d);
        httpURLConnection.setReadTimeout(this.f11761e);
        for (Map.Entry next : this.i.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f11762f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final void b() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.l = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r0 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.C2241nma r25) {
        /*
            r24 = this;
            r10 = r24
            r11 = r25
            java.lang.String r12 = "Unable to connect to "
            r10.k = r11
            r13 = 0
            r10.r = r13
            r10.q = r13
            r15 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x018e }
            android.net.Uri r0 = r11.f11507a     // Catch:{ IOException -> 0x018e }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x018e }
            r2.<init>(r0)     // Catch:{ IOException -> 0x018e }
            byte[] r3 = r11.f11508b     // Catch:{ IOException -> 0x018e }
            long r8 = r11.f11510d     // Catch:{ IOException -> 0x018e }
            long r6 = r11.f11511e     // Catch:{ IOException -> 0x018e }
            boolean r0 = r11.a(r15)     // Catch:{ IOException -> 0x018e }
            boolean r1 = r10.f11759c     // Catch:{ IOException -> 0x018e }
            r4 = 0
            if (r1 != 0) goto L_0x0036
            r16 = 1
            r1 = r24
            r4 = r8
            r8 = r0
            r9 = r16
            java.net.HttpURLConnection r0 = r1.a(r2, r3, r4, r6, r8, r9)     // Catch:{ IOException -> 0x018e }
            goto L_0x0078
        L_0x0036:
            r4 = r2
            r16 = r3
            r1 = 0
        L_0x003a:
            int r5 = r1 + 1
            r2 = 20
            if (r1 > r2) goto L_0x0171
            r17 = 0
            r1 = r24
            r2 = r4
            r3 = r16
            r19 = r4
            r18 = r5
            r4 = r8
            r20 = r6
            r22 = r8
            r8 = r0
            r9 = r17
            java.net.HttpURLConnection r1 = r1.a(r2, r3, r4, r6, r8, r9)     // Catch:{ IOException -> 0x018e }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x018e }
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 == r3) goto L_0x011c
            r3 = 301(0x12d, float:4.22E-43)
            if (r2 == r3) goto L_0x011c
            r3 = 302(0x12e, float:4.23E-43)
            if (r2 == r3) goto L_0x011c
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 == r3) goto L_0x011c
            if (r16 != 0) goto L_0x0077
            r3 = 307(0x133, float:4.3E-43)
            if (r2 == r3) goto L_0x011c
            r3 = 308(0x134, float:4.32E-43)
            if (r2 != r3) goto L_0x0077
            goto L_0x011c
        L_0x0077:
            r0 = r1
        L_0x0078:
            r10.l = r0     // Catch:{ IOException -> 0x018e }
            java.net.HttpURLConnection r0 = r10.l     // Catch:{ IOException -> 0x00f8 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x00f8 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x00dc
            r2 = 299(0x12b, float:4.19E-43)
            if (r0 <= r2) goto L_0x0089
            goto L_0x00dc
        L_0x0089:
            java.net.HttpURLConnection r2 = r10.l
            r2.getContentType()
            if (r0 != r1) goto L_0x0097
            long r0 = r11.f11510d
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r0 = r13
        L_0x0098:
            r10.o = r0
            boolean r0 = r11.a(r15)
            if (r0 != 0) goto L_0x00ba
            long r0 = r11.f11511e
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a9
            goto L_0x00bc
        L_0x00a9:
            java.net.HttpURLConnection r0 = r10.l
            long r0 = a((java.net.HttpURLConnection) r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b7
            long r2 = r10.o
            long r2 = r0 - r2
        L_0x00b7:
            r10.p = r2
            goto L_0x00be
        L_0x00ba:
            long r0 = r11.f11511e
        L_0x00bc:
            r10.p = r0
        L_0x00be:
            java.net.HttpURLConnection r0 = r10.l     // Catch:{ IOException -> 0x00d2 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x00d2 }
            r10.m = r0     // Catch:{ IOException -> 0x00d2 }
            r10.n = r15
            com.google.android.gms.internal.ads.Dma<? super com.google.android.gms.internal.ads.pma> r0 = r10.j
            if (r0 == 0) goto L_0x00cf
            r0.a(r10, (com.google.android.gms.internal.ads.C2241nma) r11)
        L_0x00cf:
            long r0 = r10.p
            return r0
        L_0x00d2:
            r0 = move-exception
            r24.b()
            com.google.android.gms.internal.ads.uma r1 = new com.google.android.gms.internal.ads.uma
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.C2241nma) r11, (int) r15)
            throw r1
        L_0x00dc:
            java.net.HttpURLConnection r1 = r10.l
            java.util.Map r1 = r1.getHeaderFields()
            r24.b()
            com.google.android.gms.internal.ads.tma r2 = new com.google.android.gms.internal.ads.tma
            r2.<init>(r0, r1, r11)
            r1 = 416(0x1a0, float:5.83E-43)
            if (r0 != r1) goto L_0x00f7
            com.google.android.gms.internal.ads.oma r0 = new com.google.android.gms.internal.ads.oma
            r3 = 0
            r0.<init>(r3)
            r2.initCause(r0)
        L_0x00f7:
            throw r2
        L_0x00f8:
            r0 = move-exception
            r24.b()
            com.google.android.gms.internal.ads.uma r1 = new com.google.android.gms.internal.ads.uma
            android.net.Uri r2 = r11.f11507a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0113
            java.lang.String r2 = r12.concat(r2)
            goto L_0x0118
        L_0x0113:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r12)
        L_0x0118:
            r1.<init>(r2, r0, r11, r15)
            throw r1
        L_0x011c:
            r3 = 0
            r16 = 0
            java.lang.String r2 = "Location"
            java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ IOException -> 0x018e }
            r1.disconnect()     // Catch:{ IOException -> 0x018e }
            if (r2 == 0) goto L_0x0169
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x018e }
            r1 = r19
            r4.<init>(r1, r2)     // Catch:{ IOException -> 0x018e }
            java.lang.String r1 = r4.getProtocol()     // Catch:{ IOException -> 0x018e }
            java.lang.String r2 = "https"
            boolean r2 = r2.equals(r1)     // Catch:{ IOException -> 0x018e }
            if (r2 != 0) goto L_0x0161
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)     // Catch:{ IOException -> 0x018e }
            if (r2 != 0) goto L_0x0161
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x018e }
            java.lang.String r2 = "Unsupported protocol redirect: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x018e }
            int r3 = r1.length()     // Catch:{ IOException -> 0x018e }
            if (r3 == 0) goto L_0x0158
            java.lang.String r1 = r2.concat(r1)     // Catch:{ IOException -> 0x018e }
            goto L_0x015d
        L_0x0158:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x018e }
            r1.<init>(r2)     // Catch:{ IOException -> 0x018e }
        L_0x015d:
            r0.<init>(r1)     // Catch:{ IOException -> 0x018e }
            throw r0     // Catch:{ IOException -> 0x018e }
        L_0x0161:
            r1 = r18
            r6 = r20
            r8 = r22
            goto L_0x003a
        L_0x0169:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x018e }
            java.lang.String r1 = "Null location redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x018e }
            throw r0     // Catch:{ IOException -> 0x018e }
        L_0x0171:
            r18 = r5
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x018e }
            r1 = 31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x018e }
            r2.<init>(r1)     // Catch:{ IOException -> 0x018e }
            java.lang.String r1 = "Too many redirects: "
            r2.append(r1)     // Catch:{ IOException -> 0x018e }
            r1 = r18
            r2.append(r1)     // Catch:{ IOException -> 0x018e }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x018e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x018e }
            throw r0     // Catch:{ IOException -> 0x018e }
        L_0x018e:
            r0 = move-exception
            com.google.android.gms.internal.ads.uma r1 = new com.google.android.gms.internal.ads.uma
            android.net.Uri r2 = r11.f11507a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x01a6
            java.lang.String r2 = r12.concat(r2)
            goto L_0x01ab
        L_0x01a6:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r12)
        L_0x01ab:
            r1.<init>(r2, r0, r11, r15)
            goto L_0x01b0
        L_0x01af:
            throw r1
        L_0x01b0:
            goto L_0x01af
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2383pma.a(com.google.android.gms.internal.ads.nma):long");
    }

    public final Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > 2048) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.m     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007b
            java.net.HttpURLConnection r2 = r9.l     // Catch:{ all -> 0x008e }
            long r3 = r9.p     // Catch:{ all -> 0x008e }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.p     // Catch:{ all -> 0x008e }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.p     // Catch:{ all -> 0x008e }
            long r7 = r9.r     // Catch:{ all -> 0x008e }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ all -> 0x008e }
            r8 = 19
            if (r7 == r8) goto L_0x0024
            int r7 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ all -> 0x008e }
            r8 = 20
            if (r7 != r8) goto L_0x006b
        L_0x0024:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0034
            int r3 = r2.read()     // Catch:{ Exception -> 0x006b }
            r4 = -1
            if (r3 != r4) goto L_0x003a
            goto L_0x006b
        L_0x0034:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006b
        L_0x003a:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r4 != 0) goto L_0x0052
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r3 == 0) goto L_0x006b
        L_0x0052:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006b }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006b }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006b }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            java.io.InputStream r2 = r9.m     // Catch:{ IOException -> 0x0071 }
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007b
        L_0x0071:
            r2 = move-exception
            com.google.android.gms.internal.ads.uma r3 = new com.google.android.gms.internal.ads.uma     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.nma r4 = r9.k     // Catch:{ all -> 0x008e }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.C2241nma) r4, (int) r5)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x007b:
            r9.m = r0
            r9.b()
            boolean r0 = r9.n
            if (r0 == 0) goto L_0x008d
            r9.n = r1
            com.google.android.gms.internal.ads.Dma<? super com.google.android.gms.internal.ads.pma> r0 = r9.j
            if (r0 == 0) goto L_0x008d
            r0.d(r9)
        L_0x008d:
            return
        L_0x008e:
            r2 = move-exception
            r9.m = r0
            r9.b()
            boolean r0 = r9.n
            if (r0 == 0) goto L_0x00a1
            r9.n = r1
            com.google.android.gms.internal.ads.Dma<? super com.google.android.gms.internal.ads.pma> r0 = r9.j
            if (r0 == 0) goto L_0x00a1
            r0.d(r9)
        L_0x00a1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2383pma.close():void");
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final int read(byte[] bArr, int i2, int i3) {
        try {
            if (this.q != this.o) {
                byte[] andSet = f11758b.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.q != this.o) {
                    int read = this.m.read(andSet, 0, (int) Math.min(this.o - this.q, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.q += (long) read;
                        if (this.j != null) {
                            this.j.a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f11758b.set(andSet);
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.p != -1) {
                long j2 = this.p - this.r;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = this.m.read(bArr, i2, i3);
            if (read2 != -1) {
                this.r += (long) read2;
                if (this.j != null) {
                    this.j.a(this, read2);
                }
                return read2;
            } else if (this.p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new C2737uma(e2, this.k, 2);
        }
    }
}
