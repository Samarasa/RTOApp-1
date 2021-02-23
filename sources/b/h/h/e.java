package b.h.h;

import java.util.Locale;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2500a = new C0033e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f2501b = new C0033e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f2502c = new C0033e(b.f2508a, false);

    /* renamed from: d  reason: collision with root package name */
    public static final d f2503d = new C0033e(b.f2508a, true);

    /* renamed from: e  reason: collision with root package name */
    public static final d f2504e = new C0033e(a.f2506a, false);

    /* renamed from: f  reason: collision with root package name */
    public static final d f2505f = f.f2511b;

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        static final a f2506a = new a(true);

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2507b;

        private a(boolean z) {
            this.f2507b = z;
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.f2507b) {
                        return 1;
                    }
                } else if (this.f2507b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f2507b ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f2508a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = e.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    private static abstract class d implements d {

        /* renamed from: a  reason: collision with root package name */
        private final c f2509a;

        d(c cVar) {
            this.f2509a = cVar;
        }

        private boolean a(CharSequence charSequence, int i, int i2) {
            int a2 = this.f2509a.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public abstract boolean a();

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f2509a == null ? a() : a(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b.h.h.e$e  reason: collision with other inner class name */
    private static class C0033e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2510b;

        C0033e(c cVar, boolean z) {
            super(cVar);
            this.f2510b = z;
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return this.f2510b;
        }
    }

    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f2511b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean a() {
            return f.a(Locale.getDefault()) == 1;
        }
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
