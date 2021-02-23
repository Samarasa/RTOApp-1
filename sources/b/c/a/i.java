package b.c.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.j;
import java.util.ArrayList;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f2182a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f2183b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f2184a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f2185b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f2186c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<Bundle> f2187d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2188e;

        public a() {
            this((l) null);
        }

        public a(l lVar) {
            this.f2184a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f2185b = null;
            this.f2186c = null;
            this.f2187d = null;
            this.f2188e = true;
            if (lVar != null) {
                this.f2184a.setPackage(lVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            j.a(bundle, "android.support.customtabs.extra.SESSION", lVar != null ? lVar.a() : iBinder);
            this.f2184a.putExtras(bundle);
        }

        public i a() {
            ArrayList<Bundle> arrayList = this.f2185b;
            if (arrayList != null) {
                this.f2184a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2187d;
            if (arrayList2 != null) {
                this.f2184a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f2184a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2188e);
            return new i(this.f2184a, this.f2186c);
        }
    }

    i(Intent intent, Bundle bundle) {
        this.f2182a = intent;
        this.f2183b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f2182a.setData(uri);
        b.h.a.a.a(context, this.f2182a, this.f2183b);
    }
}
