package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class g implements DynamiteModule.b {
    g() {
    }

    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.C0079b bVar) {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.f6074a = bVar.a(context, str);
        aVar.f6075b = aVar.f6074a != 0 ? bVar.a(context, str, false) : bVar.a(context, str, true);
        if (aVar.f6074a == 0 && aVar.f6075b == 0) {
            aVar.f6076c = 0;
        } else if (aVar.f6075b >= aVar.f6074a) {
            aVar.f6076c = 1;
        } else {
            aVar.f6076c = -1;
        }
        return aVar;
    }
}
