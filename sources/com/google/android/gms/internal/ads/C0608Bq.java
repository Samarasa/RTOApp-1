package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0499e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bq  reason: case insensitive filesystem */
public final class C0608Bq implements C1246_e<C0712Fq> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6370a;

    /* renamed from: b  reason: collision with root package name */
    private final C2526rna f6371b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager f6372c;

    public C0608Bq(Context context, C2526rna rna) {
        this.f6370a = context;
        this.f6371b = rna;
        this.f6372c = (PowerManager) context.getSystemService("power");
    }

    public final JSONObject a(C0712Fq fq) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C2810vna vna = fq.f6959f;
        if (vna == null) {
            jSONObject = new JSONObject();
        } else if (this.f6371b.e() != null) {
            boolean z = vna.f12571c;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f6371b.d()).put("activeViewJSON", this.f6371b.e()).put("timestamp", fq.f6957d).put("adFormat", this.f6371b.c()).put("hashCode", this.f6371b.a()).put("isMraid", false).put("isStopped", false).put("isPaused", fq.f6955b).put("isNative", this.f6371b.b()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f6372c.isInteractive() : this.f6372c.isScreenOn()).put("appMuted", p.h().b()).put("appVolume", (double) p.h().a()).put("deviceVolume", (double) C0499e.a(this.f6370a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f6370a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", vna.f12572d).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", vna.f12573e.top).put("bottom", vna.f12573e.bottom).put("left", vna.f12573e.left).put("right", vna.f12573e.right)).put("adBox", new JSONObject().put("top", vna.f12574f.top).put("bottom", vna.f12574f.bottom).put("left", vna.f12574f.left).put("right", vna.f12574f.right)).put("globalVisibleBox", new JSONObject().put("top", vna.f12575g.top).put("bottom", vna.f12575g.bottom).put("left", vna.f12575g.left).put("right", vna.f12575g.right)).put("globalVisibleBoxVisible", vna.f12576h).put("localVisibleBox", new JSONObject().put("top", vna.i.top).put("bottom", vna.i.bottom).put("left", vna.i.left).put("right", vna.i.right)).put("localVisibleBoxVisible", vna.j).put("hitBox", new JSONObject().put("top", vna.k.top).put("bottom", vna.k.bottom).put("left", vna.k.left).put("right", vna.k.right)).put("screenDensity", (double) this.f6370a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", fq.f6954a);
            if (((Boolean) Qqa.e().a(F.fb)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = vna.n;
                if (list != null) {
                    for (Rect next : list) {
                        jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put("left", next.left).put("right", next.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(fq.f6958e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
