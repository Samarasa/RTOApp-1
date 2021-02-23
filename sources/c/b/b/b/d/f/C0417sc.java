package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.Map;

/* renamed from: c.b.b.b.d.f.sc  reason: case insensitive filesystem */
final class C0417sc implements C0397pc {
    C0417sc() {
    }

    public final int a(int i, Object obj, Object obj2) {
        C0404qc qcVar = (C0404qc) obj;
        C0390oc ocVar = (C0390oc) obj2;
        if (qcVar.isEmpty()) {
            return 0;
        }
        Iterator it = qcVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final C0383nc<?, ?> a(Object obj) {
        C0390oc ocVar = (C0390oc) obj;
        throw new NoSuchMethodError();
    }

    public final Object a(Object obj, Object obj2) {
        C0404qc qcVar = (C0404qc) obj;
        C0404qc qcVar2 = (C0404qc) obj2;
        if (!qcVar2.isEmpty()) {
            if (!qcVar.f()) {
                qcVar = qcVar.b();
            }
            qcVar.a(qcVar2);
        }
        return qcVar;
    }

    public final Map<?, ?> b(Object obj) {
        return (C0404qc) obj;
    }

    public final Map<?, ?> c(Object obj) {
        return (C0404qc) obj;
    }

    public final Object d(Object obj) {
        return C0404qc.a().b();
    }

    public final Object e(Object obj) {
        ((C0404qc) obj).e();
        return obj;
    }

    public final boolean f(Object obj) {
        return !((C0404qc) obj).f();
    }
}
