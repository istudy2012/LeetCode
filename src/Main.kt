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
        val arrays = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        solution.rotate(arrays)
        println(arrays.contentDeepToString())

        val array2 = arrayOf(
                intArrayOf(5, 1, 9, 11),
                intArrayOf(2, 4, 8, 10),
                intArrayOf(13, 3, 6, 7),
                intArrayOf(15, 14, 12, 16))
        solution.rotate(array2)
        println(array2.contentDeepToString())
    }
}
