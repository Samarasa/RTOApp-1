package c.b.b.b.d.f;

import android.content.Context;
import android.net.Uri;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class Ca {

    /* renamed from: a  reason: collision with root package name */
    final String f4107a;

    /* renamed from: b  reason: collision with root package name */
    final Uri f4108b;

    /* renamed from: c  reason: collision with root package name */
    final String f4109c;

    /* renamed from: d  reason: collision with root package name */
    final String f4110d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f4111e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4112f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f4113g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4114h;
    final Ga<Context, Boolean> i;

    public Ca(Uri uri) {
        this((String) null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, (Ga<Context, Boolean>) null);
    }

    private Ca(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Ga<Context, Boolean> ga) {
        this.f4107a = null;
        this.f4108b = uri;
        this.f4109c = str2;
        this.f4110d = str3;
        this.f4111e = false;
        this.f4112f = false;
        this.f4113g = false;
        this.f4114h = false;
        this.i = null;
    }

    public final C0443wa<Double> a(String str, double d2) {
        return C0443wa.b(this, str, -3.0d);
    }

    public final C0443wa<Long> a(String str, long j) {
        return C0443wa.b(this, str, j);
    }

    public final C0443wa<String> a(String str, String str2) {
        return C0443wa.b(this, str, str2);
    }

    public final C0443wa<Boolean> a(String str, boolean z) {
        return C0443wa.b(this, str, z);
    }
}
