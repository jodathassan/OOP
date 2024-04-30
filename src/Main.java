import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Pc> pcList= new ArrayList<>();
            pcList.add(new Pc(1,"Core i7","16GB","32GB","Lg",false));
            Pc pc=new Pc(2,"Core i5","16GB","32GB","Hp",false);
            pcList.add(1,pc);
            pcList.add(new Pc(3,"Core i13","16GB","32GB","Samsung",false));
            pcList.add(new Pc(4,"Core i9","16GB","32GB","Apple",false));
            pcList.add(new Pc(5,"Core i11","16GB","32GB","Lenovo",false));
            List<Pc> anotherList=new ArrayList<>();
            anotherList.addAll(pcList);
            //anotherList.addAll(5,pcList);
            System.out.println("after adding\n");
            for(Pc pc1: anotherList)
                System.out.println(pc1);
            anotherList.remove(2);
            anotherList.remove(new Pc(1,"Core i7","16GB","32GB","LG",false));
            System.out.println("after removing\n");
            for(Pc pc1: anotherList)
                System.out.println(pc1);
            System.out.println("Size of list after removing "+anotherList.size());
            anotherList.set(0,new Pc(1,"Core i7","16GB","32GB","Lg",false));
            System.out.printf("0th index after setting\n"+anotherList.get(0));
            for(Pc pc1: anotherList) {
                System.out.println("ID before updation\n"+pc1.getId());
                pc1.setId(pc1.getId()+2);
                System.out.println("ID after updation \n"+pc1.getId());
            }
            Collections.sort(anotherList);
            System.out.println("After sorting");
            for(Pc pc1: anotherList)
                System.out.println(pc1);

            Collections.reverse(anotherList);
            System.out.println("After reversing");
            for(Pc pc1: anotherList)
                System.out.println(pc1);
        }
}
