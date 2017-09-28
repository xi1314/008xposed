package com.a.a.d;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

public final class bh
  implements bb
{
  public static final bh a = new bh();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if ((paramObject1 instanceof AtomicReference)) {}
    for (paramObject1 = ((AtomicReference)paramObject1).get();; paramObject1 = ((Reference)paramObject1).get())
    {
      paramap.c(paramObject1);
      return;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.bh

 * JD-Core Version:    0.7.0.1

 */