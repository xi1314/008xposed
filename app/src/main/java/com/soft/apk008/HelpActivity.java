package com.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class HelpActivity
  extends Activity
{
  private WebView a;
  private String b = StartActivity.b + "/phone/ContentAction.action?action=simple_help";
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903076);
    this.a = ((WebView)findViewById(2131361797));
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.setScrollBarStyle(0);
    this.a.setClickable(true);
    if (!LoadActivity.c) {
      this.b = "";
    }
    this.a.loadUrl(this.b);
    this.a.setWebViewClient(new ad(this));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.a.canGoBack()))
    {
      this.a.goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.HelpActivity
 * JD-Core Version:    0.7.0.1
 */