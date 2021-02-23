package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Looper;
import com.google.android.gms.internal.ads.Pja;

@TargetApi(16)
public interface Qja<T extends Pja> {
    Oja<T> a(Looper looper, Lja lja);

    void a(Oja<T> oja);
}
