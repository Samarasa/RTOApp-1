package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.util.T;
import com.google.android.gms.internal.ads.C1004Qw;
import com.google.android.gms.internal.ads.C1616eu;
import com.google.android.gms.internal.ads.LL;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tL  reason: case insensitive filesystem */
public final class C2626tL extends C2094lk {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f12176a = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f12177b = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f12178c = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f12179d = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: e  reason: collision with root package name */
    private C0710Fo f12180e;

    /* renamed from: f  reason: collision with root package name */
    private Context f12181f;

    /* renamed from: g  reason: collision with root package name */
    private Qba f12182g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C1200Yk f12183h;
    private C1855iT<VB> i;
    private final PY j;
    private final ScheduledExecutorService k;
    private C1015Rh l;
    private Point m = new Point();
    private Point n = new Point();

    public C2626tL(C0710Fo fo, Context context, Qba qba, C1200Yk yk, C1855iT<VB> iTVar, PY py, ScheduledExecutorService scheduledExecutorService) {
        this.f12180e = fo;
        this.f12181f = context;
        this.f12182g = qba;
        this.f12183h = yk;
        this.i = iTVar;
        this.j = py;
        this.k = scheduledExecutorService;
    }

    private final LY<String> D(String str) {
        VB[] vbArr = new VB[1];
        LY<O> a2 = DY.a(this.i.a(), new FL(this, vbArr, str), (Executor) this.j);
        a2.a(new EL(this, vbArr), this.j);
        return C2710uY.c(a2).a((long) ((Integer) Qqa.e().a(F.ef)).intValue(), TimeUnit.MILLISECONDS, this.k).a(DL.f6530a, (Executor) this.j).a(Exception.class, CL.f6411a, (Executor) this.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f8503b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean Zb() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.Rh r0 = r1.l
            if (r0 == 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r0 = r0.f8503b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2626tL.Zb():boolean");
    }

    static /* synthetic */ Uri a(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? a(uri, "nas", str) : uri;
    }

    private static Uri a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i2 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i2) + str + "=" + str2 + "&" + uri2.substring(i2));
    }

    static /* synthetic */ ArrayList a(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (b(uri) && !TextUtils.isEmpty(str)) {
                uri = a(uri, "nas", str);
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    private static boolean a(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String contains : list) {
                if (path.contains(contains)) {
                    for (String endsWith : list2) {
                        if (host.endsWith(endsWith)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Uri a(Uri uri, a aVar) {
        try {
            uri = this.f12182g.a(uri, this.f12181f, (View) b.Q(aVar), (Activity) null);
        } catch (C2506rda e2) {
            C1018Rk.c(BuildConfig.FLAVOR, e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean b(Uri uri) {
        return a(uri, f12178c, f12179d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(Uri uri) {
        return DY.a(D("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new AL(this, uri), (Executor) this.j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(ArrayList arrayList) {
        return DY.a(D("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new BL(this, arrayList), (Executor) this.j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(VB[] vbArr, String str, VB vb) {
        vbArr[0] = vb;
        Context context = this.f12181f;
        C1015Rh rh = this.l;
        Map<String, WeakReference<View>> map = rh.f8503b;
        JSONObject a2 = T.a(context, map, map, rh.f8502a);
        JSONObject a3 = T.a(this.f12181f, this.l.f8502a);
        JSONObject a4 = T.a(this.l.f8502a);
        JSONObject b2 = T.b(this.f12181f, this.l.f8502a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", a2);
        jSONObject.put("ad_view_signal", a3);
        jSONObject.put("scroll_view_signal", a4);
        jSONObject.put("lock_screen_signal", b2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", T.a((String) null, this.f12181f, this.n, this.m));
        }
        return vb.a(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList a(List list, a aVar) {
        String a2 = this.f12182g.a() != null ? this.f12182g.a().a(this.f12181f, (View) b.Q(aVar), (Activity) null) : BuildConfig.FLAVOR;
        if (!TextUtils.isEmpty(a2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!b(uri)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    C1018Rk.d(sb.toString());
                } else {
                    uri = a(uri, "ms", a2);
                }
                arrayList.add(uri);
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    public final void a(a aVar, C2165mk mkVar, C1881ik ikVar) {
        this.f12181f = (Context) b.Q(aVar);
        Context context = this.f12181f;
        String str = mkVar.f11353a;
        String str2 = mkVar.f11354b;
        C2462qqa qqa = mkVar.f11355c;
        C2249nqa nqa = mkVar.f11356d;
        C2697uL q = this.f12180e.q();
        C1616eu.a aVar2 = new C1616eu.a();
        aVar2.a(context);
        US us = new US();
        if (str == null) {
            str = "adUnitId";
        }
        us.a(str);
        if (nqa == null) {
            nqa = new C2178mqa().a();
        }
        us.a(nqa);
        if (qqa == null) {
            qqa = new C2462qqa();
        }
        us.a(qqa);
        aVar2.a(us.d());
        q.a(aVar2.a());
        LL.a aVar3 = new LL.a();
        aVar3.a(str2);
        q.a(new LL(aVar3));
        q.a(new C1004Qw.a().a());
        DY.a(q.a().a(), new HL(this, ikVar), this.f12180e.a());
    }

    public final void a(C1015Rh rh) {
        this.l = rh;
        this.i.a(1);
    }

    public final void a(List<Uri> list, a aVar, C0885Mh mh) {
        if (!((Boolean) Qqa.e().a(F.df)).booleanValue()) {
            try {
                mh.i("The updating URL feature is not enabled.");
            } catch (RemoteException e2) {
                C1018Rk.b(BuildConfig.FLAVOR, e2);
            }
        } else {
            LY a2 = this.j.a(new C2910xL(this, list, aVar));
            if (Zb()) {
                a2 = DY.a(a2, new C2768vL(this), (Executor) this.j);
            } else {
                C1018Rk.c("Asset view map is empty.");
            }
            DY.a(a2, new GL(this, mh), this.f12180e.a());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(VB[] vbArr) {
        if (vbArr[0] != null) {
            this.i.a(DY.a(vbArr[0]));
        }
    }

    public final void b(List<Uri> list, a aVar, C0885Mh mh) {
        try {
            if (!((Boolean) Qqa.e().a(F.df)).booleanValue()) {
                mh.i("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                mh.i("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!a(uri, f12176a, f12177b)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    C1018Rk.d(sb.toString());
                    mh.b(list);
                    return;
                }
                LY a2 = this.j.a(new C3052zL(this, uri, aVar));
                if (Zb()) {
                    a2 = DY.a(a2, new C2981yL(this), (Executor) this.j);
                } else {
                    C1018Rk.c("Asset view map is empty.");
                }
                DY.a(a2, new JL(this, mh), this.f12180e.a());
            }
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final a c(a aVar, a aVar2) {
        return null;
    }

    public final a f(a aVar) {
        return null;
    }

    public final void s(a aVar) {
        if (((Boolean) Qqa.e().a(F.df)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) b.Q(aVar);
            C1015Rh rh = this.l;
            this.m = T.a(motionEvent, rh == null ? null : rh.f8502a);
            if (motionEvent.getAction() == 0) {
                this.n = this.m;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.m;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f12182g.a(obtain);
            obtain.recycle();
        }
    }
}
