class Board(height: Int, width: Int) {
  var board = Array.ofDim[Piece](height, width)

  def init(): Unit = {
    (0 until this.height).map(x => {
      (0 until this.width).map(y => {
        board(x)(y) = new Piece(x, y)
      })
    })
  }

}