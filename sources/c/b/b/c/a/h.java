package c.b.b.c.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import android.view.View;
import b.e.i;
import java.util.ArrayList;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final i<String, i> f4762a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    private final i<String, PropertyValuesHolder[]> f4763b = new i<>();

    public static h a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a((List<Animator>) arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e2);
            return null;
        }
    }

    public static h a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return a(context, resourceId);
    }

    private static h a(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(hVar, list.get(i));
        }
        return hVar;
    }

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.a(objectAnimator.getPropertyName(), i.a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    private PropertyValuesHolder[] a(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public long a() {
        int size = this.f4762a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            i d2 = this.f4762a.d(i);
            j = Math.max(j, d2.a() + d2.b());
        }
        return j;
    }

    public ObjectAnimator a(String str, View view, Property<View, Float> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, a(str));
        ofPropertyValuesHolder.setProperty(property);
        b(str).a((Animator) ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public void a(String str, i iVar) {
        this.f4762a.put(str, iVar);
    }

    public void a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f4763b.put(str, propertyValuesHolderArr);
    }

    public PropertyValuesHolder[] a(String str) {
        if (c(str)) {
            return a(this.f4763b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public i b(String str) {
        if (d(str)) {
            return this.f4762a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean c(String str) {
        return this.f4763b.get(str) != null;
    }

    public boolean d(String str) {
        return this.f4762a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f4762a.equals(((h) obj).f4762a);
    }

    public int hashCode() {
        return this.f4762a.hashCode();
    }

    public String toString() {
        return 10 + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4762a + "}\n";
    }
}
