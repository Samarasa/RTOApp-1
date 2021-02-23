package androidx.appcompat.app;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.k  reason: case insensitive filesystem */
class C0104k extends CursorAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final int f220a;

    /* renamed from: b  reason: collision with root package name */
    private final int f221b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AlertController.RecycleListView f222c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AlertController f223d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AlertController.a f224e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0104k(AlertController.a aVar, Context context, Cursor cursor, boolean z, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, z);
        this.f224e = aVar;
        this.f222c = recycleListView;
        this.f223d = alertController;
        Cursor cursor2 = getCursor();
        this.f220a = cursor2.getColumnIndexOrThrow(this.f224e.L);
        this.f221b = cursor2.getColumnIndexOrThrow(this.f224e.M);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f220a));
        AlertController.RecycleListView recycleListView = this.f222c;
        int position = cursor.getPosition();
        boolean z = true;
        if (cursor.getInt(this.f221b) != 1) {
            z = false;
        }
        recycleListView.setItemChecked(position, z);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f224e.f118b.inflate(this.f223d.M, viewGroup, false);
    }
}
