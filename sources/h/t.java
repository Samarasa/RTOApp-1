package h;

final class t {

    /* renamed from: a  reason: collision with root package name */
    static s f15363a;

    /* renamed from: b  reason: collision with root package name */
    static long f15364b;

    private t() {
    }

    static s a() {
        synchronized (t.class) {
            if (f15363a == null) {
                return new s();
            }
            s sVar = f15363a;
            f15363a = sVar.f15361f;
            sVar.f15361f = null;
            f15364b -= 8192;
            return sVar;
        }
    }

    static void a(s sVar) {
        if (sVar.f15361f != null || sVar.f15362g != null) {
            throw new IllegalArgumentException();
        } else if (!sVar.f15359d) {
            synchronized (t.class) {
                if (f15364b + 8192 <= 65536) {
                    f15364b += 8192;
                    sVar.f15361f = f15363a;
                    sVar.f15358c = 0;
                    sVar.f15357b = 0;
                    f15363a = sVar;
                }
            }
        }
    }
}
