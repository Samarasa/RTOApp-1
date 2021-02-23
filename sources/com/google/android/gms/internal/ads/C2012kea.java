package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kea  reason: case insensitive filesystem */
public class C2012kea {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C2012kea f11076a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile C2012kea f11077b;

    /* renamed from: c  reason: collision with root package name */
    private static final C2012kea f11078c = new C2012kea(true);

    /* renamed from: d  reason: collision with root package name */
    private final Map<a, C2934xea.d<?, ?>> f11079d;

    /* renamed from: com.google.android.gms.internal.ads.kea$a */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f11080a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11081b;

        a(Object obj, int i) {
            this.f11080a = obj;
            this.f11081b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11080a == aVar.f11080a && this.f11081b == aVar.f11081b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f11080a) * 65535) + this.f11081b;
        }
    }

    C2012kea() {
        this.f11079d = new HashMap();
    }

    private C2012kea(boolean z) {
        this.f11079d = Collections.emptyMap();
    }

    public static C2012kea a() {
        C2012kea kea = f11076a;
        if (kea == null) {
            synchronized (C2012kea.class) {
                kea = f11076a;
                if (kea == null) {
                    kea = f11078c;
                    f11076a = kea;
                }
            }
        }
        return kea;
    }

    public static C2012kea b() {
        C2012kea kea = f11077b;
        if (kea != null) {
            return kea;
        }
        synchronized (C2012kea.class) {
            C2012kea kea2 = f11077b;
            if (kea2 != null) {
                return kea2;
            }
            C2012kea a2 = C2863wea.a(C2012kea.class);
            f11077b = a2;
            return a2;
        }
    }

    public final <ContainingType extends C1872ifa> C2934xea.d<ContainingType, ?> a(ContainingType containingtype, int i) {
        return this.f11079d.get(new a(containingtype, i));
    }
}
