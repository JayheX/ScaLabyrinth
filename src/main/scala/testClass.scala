class HelloWorld() {
  def printti(): Unit = {
    println("Helloooooo")
  }

  var counter = 0

  def addOne(): Unit = {
    counter += 1
  }

  def getCount(): Int = {
    counter
  }

  def getName(): Unit = {
    val name = readLine("Name? ")
  }
}