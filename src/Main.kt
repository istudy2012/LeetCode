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
        val arrays = intArrayOf(1, 3, 4, 2, 2)
        println(solution.findDuplicate(arrays))
    }
}
