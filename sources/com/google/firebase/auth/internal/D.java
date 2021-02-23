package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.C0286w;
import c.b.b.b.d.d.ra;
import c.b.d.e;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C3306p;
import com.google.firebase.auth.C3307q;
import com.google.firebase.auth.J;
import com.google.firebase.auth.W;
import com.google.firebase.auth.X;
import com.google.firebase.auth.r;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class D extends C3306p {
    public static final Parcelable.Creator<D> CREATOR = new G();

    /* renamed from: a  reason: collision with root package name */
    private ra f14344a;

    /* renamed from: b  reason: collision with root package name */
    private z f14345b;

    /* renamed from: c  reason: collision with root package name */
    private String f14346c;

    /* renamed from: d  reason: collision with root package name */
    private String f14347d;

    /* renamed from: e  reason: collision with root package name */
    private List<z> f14348e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f14349f;

    /* renamed from: g  reason: collision with root package name */
    private String f14350g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f14351h;
    private F i;
    private boolean j;
    private J k;
    private C3296l l;

    D(ra raVar, z zVar, String str, String str2, List<z> list, List<String> list2, String str3, Boolean bool, F f2, boolean z, J j2, C3296l lVar) {
        this.f14344a = raVar;
        this.f14345b = zVar;
        this.f14346c = str;
        this.f14347d = str2;
        this.f14348e = list;
        this.f14349f = list2;
        this.f14350g = str3;
        this.f14351h = bool;
        this.i = f2;
        this.j = z;
        this.k = j2;
        this.l = lVar;
    }

    public D(e eVar, List<? extends A> list) {
        C0563t.a(eVar);
        this.f14346c = eVar.d();
        this.f14347d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f14350g = "2";
        a(list);
    }

    public final J A() {
        return this.k;
    }

    public final List<W> B() {
        C3296l lVar = this.l;
        return lVar != null ? lVar.a() : C0286w.a();
    }

    public final D a(String str) {
        this.f14350g = str;
        return this;
    }

    public final C3306p a(List<? extends A> list) {
        C0563t.a(list);
        this.f14348e = new ArrayList(list.size());
        this.f14349f = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            A a2 = (A) list.get(i2);
            if (a2.e().equals("firebase")) {
                this.f14345b = (z) a2;
            } else {
                this.f14349f.add(a2.e());
            }
            this.f14348e.add((z) a2);
        }
        if (this.f14345b == null) {
            this.f14345b = this.f14348e.get(0);
        }
        return this;
    }

    public final List<String> a() {
        return this.f14349f;
    }

    public final void a(ra raVar) {
        C0563t.a(raVar);
        this.f14344a = raVar;
    }

    public final void a(J j2) {
        this.k = j2;
    }

    public final void a(F f2) {
        this.i = f2;
    }

    public final void a(boolean z) {
        this.j = z;
    }

    public final /* synthetic */ C3306p b() {
        this.f14351h = false;
        return this;
    }

    public final void b(List<W> list) {
        this.l = C3296l.a(list);
    }

    public String e() {
        return this.f14345b.e();
    }

    public List<? extends A> g() {
        return this.f14348e;
    }

    public String h() {
        return this.f14345b.j();
    }

    public boolean i() {
        r a2;
        Boolean bool = this.f14351h;
        if (bool == null || bool.booleanValue()) {
            ra raVar = this.f14344a;
            String str = BuildConfig.FLAVOR;
            if (!(raVar == null || (a2 = C3295k.a(raVar.h())) == null)) {
                str = a2.b();
            }
            boolean z = true;
            if (g().size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.f14351h = Boolean.valueOf(z);
        }
        return this.f14351h.booleanValue();
    }

    public final e j() {
        return e.a(this.f14346c);
    }

    public final String k() {
        Map map;
        ra raVar = this.f14344a;
        if (raVar == null || raVar.h() == null || (map = (Map) C3295k.a(this.f14344a.h()).a().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public final ra l() {
        return this.f14344a;
    }

    public final String u() {
        return this.f14344a.k();
    }

    public final String v() {
        return l().h();
    }

    public final /* synthetic */ X w() {
        return new H(this);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, (Parcelable) l(), i2, false);
        c.a(parcel, 2, (Parcelable) this.f14345b, i2, false);
        c.a(parcel, 3, this.f14346c, false);
        c.a(parcel, 4, this.f14347d, false);
        c.c(parcel, 5, this.f14348e, false);
        c.b(parcel, 6, a(), false);
        c.a(parcel, 7, this.f14350g, false);
        c.a(parcel, 8, Boolean.valueOf(i()), false);
        c.a(parcel, 9, (Parcelable) x(), i2, false);
        c.a(parcel, 10, this.j);
        c.a(parcel, 11, (Parcelable) this.k, i2, false);
        c.a(parcel, 12, (Parcelable) this.l, i2, false);
        c.a(parcel, a2);
    }

    public C3307q x() {
        return this.i;
    }

    public final List<z> y() {
        return this.f14348e;
    }

    public final boolean z() {
        return this.j;
    }
}
