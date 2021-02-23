package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

public final class Foa extends a {
    public static final Parcelable.Creator<Foa> CREATOR = new Eoa();

    /* renamed from: a  reason: collision with root package name */
    public final String f6931a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6932b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6933c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6934d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6935e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f6936f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6937g;

    /* renamed from: h  reason: collision with root package name */
    public long f6938h;
    public String i;
    public int j;

    Foa(String str, long j2, String str2, String str3, String str4, Bundle bundle, boolean z, long j3, String str5, int i2) {
        this.f6931a = str;
        this.f6932b = j2;
        String str6 = BuildConfig.FLAVOR;
        this.f6933c = str2 == null ? str6 : str2;
        this.f6934d = str3 == null ? str6 : str3;
        this.f6935e = str4 != null ? str4 : str6;
        this.f6936f = bundle == null ? new Bundle() : bundle;
        this.f6937g = z;
        this.f6938h = j3;
        this.i = str5;
        this.j = i2;
    }

    public static Foa a(Uri uri) {
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                C1018Rk.d(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = "1".equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            p.e();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new Foa(queryParameter, parseLong, host, str, str2, bundle, equals, 0, BuildConfig.FLAVOR, 0);
        } catch (NullPointerException | NumberFormatException e2) {
            C1018Rk.c("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    public static Foa a(String str) {
        return a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f6931a, false);
        c.a(parcel, 3, this.f6932b);
        c.a(parcel, 4, this.f6933c, false);
        c.a(parcel, 5, this.f6934d, false);
        c.a(parcel, 6, this.f6935e, false);
        c.a(parcel, 7, this.f6936f, false);
        c.a(parcel, 8, this.f6937g);
        c.a(parcel, 9, this.f6938h);
        c.a(parcel, 10, this.i, false);
        c.a(parcel, 11, this.j);
        c.a(parcel, a2);
    }
}
