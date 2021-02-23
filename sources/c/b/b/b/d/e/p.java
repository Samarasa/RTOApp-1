package c.b.b.b.d.e;

final class p extends o {

    /* renamed from: b  reason: collision with root package name */
    private final n f4088b = new n();

    p() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f4088b.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
