package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class BuyActivity
  extends Activity
{
  private TextView textView;
  private String url = StartActivity.baseUrl + "/phone/ContentAction.action?action=sellMsg&sellId=";
  private WebView webView;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.buy);
    this.webView = ((WebView)findViewById(R.id.webView1));
    this.textView = ((TextView)findViewById(R.id.buyButton));
    this.webView.getSettings().setJavaScriptEnabled(true);
    this.webView.setScrollBarStyle(0);
    this.webView.setClickable(true);
    this.url += (String)StartActivity.systemData.get("sellId");
    this.webView.loadUrl(this.url);
    this.textView.setOnClickListener(new OnClickListener()
    {
      public void onClick(View V      )
      {
        Intent i = new Intent();
        i.setAction("android.intent.action.VIEW");
        try
        {
          i.setData(Uri.parse(StartActivity.sellUrl));
          BuyActivity.this.startActivity(i);
          return;
        }
        catch (Exception e)
        {
          Toast.makeText(BuyActivity.this, "链接失效", 0).show();
        }
      }
    });
  }
}

