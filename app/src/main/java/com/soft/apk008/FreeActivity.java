package com.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class FreeActivity
  extends Activity
{
  private WebView a;
  private TextView b;
  private String c = StartActivity.b + "/phone/ContentAction.action?action=free";
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903044);
    this.a = ((WebView)findViewById(2131361797));
    this.b = ((TextView)findViewById(2131361800));
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.setScrollBarStyle(0);
    this.a.setClickable(true);
    if (!LoadActivity.c) {
      this.c = "";
    }
    this.a.loadUrl(this.c);
    this.b.setText("复制推广连接");
    this.b.setOnClickListener(new z(this));
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.FreeActivity
 * JD-Core Version:    0.7.0.1
 */