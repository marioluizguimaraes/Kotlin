class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList()

    fun push(element: E){
        elements.add(element)
    }
    fun peek(): E{
        return elements.last()
    }
    fun pop(): E{
        return elements.removeAt(elements.size - 1)
    }
    fun isEmpty(){
        elements.isEmpty()
    }
    fun size(){
        elements.size
    }

    override fun toString(): String {
        return "MutableStack: ${elements.joinToString()}"
    }
}
fun main() {
    val myStack = MutableStack(0, 1,0.1,2,76,100)
    myStack.push(10)
    println("último elemento: ${myStack.peek()}")
    println(myStack)
}