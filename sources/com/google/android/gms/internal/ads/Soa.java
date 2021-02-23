package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.internal.ads.C2460qpa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Soa {

    /* renamed from: a  reason: collision with root package name */
    private final Woa f8689a;

    /* renamed from: b  reason: collision with root package name */
    private final C2460qpa.a f8690b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8691c;

    private Soa() {
        this.f8690b = C2460qpa.r();
        this.f8691c = false;
        this.f8689a = new Woa();
    }

    public Soa(Woa woa) {
        this.f8690b = C2460qpa.r();
        this.f8689a = woa;
        this.f8691c = ((Boolean) Qqa.e().a(F.id)).booleanValue();
    }

    public static Soa a() {
        return new Soa();
    }

    private static List<Long> b() {
        List<String> b2 = F.b();
        ArrayList arrayList = new ArrayList();
        for (String split : b2) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    fa.f("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    private final synchronized void b(Uoa uoa) {
        C2460qpa.a aVar = this.f8690b;
        aVar.o();
        aVar.a((Iterable<? extends Long>) b());
        C1326apa a2 = this.f8689a.a(((C2460qpa) ((C2934xea) this.f8690b.k())).f());
        a2.b(uoa.a());
        a2.a();
        String valueOf = String.valueOf(Integer.toString(uoa.a(), 10));
        fa.f(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void c(Uoa uoa) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(d(uoa).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        fa.f("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    fa.f("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        fa.f("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                fa.f("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    fa.f("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized String d(Uoa uoa) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f8690b.l(), Long.valueOf(p.j().b()), Integer.valueOf(uoa.a()), Base64.encodeToString(((C2460qpa) ((C2934xea) this.f8690b.k())).f(), 3)});
    }

    public final synchronized void a(Uoa uoa) {
        if (this.f8691c) {
            if (((Boolean) Qqa.e().a(F.jd)).booleanValue()) {
                c(uoa);
            } else {
                b(uoa);
            }
        }
    }

    public final synchronized void a(Voa voa) {
        if (this.f8691c) {
            try {
                voa.a(this.f8690b);
            } catch (NullPointerException e2) {
                p.g().a((Throwable) e2, "AdMobClearcutLogger.modify");
            }
        }
    }
}
