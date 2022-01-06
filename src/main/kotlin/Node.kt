class Node(
    val name: String,
    val xPos: Double,
    val yPos: Double,
    vararg var children: String
) {
    var cost: Double = 0.0
}
