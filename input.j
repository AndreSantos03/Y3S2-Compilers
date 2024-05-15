.class CallToMethodAssumedInExtends
.super A
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial A/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 99
   .limit locals 99
   return
.end method

.method public foo()I
   .limit stack 99
   .limit locals 99
   aload_0
   invokevirtual CallToMethodAssumedInExtends/a()V
.end method
