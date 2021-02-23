package c.b.b.c.o;

public class c implements Cloneable {
    public void a(float f2, float f3, float f4, k kVar) {
        kVar.a(f2, 0.0f);
    }

    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
