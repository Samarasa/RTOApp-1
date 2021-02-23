package c.b.b.a.a.d;

public interface b {

    public interface a<T> {
        T execute();
    }

    <T> T a(a<T> aVar);
}
