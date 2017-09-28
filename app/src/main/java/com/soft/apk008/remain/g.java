package com.soft.apk008.remain;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.HashMap;

final class g
  implements AdapterView.OnItemClickListener
{
  g(RecordSelectActivity paramRecordSelectActivity) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Intent();
    paramAdapterView.putExtra("name", (String)((HashMap)RecordSelectActivity.a(this.a).get(paramInt)).get("name"));
    this.a.setResult(1, paramAdapterView);
    this.a.finish();
  }
}


