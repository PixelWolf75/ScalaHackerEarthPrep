object DeleteFromLinkedList {
  def main(args: Array[String]): Unit = {

  }

  class Node(var next: Option[Node], val data: Int) {

  }

  class LinkedList(var head: Option[Node]) {
    var count: Int = if (head.isDefined) 1 else 0

    def add(node: Node): Unit = {
      if (head.isEmpty) {
        head = Some(node)
        count = 1
        return
      }

      var current: Node = head.get
      while (current.next.isDefined) {
        current = current.next.get
      }

      current.next = Some(node)
      count += 1
    }

    def get(index: Int): Int = {
      if (index >= count || index < 0 || head.isEmpty) {
        println("Out of bounds index " + index)
        -1
      }
      else {
        var current = head.get
        for (i <- 0 until index) {
          current = current.next.get
        }
        current.data
      }
    }

    def mkString(): String = {
      var str = "["

      if (head.isDefined) {
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

    def deleteFromEnd(n:Int): Node = {
      var current = head.get
      if(n == count){
       head = head.get.next
       head.get
      }
      for(i <- 0 until count - n - 1){
        current = current.next.get
      }
      current.next = current.next.get.next
      head.get
    }
  }
}
