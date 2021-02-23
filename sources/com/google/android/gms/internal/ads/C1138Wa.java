package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.internal.C0563t;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Wa  reason: case insensitive filesystem */
public final class C1138Wa extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f9145a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b  reason: collision with root package name */
    private AnimationDrawable f9146b;

    public C1138Wa(Context context, C1060Ta ta, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C0563t.a(ta);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f9145a, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(ta.Zb());
        setLayoutParams(layoutParams);
        p.e();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(ta.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(ta.getText());
            textView.setTextColor(ta._b());
            textView.setTextSize((float) ta.ac());
            Qqa.a();
            int b2 = C0758Hk.b(context, 4);
            Qqa.a();
            textView.setPadding(b2, 0, C0758Hk.b(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<C1190Ya> bc = ta.bc();
        if (bc != null && bc.size() > 1) {
            this.f9146b = new AnimationDrawable();
            for (C1190Ya cb : bc) {
                try {
                    this.f9146b.addFrame((Drawable) b.Q(cb.cb()), ta.cc());
                } catch (Exception e2) {
                    C1018Rk.b("Error while getting drawable.", e2);
                }
            }
            p.e();
            imageView.setBackground(this.f9146b);
        } else if (bc.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) b.Q(bc.get(0).cb()));
            } catch (Exception e3) {
                C1018Rk.b("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f9146b;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
