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
        println(solution.combinationSum3New(3, 7))
        println(solution.combinationSum3New(3, 9))
    }
}
