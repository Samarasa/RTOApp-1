package c.b.b.b.d.f;

final class Va extends Ra {

    /* renamed from: b  reason: collision with root package name */
    private final Ua f4308b = new Ua();

    Va() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f4308b.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
