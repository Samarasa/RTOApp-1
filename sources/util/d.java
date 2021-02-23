package util;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.core.app.n;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private Context f15650a;

    public d(Context context) {
        this.f15650a = context;
    }

    private void a(Bitmap bitmap, n.e eVar, int i, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        n.b bVar = new n.b();
        bVar.a((CharSequence) str);
        bVar.b((CharSequence) Html.fromHtml(str2).toString());
        bVar.b(bitmap);
        eVar.e(i);
        eVar.d((CharSequence) str);
        eVar.a(0);
        eVar.a(true);
        eVar.c((CharSequence) str);
        eVar.a(pendingIntent);
        eVar.a(uri);
        eVar.a((n.g) bVar);
        eVar.a(b(str3));
        eVar.e(R.mipmap.ic_launcher);
        eVar.a(BitmapFactory.decodeResource(this.f15650a.getResources(), i));
        eVar.b((CharSequence) str2);
        ((NotificationManager) this.f15650a.getSystemService("notification")).notify(101, eVar.a());
    }

    private void a(n.e eVar, int i, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        n.f fVar = new n.f();
        fVar.a((CharSequence) str2);
        eVar.e(i);
        eVar.d((CharSequence) str);
        eVar.a(0);
        eVar.a(true);
        eVar.c((CharSequence) str);
        eVar.a(pendingIntent);
        eVar.a(uri);
        eVar.a((n.g) fVar);
        eVar.a(b(str3));
        eVar.e(R.mipmap.ic_launcher);
        eVar.a(BitmapFactory.decodeResource(this.f15650a.getResources(), i));
        eVar.b((CharSequence) str2);
        ((NotificationManager) this.f15650a.getSystemService("notification")).notify(100, eVar.a());
    }

    public static boolean a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z = true;
        if (Build.VERSION.SDK_INT > 20) {
            for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                if (next.importance == 100) {
                    boolean z2 = z;
                    for (String equals : next.pkgList) {
                        if (equals.equals(context.getPackageName())) {
                            z2 = false;
                        }
                    }
                    z = z2;
                }
            }
        }
        return z;
    }

    public static long b(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public Bitmap a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void a() {
        try {
            RingtoneManager.getRingtone(this.f15650a, Uri.parse("android.resource://" + this.f15650a.getPackageName() + "/raw/notification")).play();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(String str, String str2, String str3, Intent intent) {
        a(str, str2, str3, intent, (String) null);
    }

    public void a(String str, String str2, String str3, Intent intent, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            intent.setFlags(603979776);
            PendingIntent activity = PendingIntent.getActivity(this.f15650a, 0, intent, 268435456);
            n.e eVar = new n.e(this.f15650a);
            Uri parse = Uri.parse("android.resource://" + this.f15650a.getPackageName() + "/raw/notification");
            if (TextUtils.isEmpty(str4)) {
                a(eVar, R.mipmap.ic_launcher, str, str2, str3, activity, parse);
                a();
            } else if (str4 != null && str4.length() > 4 && Patterns.WEB_URL.matcher(str4).matches()) {
                Bitmap a2 = a(str4);
                if (a2 != null) {
                    a(a2, eVar, R.mipmap.ic_launcher, str, str2, str3, activity, parse);
                } else {
                    a(eVar, R.mipmap.ic_launcher, str, str2, str3, activity, parse);
                }
            }
        }
    }
}
