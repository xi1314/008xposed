package com.imengququ.myxposed.soft.toos.findApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class ListViewAdapter
  extends BaseAdapter
{
  private Context context;
  private List<App> list;
  private ViewHolder viewHolder;
  
  public ListViewAdapter(Context paramContext, List<App> paramList)
  {
    this.context = paramContext;
    this.list = paramList;
  }
  
  public int getCount()
  {
    return this.list.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.list.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str = ((App)this.list.get(paramInt)).getName();
    if (paramView == null)
    {
      paramViewGroup = new ViewHolder(null);
      paramView = LayoutInflater.from(this.context).inflate(2130903090, null);
      paramViewGroup.indexTv = ((TextView)paramView.findViewById(2131230945));
      paramViewGroup.itemTv = ((TextView)paramView.findViewById(2131230946));
      paramView.setTag(paramViewGroup);
    }
    while (str.length() == 1)
    {
      paramViewGroup.indexTv.setText(((App)this.list.get(paramInt)).getName());
      paramViewGroup.indexTv.setVisibility(0);
      paramViewGroup.itemTv.setVisibility(8);
      return paramView;
      paramViewGroup = (ViewHolder)paramView.getTag();
    }
    paramViewGroup.itemTv.setText(((App)this.list.get(paramInt)).getName());
    paramViewGroup.itemTv.setTag(((App)this.list.get(paramInt)).getPackAgeName());
    paramViewGroup.itemTv.setBackgroundResource(2130837505);
    paramViewGroup.itemTv.setVisibility(0);
    paramViewGroup.indexTv.setVisibility(8);
    return paramView;
  }
  
  public boolean isEnabled(int paramInt)
  {
    if (((App)this.list.get(paramInt)).getName().length() == 1) {
      return false;
    }
    return super.isEnabled(paramInt);
  }
  
  private class ViewHolder
  {
    private TextView indexTv;
    private TextView itemTv;
    
    private ViewHolder() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     ListViewAdapter

 * JD-Core Version:    0.7.0.1

 */