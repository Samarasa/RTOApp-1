package h;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f15349a = Logger.getLogger(p.class.getName());

    private p() {
    }

    public static f a(v vVar) {
        return new q(vVar);
    }

    public static g a(w wVar) {
        return new r(wVar);
    }

    private static v a(OutputStream outputStream, y yVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (yVar != null) {
            return new m(yVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static v a(Socket socket) {
        if (socket != null) {
            c c2 = c(socket);
            return c2.a(a(socket.getOutputStream(), (y) c2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static w a(InputStream inputStream) {
        return a(inputStream, new y());
    }

    private static w a(InputStream inputStream, y yVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (yVar != null) {
            return new n(yVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static w b(Socket socket) {
        if (socket != null) {
            c c2 = c(socket);
            return c2.a(a(socket.getInputStream(), (y) c2));
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static c c(Socket socket) {
        return new o(socket);
    }
}
