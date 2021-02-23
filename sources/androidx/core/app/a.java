package androidx.core.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.core.app.b;

class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String[] f850a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f851b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f852c;

    a(String[] strArr, Activity activity, int i) {
        this.f850a = strArr;
        this.f851b = activity;
        this.f852c = i;
    }

    public void run() {
        int[] iArr = new int[this.f850a.length];
        PackageManager packageManager = this.f851b.getPackageManager();
        String packageName = this.f851b.getPackageName();
        int length = this.f850a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f850a[i], packageName);
        }
        ((b.a) this.f851b).onRequestPermissionsResult(this.f852c, this.f850a, iArr);
    }
}
