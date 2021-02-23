package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class Jda extends Fda<Boolean> implements Fea<Boolean>, C2652tfa, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final Jda f7444b;

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f7445c;

    /* renamed from: d  reason: collision with root package name */
    private int f7446d;

    static {
        Jda jda = new Jda(new boolean[0], 0);
        f7444b = jda;
        jda.o();
    }

    Jda() {
        this(new boolean[10], 0);
    }

    private Jda(boolean[] zArr, int i) {
        this.f7445c = zArr;
        this.f7446d = i;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f7446d) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private final String k(int i) {
        int i2 = this.f7446d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void a(boolean z) {
        c();
        int i = this.f7446d;
        boolean[] zArr = this.f7445c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f7445c = zArr2;
        }
        boolean[] zArr3 = this.f7445c;
        int i2 = this.f7446d;
        this.f7446d = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i < 0 || i > (i2 = this.f7446d)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        boolean[] zArr = this.f7445c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f7445c, i, zArr2, i + 1, this.f7446d - i);
            this.f7445c = zArr2;
        }
        this.f7445c[i] = booleanValue;
        this.f7446d++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        Aea.a(collection);
        if (!(collection instanceof Jda)) {
            return super.addAll(collection);
        }
        Jda jda = (Jda) collection;
        int i = jda.f7446d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7446d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f7445c;
            if (i3 > zArr.length) {
                this.f7445c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(jda.f7445c, 0, this.f7445c, this.f7446d, jda.f7446d);
            this.f7446d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ Fea c(int i) {
        if (i >= this.f7446d) {
            return new Jda(Arrays.copyOf(this.f7445c, i), this.f7446d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jda)) {
            return super.equals(obj);
        }
        Jda jda = (Jda) obj;
        if (this.f7446d != jda.f7446d) {
            return false;
        }
        boolean[] zArr = jda.f7445c;
        for (int i = 0; i < this.f7446d; i++) {
            if (this.f7445c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        j(i);
        return Boolean.valueOf(this.f7445c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7446d; i2++) {
            i = (i * 31) + Aea.a(this.f7445c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f7445c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        boolean[] zArr = this.f7445c;
        boolean z = zArr[i];
        int i2 = this.f7446d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f7446d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f7446d; i++) {
            if (obj.equals(Boolean.valueOf(this.f7445c[i]))) {
                boolean[] zArr = this.f7445c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f7446d - i) - 1);
                this.f7446d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            boolean[] zArr = this.f7445c;
            System.arraycopy(zArr, i2, zArr, i, this.f7446d - i2);
            this.f7446d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        j(i);
        boolean[] zArr = this.f7445c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f7446d;
    }
}
