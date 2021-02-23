package c.b.e;

import java.util.List;

public class C extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f4967a = null;

    public C(r rVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public n a() {
        return new n(getMessage());
    }
}
