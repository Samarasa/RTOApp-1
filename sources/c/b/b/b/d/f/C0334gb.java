package c.b.b.b.d.f;

import java.util.Comparator;

/* renamed from: c.b.b.b.d.f.gb  reason: case insensitive filesystem */
final class C0334gb implements Comparator<C0320eb> {
    C0334gb() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0320eb ebVar = (C0320eb) obj;
        C0320eb ebVar2 = (C0320eb) obj2;
        C0382nb nbVar = (C0382nb) ebVar.iterator();
        C0382nb nbVar2 = (C0382nb) ebVar2.iterator();
        while (nbVar.hasNext() && nbVar2.hasNext()) {
            int compare = Integer.compare(C0320eb.b(nbVar.a()), C0320eb.b(nbVar2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(ebVar.a(), ebVar2.a());
    }
}
