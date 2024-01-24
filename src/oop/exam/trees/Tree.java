package oop.exam.trees;

/**
 *
 * @author gabriela.balabanska
 */
public class Tree
{
  private String name;
  private double price;

  public Tree()
  {
  }

  public Tree(String name, double price)
  {
    this.name = name;
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    if (price > 0)
    {
      this.price = price;
    }
  }
}
