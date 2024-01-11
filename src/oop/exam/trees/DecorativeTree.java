package oop.exam.trees;

/**
 *
 * @author gabriela.balabanska
 */
public class DecorativeTree extends Tree
{
  private double maxHeight;
  private double minDistanceBetweenTrees;

   public DecorativeTree(String name, double price, double maxHeight, double minDistanceBetweenTrees)
  {
    super(name, price);
    this.maxHeight = maxHeight;
    this.minDistanceBetweenTrees = minDistanceBetweenTrees;
  }

  public double getMaxHeight()
  {
    return maxHeight;
  }

  public void setMaxHeight(double maxHeight)
  {
    this.maxHeight = maxHeight;
  }

  public double getMinDistanceBetweenTrees()
  {
    return minDistanceBetweenTrees;
  }

  public void setMinDistanceBetweenTrees(double minDistanceBetweenTrees)
  {
    this.minDistanceBetweenTrees = minDistanceBetweenTrees;
  }
  
      @Override
    public String toString() {
        return "DecorativeTree{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", maxHeight=" + maxHeight +
                ", minDistanceBetweenTrees=" + minDistanceBetweenTrees +
                '}';
    }
}
