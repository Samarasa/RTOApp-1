package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import b.e.i;
import c.b.b.b.g.j;
import c.b.b.b.g.l;
import com.google.firebase.iid.K;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.iid.q  reason: case insensitive filesystem */
final class C3330q {

    /* renamed from: a  reason: collision with root package name */
    private static int f14590a;

    /* renamed from: b  reason: collision with root package name */
    private static PendingIntent f14591b;

    /* renamed from: c  reason: collision with root package name */
    private final i<String, j<Bundle>> f14592c = new i<>();

    /* renamed from: d  reason: collision with root package name */
    private final Context f14593d;

    /* renamed from: e  reason: collision with root package name */
    private final C3324k f14594e;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f14595f;

    /* renamed from: g  reason: collision with root package name */
    private Messenger f14596g;

    /* renamed from: h  reason: collision with root package name */
    private K f14597h;

    public C3330q(Context context, C3324k kVar) {
        this.f14593d = context;
        this.f14594e = kVar;
        this.f14595f = new Messenger(new C3332t(this, Looper.getMainLooper()));
    }

    private static synchronized String a() {
        String num;
        synchronized (C3330q.class) {
            int i = f14590a;
            f14590a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (C3330q.class) {
            if (f14591b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f14591b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f14591b);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Message message) {
        String concat;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new K.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof K) {
                        this.f14597h = (K) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f14596g = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            concat = sb.toString();
                        } else {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf2 = String.valueOf(stringExtra2);
                                Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                            }
                            if (stringExtra2.startsWith("|")) {
                                String[] split = stringExtra2.split("\\|");
                                if (split.length <= 2 || !"ID".equals(split[1])) {
                                    String valueOf3 = String.valueOf(stringExtra2);
                                    concat = valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response ");
                                } else {
                                    String str = split[2];
                                    String str2 = split[3];
                                    if (str2.startsWith(":")) {
                                        str2 = str2.substring(1);
                                    }
                                    a(str, intent2.putExtra("error", str2).getExtras());
                                    return;
                                }
                            } else {
                                synchronized (this.f14592c) {
                                    for (int i = 0; i < this.f14592c.size(); i++) {
                                        a(this.f14592c.b(i), intent2.getExtras());
                                    }
                                }
                                return;
                            }
                        }
                        Log.w("FirebaseInstanceId", concat);
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        a(group, extras);
                        return;
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf4 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private final void a(String str, Bundle bundle) {
        synchronized (this.f14592c) {
            j remove = this.f14592c.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.a(bundle);
        }
    }

    private final Bundle b(Bundle bundle) {
        Bundle c2 = c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        Bundle c3 = c(bundle);
        if (c3 == null || !c3.containsKey("google.messenger")) {
            return c3;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private final android.os.Bundle c(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = a()
            c.b.b.b.g.j r1 = new c.b.b.b.g.j
            r1.<init>()
            b.e.i<java.lang.String, c.b.b.b.g.j<android.os.Bundle>> r2 = r7.f14592c
            monitor-enter(r2)
            b.e.i<java.lang.String, c.b.b.b.g.j<android.os.Bundle>> r3 = r7.f14592c     // Catch:{ all -> 0x0123 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0123 }
            monitor-exit(r2)     // Catch:{ all -> 0x0123 }
            com.google.firebase.iid.k r2 = r7.f14594e
            int r2 = r2.a()
            if (r2 == 0) goto L_0x011b
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.k r3 = r7.f14594e
            int r3 = r3.a()
            r4 = 2
            if (r3 != r4) goto L_0x0030
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x0032
        L_0x0030:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
        L_0x0032:
            r2.setAction(r3)
            r2.putExtras(r8)
            android.content.Context r8 = r7.f14593d
            a((android.content.Context) r8, (android.content.Intent) r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0093
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.d(r5, r3)
        L_0x0093:
            android.os.Messenger r3 = r7.f14595f
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.f14596g
            if (r3 != 0) goto L_0x00a2
            com.google.firebase.iid.K r3 = r7.f14597h
            if (r3 == 0) goto L_0x00c8
        L_0x00a2:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.f14596g     // Catch:{ RemoteException -> 0x00b8 }
            if (r5 == 0) goto L_0x00b2
            android.os.Messenger r5 = r7.f14596g     // Catch:{ RemoteException -> 0x00b8 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00b8 }
            goto L_0x00db
        L_0x00b2:
            com.google.firebase.iid.K r5 = r7.f14597h     // Catch:{ RemoteException -> 0x00b8 }
            r5.a(r3)     // Catch:{ RemoteException -> 0x00b8 }
            goto L_0x00db
        L_0x00b8:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L_0x00c8
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x00c8:
            com.google.firebase.iid.k r8 = r7.f14594e
            int r8 = r8.a()
            if (r8 != r4) goto L_0x00d6
            android.content.Context r8 = r7.f14593d
            r8.sendBroadcast(r2)
            goto L_0x00db
        L_0x00d6:
            android.content.Context r8 = r7.f14593d
            r8.startService(r2)
        L_0x00db:
            c.b.b.b.g.i r8 = r1.a()     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            java.lang.Object r8 = c.b.b.b.g.l.a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00ff, ExecutionException -> 0x00f8 }
            b.e.i<java.lang.String, c.b.b.b.g.j<android.os.Bundle>> r1 = r7.f14592c
            monitor-enter(r1)
            b.e.i<java.lang.String, c.b.b.b.g.j<android.os.Bundle>> r2 = r7.f14592c     // Catch:{ all -> 0x00f3 }
            r2.remove(r0)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return r8
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            throw r8
        L_0x00f6:
            r8 = move-exception
            goto L_0x010e
        L_0x00f8:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f6 }
            r1.<init>(r8)     // Catch:{ all -> 0x00f6 }
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00ff:
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00f6 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00f6 }
            throw r8     // Catch:{ all -> 0x00f6 }
        L_0x010e:
            b.e.i<java.lang.String, c.b.b.b.g.j<android.os.Bundle>> r1 = r7.f14592c
            monitor-enter(r1)
            b.e.i<java.lang.String, c.b.b.b.g.j<android.os.Bundle>> r2 = r7.f14592c     // Catch:{ all -> 0x0118 }
            r2.remove(r0)     // Catch:{ all -> 0x0118 }
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            throw r8
        L_0x0118:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0118 }
            throw r8
        L_0x011b:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0123:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0123 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3330q.c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        if (this.f14594e.d() < 12000000) {
            return b(bundle);
        }
        try {
            return (Bundle) l.a(ba.a(this.f14593d).b(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e2.getCause() instanceof C3322i) || ((C3322i) e2.getCause()).a() != 4) {
                return null;
            }
            return b(bundle);
        }
    }
}
