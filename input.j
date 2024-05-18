.class IfWhileNested
.super java/lang/Object
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public func(I)I
   .limit stack 99
   .limit locals 99
   
   iconst_1
   istore_2
   iconst_0
   istore_3
   whileCond1:
   iload_3
   iload_1
   isub
   iflt cmp_0_true
   iconst_0
   goto cmp_0_end
   
   cmp_0_true:
   iconst_m1
   
   cmp_0_end:
   ifne whileLoop1
   goto whileEnd1
   whileLoop1:
   iload_2
   ifne if1
   iconst_2
   invokestatic ioPlus/printResult(I)V
   goto endif1
   if1:
   iconst_1
   invokestatic ioPlus/printResult(I)V
   endif1:
   iload_2
   iconst_1
   ixor
   istore_2
   iload_3
   iconst_1
   iadd
   istore_3
   goto whileCond1
   whileEnd1:
   iconst_1
   ireturn
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   new IfWhileNested
   dup
   invokespecial IfWhileNested/<init>()V
   astore_1
   aload_1
   iconst_3
   invokevirtual IfWhileNested/func(I)I
   istore_2
   return
.end method
