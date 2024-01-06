class rectangle{
    int length=13;
    int breath=29;
    void display(){
        System.out.println("Area of Rectangle:"+length*breath);
        
    }
    public static void main(String[]args){
        rectangle r=new rectangle();
        r.display();
    }
}