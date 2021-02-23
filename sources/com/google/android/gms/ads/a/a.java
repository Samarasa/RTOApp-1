package com.google.android.gms.ads.a;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.n;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C2741uoa;

public abstract class a {

    /* renamed from: com.google.android.gms.ads.a.a$a  reason: collision with other inner class name */
    public static abstract class C0069a {
        @Deprecated
        public void a(int i) {
        }

        public void a(a aVar) {
        }

        public void a(n nVar) {
        }
    }

    public static void a(Context context, String str, e eVar, int i, C0069a aVar) {
        C0563t.a(context, (Object) "Context cannot be null.");
        C0563t.a(str, (Object) "adUnitId cannot be null.");
        C0563t.a(eVar, (Object) "AdRequest cannot be null.");
        new C2741uoa(context, str, eVar.a(), i, aVar).a();
    }

    public abstract void a(Activity activity, l lVar);
}
