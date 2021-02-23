package c.b.e;

import c.b.e.C0485j;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class w extends z<FieldDescriptorType, Object> {
    w(int i) {
        super(i, (w) null);
    }

    public void e() {
        if (!d()) {
            for (int i = 0; i < a(); i++) {
                Map.Entry a2 = a(i);
                if (((C0485j.a) a2.getKey()).f()) {
                    a2.setValue(Collections.unmodifiableList((List) a2.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((C0485j.a) entry.getKey()).f()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((C0485j.a) obj, obj2);
    }
}
