package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.os  reason: case insensitive filesystem */
public final class C2323os extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11646a;

    /* renamed from: b  reason: collision with root package name */
    private View f11647b;

    private C2323os(Context context) {
        super(context);
        this.f11646a = context;
    }

    private final int a(double d2) {
        Qqa.a();
        return C0758Hk.b(this.f11646a, (int) d2);
    }

    public static C2323os a(Context context, View view, C2988yS ySVar) {
        C2323os osVar = new C2323os(context);
        osVar.f11647b = view;
        osVar.addView(view);
        p.z();
        C2309ol.a((View) osVar, (ViewTreeObserver.OnScrollChangedListener) osVar);
        p.z();
        C2309ol.a((View) osVar, (ViewTreeObserver.OnGlobalLayoutListener) osVar);
        JSONObject jSONObject = ySVar.da;
        if (jSONObject != null) {
            RelativeLayout relativeLayout = new RelativeLayout(osVar.f11646a);
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                osVar.a(optJSONObject, relativeLayout, 10);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
            if (optJSONObject2 != null) {
                osVar.a(optJSONObject2, relativeLayout, 12);
            }
            osVar.addView(relativeLayout);
        }
        return osVar;
    }

    private final void a(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f11646a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", BuildConfig.FLAVOR));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int a2 = a(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, a2, 0, a2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f11647b.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f11647b.setY((float) (-iArr[1]));
    }
}
