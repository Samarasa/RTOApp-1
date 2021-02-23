package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.C0128j;
import androidx.appcompat.widget.C0132l;
import androidx.appcompat.widget.C0134m;
import androidx.appcompat.widget.C0136n;
import androidx.appcompat.widget.C0144t;
import androidx.appcompat.widget.C0146v;
import androidx.appcompat.widget.C0147w;
import androidx.appcompat.widget.C0150z;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.xa;
import b.a.d.d;
import b.a.j;
import b.e.b;
import b.h.j.y;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new b();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f126a;

        /* renamed from: b  reason: collision with root package name */
        private final String f127b;

        /* renamed from: c  reason: collision with root package name */
        private Method f128c;

        /* renamed from: d  reason: collision with root package name */
        private Context f129d;

        public a(View view, String str) {
            this.f126a = view;
            this.f127b = str;
        }

        private void a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f127b, new Class[]{View.class})) != null) {
                        this.f128c = method;
                        this.f129d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f126a.getId();
            if (id == -1) {
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = " with id '" + this.f126a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f127b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f126a.getClass() + str2);
        }

        public void onClick(View view) {
            if (this.f128c == null) {
                a(this.f126a.getContext(), this.f127b);
            }
            try {
                this.f128c.invoke(this.f129d, new Object[]{view});
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || y.v(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = sConstructorMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String createViewByPrefix : sClassPrefixList) {
                    View createViewByPrefix2 = createViewByPrefix(context, str, createViewByPrefix);
                    if (createViewByPrefix2 != null) {
                        return createViewByPrefix2;
                    }
                }
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View createViewByPrefix3 = createViewByPrefix(context, str, (String) null);
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
            return createViewByPrefix3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.mConstructorArgs;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(j.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof d) || ((d) context).a() != resourceId) ? new d(context, resourceId) : context : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public C0128j createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0128j(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0132l createButton(Context context, AttributeSet attributeSet) {
        return new C0132l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0134m createCheckBox(Context context, AttributeSet attributeSet) {
        return new C0134m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0136n createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0136n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public r createEditText(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0144t createImageButton(Context context, AttributeSet attributeSet) {
        return new C0144t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0146v createImageView(Context context, AttributeSet attributeSet) {
        return new C0146v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0147w createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0147w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0150z createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0150z(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public A createRatingBar(Context context, AttributeSet attributeSet) {
        return new A(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public B createSeekBar(Context context, AttributeSet attributeSet) {
        return new B(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public F createSpinner(Context context, AttributeSet attributeSet) {
        return new F(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public N createTextView(Context context, AttributeSet attributeSet) {
        return new N(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public P createToggleButton(Context context, AttributeSet attributeSet) {
        return new P(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = xa.a(context2);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                view2 = createTextView(context2, attributeSet);
                break;
            case 1:
                view2 = createImageView(context2, attributeSet);
                break;
            case 2:
                view2 = createButton(context2, attributeSet);
                break;
            case 3:
                view2 = createEditText(context2, attributeSet);
                break;
            case 4:
                view2 = createSpinner(context2, attributeSet);
                break;
            case 5:
                view2 = createImageButton(context2, attributeSet);
                break;
            case 6:
                view2 = createCheckBox(context2, attributeSet);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                break;
            case 8:
                view2 = createCheckedTextView(context2, attributeSet);
                break;
            case 9:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                break;
            case 10:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view2 = createRatingBar(context2, attributeSet);
                break;
            case 12:
                view2 = createSeekBar(context2, attributeSet);
                break;
            case 13:
                view2 = createToggleButton(context2, attributeSet);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        verifyNotNull(view2, str);
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
