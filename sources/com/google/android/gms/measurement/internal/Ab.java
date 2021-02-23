package com.google.android.gms.measurement.internal;

final class Ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f13157a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13158b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f13159c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f13160d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f13161e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bb f13162f;

    Ab(Bb bb, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f13162f = bb;
        this.f13157a = i;
        this.f13158b = str;
        this.f13159c = obj;
        this.f13160d = obj2;
        this.f13161e = obj3;
    }

    public final void run() {
        char c2;
        Bb bb;
        Lb p = this.f13162f.f13807a.p();
        if (p.s()) {
            if (this.f13162f.f13189c == 0) {
                if (this.f13162f.m().o()) {
                    bb = this.f13162f;
                    bb.i();
                    c2 = 'C';
                } else {
                    bb = this.f13162f;
                    bb.i();
                    c2 = 'c';
                }
                char unused = bb.f13189c = c2;
            }
            if (this.f13162f.f13190d < 0) {
                Bb bb2 = this.f13162f;
                long unused2 = bb2.f13190d = bb2.m().n();
            }
            char charAt = "01VDIWEA?".charAt(this.f13157a);
            char a2 = this.f13162f.f13189c;
            long b2 = this.f13162f.f13190d;
            String a3 = Bb.a(true, this.f13158b, this.f13159c, this.f13160d, this.f13161e);
            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(a2);
            sb.append(b2);
            sb.append(":");
            sb.append(a3);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f13158b.substring(0, 1024);
            }
            p.f13336e.a(sb2, 1);
            return;
        }
        this.f13162f.a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
