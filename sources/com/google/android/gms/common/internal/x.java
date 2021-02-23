package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import c.b.b.b.b.l;

public class x {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f6002a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6003b = this.f6002a.getResourcePackageName(l.common_google_play_services_unknown_issue);

    public x(Context context) {
        C0563t.a(context);
        this.f6002a = context.getResources();
    }

    public String a(String str) {
        int identifier = this.f6002a.getIdentifier(str, "string", this.f6003b);
        if (identifier == 0) {
            return null;
        }
        return this.f6002a.getString(identifier);
    }
}
