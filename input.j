.class SimpleWhileStat
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
   iconst_3
   istore_1
   iconst_0
   istore_2
   whileCond1:
   iload_2
   iload_1
   isub
   iflt cmp_1_true
   iconst_0
   goto cmp_1_end
   
   cmp_1_true:
   iconst_m1
   
   cmp_1_end:
   whileLoop1:
   iload_2
   invokestatic ioPlus/printResult(I)V
   whileEnd1:
   return
.end method
