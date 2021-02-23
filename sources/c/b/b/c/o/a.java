package c.b.b.c.o;

public class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    protected float f4830a;

    public a() {
        this.f4830a = 0.0f;
    }

    protected a(float f2) {
        this.f4830a = f2;
    }

    public float a() {
        return this.f4830a;
    }

    public void a(float f2) {
        this.f4830a = f2;
    }

    public void a(float f2, float f3, k kVar) {
    }

    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
