package org.jsoup.nodes;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

public class Attributes implements Iterable<Attribute>, Cloneable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashMap<String, Attribute> f15410a = null;

    private class a extends AbstractMap<String, String> {

        /* renamed from: org.jsoup.nodes.Attributes$a$a  reason: collision with other inner class name */
        private class C0091a implements Iterator<Map.Entry<String, String>> {

            /* renamed from: a  reason: collision with root package name */
            private Iterator<Attribute> f15412a;

            /* renamed from: b  reason: collision with root package name */
            private Attribute f15413b;

            private C0091a() {
                this.f15412a = Attributes.this.f15410a.values().iterator();
            }

            public boolean hasNext() {
                while (this.f15412a.hasNext()) {
                    this.f15413b = this.f15412a.next();
                    if (this.f15413b.b()) {
                        return true;
                    }
                }
                return false;
            }

            public Map.Entry<String, String> next() {
                return new Attribute(this.f15413b.getKey().substring(5), this.f15413b.getValue());
            }

            public void remove() {
                Attributes.this.f15410a.remove(this.f15413b.getKey());
            }
        }

        private class b extends AbstractSet<Map.Entry<String, String>> {
            private b() {
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new C0091a();
            }

            public int size() {
                int i = 0;
                while (new C0091a().hasNext()) {
                    i++;
                }
                return i;
            }
        }

        private a() {
            if (Attributes.this.f15410a == null) {
                LinkedHashMap unused = Attributes.this.f15410a = new LinkedHashMap(2);
            }
        }

        /* renamed from: a */
        public String put(String str, String str2) {
            String a2 = Attributes.b(str);
            String value = Attributes.this.hasKey(a2) ? ((Attribute) Attributes.this.f15410a.get(a2)).getValue() : null;
            Attributes.this.f15410a.put(a2, new Attribute(a2, str2));
            return value;
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return new b();
        }
    }

    /* access modifiers changed from: private */
    public static String b(String str) {
        return "data-" + str;
    }

    /* access modifiers changed from: package-private */
    public void a(Appendable appendable, Document.OutputSettings outputSettings) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap != null) {
            for (Map.Entry<String, Attribute> value : linkedHashMap.entrySet()) {
                appendable.append(" ");
                ((Attribute) value.getValue()).a(appendable, outputSettings);
            }
        }
    }

    public void addAll(Attributes attributes) {
        if (attributes.size() != 0) {
            if (this.f15410a == null) {
                this.f15410a = new LinkedHashMap<>(attributes.size());
            }
            this.f15410a.putAll(attributes.f15410a);
        }
    }

    public List<Attribute> asList() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry<String, Attribute> value : this.f15410a.entrySet()) {
            arrayList.add(value.getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attributes clone() {
        if (this.f15410a == null) {
            return new Attributes();
        }
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.f15410a = new LinkedHashMap<>(this.f15410a.size());
            Iterator<Attribute> it = iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                attributes.f15410a.put(next.getKey(), next.clone());
            }
            return attributes;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Map<String, String> dataset() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap != null) {
            return linkedHashMap.equals(attributes.f15410a);
        }
        if (attributes.f15410a == null) {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r3 = r0.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String get(java.lang.String r3) {
        /*
            r2 = this;
            org.jsoup.helper.Validate.notEmpty(r3)
            java.util.LinkedHashMap<java.lang.String, org.jsoup.nodes.Attribute> r0 = r2.f15410a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.Object r3 = r0.get(r3)
            org.jsoup.nodes.Attribute r3 = (org.jsoup.nodes.Attribute) r3
            if (r3 == 0) goto L_0x0016
            java.lang.String r1 = r3.getValue()
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Attributes.get(java.lang.String):java.lang.String");
    }

    public String getIgnoreCase(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap == null) {
            return BuildConfig.FLAVOR;
        }
        for (String next : linkedHashMap.keySet()) {
            if (next.equalsIgnoreCase(str)) {
                return this.f15410a.get(next).getValue();
            }
        }
        return BuildConfig.FLAVOR;
    }

    public boolean hasKey(String str) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        return linkedHashMap != null && linkedHashMap.containsKey(str);
    }

    public boolean hasKeyIgnoreCase(String str) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap == null) {
            return false;
        }
        for (String equalsIgnoreCase : linkedHashMap.keySet()) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap != null) {
            return linkedHashMap.hashCode();
        }
        return 0;
    }

    public String html() {
        StringBuilder sb = new StringBuilder();
        try {
            a((Appendable) sb, new Document(BuildConfig.FLAVOR).outputSettings());
            return sb.toString();
        } catch (IOException e2) {
            throw new SerializationException((Throwable) e2);
        }
    }

    public Iterator<Attribute> iterator() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        return (linkedHashMap == null || linkedHashMap.isEmpty()) ? Collections.emptyList().iterator() : this.f15410a.values().iterator();
    }

    public void put(String str, String str2) {
        put(new Attribute(str, str2));
    }

    public void put(String str, boolean z) {
        if (z) {
            put(new BooleanAttribute(str));
        } else {
            remove(str);
        }
    }

    public void put(Attribute attribute) {
        Validate.notNull(attribute);
        if (this.f15410a == null) {
            this.f15410a = new LinkedHashMap<>(2);
        }
        this.f15410a.put(attribute.getKey(), attribute);
    }

    public void remove(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap != null) {
            linkedHashMap.remove(str);
        }
    }

    public void removeIgnoreCase(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap != null) {
            for (String next : linkedHashMap.keySet()) {
                if (next.equalsIgnoreCase(str)) {
                    this.f15410a.remove(next);
                }
            }
        }
    }

    public int size() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.f15410a;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public String toString() {
        return html();
    }
}
