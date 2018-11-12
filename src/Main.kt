object Main {

    private val solution = Solution()
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello, World!")

        val start = System.currentTimeMillis()
        doWork()
        val end = System.currentTimeMillis()
        println("Spend time: " + (end - start) + "ms")
    }

    private fun doWork() {
        println(solution.uniquePaths(1, 1))
        println(solution.uniquePaths(2, 1))
        println(solution.uniquePaths(3, 2))
        println(solution.uniquePaths(7, 3))
    }
}
