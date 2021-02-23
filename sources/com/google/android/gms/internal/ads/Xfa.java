package com.google.android.gms.internal.ads;

final class Xfa extends Vfa<Yfa, Yfa> {
    Xfa() {
    }

    private static void a(Object obj, Yfa yfa) {
        ((C2934xea) obj).zzino = yfa;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a() {
        return Yfa.d();
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj) {
        ((C2934xea) obj).zzino.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, int i, int i2) {
        ((Yfa) obj).a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, int i, long j) {
        ((Yfa) obj).a(i << 3, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, int i, Lda lda) {
        ((Yfa) obj).a((i << 3) | 2, (Object) lda);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((Yfa) obj).a((i << 3) | 3, (Object) (Yfa) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, C2583sga sga) {
        ((Yfa) obj).b(sga);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, Object obj2) {
        a(obj, (Yfa) obj2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(C2865wfa wfa) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(Object obj) {
        Yfa yfa = (Yfa) obj;
        yfa.a();
        return yfa;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((Yfa) obj).a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Object obj, C2583sga sga) {
        ((Yfa) obj).a(sga);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Object obj, Object obj2) {
        a(obj, (Yfa) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int c(Object obj) {
        return ((Yfa) obj).b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        Yfa yfa = (Yfa) obj;
        Yfa yfa2 = (Yfa) obj2;
        return yfa2.equals(Yfa.c()) ? yfa : Yfa.a(yfa, yfa2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d(Object obj) {
        return ((C2934xea) obj).zzino;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e(Object obj) {
        Yfa yfa = ((C2934xea) obj).zzino;
        if (yfa != Yfa.c()) {
            return yfa;
        }
        Yfa d2 = Yfa.d();
        a(obj, d2);
        return d2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int f(Object obj) {
        return ((Yfa) obj).e();
    }
}
