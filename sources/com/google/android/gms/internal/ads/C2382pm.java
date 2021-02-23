package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.pm  reason: case insensitive filesystem */
final class C2382pm extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f11755a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2169mm f11756b;

    C2382pm(C2169mm mmVar) {
        this.f11756b = mmVar;
    }

    private final Socket a(Socket socket) {
        if (this.f11756b.q > 0) {
            socket.setReceiveBufferSize(this.f11756b.q);
        }
        this.f11756b.a(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f11755a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f11755a.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f11755a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f11755a.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f11755a.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f11755a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f11755a.getSupportedCipherSuites();
    }
}
