package c.b.b.b.d.f;

import c.b.b.b.d.f.Xa;
import c.b.b.b.d.f.Ya;

public abstract class Ya<MessageType extends Xa<MessageType, BuilderType>, BuilderType extends Ya<MessageType, BuilderType>> implements C0438vc {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public abstract BuilderType a(byte[] bArr, int i, int i2);

    public abstract BuilderType a(byte[] bArr, int i, int i2, C0458yb ybVar);

    public final /* synthetic */ C0438vc a(C0445wc wcVar) {
        if (a().getClass().isInstance(wcVar)) {
            a((Xa) wcVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final /* synthetic */ C0438vc a(byte[] bArr) {
        a(bArr, 0, bArr.length);
        return this;
    }

    public final /* synthetic */ C0438vc a(byte[] bArr, C0458yb ybVar) {
        a(bArr, 0, bArr.length, ybVar);
        return this;
    }
}
