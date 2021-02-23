package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.C0518y;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

public final class RA {

    /* renamed from: a  reason: collision with root package name */
    private final C0518y f8441a;

    /* renamed from: b  reason: collision with root package name */
    private final e f8442b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f8443c;

    public RA(C0518y yVar, e eVar, Executor executor) {
        this.f8441a = yVar;
        this.f8442b = eVar;
        this.f8443c = executor;
    }

    /* access modifiers changed from: private */
    public final Bitmap a(byte[] bArr, double d2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) Qqa.e().a(F.we)).booleanValue()) {
            options.inJustDecodeBounds = true;
            a(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                int i2 = i - 1;
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros(i2 / ((Integer) Qqa.e().a(F.xe)).intValue())) / 2);
            }
        }
        return a(bArr, options);
    }

    private final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        long b2 = this.f8442b.b();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b3 = this.f8442b.b();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = b3 - b2;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            fa.f(sb.toString());
        }
        return decodeByteArray;
    }

    public final LY<Bitmap> a(String str, double d2, boolean z) {
        return DY.a(C0518y.a(str), new UA(this, d2, z), this.f8443c);
    }
}
