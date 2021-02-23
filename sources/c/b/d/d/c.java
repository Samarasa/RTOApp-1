package c.b.d.d;

public interface c {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: f  reason: collision with root package name */
        private final int f4932f;

        private a(int i) {
            this.f4932f = i;
        }

        public int a() {
            return this.f4932f;
        }
    }

    a a(String str);
}
