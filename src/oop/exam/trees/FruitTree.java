package oop.exam.trees;

/**
 *
 * @author gabriela.balabanska
 */
public class FruitTree extends Tree
{
  private double avgFruitAmount;

  public FruitTree(String name, double price, double avgFruitAmount)
  {
    super(name, price);
    this.avgFruitAmount = avgFruitAmount;
  }

  public double getAvgFruitAmount()
  {
    return avgFruitAmount;
  }

  public void setAvgFruitAmount(double avgFruitAmount)
  {
    this.avgFruitAmount = avgFruitAmount;
  }

    @Override
    public String toString() {
        return "FruitTree{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", avgFruitAmount=" + avgFruitAmount +
                '}';
    }
  
  
}
