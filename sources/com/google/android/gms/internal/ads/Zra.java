package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.g.a;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.v;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class Zra {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f9597a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f9598b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Class<? extends v>, v> f9599c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<String> f9600d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f9601e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f9602f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Date f9603g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f9604h;
    /* access modifiers changed from: private */
    public final List<String> i = new ArrayList();
    /* access modifiers changed from: private */
    public int j = -1;
    /* access modifiers changed from: private */
    public Location k;
    /* access modifiers changed from: private */
    public boolean l = false;
    /* access modifiers changed from: private */
    public String m;
    /* access modifiers changed from: private */
    public String n;
    /* access modifiers changed from: private */
    public int o = -1;
    /* access modifiers changed from: private */
    public boolean p;
    /* access modifiers changed from: private */
    public a q;
    /* access modifiers changed from: private */
    public int r = -1;
    /* access modifiers changed from: private */
    public String s;
    /* access modifiers changed from: private */
    public int t = 60000;

    @Deprecated
    public final void a(int i2) {
        this.j = i2;
    }

    public final void a(Location location) {
        this.k = location;
    }

    public final void a(Class<? extends j> cls, Bundle bundle) {
        this.f9598b.putBundle(cls.getName(), bundle);
    }

    public final void a(String str) {
        this.f9597a.add(str);
    }

    @Deprecated
    public final void a(Date date) {
        this.f9603g = date;
    }

    @Deprecated
    public final void a(boolean z) {
        this.p = z;
    }

    public final void b(String str) {
        this.f9600d.add(str);
    }

    @Deprecated
    public final void b(boolean z) {
        this.o = z ? 1 : 0;
    }

    public final void c(String str) {
        this.f9600d.remove(str);
    }
}
