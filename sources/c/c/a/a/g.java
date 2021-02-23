package c.c.a.a;

import java.io.InputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class g extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    SSLContext f5102a = SSLContext.getInstance("TLS");

    public g(KeyStore keyStore) {
        super(keyStore);
        f fVar = new f(this);
        this.f5102a.init((KeyManager[]) null, new TrustManager[]{fVar}, (SecureRandom) null);
    }

    public static SSLSocketFactory a() {
        try {
            g gVar = new g(b());
            gVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            return gVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return SSLSocketFactory.getSocketFactory();
        }
    }

    public static KeyStore b() {
        KeyStore keyStore = null;
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                instance.load((InputStream) null, (char[]) null);
                return instance;
            } catch (Throwable th) {
                KeyStore keyStore2 = instance;
                th = th;
                keyStore = keyStore2;
                th.printStackTrace();
                return keyStore;
            }
        } catch (Throwable th2) {
            th = th2;
            th.printStackTrace();
            return keyStore;
        }
    }

    public Socket createSocket() {
        return this.f5102a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f5102a.getSocketFactory().createSocket(socket, str, i, z);
    }
}
