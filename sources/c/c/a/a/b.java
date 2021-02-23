package c.c.a.a;

import c.c.a.a.c;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

class b implements HttpResponseInterceptor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f5086a;

    b(c cVar) {
        this.f5086a = cVar;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Header contentEncoding;
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && (contentEncoding = entity.getContentEncoding()) != null) {
            for (HeaderElement name : contentEncoding.getElements()) {
                if (name.getName().equalsIgnoreCase("gzip")) {
                    httpResponse.setEntity(new c.a(entity));
                    return;
                }
            }
        }
    }
}
