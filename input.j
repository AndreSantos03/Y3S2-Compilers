.class public ArrayInitialization
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
   new ArrayInitialization
   astore_1
   aload_1
   invokespecial ArrayInitialization/<init>()V
   aload_1
   invokevirtual ArrayInitialization/foo()I
   invokestatic io/println(I)V
   return
.end method

.method foo()I
   .limit stack 99
   .limit locals 99
   iconst_4
   newarray int
   astore_1
   aload_1
   iconst_0
   iconst_1
   iastore
   aload_1
   iconst_1
   iconst_2
   iastore
   aload_1
   iconst_2
   iconst_3
   iastore
   aload_1
   iconst_3
   iconst_4
   iastore
   iload 1
   iconst_2
   iaload
   istore 2
   iload 2
   ireturn
.end method
