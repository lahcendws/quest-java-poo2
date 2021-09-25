
public class Hangar {

    public static void main(String args[]) {
        Car obj1 = new Car("clio", 45000);
        Car obj2 = new Car("audi", 33000);
        Boat bateau1 = new Boat("charle de gaulle", 692000);
        Boat bateau2= new Boat("fleur australe", 699000);
        Vehicle[] table ={obj1,obj2,bateau1,bateau2};
        for(int i=0;i<table.length;i++){
           if(table[i] instanceof Car){
            System.out.println(table[i].doStuff());
        } else {
               System.out.println(table[i].doStuff());
           }
        }
        

    }

}
