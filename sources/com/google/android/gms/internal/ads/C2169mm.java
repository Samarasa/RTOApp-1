package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.mm  reason: case insensitive filesystem */
final class C2169mm implements C2595sma {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f11366a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<byte[]> f11367b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private SSLSocketFactory f11368c = new C2382pm(this);

    /* renamed from: d  reason: collision with root package name */
    private final int f11369d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11370e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11371f;

    /* renamed from: g  reason: collision with root package name */
    private final C2879wma f11372g;

    /* renamed from: h  reason: collision with root package name */
    private final Dma<? super C2169mm> f11373h;
    private C2241nma i;
    private HttpURLConnection j;
    private InputStream k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;
    /* access modifiers changed from: private */
    public int q;
    private Set<Socket> r = new HashSet();

    C2169mm(String str, Dma<? super C2169mm> dma, int i2, int i3, int i4) {
        Cma.a(str);
        this.f11371f = str;
        this.f11373h = dma;
        this.f11372g = new C2879wma();
        this.f11369d = i2;
        this.f11370e = i3;
        this.q = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r9.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L_0x0034
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0013 }
            goto L_0x0036
        L_0x0013:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.C1018Rk.b(r1)
        L_0x0034:
            r3 = -1
        L_0x0036:
            java.lang.String r1 = "Content-Range"
            java.lang.String r9 = r9.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x00c9
            java.util.regex.Pattern r1 = f11366a
            java.util.regex.Matcher r1 = r1.matcher(r9)
            boolean r5 = r1.find()
            if (r5 == 0) goto L_0x00c9
            r5 = 2
            java.lang.String r5 = r1.group(r5)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r7 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x006c
            r3 = r5
            goto L_0x00c9
        L_0x006c:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00a8 }
            int r1 = r1 + 26
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ NumberFormatException -> 0x00a8 }
            int r7 = r7.length()     // Catch:{ NumberFormatException -> 0x00a8 }
            int r1 = r1 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.<init>(r1)     // Catch:{ NumberFormatException -> 0x00a8 }
            java.lang.String r1 = "Inconsistent headers ["
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            java.lang.String r0 = "] ["
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.append(r9)     // Catch:{ NumberFormatException -> 0x00a8 }
            r7.append(r2)     // Catch:{ NumberFormatException -> 0x00a8 }
            java.lang.String r0 = r7.toString()     // Catch:{ NumberFormatException -> 0x00a8 }
            com.google.android.gms.internal.ads.C1018Rk.d(r0)     // Catch:{ NumberFormatException -> 0x00a8 }
            long r0 = java.lang.Math.max(r3, r5)     // Catch:{ NumberFormatException -> 0x00a8 }
            r3 = r0
            goto L_0x00c9
        L_0x00a8:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.C1018Rk.b(r9)
        L_0x00c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2169mm.a(java.net.HttpURLConnection):long");
    }

    /* access modifiers changed from: private */
    public final void a(Socket socket) {
        this.r.add(socket);
    }

    private final void b() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                C1018Rk.b("Unexpected error while disconnecting", e2);
            }
            this.j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        if (r4 != 0) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x012d A[EDGE_INSN: B:119:0x012d->B:50:0x012d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e8 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ea A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0123 A[Catch:{ IOException -> 0x0241 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.C2241nma r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "Unable to connect to "
            r1.i = r2
            r4 = 0
            r1.p = r4
            r1.o = r4
            r6 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0241 }
            android.net.Uri r7 = r2.f11507a     // Catch:{ IOException -> 0x0241 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0241 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0241 }
            byte[] r7 = r2.f11508b     // Catch:{ IOException -> 0x0241 }
            long r8 = r2.f11510d     // Catch:{ IOException -> 0x0241 }
            long r10 = r2.f11511e     // Catch:{ IOException -> 0x0241 }
            boolean r12 = r2.a(r6)     // Catch:{ IOException -> 0x0241 }
            r14 = r7
            r7 = r0
            r0 = 0
        L_0x0027:
            int r15 = r0 + 1
            r6 = 20
            if (r0 > r6) goto L_0x0228
            java.net.URLConnection r0 = r7.openConnection()     // Catch:{ IOException -> 0x0241 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0241 }
            boolean r13 = r0 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0241 }
            if (r13 == 0) goto L_0x003f
            r13 = r0
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ IOException -> 0x0241 }
            javax.net.ssl.SSLSocketFactory r6 = r1.f11368c     // Catch:{ IOException -> 0x0241 }
            r13.setSSLSocketFactory(r6)     // Catch:{ IOException -> 0x0241 }
        L_0x003f:
            int r6 = r1.f11369d     // Catch:{ IOException -> 0x0241 }
            r0.setConnectTimeout(r6)     // Catch:{ IOException -> 0x0241 }
            int r6 = r1.f11370e     // Catch:{ IOException -> 0x0241 }
            r0.setReadTimeout(r6)     // Catch:{ IOException -> 0x0241 }
            com.google.android.gms.internal.ads.wma r6 = r1.f11372g     // Catch:{ IOException -> 0x0241 }
            java.util.Map r6 = r6.a()     // Catch:{ IOException -> 0x0241 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ IOException -> 0x0241 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x0241 }
        L_0x0057:
            boolean r13 = r6.hasNext()     // Catch:{ IOException -> 0x0241 }
            if (r13 == 0) goto L_0x0077
            java.lang.Object r13 = r6.next()     // Catch:{ IOException -> 0x0241 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ IOException -> 0x0241 }
            java.lang.Object r17 = r13.getKey()     // Catch:{ IOException -> 0x0241 }
            r4 = r17
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0241 }
            java.lang.Object r5 = r13.getValue()     // Catch:{ IOException -> 0x0241 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0241 }
            r0.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0241 }
            r4 = 0
            goto L_0x0057
        L_0x0077:
            r4 = -1
            r17 = 0
            int r6 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x0087
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r16 = r8
            goto L_0x00d2
        L_0x0087:
            r6 = 27
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0241 }
            r13.<init>(r6)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r6 = "bytes="
            r13.append(r6)     // Catch:{ IOException -> 0x0241 }
            r13.append(r8)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r6 = "-"
            r13.append(r6)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r6 = r13.toString()     // Catch:{ IOException -> 0x0241 }
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00cb
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0241 }
            long r19 = r8 + r10
            r21 = 1
            long r4 = r19 - r21
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0241 }
            int r13 = r13.length()     // Catch:{ IOException -> 0x0241 }
            r16 = 20
            int r13 = r13 + 20
            r16 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0241 }
            r8.<init>(r13)     // Catch:{ IOException -> 0x0241 }
            r8.append(r6)     // Catch:{ IOException -> 0x0241 }
            r8.append(r4)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r6 = r8.toString()     // Catch:{ IOException -> 0x0241 }
            goto L_0x00cd
        L_0x00cb:
            r16 = r8
        L_0x00cd:
            java.lang.String r4 = "Range"
            r0.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x0241 }
        L_0x00d2:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.f11371f     // Catch:{ IOException -> 0x0241 }
            r0.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0241 }
            if (r12 != 0) goto L_0x00e2
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r0.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0241 }
        L_0x00e2:
            r4 = 0
            r0.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0241 }
            if (r14 == 0) goto L_0x00ea
            r4 = 1
            goto L_0x00eb
        L_0x00ea:
            r4 = 0
        L_0x00eb:
            r0.setDoOutput(r4)     // Catch:{ IOException -> 0x0241 }
            if (r14 == 0) goto L_0x010a
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)     // Catch:{ IOException -> 0x0241 }
            int r4 = r14.length     // Catch:{ IOException -> 0x0241 }
            if (r4 == 0) goto L_0x010a
            int r4 = r14.length     // Catch:{ IOException -> 0x0241 }
            r0.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x0241 }
            r0.connect()     // Catch:{ IOException -> 0x0241 }
            java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ IOException -> 0x0241 }
            r4.write(r14)     // Catch:{ IOException -> 0x0241 }
            r4.close()     // Catch:{ IOException -> 0x0241 }
            goto L_0x010d
        L_0x010a:
            r0.connect()     // Catch:{ IOException -> 0x0241 }
        L_0x010d:
            int r4 = r0.getResponseCode()     // Catch:{ IOException -> 0x0241 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x01d4
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x01d4
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x01d4
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x01d4
            if (r14 != 0) goto L_0x012d
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x01d4
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x012d
            goto L_0x01d4
        L_0x012d:
            r1.j = r0     // Catch:{ IOException -> 0x0241 }
            java.net.HttpURLConnection r0 = r1.j     // Catch:{ IOException -> 0x01ae }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x01ae }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x0192
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x013e
            goto L_0x0192
        L_0x013e:
            if (r0 != r3) goto L_0x0149
            long r4 = r2.f11510d
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x014b
            goto L_0x014c
        L_0x0149:
            r8 = 0
        L_0x014b:
            r4 = r8
        L_0x014c:
            r1.m = r4
            r3 = 1
            boolean r0 = r2.a(r3)
            if (r0 != 0) goto L_0x016e
            long r3 = r2.f11511e
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x015e
            goto L_0x0170
        L_0x015e:
            java.net.HttpURLConnection r0 = r1.j
            long r3 = a((java.net.HttpURLConnection) r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016c
            long r5 = r1.m
            long r3 = r3 - r5
            goto L_0x0170
        L_0x016c:
            r3 = r5
            goto L_0x0170
        L_0x016e:
            long r3 = r2.f11511e
        L_0x0170:
            r1.n = r3
            java.net.HttpURLConnection r0 = r1.j     // Catch:{ IOException -> 0x0187 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0187 }
            r1.k = r0     // Catch:{ IOException -> 0x0187 }
            r3 = 1
            r1.l = r3
            com.google.android.gms.internal.ads.Dma<? super com.google.android.gms.internal.ads.mm> r0 = r1.f11373h
            if (r0 == 0) goto L_0x0184
            r0.a(r1, (com.google.android.gms.internal.ads.C2241nma) r2)
        L_0x0184:
            long r2 = r1.n
            return r2
        L_0x0187:
            r0 = move-exception
            r23.b()
            com.google.android.gms.internal.ads.uma r3 = new com.google.android.gms.internal.ads.uma
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.C2241nma) r2, (int) r4)
            throw r3
        L_0x0192:
            java.net.HttpURLConnection r3 = r1.j
            java.util.Map r3 = r3.getHeaderFields()
            r23.b()
            com.google.android.gms.internal.ads.tma r4 = new com.google.android.gms.internal.ads.tma
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x01ad
            com.google.android.gms.internal.ads.oma r0 = new com.google.android.gms.internal.ads.oma
            r5 = 0
            r0.<init>(r5)
            r4.initCause(r0)
        L_0x01ad:
            throw r4
        L_0x01ae:
            r0 = move-exception
            r23.b()
            com.google.android.gms.internal.ads.uma r4 = new com.google.android.gms.internal.ads.uma
            android.net.Uri r5 = r2.f11507a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x01c9
            java.lang.String r3 = r3.concat(r5)
            goto L_0x01cf
        L_0x01c9:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x01cf:
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            throw r4
        L_0x01d4:
            r5 = 0
            r8 = 0
            r14 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r0.getHeaderField(r4)     // Catch:{ IOException -> 0x0241 }
            r0.disconnect()     // Catch:{ IOException -> 0x0241 }
            if (r4 == 0) goto L_0x0220
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0241 }
            r0.<init>(r7, r4)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r4 = r0.getProtocol()     // Catch:{ IOException -> 0x0241 }
            java.lang.String r6 = "https"
            boolean r6 = r6.equals(r4)     // Catch:{ IOException -> 0x0241 }
            if (r6 != 0) goto L_0x0218
            java.lang.String r6 = "http"
            boolean r6 = r6.equals(r4)     // Catch:{ IOException -> 0x0241 }
            if (r6 != 0) goto L_0x0218
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0241 }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x0241 }
            int r6 = r4.length()     // Catch:{ IOException -> 0x0241 }
            if (r6 == 0) goto L_0x020f
            java.lang.String r4 = r5.concat(r4)     // Catch:{ IOException -> 0x0241 }
            goto L_0x0214
        L_0x020f:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0241 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0241 }
        L_0x0214:
            r0.<init>(r4)     // Catch:{ IOException -> 0x0241 }
            throw r0     // Catch:{ IOException -> 0x0241 }
        L_0x0218:
            r7 = r0
            r4 = r8
            r0 = r15
            r8 = r16
            r6 = 1
            goto L_0x0027
        L_0x0220:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0241 }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x0241 }
            throw r0     // Catch:{ IOException -> 0x0241 }
        L_0x0228:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0241 }
            r4 = 31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0241 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r4 = "Too many redirects: "
            r5.append(r4)     // Catch:{ IOException -> 0x0241 }
            r5.append(r15)     // Catch:{ IOException -> 0x0241 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x0241 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0241 }
            throw r0     // Catch:{ IOException -> 0x0241 }
        L_0x0241:
            r0 = move-exception
            com.google.android.gms.internal.ads.uma r4 = new com.google.android.gms.internal.ads.uma
            android.net.Uri r5 = r2.f11507a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0259
            java.lang.String r3 = r3.concat(r5)
            goto L_0x025f
        L_0x0259:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x025f:
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            goto L_0x0265
        L_0x0264:
            throw r4
        L_0x0265:
            goto L_0x0264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2169mm.a(com.google.android.gms.internal.ads.nma):long");
    }

    public final Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.q = i2;
        for (Socket next : this.r) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.q);
                } catch (SocketException e2) {
                    C1018Rk.c("Failed to update receive buffer size.", e2);
                }
            }
        }
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
            java.io.InputStream r2 = r9.k     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x007b
            java.net.HttpURLConnection r2 = r9.j     // Catch:{ all -> 0x0093 }
            long r3 = r9.n     // Catch:{ all -> 0x0093 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.n     // Catch:{ all -> 0x0093 }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.n     // Catch:{ all -> 0x0093 }
            long r7 = r9.p     // Catch:{ all -> 0x0093 }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ all -> 0x0093 }
            r8 = 19
            if (r7 == r8) goto L_0x0024
            int r7 = com.google.android.gms.internal.ads.Tma.f8821a     // Catch:{ all -> 0x0093 }
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
            java.io.InputStream r2 = r9.k     // Catch:{ IOException -> 0x0071 }
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007b
        L_0x0071:
            r2 = move-exception
            com.google.android.gms.internal.ads.uma r3 = new com.google.android.gms.internal.ads.uma     // Catch:{ all -> 0x0093 }
            com.google.android.gms.internal.ads.nma r4 = r9.i     // Catch:{ all -> 0x0093 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.C2241nma) r4, (int) r5)     // Catch:{ all -> 0x0093 }
            throw r3     // Catch:{ all -> 0x0093 }
        L_0x007b:
            r9.k = r0
            r9.b()
            boolean r0 = r9.l
            if (r0 == 0) goto L_0x008d
            r9.l = r1
            com.google.android.gms.internal.ads.Dma<? super com.google.android.gms.internal.ads.mm> r0 = r9.f11373h
            if (r0 == 0) goto L_0x008d
            r0.d(r9)
        L_0x008d:
            java.util.Set<java.net.Socket> r0 = r9.r
            r0.clear()
            return
        L_0x0093:
            r2 = move-exception
            r9.k = r0
            r9.b()
            boolean r0 = r9.l
            if (r0 == 0) goto L_0x00a6
            r9.l = r1
            com.google.android.gms.internal.ads.Dma<? super com.google.android.gms.internal.ads.mm> r0 = r9.f11373h
            if (r0 == 0) goto L_0x00a6
            r0.d(r9)
        L_0x00a6:
            java.util.Set<java.net.Socket> r0 = r9.r
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2169mm.close():void");
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final int read(byte[] bArr, int i2, int i3) {
        try {
            if (this.o != this.m) {
                byte[] andSet = f11367b.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.o != this.m) {
                    int read = this.k.read(andSet, 0, (int) Math.min(this.m - this.o, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.o += (long) read;
                        if (this.f11373h != null) {
                            this.f11373h.a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f11367b.set(andSet);
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.n != -1) {
                long j2 = this.n - this.p;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = this.k.read(bArr, i2, i3);
            if (read2 != -1) {
                this.p += (long) read2;
                if (this.f11373h != null) {
                    this.f11373h.a(this, read2);
                }
                return read2;
            } else if (this.n == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new C2737uma(e2, this.i, 2);
        }
    }
}
