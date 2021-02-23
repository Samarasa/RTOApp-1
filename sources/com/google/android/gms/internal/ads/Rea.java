package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Rea extends Fda<String> implements Pea, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Rea f8495b;

    /* renamed from: c  reason: collision with root package name */
    private static final Pea f8496c = f8495b;

    /* renamed from: d  reason: collision with root package name */
    private final List<Object> f8497d;

    static {
        Rea rea = new Rea();
        f8495b = rea;
        rea.o();
    }

    public Rea() {
        this(10);
    }

    public Rea(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private Rea(ArrayList<Object> arrayList) {
        this.f8497d = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof Lda ? ((Lda) obj).e() : Aea.c((byte[]) obj);
    }

    public final void a(Lda lda) {
        c();
        this.f8497d.add(lda);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.f8497d.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof Pea) {
            collection = ((Pea) collection).r();
        }
        boolean addAll = this.f8497d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final /* synthetic */ Fea c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f8497d);
            return new Rea((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        c();
        this.f8497d.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f8497d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Lda) {
            Lda lda = (Lda) obj;
            String e2 = lda.e();
            if (lda.f()) {
                this.f8497d.set(i, e2);
            }
            return e2;
        }
        byte[] bArr = (byte[]) obj;
        String c2 = Aea.c(bArr);
        if (Aea.b(bArr)) {
            this.f8497d.set(i, c2);
        }
        return c2;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final Object i(int i) {
        return this.f8497d.get(i);
    }

    public final /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    public final List<?> r() {
        return Collections.unmodifiableList(this.f8497d);
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.f8497d.remove(i);
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

    public final Pea s() {
        return n() ? new _fa(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.f8497d.set(i, (String) obj));
    }

    public final int size() {
        return this.f8497d.size();
    }
}
