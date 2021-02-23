package c.b.b.b.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.n;
import androidx.fragment.app.C0159i;
import c.b.b.b.a.b;
import c.b.b.b.d.b.d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C0549e;
import com.google.android.gms.common.internal.C0550f;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.m;

public class e extends f {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f3878c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final e f3879d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final int f3880e = f.f3884a;

    /* renamed from: f  reason: collision with root package name */
    private String f3881f;

    @SuppressLint({"HandlerLeak"})
    private class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3882a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f3882a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int b2 = e.this.b(this.f3882a);
            if (e.this.b(b2)) {
                e.this.b(this.f3882a, b2);
            }
        }
    }

    static Dialog a(Context context, int i, C0550f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C0549e.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a2 = C0549e.a(context, i);
        if (a2 != null) {
            builder.setPositiveButton(a2, fVar);
        }
        String e2 = C0549e.e(context, i);
        if (e2 != null) {
            builder.setTitle(e2);
        }
        return builder.create();
    }

    public static e a() {
        return f3879d;
    }

    static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof C0159i) {
            m.a(dialog, onCancelListener).a(((C0159i) activity).getSupportFragmentManager(), str);
            return;
        }
        C0255c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            c(context);
        } else if (pendingIntent != null) {
            String d2 = C0549e.d(context, i);
            String c2 = C0549e.c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            n.e eVar = new n.e(context);
            eVar.b(true);
            eVar.a(true);
            eVar.c((CharSequence) d2);
            n.c cVar = new n.c();
            cVar.a((CharSequence) c2);
            eVar.a((n.g) cVar);
            if (i.c(context)) {
                C0563t.b(m.g());
                eVar.e(context.getApplicationInfo().icon);
                eVar.d(2);
                if (i.d(context)) {
                    eVar.a(c.b.b.b.a.a.common_full_open_on_phone, (CharSequence) resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    eVar.a(pendingIntent);
                }
            } else {
                eVar.e(17301642);
                eVar.d((CharSequence) resources.getString(b.common_google_play_services_notification_ticker));
                eVar.a(System.currentTimeMillis());
                eVar.a(pendingIntent);
                eVar.b((CharSequence) c2);
            }
            if (m.k()) {
                C0563t.b(m.k());
                String b2 = b();
                if (b2 == null) {
                    b2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b2);
                    String b3 = C0549e.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(b2, b3, 4);
                    } else if (!b3.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b3);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                eVar.a(b2);
            }
            Notification a2 = eVar.a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                j.f3891d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    private final String b() {
        String str;
        synchronized (f3878c) {
            str = this.f3881f;
        }
        return str;
    }

    public int a(Context context, int i) {
        return super.a(context, i);
    }

    public Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a((Context) activity, i, C0550f.a(activity, a((Context) activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent a(Context context, int i, int i2) {
        return super.a(context, i, i2);
    }

    public PendingIntent a(Context context, C0254b bVar) {
        return bVar.j() ? bVar.i() : a(context, bVar.g(), 0);
    }

    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public final String a(int i) {
        return super.a(i);
    }

    public final boolean a(Context context, C0254b bVar, int i) {
        PendingIntent a2 = a(context, bVar);
        if (a2 == null) {
            return false;
        }
        a(context, bVar.g(), (String) null, GoogleApiActivity.a(context, a2, i));
        return true;
    }

    public int b(Context context) {
        return super.b(context);
    }

    public void b(Context context, int i) {
        a(context, i, (String) null, a(context, i, 0, "n"));
    }

    public final boolean b(int i) {
        return super.b(i);
    }

    public boolean b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
