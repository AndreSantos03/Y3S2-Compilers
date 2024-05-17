.class Arithmetic_less
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
   bipush 10
   bipush 20
   isub
   iflt cmp_1_true
   iconst_0
   goto cmp_1_end
   
   cmp_1_true:
   iconst_m1
   
   cmp_1_end:
   istore_1
   iload_1
   ifne if1
   iconst_0
   invokestatic io/print(I)V
   goto endif1
   if1:
   iconst_1
   invokestatic io/print(I)V
   endif1:
   return
.end method
