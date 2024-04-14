.class CallToMethodAssumedInImport
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
   new A
   dup
   astore_1
   aload_1
   invokespecial A/<init>()V
   aload_1
   invokevirtual CallToMethodAssumedInImport/bar()V
   iconst_0
   ireturn
.end method
