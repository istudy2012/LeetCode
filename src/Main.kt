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
        val arrays = intArrayOf(4,3,2,7,8,2,3,1)
        println(solution.findDuplicates(arrays))
    }
}
