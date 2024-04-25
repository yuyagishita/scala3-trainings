import scala.collection.mutable.ListBuffer

@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  val oldNumbers = List(1,2,3)
  val newNumbers = double(oldNumbers)
  val scalaNewNubmers = oldNumbers.map(_*2)
  println(oldNumbers)
  println(newNumbers)
  println(scalaNewNubmers)
  println(Logarithm(1)*(Logarithm(2)))

def msg = "I was compiled by Scala 3. :)"

// traitに直接引数かけるようになってた
trait UserRepository(name: String)

// こういう命令形ではScalaは書かない
def double(ints: List[Int]): List[Int] =
  val buffer = new ListBuffer[Int]()
  for i <- ints do
    buffer += i * 2
  buffer.toList


trait Animal {
  def hoge: Unit
}
trait Animal2:
  def hoge: Unit


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


