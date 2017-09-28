package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebMessageActivity
  extends Activity
{
  private WebView webView;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = "a";
    int i = 0;
    if (i >= SetDataActivity.c.length())
    {
      setContentView(2130903068);
      String str = getIntent().getStringExtra("url");
      this.webView = ((WebView)findViewById(2131230721));
      this.webView.getSettings().setJavaScriptEnabled(true);
      this.webView.getSettings().setJavaScriptEnabled(true);
      this.webView.setScrollBarStyle(0);
      this.webView.setClickable(true);
      this.webView.loadUrl(str);
      i = 0;
    }
    for (;;)
    {
      if (i >= paramBundle.length())
      {
        return;
        paramBundle = paramBundle + SetDataActivity.a.length();
        i += 1;
        break;
      }
      SetDataActivity.a.length();
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     WebMessageActivity

 * JD-Core Version:    0.7.0.1

 */