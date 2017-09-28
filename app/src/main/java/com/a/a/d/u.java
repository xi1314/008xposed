package com.a.a.d;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;

public final class u
  implements bb
{
  public static final u a = new u();
  
  public final void a(ap paramap, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    if (paramObject1 == null) {}
    try
    {
      paramap.k();
      return;
    }
    catch (SQLException paramap)
    {
      throw new IOException("write clob error", paramap);
    }
    paramObject1 = ((Clob)paramObject1).getCharacterStream();
    paramObject2 = new StringWriter();
    paramType = new char[1024];
    for (;;)
    {
      int i = paramObject1.read(paramType);
      if (i == -1) {
        break;
      }
      paramObject2.write(paramType, 0, i);
    }
    paramObject1.close();
    paramap.a(paramObject2.toString());
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.getMap.u

 * JD-Core Version:    0.7.0.1

 */