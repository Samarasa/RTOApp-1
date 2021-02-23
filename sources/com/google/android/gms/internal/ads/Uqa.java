package com.google.android.gms.internal.ads;

import android.os.IBinder;

public final class Uqa extends C2446qia implements Sqa {
    Uqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public final void onAdClicked() {
        b(1, c());
    }
}
