package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C;
import androidx.fragment.app.C0158h;
import androidx.fragment.app.C0164n;
import androidx.fragment.app.v;
import b.h.i.b;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
final class C0151a extends C implements C0164n.a, v.e {
    final v s;
    boolean t;
    int u = -1;

    public C0151a(v vVar) {
        this.s = vVar;
    }

    private static boolean b(C.a aVar) {
        C0158h hVar = aVar.f1028b;
        return hVar != null && hVar.k && hVar.G != null && !hVar.z && !hVar.y && hVar.E();
    }

    public int a() {
        return a(false);
    }

    /* access modifiers changed from: package-private */
    public int a(boolean z) {
        if (!this.t) {
            if (v.f1148c) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b("FragmentManager"));
                a("  ", printWriter);
                printWriter.close();
            }
            this.t = true;
            this.u = this.f1026h ? this.s.b(this) : -1;
            this.s.a((v.e) this, z);
            return this.u;
        }
        throw new IllegalStateException("commit already called");
    }

    public C a(C0158h hVar) {
        v vVar = hVar.r;
        if (vVar == null || vVar == this.s) {
            super.a(hVar);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + hVar.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public C0158h a(ArrayList<C0158h> arrayList, C0158h hVar) {
        ArrayList<C0158h> arrayList2 = arrayList;
        C0158h hVar2 = hVar;
        int i = 0;
        while (i < this.f1019a.size()) {
            C.a aVar = this.f1019a.get(i);
            int i2 = aVar.f1027a;
            if (i2 != 1) {
                if (i2 == 2) {
                    C0158h hVar3 = aVar.f1028b;
                    int i3 = hVar3.w;
                    C0158h hVar4 = hVar2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0158h hVar5 = arrayList2.get(size);
                        if (hVar5.w == i3) {
                            if (hVar5 == hVar3) {
                                z = true;
                            } else {
                                if (hVar5 == hVar4) {
                                    this.f1019a.add(i4, new C.a(9, hVar5));
                                    i4++;
                                    hVar4 = null;
                                }
                                C.a aVar2 = new C.a(3, hVar5);
                                aVar2.f1029c = aVar.f1029c;
                                aVar2.f1031e = aVar.f1031e;
                                aVar2.f1030d = aVar.f1030d;
                                aVar2.f1032f = aVar.f1032f;
                                this.f1019a.add(i4, aVar2);
                                arrayList2.remove(hVar5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f1019a.remove(i4);
                        i4--;
                    } else {
                        aVar.f1027a = 1;
                        arrayList2.add(hVar3);
                    }
                    i = i4;
                    hVar2 = hVar4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f1028b);
                    C0158h hVar6 = aVar.f1028b;
                    if (hVar6 == hVar2) {
                        this.f1019a.add(i, new C.a(9, hVar6));
                        i++;
                        hVar2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f1019a.add(i, new C.a(9, hVar2));
                        i++;
                        hVar2 = aVar.f1028b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f1028b);
            i++;
        }
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        if (this.f1026h) {
            if (v.f1148c) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1019a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C.a aVar = this.f1019a.get(i2);
                C0158h hVar = aVar.f1028b;
                if (hVar != null) {
                    hVar.q += i;
                    if (v.f1148c) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1028b + " to " + aVar.f1028b.q);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i, C0158h hVar, String str, int i2) {
        super.a(i, hVar, str, i2);
        hVar.r = this.s;
    }

    /* access modifiers changed from: package-private */
    public void a(C0158h.c cVar) {
        for (int i = 0; i < this.f1019a.size(); i++) {
            C.a aVar = this.f1019a.get(i);
            if (b(aVar)) {
                aVar.f1028b.a(cVar);
            }
        }
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.t);
            if (this.f1024f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1024f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1025g));
            }
            if (!(this.f1020b == 0 && this.f1021c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1020b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1021c));
            }
            if (!(this.f1022d == 0 && this.f1023e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1022d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1023e));
            }
            if (!(this.k == 0 && this.l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.l);
            }
            if (!(this.m == 0 && this.n == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.n);
            }
        }
        if (!this.f1019a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1019a.size();
            for (int i = 0; i < size; i++) {
                C.a aVar = this.f1019a.get(i);
                switch (aVar.f1027a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1027a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1028b);
                if (z) {
                    if (!(aVar.f1029c == 0 && aVar.f1030d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1029c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1030d));
                    }
                    if (aVar.f1031e != 0 || aVar.f1032f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1031e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1032f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<C0151a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1019a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0158h hVar = this.f1019a.get(i4).f1028b;
            int i5 = hVar != null ? hVar.w : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0151a aVar = arrayList.get(i6);
                    int size2 = aVar.f1019a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0158h hVar2 = aVar.f1019a.get(i7).f1028b;
                        if ((hVar2 != null ? hVar2.w : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public boolean a(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2) {
        if (v.f1148c) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1026h) {
            return true;
        }
        this.s.a(this);
        return true;
    }

    public int b() {
        return a(true);
    }

    /* access modifiers changed from: package-private */
    public C0158h b(ArrayList<C0158h> arrayList, C0158h hVar) {
        for (int size = this.f1019a.size() - 1; size >= 0; size--) {
            C.a aVar = this.f1019a.get(size);
            int i = aVar.f1027a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            hVar = null;
                            break;
                        case 9:
                            hVar = aVar.f1028b;
                            break;
                        case 10:
                            aVar.f1034h = aVar.f1033g;
                            break;
                    }
                }
                arrayList.add(aVar.f1028b);
            }
            arrayList.remove(aVar.f1028b);
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        for (int size = this.f1019a.size() - 1; size >= 0; size--) {
            C.a aVar = this.f1019a.get(size);
            C0158h hVar = aVar.f1028b;
            if (hVar != null) {
                hVar.a(v.d(this.f1024f), this.f1025g);
            }
            switch (aVar.f1027a) {
                case 1:
                    hVar.a(aVar.f1032f);
                    this.s.n(hVar);
                    break;
                case 3:
                    hVar.a(aVar.f1031e);
                    this.s.a(hVar, false);
                    break;
                case 4:
                    hVar.a(aVar.f1031e);
                    this.s.s(hVar);
                    break;
                case 5:
                    hVar.a(aVar.f1032f);
                    this.s.h(hVar);
                    break;
                case 6:
                    hVar.a(aVar.f1031e);
                    this.s.b(hVar);
                    break;
                case 7:
                    hVar.a(aVar.f1032f);
                    this.s.d(hVar);
                    break;
                case 8:
                    this.s.r((C0158h) null);
                    break;
                case 9:
                    this.s.r(hVar);
                    break;
                case 10:
                    this.s.a(hVar, aVar.f1033g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1027a);
            }
            if (!(this.q || aVar.f1027a == 3 || hVar == null)) {
                this.s.k(hVar);
            }
        }
        if (!this.q && z) {
            v vVar = this.s;
            vVar.a(vVar.s, true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i) {
        int size = this.f1019a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0158h hVar = this.f1019a.get(i2).f1028b;
            int i3 = hVar != null ? hVar.w : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int size = this.f1019a.size();
        for (int i = 0; i < size; i++) {
            C.a aVar = this.f1019a.get(i);
            C0158h hVar = aVar.f1028b;
            if (hVar != null) {
                hVar.a(this.f1024f, this.f1025g);
            }
            switch (aVar.f1027a) {
                case 1:
                    hVar.a(aVar.f1029c);
                    this.s.a(hVar, false);
                    break;
                case 3:
                    hVar.a(aVar.f1030d);
                    this.s.n(hVar);
                    break;
                case 4:
                    hVar.a(aVar.f1030d);
                    this.s.h(hVar);
                    break;
                case 5:
                    hVar.a(aVar.f1029c);
                    this.s.s(hVar);
                    break;
                case 6:
                    hVar.a(aVar.f1030d);
                    this.s.d(hVar);
                    break;
                case 7:
                    hVar.a(aVar.f1029c);
                    this.s.b(hVar);
                    break;
                case 8:
                    this.s.r(hVar);
                    break;
                case 9:
                    this.s.r((C0158h) null);
                    break;
                case 10:
                    this.s.a(hVar, aVar.f1034h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1027a);
            }
            if (!(this.q || aVar.f1027a == 1 || hVar == null)) {
                this.s.k(hVar);
            }
        }
        if (!this.q) {
            v vVar = this.s;
            vVar.a(vVar.s, true);
        }
    }

    public String d() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        for (int i = 0; i < this.f1019a.size(); i++) {
            if (b(this.f1019a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                this.r.get(i).run();
            }
            this.r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.u >= 0) {
            sb.append(" #");
            sb.append(this.u);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }
}
