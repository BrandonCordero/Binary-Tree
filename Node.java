/* 
 * Node.java
 * written by csi/cen 213 Brandon fall 2016
 * 
 * Implements node to be used in Tree class
 */
public class Node {
  //properties
  private int count;
  private String name;
  
  private Node left;
  private Node right;
  
  // getters and setters
  public Node(int count, String name)
  {
    this.count = count;
    this.name = name; 
  }
   public int getCount(){
    return this.count;
  }
  
  public String getName(){
    return this.name;
  }

  public Node getLeft(){
    return this.left;
  }
  public Node getRight(){
    return this.right;
  }
  
  public void setCount(int newCount) {
    this.count = newCount;
  }
  
  public void setName(String newName) {
    this.name = newName;
  }
  public void setLeft(Node newLeft) {
    this.left = newLeft;
  }
  public void setRight(Node newRight) {
    this.right = newRight;
  }
  public String toString()
  {
        return name + " has the count " + count;
  }
}