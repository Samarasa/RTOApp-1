package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;
import java.net.URL;
import java.util.Map;

final class Kb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f13323a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f13324b;

    /* renamed from: c  reason: collision with root package name */
    private final Ib f13325c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13326d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f13327e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Gb f13328f;

    public Kb(Gb gb, String str, URL url, byte[] bArr, Map<String, String> map, Ib ib) {
        this.f13328f = gb;
        C0563t.b(str);
        C0563t.a(url);
        C0563t.a(ib);
        this.f13323a = url;
        this.f13324b = bArr;
        this.f13325c = ib;
        this.f13326d = str;
        this.f13327e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6 A[SYNTHETIC, Splitter:B:45:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0101 A[SYNTHETIC, Splitter:B:58:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.Gb r1 = r13.f13328f
            r1.b()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.Gb r3 = r13.f13328f     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.URL r4 = r13.f13323a     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.HttpURLConnection r3 = r3.a((java.net.URL) r4)     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f13327e     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f13327e     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f13324b     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x0086
            com.google.android.gms.measurement.internal.Gb r4 = r13.f13328f     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.oe r4 = r4.n()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r5 = r13.f13324b     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r4 = r4.c(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.Gb r5 = r13.f13328f     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.Db r5 = r5.B()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.a(r6, r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            int r5 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.connect()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.write(r4)     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r4 = move-exception
            r11 = r1
            r1 = r5
            goto L_0x00c3
        L_0x0080:
            r4 = move-exception
            r11 = r1
            r9 = r4
            r1 = r5
            goto L_0x00fe
        L_0x0086:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
            com.google.android.gms.measurement.internal.Gb r2 = r13.f13328f     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            byte[] r10 = com.google.android.gms.measurement.internal.Gb.a((java.net.HttpURLConnection) r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            if (r3 == 0) goto L_0x0099
            r3.disconnect()
        L_0x0099:
            com.google.android.gms.measurement.internal.Gb r0 = r13.f13328f
            com.google.android.gms.measurement.internal.Zb r0 = r0.g()
            com.google.android.gms.measurement.internal.Hb r1 = new com.google.android.gms.measurement.internal.Hb
            java.lang.String r6 = r13.f13326d
            com.google.android.gms.measurement.internal.Ib r7 = r13.f13325c
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00ab:
            r0.a((java.lang.Runnable) r1)
            return
        L_0x00af:
            r4 = move-exception
            goto L_0x00c4
        L_0x00b1:
            r4 = move-exception
            goto L_0x00b8
        L_0x00b3:
            r4 = move-exception
            r11 = r1
            goto L_0x00c4
        L_0x00b6:
            r4 = move-exception
            r11 = r1
        L_0x00b8:
            r9 = r4
            goto L_0x00ff
        L_0x00ba:
            r4 = move-exception
            r11 = r1
            goto L_0x00c3
        L_0x00bd:
            r4 = move-exception
            r11 = r1
            goto L_0x00fd
        L_0x00c0:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00de
            r1.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00de
        L_0x00ca:
            r1 = move-exception
            com.google.android.gms.measurement.internal.Gb r2 = r13.f13328f
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.t()
            java.lang.String r5 = r13.f13326d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r5)
            r2.a(r0, r5, r1)
        L_0x00de:
            if (r3 == 0) goto L_0x00e3
            r3.disconnect()
        L_0x00e3:
            com.google.android.gms.measurement.internal.Gb r0 = r13.f13328f
            com.google.android.gms.measurement.internal.Zb r0 = r0.g()
            com.google.android.gms.measurement.internal.Hb r1 = new com.google.android.gms.measurement.internal.Hb
            java.lang.String r6 = r13.f13326d
            com.google.android.gms.measurement.internal.Ib r7 = r13.f13325c
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.a((java.lang.Runnable) r1)
            throw r4
        L_0x00fa:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00fd:
            r9 = r4
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            if (r1 == 0) goto L_0x0119
            r1.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x0119
        L_0x0105:
            r1 = move-exception
            com.google.android.gms.measurement.internal.Gb r2 = r13.f13328f
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.t()
            java.lang.String r4 = r13.f13326d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r4)
            r2.a(r0, r4, r1)
        L_0x0119:
            if (r3 == 0) goto L_0x011e
            r3.disconnect()
        L_0x011e:
            com.google.android.gms.measurement.internal.Gb r0 = r13.f13328f
            com.google.android.gms.measurement.internal.Zb r0 = r0.g()
            com.google.android.gms.measurement.internal.Hb r1 = new com.google.android.gms.measurement.internal.Hb
            java.lang.String r6 = r13.f13326d
            com.google.android.gms.measurement.internal.Ib r7 = r13.f13325c
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Kb.run():void");
    }
}
