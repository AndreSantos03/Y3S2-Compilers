.class public InstSelection_iinc
.super java/lang/Object
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 3
   .limit locals 2
   iconst_2
   istore_1
   iinc 1 1
   iload_1
   invokestatic io/println(I)V
   return
.end method
