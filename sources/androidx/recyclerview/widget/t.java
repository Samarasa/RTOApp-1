package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0175a;
import java.util.List;

class t {

    /* renamed from: a  reason: collision with root package name */
    final a f1500a;

    interface a {
        C0175a.b a(int i, int i2, int i3, Object obj);

        void a(C0175a.b bVar);
    }

    t(a aVar) {
        this.f1500a = aVar;
    }

    private void a(List<C0175a.b> list, int i, int i2) {
        C0175a.b bVar = list.get(i);
        C0175a.b bVar2 = list.get(i2);
        int i3 = bVar2.f1415a;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            a(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            b(list, i, bVar, i2, bVar2);
        }
    }

    private int b(List<C0175a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f1415a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<C0175a.b> list, int i, C0175a.b bVar, int i2, C0175a.b bVar2) {
        int i3 = bVar.f1418d < bVar2.f1416b ? -1 : 0;
        if (bVar.f1416b < bVar2.f1416b) {
            i3++;
        }
        int i4 = bVar2.f1416b;
        int i5 = bVar.f1416b;
        if (i4 <= i5) {
            bVar.f1416b = i5 + bVar2.f1418d;
        }
        int i6 = bVar2.f1416b;
        int i7 = bVar.f1418d;
        if (i6 <= i7) {
            bVar.f1418d = i7 + bVar2.f1418d;
        }
        bVar2.f1416b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    public void a(List<C0175a.b> list) {
        while (true) {
            int b2 = b(list);
            if (b2 != -1) {
                a(list, b2, b2 + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        if (r0 > r14.f1416b) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ca, code lost:
        if (r0 >= r14.f1416b) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<androidx.recyclerview.widget.C0175a.b> r10, int r11, androidx.recyclerview.widget.C0175a.b r12, int r13, androidx.recyclerview.widget.C0175a.b r14) {
        /*
            r9 = this;
            int r0 = r12.f1416b
            int r1 = r12.f1418d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x0015
            int r4 = r14.f1416b
            if (r4 != r0) goto L_0x0013
            int r4 = r14.f1418d
            int r1 = r1 - r0
            if (r4 != r1) goto L_0x0013
            r0 = 0
            goto L_0x0021
        L_0x0013:
            r0 = 0
            goto L_0x0024
        L_0x0015:
            int r4 = r14.f1416b
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0023
            int r4 = r14.f1418d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0023
            r0 = 1
        L_0x0021:
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            int r1 = r12.f1418d
            int r4 = r14.f1416b
            r5 = 2
            if (r1 >= r4) goto L_0x002f
            int r4 = r4 - r3
            r14.f1416b = r4
            goto L_0x0048
        L_0x002f:
            int r6 = r14.f1418d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0048
            int r6 = r6 - r3
            r14.f1418d = r6
            r12.f1415a = r5
            r12.f1418d = r3
            int r11 = r14.f1418d
            if (r11 != 0) goto L_0x0047
            r10.remove(r13)
            androidx.recyclerview.widget.t$a r10 = r9.f1500a
            r10.a(r14)
        L_0x0047:
            return
        L_0x0048:
            int r1 = r12.f1416b
            int r4 = r14.f1416b
            r6 = 0
            if (r1 > r4) goto L_0x0053
            int r4 = r4 + r3
            r14.f1416b = r4
            goto L_0x0069
        L_0x0053:
            int r7 = r14.f1418d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0069
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.t$a r7 = r9.f1500a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.a(r5, r1, r4, r6)
            int r1 = r12.f1416b
            int r3 = r14.f1416b
            int r1 = r1 - r3
            r14.f1418d = r1
        L_0x0069:
            if (r2 == 0) goto L_0x0077
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.t$a r10 = r9.f1500a
            r10.a(r12)
            return
        L_0x0077:
            if (r0 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x0091
            int r0 = r12.f1416b
            int r1 = r6.f1416b
            if (r0 <= r1) goto L_0x0086
            int r1 = r6.f1418d
            int r0 = r0 - r1
            r12.f1416b = r0
        L_0x0086:
            int r0 = r12.f1418d
            int r1 = r6.f1416b
            if (r0 <= r1) goto L_0x0091
            int r1 = r6.f1418d
            int r0 = r0 - r1
            r12.f1418d = r0
        L_0x0091:
            int r0 = r12.f1416b
            int r1 = r14.f1416b
            if (r0 <= r1) goto L_0x009c
            int r1 = r14.f1418d
            int r0 = r0 - r1
            r12.f1416b = r0
        L_0x009c:
            int r0 = r12.f1418d
            int r1 = r14.f1416b
            if (r0 <= r1) goto L_0x00d1
            goto L_0x00cc
        L_0x00a3:
            if (r6 == 0) goto L_0x00bb
            int r0 = r12.f1416b
            int r1 = r6.f1416b
            if (r0 < r1) goto L_0x00b0
            int r1 = r6.f1418d
            int r0 = r0 - r1
            r12.f1416b = r0
        L_0x00b0:
            int r0 = r12.f1418d
            int r1 = r6.f1416b
            if (r0 < r1) goto L_0x00bb
            int r1 = r6.f1418d
            int r0 = r0 - r1
            r12.f1418d = r0
        L_0x00bb:
            int r0 = r12.f1416b
            int r1 = r14.f1416b
            if (r0 < r1) goto L_0x00c6
            int r1 = r14.f1418d
            int r0 = r0 - r1
            r12.f1416b = r0
        L_0x00c6:
            int r0 = r12.f1418d
            int r1 = r14.f1416b
            if (r0 < r1) goto L_0x00d1
        L_0x00cc:
            int r1 = r14.f1418d
            int r0 = r0 - r1
            r12.f1418d = r0
        L_0x00d1:
            r10.set(r11, r14)
            int r14 = r12.f1416b
            int r0 = r12.f1418d
            if (r14 == r0) goto L_0x00de
            r10.set(r13, r12)
            goto L_0x00e1
        L_0x00de:
            r10.remove(r13)
        L_0x00e1:
            if (r6 == 0) goto L_0x00e6
            r10.add(r11, r6)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.t.a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.List<androidx.recyclerview.widget.C0175a.b> r9, int r10, androidx.recyclerview.widget.C0175a.b r11, int r12, androidx.recyclerview.widget.C0175a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f1418d
            int r1 = r13.f1416b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f1416b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f1418d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f1418d = r5
            androidx.recyclerview.widget.t$a r0 = r8.f1500a
            int r1 = r11.f1416b
            java.lang.Object r5 = r13.f1417c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f1416b
            int r5 = r13.f1416b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f1416b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f1418d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.t$a r3 = r8.f1500a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f1417c
            androidx.recyclerview.widget.a$b r3 = r3.a(r2, r1, r5, r4)
            int r1 = r13.f1418d
            int r1 = r1 - r5
            r13.f1418d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f1418d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.t$a r11 = r8.f1500a
            r11.a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.t.b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}