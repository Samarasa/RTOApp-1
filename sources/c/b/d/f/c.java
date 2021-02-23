package c.b.d.f;

import com.google.android.gms.common.internal.C0562s;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f4951a;

    public c(String str) {
        this.f4951a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return C0562s.a(this.f4951a, ((c) obj).f4951a);
    }

    public int hashCode() {
        return C0562s.a(this.f4951a);
    }

    public String toString() {
        C0562s.a a2 = C0562s.a((Object) this);
        a2.a("token", this.f4951a);
        return a2.toString();
    }
}
