object Direction extends Enumeration {
  type mainDir = Value
  val north, south, east, west = Value

  def getChange(dir: Direction.Value): (Int, Int) = dir match {
    case `north` => (-1, 0)
    case `south` => (1, 0)
    case `east` => (0, 1)
    case `west` => (0, -1)
    case  _ => (-1, -1)
  }
}