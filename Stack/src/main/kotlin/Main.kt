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
        return "MutableStack(${elements.joinToString()}"
    }
}
fun main() {

}