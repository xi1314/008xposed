package com.soft.tools;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.lishu.b.a.a;
import com.soft.apk008.HistoryActivity;
import com.soft.apk008.SetMessageActivity;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.soft.toos.findApp.QuickFindActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

final class ck
  implements View.OnClickListener
{
  ck(QuickToolActivity paramQuickToolActivity) {}
  
  public final void onClick(View paramView)
  {
    QuickToolActivity.a(this.a).length();
    if (paramView.equals(QuickToolActivity.b(this.a)))
    {
      QuickToolActivity.a(this.a).length();
      if (QuickToolActivity.c(this.a).getSelectedItemPosition() == 0) {
        this.a.a();
      }
    }
    label56:
    do
    {
      do
      {
        boolean bool;
        do
        {
          do
          {
            do
            {
              do
              {
                break label56;
                break label56;
                break label56;
                break label56;
                do
                {
                  return;
                } while (QuickToolActivity.c(this.a).getSelectedItemPosition() != 1);
                this.a.b();
                return;
                if (!paramView.equals(QuickToolActivity.d(this.a))) {
                  break;
                }
                paramView = QuickToolActivity.e(this.a).getText().toString().split("_");
              } while (paramView.length != 2);
              paramView = paramView[1];
              ClearApplicationDataActivity.a(this.a, paramView);
              localObject = new Intent();
              ((Intent)localObject).setAction("com.soft.nowClear");
              ((Intent)localObject).putExtra("name", paramView);
              this.a.sendBroadcast((Intent)localObject);
              return;
              if (!paramView.equals(QuickToolActivity.f(this.a))) {
                break;
              }
            } while (QuickToolActivity.e(this.a).getText().toString().split("_").length != 2);
            SetSystemValueActivity.a(this.a);
            return;
            if (!paramView.equals(QuickToolActivity.g(this.a))) {
              break;
            }
          } while (QuickToolActivity.e(this.a).getText().toString().split("_").length != 2);
          RecordAppFileHandler.a(this.a, true);
          return;
          if (paramView.equals(QuickToolActivity.h(this.a)))
          {
            paramView = new Intent();
            paramView.setClass(this.a, QuickFindActivity.class);
            this.a.startActivityForResult(paramView, 1);
            return;
          }
          if (paramView.equals(QuickToolActivity.i(this.a)))
          {
            QuickToolActivity.j(this.a);
            return;
          }
          if (!paramView.equals(QuickToolActivity.k(this.a))) {
            break;
          }
          SetMessageActivity.a(this.a);
          bool = QuickToolActivity.l(this.a).isChecked();
          if (QuickToolActivity.m(this.a).isChecked())
          {
            this.a.a(bool);
            return;
          }
        } while (!bool);
        HistoryActivity.a();
        a.a(HistoryActivity.a, PoseHelper008.valueMap);
        return;
        if (!paramView.equals(QuickToolActivity.n(this.a))) {
          break;
        }
        paramView = QuickToolActivity.e(this.a).getText().toString().split("_");
      } while (paramView.length != 2);
      paramView = paramView[1];
      Object localObject = this.a.getPackageManager();
      new Intent();
      try
      {
        paramView = ((PackageManager)localObject).getLaunchIntentForPackage(paramView);
        this.a.startActivity(paramView);
        return;
      }
      catch (Exception paramView)
      {
        Toast.makeText(this.a, "未找到该应用", 0).show();
        return;
      }
    } while (!paramView.equals(QuickToolActivity.o(this.a)));
    paramView = new Intent();
    paramView.setClass(this.a, WebMessageActivity.class);
    paramView.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=simple_quick_help");
    this.a.startActivity(paramView);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ck
 * JD-Core Version:    0.7.0.1
 */