package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.Aa;
import b.a.a;
import b.a.f;
import b.a.g;
import b.a.j;
import b.h.j.y;

public class ListMenuItemView extends LinearLayout implements u.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private o f277a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f278b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f279c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f280d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f281e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f282f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f283g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f284h;
    private LinearLayout i;
    private Drawable j;
    private int k;
    private Context l;
    private boolean m;
    private Drawable n;
    private boolean o;
    private int p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        Aa a2 = Aa.a(getContext(), attributeSet, j.MenuView, i2, 0);
        this.j = a2.b(j.MenuView_android_itemBackground);
        this.k = a2.g(j.MenuView_android_itemTextAppearance, -1);
        this.m = a2.a(j.MenuView_preserveIconSpacing, false);
        this.l = context;
        this.n = a2.b(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        a2.a();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        a(view, -1);
    }

    private void a(View view, int i2) {
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void b() {
        this.f281e = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        a(this.f281e);
    }

    private void c() {
        this.f278b = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
        a((View) this.f278b, 0);
    }

    private void d() {
        this.f279c = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        a(this.f279c);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f283g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void a(o oVar, int i2) {
        this.f277a = oVar;
        this.p = i2;
        setVisibility(oVar.isVisible() ? 0 : 8);
        setTitle(oVar.a((u.a) this));
        setCheckable(oVar.isCheckable());
        a(oVar.m(), oVar.d());
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.getContentDescription());
    }

    public void a(boolean z, char c2) {
        int i2 = (!z || !this.f277a.m()) ? 8 : 0;
        if (i2 == 0) {
            this.f282f.setText(this.f277a.e());
        }
        if (this.f282f.getVisibility() != i2) {
            this.f282f.setVisibility(i2);
        }
    }

    public boolean a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f284h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f284h.getLayoutParams();
            rect.top += this.f284h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public o getItemData() {
        return this.f277a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        y.a((View) this, this.j);
        this.f280d = (TextView) findViewById(f.title);
        int i2 = this.k;
        if (i2 != -1) {
            this.f280d.setTextAppearance(this.l, i2);
        }
        this.f282f = (TextView) findViewById(f.shortcut);
        this.f283g = (ImageView) findViewById(f.submenuarrow);
        ImageView imageView = this.f283g;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.f284h = (ImageView) findViewById(f.group_divider);
        this.i = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f278b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f278b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f279c != null || this.f281e != null) {
            if (this.f277a.i()) {
                if (this.f279c == null) {
                    d();
                }
                compoundButton2 = this.f279c;
                compoundButton = this.f281e;
            } else {
                if (this.f281e == null) {
                    b();
                }
                compoundButton2 = this.f281e;
                compoundButton = this.f279c;
            }
            if (z) {
                compoundButton2.setChecked(this.f277a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f281e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f279c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f277a.i()) {
            if (this.f279c == null) {
                d();
            }
            compoundButton = this.f279c;
        } else {
            if (this.f281e == null) {
                b();
            }
            compoundButton = this.f281e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f284h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f277a.l() || this.r;
        if (!z && !this.m) {
            return;
        }
        if (this.f278b != null || drawable != null || this.m) {
            if (this.f278b == null) {
                c();
            }
            if (drawable != null || this.m) {
                ImageView imageView = this.f278b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f278b.getVisibility() != 0) {
                    this.f278b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f278b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f280d.setText(charSequence);
            if (this.f280d.getVisibility() != 0) {
                textView = this.f280d;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f280d.getVisibility() != 8) {
                textView = this.f280d;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
