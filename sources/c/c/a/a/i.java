package c.c.a.a;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class i {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f5104a;

    /* renamed from: b  reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f5105b;

    /* renamed from: c  reason: collision with root package name */
    protected ConcurrentHashMap<String, b> f5106c;

    /* renamed from: d  reason: collision with root package name */
    protected ConcurrentHashMap<String, a> f5107d;

    /* renamed from: e  reason: collision with root package name */
    protected ConcurrentHashMap<String, Object> f5108e;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public File f5109a;

        /* renamed from: b  reason: collision with root package name */
        public String f5110b;
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public InputStream f5111a;

        /* renamed from: b  reason: collision with root package name */
        public String f5112b;

        /* renamed from: c  reason: collision with root package name */
        public String f5113c;
    }

    public i() {
        this((Map<String, String>) null);
    }

    public i(Map<String, String> map) {
        this.f5104a = false;
        d();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                b((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    private List<BasicNameValuePair> b(String str, Object obj) {
        LinkedList linkedList = new LinkedList();
        if (obj instanceof Map) {
            Map map = (Map) obj;
            ArrayList<String> arrayList = new ArrayList<>(map.keySet());
            Collections.sort(arrayList);
            for (String str2 : arrayList) {
                Object obj2 = map.get(str2);
                if (obj2 != null) {
                    if (str != null) {
                        str2 = String.format("%s[%s]", new Object[]{str, str2});
                    }
                    linkedList.addAll(b(str2, obj2));
                }
            }
        } else if (obj instanceof List) {
            for (Object b2 : (List) obj) {
                linkedList.addAll(b(String.format("%s[]", new Object[]{str}), b2));
            }
        } else if (obj instanceof Object[]) {
            for (Object b3 : (Object[]) obj) {
                linkedList.addAll(b(String.format("%s[]", new Object[]{str}), b3));
            }
        } else if (obj instanceof Set) {
            for (Object b4 : (Set) obj) {
                linkedList.addAll(b(str, b4));
            }
        } else if (obj instanceof String) {
            linkedList.add(new BasicNameValuePair(str, (String) obj));
        }
        return linkedList;
    }

    private HttpEntity b(j jVar) {
        l lVar = new l(jVar);
        lVar.a(this.f5104a);
        for (Map.Entry next : this.f5105b.entrySet()) {
            lVar.a((String) next.getKey(), (String) next.getValue());
        }
        for (BasicNameValuePair next2 : b((String) null, (Object) this.f5108e)) {
            lVar.a(next2.getName(), next2.getValue());
        }
        for (Map.Entry next3 : this.f5106c.entrySet()) {
            b bVar = (b) next3.getValue();
            if (bVar.f5111a != null) {
                lVar.a((String) next3.getKey(), bVar.f5112b, bVar.f5111a, bVar.f5113c);
            }
        }
        for (Map.Entry next4 : this.f5107d.entrySet()) {
            a aVar = (a) next4.getValue();
            lVar.a((String) next4.getKey(), aVar.f5109a, aVar.f5110b);
        }
        return lVar;
    }

    private HttpEntity c() {
        try {
            return new UrlEncodedFormEntity(b(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private void d() {
        this.f5105b = new ConcurrentHashMap<>();
        this.f5106c = new ConcurrentHashMap<>();
        this.f5107d = new ConcurrentHashMap<>();
        this.f5108e = new ConcurrentHashMap<>();
    }

    /* access modifiers changed from: protected */
    public String a() {
        return URLEncodedUtils.format(b(), "UTF-8");
    }

    public HttpEntity a(j jVar) {
        return (!this.f5106c.isEmpty() || !this.f5107d.isEmpty()) ? b(jVar) : c();
    }

    public void a(String str, Object obj) {
        if (str != null && obj != null) {
            this.f5108e.put(str, obj);
        }
    }

    public void a(String str, String str2) {
        if (str != null && str2 != null) {
            Object obj = this.f5108e.get(str);
            if (obj == null) {
                obj = new HashSet();
                a(str, obj);
            }
            if (obj instanceof List) {
                ((List) obj).add(str2);
            } else if (obj instanceof Set) {
                ((Set) obj).add(str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public List<BasicNameValuePair> b() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry next : this.f5105b.entrySet()) {
            linkedList.add(new BasicNameValuePair((String) next.getKey(), (String) next.getValue()));
        }
        linkedList.addAll(b((String) null, (Object) this.f5108e));
        return linkedList;
    }

    public void b(String str, String str2) {
        if (str != null && str2 != null) {
            this.f5105b.put(str, str2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : this.f5105b.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append((String) next.getValue());
        }
        for (Map.Entry next2 : this.f5106c.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((String) next2.getKey());
            sb.append("=");
            sb.append("STREAM");
        }
        for (Map.Entry next3 : this.f5107d.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((String) next3.getKey());
            sb.append("=");
            sb.append("FILE");
        }
        for (BasicNameValuePair next4 : b((String) null, (Object) this.f5108e)) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(next4.getName());
            sb.append("=");
            sb.append(next4.getValue());
        }
        return sb.toString();
    }
}
