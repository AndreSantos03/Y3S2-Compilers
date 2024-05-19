.class public ArrayAsArg
.super java/lang/Object
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public func([I)I
   .limit stack 99
   .limit locals 99
   
   aload_1
   arraylength
   istore 2
   iload 2
   ireturn
.end method

.method public func2()I
   .limit stack 99
   .limit locals 99
   new ArrayAsArg
   astore_1
   aload_1
   invokespecial ArrayAsArg/<init>()V
   iconst_2
   newarray int
   astore_2
   aload_1
   aload_2
   invokevirtual ArrayAsArg/func([I)I
   istore 3
   iload 3
   ireturn
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   new ArrayAsArg
   astore_1
   aload_1
   invokespecial ArrayAsArg/<init>()V
   aload_1
   invokevirtual ArrayAsArg/func2()I
   istore 2
   iload 2
   invokestatic ioPlus/printResult(I)V
   return
.end method
