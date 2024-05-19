.class public SwitchStat
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
   
   iload_1
   iconst_1
   isub
   iflt cmp_0_true
   iconst_0
   goto cmp_0_end
   
   cmp_0_true:
   iconst_m1
   
   cmp_0_end:
   istore 2
   iload 2
   ifne if1
   iload_1
   iconst_2
   isub
   iflt cmp_1_true
   iconst_0
   goto cmp_1_end
   
   cmp_1_true:
   iconst_m1
   
   cmp_1_end:
   istore 3
   iload 3
   ifne if2
   iload_1
   iconst_3
   isub
   iflt cmp_2_true
   iconst_0
   goto cmp_2_end
   
   cmp_2_true:
   iconst_m1
   
   cmp_2_end:
   istore 4
   iload 4
   ifne if3
   iload_1
   iconst_4
   isub
   iflt cmp_3_true
   iconst_0
   goto cmp_3_end
   
   cmp_3_true:
   iconst_m1
   
   cmp_3_end:
   istore 5
   iload 5
   ifne if4
   iload_1
   iconst_5
   isub
   iflt cmp_4_true
   iconst_0
   goto cmp_4_end
   
   cmp_4_true:
   iconst_m1
   
   cmp_4_end:
   istore 6
   iload 6
   ifne if5
   iload_1
   bipush 6
   isub
   iflt cmp_5_true
   iconst_0
   goto cmp_5_end
   
   cmp_5_true:
   iconst_m1
   
   cmp_5_end:
   istore 7
   iload 7
   ifne if6
   bipush 7
   invokestatic ioPlus/printResult(I)V
   goto endif6
   if6:
   bipush 6
   invokestatic ioPlus/printResult(I)V
   endif6:
   goto endif5
   if5:
   iconst_5
   invokestatic ioPlus/printResult(I)V
   endif5:
   goto endif4
   if4:
   iconst_4
   invokestatic ioPlus/printResult(I)V
   endif4:
   goto endif3
   if3:
   iconst_3
   invokestatic ioPlus/printResult(I)V
   endif3:
   goto endif2
   if2:
   iconst_2
   invokestatic ioPlus/printResult(I)V
   endif2:
   goto endif1
   if1:
   iconst_1
   invokestatic ioPlus/printResult(I)V
   endif1:
   iconst_1
   ireturn
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   new SwitchStat
   dup
   invokespecial SwitchStat/<init>()V
   astore_1
   aload_1
   iconst_0
   invokevirtual SwitchStat/func(I)I
   istore_2
   aload_1
   iconst_1
   invokevirtual SwitchStat/func(I)I
   istore_2
   aload_1
   iconst_2
   invokevirtual SwitchStat/func(I)I
   istore_2
   aload_1
   iconst_3
   invokevirtual SwitchStat/func(I)I
   istore_2
   aload_1
   iconst_4
   invokevirtual SwitchStat/func(I)I
   istore_2
   aload_1
   iconst_5
   invokevirtual SwitchStat/func(I)I
   istore_2
   aload_1
   bipush 6
   invokevirtual SwitchStat/func(I)I
   istore_2
   return
.end method
