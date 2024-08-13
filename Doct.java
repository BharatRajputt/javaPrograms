class Doctor{
    public void details(){
        System.out.println("Hello,I am Doctor");
    }
}

class Surgen extends Doctor{
    public void details1(){
        System.out.println("Hello, I am Surgen ");
    }
}

class Doct{
    public static void main(String args[]){
       Surgen obj = new Surgen();
        obj.details();
        obj.details1();
    }
}