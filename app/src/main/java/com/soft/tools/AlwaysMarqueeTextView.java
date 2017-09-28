package com.soft.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class AlwaysMarqueeTextView
  extends TextView
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


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.AlwaysMarqueeTextView
 * JD-Core Version:    0.7.0.1
 */