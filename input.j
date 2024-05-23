.class public LocalLimits
.super java/lang/Object
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public func(II)I
   .limit stack 4
   .limit locals 4
   
   
   iload 2
   bipush 10
   iconst_3
   aload_0
   iconst_3
   iconst_4
   invokevirtual LocalLimits/func(II)I
   iadd
   imul
   iadd
   istore 1
   aload_0
   iconst_3
   iconst_4
   invokevirtual LocalLimits/func(II)I
   istore 3
   iconst_1
   ireturn
.end method
