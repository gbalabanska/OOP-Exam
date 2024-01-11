package oop.exam.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import oop.exam.factory.TreeFactory;
import oop.exam.trees.Tree;

/**
 *
 * @author gabriela.balabanska
 */
public class OOPExam
{

  public static void main(String[] args)
  {
    Tree[] treeArray = createTreeArray();

    sortReversedTreeArray(treeArray);

    for (Tree tree : treeArray)
    {
      System.out.println(tree);
    }
  }

  public static Tree[] createTreeArray()
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the tree array: ");
    int arraySize = scanner.nextInt();

    System.out.println("Possible types of trees are: F - Fruit, D - Decorative");
    Tree[] treeArray = new Tree[arraySize];

    for (int i = 0; i < arraySize; i++)
    {
      System.out.println("Creating tree #" + (i + 1));
      treeArray[i] = TreeFactory.createTree();
    }

    scanner.close();
    return treeArray;
  }

  public static void sortReversedTreeArray(Tree[] treeArray)
  {
    Comparator<Tree> nameComparator = Comparator.comparing(Tree::getName);
    Arrays.sort(treeArray, nameComparator.reversed());
  }

}
