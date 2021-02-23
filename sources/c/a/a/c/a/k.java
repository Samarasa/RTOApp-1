package c.a.a.c.a;

import android.text.TextUtils;
import android.util.Log;
import c.a.a.c.a.d;
import c.a.a.c.c.l;
import c.a.a.c.e;
import c.a.a.h;
import c.a.a.i.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class k implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    static final b f2977a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final l f2978b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2979c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2980d;

    /* renamed from: e  reason: collision with root package name */
    private HttpURLConnection f2981e;

    /* renamed from: f  reason: collision with root package name */
    private InputStream f2982f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f2983g;

    private static class a implements b {
        a() {
        }

        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public k(l lVar, int i) {
        this(lVar, i, f2977a);
    }

    k(l lVar, int i, b bVar) {
        this.f2978b = lVar;
        this.f2979c = i;
        this.f2980d = bVar;
    }

    private InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = c.a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f2982f = inputStream;
        return this.f2982f;
    }

    private InputStream a(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f2981e = this.f2980d.a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f2981e.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f2981e.setConnectTimeout(this.f2979c);
            this.f2981e.setReadTimeout(this.f2979c);
            this.f2981e.setUseCaches(false);
            this.f2981e.setDoInput(true);
            this.f2981e.setInstanceFollowRedirects(false);
            this.f2981e.connect();
            this.f2982f = this.f2981e.getInputStream();
            if (this.f2983g) {
                return null;
            }
            int responseCode = this.f2981e.getResponseCode();
            if (a(responseCode)) {
                return a(this.f2981e);
            }
            if (b(responseCode)) {
                String headerField = this.f2981e.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return a(url3, i + 1, url, map);
                }
                throw new e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new e(responseCode);
            } else {
                throw new e(this.f2981e.getResponseMessage(), responseCode);
            }
        } else {
            throw new e("Too many (> 5) redirects!");
        }
    }

    private static boolean a(int i) {
        return i / 100 == 2;
    }

    private static boolean b(int i) {
        return i / 100 == 3;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void a(h hVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long a2 = c.a.a.i.e.a();
        try {
            aVar.a(a(this.f2978b.c(), 0, (URL) null, this.f2978b.b()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(c.a.a.i.e.a(a2));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
            }
            aVar.a((Exception) e2);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + c.a.a.i.e.a(a2));
            }
            throw th;
        }
    }

    public void b() {
        InputStream inputStream = this.f2982f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2981e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2981e = null;
    }

    public c.a.a.c.a c() {
        return c.a.a.c.a.REMOTE;
    }

    public void cancel() {
        this.f2983g = true;
    }
}
