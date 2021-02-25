package lecture3

class Deque<T> {
    private var size = 0
    private var head: DeqElement<T>? = null
    private var tail: DeqElement<T>? = null

    fun isEmpty() = size == 0

    fun insertFirst(value: T) {
        val e = DeqElement(value)
        if (isEmpty()) {
            tail = e
        } else {
            e.next = head
            head!!.prev = e
        }
        head = e
        size++
    }

    fun insertLast(value: T) {
        val e = DeqElement(value)
        if (isEmpty()) {
            head = e
        } else {
            e.prev = tail
            tail!!.next = e
        }
        tail = e
        size++
    }

    fun removeFirst() : T? {
        val t = head
        head = head?.next
        head?.prev = null
        if (size > 0) size--
        return t?.value
    }

    fun removeLast() : T? {
        val t = tail
        tail = tail?.prev
        tail?.next = null
        if (size > 0) size--
        return t?.value
    }

    fun getFirst() = head?.value

    fun getLast() = tail?.value

}