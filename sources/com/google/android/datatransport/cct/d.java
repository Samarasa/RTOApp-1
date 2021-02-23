package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import c.b.b.a.a.k;
import c.b.b.a.a.l;
import c.b.d.b.c;
import com.google.android.datatransport.cct.a.C0489a;
import com.google.android.datatransport.cct.a.p;
import com.google.android.datatransport.cct.a.r;
import com.google.android.datatransport.cct.a.t;
import com.google.android.datatransport.cct.a.u;
import com.google.android.datatransport.cct.a.w;
import com.google.android.datatransport.cct.a.y;
import com.google.android.datatransport.cct.a.z;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.backends.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jsoup.helper.HttpConnection;

final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    private final c.b.d.b.a f5242a = t.a();

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f5243b;

    /* renamed from: c  reason: collision with root package name */
    final URL f5244c;

    /* renamed from: d  reason: collision with root package name */
    private final c.b.b.a.a.e.a f5245d;

    /* renamed from: e  reason: collision with root package name */
    private final c.b.b.a.a.e.a f5246e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5247f;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f5248a;

        /* renamed from: b  reason: collision with root package name */
        final p f5249b;

        /* renamed from: c  reason: collision with root package name */
        final String f5250c;

        a(URL url, p pVar, String str) {
            this.f5248a = url;
            this.f5249b = pVar;
            this.f5250c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f5249b, this.f5250c);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f5251a;

        /* renamed from: b  reason: collision with root package name */
        final URL f5252b;

        /* renamed from: c  reason: collision with root package name */
        final long f5253c;

        b(int i, URL url, long j) {
            this.f5251a = i;
            this.f5252b = url;
            this.f5253c = j;
        }
    }

    d(Context context, c.b.b.a.a.e.a aVar, c.b.b.a.a.e.a aVar2) {
        this.f5243b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5244c = a(a.f5153a);
        this.f5245d = aVar2;
        this.f5246e = aVar;
        this.f5247f = 40000;
    }

    static /* synthetic */ a a(a aVar, b bVar) {
        URL url = bVar.f5252b;
        if (url == null) {
            return null;
        }
        c.b.b.a.a.a.a.a("CctTransportBackend", "Following redirect to: %s", (Object) url);
        return aVar.a(bVar.f5252b);
    }

    /* access modifiers changed from: private */
    public b a(a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream inputStream;
        c.b.b.a.a.a.a.a("CctTransportBackend", "Making request to: %s", (Object) aVar.f5248a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5248a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5247f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"2.2.0"}));
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5250c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                this.f5242a.a(aVar.f5249b, new OutputStreamWriter(gZIPOutputStream));
                gZIPOutputStream.close();
                newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                int responseCode = httpURLConnection.getResponseCode();
                StringBuilder sb = new StringBuilder();
                sb.append("Status Code: ");
                sb.append(responseCode);
                c.b.b.a.a.a.a.a("CctTransportBackend", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Content-Type: ");
                sb2.append(httpURLConnection.getHeaderField("Content-Type"));
                c.b.b.a.a.a.a.a("CctTransportBackend", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Content-Encoding: ");
                sb3.append(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING));
                c.b.b.a.a.a.a.a("CctTransportBackend", sb3.toString());
                if (!(responseCode == 302 || responseCode == 301)) {
                    if (responseCode != 307) {
                        if (responseCode != 200) {
                            b bVar = new b(responseCode, (URL) null, 0);
                            newChannel.close();
                            return bVar;
                        }
                        String headerField = httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING);
                        inputStream = (headerField == null || !headerField.equals("gzip")) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
                        b bVar2 = new b(responseCode, (URL) null, y.a(new InputStreamReader(inputStream)).a());
                        inputStream.close();
                        newChannel.close();
                        return bVar2;
                    }
                }
                b bVar3 = new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                newChannel.close();
                return bVar3;
            } catch (c | IOException e2) {
                c.b.b.a.a.a.a.a("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
                b bVar4 = new b(400, (URL) null, 0);
                gZIPOutputStream.close();
                newChannel.close();
                return bVar4;
            }
        } catch (Throwable th) {
            newChannel.close();
            throw th;
        }
    }

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    public l a(l lVar) {
        int i;
        z.b bVar;
        NetworkInfo activeNetworkInfo = this.f5243b.getActiveNetworkInfo();
        l.a i2 = lVar.i();
        i2.a("sdk-version", Build.VERSION.SDK_INT);
        i2.a("model", Build.MODEL);
        i2.a("hardware", Build.HARDWARE);
        i2.a("device", Build.DEVICE);
        i2.a("product", Build.PRODUCT);
        i2.a("os-uild", Build.ID);
        i2.a("manufacturer", Build.MANUFACTURER);
        i2.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        i2.a("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        i2.a("net-type", activeNetworkInfo == null ? z.c.NONE.a() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = z.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            i = activeNetworkInfo.getSubtype();
            if (i == -1) {
                bVar = z.b.COMBINED;
            } else {
                if (z.b.a(i) == null) {
                    i = 0;
                }
                i2.a("mobile-subtype", i);
                return i2.a();
            }
        }
        i = bVar.a();
        i2.a("mobile-subtype", i);
        return i2.a();
    }

    public h a(g gVar) {
        u.a aVar;
        HashMap hashMap = new HashMap();
        for (l next : gVar.b()) {
            String g2 = next.g();
            if (!hashMap.containsKey(g2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(g2, arrayList);
            } else {
                ((List) hashMap.get(g2)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar = (l) ((List) entry.getValue()).get(0);
            w.a a2 = w.a();
            a2.a(com.google.android.datatransport.cct.a.b.DEFAULT);
            a2.a(this.f5246e.a());
            a2.b(this.f5245d.a());
            r.a a3 = r.a();
            a3.a(r.b.ANDROID);
            C0489a.C0068a a4 = C0489a.a();
            a4.a(lVar.b("sdk-version"));
            a4.e(lVar.a("model"));
            a4.c(lVar.a("hardware"));
            a4.a(lVar.a("device"));
            a4.g(lVar.a("product"));
            a4.f(lVar.a("os-uild"));
            a4.d(lVar.a("manufacturer"));
            a4.b(lVar.a("fingerprint"));
            a3.a(a4.a());
            a2.a(a3.a());
            try {
                a2.b(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                a2.b((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (l lVar2 : (List) entry.getValue()) {
                k d2 = lVar2.d();
                c.b.b.a.b b2 = d2.b();
                if (b2.equals(c.b.b.a.b.a("proto"))) {
                    aVar = u.a(d2.a());
                } else if (b2.equals(c.b.b.a.b.a("json"))) {
                    aVar = u.a(new String(d2.a(), Charset.forName("UTF-8")));
                } else {
                    c.b.b.a.a.a.a.b("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.a(lVar2.e());
                aVar.b(lVar2.h());
                aVar.c(lVar2.c("tz-offset"));
                z.a a5 = z.a();
                a5.a(z.c.a(lVar2.b("net-type")));
                a5.a(z.b.a(lVar2.b("mobile-subtype")));
                aVar.a(a5.a());
                if (lVar2.c() != null) {
                    aVar.a(lVar2.c().intValue());
                }
                arrayList3.add(aVar.a());
            }
            a2.a((List<u>) arrayList3);
            arrayList2.add(a2.a());
        }
        p a6 = p.a(arrayList2);
        String str = null;
        URL url = this.f5244c;
        if (gVar.c() != null) {
            try {
                a a7 = a.a(gVar.c());
                if (a7.c() != null) {
                    str = a7.c();
                }
                if (a7.d() != null) {
                    url = a(a7.d());
                }
            } catch (IllegalArgumentException unused2) {
                return h.a();
            }
        }
        try {
            b bVar = (b) c.b.b.a.a.b.b.a(5, new a(url, a6, str), b.a(this), c.a());
            if (bVar.f5251a == 200) {
                return h.a(bVar.f5253c);
            }
            int i = bVar.f5251a;
            if (i < 500) {
                if (i != 404) {
                    return h.a();
                }
            }
            return h.d();
        } catch (IOException e2) {
            c.b.b.a.a.a.a.a("CctTransportBackend", "Could not make request to the backend", (Throwable) e2);
            return h.d();
        }
    }
}
