package oop.exam.trees;

/**
 *
 * @author gabriela.balabanska
 */
public class FruitTree extends Tree
{
  private double avgFruitAmount;

  public FruitTree()
  {
    super();
  }

  public FruitTree(String name, double price, double avgFruitAmount)
  {
    super(name, price);
    this.avgFruitAmount = avgFruitAmount;
  }

  public FruitTree(FruitTree ft)
  {
    if (ft != null)
    {
      setName(ft.getName());
      setPrice(ft.getPrice());
      setAvgFruitAmount(ft.getAvgFruitAmount());
    }
  }

  public double getAvgFruitAmount()
  {
    return avgFruitAmount;
  }

  public void setAvgFruitAmount(double avgFruitAmount)
  {
    if (avgFruitAmount > 0)
    {
      this.avgFruitAmount = avgFruitAmount;
    }
  }

  @Override
  public String toString()
  {
    return String.format(
        "Fruit tree with name: %s, price: %.2f, average fruit amount: %.2f",
        getName(), getPrice(), avgFruitAmount);
  }

}
