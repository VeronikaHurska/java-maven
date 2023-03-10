package task3.Shelf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable {
    private String title;
    private int seriesNumber;
    public void print(){
        System.out.println("Title:"+title);
        System.out.println("Number series:"+seriesNumber);
    }
}
