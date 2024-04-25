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
