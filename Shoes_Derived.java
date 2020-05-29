// main subclass of the Shoes 
import java.util.Scanner;
public class Shoes_Derived {
   public static void main(String[] arg){
       
   Scanner sc = new Scanner(System.in);
   
   // reference to the superclass Shoes.
   Shoes_Base ab = new Shoes_Base();
   
   // reference to the subclass of 1st shoe
   NikeFlexiSport k = new NikeFlexiSport("PVC", "red"); // override
   
   // reference to the subclass of 2nd shoe
   Mountain_Boots y = new Mountain_Boots("crocodile leather", "black"); // override
   
   // reference to the subclass of 3rd shoe
   ConverseShoes c = new ConverseShoes("canvas", "yellow"); // override
   
   System.out.print("Enter one number, then I'll tell you about shoes: ");
      int num = sc.nextInt();  
      
   // NIKE FLEXISPORT
   if (num == 1) {
      System.out.println("-----------------------------------------------------------------");
      System.out.println("SHOE 1: " + k.name.toUpperCase());
      System.out.println(" ");   
         ab.hasLaces(2); ab.isitDurable(); ab.isUnisex();
         k.whatMaterial(); k.isLight(); k.hasSpikes();
         k.specialUse(); k.hasLED(); k.freeSize();
         k.colour();
      System.out.println("-----------------------------------------------------------------"); }
   
   // MOUNTAIN BOOTS
   if (num == 2) {
      System.out.println("-----------------------------------------------------------------");
      System.out.println("SHOE 2: " + y.name.toUpperCase());
      System.out.println(" ");
         ab.hasLaces(); ab.isitDurable(); ab.isUnisex();
         y.whatMaterial(); y.specialUse(); y.hasStiffSoles();
         y.securityFeature(); y.colour();
      System.out.println("------------------------------------------------------------------"); }
   
   // CONVERSE SHOES
   if (num == 3) {
      System.out.println("-----------------------------------------------------------------");
      System.out.println("SHOE 3: " + c.name.toUpperCase());
      System.out.println(" ");
         ab.isitDurable(); ab.isUnisex(); 
         c.whatMaterials(); c.hasLaces(); c.specialUse();
         c.isLight(); c.reflexInsoles(); c.colour();
      System.out.println("-------------------------------------------------------------------"); }
   
   // if numbers other than 1, 2 and 3 are entered
   if (num!=1 && num!=2 && num!=3) {
       System.out.println("-----------------------------------------------------------------");
       System.out.println("Sorry, wrong input.");
       System.out.println("-----------------------------------------------------------------"); }
 
   }
} // the end 