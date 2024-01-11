package oop.exam.factory;

import java.util.Scanner;
import oop.exam.trees.DecorativeTree;
import oop.exam.trees.FruitTree;
import oop.exam.trees.Tree;

/**
 *
 * @author gabriela.balabanska
 */
public class TreeFactory
{
  public static Tree createTree()
  {
    Scanner scanner = new Scanner(System.in);

    String treeType;
    do
    {
      System.out.print("Enter tree type: ");
      treeType = scanner.nextLine().toUpperCase();

      if (!treeType.equals("F") && !treeType.equals("D"))
      {
        System.out.println("Invalid input. Please enter F or D.");
      }

    }
    while (!treeType.equals("F") && !treeType.equals("D"));

    // Now, treeType contains either "F" or "D"
    if (treeType.equals("F"))
    {
      // User selected FruitTree
      System.out.print("Enter fruit tree name: ");
      String name = scanner.nextLine();
      System.out.print("Enter fruit tree price: ");
      double price = scanner.nextDouble();
      System.out.print("Enter average fruit amount: ");
      double avgFruitAmount = scanner.nextDouble();

      return new FruitTree(name, price, avgFruitAmount);
    }
    else
    {
      // User selected DecorativeTree
      System.out.print("Enter decorative tree name: ");
      String name = scanner.nextLine();
      System.out.print("Enter decorative tree price: ");
      double price = scanner.nextDouble();
      System.out.print("Enter max height: ");
      double maxHeight = scanner.nextDouble();
      System.out.print("Enter min distance between trees: ");
      double minDistanceBetweenTrees = scanner.nextDouble();

      return new DecorativeTree(name, price, maxHeight, minDistanceBetweenTrees);
    }
  }
}
