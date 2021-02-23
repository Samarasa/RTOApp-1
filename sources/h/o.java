package h;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

class o extends c {
    final /* synthetic */ Socket k;

    o(Socket socket) {
        this.k = socket;
    }

    /* access modifiers changed from: protected */
    public IOException b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.k     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
            r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
            goto L_0x0033
        L_0x0008:
            r1 = move-exception
            boolean r2 = h.p.a((java.lang.AssertionError) r1)
            if (r2 == 0) goto L_0x0019
            java.util.logging.Logger r2 = h.p.f15349a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0024
        L_0x0019:
            throw r1
        L_0x001a:
            r1 = move-exception
            java.util.logging.Logger r2 = h.p.f15349a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0024:
            r4.append(r0)
            java.net.Socket r0 = r5.k
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.j():void");
    }
}
