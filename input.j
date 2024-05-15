.class Simple
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
   iconst_5
   iadd
   iconst_2
   idiv
   istore_0
   iload_0
   invokestatic io/println(I)V
   return
.end method
