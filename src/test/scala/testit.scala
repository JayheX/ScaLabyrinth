
  import org.scalatest._
  class JeeSpec extends FlatSpec {
    
    "The counter" should "count right" in {
      val jee = new HelloWorld()
      assert(jee.getCount() == 0)
    }
  }