package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;

final class Ic implements C0431uc {

    /* renamed from: a  reason: collision with root package name */
    private final C0445wc f4184a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4185b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f4186c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4187d;

    Ic(C0445wc wcVar, String str, Object[] objArr) {
        this.f4184a = wcVar;
        this.f4185b = str;
        this.f4186c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4187d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f4187d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final int a() {
        return (this.f4187d & 1) == 1 ? Lb.e.i : Lb.e.j;
    }

    public final boolean b() {
        return (this.f4187d & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f4185b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.f4186c;
    }

    public final C0445wc l() {
        return this.f4184a;
    }
}
