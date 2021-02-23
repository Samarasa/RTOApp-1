package c.a.a.c.b.a;

import android.graphics.Bitmap;
import android.os.Build;
import c.a.a.i.k;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class o implements l {

    /* renamed from: a  reason: collision with root package name */
    private static final Bitmap.Config[] f3062a;

    /* renamed from: b  reason: collision with root package name */
    private static final Bitmap.Config[] f3063b = f3062a;

    /* renamed from: c  reason: collision with root package name */
    private static final Bitmap.Config[] f3064c = {Bitmap.Config.RGB_565};

    /* renamed from: d  reason: collision with root package name */
    private static final Bitmap.Config[] f3065d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e  reason: collision with root package name */
    private static final Bitmap.Config[] f3066e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f  reason: collision with root package name */
    private final b f3067f = new b();

    /* renamed from: g  reason: collision with root package name */
    private final h<a, Bitmap> f3068g = new h<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f3069h = new HashMap();

    static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f3070a;

        /* renamed from: b  reason: collision with root package name */
        int f3071b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap.Config f3072c;

        public a(b bVar) {
            this.f3070a = bVar;
        }

        public void a() {
            this.f3070a.a(this);
        }

        public void a(int i, Bitmap.Config config) {
            this.f3071b = i;
            this.f3072c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3071b == aVar.f3071b && k.b((Object) this.f3072c, (Object) aVar.f3072c);
        }

        public int hashCode() {
            int i = this.f3071b * 31;
            Bitmap.Config config = this.f3072c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.a(this.f3071b, this.f3072c);
        }
    }

    static class b extends d<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        public a a() {
            return new a(this);
        }

        public a a(int i, Bitmap.Config config) {
            a aVar = (a) b();
            aVar.a(i, config);
            return aVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, configArr.length + 1);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f3062a = configArr;
    }

    static String a(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> b2 = b(bitmap.getConfig());
        Integer num2 = (Integer) b2.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            b2.remove(num);
        } else {
            b2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private static Bitmap.Config[] a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f3063b;
        }
        int i = n.f3061a[config.ordinal()];
        if (i == 1) {
            return f3062a;
        }
        if (i == 2) {
            return f3064c;
        }
        if (i == 3) {
            return f3065d;
        }
        if (i == 4) {
            return f3066e;
        }
        return new Bitmap.Config[]{config};
    }

    private a b(int i, Bitmap.Config config) {
        a a2 = this.f3067f.a(i, config);
        Bitmap.Config[] a3 = a(config);
        int length = a3.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = a3[i2];
            Integer ceilingKey = b(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a2;
                        }
                    } else if (config2.equals(config)) {
                        return a2;
                    }
                }
                this.f3067f.a(a2);
                return this.f3067f.a(ceilingKey.intValue(), config2);
            }
        }
        return a2;
    }

    private NavigableMap<Integer, Integer> b(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f3069h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3069h.put(config, treeMap);
        return treeMap;
    }

    public Bitmap a(int i, int i2, Bitmap.Config config) {
        a b2 = b(k.a(i, i2, config), config);
        Bitmap a2 = this.f3068g.a(b2);
        if (a2 != null) {
            a(Integer.valueOf(b2.f3071b), a2);
            a2.reconfigure(i, i2, a2.getConfig() != null ? a2.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return a2;
    }

    public void a(Bitmap bitmap) {
        a a2 = this.f3067f.a(k.a(bitmap), bitmap.getConfig());
        this.f3068g.a(a2, bitmap);
        NavigableMap<Integer, Integer> b2 = b(bitmap.getConfig());
        Integer num = (Integer) b2.get(Integer.valueOf(a2.f3071b));
        Integer valueOf = Integer.valueOf(a2.f3071b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        b2.put(valueOf, Integer.valueOf(i));
    }

    public int b(Bitmap bitmap) {
        return k.a(bitmap);
    }

    public String b(int i, int i2, Bitmap.Config config) {
        return a(k.a(i, i2, config), config);
    }

    public String c(Bitmap bitmap) {
        return a(k.a(bitmap), bitmap.getConfig());
    }

    public Bitmap removeLast() {
        Bitmap a2 = this.f3068g.a();
        if (a2 != null) {
            a(Integer.valueOf(k.a(a2)), a2);
        }
        return a2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f3068g);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f3069h.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f3069h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), BuildConfig.FLAVOR);
        }
        sb.append(")}");
        return sb.toString();
    }
}
