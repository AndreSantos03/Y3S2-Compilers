.class public ArrayVarargs
.super java/lang/Object
.method public <init>()V
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 2
   .limit locals 2
   new ArrayVarargs
   astore_1
   aload_1
   invokespecial ArrayVarargs/<init>()V
   aload_1
   invokevirtual ArrayVarargs/bar()I
   return
.end method

.method foo(I)I
   .limit stack 2
   .limit locals 2
   
   iload 1
   iconst_0
   iaload
   ireturn
.end method

.method bar()I
   .limit stack 5
   .limit locals 2
   aload_0
   iconst_3
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
   invokevirtual ArrayVarargs/foo(I)I
   istore 1
   iload 1
   invokestatic io/println(I)V
   aload_0
   iconst_1
   newarray int
   astore_1
   aload_1
   iconst_0
   iconst_4
   iastore
   aload_1
   invokevirtual ArrayVarargs/foo(I)I
   istore 1
   iload 1
   invokestatic io/println(I)V
   iload 1
   ireturn
.end method
