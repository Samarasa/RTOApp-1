package c.b.a;

public enum a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: f  reason: collision with root package name */
    private final String f3689f;

    private a(String str) {
        this.f3689f = str;
    }

    public final String toString() {
        return this.f3689f;
    }
}
