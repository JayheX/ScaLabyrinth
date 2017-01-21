class Board(height: Int, width: Int) {
  private var board: Array[Array[Piece]] = Array.ofDim[Piece](height, width)
  private val player: Player = new Player(this)

  def init(): Unit = {
    (0 until this.height).map(x => {
      (0 until this.width).map(y => {
        board(x)(y) = new Piece(x, y)
      })
    })
  }

  def getPiece(x: Int, y: Int): Piece = {
  	board(x)(y)
  }

  def playerPosition(): (Int, Int) = player.getLocation()

  def isInsideBorders(x: Int, y: Int): Boolean = {
    x >= 0 && x < this.height && y >= 0 && y < this.width
  }

  def move(dir: Direction.Value): Boolean = {
    var change: (Int, Int) = Direction.getChange(dir)
    var newPosition: (Int, Int) = (player.getLocation()._1 + change._1, player.getLocation()._2 + change._2)
    if (isInsideBorders(newPosition._1, newPosition._2)) {
      player.changeLocation(dir)
      true
    } else {
      false
    }
  }

}