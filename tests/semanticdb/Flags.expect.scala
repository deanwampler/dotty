package flags

import scala.language/*=>>scalaShadowing.language.*/.experimental/*=>>scalaShadowing.language.experimental.*/.macros/*=>>scalaShadowing.language.experimental.macros.*/

package object p {
  p/*<<=flags.p.package.*/rivate lazy val x/*<<=flags.p.package.x.*/ = 1
  protected implicit var y/*<<=flags.p.package.y().*/: /*<<=flags.p.package.`y_=`().*/Int/*=>>scala.Int#*/ = 2
  def z/*<<=flags.p.package.z().*/(pp/*<<=flags.p.package.z().(pp)*/: Int/*=>>scala.Int#*/) = 3
  def m/*<<=flags.p.package.m().*/[TT/*<<=flags.p.package.m().[TT]*/]: Int/*=>>scala.Int#*//*=>>scala.Predef.`???`().*/ = macro ???
  abstract class C/*<<=flags.p.package.C#*/[+T/*<<=flags.p.package.C#[T]*//*<<=flags.p.package.C#`<init>`(+1).[T]*/, -U/*<<=flags.p.package.C#[U]*//*<<=flags.p.package.C#`<init>`(+1).[U]*/, V/*<<=flags.p.package.C#[V]*//*<<=flags.p.package.C#`<init>`(+1).[V]*/](x/*<<=flags.p.package.C#x.*/: T/*=>>flags.p.package.C#`<init>`().[T]*/, y/*<<=flags.p.package.C#y.*/: U/*=>>flags.p.package.C#`<init>`().[U]*/, z/*<<=flags.p.package.C#z.*/: V/*=>>flags.p.package.C#`<init>`().[V]*/) {
    def this()/*<<=flags.p.package.C#`<init>`(+1).*/ = this(/*=>>flags.p.package.C#`<init>`().*/???/*=>>scala.Predef.`???`().*/, ???/*=>>scala.Predef.`???`().*/, ???/*=>>scala.Predef.`???`().*/)
    def w/*<<=flags.p.package.C#w().*/: Int/*=>>scala.Int#*/
  }
  type T1/*<<=flags.p.package.T1#*/ = Int/*=>>scala.Int#*/
  type T2/*<<=flags.p.package.T2#*/[T/*<<=flags.p.package.T2#[T]*/] = S/*=>>flags.p.package.S#*/[T/*=>>flags.p.package.T2#[T]*/]
  type U/*<<=flags.p.package.U#*/ <: Int/*=>>scala.Int#*/
  type V/*<<=flags.p.package.V#*/ >: Int/*=>>scala.Int#*/
  case object X/*<<=flags.p.package.X.*/
  final class Y/*<<=flags.p.package.Y#*/
  sealed trait Z/*<<=flags.p.package.Z#*/
  class AA/*<<=flags.p.package.AA#*/(x/*<<=flags.p.package.AA#x.*/: Int/*=>>scala.Int#*/, val y/*<<=flags.p.package.AA#y.*/: Int/*=>>scala.Int#*/, var z/*<<=flags.p.package.AA#z().*/: /*<<=flags.p.package.AA#`z_=`().*/Int/*=>>scala.Int#*/)
  class S/*<<=flags.p.package.S#*/[@specialized/*=>>scala.specialized#*//*=>>scala.specialized#`<init>`(+2).*/ T/*<<=flags.p.package.S#[T]*/]
  val List/*=>>scala.package.List.*//*=>>scala.collection.SeqFactory#unapplySeq().*/(xs1/*<<=flags.p.package.xs1.*//*<<=local0*/)/*=>>local0*/ = ???/*=>>scala.Predef.`???`().*/
  ???/*=>>scala.Predef.`???`().*/ match { case List/*=>>scala.package.List.*//*=>>scala.collection.SeqFactory#unapplySeq().*/(xs2/*<<=local1*/) => ???/*=>>scala.Predef.`???`().*/ }
  ???/*=>>scala.Predef.`???`().*/ match { case _: List/*=>>scala.package.List#*/[t/*<<=local2*/] => ???/*=>>scala.Predef.`???`().*/ }
}
