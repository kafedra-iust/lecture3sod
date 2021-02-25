package lecture3

class PriorityQueue<T : Comparable<T>> {
    private var size = 0
    private var head: Element<T>? = null
    private var tail: Element<T>? = null

    fun isEmpty() = size == 0

    fun offer(value: T) {
        val e = Element(value)
        if (isEmpty()) {
            head = e
            tail = e
        } else {
            var t = head!!
            while (value > t.value) {
                t = t.next ?: break
            }
            e.next = t.next
            t.next = e
            if (t.value > e.value) {
                val temp = t.value
                t.value = e.value
                e.value = temp
            }
        }
        size++
    }

    fun poll() : T? {
        val temp = head
        head = head?.next
        if (size > 0) size--
        return temp?.value
    }

    fun peek() : T? {
        return head?.value
    }
}