package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.soft.apk008.SetDataActivity;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import de.robv.android.xposed.mods.tutorial.CheckCanUse;

public class ToolMainActivity
  extends Activity
{
  private String c = "a";
  public OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      paramAnonymousView = paramAnonymousView.getTag();
      int i;
      if (paramAnonymousView.equals(Integer.valueOf(1)))
      {
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(ToolMainActivity.this, UnInstallActivity.class);
        i = 0;
        if (i >= SetDataActivity.c.length()) {
          ToolMainActivity.this.startActivity(paramAnonymousView);
        }
      }
      do
      {
        return;
        ToolMainActivity localToolMainActivity = ToolMainActivity.this;
        localToolMainActivity.c += CheckCanUse.f.length();
        i += 1;
        break;
        if (paramAnonymousView.equals(Integer.valueOf(2)))
        {
          CheckCanUse.u.length();
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, ClearApplicationDataActivity.class);
          i = 0;
          for (;;)
          {
            if (i >= CheckCanUse.c.length())
            {
              ToolMainActivity.this.startActivity(paramAnonymousView);
              return;
            }
            localToolMainActivity = ToolMainActivity.this;
            localToolMainActivity.c += CheckCanUse.f.length();
            i += 1;
          }
        }
        if (paramAnonymousView.equals(Integer.valueOf(3)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, HideProgressActivity.class);
          i = 0;
          for (;;)
          {
            if (i >= CheckCanUse.c.length())
            {
              ToolMainActivity.this.startActivity(paramAnonymousView);
              return;
            }
            localToolMainActivity = ToolMainActivity.this;
            localToolMainActivity.c += SetDataActivity.u.length();
            i += 1;
          }
        }
        if (paramAnonymousView.equals(Integer.valueOf(4)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, RecordAppFileHandler.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
        if (paramAnonymousView.equals(Integer.valueOf(5)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, KillBackGroundActivity.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
        if (paramAnonymousView.equals(Integer.valueOf(6)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, SetSystemValueActivity.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
        if (paramAnonymousView.equals(Integer.valueOf(7)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, InstallActivity.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
        if (paramAnonymousView.equals(Integer.valueOf(8)))
        {
          paramAnonymousView = new Intent();
          i = 0;
          for (;;)
          {
            if (i >= CheckCanUse.c.length())
            {
              paramAnonymousView.setClass(ToolMainActivity.this, QuickToolActivity.class);
              ToolMainActivity.this.startActivity(paramAnonymousView);
              i = 0;
              while (i < CheckCanUse.c.length())
              {
                paramAnonymousView = ToolMainActivity.this;
                paramAnonymousView.c += SetDataActivity.c.length();
                i += 1;
              }
              break;
            }
            localToolMainActivity = ToolMainActivity.this;
            localToolMainActivity.c += SetDataActivity.u.length();
            i += 1;
          }
        }
        if (paramAnonymousView.equals(Integer.valueOf(9)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, WebViewHookActivity.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
        if (paramAnonymousView.equals(Integer.valueOf(10)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, GetAllApkActivity.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
        if (paramAnonymousView.equals(Integer.valueOf(11)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, RemoteVpnActivity.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
        if (paramAnonymousView.equals(Integer.valueOf(12)))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(ToolMainActivity.this, SetNetAddressActivity.class);
          ToolMainActivity.this.startActivity(paramAnonymousView);
          return;
        }
      } while (!paramAnonymousView.equals(Integer.valueOf(13)));
      paramAnonymousView = new Intent();
      paramAnonymousView.setClass(ToolMainActivity.this, BackupFileActivity.class);
      ToolMainActivity.this.startActivity(paramAnonymousView);
    }
  };
  private LinearLayout view_con;
  
  public Button addButton(String paramString)
  {
    Button localButton = new Button(this);
    localButton.setText(paramString);
    paramString = new LayoutParams(-1, -2);
    this.view_con.addView(localButton, paramString);
    int i = 0;
    for (;;)
    {
      if (i >= SetDataActivity.c.length()) {
        return localButton;
      }
      this.c += CheckCanUse.a.length();
      i += 1;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    String str = "a";
    int i = 0;
    if (i >= SetDataActivity.c.length())
    {
      super.onCreate(paramBundle);
      this.view_con = new LinearLayout(this);
      this.view_con.setOrientation(1);
      paramBundle = addButton("一键静默卸载");
      paramBundle.setTag(Integer.valueOf(1));
      paramBundle.setOnClickListener(this.listener);
      paramBundle = addButton("一键数据清除（同时关闭应用）");
      paramBundle.setTag(Integer.valueOf(2));
      paramBundle.setOnClickListener(this.listener);
      paramBundle = addButton("一键关闭应用");
      paramBundle.setTag(Integer.valueOf(5));
      paramBundle.setOnClickListener(this.listener);
      paramBundle = addButton("一键安装应用");
      paramBundle.setTag(Integer.valueOf(7));
      paramBundle.setOnClickListener(this.listener);
      paramBundle.setVisibility(8);
      paramBundle = addButton("一键删除apk");
      paramBundle.setTag(Integer.valueOf(10));
      paramBundle.setOnClickListener(this.listener);
      paramBundle = addButton("远程vpn");
      paramBundle.setTag(Integer.valueOf(11));
      paramBundle.setOnClickListener(this.listener);
      if (StartActivity.functionStr.indexOf("remoteVpn") < 0) {
        paramBundle.setVisibility(8);
      }
      paramBundle = addButton("监听webView");
      paramBundle.setTag(Integer.valueOf(9));
      paramBundle.setOnClickListener(this.listener);
      if (StartActivity.functionStr.indexOf("webView") < 0) {
        paramBundle.setVisibility(8);
      }
      paramBundle = addButton("屏蔽进程和已安装程序列表");
      paramBundle.setTag(Integer.valueOf(3));
      paramBundle.setOnClickListener(this.listener);
      paramBundle = addButton("监听应用文件操作");
      paramBundle.setTag(Integer.valueOf(4));
      paramBundle.setOnClickListener(this.listener);
      Button localButton1 = addButton("监听系统值设置");
      localButton1.setTag(Integer.valueOf(6));
      localButton1.setOnClickListener(this.listener);
      Button localButton2 = addButton("快捷操作");
      localButton2.setTag(Integer.valueOf(8));
      localButton2.setOnClickListener(this.listener);
      Button localButton3 = addButton("设置网络接口");
      localButton3.setTag(Integer.valueOf(12));
      localButton3.setOnClickListener(this.listener);
      Button localButton4 = addButton("备份");
      localButton4.setTag(Integer.valueOf(13));
      localButton4.setOnClickListener(this.listener);
      if (StartActivity.functionStr.indexOf("myNet") < 0) {
        localButton3.setVisibility(8);
      }
      if (!StartActivity.isVip)
      {
        paramBundle.setVisibility(4);
        localButton1.setVisibility(4);
        localButton2.setVisibility(8);
      }
      if (StartActivity.functionStr.indexOf("backUp") < 0) {
        localButton4.setVisibility(8);
      }
      if (StartActivity.systemData.size() != 0) {
        break label504;
      }
      finish();
    }
    for (;;)
    {
      return;
      str = str + SetDataActivity.a.length();
      i += 1;
      break;
      label504:
      setContentView(this.view_con);
      i = 0;
      while (i < str.length())
      {
        SetDataActivity.a.length();
        i += 1;
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165190, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230981)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, WebMessageActivity.class);
      paramMenuItem.putExtra("url", StartActivity.baseUrl + "/phone/ContentAction.action?action=high_level");
      startActivity(paramMenuItem);
    }
    return true;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     ToolMainActivity

 * JD-Core Version:    0.7.0.1

 */