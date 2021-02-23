package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
class C0170a {

    /* renamed from: a  reason: collision with root package name */
    static C0170a f1214a = new C0170a();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, C0015a> f1215b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class, Boolean> f1216c = new HashMap();

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    static class C0015a {

        /* renamed from: a  reason: collision with root package name */
        final Map<g.a, List<b>> f1217a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, g.a> f1218b;

        C0015a(Map<b, g.a> map) {
            this.f1218b = map;
            for (Map.Entry next : map.entrySet()) {
                g.a aVar = (g.a) next.getValue();
                List list = this.f1217a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1217a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        private static void a(List<b> list, k kVar, g.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(kVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar, g.a aVar, Object obj) {
            a(this.f1217a.get(aVar), kVar, aVar, obj);
            a(this.f1217a.get(g.a.ON_ANY), kVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f1219a;

        /* renamed from: b  reason: collision with root package name */
        final Method f1220b;

        b(int i, Method method) {
            this.f1219a = i;
            this.f1220b = method;
            this.f1220b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar, g.a aVar, Object obj) {
            try {
                int i = this.f1219a;
                if (i == 0) {
                    this.f1220b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f1220b.invoke(obj, new Object[]{kVar});
                } else if (i == 2) {
                    this.f1220b.invoke(obj, new Object[]{kVar, aVar});
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1219a == bVar.f1219a && this.f1220b.getName().equals(bVar.f1220b.getName());
        }

        public int hashCode() {
            return (this.f1219a * 31) + this.f1220b.getName().hashCode();
        }
    }

    C0170a() {
    }

    private C0015a a(Class cls, Method[] methodArr) {
        int i;
        C0015a a2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a2 = a(superclass)) == null)) {
            hashMap.putAll(a2.f1218b);
        }
        for (Class a3 : cls.getInterfaces()) {
            for (Map.Entry next : a(a3).f1218b.entrySet()) {
                a(hashMap, (b) next.getKey(), (g.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            u uVar = (u) method.getAnnotation(u.class);
            if (uVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(k.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                g.a value = uVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == g.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0015a aVar = new C0015a(hashMap);
        this.f1215b.put(cls, aVar);
        this.f1216c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private void a(Map<b, g.a> map, b bVar, g.a aVar, Class cls) {
        g.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f1220b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public C0015a a(Class cls) {
        C0015a aVar = this.f1215b.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean b(Class cls) {
        Boolean bool = this.f1216c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method annotation : c2) {
            if (((u) annotation.getAnnotation(u.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f1216c.put(cls, false);
        return false;
    }
}
