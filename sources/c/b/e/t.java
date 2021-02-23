package c.b.e;

import c.b.e.C0487l;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class t {
    static String a(r rVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        a(rVar, sb, 0);
        return sb.toString();
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void a(r rVar, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : rVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String replaceFirst : treeSet) {
            String replaceFirst2 = replaceFirst.replaceFirst("get", BuildConfig.FLAVOR);
            if (replaceFirst2.endsWith("List") && !replaceFirst2.endsWith("OrBuilderList")) {
                String str = replaceFirst2.substring(0, 1).toLowerCase() + replaceFirst2.substring(1, replaceFirst2.length() - 4);
                Method method2 = (Method) hashMap.get("get" + replaceFirst2);
                if (method2 != null) {
                    a(sb, i, a(str), C0487l.a(method2, (Object) rVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst2)) != null) {
                if (replaceFirst2.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst2.substring(0, replaceFirst2.length() - 5))) {
                    }
                }
                String str2 = replaceFirst2.substring(0, 1).toLowerCase() + replaceFirst2.substring(1);
                Method method3 = (Method) hashMap.get("get" + replaceFirst2);
                Method method4 = (Method) hashMap.get("has" + replaceFirst2);
                if (method3 != null) {
                    Object a2 = C0487l.a(method3, (Object) rVar, new Object[0]);
                    if (method4 == null ? !a(a2) : ((Boolean) C0487l.a(method4, (Object) rVar, new Object[0])).booleanValue()) {
                        a(sb, i, a(str2), a2);
                    }
                }
            }
        }
        if (rVar instanceof C0487l.d) {
            Iterator<Map.Entry<C0487l.f, Object>> b2 = ((C0487l.d) rVar).f5040d.b();
            while (b2.hasNext()) {
                Map.Entry next = b2.next();
                a(sb, i, "[" + ((C0487l.f) next.getKey()).a() + "]", next.getValue());
            }
        }
        D d2 = ((C0487l) rVar).f5032b;
        if (d2 != null) {
            d2.a(sb, i);
        }
    }

    static final void a(StringBuilder sb, int i, String str, Object obj) {
        String str2;
        String a2;
        if (obj instanceof List) {
            for (Object a3 : (List) obj) {
                a(sb, i, str, a3);
            }
            return;
        }
        sb.append(10);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            a2 = B.a((String) obj);
        } else if (obj instanceof C0480e) {
            sb.append(": \"");
            a2 = B.a((C0480e) obj);
        } else {
            if (obj instanceof C0487l) {
                sb.append(" {");
                a((C0487l) obj, sb, i + 2);
                sb.append("\n");
                for (int i3 = 0; i3 < i; i3++) {
                    sb.append(' ');
                }
                str2 = "}";
            } else {
                sb.append(": ");
                str2 = obj.toString();
            }
            sb.append(str2);
            return;
        }
        sb.append(a2);
        sb.append('\"');
    }

    private static boolean a(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = BuildConfig.FLAVOR;
        } else if (!(obj instanceof C0480e)) {
            return obj instanceof r ? obj == ((r) obj).a() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        } else {
            obj2 = C0480e.f5007a;
        }
        return obj.equals(obj2);
    }
}
