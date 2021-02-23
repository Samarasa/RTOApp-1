package c.a.a.c.c;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class p implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<o>> f3307a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Map<String, String> f3308b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final String f3309a = b();

        /* renamed from: b  reason: collision with root package name */
        private static final Map<String, List<o>> f3310b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3311c = true;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, List<o>> f3312d = f3310b;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3313e = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f3309a)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(f3309a)));
            }
            f3310b = Collections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        public p a() {
            this.f3311c = true;
            return new p(this.f3312d);
        }
    }

    static final class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final String f3314a;

        b(String str) {
            this.f3314a = str;
        }

        public String a() {
            return this.f3314a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f3314a.equals(((b) obj).f3314a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3314a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f3314a + '\'' + '}';
        }
    }

    p(Map<String, List<o>> map) {
        this.f3307a = Collections.unmodifiableMap(map);
    }

    private String a(List<o> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = list.get(i).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f3307a.entrySet()) {
            String a2 = a((List) next.getValue());
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put(next.getKey(), a2);
            }
        }
        return hashMap;
    }

    public Map<String, String> a() {
        if (this.f3308b == null) {
            synchronized (this) {
                if (this.f3308b == null) {
                    this.f3308b = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f3308b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f3307a.equals(((p) obj).f3307a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3307a.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f3307a + '}';
    }
}
