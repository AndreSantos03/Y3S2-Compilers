.class Simple
.super java/lang/Object
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public add(II)I
   .limit stack 99
   .limit locals 99
   
   
   iload_1
   aload_0
   invokevirtual Simple/constInstr()I
   iadd
   istore_3
   iload_3
   ireturn
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   bipush 20
   istore_0
   bipush 10
   istore_1
   new Simple
   dup
   astore_2
   aload_2
   invokespecial Simple/<init>()V
   pop
   aload_2
   iload_0
   iload_1
   iload_0
   invokevirtual s/add(II)I
   istore_3
   invokestatic io/println()V
   return
.end method

.method public constInstr()I
   .limit stack 99
   .limit locals 99
   iconst_0
   istore_1
   iconst_4
   istore_1
   bipush 8
   istore_1
   bipush 14
   istore_1
   sipush 250
   istore_1
   sipush 400
   istore_1
   sipush 1000
   istore_1
   ldc 100474650
   istore_1
   bipush 10
   istore_1
   iload_1
   ireturn
.end method
