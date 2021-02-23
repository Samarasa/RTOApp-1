package c.b.b.b.d.f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: c.b.b.b.d.f.dc  reason: case insensitive filesystem */
public final class C0314dc extends Za<String> implements C0307cc, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final C0314dc f4403b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0307cc f4404c = f4403b;

    /* renamed from: d  reason: collision with root package name */
    private final List<Object> f4405d;

    static {
        C0314dc dcVar = new C0314dc();
        f4403b = dcVar;
        dcVar.m();
    }

    public C0314dc() {
        this(10);
    }

    public C0314dc(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C0314dc(ArrayList<Object> arrayList) {
        this.f4405d = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C0320eb ? ((C0320eb) obj).b() : Nb.b((byte[]) obj);
    }

    public final /* synthetic */ Tb a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f4405d);
            return new C0314dc((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void a(C0320eb ebVar) {
        c();
        this.f4405d.add(ebVar);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.f4405d.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof C0307cc) {
            collection = ((C0307cc) collection).b();
        }
        boolean addAll = this.f4405d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final Object b(int i) {
        return this.f4405d.get(i);
    }

    public final List<?> b() {
        return Collections.unmodifiableList(this.f4405d);
    }

    public final void clear() {
        c();
        this.f4405d.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f4405d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0320eb) {
            C0320eb ebVar = (C0320eb) obj;
            String b2 = ebVar.b();
            if (ebVar.c()) {
                this.f4405d.set(i, b2);
            }
            return b2;
        }
        byte[] bArr = (byte[]) obj;
        String b3 = Nb.b(bArr);
        if (Nb.a(bArr)) {
            this.f4405d.set(i, b3);
        }
        return b3;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.f4405d.remove(i);
        this.modCount++;
        return a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.f4405d.set(i, (String) obj));
    }

    public final int size() {
        return this.f4405d.size();
    }

    public final C0307cc t() {
        return a() ? new C0329fd(this) : this;
    }
}
