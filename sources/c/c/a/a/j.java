package c.c.a.a;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public interface j {
    void sendFailureMessage(int i, Header[] headerArr, byte[] bArr, Throwable th);

    void sendFinishMessage();

    void sendProgressMessage(int i, int i2);

    void sendResponseMessage(HttpResponse httpResponse);

    void sendRetryMessage();

    void sendStartMessage();

    void setRequestHeaders(Header[] headerArr);

    void setRequestURI(URI uri);
}
