package g.a.e;

public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: h  reason: collision with root package name */
    public final int f15049h;

    private b(int i) {
        this.f15049h = i;
    }

    public static b a(int i) {
        for (b bVar : values()) {
            if (bVar.f15049h == i) {
                return bVar;
            }
        }
        return null;
    }
}
