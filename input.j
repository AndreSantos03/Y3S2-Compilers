.class SimpleIfElseStat
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
   istore_1
   bipush 10
   istore_2
   iload_1
   iload_2
   isub
   iflt cmp_1_true
   iconst_0
   goto cmp_1_end
   
   cmp_1_true:
   iconst_m1
   
   cmp_1_end:
   ifne if1
   iload_2
   invokestatic ioPlus/printResult(I)V
   goto endif1
   if1:
   iload_1
   invokestatic ioPlus/printResult(I)V
   endif1:
   bipush 10
   istore_1
   bipush 8
   istore_2
   iload_1
   iload_2
   isub
   iflt cmp_2_true
   iconst_0
   goto cmp_2_end
   
   cmp_2_true:
   iconst_m1
   
   cmp_2_end:
   ifne if2
   iload_2
   invokestatic ioPlus/printResult(I)V
   goto endif2
   if2:
   iload_1
   invokestatic ioPlus/printResult(I)V
   endif2:
   return
.end method
