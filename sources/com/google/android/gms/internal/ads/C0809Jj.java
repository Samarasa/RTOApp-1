package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jj  reason: case insensitive filesystem */
public final class C0809Jj extends a {
    public static final Parcelable.Creator<C0809Jj> CREATOR = new C0783Ij();

    /* renamed from: a  reason: collision with root package name */
    public final String f7458a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7459b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7460c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7461d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f7462e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7463f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7464g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f7465h;

    public C0809Jj(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f7458a = str;
        this.f7459b = str2;
        this.f7460c = z;
        this.f7461d = z2;
        this.f7462e = list;
        this.f7463f = z3;
        this.f7464g = z4;
        this.f7465h = list2 == null ? new ArrayList<>() : list2;
    }

    public static C0809Jj a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C0809Jj(jSONObject.optString("click_string", BuildConfig.FLAVOR), jSONObject.optString("report_url", BuildConfig.FLAVOR), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), M.a(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), M.a(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f7458a, false);
        c.a(parcel, 3, this.f7459b, false);
        c.a(parcel, 4, this.f7460c);
        c.a(parcel, 5, this.f7461d);
        c.b(parcel, 6, this.f7462e, false);
        c.a(parcel, 7, this.f7463f);
        c.a(parcel, 8, this.f7464g);
        c.b(parcel, 9, this.f7465h, false);
        c.a(parcel, a2);
    }
}
