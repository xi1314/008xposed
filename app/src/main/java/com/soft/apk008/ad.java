package com.soft.apk008;

import android.webkit.WebView;
import android.webkit.WebViewClient;

final class ad
  extends WebViewClient
{
  ad(HelpActivity paramHelpActivity) {}
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.ad
 * JD-Core Version:    0.7.0.1
 */