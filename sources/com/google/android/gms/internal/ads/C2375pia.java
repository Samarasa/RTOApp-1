package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.pia  reason: case insensitive filesystem */
public final class C2375pia extends C2934xea<C2375pia, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2375pia zzacf;
    private static volatile C2440qfa<C2375pia> zzei;
    private String zzaca = BuildConfig.FLAVOR;
    private String zzacb = BuildConfig.FLAVOR;
    private long zzacc;
    private long zzacd;
    private long zzace;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.pia$a */
    public static final class a extends C2934xea.a<C2375pia, a> implements C2014kfa {
        private a() {
            super(C2375pia.zzacf);
        }

        /* synthetic */ a(C2304oia oia) {
            this();
        }

        public final a a(long j) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2375pia) this.f12784b).a(j);
            return this;
        }

        public final a a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2375pia) this.f12784b).a(str);
            return this;
        }

        public final a b(long j) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2375pia) this.f12784b).b(j);
            return this;
        }

        public final a b(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2375pia) this.f12784b).b(str);
            return this;
        }

        public final a c(long j) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2375pia) this.f12784b).c(j);
            return this;
        }
    }

    static {
        C2375pia pia = new C2375pia();
        zzacf = pia;
        C2934xea.a(C2375pia.class, pia);
    }

    private C2375pia() {
    }

    public static C2375pia a(Lda lda) {
        return (C2375pia) C2934xea.a(zzacf, lda);
    }

    public static C2375pia a(Lda lda, C2012kea kea) {
        return (C2375pia) C2934xea.a(zzacf, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzdt |= 4;
        this.zzacc = j;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 1;
        this.zzaca = str;
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzdt |= 8;
        this.zzacd = j;
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzdt |= 2;
        this.zzacb = str;
    }

    /* access modifiers changed from: private */
    public final void c(long j) {
        this.zzdt |= 16;
        this.zzace = j;
    }

    public static a t() {
        return (a) zzacf.j();
    }

    public static C2375pia u() {
        return zzacf;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2304oia.f11616a[i - 1]) {
            case 1:
                return new C2375pia();
            case 2:
                return new a((C2304oia) null);
            case 3:
                return C2934xea.a((C1872ifa) zzacf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzdt", "zzaca", "zzacb", "zzacc", "zzacd", "zzace"});
            case 4:
                return zzacf;
            case 5:
                C2440qfa<C2375pia> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2375pia.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzacf);
                            zzei = qfa;
                        }
                    }
                }
                return qfa;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String o() {
        return this.zzaca;
    }

    public final String p() {
        return this.zzacb;
    }

    public final long q() {
        return this.zzacc;
    }

    public final long r() {
        return this.zzacd;
    }

    public final long s() {
        return this.zzace;
    }
}
