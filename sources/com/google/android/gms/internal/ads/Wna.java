package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class Wna {

    /* renamed from: a  reason: collision with root package name */
    private ByteArrayOutputStream f9171a = new ByteArrayOutputStream(4096);

    /* renamed from: b  reason: collision with root package name */
    private Base64OutputStream f9172b = new Base64OutputStream(this.f9171a, 10);

    public final void a(byte[] bArr) {
        this.f9172b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.f9172b.close();
        } catch (IOException e2) {
            C1018Rk.b("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.f9171a.close();
            str = this.f9171a.toString();
        } catch (IOException e3) {
            C1018Rk.b("HashManager: Unable to convert to Base64.", e3);
            str = BuildConfig.FLAVOR;
        } catch (Throwable th) {
            this.f9171a = null;
            this.f9172b = null;
            throw th;
        }
        this.f9171a = null;
        this.f9172b = null;
        return str;
    }
}
