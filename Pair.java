import java.util.*;
// create class WaterJugProblemExample1 to solve Water Jug problem
class Pair{
// main() method start
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

 // tank1 is the capacity of the small tank
 System.out.print("Enter value for Tank1, i.e., odd capacity of small tank: ");
 int tank1 = scan.nextInt();

 // tank2 is the capacity of the large tank
 System.out.print("\nEnter value for Tank2, i.e., odd capacity of large tank: ");
 int tank2 = scan.nextInt();
 scan.close();

 // initialize variable count that defines number of iterations
 int count = tank1 + tank2;

 /* jug1 and jug2 are the arrays that would hold the values for smaller larger tank */
 int jug1[] = new int[count];
 int jug2[] = new int[count];

 int j = 0;

 // initialize jug1[0] and jug2[0] with tank1 and 0 respectively
jug1[j] = tank1;
 jug2[j] = 0;
 j++;

 // initialize jug1[1] and jug2[1] with 0 and tank1
 jug1[j] = 0;
jug2[j] = tank1;
 j++;

 while(j < count){
 if(jug1[ j - 1 ] > 0){
 // jug1 is not empty when it has any amount of water
 jug1[j] = jug1[ j - 1 ];
 jug2[j] = 0;
 } else{
 // when jug1 is empty
jug1[j] = tank1;
 jug2[j] = jug2[ j - 1 ];
 }
 j++;

 if(jug2[ j - 1 ] > 0){

if(jug1[ j - 1 ] + jug2[ j - 1 ] < tank2){

 jug2[j] = jug1[ j - 1 ] + jug2[ j - 1 ];
 jug1[j] = 0;
 } else{
 int temp = jug2[ j - 1 ];
 temp = tank2 - temp;
 jug2[j] = temp + jug2[ j - 1 ];

 jug1[j] = jug1[ j - 1 ] - temp;
 }
}
 else{

 jug2[j] = jug1[ j - 1 ];
 jug1[j] = 0;
}
 j++;
 }

 for(j = 0; j<count; j++){
 System.out.print("\nJug1: " + jug1[j] + "\tJug2: " + jug2[j]);
 }
 System.out.println();
 }
 }
