package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelpActivity
  extends Activity
{
  private String url = StartActivity.baseUrl + "/phone/ContentAction.action?action=simple_help";
  private WebView webView;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.system_message);
    this.webView = ((WebView)findViewById(R.id.webView1));
    this.webView.getSettings().setJavaScriptEnabled(true);
    this.webView.setScrollBarStyle(0);
    this.webView.setClickable(true);
    this.webView.loadUrl(this.url);
    this.webView.setWebViewClient(new WebViewClient()
    {
      public boolean shouldOverrideUrlLoading(WebView WebView, String weburl)
      {
        WebView.loadUrl(weburl);
        return true;
      }
    });
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.webView.canGoBack()))
    {
      this.webView.goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


