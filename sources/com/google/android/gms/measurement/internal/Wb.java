package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c.b.b.b.d.f.Tf;
import com.google.android.gms.common.internal.C0563t;

public final class Wb {

    /* renamed from: a  reason: collision with root package name */
    private final Xb f13453a;

    public Wb(Xb xb) {
        C0563t.a(xb);
        this.f13453a = xb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.C0563t.a(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Wb.a(android.content.Context):boolean");
    }

    public final void a(Context context, Intent intent) {
        C3144fc a2 = C3144fc.a(context, (Tf) null);
        Bb h2 = a2.h();
        if (intent == null) {
            h2.w().a("Receiver called with null intent");
            return;
        }
        a2.i();
        String action = intent.getAction();
        h2.B().a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            h2.B().a("Starting wakeful intent.");
            this.f13453a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a2.g().a((Runnable) new Vb(this, a2, h2));
            } catch (Exception e2) {
                h2.w().a("Install Referrer Reporter encountered a problem", e2);
            }
            BroadcastReceiver.PendingResult a3 = this.f13453a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                h2.B().a("Install referrer extras are null");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            h2.z().a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle a4 = a2.v().a(Uri.parse(stringExtra));
            if (a4 == null) {
                h2.B().a("No campaign defined in install referrer broadcast");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                h2.w().a("Install referrer is missing timestamp");
            }
            a2.g().a((Runnable) new Yb(this, a2, longExtra, a4, context, h2, a3));
        }
    }
}
