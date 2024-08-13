class student{
    void learning(){
        System.out.println("learning in java");

    }
}


class cse extends student{
    void learning(){
        System.out.println("learning in python");
    }
        void skills(){
            System.out.println("Learning in c and c++");
        }
        void work(){
            super.learning();
            skills();
        }
    }
    class Super{
        public static void main(String[] args){
            cse obj= new cse();
            obj.work();
        }
    }
