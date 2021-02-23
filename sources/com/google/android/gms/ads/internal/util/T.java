package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1575eX;
import com.google.android.gms.internal.ads.C2988yS;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.LW;
import com.google.android.gms.internal.ads.Qqa;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class T {
    private static int a(Context context, int i) {
        return Qqa.a().a(context, i);
    }

    public static Point a(MotionEvent motionEvent, View view) {
        int[] b2 = b(view);
        return new Point(((int) motionEvent.getRawX()) - b2[0], ((int) motionEvent.getRawY()) - b2[1]);
    }

    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) Qqa.e().a(F.nf)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        p.c();
        DisplayMetrics a2 = oa.a((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", a(context, a2.widthPixels));
            jSONObject.put("height", a(context, a2.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static JSONObject a(Context context, Point point, Point point2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(context, point2.x));
            jSONObject.put("y", a(context, point2.y));
            jSONObject.put("start_x", a(context, point.x));
            jSONObject.put("start_y", a(context, point.y));
            return jSONObject;
        } catch (JSONException e2) {
            C1018Rk.b("Error occurred while putting signals into JSON object.", e2);
            return null;
        }
    }

    private static JSONObject a(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", a(context, rect.right - rect.left));
        jSONObject.put("height", a(context, rect.bottom - rect.top));
        jSONObject.put("x", a(context, rect.left));
        jSONObject.put("y", a(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0125 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0135 A[Catch:{ JSONException -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014d A[Catch:{ JSONException -> 0x0151 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(android.content.Context r16, android.view.View r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "window"
            java.lang.String r3 = "relative_to"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "height"
            java.lang.String r7 = "width"
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r1 != 0) goto L_0x0018
            return r8
        L_0x0018:
            r9 = 2
            r10 = 1
            r11 = 0
            int[] r12 = b(r17)     // Catch:{ Exception -> 0x00dd }
            int[] r13 = new int[r9]     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x005b
            int r14 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00dd }
            r13[r11] = r14     // Catch:{ Exception -> 0x00dd }
            int r14 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00dd }
            r13[r10] = r14     // Catch:{ Exception -> 0x00dd }
            android.view.ViewParent r14 = r17.getParent()     // Catch:{ Exception -> 0x00dd }
        L_0x0033:
            boolean r15 = r14 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x00dd }
            if (r15 == 0) goto L_0x005b
            r15 = r14
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15     // Catch:{ Exception -> 0x00dd }
            int r15 = r15.getMeasuredWidth()     // Catch:{ Exception -> 0x00dd }
            r9 = r13[r11]     // Catch:{ Exception -> 0x00dd }
            int r9 = java.lang.Math.min(r15, r9)     // Catch:{ Exception -> 0x00dd }
            r13[r11] = r9     // Catch:{ Exception -> 0x00dd }
            r9 = r14
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ Exception -> 0x00dd }
            int r9 = r9.getMeasuredHeight()     // Catch:{ Exception -> 0x00dd }
            r15 = r13[r10]     // Catch:{ Exception -> 0x00dd }
            int r9 = java.lang.Math.min(r9, r15)     // Catch:{ Exception -> 0x00dd }
            r13[r10] = r9     // Catch:{ Exception -> 0x00dd }
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00dd }
            r9 = 2
            goto L_0x0033
        L_0x005b:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00dd }
            r9.<init>()     // Catch:{ Exception -> 0x00dd }
            int r14 = r17.getMeasuredWidth()     // Catch:{ Exception -> 0x00dd }
            int r14 = a((android.content.Context) r0, (int) r14)     // Catch:{ Exception -> 0x00dd }
            r9.put(r7, r14)     // Catch:{ Exception -> 0x00dd }
            int r14 = r17.getMeasuredHeight()     // Catch:{ Exception -> 0x00dd }
            int r14 = a((android.content.Context) r0, (int) r14)     // Catch:{ Exception -> 0x00dd }
            r9.put(r6, r14)     // Catch:{ Exception -> 0x00dd }
            r14 = r12[r11]     // Catch:{ Exception -> 0x00dd }
            int r14 = a((android.content.Context) r0, (int) r14)     // Catch:{ Exception -> 0x00dd }
            r9.put(r5, r14)     // Catch:{ Exception -> 0x00dd }
            r14 = r12[r10]     // Catch:{ Exception -> 0x00dd }
            int r14 = a((android.content.Context) r0, (int) r14)     // Catch:{ Exception -> 0x00dd }
            r9.put(r4, r14)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r14 = "maximum_visible_width"
            r15 = r13[r11]     // Catch:{ Exception -> 0x00dd }
            int r15 = a((android.content.Context) r0, (int) r15)     // Catch:{ Exception -> 0x00dd }
            r9.put(r14, r15)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r14 = "maximum_visible_height"
            r13 = r13[r10]     // Catch:{ Exception -> 0x00dd }
            int r13 = a((android.content.Context) r0, (int) r13)     // Catch:{ Exception -> 0x00dd }
            r9.put(r14, r13)     // Catch:{ Exception -> 0x00dd }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r13 = "frame"
            r8.put(r13, r9)     // Catch:{ Exception -> 0x00dd }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ Exception -> 0x00dd }
            r9.<init>()     // Catch:{ Exception -> 0x00dd }
            boolean r13 = r1.getGlobalVisibleRect(r9)     // Catch:{ Exception -> 0x00dd }
            if (r13 == 0) goto L_0x00b6
            org.json.JSONObject r0 = a((android.content.Context) r0, (android.graphics.Rect) r9)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00d7
        L_0x00b6:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00dd }
            r9.<init>()     // Catch:{ Exception -> 0x00dd }
            r9.put(r7, r11)     // Catch:{ Exception -> 0x00dd }
            r9.put(r6, r11)     // Catch:{ Exception -> 0x00dd }
            r6 = r12[r11]     // Catch:{ Exception -> 0x00dd }
            int r6 = a((android.content.Context) r0, (int) r6)     // Catch:{ Exception -> 0x00dd }
            r9.put(r5, r6)     // Catch:{ Exception -> 0x00dd }
            r5 = r12[r10]     // Catch:{ Exception -> 0x00dd }
            int r0 = a((android.content.Context) r0, (int) r5)     // Catch:{ Exception -> 0x00dd }
            r9.put(r4, r0)     // Catch:{ Exception -> 0x00dd }
            r9.put(r3, r2)     // Catch:{ Exception -> 0x00dd }
            r0 = r9
        L_0x00d7:
            java.lang.String r2 = "visible_bounds"
            r8.put(r2, r0)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00e2
        L_0x00dd:
            java.lang.String r0 = "Unable to get native ad view bounding box"
            com.google.android.gms.internal.ads.C1018Rk.d(r0)
        L_0x00e2:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.Be
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0157
            android.view.ViewParent r0 = r17.getParent()
            if (r0 == 0) goto L_0x0119
            java.lang.Class r1 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x0119, SecurityException -> 0x0113, IllegalAccessException -> 0x0111, InvocationTargetException -> 0x010f }
            java.lang.String r2 = "getTemplateTypeName"
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ NoSuchMethodException -> 0x0119, SecurityException -> 0x0113, IllegalAccessException -> 0x0111, InvocationTargetException -> 0x010f }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x0119, SecurityException -> 0x0113, IllegalAccessException -> 0x0111, InvocationTargetException -> 0x010f }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x0119, SecurityException -> 0x0113, IllegalAccessException -> 0x0111, InvocationTargetException -> 0x010f }
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0119, SecurityException -> 0x0113, IllegalAccessException -> 0x0111, InvocationTargetException -> 0x010f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NoSuchMethodException -> 0x0119, SecurityException -> 0x0113, IllegalAccessException -> 0x0111, InvocationTargetException -> 0x010f }
            goto L_0x011b
        L_0x010f:
            r0 = move-exception
            goto L_0x0114
        L_0x0111:
            r0 = move-exception
            goto L_0x0114
        L_0x0113:
            r0 = move-exception
        L_0x0114:
            java.lang.String r1 = "Cannot access method getTemplateTypeName: "
            com.google.android.gms.internal.ads.C1018Rk.b(r1, r0)
        L_0x0119:
            java.lang.String r0 = ""
        L_0x011b:
            r1 = -1
            int r2 = r0.hashCode()     // Catch:{ JSONException -> 0x0151 }
            r3 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r2 == r3) goto L_0x0135
            r3 = 2019754500(0x78630204, float:1.8417067E34)
            if (r2 == r3) goto L_0x012b
            goto L_0x013e
        L_0x012b:
            java.lang.String r2 = "medium_template"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x013e
            r1 = 1
            goto L_0x013e
        L_0x0135:
            java.lang.String r2 = "small_template"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x0151 }
            if (r0 == 0) goto L_0x013e
            r1 = 0
        L_0x013e:
            java.lang.String r0 = "native_template_type"
            if (r1 == 0) goto L_0x014d
            if (r1 == r10) goto L_0x0148
            r8.put(r0, r11)     // Catch:{ JSONException -> 0x0151 }
            goto L_0x0157
        L_0x0148:
            r1 = 2
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x0151 }
            goto L_0x0157
        L_0x014d:
            r8.put(r0, r10)     // Catch:{ JSONException -> 0x0151 }
            goto L_0x0157
        L_0x0151:
            r0 = move-exception
            java.lang.String r1 = "Could not log native template signal to JSON"
            com.google.android.gms.internal.ads.C1018Rk.b(r1, r0)
        L_0x0157:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.T.a(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject a(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        Context context2 = context;
        Map<String, WeakReference<View>> map3 = map2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (!(map == null || view == null)) {
            int[] b2 = b(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                View view2 = (View) ((WeakReference) next.getValue()).get();
                if (view2 != null) {
                    int[] b3 = b(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", a(context2, view2.getMeasuredWidth()));
                        jSONObject4.put("height", a(context2, view2.getMeasuredHeight()));
                        jSONObject4.put("x", a(context2, b3[0] - b2[0]));
                        jSONObject4.put("y", a(context2, b3[1] - b2[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = a(context2, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", a(context2, b3[0] - b2[0]));
                            jSONObject.put("y", a(context2, b3[1] - b2[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str2 = str3;
                            str = str4;
                            try {
                                jSONObject3.put("font_size", (double) textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                C1018Rk.d("Unable to get asset views information");
                                it = it2;
                                str3 = str2;
                                str4 = str;
                            }
                        } else {
                            str2 = str3;
                            str = str4;
                        }
                        jSONObject3.put("is_clickable", map3 != null && map3.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put((String) next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str2 = str3;
                        str = str4;
                        C1018Rk.d("Unable to get asset views information");
                        it = it2;
                        str3 = str2;
                        str4 = str;
                    }
                    it = it2;
                    str3 = str2;
                    str4 = str;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject a(View view) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) Qqa.e().a(F.kf)).booleanValue()) {
                p.c();
                z = oa.e(view);
            } else {
                p.c();
                z = oa.d(view) != -1;
            }
            jSONObject.put("contained_in_scroll_view", z);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("click_point", a(context, point, point2));
                jSONObject.put("asset_id", str);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            jSONObject = null;
            C1018Rk.b("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
        return jSONObject;
    }

    public static boolean a(int i) {
        if (!((Boolean) Qqa.e().a(F.Vb)).booleanValue()) {
            return true;
        }
        return ((Boolean) Qqa.e().a(F.Wb)).booleanValue() || i <= 15299999;
    }

    public static boolean a(Context context, C2988yS ySVar) {
        if (!ySVar.I) {
            return false;
        }
        if (((Boolean) Qqa.e().a(F.lf)).booleanValue()) {
            return ((Boolean) Qqa.e().a(F.of)).booleanValue();
        }
        String str = (String) Qqa.e().a(F.mf);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            for (String equals : C1575eX.a(LW.a(';')).a((CharSequence) str)) {
                if (equals.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject b(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            p.c();
            jSONObject.put("can_show_on_lock_screen", oa.c(view));
            p.c();
            jSONObject.put("is_keyguard_locked", oa.i(context));
        } catch (JSONException unused) {
            C1018Rk.d("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private static int[] b(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }
}
