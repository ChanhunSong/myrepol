package com.j2.w3;

public class SorterMain2{
  public static void main(String[] args){
    String B = {"John", "Adam", "Skrien", "Smith", "Jones"};
    comparator stringComparator = new StringComparator();
    Sorter.sort(b,stringComp);
    
    Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    comparator integerComparator = new integerComparator();
    Sorter.sort(b,stringComp);
    for(int i=0; i<B.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+B[i].getWeight());
       for(int i=0; i<C.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+C[i].getWeight());
  }



class Sorter{
  public Sorter(){};
  public void sort(Object[] data, Comparator comp) {
    for(int i=data.length-1;i>=1;i--){
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(comp.compare(data[j], data[indexOfMax]) > 0)
                    indexOfMax=j;
                }
                Object temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
  }; 
  
  
}


interface comparator{
  public in compare(Object o1,Object o2);
  public boolean equals(Objext o);
}

class integer Compacator implements  comparator{
  public in compare(Object o1,Object o2){
   return (integer)o1- (integer)o2;
    
  };
  public boolean equals(Objext o){};
}

class StringComparator implements comparator{
  public in compare(Object o1,Object o2){
   return ((String)o1).compareTo((String)o2) 
  };
  public boolean equals(Objext o){};
}