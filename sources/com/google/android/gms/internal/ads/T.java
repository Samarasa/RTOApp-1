package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class T {

    /* renamed from: a  reason: collision with root package name */
    final boolean f8722a = true;

    /* renamed from: b  reason: collision with root package name */
    private final List<Q> f8723b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f8724c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Object f8725d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private T f8726e;

    public T(boolean z, String str, String str2) {
        this.f8724c.put("action", str);
        this.f8724c.put("ad_format", str2);
    }

    public final Q a(long j) {
        if (!this.f8722a) {
            return null;
        }
        return new Q(j, (String) null, (Q) null);
    }

    public final W a() {
        W w;
        boolean booleanValue = ((Boolean) Qqa.e().a(F.vb)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f8725d) {
            for (Q next : this.f8723b) {
                long a2 = next.a();
                String b2 = next.b();
                Q c2 = next.c();
                if (c2 != null && a2 > 0) {
                    sb.append(b2);
                    sb.append('.');
                    sb.append(a2 - c2.a());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(c2.a()))) {
                            hashMap.put(Long.valueOf(c2.a()), new StringBuilder(b2));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(c2.a()));
                            sb2.append('+');
                            sb2.append(b2);
                        }
                    }
                }
            }
            this.f8723b.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(p.j().a() + (((Long) entry.getKey()).longValue() - p.j().b()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            w = new W(sb.toString(), str);
        }
        return w;
    }

    public final void a(T t) {
        synchronized (this.f8725d) {
            this.f8726e = t;
        }
    }

    public final void a(String str, String str2) {
        I c2;
        if (this.f8722a && !TextUtils.isEmpty(str2) && (c2 = p.g().c()) != null) {
            synchronized (this.f8725d) {
                M a2 = c2.a(str);
                Map<String, String> map = this.f8724c;
                map.put(str, a2.a(map.get(str), str2));
            }
        }
    }

    public final boolean a(Q q, long j, String... strArr) {
        synchronized (this.f8725d) {
            for (String q2 : strArr) {
                this.f8723b.add(new Q(j, q2, q));
            }
        }
        return true;
    }

    public final Map<String, String> b() {
        synchronized (this.f8725d) {
            I c2 = p.g().c();
            if (c2 != null) {
                if (this.f8726e != null) {
                    Map<String, String> a2 = c2.a(this.f8724c, this.f8726e.b());
                    return a2;
                }
            }
            Map<String, String> map = this.f8724c;
            return map;
        }
    }
}
