package c.c.a.a;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

class a implements HttpRequestInterceptor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f5085a;

    a(c cVar) {
        this.f5085a = cVar;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        if (!httpRequest.containsHeader("Accept-Encoding")) {
            httpRequest.addHeader("Accept-Encoding", "gzip");
        }
        for (String str : this.f5085a.f5093g.keySet()) {
            httpRequest.addHeader(str, (String) this.f5085a.f5093g.get(str));
        }
    }
}
