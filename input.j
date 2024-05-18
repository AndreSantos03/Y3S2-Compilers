.class SimpleIfElseNot
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
   iconst_1
   ifne if1
   bipush 20
   invokestatic io/println(I)V
   goto endif1
   if1:
   bipush 10
   invokestatic io/println(I)V
   endif1:
   iconst_0
   ifne if2
   sipush 200
   invokestatic io/print(I)V
   goto endif2
   if2:
   bipush 100
   invokestatic io/print(I)V
   endif2:
   return
.end method
