package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wg  reason: case insensitive filesystem */
public final class C1144Wg extends C1734gh {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f9156c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f9157d;

    /* renamed from: e  reason: collision with root package name */
    private String f9158e = d("description");

    /* renamed from: f  reason: collision with root package name */
    private long f9159f = e("start_ticks");

    /* renamed from: g  reason: collision with root package name */
    private long f9160g = e("end_ticks");

    /* renamed from: h  reason: collision with root package name */
    private String f9161h = d("summary");
    private String i = d("location");

    public C1144Wg(C2313on onVar, Map<String, String> map) {
        super(onVar, "createCalendarEvent");
        this.f9156c = map;
        this.f9157d = onVar.f();
    }

    private final String d(String str) {
        return TextUtils.isEmpty(this.f9156c.get(str)) ? BuildConfig.FLAVOR : this.f9156c.get(str);
    }

    private final long e(String str) {
        String str2 = this.f9156c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent a() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f9158e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.f9161h);
        long j = this.f9159f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f9160g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void b() {
        if (this.f9157d == null) {
            a("Activity context is not available.");
            return;
        }
        p.c();
        if (!oa.e(this.f9157d).d()) {
            a("This feature is not available on the device.");
            return;
        }
        p.c();
        AlertDialog.Builder d2 = oa.d(this.f9157d);
        Resources b2 = p.g().b();
        d2.setTitle(b2 != null ? b2.getString(a.s5) : "Create calendar event");
        d2.setMessage(b2 != null ? b2.getString(a.s6) : "Allow Ad to create a calendar event?");
        d2.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new C1118Vg(this));
        d2.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new C1196Yg(this));
        d2.create().show();
    }
}
