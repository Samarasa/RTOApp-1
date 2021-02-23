package com.google.ads.mediation;

import com.google.android.gms.internal.ads.C1018Rk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class e {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String name();

        boolean required() default true;
    }

    public void a(Map<String, String> map) {
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                hashMap.put(bVar.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C1018Rk.d("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException unused) {
                    String str2 = (String) next.getKey();
                    sb = new StringBuilder(String.valueOf(str2).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str2);
                    str = "\" could not be set: Illegal Access";
                } catch (IllegalArgumentException unused2) {
                    String str3 = (String) next.getKey();
                    sb = new StringBuilder(String.valueOf(str3).length() + 43);
                    sb.append("Server option \"");
                    sb.append(str3);
                    str = "\" could not be set: Bad Type";
                }
            } else {
                String str4 = (String) next.getKey();
                String str5 = (String) next.getValue();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 31 + String.valueOf(str5).length());
                sb2.append("Unexpected server option: ");
                sb2.append(str4);
                sb2.append(" = \"");
                sb2.append(str5);
                sb2.append("\"");
                C1018Rk.a(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((b) field3.getAnnotation(b.class)).required()) {
                String valueOf = String.valueOf(((b) field3.getAnnotation(b.class)).name());
                C1018Rk.d(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(((b) field3.getAnnotation(b.class)).name());
            }
        }
        if (sb3.length() > 0) {
            String valueOf2 = String.valueOf(sb3.toString());
            throw new a(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        }
        return;
        sb.append(str);
        C1018Rk.d(sb.toString());
    }
}
