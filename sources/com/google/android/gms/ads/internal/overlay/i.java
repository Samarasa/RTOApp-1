package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.C0502h;

final class i extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private C0502h f5503a;

    /* renamed from: b  reason: collision with root package name */
    boolean f5504b;

    public i(Context context, String str, String str2) {
        super(context);
        this.f5503a = new C0502h(context, str);
        this.f5503a.b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f5504b) {
            return false;
        }
        this.f5503a.a(motionEvent);
        return false;
    }
}
