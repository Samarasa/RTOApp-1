package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.Map;

final class Pc extends Vc {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Oc f4263b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Pc(Oc oc) {
        super(oc, (Nc) null);
        this.f4263b = oc;
    }

    /* synthetic */ Pc(Oc oc, Nc nc) {
        this(oc);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new Qc(this.f4263b, (Nc) null);
    }
}
