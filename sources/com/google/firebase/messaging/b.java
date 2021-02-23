package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;
import java.util.Map;

public final class b extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<b> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    Bundle f14631a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f14632b;

    /* renamed from: c  reason: collision with root package name */
    private a f14633c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f14634a;

        /* renamed from: b  reason: collision with root package name */
        private final String f14635b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f14636c;

        /* renamed from: d  reason: collision with root package name */
        private final String f14637d;

        /* renamed from: e  reason: collision with root package name */
        private final String f14638e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f14639f;

        /* renamed from: g  reason: collision with root package name */
        private final String f14640g;

        /* renamed from: h  reason: collision with root package name */
        private final String f14641h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final String o;
        private final Integer p;
        private final Integer q;
        private final Integer r;
        private final int[] s;
        private final Long t;
        private final boolean u;
        private final boolean v;
        private final boolean w;
        private final boolean x;
        private final boolean y;
        private final long[] z;

        private a(q qVar) {
            this.f14634a = qVar.a("gcm.n.title");
            this.f14635b = qVar.e("gcm.n.title");
            this.f14636c = a(qVar, "gcm.n.title");
            this.f14637d = qVar.a("gcm.n.body");
            this.f14638e = qVar.e("gcm.n.body");
            this.f14639f = a(qVar, "gcm.n.body");
            this.f14640g = qVar.a("gcm.n.icon");
            this.i = qVar.b();
            this.j = qVar.a("gcm.n.tag");
            this.k = qVar.a("gcm.n.color");
            this.l = qVar.a("gcm.n.click_action");
            this.m = qVar.a("gcm.n.android_channel_id");
            this.n = qVar.a();
            this.f14641h = qVar.a("gcm.n.image");
            this.o = qVar.a("gcm.n.ticker");
            this.p = qVar.c("gcm.n.notification_priority");
            this.q = qVar.c("gcm.n.visibility");
            this.r = qVar.c("gcm.n.notification_count");
            this.u = qVar.b("gcm.n.sticky");
            this.v = qVar.b("gcm.n.local_only");
            this.w = qVar.b("gcm.n.default_sound");
            this.x = qVar.b("gcm.n.default_vibrate_timings");
            this.y = qVar.b("gcm.n.default_light_settings");
            this.t = qVar.d("gcm.n.event_time");
            this.s = qVar.d();
            this.z = qVar.c();
        }

        private static String[] a(q qVar, String str) {
            Object[] f2 = qVar.f(str);
            if (f2 == null) {
                return null;
            }
            String[] strArr = new String[f2.length];
            for (int i2 = 0; i2 < f2.length; i2++) {
                strArr[i2] = String.valueOf(f2[i2]);
            }
            return strArr;
        }

        public String a() {
            return this.f14637d;
        }
    }

    public b(Bundle bundle) {
        this.f14631a = bundle;
    }

    public final Map<String, String> g() {
        if (this.f14632b == null) {
            Bundle bundle = this.f14631a;
            b.e.b bVar = new b.e.b();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        bVar.put(str, str2);
                    }
                }
            }
            this.f14632b = bVar;
        }
        return this.f14632b;
    }

    public final String h() {
        return this.f14631a.getString("from");
    }

    public final a i() {
        if (this.f14633c == null && q.a(this.f14631a)) {
            this.f14633c = new a(new q(this.f14631a));
        }
        return this.f14633c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f14631a, false);
        c.a(parcel, a2);
    }
}
