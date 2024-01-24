package oop.exam.trees;

/**
 *
 * @author gabriela.balabanska
 */
public abstract class Tree
{
  protected String name;
  protected double price;

  protected Tree()
  {
  }

  protected Tree(String name, double price)
  {
    this.name = name;
    this.price = price;
  }

  public Tree(Tree t)
  {
    if (t != null)
    {
      setName(t.getName());
      setPrice(t.getPrice());
    }
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
