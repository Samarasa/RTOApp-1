package org.jsoup.helper;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

class c implements HostnameVerifier {
    c() {
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
