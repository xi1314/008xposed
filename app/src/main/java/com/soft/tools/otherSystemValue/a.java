package com.soft.tools.otherSystemValue;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.a.a.Map;

final class a
  implements View.OnClickListener
{
  a(OtherSystemValueActivity.a parama, Map parame) {}
  
  public final void onClick(View paramView)
  {
    paramView = new AlertDialog.Builder(OtherSystemValueActivity.a.a(this.a));
    paramView.setTitle("模式设置");
    ListView localListView = new ListView(OtherSystemValueActivity.a.a(this.a));
    localListView.setAdapter(new ArrayAdapter(OtherSystemValueActivity.a.a(this.a), 17367043, new String[] { "设置值", "随机值", "随机设置值" }));
    paramView.setView(localListView);
    paramView.setNegativeButton("取消", new b(this));
    localListView.setOnItemClickListener(new c(this, this.b));
    paramView.create().show();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.otherSystemValue.XhookMethod

 * JD-Core Version:    0.7.0.1

 */