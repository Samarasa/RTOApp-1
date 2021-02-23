package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

public class EChallan extends o {
    private FrameLayout adContainerView;
    private h adViewbanner;
    EditText entered_challan;
    String localLang;
    Locale myLocale;
    RadioButton radioDl;
    RadioButton radioRc;
    LinearLayout search_challan;

    /* access modifiers changed from: private */
    public void dlSearchPerform() {
        if (!this.entered_challan.getText().toString().equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, ChallanResults.class).putExtra("rcNo", this.entered_challan.getText().toString()).putExtra("with", "DL"));
        } else {
            Toast.makeText(this, "Please enter number", 0).show();
        }
    }

    private void initMyViews() {
        this.entered_challan = (EditText) findViewById(R.id.entered_challan);
        this.search_challan = (LinearLayout) findViewById(R.id.search_challan);
        this.radioRc = (RadioButton) findViewById(R.id.radioRc);
        this.radioDl = (RadioButton) findViewById(R.id.radioDl);
        this.search_challan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (EChallan.this.radioRc.isChecked()) {
                    EChallan.this.rcSearchPerform();
                } else {
                    EChallan.this.dlSearchPerform();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void loadBanner() {
        this.adViewbanner = new h(this);
        this.adViewbanner.setAdUnitId(getString(R.string.admob_banner_id));
        this.adContainerView.removeAllViews();
        this.adContainerView.addView(this.adViewbanner);
        this.adViewbanner.setAdSize(DataHandler.getAdSize(this, this.adContainerView));
        e.a aVar = new e.a();
        aVar.b("B3EEABB8EE11C2BE770B684D95219ECB");
        this.adViewbanner.a(aVar.a());
    }

    /* access modifiers changed from: private */
    public void rcSearchPerform() {
        int i;
        if (this.entered_challan.getText().toString().toUpperCase().equals(BuildConfig.FLAVOR)) {
            i = R.string.enter_rc_number;
        } else {
            hideKeyboard(this);
            String replaceAll = this.entered_challan.getText().toString().toUpperCase().trim().replaceAll("\\s+", BuildConfig.FLAVOR);
            if (!isRCValid(replaceAll)) {
                if (checkNum1(replaceAll)) {
                    String substring = replaceAll.substring(0, 2);
                    if (!substring.equals("DL") || !substring.equals("BR") || !substring.equals("GJ")) {
                        StringBuilder sb = new StringBuilder(replaceAll);
                        sb.insert(2, '0');
                        replaceAll = sb.toString();
                    }
                } else if (!checkNum2(replaceAll)) {
                    i = R.string.number_not_valid;
                }
            }
            searchForRCSpecs(replaceAll);
            return;
        }
        Toast.makeText(this, i, 0).show();
    }

    public boolean checkNum1(String str) {
        return Pattern.compile("^[a-z,A-Z]{2}[0-9]{1}[a-z,A-Z]{1,3}[0-9]{1,4}$").matcher(str).matches();
    }

    public boolean checkNum2(String str) {
        return Pattern.compile("^[a-z,A-Z]{2}[0-9]{2}[0-9]{1,4}$").matcher(str).matches();
    }

    /* access modifiers changed from: package-private */
    public void hideKeyboard(Activity activity) {
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (activity.getCurrentFocus() != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                inputMethodManager.showSoftInputFromInputMethod(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isRCValid(String str) {
        return Pattern.compile("^[a-z,A-Z]{2}[0-9]{2}[a-z,A-Z]{1,3}[0-9]{1,4}$").matcher(str).matches();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_e_challan);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("Search E-Challan");
        initMyViews();
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_challan);
        this.adContainerView.post(new Runnable() {
            public void run() {
                EChallan.this.loadBanner();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void searchForRCSpecs(String str) {
        startActivity(new Intent(this, ChallanResults.class).putExtra("rcNo", str).putExtra("with", "RC"));
    }
}
