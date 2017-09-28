package com.soft.toos.findApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public final class b
  extends BaseAdapter
{
  private Context a;
  private List b;
  
  public b(Context paramContext, List paramList)
  {
    this.a = paramContext;
    this.b = paramList;
  }
  
  public final int getCount()
  {
    return this.b.size();
  }
  
  public final Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str = ((a)this.b.get(paramInt)).a;
    if (paramView == null)
    {
      paramViewGroup = new a((byte)0);
      paramView = LayoutInflater.from(this.a).inflate(2130903132, null);
      a.a(paramViewGroup, (TextView)paramView.findViewById(2131362221));
      a.b(paramViewGroup, (TextView)paramView.findViewById(2131362222));
      paramView.setTag(paramViewGroup);
    }
    while (str.length() == 1)
    {
      a.a(paramViewGroup).setText(((a)this.b.get(paramInt)).a);
      a.a(paramViewGroup).setVisibility(0);
      a.b(paramViewGroup).setVisibility(8);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
    a.b(paramViewGroup).setText(((a)this.b.get(paramInt)).a);
    a.b(paramViewGroup).setTag(((a)this.b.get(paramInt)).c);
    a.b(paramViewGroup).setBackgroundResource(2130837506);
    a.b(paramViewGroup).setVisibility(0);
    a.a(paramViewGroup).setVisibility(8);
    return paramView;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    if (((a)this.b.get(paramInt)).a.length() == 1) {
      return false;
    }
    return super.isEnabled(paramInt);
  }
  
  private final class a
  {
    private TextView b;
    private TextView c;
    
    private a() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.toos.findApp.Inttolong

 * JD-Core Version:    0.7.0.1

 */