package c.b.d;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.q;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f4959a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4960b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4961c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4962d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4963e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4964f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4965g;

    private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C0563t.b(!q.b(str), "ApplicationId must be set.");
        this.f4960b = str;
        this.f4959a = str2;
        this.f4961c = str3;
        this.f4962d = str4;
        this.f4963e = str5;
        this.f4964f = str6;
        this.f4965g = str7;
    }

    public static i a(Context context) {
        x xVar = new x(context);
        String a2 = xVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new i(a2, xVar.a("google_api_key"), xVar.a("firebase_database_url"), xVar.a("ga_trackingId"), xVar.a("gcm_defaultSenderId"), xVar.a("google_storage_bucket"), xVar.a("project_id"));
    }

    public String a() {
        return this.f4959a;
    }

    public String b() {
        return this.f4960b;
    }

    public String c() {
        return this.f4963e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C0562s.a(this.f4960b, iVar.f4960b) && C0562s.a(this.f4959a, iVar.f4959a) && C0562s.a(this.f4961c, iVar.f4961c) && C0562s.a(this.f4962d, iVar.f4962d) && C0562s.a(this.f4963e, iVar.f4963e) && C0562s.a(this.f4964f, iVar.f4964f) && C0562s.a(this.f4965g, iVar.f4965g);
    }

    public int hashCode() {
        return C0562s.a(this.f4960b, this.f4959a, this.f4961c, this.f4962d, this.f4963e, this.f4964f, this.f4965g);
    }

    public String toString() {
        C0562s.a a2 = C0562s.a((Object) this);
        a2.a("applicationId", this.f4960b);
        a2.a("apiKey", this.f4959a);
        a2.a("databaseUrl", this.f4961c);
        a2.a("gcmSenderId", this.f4963e);
        a2.a("storageBucket", this.f4964f);
        a2.a("projectId", this.f4965g);
        return a2.toString();
    }
}
