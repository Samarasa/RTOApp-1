package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class y extends C0550f {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Intent f6004a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f6005b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f6006c;

    y(Intent intent, Activity activity, int i) {
        this.f6004a = intent;
        this.f6005b = activity;
        this.f6006c = i;
    }

    public final void a() {
        Intent intent = this.f6004a;
        if (intent != null) {
            this.f6005b.startActivityForResult(intent, this.f6006c);
        }
    }
}
