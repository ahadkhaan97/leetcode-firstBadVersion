fun main() {
    print(firstBadVersion(2126753390))
}

fun firstBadVersion(n: Int): Int {
    var first: Long = 1
    var end: Long = n.toLong()
    var mid: Long = n.toLong() / 2
    while (first < end) {
        if (isBadVersion(mid.toInt())) {
            end = mid
        } else {
            first = mid + 1
        }
        mid = (end + first) / 2
    }
    if (mid == 0L)
        return first.toInt()
    return mid.toInt()
}

fun isBadVersion(version: Int): Boolean {
    return version >= 1702766719
}