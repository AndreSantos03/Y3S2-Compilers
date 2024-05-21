.class public SimpleControlFlow
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
   .limit locals 4
   iconst_2
   istore 1
   iconst_3
   istore 2
   iload 2
   iload 1
   isub
   iflt cmp_0_true
   iconst_0
   goto cmp_0_end
   
   cmp_0_true:
   iconst_m1
   cmp_0_end:
   istore 3
   iload 3
   ifne if1
   iload 2
   invokestatic ioPlus/printResult(I)V
   goto endif1
   if1:
   iload 1
   invokestatic ioPlus/printResult(I)V
   endif1:
   return
.end method
