package task3.Shelf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Printable {
    private String title;
    private int numPages;

    public void print(){
        System.out.println("Title:"+title);
        System.out.println("Pages:"+numPages);
    }
}
