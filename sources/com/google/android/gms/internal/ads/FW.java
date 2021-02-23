package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class FW {

    /* renamed from: a  reason: collision with root package name */
    private static final ClipData f6859a = ClipData.newIntent(BuildConfig.FLAVOR, new Intent());

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        boolean z = true;
        C1434cX.a((i2 & 95) == 0, (Object) "Cannot set any dangerous parts of intent to be mutable.");
        C1434cX.a(intent.getComponent() != null, (Object) "Must set component on Intent.");
        if (a(0, 1)) {
            C1434cX.a(!a(i2, 67108864), (Object) "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !a(i2, 67108864)) {
                z = false;
            }
            C1434cX.a(z, (Object) "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !a(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!a(0, 3) && intent2.getAction() == null) {
                intent2.setAction(BuildConfig.FLAVOR);
            }
            if (!a(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory(BuildConfig.FLAVOR);
            }
            if (!a(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!a(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f6859a);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    private static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }
}
