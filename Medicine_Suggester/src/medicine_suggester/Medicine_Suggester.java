/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medicine_suggester;

import java.util.Scanner;

public class Medicine_Suggester {


// dsisease and  medicines array
static String[] diseases ={"1 Headache","2 Fever","3 cough","4 cold","5 stomachache","6 sore Throat",
"7 Acne","8 Allergy","9 Back Pain","10 indigestion","11 Constipation","12 Diarrhea"};

static String[] medicines={" Panadol (Paracetamol), Ibuprofen" , " Paracetamol, Aspirin",
" Cough Syrup (Benylin), Honey"," Vitamin C, Steam inhalation, Herbal teas", " Buscopan, Peppermint Tea",
 " Salt Water Gargle, Throat Lozenges",
 " Benzoyl Peroxide Gel, Salicylic Acid Face Wash",
 " Cetirizine (Zyrtec), Loratadine (Claritin)",
 " Ibuprofen tablets, Voltaren Gel",
 " Antacids (Tums, Gaviscon), Ginger Tea",
 "Mild Laxatives (Lactulose), Fiber Supplements"," ORS (Oral Rehydration Salts), Loperamide (Imodium)"};


static void showdiseases(){
       System.out.println("select your disease ");
    
    for(int i=0;i<diseases.length;i++)
    
     System.out.println(diseases[i]);
    
}  

static void  showmedicines(int list){
    System.out.println("diseases : "  + diseases[list]);
    System.out.println("medicines " + medicines[list]);
}
    
    
    
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
          showdiseases();
          while (true){
        System.out.println("Enter number of diseases(1-12) or 0 to exit");
          int choice = input.nextInt();
            if (choice == 0){
                System.out.println("Thank you for using smartMed");
                break;
            } else if(choice>=1 && choice<=12)
                
            {   showmedicines(choice-1);
            
            } 
          else 
          {
              System.out.println("Try again");
          }
    }

        
    }
}

