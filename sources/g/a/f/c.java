package g.a.f;

import g.F;
import g.a.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private final Method f15200c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f15201d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f15202e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f15203f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f15204g;

    private static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f15205a;

        /* renamed from: b  reason: collision with root package name */
        boolean f15206b;

        /* renamed from: c  reason: collision with root package name */
        String f15207c;

        public a(List<String> list) {
            this.f15205a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.f15034b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f15206b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f15205a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj2 = this.f15205a.get(0);
                            break;
                        } else if (this.f15205a.contains(list.get(i))) {
                            obj2 = list.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    String str = (String) obj2;
                    this.f15207c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f15207c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f15200c = method;
        this.f15201d = method2;
        this.f15202e = method3;
        this.f15203f = cls;
        this.f15204g = cls2;
    }

    public static e b() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new c(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.f15202e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<F> list) {
        List<String> a2 = e.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(e.class.getClassLoader(), new Class[]{this.f15203f, this.f15204g}, new a(a2));
            this.f15200c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f15201d.invoke((Object) null, new Object[]{sSLSocket}));
            if (!aVar.f15206b && aVar.f15207c == null) {
                e.a().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f15206b) {
                return null;
            } else {
                return aVar.f15207c;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }
}
