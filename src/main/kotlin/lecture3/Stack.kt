package lecture3

class Stack<T> {
    private var size = 0
    private var top: Element<T>? = null

    fun isEmpty() = size == 0

    fun push(value: T) {
        val e = Element(value, top)
        top = e
        size++
    }

    fun pop(): T? {
        val res = top?.value
        top = top?.next
        if (size > 0) size--
        return res
    }

    fun peek() = top?.value
}