.class public IncompatibleArguments
.super java/lang/Object
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 2
   .limit locals 1
   return
.end method

.method public foo(I)I
   .limit stack 2
   .limit locals 2
   
   iload 1
   iconst_1
   iadd
   ireturn
.end method

.method public bar()I
   .limit stack 3
   .limit locals 3
   new IncompatibleArguments
   astore_1
   aload_1
   invokespecial IncompatibleArguments/<init>()V
   iconst_1
   istore 2
   aload_1
   iload 2
   invokevirtual IncompatibleArguments/foo(I)I
   ireturn
.end method
