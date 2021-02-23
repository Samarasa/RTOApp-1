package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0117da;
import b.a.a;
import b.a.c;
import b.a.e;

/* renamed from: androidx.appcompat.widget.p  reason: case insensitive filesystem */
class C0140p implements C0117da.e {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f690a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b  reason: collision with root package name */
    private final int[] f691b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c  reason: collision with root package name */
    private final int[] f692c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl_dark, e.abc_text_select_handle_middle_mtrl_dark, e.abc_text_select_handle_right_mtrl_dark, e.abc_text_select_handle_left_mtrl_light, e.abc_text_select_handle_middle_mtrl_light, e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: d  reason: collision with root package name */
    private final int[] f693d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e  reason: collision with root package name */
    private final int[] f694e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};

    /* renamed from: f  reason: collision with root package name */
    private final int[] f695f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

    C0140p() {
    }

    private ColorStateList a(Context context) {
        return b(context, 0);
    }

    private void a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (T.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0142q.f697a;
        }
        drawable.setColorFilter(C0142q.a(i, mode));
    }

    private boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private ColorStateList b(Context context) {
        return b(context, va.b(context, a.colorAccent));
    }

    private ColorStateList b(Context context, int i) {
        int b2 = va.b(context, a.colorControlHighlight);
        int a2 = va.a(context, a.colorButtonNormal);
        return new ColorStateList(new int[][]{va.f720b, va.f723e, va.f721c, va.i}, new int[]{a2, b.h.b.a.a(b2, i), b.h.b.a.a(b2, i), i});
    }

    private ColorStateList c(Context context) {
        return b(context, va.b(context, a.colorButtonNormal));
    }

    private ColorStateList d(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c2 = va.c(context, a.colorSwitchThumbNormal);
        if (c2 == null || !c2.isStateful()) {
            iArr[0] = va.f720b;
            iArr2[0] = va.a(context, a.colorSwitchThumbNormal);
            iArr[1] = va.f724f;
            iArr2[1] = va.b(context, a.colorControlActivated);
            iArr[2] = va.i;
            iArr2[2] = va.b(context, a.colorSwitchThumbNormal);
        } else {
            iArr[0] = va.f720b;
            iArr2[0] = c2.getColorForState(iArr[0], 0);
            iArr[1] = va.f724f;
            iArr2[1] = va.b(context, a.colorControlActivated);
            iArr[2] = va.i;
            iArr2[2] = c2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public ColorStateList a(Context context, int i) {
        if (i == e.abc_edit_text_material) {
            return b.a.a.a.a.a(context, c.abc_tint_edittext);
        }
        if (i == e.abc_switch_track_mtrl_alpha) {
            return b.a.a.a.a.a(context, c.abc_tint_switch_track);
        }
        if (i == e.abc_switch_thumb_material) {
            return d(context);
        }
        if (i == e.abc_btn_default_mtrl_shape) {
            return c(context);
        }
        if (i == e.abc_btn_borderless_material) {
            return a(context);
        }
        if (i == e.abc_btn_colored_material) {
            return b(context);
        }
        if (i == e.abc_spinner_mtrl_am_alpha || i == e.abc_spinner_textfield_background_material) {
            return b.a.a.a.a.a(context, c.abc_tint_spinner);
        }
        if (a(this.f691b, i)) {
            return va.c(context, a.colorControlNormal);
        }
        if (a(this.f694e, i)) {
            return b.a.a.a.a.a(context, c.abc_tint_default);
        }
        if (a(this.f695f, i)) {
            return b.a.a.a.a.a(context, c.abc_tint_btn_checkable);
        }
        if (i == e.abc_seekbar_thumb_material) {
            return b.a.a.a.a.a(context, c.abc_tint_seek_thumb);
        }
        return null;
    }

    public PorterDuff.Mode a(int i) {
        if (i == e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public Drawable a(C0117da daVar, Context context, int i) {
        if (i != e.abc_cab_background_top_material) {
            return null;
        }
        return new LayerDrawable(new Drawable[]{daVar.a(context, e.abc_cab_background_internal_bg), daVar.a(context, e.abc_cab_background_top_mtrl_alpha)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0142q.f697a
            int[] r1 = r6.f690a
            boolean r1 = r6.a((int[]) r1, (int) r8)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0018
            int r2 = b.a.a.colorControlNormal
        L_0x0014:
            r1 = r0
            r8 = 1
            r0 = -1
            goto L_0x0049
        L_0x0018:
            int[] r1 = r6.f692c
            boolean r1 = r6.a((int[]) r1, (int) r8)
            if (r1 == 0) goto L_0x0023
            int r2 = b.a.a.colorControlActivated
            goto L_0x0014
        L_0x0023:
            int[] r1 = r6.f693d
            boolean r1 = r6.a((int[]) r1, (int) r8)
            if (r1 == 0) goto L_0x002e
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0014
        L_0x002e:
            int r1 = b.a.e.abc_list_divider_mtrl_alpha
            if (r8 != r1) goto L_0x0040
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r1 = r0
            r0 = r8
            r8 = 1
            goto L_0x0049
        L_0x0040:
            int r1 = b.a.e.abc_dialog_material_background
            if (r8 != r1) goto L_0x0045
            goto L_0x0014
        L_0x0045:
            r1 = r0
            r8 = 0
            r0 = -1
            r2 = 0
        L_0x0049:
            if (r8 == 0) goto L_0x0066
            boolean r8 = androidx.appcompat.widget.T.a(r9)
            if (r8 == 0) goto L_0x0055
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L_0x0055:
            int r7 = androidx.appcompat.widget.va.b(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0142q.a((int) r7, (android.graphics.PorterDuff.Mode) r1)
            r9.setColorFilter(r7)
            if (r0 == r3) goto L_0x0065
            r9.setAlpha(r0)
        L_0x0065:
            return r5
        L_0x0066:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0140p.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public boolean b(Context context, int i, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        if (i == e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), va.b(context, a.colorControlNormal), C0142q.f697a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = a.colorControlNormal;
        } else if (i != e.abc_ratingbar_material && i != e.abc_ratingbar_indicator_material && i != e.abc_ratingbar_small_material) {
            return false;
        } else {
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), va.a(context, a.colorControlNormal), C0142q.f697a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = a.colorControlActivated;
        }
        a(findDrawableByLayerId, va.b(context, i2), C0142q.f697a);
        a(layerDrawable.findDrawableByLayerId(16908301), va.b(context, a.colorControlActivated), C0142q.f697a);
        return true;
    }
}
