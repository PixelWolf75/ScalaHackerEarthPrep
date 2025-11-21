object AddTwoNumbers {
  def main(args: Array[String]): Unit = {

  }

  def addTwoNumbers(l1: LinkedList, l2: LinkedList): LinkedList = {
    val length = if (l1.count > l2.count) l2.count else l1.count
    val sum = LinkedList(null)
    var carry = 0
    var l1Current = l1.head.get
    var l2Current = l2.head.get
    for (i <- 0 until length) {
      var data = l1Current.data + l2Current.data + carry
      carry = 0
      if(data > 9){
        carry = data / 10
        data = data%10
      }
      sum.add(Node(null, data))
      l1Current = l1Current.next.get
      l2Current = l2Current.next.get
    }
    if(carry > 0){
      sum.add(Node(null, carry))
    }
    sum
  }

  class Node(var next:Option[Node], val data:Int) {

  }

  class LinkedList(var head:Option[Node]) {
      var count:Int = if (head.isDefined) 1 else 0

      def add(node:Node):Unit = {
        if(head.isEmpty){
          head = Some(node)
          count = 1
          return
        }

        var current: Node = head.get
        while(current.next.isDefined){
          current = current.next.get
        }

        current.next = Some(node)
        count += 1
      }

      def get(index:Int):Int={
        if(index >= count || index < 0 || head.isEmpty){
          println("Out of bounds index " + index)
          -1
        }
        else{
          var current = head.get
          for(i <- 0 until index){
            current = current.next.get
          }
          current.data
        }
      }

      def mkString(): String = {
        var str = "["

        if(head.isDefined){
          var current: Node = head.get
          while (current.next.isDefined) {
            str += current.data
            str += ","
            current = current.next.get
          }
          str.dropRight(1)
        }
        str += "]"
        str
      }
  }
}
