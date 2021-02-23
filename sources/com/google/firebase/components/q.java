package com.google.firebase.components;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f14469a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14470b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14471c;

    private q(Class<?> cls, int i, int i2) {
        x.a(cls, "Null dependency anInterface.");
        this.f14469a = cls;
        this.f14470b = i;
        this.f14471c = i2;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q b(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q c(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> a() {
        return this.f14469a;
    }

    public boolean b() {
        return this.f14471c == 0;
    }

    public boolean c() {
        return this.f14470b == 1;
    }

    public boolean d() {
        return this.f14470b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f14469a == qVar.f14469a && this.f14470b == qVar.f14470b && this.f14471c == qVar.f14471c;
    }

    public int hashCode() {
        return ((((this.f14469a.hashCode() ^ 1000003) * 1000003) ^ this.f14470b) * 1000003) ^ this.f14471c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f14469a);
        sb.append(", type=");
        int i = this.f14470b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.f14471c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
