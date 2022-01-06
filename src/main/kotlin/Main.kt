fun main() {
    val repository = Repository()
    val astar = AStarAlgorithm(repository.romanianCities)

    val result = astar.search(repository.getArad(), repository.getBucharest())
    for (item in result) {
        println(item.name)
    }
}