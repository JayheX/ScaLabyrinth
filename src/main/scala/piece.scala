import scala.collection.mutable.HashSet

class Piece(x: Int, y: Int) {

  // True, if the Piece has been visited (crucial for some algorithms)
  private val visited: Boolean = false

  private val coords: (Int, Int) = (this.x, this.y)
  
  // A HashSet for the Piece's that are accessible from this Piece
  // IMPORTANT: Does not contain all of the Pieces that are next to this Piece on the board.
  private val neighbors: HashSet[Piece] = HashSet[Piece]()

  // Returns Piece's neighbors
  def getNeighbors(): HashSet[Piece] = {
    this.neighbors
  }

  // Adds a neighbor, i.e. makes that Piece accessible from this Piece
  def addNeighbor(that: Piece): Unit = {
    if (!this.neighbors.contains(that)) this.neighbors += that
  }

  // Makes a Piece unaccessible from this Piece
  def removeNeighbor(that: Piece): Unit = {
    if (this.neighbors.contains(that)) this.neighbors -= that
  }

  // True if that is accessible from this
  def isNeighbor(that: Piece): Boolean = {
    if (this.neighbors.contains(that)) true else false
  }

  // Returns the coordinates of this Piece
  def getCoords(): (Int, Int) = {
    this.coords
  }
}