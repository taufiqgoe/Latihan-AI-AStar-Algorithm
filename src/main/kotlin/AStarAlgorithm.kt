import kotlin.math.pow
import kotlin.math.sqrt

class AStarAlgorithm(private val nodes: List<Node>) {

    fun search(start: Node, goal: Node): List<Node> {
        val openList = mutableListOf<Node>()
        val closeList = mutableListOf<Node>()

        start.cost = calculateDistance(start, goal)
        openList.add(start)

        while (openList.isNotEmpty()) {

            openList.sortBy { it.cost }
            val currentNode = openList.first()
            openList.remove(currentNode)
            val currentCost = calculateDistance(currentNode, goal)

            if (currentNode == goal) {
                closeList.add(currentNode)
                break
            }

            for (successor in childToNodes(currentNode)) {
                successor.cost = calculateDistance(successor, goal) + calculateDistance(currentNode, successor)

                if (openList.contains(successor)) {
                    if (successor.cost >= currentCost) {
                        continue
                    }
                } else if (closeList.contains(successor)) {
                    if (successor.cost >= currentCost) {
                        continue
                    }
                    openList.add(successor)
                    closeList.remove(successor)
                } else {
                    openList.add(successor)
                }
            }

            closeList.add(currentNode)
        }

        return closeList
    }

    private fun childToNodes(node: Node): List<Node> {
        val list = mutableListOf<Node>()
        for (successor in node.children) {
            for (mNode in nodes) {
                if (successor == mNode.name) {
                    list.add(mNode)
                }
            }
        }

        return list
    }

    private fun calculateDistance(from: Node, to: Node): Double {
        val distance = (to.xPos - from.xPos).pow(2) + (to.yPos - from.yPos).pow(2)

        return sqrt(distance)
    }
}