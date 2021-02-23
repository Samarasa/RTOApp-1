package b.f.a.a;

import b.f.a.c;
import java.util.ArrayList;

public class t extends h {
    protected ArrayList<h> va = new ArrayList<>();

    public void D() {
        this.va.clear();
        super.D();
    }

    public void H() {
        super.H();
        ArrayList<h> arrayList = this.va;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                h hVar = this.va.get(i);
                hVar.b(g(), h());
                if (!(hVar instanceof i)) {
                    hVar.H();
                }
            }
        }
    }

    public i J() {
        h k = k();
        i iVar = this instanceof i ? (i) this : null;
        while (k != null) {
            h k2 = k.k();
            if (k instanceof i) {
                iVar = (i) k;
            }
            k = k2;
        }
        return iVar;
    }

    public void K() {
        H();
        ArrayList<h> arrayList = this.va;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                h hVar = this.va.get(i);
                if (hVar instanceof t) {
                    ((t) hVar).K();
                }
            }
        }
    }

    public void L() {
        this.va.clear();
    }

    public void a(c cVar) {
        super.a(cVar);
        int size = this.va.size();
        for (int i = 0; i < size; i++) {
            this.va.get(i).a(cVar);
        }
    }

    public void b(int i, int i2) {
        super.b(i, i2);
        int size = this.va.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.va.get(i3).b(o(), p());
        }
    }

    public void b(h hVar) {
        this.va.add(hVar);
        if (hVar.k() != null) {
            ((t) hVar.k()).c(hVar);
        }
        hVar.a((h) this);
    }

    public void c(h hVar) {
        this.va.remove(hVar);
        hVar.a((h) null);
    }
}
