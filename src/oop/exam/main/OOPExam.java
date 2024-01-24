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

    Arrays.sort(treeArray, (t1, t2) -> t2.getName().compareTo(t1.getName()));

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

    System.out.println("F - Fruit tree, D - Decorative tree");
    Tree[] treeArray = new Tree[arraySize];

    for (int i = 0; i < arraySize; i++)
    {
      System.out.println("--- Creating tree no: " + (i + 1));
      treeArray[i] = TreeFactory.createTree();
    }

    scanner.close();
    return treeArray;
  }

}
