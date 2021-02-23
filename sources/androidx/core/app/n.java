package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

public class n {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f879a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f880b;

        /* renamed from: c  reason: collision with root package name */
        private final r[] f881c;

        /* renamed from: d  reason: collision with root package name */
        private final r[] f882d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f883e;

        /* renamed from: f  reason: collision with root package name */
        boolean f884f;

        /* renamed from: g  reason: collision with root package name */
        private final int f885g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f886h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.a((Resources) null, BuildConfig.FLAVOR, i2) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (r[]) null, (r[]) null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f884f = true;
            this.f880b = iconCompat;
            if (iconCompat != null && iconCompat.c() == 2) {
                this.i = iconCompat.a();
            }
            this.j = e.a(charSequence);
            this.k = pendingIntent;
            this.f879a = bundle == null ? new Bundle() : bundle;
            this.f881c = rVarArr;
            this.f882d = rVarArr2;
            this.f883e = z;
            this.f885g = i2;
            this.f884f = z2;
            this.f886h = z3;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.f883e;
        }

        public r[] c() {
            return this.f882d;
        }

        public Bundle d() {
            return this.f879a;
        }

        @Deprecated
        public int e() {
            return this.i;
        }

        public IconCompat f() {
            int i2;
            if (this.f880b == null && (i2 = this.i) != 0) {
                this.f880b = IconCompat.a((Resources) null, BuildConfig.FLAVOR, i2);
            }
            return this.f880b;
        }

        public r[] g() {
            return this.f881c;
        }

        public int h() {
            return this.f885g;
        }

        public boolean i() {
            return this.f884f;
        }

        public CharSequence j() {
            return this.j;
        }

        public boolean k() {
            return this.f886h;
        }
    }

    public static class b extends g {

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f887e;

        /* renamed from: f  reason: collision with root package name */
        private Bitmap f888f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f889g;

        public b a(Bitmap bitmap) {
            this.f888f = bitmap;
            this.f889g = true;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f901b = e.a(charSequence);
            return this;
        }

        public void a(m mVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(mVar.a()).setBigContentTitle(this.f901b).bigPicture(this.f887e);
                if (this.f889g) {
                    bigPicture.bigLargeIcon(this.f888f);
                }
                if (this.f903d) {
                    bigPicture.setSummaryText(this.f902c);
                }
            }
        }

        public b b(Bitmap bitmap) {
            this.f887e = bitmap;
            return this;
        }

        public b b(CharSequence charSequence) {
            this.f902c = e.a(charSequence);
            this.f903d = true;
            return this;
        }
    }

    public static class c extends g {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f890e;

        public c a(CharSequence charSequence) {
            this.f890e = e.a(charSequence);
            return this;
        }

        public void a(m mVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(mVar.a()).setBigContentTitle(this.f901b).bigText(this.f890e);
                if (this.f903d) {
                    bigText.setSummaryText(this.f902c);
                }
            }
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            if (dVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            dVar.a();
            throw null;
        }

        public boolean a() {
            throw null;
        }
    }

    public static class e {
        String A;
        Bundle B;
        int C;
        int D;
        Notification E;
        RemoteViews F;
        RemoteViews G;
        RemoteViews H;
        String I;
        int J;
        String K;
        long L;
        int M;
        boolean N;
        d O;
        Notification P;
        @Deprecated
        public ArrayList<String> Q;

        /* renamed from: a  reason: collision with root package name */
        public Context f891a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f892b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<a> f893c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f894d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f895e;

        /* renamed from: f  reason: collision with root package name */
        PendingIntent f896f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f897g;

        /* renamed from: h  reason: collision with root package name */
        RemoteViews f898h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        g o;
        CharSequence p;
        CharSequence[] q;
        int r;
        int s;
        boolean t;
        String u;
        boolean v;
        String w;
        boolean x;
        boolean y;
        boolean z;

        @Deprecated
        public e(Context context) {
            this(context, (String) null);
        }

        public e(Context context, String str) {
            this.f892b = new ArrayList<>();
            this.f893c = new ArrayList<>();
            this.m = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.M = 0;
            this.P = new Notification();
            this.f891a = context;
            this.I = str;
            this.P.when = System.currentTimeMillis();
            this.P.audioStreamType = -1;
            this.l = 0;
            this.Q = new ArrayList<>();
            this.N = true;
        }

        protected static CharSequence a(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void a(int i2, boolean z2) {
            Notification notification;
            int i3;
            if (z2) {
                notification = this.P;
                i3 = i2 | notification.flags;
            } else {
                notification = this.P;
                i3 = (i2 ^ -1) & notification.flags;
            }
            notification.flags = i3;
        }

        private Bitmap b(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f891a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(b.h.b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(b.h.b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d2 = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d2);
            Double.isNaN(max);
            double d3 = d2 / max;
            double d4 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d4);
            Double.isNaN(max2);
            double min = Math.min(d3, d4 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        public Notification a() {
            return new o(this).b();
        }

        public e a(int i2) {
            this.C = i2;
            return this;
        }

        public e a(int i2, int i3, int i4) {
            Notification notification = this.P;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            int i5 = (notification.ledOnMS == 0 || notification.ledOffMS == 0) ? 0 : 1;
            Notification notification2 = this.P;
            notification2.flags = i5 | (notification2.flags & -2);
            return this;
        }

        public e a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f892b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public e a(long j2) {
            this.P.when = j2;
            return this;
        }

        public e a(PendingIntent pendingIntent) {
            this.f896f = pendingIntent;
            return this;
        }

        public e a(Bitmap bitmap) {
            this.i = b(bitmap);
            return this;
        }

        public e a(Uri uri) {
            Notification notification = this.P;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e a(g gVar) {
            if (this.o != gVar) {
                this.o = gVar;
                g gVar2 = this.o;
                if (gVar2 != null) {
                    gVar2.a(this);
                }
            }
            return this;
        }

        public e a(String str) {
            this.I = str;
            return this;
        }

        public e a(boolean z2) {
            a(16, z2);
            return this;
        }

        public e a(long[] jArr) {
            this.P.vibrate = jArr;
            return this;
        }

        public Bundle b() {
            if (this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        public e b(int i2) {
            Notification notification = this.P;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e b(PendingIntent pendingIntent) {
            this.P.deleteIntent = pendingIntent;
            return this;
        }

        public e b(CharSequence charSequence) {
            this.f895e = a(charSequence);
            return this;
        }

        public e b(boolean z2) {
            this.x = z2;
            return this;
        }

        public e c(int i2) {
            this.k = i2;
            return this;
        }

        public e c(CharSequence charSequence) {
            this.f894d = a(charSequence);
            return this;
        }

        public e c(boolean z2) {
            this.m = z2;
            return this;
        }

        public e d(int i2) {
            this.l = i2;
            return this;
        }

        public e d(CharSequence charSequence) {
            this.P.tickerText = a(charSequence);
            return this;
        }

        public e e(int i2) {
            this.P.icon = i2;
            return this;
        }

        public e f(int i2) {
            this.D = i2;
            return this;
        }
    }

    public static class f extends g {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f899e = new ArrayList<>();

        public f a(CharSequence charSequence) {
            this.f899e.add(e.a(charSequence));
            return this;
        }

        public void a(m mVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(mVar.a()).setBigContentTitle(this.f901b);
                if (this.f903d) {
                    bigContentTitle.setSummaryText(this.f902c);
                }
                Iterator<CharSequence> it = this.f899e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }
    }

    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        protected e f900a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f901b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f902c;

        /* renamed from: d  reason: collision with root package name */
        boolean f903d = false;

        public void a(Bundle bundle) {
        }

        public abstract void a(m mVar);

        public void a(e eVar) {
            if (this.f900a != eVar) {
                this.f900a = eVar;
                e eVar2 = this.f900a;
                if (eVar2 != null) {
                    eVar2.a(this);
                }
            }
        }

        public RemoteViews b(m mVar) {
            return null;
        }

        public RemoteViews c(m mVar) {
            return null;
        }

        public RemoteViews d(m mVar) {
            return null;
        }
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return p.a(notification);
        }
        return null;
    }
}
