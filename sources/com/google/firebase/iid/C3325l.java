package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.l  reason: case insensitive filesystem */
final class C3325l extends C3323j<Bundle> {
    C3325l(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a(bundle2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return false;
    }
}
