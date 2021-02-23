package c.b.b.b.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: c.b.b.b.b.b  reason: case insensitive filesystem */
public final class C0254b extends a {
    public static final Parcelable.Creator<C0254b> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public static final C0254b f3862a = new C0254b(0);

    /* renamed from: b  reason: collision with root package name */
    private final int f3863b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3864c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f3865d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3866e;

    public C0254b(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    C0254b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f3863b = i;
        this.f3864c = i2;
        this.f3865d = pendingIntent;
        this.f3866e = str;
    }

    public C0254b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public C0254b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case androidx.viewpager.widget.a.POSITION_UNCHANGED:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0254b)) {
            return false;
        }
        C0254b bVar = (C0254b) obj;
        return this.f3864c == bVar.f3864c && C0562s.a(this.f3865d, bVar.f3865d) && C0562s.a(this.f3866e, bVar.f3866e);
    }

    public final int g() {
        return this.f3864c;
    }

    public final String h() {
        return this.f3866e;
    }

    public final int hashCode() {
        return C0562s.a(Integer.valueOf(this.f3864c), this.f3865d, this.f3866e);
    }

    public final PendingIntent i() {
        return this.f3865d;
    }

    public final boolean j() {
        return (this.f3864c == 0 || this.f3865d == null) ? false : true;
    }

    public final boolean k() {
        return this.f3864c == 0;
    }

    public final String toString() {
        C0562s.a a2 = C0562s.a((Object) this);
        a2.a("statusCode", a(this.f3864c));
        a2.a("resolution", this.f3865d);
        a2.a("message", this.f3866e);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3863b);
        c.a(parcel, 2, g());
        c.a(parcel, 3, (Parcelable) i(), i, false);
        c.a(parcel, 4, h(), false);
        c.a(parcel, a2);
    }
}
