package task3.MusicInstrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tube implements Instrument{
    private int diameter;

    public void play(){
        System.out.println("plays tube with diameter "+diameter);
    }
}
