package c.b.b.b.b;

import java.lang.ref.WeakReference;

abstract class t extends r {

    /* renamed from: b  reason: collision with root package name */
    private static final WeakReference<byte[]> f3902b = new WeakReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<byte[]> f3903c = f3902b;

    t(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f3903c.get();
            if (bArr == null) {
                bArr = c();
                this.f3903c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] c();
}
