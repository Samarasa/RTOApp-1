package c.b.b.b.d.d;

import java.util.Arrays;

public final class A<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f3936a;

    /* renamed from: b  reason: collision with root package name */
    private int f3937b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3938c;

    public A() {
        this(4);
    }

    private A(int i) {
        this.f3936a = new Object[8];
        this.f3937b = 0;
        this.f3938c = false;
    }

    public final A<K, V> a(K k, V v) {
        int i = (this.f3937b + 1) << 1;
        Object[] objArr = this.f3936a;
        if (i > objArr.length) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.f3936a = Arrays.copyOf(objArr, i2);
                this.f3938c = false;
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        C0285v.a(k, v);
        Object[] objArr2 = this.f3936a;
        int i3 = this.f3937b;
        objArr2[i3 * 2] = k;
        objArr2[(i3 * 2) + 1] = v;
        this.f3937b = i3 + 1;
        return this;
    }

    public final B<K, V> a() {
        this.f3938c = true;
        return F.a(this.f3937b, this.f3936a);
    }
}
