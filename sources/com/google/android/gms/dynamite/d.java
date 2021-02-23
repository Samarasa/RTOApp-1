package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.b {
    d() {
    }

    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0079b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.f6074a = bVar.a(context, str);
        if (aVar.f6074a != 0) {
            aVar.f6076c = -1;
        } else {
            aVar.f6075b = bVar.a(context, str, true);
            if (aVar.f6075b != 0) {
                aVar.f6076c = 1;
            }
        }
        return aVar;
    }
}
