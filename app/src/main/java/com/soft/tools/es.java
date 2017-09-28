package com.soft.tools;

import android.content.Intent;
import android.view.View;

import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.remainNew.NewReMainToolActivity;
import com.soft.tools.accountSim.AccountSimActivity;
import com.soft.tools.messageAndContacts.MessageAndContactsCreateActivity;
import com.soft.tools.packageSim.PackAgeSimActivity;
import com.soft.tools.yunData.YunDataActivity;
import de.robv.android.xposed.mods.tutorial.checktime;

final class es
  implements View.OnClickListener
{
  es(ToolMainActivity paramToolMainActivity) {}
  
  public final void onClick(View paramView)
  {
    int k = 0;
    int m = 0;
    int j = 0;
    int i = 0;
    paramView = paramView.getTag();
    if (paramView.equals(Integer.valueOf(1)))
    {
      paramView = new Intent();
      paramView.setClass(this.a, UnInstallActivity.class);
      if (i >= SetMessageActivity.e.length()) {
        this.a.startActivity(paramView);
      }
    }
    do
    {
      return;
      ToolMainActivity localToolMainActivity = this.a;
      ToolMainActivity.a(localToolMainActivity, ToolMainActivity.a(localToolMainActivity) + checktime.b.length());
      i += 1;
      break;
      if (paramView.equals(Integer.valueOf(2)))
      {
        checktime.g.length();
        paramView = new Intent();
        paramView.setClass(this.a, ClearApplicationDataActivity.class);
        i = k;
        for (;;)
        {
          if (i >= checktime.d.length())
          {
            this.a.startActivity(paramView);
            return;
          }
          localToolMainActivity = this.a;
          ToolMainActivity.a(localToolMainActivity, ToolMainActivity.a(localToolMainActivity) + checktime.b.length());
          i += 1;
        }
      }
      if (paramView.equals(Integer.valueOf(3)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, HideProgressActivity.class);
        i = m;
        for (;;)
        {
          if (i >= checktime.d.length())
          {
            this.a.startActivity(paramView);
            return;
          }
          localToolMainActivity = this.a;
          ToolMainActivity.a(localToolMainActivity, ToolMainActivity.a(localToolMainActivity) + SetMessageActivity.h.length());
          i += 1;
        }
      }
      if (paramView.equals(Integer.valueOf(4)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, RecordAppFileHandler.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(5)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, KillBackGroundActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(6)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, SetSystemValueActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(7)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, InstallActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(8)))
      {
        paramView = new Intent();
        i = 0;
        for (;;)
        {
          if (i >= checktime.d.length())
          {
            paramView.setClass(this.a, QuickToolActivity.class);
            this.a.startActivity(paramView);
            i = j;
            while (i < checktime.d.length())
            {
              paramView = this.a;
              ToolMainActivity.a(paramView, ToolMainActivity.a(paramView) + SetMessageActivity.e.length());
              i += 1;
            }
            break;
          }
          localToolMainActivity = this.a;
          ToolMainActivity.a(localToolMainActivity, ToolMainActivity.a(localToolMainActivity) + SetMessageActivity.h.length());
          i += 1;
        }
      }
      if (paramView.equals(Integer.valueOf(9)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, WebViewHookActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(10)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, GetAllApkActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(11)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, RemoteVpnActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(12)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, SetNetAddressActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(13)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, BackupFileActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(14)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, DeleteFolderActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(15)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, FindPhoneDataActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(16)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, YunDataActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(17)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, FolderBackUpActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(18)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, MyWifiNameActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(19)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, IpRecordActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(20)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, PackAgeSimActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(21)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, MessageAndContactsCreateActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(22)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, AccountSimActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(23)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, NewReMainToolActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(24)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, DepthSetActivity.class);
        this.a.startActivity(paramView);
        return;
      }
      if (paramView.equals(Integer.valueOf(25)))
      {
        paramView = new Intent();
        paramView.setClass(this.a, PhoneNetWorkActivity.class);
        this.a.startActivity(paramView);
        return;
      }
    } while (!paramView.equals(Integer.valueOf(26)));
    paramView = new Intent();
    paramView.setClass(this.a, SelectManuActivity.class);
    this.a.startActivity(paramView);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.es

 * JD-Core Version:    0.7.0.1

 */