import lecture3.Queue
import lecture3.Stack

fun main() {
    val stack = Stack<Int>()
    println(stack.isEmpty())
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)

    println(stack.isEmpty())
    println(stack.peek())
    println("------------")
    while (!stack.isEmpty()) {
        print(" ${stack.pop()}")
    }
    println()
    println("-------------------------")
    val queue = Queue<Double>()
    println(queue.isEmpty())
    queue.offer(1.0)
    queue.offer(2.0)
    queue.offer(3.0)
    queue.offer(4.0)
    queue.offer(5.0)
    println(queue.isEmpty())
    println(queue.poll())
    queue.offer(7.0)
    while (!queue.isEmpty()) {
        print(" ${queue.poll()}")
    }
    println()
}