public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueChocolateBoiler;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueChocolateBoiler ==null){
            uniqueChocolateBoiler =  new ChocolateBoiler();
        }
        return uniqueChocolateBoiler;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
