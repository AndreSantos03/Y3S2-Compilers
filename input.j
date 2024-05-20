.class public Arithmetic_not
.super java/lang/Object
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static main(Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   iconst_1
   iconst_1
   ixor
   istore 1
   iload 1
   invokestatic io/println(Z)V
   return
.end method
