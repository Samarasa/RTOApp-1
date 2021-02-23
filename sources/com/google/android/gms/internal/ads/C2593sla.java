package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.sla  reason: case insensitive filesystem */
final class C2593sla {

    /* renamed from: a  reason: collision with root package name */
    private final Tja[] f12126a;

    /* renamed from: b  reason: collision with root package name */
    private final Vja f12127b;

    /* renamed from: c  reason: collision with root package name */
    private Tja f12128c;

    public C2593sla(Tja[] tjaArr, Vja vja) {
        this.f12126a = tjaArr;
        this.f12127b = vja;
    }

    public final Tja a(Wja wja, Uri uri) {
        Tja tja = this.f12128c;
        if (tja != null) {
            return tja;
        }
        Tja[] tjaArr = this.f12126a;
        int length = tjaArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Tja tja2 = tjaArr[i];
            try {
                if (tja2.a(wja)) {
                    this.f12128c = tja2;
                    wja.a();
                    break;
                }
                wja.a();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                wja.a();
                throw th;
            }
        }
        Tja tja3 = this.f12128c;
        if (tja3 != null) {
            tja3.a(this.f12127b);
            return this.f12128c;
        }
        String a2 = Tma.a((Object[]) this.f12126a);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(a2);
        sb.append(") could read the stream.");
        throw new Sla(sb.toString(), uri);
    }

    public final void a() {
        Tja tja = this.f12128c;
        if (tja != null) {
            tja.a();
            this.f12128c = null;
        }
    }
}
