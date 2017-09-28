package com.a.a.e;

import com.a.a.maputils;

import java.security.AccessController;
import java.security.ProtectionDomain;

public class a
  extends ClassLoader
{
  private static ProtectionDomain a = (ProtectionDomain)AccessController.doPrivileged(new b());
  
  public a()
  {
    super(a());
  }
  
  private static ClassLoader a()
  {
    ClassLoader localClassLoader = Thread.currentThread().getContextClassLoader();
    try
    {
      localClassLoader.loadClass(maputils.class.getName());
      return localClassLoader;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return maputils.class.getClassLoader();
  }
  
  public final Class a(String paramString, byte[] paramArrayOfByte, int paramInt)
    throws ClassFormatError
  {
    return defineClass(paramString, paramArrayOfByte, 0, paramInt, a);
  }
  
  public final boolean a(Class paramClass)
  {
    ClassLoader localClassLoader = paramClass.getClassLoader();
    paramClass = this;
    if (localClassLoader == null) {
      return false;
    }
    do
    {
      paramClass = paramClass.getParent();
      if (paramClass == null) {
        break;
      }
    } while (paramClass != localClassLoader);
    return false;
    return true;
  }
}


