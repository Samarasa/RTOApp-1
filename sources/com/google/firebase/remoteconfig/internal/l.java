package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import c.b.b.b.g.i;
import com.google.android.gms.common.util.e;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.f;
import com.google.firebase.remoteconfig.g;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.j;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final long f14749a = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: b  reason: collision with root package name */
    static final int[] f14750b = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInstanceId f14751c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f14752d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f14753e;

    /* renamed from: f  reason: collision with root package name */
    private final e f14754f;

    /* renamed from: g  reason: collision with root package name */
    private final Random f14755g;

    /* renamed from: h  reason: collision with root package name */
    private final f f14756h;
    private final ConfigFetchHttpClient i;
    private final n j;
    private final Map<String, String> k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Date f14757a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14758b;

        /* renamed from: c  reason: collision with root package name */
        private final h f14759c;

        /* renamed from: d  reason: collision with root package name */
        private final String f14760d;

        private a(Date date, int i, h hVar, String str) {
            this.f14757a = date;
            this.f14758b = i;
            this.f14759c = hVar;
            this.f14760d = str;
        }

        public static a a(h hVar, String str) {
            return new a(hVar.d(), 0, hVar, str);
        }

        public static a a(Date date) {
            return new a(date, 1, (h) null, (String) null);
        }

        public static a b(Date date) {
            return new a(date, 2, (h) null, (String) null);
        }

        public h a() {
            return this.f14759c;
        }

        /* access modifiers changed from: package-private */
        public String b() {
            return this.f14760d;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f14758b;
        }
    }

    public l(FirebaseInstanceId firebaseInstanceId, com.google.firebase.analytics.a.a aVar, Executor executor, e eVar, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, n nVar, Map<String, String> map) {
        this.f14751c = firebaseInstanceId;
        this.f14752d = aVar;
        this.f14753e = executor;
        this.f14754f = eVar;
        this.f14755g = random;
        this.f14756h = fVar;
        this.i = configFetchHttpClient;
        this.j = nVar;
        this.k = map;
    }

    private long a(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f14750b;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i2, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f14755g.nextInt((int) millis));
    }

    /* access modifiers changed from: private */
    public i<a> a(i<h> iVar, long j2) {
        Date date = new Date(this.f14754f.a());
        if (iVar.e() && a(j2, date)) {
            return c.b.b.b.g.l.a(a.b(date));
        }
        Date c2 = c(date);
        return (c2 != null ? c.b.b.b.g.l.a((Exception) new com.google.firebase.remoteconfig.i(b(c2.getTime() - date.getTime()), c2.getTime())) : b(date)).b(this.f14753e, j.a(this, date));
    }

    private a a(Date date) {
        try {
            a fetch = this.i.fetch(this.i.a(), this.f14751c.a(), this.f14751c.c(), a(), this.j.c(), this.k, date);
            if (fetch.b() != null) {
                this.j.a(fetch.b());
            }
            this.j.f();
            return fetch;
        } catch (j e2) {
            n.a a2 = a(e2.a(), date);
            if (a(a2, e2.a())) {
                throw new com.google.firebase.remoteconfig.i(a2.a().getTime());
            }
            throw a(e2);
        }
    }

    private n.a a(int i2, Date date) {
        if (b(i2)) {
            d(date);
        }
        return this.j.a();
    }

    private j a(j jVar) {
        String str;
        int a2 = jVar.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a2 == 429) {
            throw new f("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a2 != 500) {
            switch (a2) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a3 = jVar.a();
        return new j(a3, "Fetch failed: " + str, jVar);
    }

    private Map<String, String> a() {
        HashMap hashMap = new HashMap();
        com.google.firebase.analytics.a.a aVar = this.f14752d;
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.a(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public void a(i<a> iVar, Date date) {
        if (iVar.e()) {
            this.j.a(date);
            return;
        }
        Exception a2 = iVar.a();
        if (a2 != null) {
            if (a2 instanceof com.google.firebase.remoteconfig.i) {
                this.j.h();
            } else {
                this.j.g();
            }
        }
    }

    private boolean a(long j2, Date date) {
        Date d2 = this.j.d();
        if (d2.equals(n.f14766a)) {
            return false;
        }
        return date.before(new Date(d2.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private boolean a(n.a aVar, int i2) {
        return aVar.b() > 1 || i2 == 429;
    }

    private i<a> b(Date date) {
        try {
            a a2 = a(date);
            return a2.c() != 0 ? c.b.b.b.g.l.a(a2) : this.f14756h.a(a2.a()).a(this.f14753e, k.a(a2));
        } catch (g e2) {
            return c.b.b.b.g.l.a((Exception) e2);
        }
    }

    private String b(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2))});
    }

    private boolean b(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    private Date c(Date date) {
        Date a2 = this.j.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    private void d(Date date) {
        int b2 = this.j.a().b() + 1;
        this.j.a(b2, new Date(date.getTime() + a(b2)));
    }

    public i<a> a(long j2) {
        if (this.j.e()) {
            j2 = 0;
        }
        return this.f14756h.b().b(this.f14753e, i.a(this, j2));
    }
}
