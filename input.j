.class A
.super java/lang/Object
.field private a I
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public x()I
   .limit stack 99
   .limit locals 99
   aload_0
   bipush 10
   putfield A/a I
   aload_0
   getfield A/a I
   invokestatic io/print(I)V
   aload_0
   getfield A/a I
   ireturn
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   new A
   dup
   invokespecial A/<init>()V
   astore_0
   aload_0
   invokevirtual A/x()I
   return
.end method
