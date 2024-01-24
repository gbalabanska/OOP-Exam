package oop.exam.trees;

/**
 *
 * @author gabriela.balabanska
 */
public class DecorativeTree extends Tree
{
  private double maxHeight;
  private double minDistanceBetweenTrees;

  public DecorativeTree()
  {
    super();
  }

  public DecorativeTree(String name, double price, double maxHeight, double minDistanceBetweenTrees)
  {
    super(name, price);
    this.maxHeight = maxHeight;
    this.minDistanceBetweenTrees = minDistanceBetweenTrees;
  }

  public DecorativeTree(DecorativeTree dt)
  {
    if (dt != null)
    {
      setName(dt.getName());
      setPrice(dt.getPrice());
      setMaxHeight(dt.getMaxHeight());
      setMinDistanceBetweenTrees(dt.getMinDistanceBetweenTrees());
    }
  }

  public double getMaxHeight()
  {
    return maxHeight;
  }

  public void setMaxHeight(double maxHeight)
  {
    if (maxHeight > 0)
    {
      this.maxHeight = maxHeight;
    }
  }

  public double getMinDistanceBetweenTrees()
  {
    return minDistanceBetweenTrees;
  }

  public void setMinDistanceBetweenTrees(double minDistanceBetweenTrees)
  {
    if (minDistanceBetweenTrees > 0)
    {
      this.minDistanceBetweenTrees = minDistanceBetweenTrees;
    }
  }

  @Override
  public String toString()
  {
    return String.format(
        "Decorative tree with name: %s, price: %.2f, max height: %.2f, min distance between trees: %.2f",
        getName(), getPrice(), maxHeight, minDistanceBetweenTrees);
  }
}
