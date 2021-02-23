package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import c.a.a.c;
import java.util.Objects;

public class News extends o {
    ImageView goBack;
    TextView snewsContent;
    ImageView snewsImage;
    TextView snewsTitle;

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Spanned spanned;
        TextView textView;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_news);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.snewsContent = (TextView) findViewById(R.id.snews_content);
        this.snewsTitle = (TextView) findViewById(R.id.snews_title);
        this.snewsImage = (ImageView) findViewById(R.id.snews_image);
        String stringExtra = getIntent().getStringExtra("nContent");
        String stringExtra2 = getIntent().getStringExtra("nTitle");
        String stringExtra3 = getIntent().getStringExtra("nImage");
        if (Build.VERSION.SDK_INT >= 24) {
            textView = this.snewsContent;
            spanned = Html.fromHtml(stringExtra, 63);
        } else {
            textView = this.snewsContent;
            spanned = Html.fromHtml(stringExtra);
        }
        textView.setText(spanned);
        this.snewsTitle.setText(stringExtra2);
        c.a((C0159i) this).a(stringExtra3).a(this.snewsImage);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
