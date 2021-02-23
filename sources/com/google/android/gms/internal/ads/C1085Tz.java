package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Tz  reason: case insensitive filesystem */
public interface C1085Tz {
    void C();

    void D();

    boolean T();

    void a();

    void a(Bundle bundle);

    void a(View view);

    void a(View view, MotionEvent motionEvent, View view2);

    void a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void a(View view, Map<String, WeakReference<View>> map);

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void a(Era era);

    void a(C1724gc gcVar);

    void a(C3102zra zra);

    void a(String str);

    JSONObject b(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void b();

    void b(Bundle bundle);

    void c();

    boolean c(Bundle bundle);

    void destroy();
}
