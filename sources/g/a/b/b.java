package g.a.b;

import g.C3353n;
import g.a.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C3353n> f14954a;

    /* renamed from: b  reason: collision with root package name */
    private int f14955b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14956c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14957d;

    public b(List<C3353n> list) {
        this.f14954a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.f14955b; i < this.f14954a.size(); i++) {
            if (this.f14954a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public C3353n a(SSLSocket sSLSocket) {
        C3353n nVar;
        int i = this.f14955b;
        int size = this.f14954a.size();
        while (true) {
            if (i >= size) {
                nVar = null;
                break;
            }
            nVar = this.f14954a.get(i);
            if (nVar.a(sSLSocket)) {
                this.f14955b = i + 1;
                break;
            }
            i++;
        }
        if (nVar != null) {
            this.f14956c = b(sSLSocket);
            a.f14935a.a(nVar, sSLSocket, this.f14957d);
            return nVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f14957d + ", modes=" + this.f14954a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f14957d = true;
        if (!this.f14956c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((!z || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return z || (iOException instanceof SSLProtocolException);
        }
        return false;
    }
}
