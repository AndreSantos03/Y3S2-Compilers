.class public VarargsAndArrayInit
.super java/lang/Object
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 3
   .limit locals 2
   new VarargsAndArrayInit
   astore_1
   aload_1
   invokespecial VarargsAndArrayInit/<init>()V
   aload_1
   invokevirtual VarargsAndArrayInit/bar()I
   invokestatic io/print(I)V
   return
.end method

.method foo([I)I
   .limit stack 2
   .limit locals 2
   
   iconst_3
   ireturn
.end method

.method bar()I
   .limit stack 6
   .limit locals 2
   aload_0
   iconst_3
   newarray int
   dup
   iconst_0
   iconst_1
   iastore
   dup
   iconst_1
   iconst_2
   iastore
   dup
   iconst_2
   iconst_3
   iastore
   invokevirtual VarargsAndArrayInit/foo([I)I
   istore 1
   iload 1
   ireturn
.end method
