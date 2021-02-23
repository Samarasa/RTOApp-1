package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bh  reason: case insensitive filesystem */
public final class C1380bh extends C1734gh {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f9945c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f9946d;

    public C1380bh(C2313on onVar, Map<String, String> map) {
        super(onVar, "storePicture");
        this.f9945c = map;
        this.f9946d = onVar.f();
    }

    public final void a() {
        if (this.f9946d == null) {
            a("Activity context is not available");
            return;
        }
        p.c();
        if (!oa.e(this.f9946d).c()) {
            a("Feature is not supported by the device.");
            return;
        }
        String str = this.f9945c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            p.c();
            if (!oa.b(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources b2 = p.g().b();
            p.c();
            AlertDialog.Builder d2 = oa.d(this.f9946d);
            d2.setTitle(b2 != null ? b2.getString(a.s1) : "Save image");
            d2.setMessage(b2 != null ? b2.getString(a.s2) : "Allow Ad to store image in Picture gallery?");
            d2.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new C1309ah(this, str, lastPathSegment));
            d2.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new C1522dh(this));
            d2.create().show();
        }
    }
}
