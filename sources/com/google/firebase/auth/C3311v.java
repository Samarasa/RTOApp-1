package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.firebase.auth.v  reason: case insensitive filesystem */
public class C3311v extends C3277b implements Cloneable {
    public static final Parcelable.Creator<C3311v> CREATOR = new D();

    /* renamed from: a  reason: collision with root package name */
    private String f14427a;

    /* renamed from: b  reason: collision with root package name */
    private String f14428b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14429c;

    /* renamed from: d  reason: collision with root package name */
    private String f14430d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14431e;

    /* renamed from: f  reason: collision with root package name */
    private String f14432f;

    /* renamed from: g  reason: collision with root package name */
    private String f14433g;

    C3311v(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        C0563t.a((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || (z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))), (Object) "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f14427a = str;
        this.f14428b = str2;
        this.f14429c = z;
        this.f14430d = str3;
        this.f14431e = z2;
        this.f14432f = str4;
        this.f14433g = str5;
    }

    public final C3277b a() {
        return (C3311v) clone();
    }

    public final C3311v a(boolean z) {
        this.f14431e = false;
        return this;
    }

    public /* synthetic */ Object clone() {
        return new C3311v(this.f14427a, h(), this.f14429c, this.f14430d, this.f14431e, this.f14432f, this.f14433g);
    }

    public String g() {
        return "phone";
    }

    public String h() {
        return this.f14428b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14427a, false);
        c.a(parcel, 2, h(), false);
        c.a(parcel, 3, this.f14429c);
        c.a(parcel, 4, this.f14430d, false);
        c.a(parcel, 5, this.f14431e);
        c.a(parcel, 6, this.f14432f, false);
        c.a(parcel, 7, this.f14433g, false);
        c.a(parcel, a2);
    }
}
