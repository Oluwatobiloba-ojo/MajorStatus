package Chapter3Test;

import chapterthree.PetrolPurchase;

import java.util.Scanner;

public class PetrolPurchaseTest {
    public static void main(String[] args) {


        PetrolPurchase myPetrol = new PetrolPurchase("Egebu-Ode", "Coal", 700, 5.45, 7);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of your petrol Station: ");
        String namePetrol = input.nextLine();
        myPetrol.setLocation(namePetrol);

        System.out.print("Enter the type of petrol: ");
        String typePetrol = input.nextLine();
        myPetrol.setType(typePetrol);

        System.out.print("Enter the quality of your quantity Purchase Litre: ");
        int purchaseLitre = input.nextInt();
        myPetrol.setQuantityPurchaseLitre(purchaseLitre);

        System.out.print("Enter the Price of one litre: ");
        double priceLitre = input.nextDouble();
        myPetrol.setPricePerLitre(priceLitre);

        System.out.print("Enter the discount you give you customer: ");
        double discount = input.nextDouble();
        myPetrol.setPercentageDiscount(discount);

        System.out.printf("The name of the station is %s ",myPetrol.getLocation());
        System.out.printf("\nThe type of petrol sold here is %s ",myPetrol.getType());
        System.out.printf("\nThe quantity of quality purchase litre is %d ",myPetrol.getQualityPurchaseLitre());
        System.out.printf("\nThe price of one litre is %.2f",myPetrol.getPricePerLitre());
        System.out.printf("\nThe discount we give to customer is %.2f",myPetrol.getPercentageDiscount());
        System.out.printf("\nThe net amount of the petrol is %.2f",myPetrol.getPurchaseAmount());


    }

}

