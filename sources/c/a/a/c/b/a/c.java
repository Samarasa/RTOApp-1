package c.a.a.c.b.a;

import android.graphics.Bitmap;
import c.a.a.i.k;

class c implements l {

    /* renamed from: a  reason: collision with root package name */
    private final b f3031a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final h<a, Bitmap> f3032b = new h<>();

    static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f3033a;

        /* renamed from: b  reason: collision with root package name */
        private int f3034b;

        /* renamed from: c  reason: collision with root package name */
        private int f3035c;

        /* renamed from: d  reason: collision with root package name */
        private Bitmap.Config f3036d;

        public a(b bVar) {
            this.f3033a = bVar;
        }

        public void a() {
            this.f3033a.a(this);
        }

        public void a(int i, int i2, Bitmap.Config config) {
            this.f3034b = i;
            this.f3035c = i2;
            this.f3036d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3034b == aVar.f3034b && this.f3035c == aVar.f3035c && this.f3036d == aVar.f3036d;
        }

        public int hashCode() {
            int i = ((this.f3034b * 31) + this.f3035c) * 31;
            Bitmap.Config config = this.f3036d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.c(this.f3034b, this.f3035c, this.f3036d);
        }
    }

    static class b extends d<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a a(int i, int i2, Bitmap.Config config) {
            a aVar = (a) b();
            aVar.a(i, i2, config);
            return aVar;
        }
    }

    c() {
    }

    static String c(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    private static String d(Bitmap bitmap) {
        return c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.f3032b.a(this.f3031a.a(i, i2, config));
    }

    public void a(Bitmap bitmap) {
        this.f3032b.a(this.f3031a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public int b(Bitmap bitmap) {
        return k.a(bitmap);
    }

    public String b(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config);
    }

    public String c(Bitmap bitmap) {
        return d(bitmap);
    }

    public Bitmap removeLast() {
        return this.f3032b.a();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f3032b;
    }
}
