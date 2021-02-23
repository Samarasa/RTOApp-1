package g.a.e;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import h.e;
import h.g;
import h.h;
import h.p;
import h.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class d {

    /* renamed from: a  reason: collision with root package name */
    static final c[] f15058a = {new c(c.f15055f, (String) BuildConfig.FLAVOR), new c(c.f15052c, "GET"), new c(c.f15052c, "POST"), new c(c.f15053d, "/"), new c(c.f15053d, "/index.html"), new c(c.f15054e, "http"), new c(c.f15054e, "https"), new c(c.f15051b, "200"), new c(c.f15051b, "204"), new c(c.f15051b, "206"), new c(c.f15051b, "304"), new c(c.f15051b, "400"), new c(c.f15051b, "404"), new c(c.f15051b, "500"), new c("accept-charset", (String) BuildConfig.FLAVOR), new c("accept-encoding", "gzip, deflate"), new c("accept-language", (String) BuildConfig.FLAVOR), new c("accept-ranges", (String) BuildConfig.FLAVOR), new c("accept", (String) BuildConfig.FLAVOR), new c("access-control-allow-origin", (String) BuildConfig.FLAVOR), new c("age", (String) BuildConfig.FLAVOR), new c("allow", (String) BuildConfig.FLAVOR), new c("authorization", (String) BuildConfig.FLAVOR), new c("cache-control", (String) BuildConfig.FLAVOR), new c("content-disposition", (String) BuildConfig.FLAVOR), new c("content-encoding", (String) BuildConfig.FLAVOR), new c("content-language", (String) BuildConfig.FLAVOR), new c("content-length", (String) BuildConfig.FLAVOR), new c("content-location", (String) BuildConfig.FLAVOR), new c("content-range", (String) BuildConfig.FLAVOR), new c("content-type", (String) BuildConfig.FLAVOR), new c("cookie", (String) BuildConfig.FLAVOR), new c("date", (String) BuildConfig.FLAVOR), new c("etag", (String) BuildConfig.FLAVOR), new c("expect", (String) BuildConfig.FLAVOR), new c("expires", (String) BuildConfig.FLAVOR), new c("from", (String) BuildConfig.FLAVOR), new c("host", (String) BuildConfig.FLAVOR), new c("if-match", (String) BuildConfig.FLAVOR), new c("if-modified-since", (String) BuildConfig.FLAVOR), new c("if-none-match", (String) BuildConfig.FLAVOR), new c("if-range", (String) BuildConfig.FLAVOR), new c("if-unmodified-since", (String) BuildConfig.FLAVOR), new c("last-modified", (String) BuildConfig.FLAVOR), new c("link", (String) BuildConfig.FLAVOR), new c("location", (String) BuildConfig.FLAVOR), new c("max-forwards", (String) BuildConfig.FLAVOR), new c("proxy-authenticate", (String) BuildConfig.FLAVOR), new c("proxy-authorization", (String) BuildConfig.FLAVOR), new c("range", (String) BuildConfig.FLAVOR), new c("referer", (String) BuildConfig.FLAVOR), new c("refresh", (String) BuildConfig.FLAVOR), new c("retry-after", (String) BuildConfig.FLAVOR), new c("server", (String) BuildConfig.FLAVOR), new c("set-cookie", (String) BuildConfig.FLAVOR), new c("strict-transport-security", (String) BuildConfig.FLAVOR), new c("transfer-encoding", (String) BuildConfig.FLAVOR), new c("user-agent", (String) BuildConfig.FLAVOR), new c("vary", (String) BuildConfig.FLAVOR), new c("via", (String) BuildConfig.FLAVOR), new c("www-authenticate", (String) BuildConfig.FLAVOR)};

    /* renamed from: b  reason: collision with root package name */
    static final Map<h, Integer> f15059b = a();

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f15060a;

        /* renamed from: b  reason: collision with root package name */
        private final g f15061b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15062c;

        /* renamed from: d  reason: collision with root package name */
        private int f15063d;

        /* renamed from: e  reason: collision with root package name */
        c[] f15064e;

        /* renamed from: f  reason: collision with root package name */
        int f15065f;

        /* renamed from: g  reason: collision with root package name */
        int f15066g;

        /* renamed from: h  reason: collision with root package name */
        int f15067h;

        a(int i, int i2, w wVar) {
            this.f15060a = new ArrayList();
            this.f15064e = new c[8];
            this.f15065f = this.f15064e.length - 1;
            this.f15066g = 0;
            this.f15067h = 0;
            this.f15062c = i;
            this.f15063d = i2;
            this.f15061b = p.a(wVar);
        }

        a(int i, w wVar) {
            this(i, i, wVar);
        }

        private int a(int i) {
            return this.f15065f + 1 + i;
        }

        private void a(int i, c cVar) {
            this.f15060a.add(cVar);
            int i2 = cVar.i;
            if (i != -1) {
                i2 -= this.f15064e[a(i)].i;
            }
            int i3 = this.f15063d;
            if (i2 > i3) {
                e();
                return;
            }
            int b2 = b((this.f15067h + i2) - i3);
            if (i == -1) {
                int i4 = this.f15066g + 1;
                c[] cVarArr = this.f15064e;
                if (i4 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f15065f = this.f15064e.length - 1;
                    this.f15064e = cVarArr2;
                }
                int i5 = this.f15065f;
                this.f15065f = i5 - 1;
                this.f15064e[i5] = cVar;
                this.f15066g++;
            } else {
                this.f15064e[i + a(i) + b2] = cVar;
            }
            this.f15067h += i2;
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f15064e.length;
                while (true) {
                    length--;
                    if (length < this.f15065f || i <= 0) {
                        c[] cVarArr = this.f15064e;
                        int i3 = this.f15065f;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f15066g);
                        this.f15065f += i2;
                    } else {
                        c[] cVarArr2 = this.f15064e;
                        i -= cVarArr2[length].i;
                        this.f15067h -= cVarArr2[length].i;
                        this.f15066g--;
                        i2++;
                    }
                }
                c[] cVarArr3 = this.f15064e;
                int i32 = this.f15065f;
                System.arraycopy(cVarArr3, i32 + 1, cVarArr3, i32 + 1 + i2, this.f15066g);
                this.f15065f += i2;
            }
            return i2;
        }

        private h c(int i) {
            return (d(i) ? d.f15058a[i] : this.f15064e[a(i - d.f15058a.length)]).f15056g;
        }

        private void d() {
            int i = this.f15063d;
            int i2 = this.f15067h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                e();
            } else {
                b(i2 - i);
            }
        }

        private boolean d(int i) {
            return i >= 0 && i <= d.f15058a.length - 1;
        }

        private void e() {
            Arrays.fill(this.f15064e, (Object) null);
            this.f15065f = this.f15064e.length - 1;
            this.f15066g = 0;
            this.f15067h = 0;
        }

        private void e(int i) {
            if (d(i)) {
                this.f15060a.add(d.f15058a[i]);
                return;
            }
            int a2 = a(i - d.f15058a.length);
            if (a2 >= 0) {
                c[] cVarArr = this.f15064e;
                if (a2 <= cVarArr.length - 1) {
                    this.f15060a.add(cVarArr[a2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private int f() {
            return this.f15061b.readByte() & 255;
        }

        private void f(int i) {
            a(-1, new c(c(i), b()));
        }

        private void g() {
            h b2 = b();
            d.a(b2);
            a(-1, new c(b2, b()));
        }

        private void g(int i) {
            this.f15060a.add(new c(c(i), b()));
        }

        private void h() {
            h b2 = b();
            d.a(b2);
            this.f15060a.add(new c(b2, b()));
        }

        /* access modifiers changed from: package-private */
        public int a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f2 = f();
                if ((f2 & 128) == 0) {
                    return i2 + (f2 << i4);
                }
                i2 += (f2 & 127) << i4;
                i4 += 7;
            }
        }

        public List<c> a() {
            ArrayList arrayList = new ArrayList(this.f15060a);
            this.f15060a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public h b() {
            int f2 = f();
            boolean z = (f2 & 128) == 128;
            int a2 = a(f2, 127);
            return z ? h.a(v.a().a(this.f15061b.b((long) a2))) : this.f15061b.a((long) a2);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            while (!this.f15061b.e()) {
                byte readByte = this.f15061b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    e(a((int) readByte, 127) - 1);
                } else if (readByte == 64) {
                    g();
                } else if ((readByte & 64) == 64) {
                    f(a((int) readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.f15063d = a((int) readByte, 31);
                    int i = this.f15063d;
                    if (i < 0 || i > this.f15062c) {
                        throw new IOException("Invalid dynamic table size update " + this.f15063d);
                    }
                    d();
                } else if (readByte == 16 || readByte == 0) {
                    h();
                } else {
                    g(a((int) readByte, 15) - 1);
                }
            }
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final e f15068a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15069b;

        /* renamed from: c  reason: collision with root package name */
        private int f15070c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15071d;

        /* renamed from: e  reason: collision with root package name */
        int f15072e;

        /* renamed from: f  reason: collision with root package name */
        int f15073f;

        /* renamed from: g  reason: collision with root package name */
        c[] f15074g;

        /* renamed from: h  reason: collision with root package name */
        int f15075h;
        int i;
        int j;

        b(int i2, boolean z, e eVar) {
            this.f15070c = Integer.MAX_VALUE;
            this.f15074g = new c[8];
            this.f15075h = this.f15074g.length - 1;
            this.i = 0;
            this.j = 0;
            this.f15072e = i2;
            this.f15073f = i2;
            this.f15069b = z;
            this.f15068a = eVar;
        }

        b(e eVar) {
            this(4096, true, eVar);
        }

        private void a() {
            int i2 = this.f15073f;
            int i3 = this.j;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                b(i3 - i2);
            }
        }

        private void a(c cVar) {
            int i2 = cVar.i;
            int i3 = this.f15073f;
            if (i2 > i3) {
                b();
                return;
            }
            b((this.j + i2) - i3);
            int i4 = this.i + 1;
            c[] cVarArr = this.f15074g;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15075h = this.f15074g.length - 1;
                this.f15074g = cVarArr2;
            }
            int i5 = this.f15075h;
            this.f15075h = i5 - 1;
            this.f15074g[i5] = cVar;
            this.i++;
            this.j += i2;
        }

        private int b(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f15074g.length;
                while (true) {
                    length--;
                    if (length < this.f15075h || i2 <= 0) {
                        c[] cVarArr = this.f15074g;
                        int i4 = this.f15075h;
                        System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i3, this.i);
                        c[] cVarArr2 = this.f15074g;
                        int i5 = this.f15075h;
                        Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                        this.f15075h += i3;
                    } else {
                        c[] cVarArr3 = this.f15074g;
                        i2 -= cVarArr3[length].i;
                        this.j -= cVarArr3[length].i;
                        this.i--;
                        i3++;
                    }
                }
                c[] cVarArr4 = this.f15074g;
                int i42 = this.f15075h;
                System.arraycopy(cVarArr4, i42 + 1, cVarArr4, i42 + 1 + i3, this.i);
                c[] cVarArr22 = this.f15074g;
                int i52 = this.f15075h;
                Arrays.fill(cVarArr22, i52 + 1, i52 + 1 + i3, (Object) null);
                this.f15075h += i3;
            }
            return i3;
        }

        private void b() {
            Arrays.fill(this.f15074g, (Object) null);
            this.f15075h = this.f15074g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            this.f15072e = i2;
            int min = Math.min(i2, 16384);
            int i3 = this.f15073f;
            if (i3 != min) {
                if (min < i3) {
                    this.f15070c = Math.min(this.f15070c, min);
                }
                this.f15071d = true;
                this.f15073f = min;
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, int i4) {
            int i5;
            e eVar;
            if (i2 < i3) {
                eVar = this.f15068a;
                i5 = i2 | i4;
            } else {
                this.f15068a.writeByte(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.f15068a.writeByte(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                eVar = this.f15068a;
            }
            eVar.writeByte(i5);
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            int i2;
            int i3;
            if (!this.f15069b || v.a().a(hVar) >= hVar.n()) {
                i3 = hVar.n();
                i2 = 0;
            } else {
                e eVar = new e();
                v.a().a(hVar, eVar);
                hVar = eVar.m();
                i3 = hVar.n();
                i2 = 128;
            }
            a(i3, 127, i2);
            this.f15068a.a(hVar);
        }

        /* access modifiers changed from: package-private */
        public void a(List<c> list) {
            int i2;
            int i3;
            if (this.f15071d) {
                int i4 = this.f15070c;
                if (i4 < this.f15073f) {
                    a(i4, 31, 32);
                }
                this.f15071d = false;
                this.f15070c = Integer.MAX_VALUE;
                a(this.f15073f, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = list.get(i5);
                h o = cVar.f15056g.o();
                h hVar = cVar.f15057h;
                Integer num = d.f15059b.get(o);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (g.a.e.a((Object) d.f15058a[i3 - 1].f15057h, (Object) hVar)) {
                            i2 = i3;
                        } else if (g.a.e.a((Object) d.f15058a[i3].f15057h, (Object) hVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.f15075h + 1;
                    int length = this.f15074g.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (g.a.e.a((Object) this.f15074g[i6].f15056g, (Object) o)) {
                            if (g.a.e.a((Object) this.f15074g[i6].f15057h, (Object) hVar)) {
                                i3 = d.f15058a.length + (i6 - this.f15075h);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.f15075h) + d.f15058a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    a(i3, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.f15068a.writeByte(64);
                        a(o);
                    } else if (!o.b(c.f15050a) || c.f15055f.equals(o)) {
                        a(i2, 63, 64);
                    } else {
                        a(i2, 15, 0);
                        a(hVar);
                    }
                    a(hVar);
                    a(cVar);
                }
            }
        }
    }

    static h a(h hVar) {
        int n = hVar.n();
        int i = 0;
        while (i < n) {
            byte a2 = hVar.a(i);
            if (a2 < 65 || a2 > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.q());
            }
        }
        return hVar;
    }

    private static Map<h, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f15058a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = f15058a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f15056g)) {
                linkedHashMap.put(f15058a[i].f15056g, Integer.valueOf(i));
            }
            i++;
        }
    }
}
