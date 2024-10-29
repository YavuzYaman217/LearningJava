public class FriendS {
    String Name;
    static int a;
    void Friend(String name){
            this.Name = name;
            a++;
        }
    static void Display(){
        System.out.println("Number of friend " + a);
    }

}
