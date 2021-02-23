package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.g  reason: case insensitive filesystem */
final class C3320g extends C3323j<Void> {
    C3320g(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            a(new C3322i(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return true;
    }
}
