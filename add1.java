class p{
    void msg(){
        System.out.println("welcome");
    }
}

class c extends p{
  void msg() {
    System.out.println("Java");
  }
}

class add1{
    public static void main(String args[]){
        c obj = new c();
        obj.msg();
        
    }
}
