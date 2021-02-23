package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.fa;

public final class t extends f {
    public t(Activity activity) {
        super(activity);
    }

    public final void m(Bundle bundle) {
        fa.f("AdOverlayParcel is null or does not contain valid overlay type.");
        this.n = m.OTHER;
        this.f5495b.finish();
    }
}
