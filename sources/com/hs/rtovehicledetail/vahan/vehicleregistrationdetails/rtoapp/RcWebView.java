package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import java.util.Objects;

public class RcWebView extends o {
    WebView rcWebView;

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_rc_web_view);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.rcWebView = (WebView) findViewById(R.id.rc_web_view);
        this.rcWebView.loadUrl(getIntent().getStringExtra("pageName"));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
