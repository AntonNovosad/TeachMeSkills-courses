/*
У первокласника пети m рублей. Мороженое стоит k рублей.
Петя решил наесться досыта мороженого, для этого он покупал по одному мороженому и
съедал его до тех пор, пока ему хватало денег.
Как пете узнать, сколько денег останется у него в конце концов?
Учтите, что петя делить еще не умеет, а умеет только вычитать и складывать.
Сколько мороженых он может съесть?
 */

package homeworks.Lesson3;

public class TaskAdditional6 {
    public static void main(String[] args) {
        int money = 26;
        int priceIceCream = 4;
        int iceCreamCounter = 0;
        while (money > priceIceCream) {
            money -= priceIceCream;
            iceCreamCounter++;
        }
        System.out.println("Денег останется: " + money);
        System.out.println("Мороженых съест: " + iceCreamCounter);
    }
}
