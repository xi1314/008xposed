package com.a.a.c.a;

import com.a.a.b.h;
import com.a.a.c.d;
import com.a.a.c.i;
import com.a.a.c.k;
import com.a.a.Map.f;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

public final class a
{
  private static final a a = new a();
  private com.a.a.Map.a b = new com.a.a.Map.a();
  private final AtomicLong c = new AtomicLong();
  
  public static final a a()
  {
    return a;
  }
  
  private static void a(com.a.a.b.c paramc, a parama)
  {
    if (parama.b().size() == 0) {
      return;
    }
    Object localObject1 = parama.b().iterator();
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localObject3 = (f)((Iterator)localObject1).next();
        localObject2 = ((f)localObject3).b();
        localObject3 = ((f)localObject3).c();
        if (localObject2 == Character.TYPE) {
          break;
        }
        if (Collection.class.isAssignableFrom((Class)localObject2))
        {
          if (!(localObject3 instanceof ParameterizedType)) {
            break;
          }
          if (!(((ParameterizedType)localObject3).getActualTypeArguments()[0] instanceof Class)) {
            return;
          }
        }
      }
    }
    Collections.sort(parama.b());
    paramc = paramc.b("deserialze", "(" + com.a.a.Map.c.a(com.a.a.c.c.class) + com.a.a.Map.c.a(Type.class) + "Ljava/lang/Object;)Ljava/lang/Object;", null);
    localObject1 = new com.a.a.b.g();
    Object localObject2 = new com.a.a.b.g();
    Object localObject3 = new com.a.a.b.g();
    com.a.a.b.g localg1 = new com.a.a.b.g();
    paramc.b(25, 1);
    paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getLexer", "()" + com.a.a.Map.c.a(com.a.a.c.e.class));
    paramc.b(58, parama.b("lexer"));
    paramc.b(25, parama.b("lexer"));
    paramc.a(178, com.a.a.Map.c.b(d.class), "SortFeidFastMatch", "L" + com.a.a.Map.c.b(d.class) + ";");
    paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "isEnabled", "(L" + com.a.a.Map.c.b(d.class) + ";)Z");
    paramc.a(153, (com.a.a.b.g)localObject2);
    paramc.b(25, parama.b("lexer"));
    paramc.a(parama.d().getName());
    paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanType", "(Ljava/lang/String;)I");
    paramc.a(178, com.a.a.Map.c.b(com.a.a.c.e.class), "NOT_MATCH", "I");
    paramc.a(159, (com.a.a.b.g)localObject2);
    paramc.b(25, 1);
    paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getContext", "()Lcom/alibaba/fastjson/parser/ParseContext;");
    paramc.b(58, parama.b("mark_context"));
    paramc.a(3);
    paramc.b(54, parama.b("matchedCount"));
    if (Modifier.isPublic(parama.c().a().getModifiers()))
    {
      paramc.a(187, com.a.a.Map.c.b(parama.d()));
      paramc.a(89);
      paramc.b(183, com.a.a.Map.c.b(parama.d()), "<init>", "()V");
      paramc.b(58, parama.b("instance"));
    }
    int j;
    for (;;)
    {
      paramc.b(25, 1);
      paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getContext", "()" + com.a.a.Map.c.a(i.class));
      paramc.b(58, parama.b("context"));
      paramc.b(25, 1);
      paramc.b(25, parama.b("context"));
      paramc.b(25, parama.b("instance"));
      paramc.b(25, 3);
      paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "setContext", "(" + com.a.a.Map.c.a(i.class) + "Ljava/lang/Object;Ljava/lang/Object;)" + com.a.a.Map.c.a(i.class));
      paramc.b(58, parama.b("childContext"));
      paramc.b(25, parama.b("lexer"));
      paramc.a(180, com.a.a.Map.c.b(com.a.a.c.e.class), "matchStat", "I");
      paramc.a(178, com.a.a.Map.c.b(com.a.a.c.e.class), "END", "I");
      paramc.a(159, (com.a.a.b.g)localObject3);
      paramc.a(3);
      paramc.a(54, parama.b("matchStat"));
      j = parama.b().size();
      i = 0;
      while (i < j)
      {
        paramc.a(3);
        paramc.b(54, parama.b("_asm_flag_" + i / 32));
        i += 32;
      }
      paramc.b(25, 0);
      paramc.b(25, 1);
      paramc.b(183, com.a.a.Map.c.b(b.class), "createInstance", "(" + com.a.a.Map.c.a(com.a.a.c.c.class) + ")Ljava/lang/Object;");
      paramc.a(192, com.a.a.Map.c.b(parama.d()));
      paramc.b(58, parama.b("instance"));
    }
    int i = 0;
    Object localObject4;
    Object localObject5;
    label1246:
    Object localObject6;
    if (i < j)
    {
      localObject4 = (f)parama.b().get(i);
      localObject5 = ((f)localObject4).b();
      if ((localObject5 == Boolean.TYPE) || (localObject5 == Byte.TYPE) || (localObject5 == Short.TYPE) || (localObject5 == Integer.TYPE))
      {
        paramc.a(3);
        paramc.b(54, parama.b(((f)localObject4).d() + "_asm"));
      }
      for (;;)
      {
        i += 1;
        break;
        if (localObject5 == Long.TYPE)
        {
          paramc.a(9);
          paramc.b(55, parama.a(((f)localObject4).d() + "_asm"));
        }
        else if (localObject5 == Float.TYPE)
        {
          paramc.a(11);
          paramc.b(56, parama.b(((f)localObject4).d() + "_asm"));
        }
        else
        {
          if (localObject5 != Double.TYPE) {
            break label1246;
          }
          paramc.a(14);
          paramc.b(57, parama.a(((f)localObject4).d() + "_asm"));
        }
      }
      if (localObject5 == String.class)
      {
        localObject6 = new com.a.a.b.g();
        paramc.b(25, parama.b("lexer"));
        paramc.a(178, com.a.a.Map.c.b(d.class), "InitStringFieldAsEmpty", "L" + com.a.a.Map.c.b(d.class) + ";");
        paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "isEnabled", "(L" + com.a.a.Map.c.b(d.class) + ";)Z");
        paramc.a(153, (com.a.a.b.g)localObject6);
        a(paramc, parama, i);
        paramc.a((com.a.a.b.g)localObject6);
        paramc.b(25, parama.b("lexer"));
        paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "stringDefaultValue", "()Ljava/lang/String;");
      }
      for (;;)
      {
        paramc.a(192, com.a.a.Map.c.b((Class)localObject5));
        paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
        break;
        paramc.a(1);
      }
    }
    i = 0;
    if (i < j)
    {
      localObject4 = (f)parama.b().get(i);
      localObject5 = ((f)localObject4).b();
      localObject6 = ((f)localObject4).c();
      com.a.a.b.g localg2 = new com.a.a.b.g();
      if (localObject5 == Boolean.TYPE)
      {
        paramc.b(25, parama.b("lexer"));
        paramc.b(25, 0);
        paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
        paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldBoolean", "([C)Z");
        paramc.b(54, parama.b(((f)localObject4).d() + "_asm"));
        label1654:
        paramc.b(25, parama.b("lexer"));
        paramc.a(180, com.a.a.Map.c.b(com.a.a.c.e.class), "matchStat", "I");
        localObject4 = new com.a.a.b.g();
        paramc.a(158, (com.a.a.b.g)localObject4);
        a(paramc, parama, i);
        paramc.a((com.a.a.b.g)localObject4);
        paramc.b(25, parama.b("lexer"));
        paramc.a(180, com.a.a.Map.c.b(com.a.a.c.e.class), "matchStat", "I");
        paramc.a(89);
        paramc.b(54, parama.b("matchStat"));
        paramc.a(178, com.a.a.Map.c.b(com.a.a.c.e.class), "NOT_MATCH", "I");
        paramc.a(159, (com.a.a.b.g)localObject1);
        paramc.b(25, parama.b("lexer"));
        paramc.a(180, com.a.a.Map.c.b(com.a.a.c.e.class), "matchStat", "I");
        paramc.a(158, localg2);
        paramc.b(21, parama.b("matchedCount"));
        paramc.a(4);
        paramc.a(96);
        paramc.b(54, parama.b("matchedCount"));
        paramc.b(25, parama.b("lexer"));
        paramc.a(180, com.a.a.Map.c.b(com.a.a.c.e.class), "matchStat", "I");
        paramc.a(178, com.a.a.Map.c.b(com.a.a.c.e.class), "END", "I");
        paramc.a(159, localg1);
        paramc.a(localg2);
        if (i == j - 1)
        {
          paramc.b(25, parama.b("lexer"));
          paramc.a(180, com.a.a.Map.c.b(com.a.a.c.e.class), "matchStat", "I");
          paramc.a(178, com.a.a.Map.c.b(com.a.a.c.e.class), "END", "I");
          paramc.a(160, (com.a.a.b.g)localObject1);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (localObject5 == Byte.TYPE)
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldInt", "([C)I");
          paramc.b(54, parama.b(((f)localObject4).d() + "_asm"));
          break label1654;
        }
        if (localObject5 == Short.TYPE)
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldInt", "([C)I");
          paramc.b(54, parama.b(((f)localObject4).d() + "_asm"));
          break label1654;
        }
        if (localObject5 == Integer.TYPE)
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldInt", "([C)I");
          paramc.b(54, parama.b(((f)localObject4).d() + "_asm"));
          break label1654;
        }
        if (localObject5 == Long.TYPE)
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldLong", "([C)J");
          paramc.b(55, parama.a(((f)localObject4).d() + "_asm"));
          break label1654;
        }
        if (localObject5 == Float.TYPE)
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldFloat", "([C)F");
          paramc.b(56, parama.b(((f)localObject4).d() + "_asm"));
          break label1654;
        }
        if (localObject5 == Double.TYPE)
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldDouble", "([C)D");
          paramc.b(57, parama.a(((f)localObject4).d() + "_asm"));
          break label1654;
        }
        if (localObject5 == String.class)
        {
          localObject5 = new com.a.a.b.g();
          paramc.a(21, parama.b("matchStat"));
          paramc.a(7);
          paramc.a(160, (com.a.a.b.g)localObject5);
          paramc.b(25, parama.b("lexer"));
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "stringDefaultValue", "()Ljava/lang/String;");
          paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
          paramc.a(167, localg2);
          paramc.a((com.a.a.b.g)localObject5);
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldString", "([C)Ljava/lang/String;");
          paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
          break label1654;
        }
        if (((Class)localObject5).isEnum())
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          localObject6 = new com.a.a.b.g();
          paramc.a(1);
          paramc.a(192, com.a.a.Map.c.b((Class)localObject5));
          paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
          paramc.b(25, 1);
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getSymbolTable", "()" + com.a.a.Map.c.a(k.class));
          paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldSymbol", "([C" + com.a.a.Map.c.a(k.class) + ")Ljava/lang/String;");
          paramc.a(89);
          paramc.b(58, parama.b(((f)localObject4).d() + "_asm_enumName"));
          paramc.a(198, (com.a.a.b.g)localObject6);
          paramc.b(25, parama.b(((f)localObject4).d() + "_asm_enumName"));
          paramc.b(184, com.a.a.Map.c.b((Class)localObject5), "valueOf", "(Ljava/lang/String;)" + com.a.a.Map.c.a((Class)localObject5));
          paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
          paramc.a((com.a.a.b.g)localObject6);
          break label1654;
        }
        if (Collection.class.isAssignableFrom((Class)localObject5))
        {
          paramc.b(25, parama.b("lexer"));
          paramc.b(25, 0);
          paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_prefix__", "[C");
          localObject6 = ((ParameterizedType)localObject6).getActualTypeArguments()[0];
          if ((localObject6 instanceof Class))
          {
            localObject6 = (Class)localObject6;
            if (!Modifier.isPublic(((Class)localObject6).getModifiers())) {
              throw new com.a.a.b.a("can not create ASMParser");
            }
            if (localObject6 == String.class)
            {
              paramc.a(com.a.a.b.j.a(com.a.a.Map.c.a((Class)localObject5)));
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "scanFieldStringArray", "([CLjava/lang/Class;)" + com.a.a.Map.c.a(Collection.class));
              paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
              break label1654;
            }
            com.a.a.b.g localg3 = new com.a.a.b.g();
            localg2 = new com.a.a.b.g();
            paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "matchField", "([C)Z");
            paramc.a(154, localg3);
            paramc.a(1);
            paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
            paramc.a(167, localg2);
            paramc.a(localg3);
            a(paramc, parama, i);
            localg3 = new com.a.a.b.g();
            paramc.b(25, 0);
            paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_list_item_deser__", com.a.a.Map.c.a(aq.class));
            paramc.a(199, localg3);
            paramc.b(25, 0);
            paramc.b(25, 1);
            paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getConfig", "()" + com.a.a.Map.c.a(com.a.a.c.j.class));
            paramc.a(com.a.a.b.j.a(com.a.a.Map.c.a((Class)localObject6)));
            paramc.b(182, com.a.a.Map.c.b(com.a.a.c.j.class), "getDeserializer", "(" + com.a.a.Map.c.a(Type.class) + ")" + com.a.a.Map.c.a(aq.class));
            paramc.a(181, parama.a(), ((f)localObject4).d() + "_asm_list_item_deser__", com.a.a.Map.c.a(aq.class));
            paramc.a(localg3);
            localg3 = new com.a.a.b.g();
            paramc.b(25, parama.b("lexer"));
            paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "token", "()I");
            paramc.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "NULL", "I");
            paramc.a(160, localg3);
            paramc.b(25, parama.b("lexer"));
            paramc.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "COMMA", "I");
            paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "nextToken", "(I)V");
            paramc.a(1);
            paramc.a(192, com.a.a.Map.c.b((Class)localObject5));
            paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
            paramc.a(localg3);
            paramc.b(25, parama.b("lexer"));
            paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "token", "()I");
            paramc.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "LBRACKET", "I");
            paramc.a(160, (com.a.a.b.g)localObject1);
            paramc.b(25, 0);
            paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_list_item_deser__", com.a.a.Map.c.a(aq.class));
            paramc.b(185, com.a.a.Map.c.b(aq.class), "getFastMatchToken", "()I");
            paramc.b(54, parama.b("fastMatchToken"));
            paramc.b(25, parama.b("lexer"));
            paramc.b(21, parama.b("fastMatchToken"));
            paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "nextToken", "(I)V");
            label4513:
            com.a.a.b.g localg4;
            if (((Class)localObject5).isAssignableFrom(ArrayList.class))
            {
              paramc.a(187, com.a.a.Map.c.b(ArrayList.class));
              paramc.a(89);
              paramc.b(183, com.a.a.Map.c.b(ArrayList.class), "<init>", "()V");
              paramc.a(192, com.a.a.Map.c.b((Class)localObject5));
              paramc.b(58, parama.b(((f)localObject4).d() + "_asm"));
              paramc.b(25, 1);
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getContext", "()" + com.a.a.Map.c.a(i.class));
              paramc.b(58, parama.b("listContext"));
              paramc.b(25, 1);
              paramc.b(25, parama.b(((f)localObject4).d() + "_asm"));
              paramc.a(((f)localObject4).d());
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)" + com.a.a.Map.c.a(i.class));
              paramc.a(87);
              localg3 = new com.a.a.b.g();
              localg4 = new com.a.a.b.g();
              paramc.a(3);
              paramc.b(54, parama.b("runningtaskinfolist"));
              paramc.a(localg3);
              paramc.b(25, parama.b("lexer"));
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "token", "()I");
              paramc.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "RBRACKET", "I");
              paramc.a(159, localg4);
              paramc.b(25, 0);
              paramc.a(180, parama.a(), ((f)localObject4).d() + "_asm_list_item_deser__", com.a.a.Map.c.a(aq.class));
              paramc.b(25, 1);
              paramc.a(com.a.a.b.j.a(com.a.a.Map.c.a((Class)localObject6)));
              paramc.b(21, parama.b("runningtaskinfolist"));
              paramc.b(184, com.a.a.Map.c.b(Integer.class), "valueOf", "(I)Ljava/lang/Integer;");
              paramc.b(185, com.a.a.Map.c.b(aq.class), "deserialze", "(" + com.a.a.Map.c.a(com.a.a.c.c.class) + "Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
              paramc.b(58, parama.b("list_item_value"));
              paramc.b(parama.b("runningtaskinfolist"));
              paramc.b(25, parama.b(((f)localObject4).d() + "_asm"));
              paramc.b(25, parama.b("list_item_value"));
              if (!((Class)localObject5).isInterface()) {
                break label5725;
              }
              paramc.b(185, com.a.a.Map.c.b((Class)localObject5), "add", "(Ljava/lang/Object;)Z");
            }
            for (;;)
            {
              paramc.a(87);
              paramc.b(25, 1);
              paramc.b(25, parama.b(((f)localObject4).d() + "_asm"));
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "checkListResolve", "(Ljava/util/Collection;)V");
              paramc.b(25, parama.b("lexer"));
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "token", "()I");
              paramc.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "COMMA", "I");
              paramc.a(160, localg3);
              paramc.b(25, parama.b("lexer"));
              paramc.b(21, parama.b("fastMatchToken"));
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "nextToken", "(I)V");
              paramc.a(167, localg3);
              paramc.a(localg4);
              paramc.b(25, 1);
              paramc.b(25, parama.b("listContext"));
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "setContext", "(" + com.a.a.Map.c.a(i.class) + ")V");
              paramc.b(25, parama.b("lexer"));
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "token", "()I");
              paramc.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "RBRACKET", "I");
              paramc.a(160, (com.a.a.b.g)localObject1);
              paramc.b(25, parama.b("lexer"));
              paramc.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "COMMA", "I");
              paramc.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "nextToken", "(I)V");
              paramc.a(localg2);
              if (i != j - 1) {
                break;
              }
              a(parama, paramc, (com.a.a.b.g)localObject1);
              break;
              if (((Class)localObject5).isAssignableFrom(LinkedList.class))
              {
                paramc.a(187, com.a.a.Map.c.b(LinkedList.class));
                paramc.a(89);
                paramc.b(183, com.a.a.Map.c.b(LinkedList.class), "<init>", "()V");
                break label4513;
              }
              if (((Class)localObject5).isAssignableFrom(HashSet.class))
              {
                paramc.a(187, com.a.a.Map.c.b(HashSet.class));
                paramc.a(89);
                paramc.b(183, com.a.a.Map.c.b(HashSet.class), "<init>", "()V");
                break label4513;
              }
              if (((Class)localObject5).isAssignableFrom(TreeSet.class))
              {
                paramc.a(187, com.a.a.Map.c.b(TreeSet.class));
                paramc.a(89);
                paramc.b(183, com.a.a.Map.c.b(TreeSet.class), "<init>", "()V");
                break label4513;
              }
              paramc.a(187, com.a.a.Map.c.b((Class)localObject5));
              paramc.a(89);
              paramc.b(183, com.a.a.Map.c.b((Class)localObject5), "<init>", "()V");
              break label4513;
              label5725:
              paramc.b(182, com.a.a.Map.c.b((Class)localObject5), "add", "(Ljava/lang/Object;)Z");
            }
          }
          throw new com.a.a.b.a("can not create ASMParser");
        }
        a(parama, paramc, (f)localObject4, (Class)localObject5, i);
        if (i == j - 1) {
          a(parama, paramc, (com.a.a.b.g)localObject1);
        }
      }
    }
    paramc.a(localg1);
    if ((!parama.d().isInterface()) && (!Modifier.isAbstract(parama.d().getModifiers()))) {
      a(parama, paramc);
    }
    paramc.a((com.a.a.b.g)localObject3);
    paramc.b(25, 1);
    paramc.b(25, parama.b("context"));
    paramc.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "setContext", "(" + com.a.a.Map.c.a(i.class) + ")V");
    localObject3 = new com.a.a.b.g();
    paramc.b(25, parama.b("childContext"));
    paramc.a(198, (com.a.a.b.g)localObject3);
    paramc.b(25, parama.b("childContext"));
    paramc.b(25, parama.b("instance"));
    paramc.b(182, com.a.a.Map.c.b(i.class), "setObject", "(Ljava/lang/Object;)V");
    paramc.a((com.a.a.b.g)localObject3);
    paramc.b(25, parama.b("instance"));
    paramc.a(176);
    paramc.a((com.a.a.b.g)localObject1);
    a(parama, paramc);
    paramc.b(25, 0);
    paramc.b(25, 1);
    paramc.b(25, 2);
    paramc.b(25, 3);
    paramc.b(25, parama.b("instance"));
    paramc.b(182, com.a.a.Map.c.b(b.class), "parseRest", "(" + com.a.a.Map.c.a(com.a.a.c.c.class) + com.a.a.Map.c.a(Type.class) + "Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");
    paramc.a(192, com.a.a.Map.c.b(parama.d()));
    paramc.a(176);
    paramc.a((com.a.a.b.g)localObject2);
    paramc.b(25, 0);
    paramc.b(25, 1);
    paramc.b(25, 2);
    paramc.b(25, 3);
    paramc.b(183, com.a.a.Map.c.b(b.class), "deserialze", "(" + com.a.a.Map.c.a(com.a.a.c.c.class) + com.a.a.Map.c.a(Type.class) + "Ljava/lang/Object;)Ljava/lang/Object;");
    paramc.a(176);
    paramc.c(5, parama.e());
  }
  
  private static void a(h paramh, a parama, int paramInt)
  {
    String str = "_asm_flag_" + paramInt / 32;
    paramh.b(21, parama.b(str));
    paramh.a(Integer.valueOf(1 << paramInt));
    paramh.a(128);
    paramh.b(54, parama.b(str));
  }
  
  private static void a(h paramh, f paramf)
  {
    if (paramf.e() != null)
    {
      paramh.b(182, com.a.a.Map.c.b(paramf.a()), paramf.e().getName(), com.a.a.Map.c.a(paramf.e()));
      if (!paramf.e().getReturnType().equals(Void.TYPE)) {
        paramh.a(87);
      }
      return;
    }
    paramh.a(181, com.a.a.Map.c.b(paramf.a()), paramf.f().getName(), com.a.a.Map.c.a(paramf.b()));
  }
  
  private static void a(a parama, h paramh)
  {
    int j = parama.b().size();
    int i = 0;
    if (i < j)
    {
      f localf = (f)parama.b().get(i);
      Class localClass = localf.b();
      Type localType = localf.c();
      com.a.a.b.g localg = new com.a.a.b.g();
      paramh.b(21, parama.b("_asm_flag_" + i / 32));
      paramh.a(Integer.valueOf(1 << i));
      paramh.a(126);
      paramh.a(153, localg);
      if (localClass == Boolean.TYPE)
      {
        paramh.b(25, parama.b("instance"));
        paramh.b(21, parama.b(localf.d() + "_asm"));
        a(paramh, localf);
      }
      for (;;)
      {
        paramh.a(localg);
        i += 1;
        break;
        if (localClass == Byte.TYPE)
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(21, parama.b(localf.d() + "_asm"));
          a(paramh, localf);
        }
        else if (localClass == Short.TYPE)
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(21, parama.b(localf.d() + "_asm"));
          a(paramh, localf);
        }
        else if (localClass == Integer.TYPE)
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(21, parama.b(localf.d() + "_asm"));
          a(paramh, localf);
        }
        else if (localClass == Long.TYPE)
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(22, parama.a(localf.d() + "_asm"));
          if (localf.e() != null) {
            paramh.b(182, com.a.a.Map.c.b(parama.d()), localf.e().getName(), "(J)V");
          } else {
            paramh.a(181, com.a.a.Map.c.b(localf.a()), localf.f().getName(), com.a.a.Map.c.a(localf.b()));
          }
        }
        else if (localClass == Float.TYPE)
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(23, parama.b(localf.d() + "_asm"));
          a(paramh, localf);
        }
        else if (localClass == Double.TYPE)
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(24, parama.a(localf.d() + "_asm"));
          a(paramh, localf);
        }
        else if (localClass == String.class)
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(25, parama.b(localf.d() + "_asm"));
          a(paramh, localf);
        }
        else if (localClass.isEnum())
        {
          paramh.b(25, parama.b("instance"));
          paramh.b(25, parama.b(localf.d() + "_asm"));
          a(paramh, localf);
        }
        else
        {
          if (Collection.class.isAssignableFrom(localClass))
          {
            paramh.b(25, parama.b("instance"));
            if (((ParameterizedType)localType).getActualTypeArguments()[0] == String.class)
            {
              paramh.b(25, parama.b(localf.d() + "_asm"));
              paramh.a(192, com.a.a.Map.c.b(localClass));
            }
            for (;;)
            {
              a(paramh, localf);
              break;
              paramh.b(25, parama.b(localf.d() + "_asm"));
            }
          }
          paramh.b(25, parama.b("instance"));
          paramh.b(25, parama.b(localf.d() + "_asm"));
          a(paramh, localf);
        }
      }
    }
  }
  
  private static void a(a parama, h paramh, com.a.a.b.g paramg)
  {
    com.a.a.b.g localg = new com.a.a.b.g();
    paramh.a(21, parama.b("matchedCount"));
    paramh.a(158, paramg);
    paramh.b(25, parama.b("lexer"));
    paramh.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "token", "()I");
    paramh.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "RBRACE", "I");
    paramh.a(160, paramg);
    paramh.b(25, parama.b("lexer"));
    paramh.a(178, com.a.a.Map.c.b(com.a.a.c.g.class), "COMMA", "I");
    paramh.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "nextToken", "(I)V");
    paramh.a(localg);
  }
  
  private static void a(a parama, h paramh, f paramf, Class paramClass, int paramInt)
  {
    com.a.a.b.g localg2 = new com.a.a.b.g();
    com.a.a.b.g localg1 = new com.a.a.b.g();
    paramh.b(25, parama.b("lexer"));
    paramh.b(25, 0);
    paramh.a(180, parama.a(), paramf.d() + "_asm_prefix__", "[C");
    paramh.b(182, com.a.a.Map.c.b(com.a.a.c.e.class), "matchField", "([C)Z");
    paramh.a(154, localg2);
    paramh.a(1);
    paramh.b(58, parama.b(paramf.d() + "_asm"));
    paramh.a(167, localg1);
    paramh.a(localg2);
    a(paramh, parama, paramInt);
    paramh.b(21, parama.b("matchedCount"));
    paramh.a(4);
    paramh.a(96);
    paramh.b(54, parama.b("matchedCount"));
    localg2 = new com.a.a.b.g();
    paramh.b(25, 0);
    paramh.a(180, parama.a(), paramf.d() + "_asm_deser__", com.a.a.Map.c.a(aq.class));
    paramh.a(199, localg2);
    paramh.b(25, 0);
    paramh.b(25, 1);
    paramh.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getConfig", "()" + com.a.a.Map.c.a(com.a.a.c.j.class));
    paramh.a(com.a.a.b.j.a(com.a.a.Map.c.a(paramf.b())));
    paramh.b(182, com.a.a.Map.c.b(com.a.a.c.j.class), "getDeserializer", "(" + com.a.a.Map.c.a(Type.class) + ")" + com.a.a.Map.c.a(aq.class));
    paramh.a(181, parama.a(), paramf.d() + "_asm_deser__", com.a.a.Map.c.a(aq.class));
    paramh.a(localg2);
    paramh.b(25, 0);
    paramh.a(180, parama.a(), paramf.d() + "_asm_deser__", com.a.a.Map.c.a(aq.class));
    paramh.b(25, 1);
    if ((paramf.c() instanceof Class)) {
      paramh.a(com.a.a.b.j.a(com.a.a.Map.c.a(paramf.b())));
    }
    for (;;)
    {
      paramh.a(paramf.d());
      paramh.b(185, com.a.a.Map.c.b(aq.class), "deserialze", "(" + com.a.a.Map.c.a(com.a.a.c.c.class) + com.a.a.Map.c.a(Type.class) + "Ljava/lang/Object;)Ljava/lang/Object;");
      paramh.a(192, com.a.a.Map.c.b(paramClass));
      paramh.b(58, parama.b(paramf.d() + "_asm"));
      paramh.b(25, 1);
      paramh.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getResolveStatus", "()I");
      paramh.a(178, com.a.a.Map.c.b(com.a.a.c.c.class), "NeedToResolve", "I");
      paramh.a(160, localg1);
      paramh.b(25, 1);
      paramh.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getLastResolveTask", "()" + com.a.a.Map.c.a(c.a.class));
      paramh.b(58, parama.b("resolveTask"));
      paramh.b(25, parama.b("resolveTask"));
      paramh.b(25, 1);
      paramh.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "getContext", "()" + com.a.a.Map.c.a(i.class));
      paramh.b(182, com.a.a.Map.c.b(c.a.class), "setOwnerContext", "(" + com.a.a.Map.c.a(i.class) + ")V");
      paramh.b(25, parama.b("resolveTask"));
      paramh.b(25, 0);
      paramh.a(paramf.d());
      paramh.b(182, com.a.a.Map.c.b(b.class), "getFieldDeserializer", "(Ljava/lang/String;)" + com.a.a.Map.c.a(x.class));
      paramh.b(182, com.a.a.Map.c.b(c.a.class), "setFieldDeserializer", "(" + com.a.a.Map.c.a(x.class) + ")V");
      paramh.b(25, 1);
      paramh.a(178, com.a.a.Map.c.b(com.a.a.c.c.class), "NONE", "I");
      paramh.b(182, com.a.a.Map.c.b(com.a.a.c.c.class), "setResolveStatus", "(I)V");
      paramh.a(localg1);
      return;
      paramh.b(25, 0);
      paramh.a(paramf.d());
      paramh.b(182, com.a.a.Map.c.b(b.class), "getFieldType", "(Ljava/lang/String;)Ljava/lang/reflect/Type;");
    }
  }
  
  private static void b(com.a.a.b.c paramc, a parama)
  {
    int j = parama.b().size();
    int i = 0;
    f localf;
    while (i < j)
    {
      localf = (f)parama.b().get(i);
      paramc.a(1, localf.d() + "_asm_prefix__", "[C");
      i += 1;
    }
    j = parama.b().size();
    i = 0;
    if (i < j)
    {
      localf = (f)parama.b().get(i);
      Class localClass = localf.b();
      if ((!localClass.isPrimitive()) && (!localClass.isEnum()))
      {
        if (!Collection.class.isAssignableFrom(localClass)) {
          break label180;
        }
        paramc.a(1, localf.d() + "_asm_list_item_deser__", com.a.a.Map.c.a(aq.class));
      }
      for (;;)
      {
        i += 1;
        break;
        label180:
        paramc.a(1, localf.d() + "_asm_deser__", com.a.a.Map.c.a(aq.class));
      }
    }
    paramc = paramc.b("<init>", "(" + com.a.a.Map.c.a(com.a.a.c.j.class) + com.a.a.Map.c.a(Class.class) + ")V", null);
    paramc.b(25, 0);
    paramc.b(25, 1);
    paramc.b(25, 2);
    paramc.b(183, com.a.a.Map.c.b(b.class), "<init>", "(" + com.a.a.Map.c.a(com.a.a.c.j.class) + com.a.a.Map.c.a(Class.class) + ")V");
    paramc.b(25, 0);
    paramc.a(180, com.a.a.Map.c.b(b.class), "serializer", com.a.a.Map.c.a(b.a.class));
    paramc.b(182, com.a.a.Map.c.b(ah.class), "getFieldDeserializerMap", "()" + com.a.a.Map.c.a(Map.class));
    paramc.a(87);
    j = parama.b().size();
    i = 0;
    while (i < j)
    {
      localf = (f)parama.b().get(i);
      paramc.b(25, 0);
      paramc.a("\"" + localf.d() + "\":");
      paramc.b(182, com.a.a.Map.c.b(String.class), "toCharArray", "()" + com.a.a.Map.c.a([C.class));
      paramc.a(181, parama.a(), localf.d() + "_asm_prefix__", "[C");
      i += 1;
    }
    paramc.a(177);
    paramc.c(4, 4);
  }
  
  public final aq a(com.a.a.c.j paramj, Class paramClass, Type paramType)
    throws Exception
  {
    if (paramClass.isPrimitive()) {
      throw new IllegalArgumentException("not support type :" + paramClass.getName());
    }
    String str = "Fastjson_ASM_" + paramClass.getSimpleName() + "_" + this.c.incrementAndGet();
    com.a.a.b.c localc = new com.a.a.b.c();
    localc.a(str, com.a.a.Map.c.b(b.class), null);
    paramType = com.a.a.Map.e.a(paramClass, paramType);
    b(localc, new a(str, paramType, 3));
    a locala = new a(str, paramType, 3);
    h localh = localc.b("createInstance", "(" + com.a.a.Map.c.a(com.a.a.c.c.class) + com.a.a.Map.c.a(Type.class) + ")Ljava/lang/Object;", null);
    localh.a(187, com.a.a.Map.c.b(locala.d()));
    localh.a(89);
    localh.b(183, com.a.a.Map.c.b(locala.d()), "<init>", "()V");
    localh.a(176);
    localh.c(3, 3);
    a(localc, new a(str, paramType, 4));
    paramType = localc.a();
    return (aq)this.b.a(str, paramType, paramType.length).getConstructor(new Class[] { com.a.a.c.j.class, Class.class }).newInstance(new Object[] { paramj, paramClass });
  }
  
  public final x a(com.a.a.c.j paramj, Class paramClass, f paramf)
    throws Exception
  {
    Object localObject = paramf.b();
    if ((localObject == Integer.TYPE) || (localObject == Long.TYPE) || (localObject == String.class))
    {
      Class localClass = paramf.b();
      Method localMethod = paramf.e();
      localObject = "Fastjson_ASM__Field_" + paramClass.getSimpleName();
      String str = (String)localObject + "_" + paramf.d() + "_" + this.c.incrementAndGet();
      com.a.a.b.c localc = new com.a.a.b.c();
      int i;
      if (localClass == Integer.TYPE)
      {
        localObject = ae.class;
        if (!paramClass.isInterface()) {
          break label555;
        }
        i = 185;
        label144:
        localc.a(str, com.a.a.Map.c.b((Class)localObject), null);
        h localh = localc.b("<init>", "(" + com.a.a.Map.c.a(com.a.a.c.j.class) + com.a.a.Map.c.a(Class.class) + com.a.a.Map.c.a(f.class) + ")V", null);
        localh.b(25, 0);
        localh.b(25, 1);
        localh.b(25, 2);
        localh.b(25, 3);
        localh.b(183, com.a.a.Map.c.b((Class)localObject), "<init>", "(" + com.a.a.Map.c.a(com.a.a.c.j.class) + com.a.a.Map.c.a(Class.class) + com.a.a.Map.c.a(f.class) + ")V");
        localh.a(177);
        localh.c(4, 6);
        if (localMethod != null)
        {
          if (localClass != Integer.TYPE) {
            break label563;
          }
          localObject = localc.b("setValue", "(" + com.a.a.Map.c.a(Object.class) + "I)V", null);
          ((h)localObject).b(25, 1);
          ((h)localObject).a(192, com.a.a.Map.c.b(localMethod.getDeclaringClass()));
          ((h)localObject).b(21, 2);
          ((h)localObject).b(i, com.a.a.Map.c.b(localMethod.getDeclaringClass()), localMethod.getName(), com.a.a.Map.c.a(localMethod));
          ((h)localObject).a(177);
          ((h)localObject).c(3, 3);
        }
      }
      for (;;)
      {
        localObject = localc.a();
        return (x)this.b.a(str, (byte[])localObject, localObject.length).getConstructor(new Class[] { com.a.a.c.j.class, Class.class, f.class }).newInstance(new Object[] { paramj, paramClass, paramf });
        if (localClass == Long.TYPE)
        {
          localObject = am.class;
          break;
        }
        localObject = ay.class;
        break;
        label555:
        i = 182;
        break label144;
        label563:
        if (localClass == Long.TYPE)
        {
          localObject = localc.b("setValue", "(" + com.a.a.Map.c.a(Object.class) + "J)V", null);
          ((h)localObject).b(25, 1);
          ((h)localObject).a(192, com.a.a.Map.c.b(localMethod.getDeclaringClass()));
          ((h)localObject).b(22, 2);
          ((h)localObject).b(i, com.a.a.Map.c.b(localMethod.getDeclaringClass()), localMethod.getName(), com.a.a.Map.c.a(localMethod));
          ((h)localObject).a(177);
          ((h)localObject).c(3, 4);
        }
        else
        {
          localObject = localc.b("setValue", "(" + com.a.a.Map.c.a(Object.class) + com.a.a.Map.c.a(Object.class) + ")V", null);
          ((h)localObject).b(25, 1);
          ((h)localObject).a(192, com.a.a.Map.c.b(localMethod.getDeclaringClass()));
          ((h)localObject).b(25, 2);
          ((h)localObject).a(192, com.a.a.Map.c.b(localClass));
          ((h)localObject).b(i, com.a.a.Map.c.b(localMethod.getDeclaringClass()), localMethod.getName(), com.a.a.Map.c.a(localMethod));
          ((h)localObject).a(177);
          ((h)localObject).c(3, 3);
        }
      }
    }
    return com.a.a.c.j.b(paramj, paramClass, paramf);
  }
  
  public final boolean a(Class paramClass)
  {
    return this.b.a(paramClass);
  }
  
  static final class a
  {
    private int a = 5;
    private Map b = new HashMap();
    private Class c;
    private final com.a.a.Map.e d;
    private String e;
    private List f;
    
    public a(String paramString, com.a.a.Map.e parame, int paramInt)
    {
      this.e = paramString;
      this.c = parame.d();
      this.a = paramInt;
      this.d = parame;
      this.f = new ArrayList(parame.e());
    }
    
    public final int a(String paramString)
    {
      if ((Integer)this.b.get(paramString) == null)
      {
        this.b.put(paramString, Integer.valueOf(this.a));
        this.a += 2;
      }
      return ((Integer)this.b.get(paramString)).intValue();
    }
    
    public final String a()
    {
      return this.e;
    }
    
    public final int b(String paramString)
    {
      if ((Integer)this.b.get(paramString) == null)
      {
        Map localMap = this.b;
        int i = this.a;
        this.a = (i + 1);
        localMap.put(paramString, Integer.valueOf(i));
      }
      return ((Integer)this.b.get(paramString)).intValue();
    }
    
    public final List b()
    {
      return this.f;
    }
    
    public final com.a.a.Map.e c()
    {
      return this.d;
    }
    
    public final Class d()
    {
      return this.c;
    }
    
    public final int e()
    {
      return this.a;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.XhookMethod.XhookMethod.saveaccountdatatoFile.XhookMethod.XhookMethod

 * JD-Core Version:    0.7.0.1

 */