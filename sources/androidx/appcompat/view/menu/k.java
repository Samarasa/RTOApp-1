package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import b.h.j.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class k implements b.h.c.a.a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f337a = {1, 4, 5, 3, 2, 0};
    private boolean A;

    /* renamed from: b  reason: collision with root package name */
    private final Context f338b;

    /* renamed from: c  reason: collision with root package name */
    private final Resources f339c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f340d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f341e;

    /* renamed from: f  reason: collision with root package name */
    private a f342f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<o> f343g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<o> f344h;
    private boolean i;
    private ArrayList<o> j;
    private ArrayList<o> k;
    private boolean l;
    private int m = 0;
    private ContextMenu.ContextMenuInfo n;
    CharSequence o;
    Drawable p;
    View q;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private ArrayList<o> w = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<t>> x = new CopyOnWriteArrayList<>();
    private o y;
    private boolean z = false;

    public interface a {
        void a(k kVar);

        boolean a(k kVar, MenuItem menuItem);
    }

    public interface b {
        boolean a(o oVar);
    }

    public k(Context context) {
        this.f338b = context;
        this.f339c = context.getResources();
        this.f343g = new ArrayList<>();
        this.f344h = new ArrayList<>();
        this.i = true;
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.l = true;
        e(true);
    }

    private static int a(ArrayList<o> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).c() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    private o a(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new o(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources l2 = l();
        if (view != null) {
            this.q = view;
            this.o = null;
            this.p = null;
        } else {
            if (i2 > 0) {
                this.o = l2.getText(i2);
            } else if (charSequence != null) {
                this.o = charSequence;
            }
            if (i3 > 0) {
                this.p = b.h.a.a.c(e(), i3);
            } else if (drawable != null) {
                this.p = drawable;
            }
            this.q = null;
        }
        b(false);
    }

    private void a(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f343g.size()) {
            this.f343g.remove(i2);
            if (z2) {
                b(true);
            }
        }
    }

    private boolean a(A a2, t tVar) {
        boolean z2 = false;
        if (this.x.isEmpty()) {
            return false;
        }
        if (tVar != null) {
            z2 = tVar.a(a2);
        }
        Iterator<WeakReference<t>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            t tVar2 = (t) next.get();
            if (tVar2 == null) {
                this.x.remove(next);
            } else if (!z2) {
                z2 = tVar2.a(a2);
            }
        }
        return z2;
    }

    private void d(boolean z2) {
        if (!this.x.isEmpty()) {
            s();
            Iterator<WeakReference<t>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                t tVar = (t) next.get();
                if (tVar == null) {
                    this.x.remove(next);
                } else {
                    tVar.a(z2);
                }
            }
            r();
        }
    }

    private void e(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.x.isEmpty()) {
            Iterator<WeakReference<t>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                t tVar = (t) next.get();
                if (tVar == null) {
                    this.x.remove(next);
                } else {
                    int id = tVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        tVar.a(parcelable);
                    }
                }
            }
        }
    }

    private void e(boolean z2) {
        boolean z3 = true;
        if (!z2 || this.f339c.getConfiguration().keyboard == 1 || !z.c(ViewConfiguration.get(this.f338b), this.f338b)) {
            z3 = false;
        }
        this.f341e = z3;
    }

    private static int f(int i2) {
        int i3 = (-65536 & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f337a;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void f(Bundle bundle) {
        Parcelable b2;
        if (!this.x.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<t>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                t tVar = (t) next.get();
                if (tVar == null) {
                    this.x.remove(next);
                } else {
                    int id = tVar.getId();
                    if (id > 0 && (b2 = tVar.b()) != null) {
                        sparseArray.put(id, b2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public int a(int i2) {
        return a(i2, 0);
    }

    public int a(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f343g.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int f2 = f(i4);
        o a2 = a(i2, i3, i4, f2, charSequence, this.m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.n;
        if (contextMenuInfo != null) {
            a2.a(contextMenuInfo);
        }
        ArrayList<o> arrayList = this.f343g;
        arrayList.add(a(arrayList, f2), a2);
        b(true);
        return a2;
    }

    /* access modifiers changed from: protected */
    public k a(Drawable drawable) {
        a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public k a(View view) {
        a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    public k a(CharSequence charSequence) {
        a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    public o a(int i2, KeyEvent keyEvent) {
        ArrayList<o> arrayList = this.w;
        arrayList.clear();
        a((List<o>) arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean p2 = p();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = arrayList.get(i3);
            char alphabeticShortcut = p2 ? oVar.getAlphabeticShortcut() : oVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p2 && alphabeticShortcut == 8 && i2 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    public void a() {
        a aVar = this.f342f;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((A) item.getSubMenu()).a(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f343g.size();
        s();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f343g.get(i2);
            if (oVar.getGroupId() == groupId && oVar.i() && oVar.isCheckable()) {
                oVar.b(oVar == menuItem);
            }
        }
        r();
    }

    public void a(a aVar) {
        this.f342f = aVar;
    }

    public void a(t tVar) {
        a(tVar, this.f338b);
    }

    public void a(t tVar, Context context) {
        this.x.add(new WeakReference(tVar));
        tVar.a(context, this);
        this.l = true;
    }

    /* access modifiers changed from: package-private */
    public void a(List<o> list, int i2, KeyEvent keyEvent) {
        boolean p2 = p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f343g.size();
            for (int i3 = 0; i3 < size; i3++) {
                o oVar = this.f343g.get(i3);
                if (oVar.hasSubMenu()) {
                    ((k) oVar.getSubMenu()).a(list, i2, keyEvent);
                }
                char alphabeticShortcut = p2 ? oVar.getAlphabeticShortcut() : oVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p2 ? oVar.getAlphabeticModifiers() : oVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p2 && alphabeticShortcut == 8 && i2 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    public final void a(boolean z2) {
        if (!this.v) {
            this.v = true;
            Iterator<WeakReference<t>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                t tVar = (t) next.get();
                if (tVar == null) {
                    this.x.remove(next);
                } else {
                    tVar.a(this, z2);
                }
            }
            this.v = false;
        }
    }

    public boolean a(MenuItem menuItem, int i2) {
        return a(menuItem, (t) null, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MenuItem r7, androidx.appcompat.view.menu.t r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.o r7 = (androidx.appcompat.view.menu.o) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.g()
            b.h.j.b r2 = r7.a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.a((boolean) r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.a((boolean) r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.A r9 = new androidx.appcompat.view.menu.A
            android.content.Context r0 = r6.e()
            r9.<init>(r0, r6, r7)
            r7.a((androidx.appcompat.view.menu.A) r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.A r7 = (androidx.appcompat.view.menu.A) r7
            if (r4 == 0) goto L_0x0063
            r2.a((android.view.SubMenu) r7)
        L_0x0063:
            boolean r7 = r6.a((androidx.appcompat.view.menu.A) r7, (androidx.appcompat.view.menu.t) r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.a(android.view.MenuItem, androidx.appcompat.view.menu.t, int):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean a(k kVar, MenuItem menuItem) {
        a aVar = this.f342f;
        return aVar != null && aVar.a(kVar, menuItem);
    }

    public boolean a(o oVar) {
        boolean z2 = false;
        if (!this.x.isEmpty() && this.y == oVar) {
            s();
            Iterator<WeakReference<t>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                t tVar = (t) next.get();
                if (tVar == null) {
                    this.x.remove(next);
                } else {
                    z2 = tVar.a(this, oVar);
                    if (z2) {
                        break;
                    }
                }
            }
            r();
            if (z2) {
                this.y = null;
            }
        }
        return z2;
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f339c.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f339c.getString(i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f338b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f339c.getString(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.f339c.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        o oVar = (o) a(i2, i3, i4, charSequence);
        A a2 = new A(this.f338b, this, oVar);
        oVar.a(a2);
        return a2;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public int b(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f343g.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public void b() {
        ArrayList<o> n2 = n();
        if (this.l) {
            Iterator<WeakReference<t>> it = this.x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                t tVar = (t) next.get();
                if (tVar == null) {
                    this.x.remove(next);
                } else {
                    z2 |= tVar.a();
                }
            }
            if (z2) {
                this.j.clear();
                this.k.clear();
                int size = n2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o oVar = n2.get(i2);
                    (oVar.h() ? this.j : this.k).add(oVar);
                }
            } else {
                this.j.clear();
                this.k.clear();
                this.k.addAll(n());
            }
            this.l = false;
        }
    }

    public void b(Bundle bundle) {
        e(bundle);
    }

    public void b(t tVar) {
        Iterator<WeakReference<t>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            t tVar2 = (t) next.get();
            if (tVar2 == null || tVar2 == tVar) {
                this.x.remove(next);
            }
        }
    }

    public void b(boolean z2) {
        if (!this.r) {
            if (z2) {
                this.i = true;
                this.l = true;
            }
            d(z2);
            return;
        }
        this.s = true;
        if (z2) {
            this.t = true;
        }
    }

    public boolean b(o oVar) {
        boolean z2 = false;
        if (this.x.isEmpty()) {
            return false;
        }
        s();
        Iterator<WeakReference<t>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            t tVar = (t) next.get();
            if (tVar == null) {
                this.x.remove(next);
            } else {
                z2 = tVar.b(this, oVar);
                if (z2) {
                    break;
                }
            }
        }
        r();
        if (z2) {
            this.y = oVar;
        }
        return z2;
    }

    public k c(int i2) {
        this.m = i2;
        return this;
    }

    public ArrayList<o> c() {
        b();
        return this.j;
    }

    public void c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((A) item.getSubMenu()).c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(o oVar) {
        this.l = true;
        b(true);
    }

    public void c(boolean z2) {
        this.A = z2;
    }

    public void clear() {
        o oVar = this.y;
        if (oVar != null) {
            a(oVar);
        }
        this.f343g.clear();
        b(true);
    }

    public void clearHeader() {
        this.p = null;
        this.o = null;
        this.q = null;
        b(false);
    }

    public void close() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public k d(int i2) {
        a(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "android:menu:actionviewstates";
    }

    public void d(Bundle bundle) {
        f(bundle);
    }

    /* access modifiers changed from: package-private */
    public void d(o oVar) {
        this.i = true;
        b(true);
    }

    public Context e() {
        return this.f338b;
    }

    /* access modifiers changed from: protected */
    public k e(int i2) {
        a(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public o f() {
        return this.y;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = this.f343g.get(i3);
            if (oVar.getItemId() == i2) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public Drawable g() {
        return this.p;
    }

    public MenuItem getItem(int i2) {
        return this.f343g.get(i2);
    }

    public CharSequence h() {
        return this.o;
    }

    public boolean hasVisibleItems() {
        if (this.A) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f343g.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public View i() {
        return this.q;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public ArrayList<o> j() {
        b();
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public Resources l() {
        return this.f339c;
    }

    public k m() {
        return this;
    }

    public ArrayList<o> n() {
        if (!this.i) {
            return this.f344h;
        }
        this.f344h.clear();
        int size = this.f343g.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = this.f343g.get(i2);
            if (oVar.isVisible()) {
                this.f344h.add(oVar);
            }
        }
        this.i = false;
        this.l = true;
        return this.f344h;
    }

    public boolean o() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f340d;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        o a2 = a(i2, keyEvent);
        boolean a3 = a2 != null ? a((MenuItem) a2, i3) : false;
        if ((i3 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    public boolean q() {
        return this.f341e;
    }

    public void r() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(this.t);
        }
    }

    public void removeGroup(int i2) {
        int a2 = a(i2);
        if (a2 >= 0) {
            int size = this.f343g.size() - a2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f343g.get(a2).getGroupId() != i2) {
                    b(true);
                } else {
                    a(a2, false);
                    i3 = i4;
                }
            }
            b(true);
        }
    }

    public void removeItem(int i2) {
        a(b(i2), true);
    }

    public void s() {
        if (!this.r) {
            this.r = true;
            this.s = false;
            this.t = false;
        }
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f343g.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = this.f343g.get(i3);
            if (oVar.getGroupId() == i2) {
                oVar.c(z3);
                oVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.z = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f343g.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = this.f343g.get(i3);
            if (oVar.getGroupId() == i2) {
                oVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f343g.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = this.f343g.get(i3);
            if (oVar.getGroupId() == i2 && oVar.e(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            b(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f340d = z2;
        b(false);
    }

    public int size() {
        return this.f343g.size();
    }
}
