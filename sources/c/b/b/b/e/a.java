package c.b.b.b.e;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C0562s;

public final class a implements a.d.e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4662a = new a(false, false, (String) null, false, (String) null, (String) null, false, (Long) null, (Long) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4663b = false;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4664c = false;

    /* renamed from: d  reason: collision with root package name */
    private final String f4665d = null;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4666e = false;

    /* renamed from: f  reason: collision with root package name */
    private final String f4667f = null;

    /* renamed from: g  reason: collision with root package name */
    private final String f4668g = null;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4669h = false;
    private final Long i = null;
    private final Long j = null;

    /* renamed from: c.b.b.b.e.a$a  reason: collision with other inner class name */
    public static final class C0062a {
    }

    static {
        new C0062a();
    }

    private a(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    public final Long a() {
        return this.i;
    }

    public final String b() {
        return this.f4667f;
    }

    public final String c() {
        return this.f4668g;
    }

    public final Long d() {
        return this.j;
    }

    public final String e() {
        return this.f4665d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4663b == aVar.f4663b && this.f4664c == aVar.f4664c && C0562s.a(this.f4665d, aVar.f4665d) && this.f4666e == aVar.f4666e && this.f4669h == aVar.f4669h && C0562s.a(this.f4667f, aVar.f4667f) && C0562s.a(this.f4668g, aVar.f4668g) && C0562s.a(this.i, aVar.i) && C0562s.a(this.j, aVar.j);
    }

    public final boolean f() {
        return this.f4666e;
    }

    public final boolean g() {
        return this.f4664c;
    }

    public final boolean h() {
        return this.f4663b;
    }

    public final int hashCode() {
        return C0562s.a(Boolean.valueOf(this.f4663b), Boolean.valueOf(this.f4664c), this.f4665d, Boolean.valueOf(this.f4666e), Boolean.valueOf(this.f4669h), this.f4667f, this.f4668g, this.i, this.j);
    }

    public final boolean i() {
        return this.f4669h;
    }
}
