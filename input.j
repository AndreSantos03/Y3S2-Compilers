.class public AssumeArguments
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

.method public bar()I
   .limit stack 3
   .limit locals 4
   new A
   astore_1
   aload_1
   invokespecial A/<init>()V
   iconst_1
   istore 2
   aload_1
   iload 2
   invokevirtual A/foo()I
   istore 3
   iload 3
   ireturn
.end method
