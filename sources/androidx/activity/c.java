package androidx.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.k;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import androidx.lifecycle.z;
import androidx.savedstate.b;

public class c extends k implements androidx.lifecycle.k, E, androidx.savedstate.c, e {
    private int mContentLayoutId;
    private final m mLifecycleRegistry;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final b mSavedStateRegistryController;
    private D mViewModelStore;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        Object f102a;

        /* renamed from: b  reason: collision with root package name */
        D f103b;

        a() {
        }
    }

    public c() {
        this.mLifecycleRegistry = new m(this);
        this.mSavedStateRegistryController = b.a((androidx.savedstate.c) this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new b(this));
        if (getLifecycle() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                getLifecycle().a(new ComponentActivity$2(this));
            }
            getLifecycle().a(new ComponentActivity$3(this));
            int i = Build.VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public c(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        a aVar = (a) getLastNonConfigurationInstance();
        if (aVar != null) {
            return aVar.f102a;
        }
        return null;
    }

    public g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.a();
    }

    public D getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                a aVar = (a) getLastNonConfigurationInstance();
                if (aVar != null) {
                    this.mViewModelStore = aVar.f103b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new D();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.a(bundle);
        z.b((Activity) this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        a aVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        D d2 = this.mViewModelStore;
        if (d2 == null && (aVar = (a) getLastNonConfigurationInstance()) != null) {
            d2 = aVar.f103b;
        }
        if (d2 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.f102a = onRetainCustomNonConfigurationInstance;
        aVar2.f103b = d2;
        return aVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        g lifecycle = getLifecycle();
        if (lifecycle instanceof m) {
            ((m) lifecycle).a(g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
    }
}
