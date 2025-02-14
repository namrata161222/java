public class Item{
public static void main (String anything[]){
String ItemNumber[]={"Pen","Bottle","Book","Fan"};
System.out.println("list of Item 1 :"+ItemNumber);
for (int index=0;index<ItemNumber.length;index++){
	System.out.println(ItemNumber[index]);
}
//reverse array element
System.out.println("reverse array element");
for (int index=ItemNumber.length;index>0;index--){
	System.out.println("element is:"+ItemNumber[index]);
}
}
}