.class A
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
   invokestatic java.util.ExampleA/doFun()V
   invokestatic java.util.ExampleB/doFunnier()V
   return
.end method
