package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.o;

public class RatingActivity extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    Button cancel;
    Button ok;
    String rated_not;
    RatingBar rating;

    /* access modifiers changed from: package-private */
    public void feedbackDialog() {
        startActivity(new Intent(this, FeedbackActivity.class));
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_rating);
        if (Build.VERSION.SDK_INT < 26) {
            setRequestedOrientation(1);
        }
        setFinishOnTouchOutside(false);
        this.ok = (Button) findViewById(R.id.rate_us);
        this.cancel = (Button) findViewById(R.id.later);
        this.rating = (RatingBar) findViewById(R.id.ratingBar);
        final String string = PreferenceManager.getDefaultSharedPreferences(this).getString("customRating", BuildConfig.FLAVOR);
        if (!string.equals("true")) {
            this.rating.setVisibility(8);
        }
        Button button = this.ok;
        if (!(button == null || this.rating == null)) {
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent;
                    DataHandler.setRatingDone(RatingActivity.this);
                    if (!string.equals("true")) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + RatingActivity.this.getPackageName()));
                    } else {
                        int progress = RatingActivity.this.rating.getProgress();
                        if (progress > 3) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + RatingActivity.this.getPackageName()));
                        } else if (progress == 0) {
                            Toast.makeText(RatingActivity.this, "Please fill the stars.", 0).show();
                            return;
                        } else if (progress > 0 && progress <= 3) {
                            RatingActivity.this.finish();
                            RatingActivity.this.feedbackDialog();
                            return;
                        } else {
                            return;
                        }
                    }
                    RatingActivity.this.startActivity(intent);
                    RatingActivity.this.finish();
                }
            });
        }
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RatingActivity.this.onBackPressed();
            }
        });
        RatingBar ratingBar = this.rating;
        if (ratingBar != null) {
            ratingBar.setMax(5);
            this.rating.setStepSize(1.0f);
            this.rating.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                }
            });
        }
    }
}
