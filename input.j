.class ArrayAccessOnInt
.super java/lang/Object
.field private b I
.method public <init>()V
   .limit stack 99
   .limit locals 99
   aload_0
   invokespecial java/lang/Object/<init>()V
   return
.end method

.method public static foo()I
   .limit stack 99
   .limit locals 99
   aload_0
   iconst_3
   putfield ArrayAccessOnInt/b I
   aload_0
   getfield ArrayAccessOnInt/b I
   ireturn
.end method
