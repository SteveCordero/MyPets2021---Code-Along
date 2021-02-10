class Axolotl extends PetParent
{
  //instance variables
  private boolean hasRegenerated;

  //constructors
  public Axolotl(String name, boolean hasHair, String color, int cuteness, double friendliness, boolean hasRegenerated)
  {
    super(name, hasHair, color, cuteness, friendliness);
    this.hasRegenerated = hasRegenerated;
  }

  //Overridden Method
  public String dailyRoutine()
  {
    return super.getName() + " sleep whenever, eat whenever, then float.";
  }

  //toString
  public String toString()
  {
    String output = super.toString();
    output += "\nhas it regenerated = " + hasRegenerated;
    return output; 
  }//end toString

}//end class