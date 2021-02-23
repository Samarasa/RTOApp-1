package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.C0502h;
import java.util.ArrayList;

public final class VC extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final C0502h f9009a;

    public VC(Context context, View view, C0502h hVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f9009a = hVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f9009a.a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof C2313on)) {
                arrayList.add((C2313on) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C2313on) obj).destroy();
        }
    }
}
