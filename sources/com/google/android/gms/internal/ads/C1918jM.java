package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.jM  reason: case insensitive filesystem */
public final class C1918jM implements JO<C1706gM> {

    /* renamed from: a  reason: collision with root package name */
    private final JO<QO> f10907a;

    /* renamed from: b  reason: collision with root package name */
    private final SS f10908b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f10909c;

    /* renamed from: d  reason: collision with root package name */
    private final C2874wk f10910d;

    public C1918jM(VM<QO> vm, SS ss, Context context, C2874wk wkVar) {
        this.f10907a = vm;
        this.f10908b = ss;
        this.f10909c = context;
        this.f10910d = wkVar;
    }

    public final LY<C1706gM> a() {
        return DY.a(this.f10907a.a(), new C1848iM(this), (Executor) C1252_k.f9704f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1706gM a(QO qo) {
        boolean z;
        String str;
        int i;
        int i2;
        float f2;
        String str2;
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        C2462qqa qqa = this.f10908b.f8619e;
        C2462qqa[] qqaArr = qqa.f11920g;
        if (qqaArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (C2462qqa qqa2 : qqaArr) {
                if (!qqa2.i && !z2) {
                    str = qqa2.f11914a;
                    z2 = true;
                }
                if (qqa2.i && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = qqa.f11914a;
            z = qqa.i;
        }
        Resources resources = this.f10909c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f2 = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f3 = displayMetrics.density;
            int i5 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f10910d.i().h();
            i2 = i5;
            f2 = f3;
        }
        StringBuilder sb = new StringBuilder();
        C2462qqa[] qqaArr2 = qqa.f11920g;
        if (qqaArr2 != null) {
            boolean z4 = false;
            for (C2462qqa qqa3 : qqaArr2) {
                if (qqa3.i) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append((qqa3.f11918e != -1 || f2 == 0.0f) ? qqa3.f11918e : (int) (((float) qqa3.f11919f) / f2));
                    sb.append("x");
                    if (qqa3.f11915b == -2) {
                        if (f2 != 0.0f) {
                            i4 = (int) (((float) qqa3.f11916c) / f2);
                            sb.append(i4);
                        }
                    }
                    i4 = qqa3.f11915b;
                    sb.append(i4);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new C1706gM(qqa, str, z, sb.toString(), f2, i2, i, str2, this.f10908b.o);
    }
}
