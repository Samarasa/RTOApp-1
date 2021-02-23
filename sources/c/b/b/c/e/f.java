package c.b.b.c.e;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import c.b.b.c.e.d;

public interface f extends d.a {

    public static class a implements TypeEvaluator<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final TypeEvaluator<d> f4780a = new a();

        /* renamed from: b  reason: collision with root package name */
        private final d f4781b = new d();

        /* renamed from: a */
        public d evaluate(float f2, d dVar, d dVar2) {
            this.f4781b.a(c.b.b.c.j.a.a(dVar.f4784a, dVar2.f4784a, f2), c.b.b.c.j.a.a(dVar.f4785b, dVar2.f4785b, f2), c.b.b.c.j.a.a(dVar.f4786c, dVar2.f4786c, f2));
            return this.f4781b;
        }
    }

    public static class b extends Property<f, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<f, d> f4782a = new b("circularReveal");

        private b(String str) {
            super(d.class, str);
        }

        /* renamed from: a */
        public d get(f fVar) {
            return fVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(f fVar, d dVar) {
            fVar.setRevealInfo(dVar);
        }
    }

    public static class c extends Property<f, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<f, Integer> f4783a = new c("circularRevealScrimColor");

        private c(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(f fVar, Integer num) {
            fVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public float f4784a;

        /* renamed from: b  reason: collision with root package name */
        public float f4785b;

        /* renamed from: c  reason: collision with root package name */
        public float f4786c;

        private d() {
        }

        public d(float f2, float f3, float f4) {
            this.f4784a = f2;
            this.f4785b = f3;
            this.f4786c = f4;
        }

        public void a(float f2, float f3, float f4) {
            this.f4784a = f2;
            this.f4785b = f3;
            this.f4786c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(d dVar);
}
