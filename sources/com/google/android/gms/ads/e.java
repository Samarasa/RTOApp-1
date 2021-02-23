package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.internal.ads.Zra;
import com.google.android.gms.internal.ads.asa;
import java.util.Date;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final asa f5378a;

    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Zra f5379a = new Zra();

        public a() {
            this.f5379a.b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @Deprecated
        public final a a(int i) {
            this.f5379a.a(i);
            return this;
        }

        public final a a(Location location) {
            this.f5379a.a(location);
            return this;
        }

        public final a a(Class<? extends j> cls, Bundle bundle) {
            this.f5379a.a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f5379a.c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final a a(String str) {
            this.f5379a.a(str);
            return this;
        }

        @Deprecated
        public final a a(Date date) {
            this.f5379a.a(date);
            return this;
        }

        @Deprecated
        public final a a(boolean z) {
            this.f5379a.a(z);
            return this;
        }

        public final e a() {
            return new e(this);
        }

        @Deprecated
        public final a b(String str) {
            this.f5379a.b(str);
            return this;
        }

        @Deprecated
        public final a b(boolean z) {
            this.f5379a.b(z);
            return this;
        }
    }

    private e(a aVar) {
        this.f5378a = new asa(aVar.f5379a);
    }

    public final asa a() {
        return this.f5378a;
    }
}
