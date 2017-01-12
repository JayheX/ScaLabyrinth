import scala.collection.mutable.HashSet

class Piece(x: Int, y: Int) {
  private val visited: Boolean = false
  private val coords: (Int, Int) = (this.x, this.y)
  private val neighbors: HashSet[Piece] = HashSet[Piece]()

  def getNeighbors(): HashSet[Piece] = {
    this.neighbors
  }

  def addNeighbor(that: Piece): Unit = {
    if (!this.neighbors.contains(that)) this.neighbors += that
  }

  def removeNeighbor(that: Piece): Unit = {
    if (this.neighbors.contains(that)) this.neighbors -= that
  }

  def isNeighbor(that: Piece): Boolean = {
    if (this.neighbors.contains(that)) true else false
  }

  def getCoords(): (Int, Int) = {
    this.coords
  }
}