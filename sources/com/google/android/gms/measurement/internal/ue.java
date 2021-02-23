package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class ue extends SSLSocket {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocket f13795a;

    ue(ve veVar, SSLSocket sSLSocket) {
        this.f13795a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f13795a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.f13795a.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f13795a.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f13795a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f13795a.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.f13795a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f13795a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f13795a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f13795a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f13795a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f13795a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f13795a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f13795a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f13795a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f13795a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f13795a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f13795a.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.f13795a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f13795a.getOutputStream();
    }

    public final int getPort() {
        return this.f13795a.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f13795a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f13795a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f13795a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f13795a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f13795a.getSession();
    }

    public final int getSoLinger() {
        return this.f13795a.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f13795a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f13795a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f13795a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.f13795a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f13795a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f13795a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f13795a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f13795a.isBound();
    }

    public final boolean isClosed() {
        return this.f13795a.isClosed();
    }

    public final boolean isConnected() {
        return this.f13795a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f13795a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f13795a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f13795a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.f13795a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f13795a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f13795a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f13795a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f13795a.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.f13795a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f13795a.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.f13795a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f13795a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f13795a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f13795a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f13795a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f13795a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f13795a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f13795a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f13795a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f13795a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f13795a.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.f13795a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f13795a.shutdownOutput();
    }

    public final void startHandshake() {
        this.f13795a.startHandshake();
    }

    public final String toString() {
        return this.f13795a.toString();
    }
}
