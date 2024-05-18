.class public ArrayInit
.super java/lang/Object
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   iconst_5
   newarray int
   astore_1
   aload_1
   arraylength
   invokestatic ioPlus/printResult(I)V
   return
.end method
