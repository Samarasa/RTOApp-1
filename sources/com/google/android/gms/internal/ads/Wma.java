package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
public final class Wma extends Surface {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9166a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f9167b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9168c;

    /* renamed from: d  reason: collision with root package name */
    private final Yma f9169d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9170e;

    private Wma(Yma yma, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f9169d = yma;
        this.f9168c = z;
    }

    public static Wma a(Context context, boolean z) {
        if (Tma.f8821a >= 17) {
            Cma.b(!z || a(context));
            return new Yma().a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (Wma.class) {
            if (!f9167b) {
                if (Tma.f8821a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(Tma.f8821a == 24 && (Tma.f8824d.startsWith("SM-G950") || Tma.f8824d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    f9166a = z2;
                }
                f9167b = true;
            }
            z = f9166a;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f9169d) {
            if (!this.f9170e) {
                this.f9169d.a();
                this.f9170e = true;
            }
        }
    }
}
