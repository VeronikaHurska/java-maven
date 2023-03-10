package task3.MusicInstrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument{
    private int numStrings;
    public void play(){
        System.out.println("plays guitar with amount of strings "+numStrings);
    }
}
