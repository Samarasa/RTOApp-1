package c.c.a.a;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

class k implements HttpRequestRetryHandler {

    /* renamed from: a  reason: collision with root package name */
    private static HashSet<Class<?>> f5114a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashSet<Class<?>> f5115b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final int f5116c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5117d;

    static {
        f5114a.add(NoHttpResponseException.class);
        f5114a.add(UnknownHostException.class);
        f5114a.add(SocketException.class);
        f5115b.add(InterruptedIOException.class);
        f5115b.add(SSLException.class);
    }

    public k(int i, int i2) {
        this.f5116c = i;
        this.f5117d = i2;
    }

    /* access modifiers changed from: protected */
    public boolean a(HashSet<Class<?>> hashSet, Throwable th) {
        Iterator<Class<?>> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(th)) {
                return true;
            }
        }
        return false;
    }

    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        boolean z;
        Boolean bool = (Boolean) httpContext.getAttribute("http.request_sent");
        if (bool == null || !bool.booleanValue()) {
        }
        if (i <= this.f5116c && !a(f5115b, iOException)) {
            boolean a2 = a(f5114a, iOException);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            HttpUriRequest httpUriRequest = (HttpUriRequest) httpContext.getAttribute("http.request");
            if (httpUriRequest == null) {
                return false;
            }
            z = !httpUriRequest.getMethod().equals("POST");
        }
        if (z) {
            SystemClock.sleep((long) this.f5117d);
        } else {
            iOException.printStackTrace();
        }
        return z;
    }
}
