package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.lishu.b.a.a;
import com.soft.apk008.HistoryActivity;
import com.soft.apk008.remain.ReMainActivity;
import java.util.ArrayList;
import java.util.HashMap;

final class dk
  implements View.OnClickListener
{
  dk(dj paramdj, Activity paramActivity) {}
  
  public final void onClick(View paramView)
  {
    if (paramView.equals(dj.a(this.a)))
    {
      paramView = new Intent();
      paramView.setClass(this.b, HistoryActivity.class);
      this.b.startActivityForResult(paramView, 2);
    }
    do
    {
      return;
      if (paramView.equals(dj.b(this.a)))
      {
        dj localdj = this.a;
        Activity localActivity = this.b;
        String str = "nowHistoryIndex" + HistoryActivity.a;
        localdj.a = er.a(localActivity, str);
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(localActivity);
        localBuilder.setTitle("历史记录轮询");
        ArrayList localArrayList;
        if (localdj.a.trim().length() == 0)
        {
          localArrayList = (ArrayList)a.a.get(HistoryActivity.a);
          paramView = localArrayList;
          if (localArrayList == null) {
            paramView = new ArrayList();
          }
          localBuilder.setMessage("当前还未开始，请点击下一步/总共" + paramView.size() + "条数据");
          localdj.a = "0";
        }
        for (;;)
        {
          localArrayList = (ArrayList)a.a.get(HistoryActivity.a);
          paramView = localArrayList;
          if (localArrayList == null) {
            paramView = new ArrayList();
          }
          if (paramView.size() != 0) {
            break;
          }
          Toast.makeText(localActivity, "当前没有历史记录", 0).show();
          return;
          int i = Integer.parseInt(localdj.a);
          localArrayList = (ArrayList)a.a.get(HistoryActivity.a);
          paramView = localArrayList;
          if (localArrayList == null) {
            paramView = new ArrayList();
          }
          localBuilder.setMessage("当前为" + (i + 1) + "/总共" + paramView.size() + "条数据");
        }
        if (Integer.parseInt(localdj.a) >= paramView.size()) {
          localdj.a = "0";
        }
        localBuilder.setNegativeButton("上一条", new dl(localdj, localActivity, str));
        localBuilder.setPositiveButton("下一条", new dm(localdj, localActivity, str));
        localBuilder.setNeutralButton("第一条", new dn(localdj, localActivity, str));
        localBuilder.create().show();
        return;
      }
      if (paramView.equals(dj.c(this.a)))
      {
        paramView = new Intent();
        paramView.setClass(this.b, ReMainActivity.class);
        this.b.startActivityForResult(paramView, 3);
        return;
      }
    } while (!paramView.equals(dj.d(this.a)));
    paramView = new Intent();
    paramView.setClass(this.b, BackupFileActivity.class);
    this.b.startActivity(paramView);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.dk
 * JD-Core Version:    0.7.0.1
 */