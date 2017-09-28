package com.soft.apk008.remain;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

final class h
  implements AdapterView.OnItemLongClickListener
{
  h(RecordSelectActivity paramRecordSelectActivity) {}
  
  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new AlertDialog.Builder(this.a);
    paramAdapterView.setTitle("提示");
    paramAdapterView.setMessage("是否删除本分类");
    paramAdapterView.setNegativeButton("确定", new i(this, paramInt));
    paramAdapterView.setPositiveButton("取消", new l(this));
    paramAdapterView.create().show();
    return true;
  }
}

