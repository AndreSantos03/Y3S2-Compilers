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

.method foo([I[I)I
   .limit stack 3
   .limit locals 3
   
   
   aload_1
   arraylength
   aload_2
   arraylength
   iadd
   ireturn
.end method

.method bar()I
   .limit stack 8
   .limit locals 2
   aload_0
   iconst_3
   newarray int
   astore_0
   aload_0
   iconst_0
   iconst_1
   iastore
   aload_0
   iconst_1
   iconst_1
   iastore
   aload_0
   iconst_2
   iconst_2
   iastore
   aload_0
   iconst_5
   newarray int
   astore_1
   aload_1
   iconst_0
   iconst_4
   iastore
   aload_1
   iconst_1
   iconst_5
   iastore
   aload_1
   iconst_2
   bipush 6
   iastore
   aload_1
   iconst_3
   bipush 7
   iastore
   aload_1
   iconst_4
   bipush 8
   iastore
   aload_1
   invokevirtual VarargsAndArrayInit/foo([I[I)I
   istore 1
   iload 1
   ireturn
.end method
