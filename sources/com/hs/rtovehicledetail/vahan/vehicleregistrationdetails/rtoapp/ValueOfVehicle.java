package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import c.a.a.c;
import c.a.a.k;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class ValueOfVehicle extends o {
    private FrameLayout adContainerView;
    private h adViewbanner;
    String ePrice;
    String fPrice;
    String gPrice;
    ImageView go_back;
    ImageView model_img;
    TextView rmodel_excellent_price;
    TextView rmodel_fair_price;
    TextView rmodel_good_price;
    TextView rmodel_kms;
    TextView rmodel_name;
    TextView rmodel_price;
    TextView rmodel_vgood_price;
    TextView rmodel_year;
    String vgPrice;

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

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        k<Drawable> a2;
        ImageView imageView;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_value_of_vehicle);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("Value of Vehicle");
        this.rmodel_name = (TextView) findViewById(R.id.rmodel_name);
        this.rmodel_year = (TextView) findViewById(R.id.rmodel_year);
        this.rmodel_kms = (TextView) findViewById(R.id.rmodel_kms);
        this.rmodel_price = (TextView) findViewById(R.id.rmodel_price);
        this.model_img = (ImageView) findViewById(R.id.model_img);
        this.rmodel_fair_price = (TextView) findViewById(R.id.rmodel_fair_price);
        this.rmodel_good_price = (TextView) findViewById(R.id.rmodel_good_price);
        this.rmodel_vgood_price = (TextView) findViewById(R.id.rmodel_vgood_price);
        this.rmodel_excellent_price = (TextView) findViewById(R.id.rmodel_excellent_price);
        this.rmodel_fair_price.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ValueOfVehicle valueOfVehicle = ValueOfVehicle.this;
                valueOfVehicle.rmodel_fair_price.setBackgroundColor(valueOfVehicle.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle2 = ValueOfVehicle.this;
                valueOfVehicle2.rmodel_fair_price.setTextColor(valueOfVehicle2.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle3 = ValueOfVehicle.this;
                valueOfVehicle3.rmodel_good_price.setBackgroundColor(valueOfVehicle3.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle4 = ValueOfVehicle.this;
                valueOfVehicle4.rmodel_good_price.setTextColor(valueOfVehicle4.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle5 = ValueOfVehicle.this;
                valueOfVehicle5.rmodel_vgood_price.setBackgroundColor(valueOfVehicle5.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle6 = ValueOfVehicle.this;
                valueOfVehicle6.rmodel_vgood_price.setTextColor(valueOfVehicle6.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle7 = ValueOfVehicle.this;
                valueOfVehicle7.rmodel_excellent_price.setBackgroundColor(valueOfVehicle7.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle8 = ValueOfVehicle.this;
                valueOfVehicle8.rmodel_excellent_price.setTextColor(valueOfVehicle8.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle9 = ValueOfVehicle.this;
                valueOfVehicle9.rmodel_price.setText(valueOfVehicle9.fPrice);
            }
        });
        this.rmodel_good_price.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ValueOfVehicle valueOfVehicle = ValueOfVehicle.this;
                valueOfVehicle.rmodel_fair_price.setBackgroundColor(valueOfVehicle.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle2 = ValueOfVehicle.this;
                valueOfVehicle2.rmodel_fair_price.setTextColor(valueOfVehicle2.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle3 = ValueOfVehicle.this;
                valueOfVehicle3.rmodel_good_price.setBackgroundColor(valueOfVehicle3.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle4 = ValueOfVehicle.this;
                valueOfVehicle4.rmodel_good_price.setTextColor(valueOfVehicle4.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle5 = ValueOfVehicle.this;
                valueOfVehicle5.rmodel_vgood_price.setBackgroundColor(valueOfVehicle5.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle6 = ValueOfVehicle.this;
                valueOfVehicle6.rmodel_vgood_price.setTextColor(valueOfVehicle6.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle7 = ValueOfVehicle.this;
                valueOfVehicle7.rmodel_excellent_price.setBackgroundColor(valueOfVehicle7.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle8 = ValueOfVehicle.this;
                valueOfVehicle8.rmodel_excellent_price.setTextColor(valueOfVehicle8.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle9 = ValueOfVehicle.this;
                valueOfVehicle9.rmodel_price.setText(valueOfVehicle9.gPrice);
            }
        });
        this.rmodel_vgood_price.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ValueOfVehicle valueOfVehicle = ValueOfVehicle.this;
                valueOfVehicle.rmodel_fair_price.setBackgroundColor(valueOfVehicle.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle2 = ValueOfVehicle.this;
                valueOfVehicle2.rmodel_fair_price.setTextColor(valueOfVehicle2.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle3 = ValueOfVehicle.this;
                valueOfVehicle3.rmodel_good_price.setBackgroundColor(valueOfVehicle3.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle4 = ValueOfVehicle.this;
                valueOfVehicle4.rmodel_good_price.setTextColor(valueOfVehicle4.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle5 = ValueOfVehicle.this;
                valueOfVehicle5.rmodel_vgood_price.setBackgroundColor(valueOfVehicle5.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle6 = ValueOfVehicle.this;
                valueOfVehicle6.rmodel_vgood_price.setTextColor(valueOfVehicle6.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle7 = ValueOfVehicle.this;
                valueOfVehicle7.rmodel_excellent_price.setBackgroundColor(valueOfVehicle7.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle8 = ValueOfVehicle.this;
                valueOfVehicle8.rmodel_excellent_price.setTextColor(valueOfVehicle8.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle9 = ValueOfVehicle.this;
                valueOfVehicle9.rmodel_price.setText(valueOfVehicle9.vgPrice);
            }
        });
        this.rmodel_excellent_price.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ValueOfVehicle valueOfVehicle = ValueOfVehicle.this;
                valueOfVehicle.rmodel_fair_price.setBackgroundColor(valueOfVehicle.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle2 = ValueOfVehicle.this;
                valueOfVehicle2.rmodel_fair_price.setTextColor(valueOfVehicle2.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle3 = ValueOfVehicle.this;
                valueOfVehicle3.rmodel_good_price.setBackgroundColor(valueOfVehicle3.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle4 = ValueOfVehicle.this;
                valueOfVehicle4.rmodel_good_price.setTextColor(valueOfVehicle4.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle5 = ValueOfVehicle.this;
                valueOfVehicle5.rmodel_vgood_price.setBackgroundColor(valueOfVehicle5.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle6 = ValueOfVehicle.this;
                valueOfVehicle6.rmodel_vgood_price.setTextColor(valueOfVehicle6.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle7 = ValueOfVehicle.this;
                valueOfVehicle7.rmodel_excellent_price.setBackgroundColor(valueOfVehicle7.getResources().getColor(R.color.black));
                ValueOfVehicle valueOfVehicle8 = ValueOfVehicle.this;
                valueOfVehicle8.rmodel_excellent_price.setTextColor(valueOfVehicle8.getResources().getColor(R.color.white));
                ValueOfVehicle valueOfVehicle9 = ValueOfVehicle.this;
                valueOfVehicle9.rmodel_price.setText(valueOfVehicle9.ePrice);
            }
        });
        if (getIntent().hasExtra("result")) {
            try {
                JSONObject jSONObject = new JSONObject(getIntent().getStringExtra("result"));
                if (jSONObject.getString("code").equals("success")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("all_conditions");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                    TextView textView = this.rmodel_name;
                    textView.setText(jSONObject3.getString("make") + " " + jSONObject3.getString("model"));
                    this.rmodel_year.setText(jSONObject3.getString("year"));
                    TextView textView2 = this.rmodel_kms;
                    textView2.setText(jSONObject3.getString("kms_driven") + " Kms");
                    if (jSONObject3.getString("photo").contains("dummy_car.png")) {
                        a2 = c.a((C0159i) this).a(Integer.valueOf(R.drawable.ic_sample_car));
                        imageView = this.model_img;
                    } else {
                        a2 = c.a((C0159i) this).a(jSONObject3.getString("photo"));
                        imageView = this.model_img;
                    }
                    a2.a(imageView);
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("Fair");
                    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    this.fPrice = currencyInstance.format((long) Integer.parseInt(jSONObject4.getString("range_from"))).replace(".00", BuildConfig.FLAVOR) + " - " + currencyInstance.format((long) Integer.parseInt(jSONObject4.getString("range_to"))).replace(".00", BuildConfig.FLAVOR);
                    JSONObject jSONObject5 = jSONObject2.getJSONObject("Good");
                    this.gPrice = currencyInstance.format((long) Integer.parseInt(jSONObject5.getString("range_from"))).replace(".00", BuildConfig.FLAVOR) + " - " + currencyInstance.format((long) Integer.parseInt(jSONObject5.getString("range_to"))).replace(".00", BuildConfig.FLAVOR);
                    JSONObject jSONObject6 = jSONObject2.getJSONObject("Very Good");
                    this.vgPrice = currencyInstance.format((long) Integer.parseInt(jSONObject6.getString("range_from"))).replace(".00", BuildConfig.FLAVOR) + " - " + currencyInstance.format((long) Integer.parseInt(jSONObject6.getString("range_to"))).replace(".00", BuildConfig.FLAVOR);
                    JSONObject jSONObject7 = jSONObject2.getJSONObject("Excellent");
                    this.ePrice = currencyInstance.format((long) Integer.parseInt(jSONObject7.getString("range_from"))).replace(".00", BuildConfig.FLAVOR) + " - " + currencyInstance.format((long) Integer.parseInt(jSONObject7.getString("range_to"))).replace(".00", BuildConfig.FLAVOR);
                    this.rmodel_good_price.setBackgroundColor(getResources().getColor(R.color.black));
                    this.rmodel_good_price.setTextColor(getResources().getColor(R.color.white));
                    this.rmodel_price.setText(this.gPrice);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_value_result);
        this.adContainerView.post(new Runnable() {
            public void run() {
                ValueOfVehicle.this.loadBanner();
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
}
