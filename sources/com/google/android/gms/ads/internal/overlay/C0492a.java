package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;

/* renamed from: com.google.android.gms.ads.internal.overlay.a  reason: case insensitive filesystem */
public final class C0492a {
    private static boolean a(Context context, Intent intent, v vVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            fa.f(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            p.c();
            oa.a(context, intent);
            if (vVar == null) {
                return true;
            }
            vVar.H();
            return true;
        } catch (ActivityNotFoundException e2) {
            C1018Rk.d(e2.getMessage());
            return false;
        }
    }

    public static boolean a(Context context, c cVar, v vVar) {
        String str;
        int i = 0;
        if (cVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            F.a(context);
            Intent intent = cVar.f5492h;
            if (intent != null) {
                return a(context, intent, vVar);
            }
            Intent intent2 = new Intent();
            if (TextUtils.isEmpty(cVar.f5486b)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(cVar.f5487c)) {
                    intent2.setDataAndType(Uri.parse(cVar.f5486b), cVar.f5487c);
                } else {
                    intent2.setData(Uri.parse(cVar.f5486b));
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(cVar.f5488d)) {
                    intent2.setPackage(cVar.f5488d);
                }
                if (!TextUtils.isEmpty(cVar.f5489e)) {
                    String[] split = cVar.f5489e.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(cVar.f5489e);
                        C1018Rk.d(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent2.setClassName(split[0], split[1]);
                }
                String str2 = cVar.f5490f;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        C1018Rk.d("Could not parse intent flags.");
                    }
                    intent2.addFlags(i);
                }
                if (((Boolean) Qqa.e().a(F.Vc)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) Qqa.e().a(F.Uc)).booleanValue()) {
                        p.c();
                        oa.b(context, intent2);
                    }
                }
                return a(context, intent2, vVar);
            }
        }
        C1018Rk.d(str);
        return false;
    }
}
