package Library;

public class Book {
    private String name;
    private String data;

    public Book(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
}
