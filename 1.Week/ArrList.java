import java.util.ArrayList;
public class ArrList {
    public  void Arrlst(){

        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza");
        food.add("Bread");
        food.add("Cake");
        food.add("Cheese");
        food.add("Fish");

        food.set(0,"sushi");
        food.remove(2);
        food.clear();

        for(int i = 0; i < food.size(); i++){
         System.out.println(food.get(i));
        }
    }

    public void Arrlst2(){
        ArrayList<ArrayList<String>> food = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("cheese");
        produceList.add("fish");
        produceList.add("sushi");

        food.add(bakeryList);
        food.add(produceList);

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        System.out.println(food.get(0).get(0));

    }

    public void Arrlst3(){
        //String [] animals = {"cat","dog","rat","bird"};
        ArrayList<String> Animals = new ArrayList<String>();
        Animals.add("cat");
        Animals.add("dog");
        Animals.add("rat");
        Animals.add("bird");

        for(String i : Animals){
            System.out.println(i);
        }

    }
}
