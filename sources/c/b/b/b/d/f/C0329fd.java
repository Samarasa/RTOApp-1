package c.b.b.b.d.f;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c.b.b.b.d.f.fd  reason: case insensitive filesystem */
public final class C0329fd extends AbstractList<String> implements C0307cc, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0307cc f4428a;

    public C0329fd(C0307cc ccVar) {
        this.f4428a = ccVar;
    }

    public final void a(C0320eb ebVar) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i) {
        return this.f4428a.b(i);
    }

    public final List<?> b() {
        return this.f4428a.b();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f4428a.get(i);
    }

    public final Iterator<String> iterator() {
        return new C0343hd(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C0322ed(this, i);
    }

    public final int size() {
        return this.f4428a.size();
    }

    public final C0307cc t() {
        return this;
    }
}
