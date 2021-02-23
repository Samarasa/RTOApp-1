package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.Map;

final class Nc extends Oc<FieldDescriptorType, Object> {
    Nc(int i) {
        super(i, (Nc) null);
    }

    public final void a() {
        if (!b()) {
            if (c() <= 0) {
                Iterator it = d().iterator();
                if (it.hasNext()) {
                    ((Fb) ((Map.Entry) it.next()).getKey()).e();
                    throw null;
                }
            } else {
                ((Fb) b(0).getKey()).e();
                throw null;
            }
        }
        super.a();
    }
}
