package com.a.a;

import com.a.a.c.j;
import com.a.a.Map.k;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class b
  extends maputils
  implements c, Serializable, Cloneable, List, RandomAccess
{
  protected transient Object object;
  protected transient Type type;
  private final List list;
  
  public b()
  {
    this.list = new ArrayList(10);
  }
  
  public b(int paramInt)
  {
    this.list = new ArrayList(paramInt);
  }
  
  private b(List paramList)
  {
    this.list = paramList;
  }
  
  public final Map a(int paramInt)
  {
    Object localObject = this.list.get(paramInt);
    if ((localObject instanceof Map)) {
      return (Map)localObject;
    }
    return (Map)a.a(localObject, j.a());
  }
  
  public final Object a(int paramInt, Class paramClass)
  {
    return k.a(this.list.get(paramInt), paramClass);
  }
  
  public final void a(Type paramType)
  {
    this.type = paramType;
  }
  
  public void add(int paramInt, Object paramObject)
  {
    this.list.add(paramInt, paramObject);
  }
  
  public boolean add(Object paramObject)
  {
    return this.list.add(paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    return this.list.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    return this.list.addAll(paramCollection);
  }
  
  public final b b(int paramInt)
  {
    Object localObject = this.list.get(paramInt);
    if ((localObject instanceof b)) {
      return (b)localObject;
    }
    return (b)a.a(localObject, j.a());
  }
  
  public final Object b()
  {
    return this.object;
  }
  
  public final void b(Object paramObject)
  {
    this.object = paramObject;
  }
  
  public final Integer c(int paramInt)
  {
    return k.j(get(paramInt));
  }
  
  public final Type c()
  {
    return this.type;
  }
  
  public void clear()
  {
    this.list.clear();
  }
  
  public Object clone()
  {
    return new b(new ArrayList(this.list));
  }
  
  public boolean contains(Object paramObject)
  {
    return this.list.contains(paramObject);
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return this.list.containsAll(paramCollection);
  }
  
  public final Long d(int paramInt)
  {
    return k.i(get(paramInt));
  }
  
  public final String e(int paramInt)
  {
    return k.a(get(paramInt));
  }
  
  public boolean equals(Object paramObject)
  {
    return this.list.equals(paramObject);
  }
  
  public Object get(int paramInt)
  {
    return this.list.get(paramInt);
  }
  
  public int hashCode()
  {
    return this.list.hashCode();
  }
  
  public int indexOf(Object paramObject)
  {
    return this.list.indexOf(paramObject);
  }
  
  public boolean isEmpty()
  {
    return this.list.isEmpty();
  }
  
  public Iterator iterator()
  {
    return this.list.iterator();
  }
  
  public int lastIndexOf(Object paramObject)
  {
    return this.list.lastIndexOf(paramObject);
  }
  
  public ListIterator listIterator()
  {
    return this.list.listIterator();
  }
  
  public ListIterator listIterator(int paramInt)
  {
    return this.list.listIterator(paramInt);
  }
  
  public Object remove(int paramInt)
  {
    return this.list.remove(paramInt);
  }
  
  public boolean remove(Object paramObject)
  {
    return this.list.remove(paramObject);
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    return this.list.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return this.list.retainAll(paramCollection);
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    return this.list.set(paramInt, paramObject);
  }
  
  public int size()
  {
    return this.list.size();
  }
  
  public List subList(int paramInt1, int paramInt2)
  {
    return this.list.subList(paramInt1, paramInt2);
  }
  
  public Object[] toArray()
  {
    return this.list.toArray();
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.list.toArray(paramArrayOfObject);
  }
}

