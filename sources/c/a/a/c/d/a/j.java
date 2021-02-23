package c.a.a.c.d.a;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f3380a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final j f3381b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final j f3382c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final j f3383d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final j f3384e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final j f3385f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final j f3386g = f3381b;

    /* renamed from: h  reason: collision with root package name */
    public static final c.a.a.c.j<j> f3387h = c.a.a.c.j.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", f3386g);

    private static class a extends j {
        a() {
        }

        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        public float b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    private static class b extends j {
        b() {
        }

        public g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        public float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    private static class c extends j {
        c() {
        }

        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, j.f3380a.b(i, i2, i3, i4));
        }
    }

    private static class d extends j {
        d() {
        }

        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        public float b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    private static class e extends j {
        e() {
        }

        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        public float b(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    private static class f extends j {
        f() {
        }

        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
