import java.time.Period;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {

        Task4();

    }
    public static  void Task4()
    {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Alex", "Abadi");
        personMap.put("Nicole", "Abbatiello");
        personMap.put("Elizabeth", "Abbott");
        personMap.put("Bryce", "Abbott");
        personMap.put("Daniela", "Abella");
        personMap.put("Jacob", "Abraham");
        personMap.put("Nicholas", "Acevedo");
        personMap.put("Zoe", "Acevedo");
        personMap.put("Adam", "Marie");
        personMap.put("Adams", "Simuell");
        personMap.entrySet().forEach(entry-> {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });
        personMap.remove("Adams");
        personMap.entrySet().forEach(entry-> {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });
        }

    public static  void Task3() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(1);
        set2.add(5);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union:"+union);
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println("Intersection:"+intersect);
    }
    public static  void Task2(){
        Map<Integer, String> employeeMap = new HashMap<>();


        employeeMap.put(1, "Bill");
        employeeMap.put(2, "Jim");
        employeeMap.put(3, "Klim");
        employeeMap.put(4, "Tim");
        employeeMap.put(5, "Tom");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter key");
        Integer key = myObj.nextInt();

        if(employeeMap.containsKey(key)) {
            System.out.println(employeeMap.get(key));
        }
        else{
            System.out.println("Cant find the key");
        }
        Scanner myObj1 = new Scanner(System.in);
        String name = myObj1.nextLine();


        for(Entry<Integer, String> entry: employeeMap.entrySet()) {


            if(Objects.equals(entry.getValue(), name)) {
                System.out.println("The key for value " + name + " is " + entry.getKey());
                break;}

                else{
                    System.out.println("No match");
                }
            }

    }


    public static void Task1(){
        Scanner input = new Scanner(System.in);
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        input.close();
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(numbers));
        List <Integer> newlst = new ArrayList<>();
        for(int i = 0; i<lst.size();i++)
        {
            if(lst.get(i)>5){
                newlst.add(lst.get(i));
            }
        }
        lst.removeIf(n -> (n>20));
        System.out.println(lst);
        lst.add(2,1);
        lst.add(8,-3);
        lst.add(5,-4);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("Index: "+ i +" Value: "+ lst.get(i));
        }
        Collections.sort(lst);
        System.out.println(lst);
        System.out.println(newlst);
    }
}