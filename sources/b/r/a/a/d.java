package b.r.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import b.h.a.a.i;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class d extends i implements b {

    /* renamed from: b  reason: collision with root package name */
    private a f2816b;

    /* renamed from: c  reason: collision with root package name */
    private Context f2817c;

    /* renamed from: d  reason: collision with root package name */
    private ArgbEvaluator f2818d;

    /* renamed from: e  reason: collision with root package name */
    private Animator.AnimatorListener f2819e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Object> f2820f;

    /* renamed from: g  reason: collision with root package name */
    final Drawable.Callback f2821g;

    private static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f2822a;

        /* renamed from: b  reason: collision with root package name */
        k f2823b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f2824c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f2825d;

        /* renamed from: e  reason: collision with root package name */
        b.e.b<Animator, String> f2826e;

        public a(Context context, a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f2822a = aVar.f2822a;
                k kVar = aVar.f2823b;
                if (kVar != null) {
                    Drawable.ConstantState constantState = kVar.getConstantState();
                    this.f2823b = (k) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    k kVar2 = this.f2823b;
                    kVar2.mutate();
                    this.f2823b = kVar2;
                    this.f2823b.setCallback(callback);
                    this.f2823b.setBounds(aVar.f2823b.getBounds());
                    this.f2823b.a(false);
                }
                ArrayList<Animator> arrayList = aVar.f2825d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f2825d = new ArrayList<>(size);
                    this.f2826e = new b.e.b<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f2825d.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f2826e.get(animator);
                        clone.setTarget(this.f2823b.a(str));
                        this.f2825d.add(clone);
                        this.f2826e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f2824c == null) {
                this.f2824c = new AnimatorSet();
            }
            this.f2824c.playTogether(this.f2825d);
        }

        public int getChangingConfigurations() {
            return this.f2822a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f2827a;

        public b(Drawable.ConstantState constantState) {
            this.f2827a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f2827a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f2827a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            d dVar = new d();
            dVar.f2832a = this.f2827a.newDrawable();
            dVar.f2832a.setCallback(dVar.f2821g);
            return dVar;
        }

        public Drawable newDrawable(Resources resources) {
            d dVar = new d();
            dVar.f2832a = this.f2827a.newDrawable(resources);
            dVar.f2832a.setCallback(dVar.f2821g);
            return dVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            dVar.f2832a = this.f2827a.newDrawable(resources, theme);
            dVar.f2832a.setCallback(dVar.f2821g);
            return dVar;
        }
    }

    d() {
        this((Context) null, (a) null, (Resources) null);
    }

    private d(Context context) {
        this(context, (a) null, (Resources) null);
    }

    private d(Context context, a aVar, Resources resources) {
        this.f2818d = null;
        this.f2819e = null;
        this.f2820f = null;
        this.f2821g = new c(this);
        this.f2817c = context;
        if (aVar != null) {
            this.f2816b = aVar;
        } else {
            this.f2816b = new a(context, aVar, this.f2821g, resources);
        }
    }

    public static d a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar = new d(context);
        dVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return dVar;
    }

    private void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f2818d == null) {
                    this.f2818d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f2818d);
            }
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.f2816b.f2823b.a(str));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        a aVar = this.f2816b;
        if (aVar.f2825d == null) {
            aVar.f2825d = new ArrayList<>();
            this.f2816b.f2826e = new b.e.b<>();
        }
        this.f2816b.f2825d.add(animator);
        this.f2816b.f2826e.put(animator, str);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.a(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2816b.f2823b.draw(canvas);
        if (this.f2816b.f2824c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f2832a;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2816b.f2823b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2816b.f2822a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2832a;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2816b.f2823b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f2832a;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(drawable.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2816b.f2823b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2816b.f2823b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.getOpacity() : this.f2816b.f2823b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = i.a(resources, theme, attributeSet, a.f2811e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        k a2 = k.a(resources, resourceId, theme);
                        a2.a(false);
                        a2.setCallback(this.f2821g);
                        k kVar = this.f2816b.f2823b;
                        if (kVar != null) {
                            kVar.setCallback((Drawable.Callback) null);
                        }
                        this.f2816b.f2823b = a2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.f2812f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2817c;
                        if (context != null) {
                            a(string, f.a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f2816b.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f2832a;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f2816b.f2823b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f2832a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2816b.f2824c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.isStateful() : this.f2816b.f2823b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2816b.f2823b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.setLevel(i) : this.f2816b.f2823b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.setState(iArr) : this.f2816b.f2823b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f2816b.f2823b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f2816b.f2823b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2816b.f2823b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i);
        } else {
            this.f2816b.f2823b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        } else {
            this.f2816b.f2823b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
        } else {
            this.f2816b.f2823b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2816b.f2823b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f2816b.f2824c.isStarted()) {
            this.f2816b.f2824c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2816b.f2824c.end();
        }
    }
}
