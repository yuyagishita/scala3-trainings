import scala.collection.mutable.ListBuffer

opaque type Logarithm = Double

object Logarithm:
  def apply(d: Double): Logarithm = math.log(d)
  def safe(d: Double): Option[Logarithm] = 
    if d > 0.0 then Some(math.log(d)) else None
end Logarithm

extension (x: Logarithm)
  def toDouble: Double = math.exp(x)
  def + (y: Logarithm): Logarithm = Logarithm(math.exp(x) + math.exp(y))
  def * (y: Logarithm): Logarithm = x + y