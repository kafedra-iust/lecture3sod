package lecture3

class Queue<T> {
    private var size = 0
    private var head: Element<T>? = null
    private var tail: Element<T>? = null

    fun isEmpty() = size == 0

    fun offer(value : T) {
        val e = Element(value)
        if (isEmpty()) {
            head = e
        } else {
            tail!!.next = e
        }
        tail = e
        size++
    }

    fun poll() : T? {
        val temp = head
        head = head?.next
        if (size > 0) size--
        return temp?.value
    }

    fun peek() = head?.value
}