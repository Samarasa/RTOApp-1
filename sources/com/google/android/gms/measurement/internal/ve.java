package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class ve extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f13803a;

    ve() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private ve(SSLSocketFactory sSLSocketFactory) {
        this.f13803a = sSLSocketFactory;
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new ue(this, sSLSocket);
    }

    public final Socket createSocket() {
        return a((SSLSocket) this.f13803a.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return a((SSLSocket) this.f13803a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a((SSLSocket) this.f13803a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a((SSLSocket) this.f13803a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a((SSLSocket) this.f13803a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a((SSLSocket) this.f13803a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f13803a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f13803a.getSupportedCipherSuites();
    }
}
