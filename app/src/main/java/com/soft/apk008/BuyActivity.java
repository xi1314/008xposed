package com.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import java.util.HashMap;

public class BuyActivity
  extends Activity
{
  private WebView a;
  private TextView b;
  private String c = StartActivity.b + "/phone/ContentAction.action?action=sellMsg&sellId=";
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    this.a = ((WebView)findViewById(2131361797));
    this.b = ((TextView)findViewById(2131361800));
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.setScrollBarStyle(0);
    this.a.setClickable(true);
    this.c += (String)StartActivity.g.get("sellId");
    if (!LoadActivity.c) {
      this.c = "http://www.baidu.com";
    }
    this.a.loadUrl(this.c);
    this.b.setOnClickListener(new w(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.BuyActivity
 * JD-Core Version:    0.7.0.1
 */