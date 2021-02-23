package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.n;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class o implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Notification.Builder f904a;

    /* renamed from: b  reason: collision with root package name */
    private final n.e f905b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteViews f906c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f907d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f908e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f909f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private int f910g;

    /* renamed from: h  reason: collision with root package name */
    private RemoteViews f911h;

    o(n.e eVar) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        this.f905b = eVar;
        this.f904a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(eVar.f891a, eVar.I) : new Notification.Builder(eVar.f891a);
        Notification notification = eVar.P;
        this.f904a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f898h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f894d).setContentText(eVar.f895e).setContentInfo(eVar.j).setContentIntent(eVar.f896f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f897g, (notification.flags & 128) != 0).setLargeIcon(eVar.i).setNumber(eVar.k).setProgress(eVar.r, eVar.s, eVar.t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f904a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f904a.setSubText(eVar.p).setUsesChronometer(eVar.n).setPriority(eVar.l);
            Iterator<n.a> it = eVar.f892b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Bundle bundle2 = eVar.B;
            if (bundle2 != null) {
                this.f909f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.x) {
                    this.f909f.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.u;
                if (str2 != null) {
                    this.f909f.putString("android.support.groupKey", str2);
                    if (eVar.v) {
                        bundle = this.f909f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f909f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.w;
                if (str3 != null) {
                    this.f909f.putString("android.support.sortKey", str3);
                }
            }
            this.f906c = eVar.F;
            this.f907d = eVar.G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f904a.setShowWhen(eVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = eVar.Q) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f909f;
                ArrayList<String> arrayList2 = eVar.Q;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f904a.setLocalOnly(eVar.x).setGroup(eVar.u).setGroupSummary(eVar.v).setSortKey(eVar.w);
            this.f910g = eVar.M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f904a.setCategory(eVar.A).setColor(eVar.C).setVisibility(eVar.D).setPublicVersion(eVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = eVar.Q.iterator();
            while (it2.hasNext()) {
                this.f904a.addPerson(it2.next());
            }
            this.f911h = eVar.H;
            if (eVar.f893c.size() > 0) {
                Bundle bundle4 = eVar.b().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < eVar.f893c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), p.a(eVar.f893c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.b().putBundle("android.car.EXTENSIONS", bundle4);
                this.f909f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f904a.setExtras(eVar.B).setRemoteInputHistory(eVar.q);
            RemoteViews remoteViews = eVar.F;
            if (remoteViews != null) {
                this.f904a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.G;
            if (remoteViews2 != null) {
                this.f904a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.H;
            if (remoteViews3 != null) {
                this.f904a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f904a.setBadgeIconType(eVar.J).setShortcutId(eVar.K).setTimeoutAfter(eVar.L).setGroupAlertBehavior(eVar.M);
            if (eVar.z) {
                this.f904a.setColorized(eVar.y);
            }
            if (!TextUtils.isEmpty(eVar.I)) {
                this.f904a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f904a.setAllowSystemGeneratedContextualActions(eVar.N);
            this.f904a.setBubbleMetadata(n.d.a(eVar.O));
        }
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    private void a(n.a aVar) {
        Notification.Action.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            if (i >= 23) {
                IconCompat f2 = aVar.f();
                builder = new Notification.Action.Builder(f2 == null ? null : f2.e(), aVar.j(), aVar.a());
            } else {
                builder = new Notification.Action.Builder(aVar.e(), aVar.j(), aVar.a());
            }
            if (aVar.g() != null) {
                for (RemoteInput addRemoteInput : r.a(aVar.g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.h());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.h());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
            builder.addExtras(bundle);
            this.f904a.addAction(builder.build());
        } else if (i >= 16) {
            this.f908e.add(p.a(this.f904a, aVar));
        }
    }

    public Notification.Builder a() {
        return this.f904a;
    }

    public Notification b() {
        Bundle a2;
        RemoteViews d2;
        RemoteViews b2;
        n.g gVar = this.f905b.o;
        if (gVar != null) {
            gVar.a((m) this);
        }
        RemoteViews c2 = gVar != null ? gVar.c(this) : null;
        Notification c3 = c();
        if (!(c2 == null && (c2 = this.f905b.F) == null)) {
            c3.contentView = c2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || gVar == null || (b2 = gVar.b(this)) == null)) {
            c3.bigContentView = b2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || gVar == null || (d2 = this.f905b.o.d(this)) == null)) {
            c3.headsUpContentView = d2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || gVar == null || (a2 = n.a(c3)) == null)) {
            gVar.a(a2);
        }
        return c3;
    }

    /* access modifiers changed from: protected */
    public Notification c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f904a.build();
        }
        if (i >= 24) {
            Notification build = this.f904a.build();
            if (this.f910g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f910g != 2)) {
                    a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f910g == 1) {
                    a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f904a.setExtras(this.f909f);
            Notification build2 = this.f904a.build();
            RemoteViews remoteViews = this.f906c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f907d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f911h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f910g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f910g != 2)) {
                    a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f910g == 1) {
                    a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f904a.setExtras(this.f909f);
            Notification build3 = this.f904a.build();
            RemoteViews remoteViews4 = this.f906c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f907d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f910g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f910g != 2)) {
                    a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f910g == 1) {
                    a(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = p.a(this.f908e);
            if (a2 != null) {
                this.f909f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.f904a.setExtras(this.f909f);
            Notification build4 = this.f904a.build();
            RemoteViews remoteViews6 = this.f906c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f907d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f904a.getNotification();
        } else {
            Notification build5 = this.f904a.build();
            Bundle a3 = n.a(build5);
            Bundle bundle = new Bundle(this.f909f);
            for (String str : this.f909f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = p.a(this.f908e);
            if (a4 != null) {
                n.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f906c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f907d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
