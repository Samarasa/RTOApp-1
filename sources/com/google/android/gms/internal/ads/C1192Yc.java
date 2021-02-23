package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.H;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.internal.ads.C0839Kn;
import com.google.android.gms.internal.ads.C0995Qn;
import com.google.android.gms.internal.ads.C1021Rn;
import com.google.android.gms.internal.ads.C1125Vn;
import com.google.android.gms.internal.ads.C1255_n;
import com.google.android.gms.internal.ads.C1394bo;
import com.google.android.gms.internal.ads.C1534dn;
import com.google.android.gms.internal.ads.C1540dqa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* renamed from: com.google.android.gms.internal.ads.Yc  reason: case insensitive filesystem */
public final class C1192Yc<T extends C1540dqa & C1534dn & C0839Kn & C1021Rn & C0995Qn & C1125Vn & C1255_n & C1394bo> implements C1088Uc<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a f9411a;

    /* renamed from: b  reason: collision with root package name */
    private final C1627fE f9412b;

    /* renamed from: c  reason: collision with root package name */
    private final C1122Vk f9413c = new C1122Vk();

    /* renamed from: d  reason: collision with root package name */
    private final C1170Xg f9414d;

    /* renamed from: e  reason: collision with root package name */
    private final C1701gH f9415e;

    public C1192Yc(a aVar, C1170Xg xg, C1701gH gHVar, C1627fE fEVar) {
        this.f9411a = aVar;
        this.f9414d = xg;
        this.f9415e = gHVar;
        this.f9412b = fEVar;
    }

    static Uri a(Context context, Qba qba, Uri uri, View view, Activity activity) {
        if (qba == null) {
            return uri;
        }
        try {
            return qba.b(uri) ? qba.a(uri, context, view, activity) : uri;
        } catch (C2506rda unused) {
            return uri;
        } catch (Exception e2) {
            p.g().a((Throwable) e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri a(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            String valueOf = String.valueOf(uri.toString());
            C1018Rk.b(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e2);
        }
        return uri;
    }

    private final void a(int i) {
        C1627fE fEVar = this.f9412b;
        if (fEVar != null) {
            C1556eE a2 = fEVar.a();
            a2.a("action", "cct_action");
            a2.a("cct_open_status", C1932ja.i[i - 1]);
            a2.a();
        }
    }

    private final void a(boolean z) {
        C1170Xg xg = this.f9414d;
        if (xg != null) {
            xg.a(z);
        }
    }

    private final boolean a(T t, Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str2;
        p.c();
        boolean p = oa.p(context);
        p.c();
        H s = oa.s(context);
        C1627fE fEVar = this.f9412b;
        if (fEVar != null) {
            C2410qH.a(context2, fEVar, this.f9415e, str3, "offline_open");
        }
        if (p) {
            this.f9415e.a(this.f9413c, str3);
            return false;
        }
        p.c();
        if (oa.r(context) && s != null) {
            if (((Boolean) Qqa.e().a(F.If)).booleanValue()) {
                p.c();
                AlertDialog.Builder d2 = oa.d(context);
                Resources b2 = p.g().b();
                d2.setTitle(b2 == null ? "Open ad when you're back online." : b2.getString(com.google.android.gms.ads.d.a.offline_opt_in_title)).setMessage(b2 == null ? "We'll send you a notification with a link to the advertiser site." : b2.getString(com.google.android.gms.ads.d.a.offline_opt_in_message)).setPositiveButton(b2 == null ? "OK" : b2.getString(com.google.android.gms.ads.d.a.offline_opt_in_confirm), new C1166Xc(this, context, str2, s, str, b2)).setNegativeButton(b2 == null ? "No thanks" : b2.getString(com.google.android.gms.ads.d.a.offline_opt_in_decline), new C1301ad(this, str3, context2)).setOnCancelListener(new C1244_c(this, str3, context2));
                d2.create().show();
                C1627fE fEVar2 = this.f9412b;
                if (fEVar2 != null) {
                    C2410qH.a(context2, fEVar2, this.f9415e, str3, "dialog_impression");
                }
                t.onAdClicked();
                return true;
            }
        }
        this.f9415e.e(str3);
        if (this.f9412b != null) {
            HashMap hashMap = new HashMap();
            p.c();
            hashMap.put("dialog_not_shown_reason", !oa.r(context) ? "notifications_disabled" : s == null ? "work_manager_unavailable" : "notification_flow_disabled");
            C2410qH.a(context, this.f9412b, this.f9415e, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            p.e();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            p.e();
            return 6;
        } else if ("c".equalsIgnoreCase(str)) {
            return p.e().a();
        } else {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Context context, String str, H h2, String str2, Resources resources, DialogInterface dialogInterface, int i) {
        if (this.f9412b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "confirm");
            C2410qH.a(context, this.f9412b, this.f9415e, str, "dialog_click", hashMap);
        }
        boolean z = false;
        try {
            z = h2.zzd(b.a(context), str2, str);
        } catch (RemoteException e2) {
            C1018Rk.b("Failed to schedule offline notification poster.", e2);
        }
        if (!z) {
            this.f9415e.e(str);
            C1627fE fEVar = this.f9412b;
            if (fEVar != null) {
                C2410qH.a(context, fEVar, this.f9415e, str, "offline_notification_worker_not_scheduled");
            }
        }
        p.c();
        AlertDialog.Builder d2 = oa.d(context);
        d2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(com.google.android.gms.ads.d.a.offline_opt_in_confirmation));
        AlertDialog create = d2.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new C1443cd(this, create, timer), 3000);
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        String str;
        boolean z;
        Map map2 = map;
        C1540dqa dqa = (C1540dqa) obj;
        C1021Rn rn = (C1021Rn) dqa;
        String a2 = C1740gk.a((String) map2.get("u"), rn.getContext(), true);
        String str2 = (String) map2.get("a");
        if (str2 == null) {
            C1018Rk.d("Action missing from an open GMSG.");
            return;
        }
        a aVar = this.f9411a;
        if (aVar == null || aVar.b()) {
            C2988yS s = ((C1534dn) dqa).s();
            DS n = ((C0839Kn) dqa).n();
            if (s == null || n == null) {
                str = BuildConfig.FLAVOR;
                z = false;
            } else {
                z = s.ea;
                str = n.f6547b;
            }
            if ("expand".equalsIgnoreCase(str2)) {
                if (((C0995Qn) dqa).j()) {
                    C1018Rk.d("Cannot expand WebView that is already expanded.");
                    return;
                }
                a(false);
                ((C1125Vn) dqa).b(a((Map<String, String>) map), b(map));
            } else if ("webapp".equalsIgnoreCase(str2)) {
                a(false);
                if (a2 != null) {
                    ((C1125Vn) dqa).a(a((Map<String, String>) map), b(map), a2);
                } else {
                    ((C1125Vn) dqa).a(a((Map<String, String>) map), b(map), (String) map2.get("html"), (String) map2.get("baseurl"));
                }
            } else {
                if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                    if (((Boolean) Qqa.e().a(F.Wc)).booleanValue()) {
                        a(true);
                        if (TextUtils.isEmpty(a2)) {
                            C1018Rk.d("Cannot open browser with null or empty url");
                            a(C1932ja.f10953f);
                            return;
                        }
                        Uri a3 = a(a(rn.getContext(), ((C1255_n) dqa).G(), Uri.parse(a2), ((C1394bo) dqa).getView(), rn.f()));
                        if (!z || this.f9415e == null || !a(dqa, rn.getContext(), a3.toString(), str)) {
                            try {
                                a(p.c().a((Context) ((C1021Rn) dqa).f(), a3));
                                return;
                            } catch (ActivityNotFoundException e2) {
                                C1018Rk.d(e2.getMessage());
                                a(5);
                                return;
                            } catch (Throwable th) {
                                a(7);
                                throw th;
                            }
                        } else {
                            return;
                        }
                    }
                }
                if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                    a(true);
                    Intent a4 = new C1372bd(rn.getContext(), ((C1255_n) dqa).G(), ((C1394bo) dqa).getView()).a((Map<String, String>) map2);
                    if (!z || this.f9415e == null || a4 == null || !a(dqa, rn.getContext(), a4.getData().toString(), str)) {
                        try {
                            ((C1125Vn) dqa).a(new c(a4));
                        } catch (ActivityNotFoundException e3) {
                            C1018Rk.d(e3.getMessage());
                        }
                    }
                } else if ("open_app".equalsIgnoreCase(str2)) {
                    if (((Boolean) Qqa.e().a(F.Af)).booleanValue()) {
                        a(true);
                        String str3 = (String) map2.get("p");
                        if (str3 == null) {
                            C1018Rk.d("Package name missing from open app action.");
                        } else if (!z || this.f9415e == null || !a(dqa, rn.getContext(), str3, str)) {
                            PackageManager packageManager = rn.getContext().getPackageManager();
                            if (packageManager == null) {
                                C1018Rk.d("Cannot get package manager from open app action.");
                                return;
                            }
                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str3);
                            if (launchIntentForPackage != null) {
                                ((C1125Vn) dqa).a(new c(launchIntentForPackage));
                            }
                        }
                    }
                } else {
                    a(true);
                    String str4 = (String) map2.get("intent_url");
                    Intent intent = null;
                    if (!TextUtils.isEmpty(str4)) {
                        try {
                            intent = Intent.parseUri(str4, 0);
                        } catch (URISyntaxException e4) {
                            URISyntaxException uRISyntaxException = e4;
                            String valueOf = String.valueOf(str4);
                            C1018Rk.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                        }
                    }
                    if (!(intent == null || intent.getData() == null)) {
                        Uri data = intent.getData();
                        if (!Uri.EMPTY.equals(data)) {
                            Uri a5 = a(a(rn.getContext(), ((C1255_n) dqa).G(), data, ((C1394bo) dqa).getView(), rn.f()));
                            if (!TextUtils.isEmpty(intent.getType())) {
                                if (((Boolean) Qqa.e().a(F.Bf)).booleanValue()) {
                                    intent.setDataAndType(a5, intent.getType());
                                }
                            }
                            intent.setData(a5);
                        }
                    }
                    if (intent == null) {
                        if (!TextUtils.isEmpty(a2)) {
                            a2 = a(a(rn.getContext(), ((C1255_n) dqa).G(), Uri.parse(a2), ((C1394bo) dqa).getView(), rn.f())).toString();
                        }
                        String str5 = a2;
                        if (!z || this.f9415e == null || !a(dqa, rn.getContext(), str5, str)) {
                            ((C1125Vn) dqa).a(new c((String) map2.get("i"), str5, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e")));
                        }
                    } else if (!z || this.f9415e == null || !a(dqa, rn.getContext(), intent.getData().toString(), str)) {
                        ((C1125Vn) dqa).a(new c(intent));
                    }
                }
            }
        } else {
            this.f9411a.a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, Context context, DialogInterface dialogInterface) {
        this.f9415e.e(str);
        if (this.f9412b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            C2410qH.a(context, this.f9412b, this.f9415e, str, "dialog_click", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, Context context, DialogInterface dialogInterface, int i) {
        this.f9415e.e(str);
        if (this.f9412b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            C2410qH.a(context, this.f9412b, this.f9415e, str, "dialog_click", hashMap);
        }
    }
}
