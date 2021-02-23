package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.sd  reason: case insensitive filesystem */
public final class C2576sd implements _qa {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile C1797hd f12104a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12105b;

    public C2576sd(Context context) {
        this.f12105b = context;
    }

    /* access modifiers changed from: private */
    public final void a() {
        if (this.f12104a != null) {
            this.f12104a.e();
            Binder.flushPendingCommands();
        }
    }

    public final Ara a(C1339b<?> bVar) {
        C2009kd a2 = C2009kd.a(bVar);
        long b2 = p.j().b();
        try {
            C1742gl glVar = new C1742gl();
            this.f12104a = new C1797hd(this.f12105b, p.q().b(), new C2860wd(this, glVar), new C2789vd(this, glVar));
            this.f12104a.j();
            LY a3 = DY.a(DY.a(glVar, new C2505rd(this, a2), (Executor) C1252_k.f9699a), (long) ((Integer) Qqa.e().a(F.Tc)).intValue(), TimeUnit.MILLISECONDS, C1252_k.f9702d);
            a3.a(new C2647td(this), C1252_k.f9699a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a3.get();
            long b3 = p.j().b() - b2;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b3);
            sb.append("ms");
            fa.f(sb.toString());
            C2151md mdVar = (C2151md) new C2161mi(parcelFileDescriptor).a(C2151md.CREATOR);
            if (mdVar == null) {
                return null;
            }
            if (mdVar.f11328a) {
                throw new C1143Wf(mdVar.f11329b);
            } else if (mdVar.f11332e.length != mdVar.f11333f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    String[] strArr = mdVar.f11332e;
                    if (i >= strArr.length) {
                        return new Ara(mdVar.f11330c, mdVar.f11331d, (Map<String, String>) hashMap, mdVar.f11334g, mdVar.f11335h);
                    }
                    hashMap.put(strArr[i], mdVar.f11333f[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(p.j().b() - b2);
            sb2.append("ms");
            fa.f(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b4 = p.j().b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4);
            sb3.append("ms");
            fa.f(sb3.toString());
            throw th;
        }
    }
}
