package c.c.a.a;

import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractHttpClient f5095a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpContext f5096b;

    /* renamed from: c  reason: collision with root package name */
    private final HttpUriRequest f5097c;

    /* renamed from: d  reason: collision with root package name */
    private final j f5098d;

    /* renamed from: e  reason: collision with root package name */
    private int f5099e;

    public d(AbstractHttpClient abstractHttpClient, HttpContext httpContext, HttpUriRequest httpUriRequest, j jVar) {
        this.f5095a = abstractHttpClient;
        this.f5096b = httpContext;
        this.f5097c = httpUriRequest;
        this.f5098d = jVar;
    }

    private void a() {
        j jVar;
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        if (this.f5097c.getURI().getScheme() != null) {
            HttpResponse execute = this.f5095a.execute(this.f5097c, this.f5096b);
            if (!Thread.currentThread().isInterrupted() && (jVar = this.f5098d) != null) {
                jVar.sendResponseMessage(execute);
                return;
            }
            return;
        }
        throw new MalformedURLException("No valid URI scheme was provided");
    }

    private void b() {
        HttpRequestRetryHandler httpRequestRetryHandler = this.f5095a.getHttpRequestRetryHandler();
        IOException iOException = null;
        boolean z = true;
        while (z) {
            try {
                a();
                return;
            } catch (UnknownHostException e2) {
                iOException = new IOException("UnknownHostException exception: " + e2.getMessage());
                if (this.f5099e > 0) {
                    int i = this.f5099e + 1;
                    this.f5099e = i;
                    if (httpRequestRetryHandler.retryRequest(iOException, i, this.f5096b)) {
                        z = true;
                    }
                }
                z = false;
            } catch (NullPointerException e3) {
                iOException = new IOException("NPE in HttpClient: " + e3.getMessage());
                int i2 = this.f5099e + 1;
                this.f5099e = i2;
                z = httpRequestRetryHandler.retryRequest(iOException, i2, this.f5096b);
            } catch (IOException e4) {
                try {
                    int i3 = this.f5099e + 1;
                    this.f5099e = i3;
                    boolean retryRequest = httpRequestRetryHandler.retryRequest(e4, i3, this.f5096b);
                    iOException = e4;
                    z = retryRequest;
                } catch (Exception e5) {
                    Log.e("AsyncHttpRequest", "Unhandled exception origin cause", e5);
                    iOException = new IOException("Unhandled exception: " + e5.getMessage());
                }
            }
        }
        throw iOException;
        if (z && this.f5098d != null) {
            this.f5098d.sendRetryMessage();
        }
    }

    public void run() {
        j jVar = this.f5098d;
        if (jVar != null) {
            jVar.sendStartMessage();
        }
        try {
            b();
        } catch (IOException e2) {
            j jVar2 = this.f5098d;
            if (jVar2 != null) {
                jVar2.sendFailureMessage(0, (Header[]) null, (byte[]) null, e2);
            }
        }
        j jVar3 = this.f5098d;
        if (jVar3 != null) {
            jVar3.sendFinishMessage();
        }
    }
}
