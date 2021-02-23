package g;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import g.a.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f15314a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<String> f15315a = new ArrayList(20);

        private void d(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(e.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        char charAt2 = str2.charAt(i2);
                        if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException(e.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                        }
                    }
                    return;
                }
                throw new NullPointerException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* access modifiers changed from: package-private */
        public a a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                b(BuildConfig.FLAVOR, str.substring(1));
                return this;
            } else {
                b(BuildConfig.FLAVOR, str);
                return this;
            }
        }

        public a a(String str, String str2) {
            d(str, str2);
            b(str, str2);
            return this;
        }

        public z a() {
            return new z(this);
        }

        public a b(String str) {
            int i = 0;
            while (i < this.f15315a.size()) {
                if (str.equalsIgnoreCase(this.f15315a.get(i))) {
                    this.f15315a.remove(i);
                    this.f15315a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public a b(String str, String str2) {
            this.f15315a.add(str);
            this.f15315a.add(str2.trim());
            return this;
        }

        public a c(String str, String str2) {
            d(str, str2);
            b(str);
            b(str, str2);
            return this;
        }
    }

    z(a aVar) {
        List<String> list = aVar.f15315a;
        this.f15314a = (String[]) list.toArray(new String[list.size()]);
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f15315a, this.f15314a);
        return aVar;
    }

    public String a(int i) {
        return this.f15314a[i * 2];
    }

    public String a(String str) {
        return a(this.f15314a, str);
    }

    public int b() {
        return this.f15314a.length / 2;
    }

    public String b(int i) {
        return this.f15314a[(i * 2) + 1];
    }

    public List<String> b(String str) {
        int b2 = b();
        ArrayList arrayList = null;
        for (int i = 0; i < b2; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && Arrays.equals(((z) obj).f15314a, this.f15314a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15314a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
