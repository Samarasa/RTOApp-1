package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.b {
    f() {
    }

    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0079b bVar) {
        int i;
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.f6074a = bVar.a(context, str);
        aVar.f6075b = bVar.a(context, str, true);
        if (aVar.f6074a == 0 && aVar.f6075b == 0) {
            i = 0;
        } else if (aVar.f6074a >= aVar.f6075b) {
            i = -1;
        } else {
            aVar.f6076c = 1;
            return aVar;
        }
        aVar.f6076c = i;
        return aVar;
    }
}
