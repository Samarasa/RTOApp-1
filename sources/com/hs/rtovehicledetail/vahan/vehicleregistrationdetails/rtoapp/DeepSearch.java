package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.o;
import com.google.android.material.snackbar.Snackbar;

public class DeepSearch extends o {
    static DeepSearch webInstance;
    WebView deep_web;
    ImageView go_back;
    TextView text_web;
    String vehicleNum;

    public class CustomBrowser extends WebViewClient {
        boolean flag = false;

        public CustomBrowser() {
        }

        @JavascriptInterface
        public void displayToast(String str) {
            System.out.println(str);
            Toast.makeText(DeepSearch.this, str, 0).show();
        }

        @JavascriptInterface
        public void makeToast(String str) {
            System.out.println(str);
            DeepSearch.this.finish();
        }

        public void onPageFinished(WebView webView, String str) {
            DeepSearch.this.text_web.setVisibility(8);
            DeepSearch.this.deep_web.setVisibility(0);
            super.onPageFinished(webView, str);
            WebView webView2 = DeepSearch.this.deep_web;
            if (webView2 != null) {
                webView2.loadUrl("javascript:try{document.getElementById('regn_no1_exact').value = HTMLOUT.setVehicleNum();setTimeout(function(){ window.HTMLOUT.processHTML('<html><body><table>'+getElementsByTagName('body').innerHTML+'</table></body></html>'); },2000);}catch(e){};javascript:window.HTMLOUT.processHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            DeepSearch.this.text_web.setVisibility(0);
            DeepSearch.this.deep_web.setVisibility(8);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            AlertDialog.Builder builder = new AlertDialog.Builder(DeepSearch.webInstance);
            builder.setMessage("Web server ssl certificate is untrusted. Do you want to continue anyway?");
            builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.proceed();
                }
            });
            builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.cancel();
                    DeepSearch.this.finish();
                }
            });
            builder.create().show();
        }

        @JavascriptInterface
        public String setVehicleNum() {
            String str = DeepSearch.this.vehicleNum;
            return (str == null || str.equals(BuildConfig.FLAVOR)) ? BuildConfig.FLAVOR : DeepSearch.this.vehicleNum;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }

        @JavascriptInterface
        public void showLoading() {
            Snackbar a2 = Snackbar.a(DeepSearch.this.findViewById(16908290), "Please wait searching.", 0);
            a2.a("CLOSE", new View.OnClickListener() {
                public void onClick(View view) {
                }
            });
            a2.e(DeepSearch.this.getResources().getColor(17170454));
            a2.k();
        }
    }

    private void openWebView() {
        this.vehicleNum = getIntent().getStringExtra("vNum");
        getWindow().setFeatureInt(2, -1);
        this.deep_web.getSettings().setBuiltInZoomControls(true);
        this.deep_web.setWebViewClient(new CustomBrowser());
        this.deep_web.getSettings().setLoadsImagesAutomatically(true);
        this.deep_web.getSettings().setUseWideViewPort(true);
        this.deep_web.getSettings().setJavaScriptEnabled(true);
        this.deep_web.getSettings().setDomStorageEnabled(true);
        this.deep_web.getSettings().setLoadWithOverviewMode(true);
        this.deep_web.setScrollBarStyle(0);
        this.deep_web.addJavascriptInterface(new CustomBrowser(), "HTMLOUT");
        this.deep_web.loadUrl("https://vahan.nic.in/nrservices/faces/user/searchstatus.xhtml");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        WebView webView;
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_deep_search);
        this.deep_web = (WebView) findViewById(R.id.deep_web);
        this.text_web = (TextView) findViewById(R.id.text_web);
        webInstance = this;
        if (Build.VERSION.SDK_INT >= 19) {
            webView = this.deep_web;
            i = 2;
        } else {
            webView = this.deep_web;
            i = 1;
        }
        webView.setLayerType(i, (Paint) null);
        if (getIntent().hasExtra("vNum")) {
            openWebView();
        } else {
            finish();
        }
    }
}
