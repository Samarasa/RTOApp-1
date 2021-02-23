package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.Qqa;

public final class s extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageButton f5523a;

    /* renamed from: b  reason: collision with root package name */
    private final A f5524b;

    public s(Context context, r rVar, A a2) {
        super(context);
        this.f5524b = a2;
        setOnClickListener(this);
        this.f5523a = new ImageButton(context);
        this.f5523a.setImageResource(17301527);
        this.f5523a.setBackgroundColor(0);
        this.f5523a.setOnClickListener(this);
        ImageButton imageButton = this.f5523a;
        Qqa.a();
        int b2 = C0758Hk.b(context, rVar.f5518a);
        Qqa.a();
        int b3 = C0758Hk.b(context, 0);
        Qqa.a();
        int b4 = C0758Hk.b(context, rVar.f5519b);
        Qqa.a();
        imageButton.setPadding(b2, b3, b4, C0758Hk.b(context, rVar.f5521d));
        this.f5523a.setContentDescription("Interstitial close button");
        ImageButton imageButton2 = this.f5523a;
        Qqa.a();
        int b5 = C0758Hk.b(context, rVar.f5522e + rVar.f5518a + rVar.f5519b);
        Qqa.a();
        addView(imageButton2, new FrameLayout.LayoutParams(b5, C0758Hk.b(context, rVar.f5522e + rVar.f5521d), 17));
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f5523a;
            i = 8;
        } else {
            imageButton = this.f5523a;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    public final void onClick(View view) {
        A a2 = this.f5524b;
        if (a2 != null) {
            a2.Wb();
        }
    }
}
