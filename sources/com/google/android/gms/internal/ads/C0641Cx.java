package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.Cx  reason: case insensitive filesystem */
public final class C0641Cx extends C2934xea<C0641Cx, a> implements C2014kfa {
    private static volatile C2440qfa<C0641Cx> zzei;
    /* access modifiers changed from: private */
    public static final C0641Cx zzew;
    private int zzdt;
    private int zzev = 2;

    /* renamed from: com.google.android.gms.internal.ads.Cx$a */
    public static final class a extends C2934xea.a<C0641Cx, a> implements C2014kfa {
        private a() {
            super(C0641Cx.zzew);
        }

        /* synthetic */ a(C0720Fy fy) {
            this();
        }
    }

    static {
        C0641Cx cx = new C0641Cx();
        zzew = cx;
        C2934xea.a(C0641Cx.class, cx);
    }

    private C0641Cx() {
    }

    public static C0641Cx p() {
        return zzew;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0720Fy.f6970a[i - 1]) {
            case 1:
                return new C0641Cx();
            case 2:
                return new a((C0720Fy) null);
            case 3:
                return C2934xea.a((C1872ifa) zzew, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdt", "zzev", C1692fz.a()});
            case 4:
                return zzew;
            case 5:
                C2440qfa<C0641Cx> qfa = zzei;
                if (qfa == null) {
                    synchronized (C0641Cx.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzew);
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

    public final C1692fz o() {
        C1692fz a2 = C1692fz.a(this.zzev);
        return a2 == null ? C1692fz.ENUM_SIGNAL_SOURCE_ADSHIELD : a2;
    }
}
