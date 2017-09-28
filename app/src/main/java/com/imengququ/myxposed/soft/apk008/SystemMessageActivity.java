package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SystemMessageActivity
  extends Activity
{
  private String url = StartActivity.baseUrl + "/phone/ContentAction.action?action=simple_systemMessage";
  private WebView webView;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903068);
    this.webView = ((WebView)findViewById(2131230721));
    this.webView = ((WebView)findViewById(2131230721));
    this.webView.getSettings().setJavaScriptEnabled(true);
    this.webView.setScrollBarStyle(0);
    this.webView.setClickable(true);
    this.webView.loadUrl(this.url);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     SystemMessageActivity

 * JD-Core Version:    0.7.0.1

 */