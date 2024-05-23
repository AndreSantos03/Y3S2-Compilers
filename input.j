.class public ConditionArgsFuncCall
.super java/lang/Object
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public func(ZZZZ)I
   .limit stack 5
   .limit locals 5
   
   
   
   
   bipush 10
   invokestatic ioPlus/printResult(I)V
   iconst_1
   ireturn
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 6
   .limit locals 6
   new ConditionArgsFuncCall
   astore_1
   aload_1
   invokespecial ConditionArgsFuncCall/<init>()V
   bipush 10
   istore 2
   iconst_5
   istore 3
   iconst_1
   istore 4
   iconst_0
   istore 5
   aload_1
   iload 2
   iload 3
   isub
   iflt cmp_0_true
   iconst_0
   goto cmp_0_end
   
   cmp_0_true:
   iconst_m1
   cmp_0_end:
   iload 4
   iload 5
   iand
   iload 2
   iload 3
   isub
   iflt cmp_1_true
   iconst_0
   goto cmp_1_end
   
   cmp_1_true:
   iconst_m1
   cmp_1_end:
   iload 4
   iand
   iload 4
   iconst_1
   ixor
   invokevirtual ConditionArgsFuncCall/func(ZZZZ)I
   istore 2
   return
.end method
