package com.imengququ.myxposed.soft.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class AlwaysMarqueeTextView
  extends android.support.v7.widget.AppCompatTextView
{
  public AlwaysMarqueeTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public AlwaysMarqueeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AlwaysMarqueeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean isFocused()
  {
    return true;
  }
}


