package g.a.f;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import g.F;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

final class b extends e {

    /* renamed from: c  reason: collision with root package name */
    final Method f15198c;

    /* renamed from: d  reason: collision with root package name */
    final Method f15199d;

    public b(Method method, Method method2) {
        this.f15198c = method;
        this.f15199d = method2;
    }

    public static b b() {
        try {
            return new b(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<F> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> a2 = e.a(list);
            this.f15198c.invoke(sSLParameters, new Object[]{a2.toArray(new String[a2.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    public String b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f15199d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals(BuildConfig.FLAVOR)) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }
}
