import scala.quoted._

object Macros {

  inline def natConst(x: Int): Int = ${ natConstImpl('x) }

  def natConstImpl(x: Expr[Int])(using qctx: QuoteContext) : Expr[Int] = {
    import qctx.tasty._
    val xTree: Term = x.unseal
    xTree match {
      case Inlined(_, _, Literal(Constant(n: Int))) =>
        if (n <= 0) {
          report.error("Parameter must be natural number")
          '{0}
        } else {
          xTree.seal.cast[Int]
        }
      case _ =>
        report.error("Parameter must be a known constant")
        '{0}
    }
  }

}
