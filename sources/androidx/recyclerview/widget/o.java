package androidx.recyclerview.widget;

import androidx.recyclerview.widget.p;
import java.util.Comparator;

class o implements Comparator<p.b> {
    o() {
    }

    /* renamed from: a */
    public int compare(p.b bVar, p.b bVar2) {
        if ((bVar.f1490d == null) != (bVar2.f1490d == null)) {
            return bVar.f1490d == null ? 1 : -1;
        }
        boolean z = bVar.f1487a;
        if (z != bVar2.f1487a) {
            return z ? -1 : 1;
        }
        int i = bVar2.f1488b - bVar.f1488b;
        if (i != 0) {
            return i;
        }
        int i2 = bVar.f1489c - bVar2.f1489c;
        if (i2 != 0) {
            return i2;
        }
        return 0;
    }
}
