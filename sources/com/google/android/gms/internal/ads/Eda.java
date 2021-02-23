package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Cda;
import com.google.android.gms.internal.ads.Eda;

public abstract class Eda<MessageType extends Cda<MessageType, BuilderType>, BuilderType extends Eda<MessageType, BuilderType>> implements C1802hfa {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ C1802hfa a(C1872ifa ifa) {
        if (a().getClass().isInstance(ifa)) {
            a((Cda) ifa);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
