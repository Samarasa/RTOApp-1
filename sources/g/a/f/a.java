package g.a.f;

import android.util.Log;
import g.F;
import g.a.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

class a extends e {

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f15187c;

    /* renamed from: d  reason: collision with root package name */
    private final d<Socket> f15188d;

    /* renamed from: e  reason: collision with root package name */
    private final d<Socket> f15189e;

    /* renamed from: f  reason: collision with root package name */
    private final d<Socket> f15190f;

    /* renamed from: g  reason: collision with root package name */
    private final d<Socket> f15191g;

    /* renamed from: h  reason: collision with root package name */
    private final b f15192h = b.a();

    /* renamed from: g.a.f.a$a  reason: collision with other inner class name */
    static final class C0090a extends g.a.h.b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f15193a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f15194b;

        C0090a(Object obj, Method method) {
            this.f15193a = obj;
            this.f15194b = method;
        }

        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.f15194b.invoke(this.f15193a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0090a;
        }

        public int hashCode() {
            return 0;
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Method f15195a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f15196b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f15197c;

        b(Method method, Method method2, Method method3) {
            this.f15195a = method;
            this.f15196b = method2;
            this.f15197c = method3;
        }

        static b a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new b(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        public Object a(String str) {
            Method method = this.f15195a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f15196b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f15197c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public a(Class<?> cls, d<Socket> dVar, d<Socket> dVar2, d<Socket> dVar3, d<Socket> dVar4) {
        this.f15187c = cls;
        this.f15188d = dVar;
        this.f15189e = dVar2;
        this.f15190f = dVar3;
        this.f15191g = dVar4;
    }

    public static e b() {
        Class<?> cls;
        d dVar;
        d dVar2;
        d dVar3;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class<?> cls2 = cls;
        d dVar4 = new d((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        d dVar5 = new d((Class<?>) null, "setHostname", String.class);
        try {
            Class.forName("android.net.Network");
            dVar3 = new d(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            try {
                dVar = new d((Class<?>) null, "setAlpnProtocols", byte[].class);
                dVar2 = dVar3;
            } catch (ClassNotFoundException unused3) {
                dVar2 = dVar3;
                dVar = null;
                return new a(cls2, dVar4, dVar5, dVar2, dVar);
            }
        } catch (ClassNotFoundException unused4) {
            dVar3 = null;
            dVar2 = dVar3;
            dVar = null;
            return new a(cls2, dVar4, dVar5, dVar2, dVar);
        }
        return new a(cls2, dVar4, dVar5, dVar2, dVar);
    }

    public g.a.h.b a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0090a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public Object a(String str) {
        return this.f15192h.a(str);
    }

    public void a(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    public void a(String str, Object obj) {
        if (!this.f15192h.a(obj)) {
            a(5, str, (Throwable) null);
        }
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (e.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<F> list) {
        if (str != null) {
            this.f15188d.c(sSLSocket, true);
            this.f15189e.c(sSLSocket, str);
        }
        d<Socket> dVar = this.f15191g;
        if (dVar != null && dVar.a(sSLSocket)) {
            this.f15191g.d(sSLSocket, e.b(list));
        }
    }

    public String b(SSLSocket sSLSocket) {
        byte[] bArr;
        d<Socket> dVar = this.f15190f;
        if (dVar == null || !dVar.a(sSLSocket) || (bArr = (byte[]) this.f15190f.d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, e.j);
    }

    public boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(invoke, new Object[]{str})).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }
}
