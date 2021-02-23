package c.a.a.c;

import c.a.a.i.i;
import java.security.MessageDigest;

public final class j<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final a<Object> f3495a = new i();

    /* renamed from: b  reason: collision with root package name */
    private final T f3496b;

    /* renamed from: c  reason: collision with root package name */
    private final a<T> f3497c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3498d;

    /* renamed from: e  reason: collision with root package name */
    private volatile byte[] f3499e;

    public interface a<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private j(String str, T t, a<T> aVar) {
        i.a(str);
        this.f3498d = str;
        this.f3496b = t;
        i.a(aVar);
        this.f3497c = aVar;
    }

    public static <T> j<T> a(String str) {
        return new j<>(str, (Object) null, b());
    }

    public static <T> j<T> a(String str, T t) {
        return new j<>(str, t, b());
    }

    public static <T> j<T> a(String str, T t, a<T> aVar) {
        return new j<>(str, t, aVar);
    }

    private static <T> a<T> b() {
        return f3495a;
    }

    private byte[] c() {
        if (this.f3499e == null) {
            this.f3499e = this.f3498d.getBytes(h.f3494a);
        }
        return this.f3499e;
    }

    public T a() {
        return this.f3496b;
    }

    public void a(T t, MessageDigest messageDigest) {
        this.f3497c.a(c(), t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3498d.equals(((j) obj).f3498d);
        }
        return false;
    }

    public int hashCode() {
        return this.f3498d.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f3498d + '\'' + '}';
    }
}
