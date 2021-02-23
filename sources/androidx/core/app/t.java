package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class t implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Intent> f921a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f922b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private t(Context context) {
        this.f922b = context;
    }

    public static t a(Context context) {
        return new t(context);
    }

    public t a(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = l.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f922b.getPackageManager());
            }
            a(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public t a(ComponentName componentName) {
        int size = this.f921a.size();
        try {
            Context context = this.f922b;
            while (true) {
                Intent a2 = l.a(context, componentName);
                if (a2 == null) {
                    return this;
                }
                this.f921a.add(size, a2);
                context = this.f922b;
                componentName = a2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public t a(Intent intent) {
        this.f921a.add(intent);
        return this;
    }

    public void a(Bundle bundle) {
        if (!this.f921a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f921a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!b.h.a.a.a(this.f922b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f922b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public void c() {
        a((Bundle) null);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f921a.iterator();
    }
}
