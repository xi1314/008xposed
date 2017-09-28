package com.a.a.c.a;

import com.a.a.c.c;
import com.a.a.c.e;
import com.a.a.c.g;
import com.a.a.runtimeexception;

import java.lang.reflect.Type;

public final class aw
  implements aq
{
  public static final aw a = new aw();
  
  public final Object a(c paramc, Type paramType, Object paramObject)
  {
    e locale = paramc.k();
    if (locale.c() == 8)
    {
      locale.a();
      return null;
    }
    if ((locale.c() != 12) && (locale.c() != 16)) {
      throw new runtimeexception("syntax error: " + g.a(locale.c()));
    }
    Object localObject3 = null;
    Object localObject2 = null;
    Type localType = null;
    int j = 0;
    Object localObject1;
    int i;
    label131:
    do
    {
      paramType = locale.a(paramc.b());
      if (paramType != null) {
        break;
      }
      if (locale.c() == 13)
      {
        locale.a(16);
        localObject1 = localObject3;
        paramObject = localObject2;
        paramType = localType;
        i = j;
        return new StackTraceElement((String)localObject1, paramObject, paramType, i);
      }
    } while ((locale.c() == 16) && (locale.a(com.a.a.c.d.g)));
    locale.b(4);
    if (paramType == "className") {
      if (locale.c() == 8)
      {
        localObject1 = null;
        paramObject = localObject2;
        paramType = localType;
        i = j;
      }
    }
    label595:
    label605:
    do
    {
      String str;
      do
      {
        for (;;)
        {
          j = i;
          localType = paramType;
          localObject2 = paramObject;
          localObject3 = localObject1;
          if (locale.c() != 13) {
            break;
          }
          locale.a(16);
          break label131;
          if (locale.c() == 4)
          {
            localObject1 = locale.s();
            i = j;
            paramType = localType;
            paramObject = localObject2;
          }
          else
          {
            throw new runtimeexception("syntax error");
            if (paramType == "methodName")
            {
              if (locale.c() == 8)
              {
                paramObject = null;
                i = j;
                paramType = localType;
                localObject1 = localObject3;
              }
              else if (locale.c() == 4)
              {
                paramObject = locale.s();
                i = j;
                paramType = localType;
                localObject1 = localObject3;
              }
              else
              {
                throw new runtimeexception("syntax error");
              }
            }
            else if (paramType == "fileName")
            {
              if (locale.c() == 8)
              {
                paramType = null;
                i = j;
                paramObject = localObject2;
                localObject1 = localObject3;
              }
              else if (locale.c() == 4)
              {
                paramType = locale.s();
                i = j;
                paramObject = localObject2;
                localObject1 = localObject3;
              }
              else
              {
                throw new runtimeexception("syntax error");
              }
            }
            else if (paramType == "lineNumber")
            {
              if (locale.c() == 8)
              {
                i = 0;
                paramType = localType;
                paramObject = localObject2;
                localObject1 = localObject3;
              }
              else if (locale.c() == 2)
              {
                i = locale.p();
                paramType = localType;
                paramObject = localObject2;
                localObject1 = localObject3;
              }
              else
              {
                throw new runtimeexception("syntax error");
              }
            }
            else
            {
              if (paramType != "nativeMethod") {
                break label605;
              }
              if (locale.c() == 8)
              {
                locale.a(16);
                i = j;
                paramType = localType;
                paramObject = localObject2;
                localObject1 = localObject3;
              }
              else if (locale.c() == 6)
              {
                locale.a(16);
                i = j;
                paramType = localType;
                paramObject = localObject2;
                localObject1 = localObject3;
              }
              else
              {
                if (locale.c() != 7) {
                  break label595;
                }
                locale.a(16);
                i = j;
                paramType = localType;
                paramObject = localObject2;
                localObject1 = localObject3;
              }
            }
          }
        }
        throw new runtimeexception("syntax error");
        if (paramType != a.a) {
          break label711;
        }
        if (locale.c() != 4) {
          break label677;
        }
        str = locale.s();
        i = j;
        paramType = localType;
        paramObject = localObject2;
        localObject1 = localObject3;
      } while (str.equals("java.lang.StackTraceElement"));
      throw new runtimeexception("syntax error : " + str);
      i = j;
      paramType = localType;
      paramObject = localObject2;
      localObject1 = localObject3;
    } while (locale.c() == 8);
    label677:
    throw new runtimeexception("syntax error");
    label711:
    throw new runtimeexception("syntax error : " + paramType);
  }
  
  public final int a_()
  {
    return 12;
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.aw

 * JD-Core Version:    0.7.0.1

 */