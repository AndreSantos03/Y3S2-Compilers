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
   bipush 20
   bipush 10
   isub
   ifgt cmp_0_true
   iconst_0
   goto cmp_0_end
   
   cmp_0_true:
   iconst_m1
   
   cmp_0_end:
   istore_0
   iload_0
   invokestatic io/print(Z)V
   return
.end method
