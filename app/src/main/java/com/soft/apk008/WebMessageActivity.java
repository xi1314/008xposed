package com.soft.apk008;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebMessageActivity
  extends Activity
{
  private WebView a;
  
  protected void onCreate(Bundle paramBundle)
  {
    int j = 0;
    super.onCreate(paramBundle);
    paramBundle = "a";
    int i = 0;
    String str;
    if (i >= SetMessageActivity.e.length())
    {
      setContentView(2130903076);
      str = getIntent().getStringExtra("url");
      this.a = ((WebView)findViewById(2131361797));
      this.a.getSettings().setJavaScriptEnabled(true);
      this.a.getSettings().setJavaScriptEnabled(true);
      this.a.setScrollBarStyle(0);
      this.a.setClickable(true);
      if (LoadActivity.c) {
        break label165;
      }
      str = "";
    }
    label165:
    for (;;)
    {
      this.a.loadUrl(str);
      i = j;
      for (;;)
      {
        if (i >= paramBundle.length())
        {
          return;
          paramBundle = paramBundle + SetMessageActivity.d.length();
          i += 1;
          break;
        }
        SetMessageActivity.d.length();
        i += 1;
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.WebMessageActivity
 * JD-Core Version:    0.7.0.1
 */