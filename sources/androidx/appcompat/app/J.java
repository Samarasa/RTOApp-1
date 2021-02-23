package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import b.h.a.b;
import java.util.Calendar;

class J {

    /* renamed from: a  reason: collision with root package name */
    private static J f160a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f161b;

    /* renamed from: c  reason: collision with root package name */
    private final LocationManager f162c;

    /* renamed from: d  reason: collision with root package name */
    private final a f163d = new a();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f164a;

        /* renamed from: b  reason: collision with root package name */
        long f165b;

        /* renamed from: c  reason: collision with root package name */
        long f166c;

        /* renamed from: d  reason: collision with root package name */
        long f167d;

        /* renamed from: e  reason: collision with root package name */
        long f168e;

        /* renamed from: f  reason: collision with root package name */
        long f169f;

        a() {
        }
    }

    J(Context context, LocationManager locationManager) {
        this.f161b = context;
        this.f162c = locationManager;
    }

    private Location a(String str) {
        try {
            if (this.f162c.isProviderEnabled(str)) {
                return this.f162c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    static J a(Context context) {
        if (f160a == null) {
            Context applicationContext = context.getApplicationContext();
            f160a = new J(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f160a;
    }

    private void a(Location location) {
        long j;
        a aVar = this.f163d;
        long currentTimeMillis = System.currentTimeMillis();
        I a2 = I.a();
        I i = a2;
        i.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a2.f157b;
        i.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.f159d == 1;
        long j3 = a2.f158c;
        long j4 = j2;
        long j5 = a2.f157b;
        long j6 = j3;
        boolean z2 = z;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a2.f158c;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f164a = z2;
        aVar.f165b = j4;
        aVar.f166c = j6;
        aVar.f167d = j5;
        aVar.f168e = j7;
        aVar.f169f = j;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location a2 = b.a(this.f161b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        if (b.a(this.f161b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = a("gps");
        }
        return (location == null || a2 == null) ? location != null ? location : a2 : location.getTime() > a2.getTime() ? location : a2;
    }

    private boolean c() {
        return this.f163d.f169f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        a aVar = this.f163d;
        if (c()) {
            return aVar.f164a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.f164a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
