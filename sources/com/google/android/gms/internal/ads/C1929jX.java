package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jX  reason: case insensitive filesystem */
abstract class C1929jX extends GW<String> {

    /* renamed from: c  reason: collision with root package name */
    final CharSequence f10940c;

    /* renamed from: d  reason: collision with root package name */
    private final LW f10941d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10942e;

    /* renamed from: f  reason: collision with root package name */
    private int f10943f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f10944g;

    protected C1929jX(C1575eX eXVar, CharSequence charSequence) {
        this.f10941d = eXVar.f10278a;
        this.f10942e = false;
        this.f10944g = eXVar.f10281d;
        this.f10940c = charSequence;
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i);

    /* access modifiers changed from: package-private */
    public abstract int b(int i);

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object b() {
        int i;
        int i2 = this.f10943f;
        while (true) {
            int i3 = this.f10943f;
            if (i3 != -1) {
                int a2 = a(i3);
                if (a2 == -1) {
                    a2 = this.f10940c.length();
                    this.f10943f = -1;
                } else {
                    this.f10943f = b(a2);
                }
                int i4 = this.f10943f;
                if (i4 == i2) {
                    this.f10943f = i4 + 1;
                    if (this.f10943f > this.f10940c.length()) {
                        this.f10943f = -1;
                    }
                } else {
                    while (i2 < a2 && this.f10941d.b(this.f10940c.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f10941d.b(this.f10940c.charAt(i - 1))) {
                        a2 = i - 1;
                    }
                    int i5 = this.f10944g;
                    if (i5 == 1) {
                        i = this.f10940c.length();
                        this.f10943f = -1;
                        while (i > i2 && this.f10941d.b(this.f10940c.charAt(i - 1))) {
                            i--;
                        }
                    } else {
                        this.f10944g = i5 - 1;
                    }
                    return this.f10940c.subSequence(i2, i).toString();
                }
            } else {
                c();
                return null;
            }
        }
    }
}
