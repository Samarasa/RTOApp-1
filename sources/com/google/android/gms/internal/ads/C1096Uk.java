package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Uk  reason: case insensitive filesystem */
public final class C1096Uk {
    public static Context a(Context context) {
        return b(context).a();
    }

    public static <T> T a(Context context, String str, C1070Tk<IBinder, T> tk) {
        try {
            return tk.apply(b(context).a(str));
        } catch (Exception e2) {
            throw new C1148Wk(e2);
        }
    }

    private static DynamiteModule b(Context context) {
        try {
            return DynamiteModule.a(context, DynamiteModule.f6073h, ModuleDescriptor.MODULE_ID);
        } catch (Exception e2) {
            throw new C1148Wk(e2);
        }
    }
}
