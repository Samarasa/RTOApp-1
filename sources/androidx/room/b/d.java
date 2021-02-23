package androidx.room.b;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f1521a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f1522b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f1523c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<C0018d> f1524d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f1525a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1526b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1527c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1528d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1529e;

        public a(String str, String str2, boolean z, int i) {
            this.f1525a = str;
            this.f1526b = str2;
            this.f1528d = z;
            this.f1529e = i;
            this.f1527c = a(str2);
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean a() {
            return this.f1529e > 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f1529e != aVar.f1529e) {
                    return false;
                }
            } else if (a() != aVar.a()) {
                return false;
            }
            return this.f1525a.equals(aVar.f1525a) && this.f1528d == aVar.f1528d && this.f1527c == aVar.f1527c;
        }

        public int hashCode() {
            return (((((this.f1525a.hashCode() * 31) + this.f1527c) * 31) + (this.f1528d ? 1231 : 1237)) * 31) + this.f1529e;
        }

        public String toString() {
            return "Column{name='" + this.f1525a + '\'' + ", type='" + this.f1526b + '\'' + ", affinity='" + this.f1527c + '\'' + ", notNull=" + this.f1528d + ", primaryKeyPosition=" + this.f1529e + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f1530a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1531b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1532c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f1533d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f1534e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f1530a = str;
            this.f1531b = str2;
            this.f1532c = str3;
            this.f1533d = Collections.unmodifiableList(list);
            this.f1534e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f1530a.equals(bVar.f1530a) && this.f1531b.equals(bVar.f1531b) && this.f1532c.equals(bVar.f1532c) && this.f1533d.equals(bVar.f1533d)) {
                return this.f1534e.equals(bVar.f1534e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f1530a.hashCode() * 31) + this.f1531b.hashCode()) * 31) + this.f1532c.hashCode()) * 31) + this.f1533d.hashCode()) * 31) + this.f1534e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f1530a + '\'' + ", onDelete='" + this.f1531b + '\'' + ", onUpdate='" + this.f1532c + '\'' + ", columnNames=" + this.f1533d + ", referenceColumnNames=" + this.f1534e + '}';
        }
    }

    static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        final int f1535a;

        /* renamed from: b  reason: collision with root package name */
        final int f1536b;

        /* renamed from: c  reason: collision with root package name */
        final String f1537c;

        /* renamed from: d  reason: collision with root package name */
        final String f1538d;

        c(int i, int i2, String str, String str2) {
            this.f1535a = i;
            this.f1536b = i2;
            this.f1537c = str;
            this.f1538d = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i = this.f1535a - cVar.f1535a;
            return i == 0 ? this.f1536b - cVar.f1536b : i;
        }
    }

    /* renamed from: androidx.room.b.d$d  reason: collision with other inner class name */
    public static class C0018d {

        /* renamed from: a  reason: collision with root package name */
        public final String f1539a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1540b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f1541c;

        public C0018d(String str, boolean z, List<String> list) {
            this.f1539a = str;
            this.f1540b = z;
            this.f1541c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0018d.class != obj.getClass()) {
                return false;
            }
            C0018d dVar = (C0018d) obj;
            if (this.f1540b == dVar.f1540b && this.f1541c.equals(dVar.f1541c)) {
                return this.f1539a.startsWith("index_") ? dVar.f1539a.startsWith("index_") : this.f1539a.equals(dVar.f1539a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f1539a.startsWith("index_") ? "index_".hashCode() : this.f1539a.hashCode()) * 31) + (this.f1540b ? 1 : 0)) * 31) + this.f1541c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f1539a + '\'' + ", unique=" + this.f1540b + ", columns=" + this.f1541c + '}';
        }
    }

    public d(String str, Map<String, a> map, Set<b> set, Set<C0018d> set2) {
        this.f1521a = str;
        this.f1522b = Collections.unmodifiableMap(map);
        this.f1523c = Collections.unmodifiableSet(set);
        this.f1524d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    private static C0018d a(b.p.a.b bVar, String str, boolean z) {
        Cursor d2 = bVar.d("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = d2.getColumnIndex("seqno");
            int columnIndex2 = d2.getColumnIndex("cid");
            int columnIndex3 = d2.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (d2.moveToNext()) {
                        if (d2.getInt(columnIndex2) >= 0) {
                            int i = d2.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), d2.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0018d dVar = new C0018d(str, z, arrayList);
                    d2.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            d2.close();
        }
    }

    public static d a(b.p.a.b bVar, String str) {
        return new d(str, b(bVar, str), c(bVar, str), d(bVar, str));
    }

    private static List<c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Map<String, a> b(b.p.a.b bVar, String str) {
        Cursor d2 = bVar.d("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (d2.getColumnCount() > 0) {
                int columnIndex = d2.getColumnIndex("name");
                int columnIndex2 = d2.getColumnIndex("type");
                int columnIndex3 = d2.getColumnIndex("notnull");
                int columnIndex4 = d2.getColumnIndex("pk");
                while (d2.moveToNext()) {
                    String string = d2.getString(columnIndex);
                    hashMap.put(string, new a(string, d2.getString(columnIndex2), d2.getInt(columnIndex3) != 0, d2.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            d2.close();
        }
    }

    private static Set<b> c(b.p.a.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor d2 = bVar.d("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = d2.getColumnIndex("id");
            int columnIndex2 = d2.getColumnIndex("seq");
            int columnIndex3 = d2.getColumnIndex("table");
            int columnIndex4 = d2.getColumnIndex("on_delete");
            int columnIndex5 = d2.getColumnIndex("on_update");
            List<c> a2 = a(d2);
            int count = d2.getCount();
            for (int i = 0; i < count; i++) {
                d2.moveToPosition(i);
                if (d2.getInt(columnIndex2) == 0) {
                    int i2 = d2.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c next : a2) {
                        if (next.f1535a == i2) {
                            arrayList.add(next.f1537c);
                            arrayList2.add(next.f1538d);
                        }
                    }
                    hashSet.add(new b(d2.getString(columnIndex3), d2.getString(columnIndex4), d2.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            d2.close();
        }
    }

    private static Set<C0018d> d(b.p.a.b bVar, String str) {
        Cursor d2 = bVar.d("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = d2.getColumnIndex("name");
            int columnIndex2 = d2.getColumnIndex("origin");
            int columnIndex3 = d2.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (d2.moveToNext()) {
                        if ("c".equals(d2.getString(columnIndex2))) {
                            String string = d2.getString(columnIndex);
                            boolean z = true;
                            if (d2.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0018d a2 = a(bVar, string, z);
                            if (a2 == null) {
                                d2.close();
                                return null;
                            }
                            hashSet.add(a2);
                        }
                    }
                    d2.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            d2.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C0018d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f1521a;
        if (str == null ? dVar.f1521a != null : !str.equals(dVar.f1521a)) {
            return false;
        }
        Map<String, a> map = this.f1522b;
        if (map == null ? dVar.f1522b != null : !map.equals(dVar.f1522b)) {
            return false;
        }
        Set<b> set2 = this.f1523c;
        if (set2 == null ? dVar.f1523c != null : !set2.equals(dVar.f1523c)) {
            return false;
        }
        Set<C0018d> set3 = this.f1524d;
        if (set3 == null || (set = dVar.f1524d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f1521a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f1522b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f1523c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f1521a + '\'' + ", columns=" + this.f1522b + ", foreignKeys=" + this.f1523c + ", indices=" + this.f1524d + '}';
    }
}
