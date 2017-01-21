class Player(board: Board) {
	private var location: (Int, Int) = (0, 0)

	def getLocation(): (Int, Int) = this.location

  def changeLocation(dir: Direction.Value): (Int, Int) = {
    var change: (Int, Int) = Direction.getChange(dir)
    this.location = (this.location._1 + change._1, this.location._2 + change._2)
    this.location
  }
}