public class Main{
 
  public static void main(String[] args){
    Tree tree = new Tree();
    
    tree.addNode("Brandon");
    tree.addNode("Brandon");
    tree.addNode("Irene");
    tree.addNode("Emily");
    tree.addNode("Alec");
    tree.addNode("Martin");
   tree.inOrderTraverseTree(); 
   System.out.println(tree.search("Bob"));
    System.out.println("Buffer");
    //tree.delete("Irene");
    //tree.delete("Martin");
    //tree.delete("Alec");
    //tree.delete("Emily");
    tree.delete("Brandon");
    tree.inOrderTraverseTree();
  }
  
}

