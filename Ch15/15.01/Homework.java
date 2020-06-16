public abstract class Homework {
    public int number;
    public String type;

    public Homework(){
        number = 0;
        type = "none";
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int num){
        number = num;
    }

    public String getType(){
        return type;
    }

    public void setType(String t){
        type = t;
    }

    public abstract void abs(int number);

    public String toString(){
        return getNumber() +" hours " + getType();
    }


}
