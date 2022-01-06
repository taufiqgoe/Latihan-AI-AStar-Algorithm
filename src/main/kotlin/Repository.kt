class Repository {

    val romanianCities = listOf<Node>(
        Node("arad",5.0, 35.0, "zerind", "sibiu", "timisoara"),
        Node("sibiu", 23.0, 30.0, "arad", "rimnicu", "fagaras"),
        Node("rimnicu", 27.0, 22.5, "sibiu", "craiova", "pitesti"),
        Node("pitesti", 41.5, 16.0, "rimnicu", "craiova", "bucharest"),
        Node("timisoara", 6.5, 22.5, "arad", "lugoj"),
        Node("lugoj", 16.5, 17.5, "mehadia", "timisoara"),
        Node("mehadia", 16.8, 11.9, "dobreta", "lugoj"),
        Node("dobreta",16.5, 5.5, "mehadia", "craiova"),
        Node("craiova", 30.0, 3.5, "dobreta", "pitesti", "rimnicu"),
        Node("zerind", 7.5, 41.5, "arad", "oradea"),
        Node("oradea", 11.2, 47.5, "zerind", "sibiu"),
        Node("fagaras", 38.5, 28.5, "sibiu", "bucharest"),
        Node("giurgiu", 49.0, 1.0, "bucharest"),
        Node("urziceni", 61.5, 13.5, "bucharest", "hirsova", "vaslui"),
        Node("vaslui", 69.5, 28.0, "urziceni", "iasi"),
        Node("iasi", 64.1, 37.5, "neamt", "vaslui"),
        Node("neamt", 53.6, 42.2, "iasi"),
        Node("hirsova", 73.5, 13.5, "urziceni", "eforie"),
        Node("eforie", 78.0, 4.5, "hirsova"),
        Node("bucharest",53.0, 10.0, "giurgiu", "pitesti", "fagaras", "urziceni")
    )

    fun getArad(): Node {
        return romanianCities.first()
    }

    fun getBucharest(): Node {
        return romanianCities.last()
    }

}