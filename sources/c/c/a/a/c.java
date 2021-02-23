package c.c.a.a;

import android.content.Context;
import android.util.Log;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private int f5087a;

    /* renamed from: b  reason: collision with root package name */
    private int f5088b;

    /* renamed from: c  reason: collision with root package name */
    private final DefaultHttpClient f5089c;

    /* renamed from: d  reason: collision with root package name */
    private final HttpContext f5090d;

    /* renamed from: e  reason: collision with root package name */
    private ThreadPoolExecutor f5091e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Context, List<WeakReference<Future<?>>>> f5092f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, String> f5093g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5094h;

    private static class a extends HttpEntityWrapper {
        public a(HttpEntity httpEntity) {
            super(httpEntity);
        }

        public InputStream getContent() {
            return new GZIPInputStream(this.wrappedEntity.getContent());
        }

        public long getContentLength() {
            return -1;
        }
    }

    public c() {
        this(false, 80, 443);
    }

    public c(SchemeRegistry schemeRegistry) {
        this.f5087a = 10;
        this.f5088b = 10000;
        this.f5094h = true;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        ConnManagerParams.setTimeout(basicHttpParams, (long) this.f5088b);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(this.f5087a));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 10);
        HttpConnectionParams.setSoTimeout(basicHttpParams, this.f5088b);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, this.f5088b);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUserAgent(basicHttpParams, String.format("android-async-http/%s (http://loopj.com/android-async-http)", new Object[]{"1.4.4"}));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        this.f5091e = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        this.f5092f = new WeakHashMap();
        this.f5093g = new HashMap();
        this.f5090d = new SyncBasicHttpContext(new BasicHttpContext());
        this.f5089c = new DefaultHttpClient(threadSafeClientConnManager, basicHttpParams);
        this.f5089c.addRequestInterceptor(new a(this));
        this.f5089c.addResponseInterceptor(new b(this));
        this.f5089c.setHttpRequestRetryHandler(new k(5, 1500));
    }

    public c(boolean z, int i, int i2) {
        this(a(z, i, i2));
    }

    public static String a(boolean z, String str, i iVar) {
        if (z) {
            str = str.replace(" ", "%20");
        }
        if (iVar == null) {
            return str;
        }
        String a2 = iVar.a();
        if (!str.contains("?")) {
            return str + "?" + a2;
        }
        return str + "&" + a2;
    }

    private HttpEntity a(i iVar, j jVar) {
        if (iVar == null) {
            return null;
        }
        try {
            return iVar.a(jVar);
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.sendFailureMessage(0, (Header[]) null, (byte[]) null, th);
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    private HttpEntityEnclosingRequestBase a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, HttpEntity httpEntity) {
        if (httpEntity != null) {
            httpEntityEnclosingRequestBase.setEntity(httpEntity);
        }
        return httpEntityEnclosingRequestBase;
    }

    private static SchemeRegistry a(boolean z, int i, int i2) {
        if (z) {
            Log.d("AsyncHttpClient", "Beware! Using the fix is insecure, as it doesn't verify SSL certificates.");
        }
        if (i < 1) {
            i = 80;
            Log.d("AsyncHttpClient", "Invalid HTTP port number specified, defaulting to 80");
        }
        if (i2 < 1) {
            i2 = 443;
            Log.d("AsyncHttpClient", "Invalid HTTPS port number specified, defaulting to 443");
        }
        SSLSocketFactory a2 = z ? g.a() : SSLSocketFactory.getSocketFactory();
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), i));
        schemeRegistry.register(new Scheme("https", a2, i2));
        return schemeRegistry;
    }

    public h a(Context context, String str, i iVar, j jVar) {
        return a(this.f5089c, this.f5090d, new HttpGet(a(this.f5094h, str, iVar)), (String) null, jVar, context);
    }

    public h a(Context context, String str, HttpEntity httpEntity, String str2, j jVar) {
        DefaultHttpClient defaultHttpClient = this.f5089c;
        HttpContext httpContext = this.f5090d;
        HttpPost httpPost = new HttpPost(str);
        a((HttpEntityEnclosingRequestBase) httpPost, httpEntity);
        return a(defaultHttpClient, httpContext, httpPost, str2, jVar, context);
    }

    public h a(String str, i iVar, j jVar) {
        return b((Context) null, str, iVar, jVar);
    }

    public h a(String str, j jVar) {
        return a((Context) null, str, (i) null, jVar);
    }

    /* access modifiers changed from: protected */
    public h a(DefaultHttpClient defaultHttpClient, HttpContext httpContext, HttpUriRequest httpUriRequest, String str, j jVar, Context context) {
        if (str != null) {
            httpUriRequest.addHeader("Content-Type", str);
        }
        jVar.setRequestHeaders(httpUriRequest.getAllHeaders());
        jVar.setRequestURI(httpUriRequest.getURI());
        Future submit = this.f5091e.submit(new d(defaultHttpClient, httpContext, httpUriRequest, jVar));
        if (context != null) {
            List list = this.f5092f.get(context);
            if (list == null) {
                list = new LinkedList();
                this.f5092f.put(context, list);
            }
            list.add(new WeakReference(submit));
        }
        return new h(submit);
    }

    public void a(int i) {
        if (i < 1000) {
            i = 10000;
        }
        this.f5088b = i;
        HttpParams params = this.f5089c.getParams();
        ConnManagerParams.setTimeout(params, (long) this.f5088b);
        HttpConnectionParams.setSoTimeout(params, this.f5088b);
        HttpConnectionParams.setConnectionTimeout(params, this.f5088b);
    }

    public void a(String str, String str2) {
        this.f5093g.put(str, str2);
    }

    public h b(Context context, String str, i iVar, j jVar) {
        return a(context, str, a(iVar, jVar), (String) null, jVar);
    }
}
